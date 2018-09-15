package com.experts.core.biller.statemachine.api.vertxloader.processtate;


import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;

@ProxyGen
@VertxGen
public interface ProcessStateRepository {

    @Fluent
    ProcessStateRepository save(ProcessState initialState, Handler<AsyncResult<ProcessState>> resultHandler);

    @Fluent
    ProcessStateRepository findAll(Handler<AsyncResult<List<ProcessState>>> resultHandler);

    @Fluent
    ProcessStateRepository findById(String id, Handler<AsyncResult<ProcessState>> resultHandler);

    @Fluent
    ProcessStateRepository findByName(String name, Handler<AsyncResult<List<ProcessState>>> resultHandler);

    @Fluent
    ProcessStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler);
}
