package com.experts.core.biller.statemachine.api.vertxloader.initstate;



import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;

@ProxyGen
@VertxGen
public interface InitialStateRepository {

    @Fluent
    InitialStateRepository save(InitialState initialState, Handler<AsyncResult<InitialState>> resultHandler);

    @Fluent
    InitialStateRepository findAll(Handler<AsyncResult<List<InitialState>>> resultHandler);

    @Fluent
    InitialStateRepository findById(String id, Handler<AsyncResult<InitialState>> resultHandler);

    /*@Fluent
    InitialStateRepository findByName(String name, Handler<AsyncResult<List<InitialState>>> resultHandler);*/

    @Fluent
    InitialStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler);

}
