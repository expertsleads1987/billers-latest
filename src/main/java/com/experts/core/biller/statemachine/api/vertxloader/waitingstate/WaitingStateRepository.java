package com.experts.core.biller.statemachine.api.vertxloader.waitingstate;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;

@ProxyGen
@VertxGen
public interface WaitingStateRepository {

    @Fluent
    WaitingStateRepository save(WaitingState initialState, Handler<AsyncResult<WaitingState>> resultHandler);

    @Fluent
    WaitingStateRepository findAll(Handler<AsyncResult<List<WaitingState>>> resultHandler);

    @Fluent
    WaitingStateRepository findById(String id, Handler<AsyncResult<WaitingState>> resultHandler);

    @Fluent
    WaitingStateRepository findByName(String name, Handler<AsyncResult<List<WaitingState>>> resultHandler);

    @Fluent
    WaitingStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler);

}
