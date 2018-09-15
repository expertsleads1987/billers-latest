package com.experts.core.biller.statemachine.api.vertxloader.initstate;


import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.MongoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class InitialRepositoryImpl implements InitialStateRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitialRepositoryImpl.class);

    MongoClient client;

    public InitialRepositoryImpl(final MongoClient client) {
        this.client = client;
    }

    @Override
    public InitialStateRepository save(InitialState initialState, Handler<AsyncResult<InitialState>> resultHandler) {
        JsonObject json = JsonObject.mapFrom(initialState);
        client.save(InitialState.DB_TABLE, json, res -> {
            if (res.succeeded()) {
                LOGGER.info("Initail State created: {}", res.result());
                initialState.setId(Long.parseLong(res.result()));
                resultHandler.handle(Future.succeededFuture(initialState));
            } else {
                LOGGER.error("Customer not created", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public InitialStateRepository findAll(Handler<AsyncResult<List<InitialState>>> resultHandler) {
        client.find(InitialState.DB_TABLE, new JsonObject(), res -> {
            if (res.succeeded()) {
                List<InitialState> customers = res.result().stream().map(it -> new InitialState(it.getLong("id"),it.getString("billCode") , it.getString("billName") ,it.getString(" billerName") , it.getString("billerCode") , it.getString("billerAddress") , it.getString("clientId") , it.getString("onServiceBy") , it.getString("bankId") , it.getString("bankName") , it.getString("bankAddress") , it.getString("bankCode"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers));
            } else {
                LOGGER.error("Customer not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    @Override
    public InitialStateRepository findById(String id, Handler<AsyncResult<InitialState>> resultHandler) {
        client.find(InitialState.DB_TABLE, new JsonObject().put("_id", id), res -> {
            if (res.succeeded()) {
                List<InitialState> customers = res.result().stream().map(it -> new InitialState(it.getLong("id"),it.getString("billCode") , it.getString("billName") ,it.getString(" billerName") , it.getString("billerCode") , it.getString("billerAddress") , it.getString("clientId") , it.getString("onServiceBy") , it.getString("bankId") , it.getString("bankName") , it.getString("bankAddress") , it.getString("bankCode"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers.get(0)));
            } else {
                LOGGER.error("Account not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }

    /*@Override
    public InitialStateRepository findByName(String name, Handler<AsyncResult<List<InitialState>>> resultHandler) {
        client.find(InitialState.DB_TABLE, new JsonObject().put("name", name), res -> {
            if (res.succeeded()) {
                List<InitialState> customers = res.result().stream().map(it -> new InitialState(it.getLong("id") , it.getString("billCode") , it.getString("billName") ,it.getString(" billerName") , it.getString("billerCode") , it.getString("billerAddress") , it.getString("clientId") , it.getString("onServiceBy") , it.getString("bankId") , it.getString("bankName") , it.getString("bankAddress") , it.getString("bankCode"))).collect(Collectors.toList());
                resultHandler.handle(Future.succeededFuture(customers));
            } else {
                LOGGER.error("Account not found", res.cause());
                resultHandler.handle(Future.failedFuture(res.cause()));
            }
        });
        return this;
    }*/

    @Override
    public InitialStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler) {
        client.removeDocument(InitialState.DB_TABLE, new JsonObject().put("_id", id), res -> {
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
