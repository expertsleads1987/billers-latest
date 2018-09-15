package com.experts.core.biller.statemachine.api.vertxloader.states;


import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.MongoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class CompleteStateRepositoryImpl implements CompleteStateRepository {


    private static final Logger LOGGER = LoggerFactory.getLogger(CompleteStateRepositoryImpl.class);

    private MongoClient client;

    public CompleteStateRepositoryImpl(final MongoClient client) {
        this.client = client;
    }

    @Override
    public CompleteStateRepository save(CompletedState completedState, Handler<AsyncResult<CompletedState>> resultHandler) {
        JsonObject json = JsonObject.mapFrom(completedState);
        client.save(CompletedState.DB_TABLE, json, res -> {
            if (res.succeeded()) {
                LOGGER.info("CompleteState created: {}", res.result());
                completedState.setId( Long.parseLong(res.result()));
                resultHandler.handle(Future.succeededFuture(completedState));
            } else {
                LOGGER.error("CompleteState not created", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public CompleteStateRepository findAll(Handler<AsyncResult<List<CompletedState>>> resultHandler) {
        client.find(CompletedState.DB_TABLE, new JsonObject(), res -> {
            if (res.succeeded()) {
                List<CompletedState> customers = res.result().stream().map(it -> new CompletedState(it.getLong("id"), it.getString("name"), it.getString("code") , it.getString("message") , it.getString("execption") , it.getString("billNo") , it.getString("billCode") , it.getString("transactionId") , it.getString("billerName") , it.getString("billerCode"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers));
            } else {
                LOGGER.error("Customer not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public CompleteStateRepository findById(String id, Handler<AsyncResult<CompletedState>> resultHandler) {
        client.find(CompletedState.DB_TABLE, new JsonObject().put("_id", id), res -> {
            if (res.succeeded()) {
                List<CompletedState> customers = res.result().stream().map(it -> new CompletedState(it.getLong("id"), it.getString("name"), it.getString("code") , it.getString("message") , it.getString("execption") , it.getString("billNo") , it.getString("billCode") , it.getString("transactionId") , it.getString("billerName") , it.getString("billerCode"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers.get(0)));
            } else {
                LOGGER.error("Account not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public CompleteStateRepository findByName(String name, Handler<AsyncResult<List<CompletedState>>> resultHandler) {
        client.find(CompletedState.DB_TABLE, new JsonObject().put("name", name), res -> {
            if (res.succeeded()) {
                List<CompletedState> customers = res.result().stream().map(it -> new CompletedState(it.getLong("id"), it.getString("name"), it.getString("code") , it.getString("message") , it.getString("execption") , it.getString("billNo") , it.getString("billCode") , it.getString("transactionId") , it.getString("billerName") , it.getString("billerCode"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers));
            } else {
                LOGGER.error("Account not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public CompleteStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler) {
        client.removeDocument(CompletedState.DB_TABLE, new JsonObject().put("_id", id), res -> {
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
