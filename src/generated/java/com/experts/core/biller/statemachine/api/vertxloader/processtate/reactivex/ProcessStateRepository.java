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

package com.experts.core.biller.statemachine.api.vertxloader.processtate.reactivex;

import java.util.Map;
import io.reactivex.Observable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import java.util.List;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import com.experts.core.biller.statemachine.api.vertxloader.processtate.ProcessState;


@io.vertx.lang.reactivex.RxGen(com.experts.core.biller.statemachine.api.vertxloader.processtate.ProcessStateRepository.class)
public class ProcessStateRepository {

  @Override
  public String toString() {
    return delegate.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProcessStateRepository that = (ProcessStateRepository) o;
    return delegate.equals(that.delegate);
  }
  
  @Override
  public int hashCode() {
    return delegate.hashCode();
  }

  public static final io.vertx.lang.reactivex.TypeArg<ProcessStateRepository> __TYPE_ARG = new io.vertx.lang.reactivex.TypeArg<>(
    obj -> new ProcessStateRepository((com.experts.core.biller.statemachine.api.vertxloader.processtate.ProcessStateRepository) obj),
    ProcessStateRepository::getDelegate
  );

  private final com.experts.core.biller.statemachine.api.vertxloader.processtate.ProcessStateRepository delegate;
  
  public ProcessStateRepository(com.experts.core.biller.statemachine.api.vertxloader.processtate.ProcessStateRepository delegate) {
    this.delegate = delegate;
  }

  public com.experts.core.biller.statemachine.api.vertxloader.processtate.ProcessStateRepository getDelegate() {
    return delegate;
  }

  public ProcessStateRepository save(ProcessState initialState, Handler<AsyncResult<ProcessState>> resultHandler) { 
    delegate.save(initialState, resultHandler);
    return this;
  }

  public Single<ProcessState> rxSave(ProcessState initialState) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<ProcessState>(handler -> {
      save(initialState, handler);
    });
  }

  public ProcessStateRepository findAll(Handler<AsyncResult<List<ProcessState>>> resultHandler) { 
    delegate.findAll(resultHandler);
    return this;
  }

  public Single<List<ProcessState>> rxFindAll() { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<List<ProcessState>>(handler -> {
      findAll(handler);
    });
  }

  public ProcessStateRepository findById(String id, Handler<AsyncResult<ProcessState>> resultHandler) { 
    delegate.findById(id, resultHandler);
    return this;
  }

  public Single<ProcessState> rxFindById(String id) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<ProcessState>(handler -> {
      findById(id, handler);
    });
  }

  public ProcessStateRepository findByName(String name, Handler<AsyncResult<List<ProcessState>>> resultHandler) { 
    delegate.findByName(name, resultHandler);
    return this;
  }

  public Single<List<ProcessState>> rxFindByName(String name) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<List<ProcessState>>(handler -> {
      findByName(name, handler);
    });
  }

  public ProcessStateRepository remove(String id, Handler<AsyncResult<Void>> resultHandler) { 
    delegate.remove(id, resultHandler);
    return this;
  }

  public Completable rxRemove(String id) { 
    return new io.vertx.reactivex.core.impl.AsyncResultCompletable(handler -> {
      remove(id, handler);
    });
  }


  public static  ProcessStateRepository newInstance(com.experts.core.biller.statemachine.api.vertxloader.processtate.ProcessStateRepository arg) {
    return arg != null ? new ProcessStateRepository(arg) : null;
  }
}
