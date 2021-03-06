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

package com.experts.core.biller.statemachine.api.vertxloader.states.reactivex;

import java.util.Map;
import io.reactivex.Observable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import java.util.List;
import com.experts.core.biller.statemachine.api.vertxloader.states.CompletedState;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


@io.vertx.lang.reactivex.RxGen(com.experts.core.biller.statemachine.api.vertxloader.states.CompleteStateRepository.class)
public class CompleteStateRepository {

  @Override
  public String toString() {
    return delegate.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompleteStateRepository that = (CompleteStateRepository) o;
    return delegate.equals(that.delegate);
  }
  
  @Override
  public int hashCode() {
    return delegate.hashCode();
  }

  public static final io.vertx.lang.reactivex.TypeArg<CompleteStateRepository> __TYPE_ARG = new io.vertx.lang.reactivex.TypeArg<>(
    obj -> new CompleteStateRepository((com.experts.core.biller.statemachine.api.vertxloader.states.CompleteStateRepository) obj),
    CompleteStateRepository::getDelegate
  );

  private final com.experts.core.biller.statemachine.api.vertxloader.states.CompleteStateRepository delegate;
  
  public CompleteStateRepository(com.experts.core.biller.statemachine.api.vertxloader.states.CompleteStateRepository delegate) {
    this.delegate = delegate;
  }

  public com.experts.core.biller.statemachine.api.vertxloader.states.CompleteStateRepository getDelegate() {
    return delegate;
  }

  public CompleteStateRepository save(CompletedState completedState, Handler<AsyncResult<CompletedState>> resultHandler) { 
    delegate.save(completedState, resultHandler);
    return this;
  }

  public Single<CompletedState> rxSave(CompletedState completedState) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<CompletedState>(handler -> {
      save(completedState, handler);
    });
  }

  public CompleteStateRepository findAll(Handler<AsyncResult<List<CompletedState>>> resultHandler) { 
    delegate.findAll(resultHandler);
    return this;
  }

  public Single<List<CompletedState>> rxFindAll() { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<List<CompletedState>>(handler -> {
      findAll(handler);
    });
  }

  public CompleteStateRepository findById(String id, Handler<AsyncResult<CompletedState>> resultHandler) { 
    delegate.findById(id, resultHandler);
    return this;
  }

  public Single<CompletedState> rxFindById(String id) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<CompletedState>(handler -> {
      findById(id, handler);
    });
  }

  public CompleteStateRepository findByName(String name, Handler<AsyncResult<List<CompletedState>>> resultHandler) { 
    delegate.findByName(name, resultHandler);
    return this;
  }

  public Single<List<CompletedState>> rxFindByName(String name) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<List<CompletedState>>(handler -> {
      findByName(name, handler);
    });
  }

  public CompleteStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler) { 
    delegate.remove(id, resultHandler);
    return this;
  }

  public Completable rxRemove(String id) { 
    return new io.vertx.reactivex.core.impl.AsyncResultCompletable(handler -> {
      remove(id, handler);
    });
  }


  public static  CompleteStateRepository newInstance(com.experts.core.biller.statemachine.api.vertxloader.states.CompleteStateRepository arg) {
    return arg != null ? new CompleteStateRepository(arg) : null;
  }
}
