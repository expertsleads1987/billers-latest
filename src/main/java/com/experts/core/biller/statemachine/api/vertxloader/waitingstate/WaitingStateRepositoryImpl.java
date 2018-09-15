package com.experts.core.biller.statemachine.api.vertxloader.waitingstate;


import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.MongoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class WaitingStateRepositoryImpl implements WaitingStateRepository{

    private static final Logger LOGGER = LoggerFactory.getLogger(WaitingStateRepositoryImpl.class);

    MongoClient client;

    public WaitingStateRepositoryImpl(final MongoClient client) {
        this.client = client;
    }

    @Override
    public WaitingStateRepository save(WaitingState processState, Handler<AsyncResult<WaitingState>> resultHandler) {
        JsonObject json = JsonObject.mapFrom(processState);
        client.save(WaitingState.DB_TABLE, json, res -> {
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
    public WaitingStateRepository findAll(Handler<AsyncResult<List<WaitingState>>> resultHandler) {
        client.find(WaitingState.DB_TABLE, new JsonObject(), res -> {
            if (res.succeeded()) {
                List<WaitingState> customers = res.result().stream().map(it -> new WaitingState(it.getLong("id"),it.getString("waitingOpsName") , it.getString("period") , it.getString(" billCode") , it.getString(" billName") , it.getString(" bankCode") , it.getString(" billerCode") , it.getString(" transactionId"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers));
            } else {
                LOGGER.error("Customer not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public WaitingStateRepository findById(String id, Handler<AsyncResult<WaitingState>> resultHandler) {
        client.find(WaitingState.DB_TABLE, new JsonObject().put("_id", id), res -> {
            if (res.succeeded()) {
                List<WaitingState> customers = res.result().stream().map(it ->  new WaitingState(it.getLong("id"),it.getString("waitingOpsName") , it.getString("period") , it.getString(" billCode") , it.getString(" billName") , it.getString(" bankCode") , it.getString(" billerCode") , it.getString(" transactionId"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers.get(0)));
            } else {
                LOGGER.error("Account not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public WaitingStateRepository findByName(String name, Handler<AsyncResult<List<WaitingState>>> resultHandler) {
        client.find(WaitingState.DB_TABLE, new JsonObject().put("name", name), res -> {
            if (res.succeeded()) {
                List<WaitingState> customers = res.result().stream().map(it -> new WaitingState(it.getLong("id") , it.getString("waitingOpsName") , it.getString("period") , it.getString(" billCode") , it.getString(" billName") , it.getString(" bankCode") , it.getString(" billerCode") , it.getString(" transactionId"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers));
            } else {
                LOGGER.error("Account not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public WaitingStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler) {
        client.removeDocument(WaitingState.DB_TABLE, new JsonObject().put("_id", id), res -> {
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
