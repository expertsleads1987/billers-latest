package com.experts.core.biller.statemachine.api.vertxloader.data;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;

import java.util.List;

@ProxyGen
@VertxGen
public interface CustomerRepository {

	@Fluent
	CustomerRepository save(Customer customer, Handler<AsyncResult<Customer>> resultHandler);

	@Fluent
	CustomerRepository findAll(Handler<AsyncResult<List<Customer>>> resultHandler);

	@Fluent
	CustomerRepository findById(String id, Handler<AsyncResult<Customer>> resultHandler);
	
	@Fluent
	CustomerRepository findByName(String name, Handler<AsyncResult<List<Customer>>> resultHandler);
	
	@Fluent
	CustomerRepository remove(String id, Handler<AsyncResult<Void>> resultHandler);

	static  CustomerRepository createProxy(Vertx vertx , String name){
		return new  CustomerRepositoryVertxEBProxy(vertx , name);
	}
}
