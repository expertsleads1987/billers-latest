package com.experts.core.biller.statemachine.api.vertxloader.processtate;


import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.MongoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessStateRepositoryImpl implements ProcessStateRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessStateRepositoryImpl.class);

    MongoClient client;

    public ProcessStateRepositoryImpl(final MongoClient client) {
        this.client = client;
    }

    @Override
    public ProcessStateRepository save(ProcessState processState, Handler<AsyncResult<ProcessState>> resultHandler) {
        JsonObject json = JsonObject.mapFrom(processState);
        client.save(ProcessState.DB_TABLE, json, res -> {
            if (res.succeeded()) {
                LOGGER.info("Initail State created: {}", res.result());
                processState.setId(Long.parseLong(res.result()));
                resultHandler.handle(Future.succeededFuture(processState));
            } else {
                LOGGER.error("Customer not created", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public ProcessStateRepository findAll(Handler<AsyncResult<List<ProcessState>>> resultHandler) {
        client.find(ProcessState.DB_TABLE, new JsonObject(), res -> {
            if (res.succeeded()) {
                List<ProcessState> customers = res.result().stream().map(it -> new ProcessState(it.getLong("id") , it.getString("processName") , it.getString("processDefinition") , it.getString("processFlowId") , it.getString("processFlowexecutionId"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers));
            } else {
                LOGGER.error("Customer not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public ProcessStateRepository findById(String id, Handler<AsyncResult<ProcessState>> resultHandler) {
        client.find(ProcessState.DB_TABLE, new JsonObject().put("_id", id), res -> {
            if (res.succeeded()) {
                List<ProcessState> customers = res.result().stream().map(it ->  new ProcessState(it.getLong("id") , it.getString("processName") , it.getString("processDefinition") , it.getString("processFlowId") , it.getString("processFlowexecutionId"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers.get(0)));
            } else {
                LOGGER.error("Account not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public ProcessStateRepository findByName(String name, Handler<AsyncResult<List<ProcessState>>> resultHandler) {
        client.find(ProcessState.DB_TABLE, new JsonObject().put("name", name), res -> {
            if (res.succeeded()) {
                List<ProcessState> customers = res.result().stream().map(it -> new ProcessState(it.getLong("id") , it.getString("processName") , it.getString("processDefinition") , it.getString("processFlowId") , it.getString("processFlowexecutionId"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers));
            } else {
                LOGGER.error("Account not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public ProcessStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler) {
        client.removeDocument(ProcessState.DB_TABLE, new JsonObject().put("_id", id), res -> {
            if (res.succeeded()) {
                resultHandler.handle(Future.future());
            } else {
                LOGGER.error("Customer not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

}
