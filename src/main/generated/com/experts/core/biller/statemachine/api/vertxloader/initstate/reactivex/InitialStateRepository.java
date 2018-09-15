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

package com.experts.core.biller.statemachine.api.vertxloader.initstate.reactivex;

import java.util.Map;
import io.reactivex.Observable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import java.util.List;
import com.experts.core.biller.statemachine.api.vertxloader.initstate.InitialState;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


@io.vertx.lang.reactivex.RxGen(com.experts.core.biller.statemachine.api.vertxloader.initstate.InitialStateRepository.class)
public class InitialStateRepository {

  @Override
  public String toString() {
    return delegate.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InitialStateRepository that = (InitialStateRepository) o;
    return delegate.equals(that.delegate);
  }
  
  @Override
  public int hashCode() {
    return delegate.hashCode();
  }

  public static final io.vertx.lang.reactivex.TypeArg<InitialStateRepository> __TYPE_ARG = new io.vertx.lang.reactivex.TypeArg<>(
    obj -> new InitialStateRepository((com.experts.core.biller.statemachine.api.vertxloader.initstate.InitialStateRepository) obj),
    InitialStateRepository::getDelegate
  );

  private final com.experts.core.biller.statemachine.api.vertxloader.initstate.InitialStateRepository delegate;
  
  public InitialStateRepository(com.experts.core.biller.statemachine.api.vertxloader.initstate.InitialStateRepository delegate) {
    this.delegate = delegate;
  }

  public com.experts.core.biller.statemachine.api.vertxloader.initstate.InitialStateRepository getDelegate() {
    return delegate;
  }

  public InitialStateRepository save(InitialState initialState, Handler<AsyncResult<InitialState>> resultHandler) { 
    delegate.save(initialState, resultHandler);
    return this;
  }

  public Single<InitialState> rxSave(InitialState initialState) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<InitialState>(handler -> {
      save(initialState, handler);
    });
  }

  public InitialStateRepository findAll(Handler<AsyncResult<List<InitialState>>> resultHandler) { 
    delegate.findAll(resultHandler);
    return this;
  }

  public Single<List<InitialState>> rxFindAll() { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<List<InitialState>>(handler -> {
      findAll(handler);
    });
  }

  public InitialStateRepository findById(String id, Handler<AsyncResult<InitialState>> resultHandler) { 
    delegate.findById(id, resultHandler);
    return this;
  }

  public Single<InitialState> rxFindById(String id) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<InitialState>(handler -> {
      findById(id, handler);
    });
  }

  public InitialStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler) { 
    delegate.remove(id, resultHandler);
    return this;
  }

  public Completable rxRemove(String id) { 
    return new io.vertx.reactivex.core.impl.AsyncResultCompletable(handler -> {
      remove(id, handler);
    });
  }


  public static  InitialStateRepository newInstance(com.experts.core.biller.statemachine.api.vertxloader.initstate.InitialStateRepository arg) {
    return arg != null ? new InitialStateRepository(arg) : null;
  }
}
