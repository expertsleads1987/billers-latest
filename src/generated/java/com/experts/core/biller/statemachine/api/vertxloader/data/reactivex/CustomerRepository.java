/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.experts.core.biller.statemachine.api.vertxloader.data.reactivex;

import java.util.Map;
import io.reactivex.Observable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import java.util.List;
import com.experts.core.biller.statemachine.api.vertxloader.data.Customer;
import io.vertx.reactivex.core.Vertx;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


@io.vertx.lang.reactivex.RxGen(com.experts.core.biller.statemachine.api.vertxloader.data.CustomerRepository.class)
public class CustomerRepository {

  @Override
  public String toString() {
    return delegate.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerRepository that = (CustomerRepository) o;
    return delegate.equals(that.delegate);
  }
  
  @Override
  public int hashCode() {
    return delegate.hashCode();
  }

  public static final io.vertx.lang.reactivex.TypeArg<CustomerRepository> __TYPE_ARG = new io.vertx.lang.reactivex.TypeArg<>(
    obj -> new CustomerRepository((com.experts.core.biller.statemachine.api.vertxloader.data.CustomerRepository) obj),
    CustomerRepository::getDelegate
  );

  private final com.experts.core.biller.statemachine.api.vertxloader.data.CustomerRepository delegate;
  
  public CustomerRepository(com.experts.core.biller.statemachine.api.vertxloader.data.CustomerRepository delegate) {
    this.delegate = delegate;
  }

  public com.experts.core.biller.statemachine.api.vertxloader.data.CustomerRepository getDelegate() {
    return delegate;
  }

  public CustomerRepository save(Customer customer, Handler<AsyncResult<Customer>> resultHandler) { 
    delegate.save(customer, resultHandler);
    return this;
  }

  public Single<Customer> rxSave(Customer customer) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<Customer>(handler -> {
      save(customer, handler);
    });
  }

  public CustomerRepository findAll(Handler<AsyncResult<List<Customer>>> resultHandler) { 
    delegate.findAll(resultHandler);
    return this;
  }

  public Single<List<Customer>> rxFindAll() { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<List<Customer>>(handler -> {
      findAll(handler);
    });
  }

  public CustomerRepository findById(String id, Handler<AsyncResult<Customer>> resultHandler) { 
    delegate.findById(id, resultHandler);
    return this;
  }

  public Single<Customer> rxFindById(String id) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<Customer>(handler -> {
      findById(id, handler);
    });
  }

  public CustomerRepository findByName(String name, Handler<AsyncResult<List<Customer>>> resultHandler) { 
    delegate.findByName(name, resultHandler);
    return this;
  }

  public Single<List<Customer>> rxFindByName(String name) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<List<Customer>>(handler -> {
      findByName(name, handler);
    });
  }

  public CustomerRepository remove(String id, Handler<AsyncResult<Void>> resultHandler) { 
    delegate.remove(id, resultHandler);
    return this;
  }

  public Completable rxRemove(String id) { 
    return new io.vertx.reactivex.core.impl.AsyncResultCompletable(handler -> {
      remove(id, handler);
    });
  }

  public static CustomerRepository createProxy(Vertx vertx, String name) { 
    CustomerRepository ret = CustomerRepository.newInstance(com.experts.core.biller.statemachine.api.vertxloader.data.CustomerRepository.createProxy(vertx.getDelegate(), name));
    return ret;
  }


  public static  CustomerRepository newInstance(com.experts.core.biller.statemachine.api.vertxloader.data.CustomerRepository arg) {
    return arg != null ? new CustomerRepository(arg) : null;
  }
}
