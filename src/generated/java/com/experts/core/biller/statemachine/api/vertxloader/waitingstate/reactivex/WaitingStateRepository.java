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

package com.experts.core.biller.statemachine.api.vertxloader.waitingstate.reactivex;

import java.util.Map;
import io.reactivex.Observable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import java.util.List;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import com.experts.core.biller.statemachine.api.vertxloader.waitingstate.WaitingState;


@io.vertx.lang.reactivex.RxGen(com.experts.core.biller.statemachine.api.vertxloader.waitingstate.WaitingStateRepository.class)
public class WaitingStateRepository {

  @Override
  public String toString() {
    return delegate.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WaitingStateRepository that = (WaitingStateRepository) o;
    return delegate.equals(that.delegate);
  }
  
  @Override
  public int hashCode() {
    return delegate.hashCode();
  }

  public static final io.vertx.lang.reactivex.TypeArg<WaitingStateRepository> __TYPE_ARG = new io.vertx.lang.reactivex.TypeArg<>(
    obj -> new WaitingStateRepository((com.experts.core.biller.statemachine.api.vertxloader.waitingstate.WaitingStateRepository) obj),
    WaitingStateRepository::getDelegate
  );

  private final com.experts.core.biller.statemachine.api.vertxloader.waitingstate.WaitingStateRepository delegate;
  
  public WaitingStateRepository(com.experts.core.biller.statemachine.api.vertxloader.waitingstate.WaitingStateRepository delegate) {
    this.delegate = delegate;
  }

  public com.experts.core.biller.statemachine.api.vertxloader.waitingstate.WaitingStateRepository getDelegate() {
    return delegate;
  }

  public WaitingStateRepository save(WaitingState initialState, Handler<AsyncResult<WaitingState>> resultHandler) { 
    delegate.save(initialState, resultHandler);
    return this;
  }

  public Single<WaitingState> rxSave(WaitingState initialState) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<WaitingState>(handler -> {
      save(initialState, handler);
    });
  }

  public WaitingStateRepository findAll(Handler<AsyncResult<List<WaitingState>>> resultHandler) { 
    delegate.findAll(resultHandler);
    return this;
  }

  public Single<List<WaitingState>> rxFindAll() { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<List<WaitingState>>(handler -> {
      findAll(handler);
    });
  }

  public WaitingStateRepository findById(String id, Handler<AsyncResult<WaitingState>> resultHandler) { 
    delegate.findById(id, resultHandler);
    return this;
  }

  public Single<WaitingState> rxFindById(String id) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<WaitingState>(handler -> {
      findById(id, handler);
    });
  }

  public WaitingStateRepository findByName(String name, Handler<AsyncResult<List<WaitingState>>> resultHandler) { 
    delegate.findByName(name, resultHandler);
    return this;
  }

  public Single<List<WaitingState>> rxFindByName(String name) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<List<WaitingState>>(handler -> {
      findByName(name, handler);
    });
  }

  public WaitingStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler) { 
    delegate.remove(id, resultHandler);
    return this;
  }

  public Completable rxRemove(String id) { 
    return new io.vertx.reactivex.core.impl.AsyncResultCompletable(handler -> {
      remove(id, handler);
    });
  }


  public static  WaitingStateRepository newInstance(com.experts.core.biller.statemachine.api.vertxloader.waitingstate.WaitingStateRepository arg) {
    return arg != null ? new WaitingStateRepository(arg) : null;
  }
}
