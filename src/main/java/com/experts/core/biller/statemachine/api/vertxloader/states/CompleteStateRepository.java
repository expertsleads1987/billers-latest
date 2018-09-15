package com.experts.core.biller.statemachine.api.vertxloader.states;




import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;

import java.util.List;

@ProxyGen
@VertxGen
public interface CompleteStateRepository {

    @Fluent
    CompleteStateRepository save(CompletedState completedState, Handler<AsyncResult<CompletedState>> resultHandler);

    @Fluent
    CompleteStateRepository findAll(Handler<AsyncResult<List<CompletedState>>> resultHandler);

    @Fluent
    CompleteStateRepository findById(String id, Handler<AsyncResult<CompletedState>> resultHandler);

    @Fluent
    CompleteStateRepository findByName(String name, Handler<AsyncResult<List<CompletedState>>> resultHandler);

    @Fluent
    CompleteStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler);

    /*static  CompleteStateRepo createProxy(Vertx vertx , String name){
        return new  CustomerRepositoryVertxEBProxy(vertx , name);
    }*/
}
