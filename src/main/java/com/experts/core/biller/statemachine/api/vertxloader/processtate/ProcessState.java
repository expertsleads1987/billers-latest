package com.experts.core.biller.statemachine.api.vertxloader.processtate;


import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;


@DataObject
public class ProcessState {

    public static final String DB_TABLE = "com/experts/core/biller/statemachine/api/vertxloader";
    private long id;

    private String processName;

    private String processDefinition;

    private String processFlowId;

    private String processFlowexecutionId;

    public ProcessState(JsonObject json) {
        this.id = json.getLong("id");
        this.processName = json.getString("processName");
        this.processDefinition = json.getString("processDefinition");

        this.processFlowId = json.getString("processFlowId");
        this.processFlowexecutionId = json.getString("processFlowexecutionId");

    }

    public ProcessState(long id , String processName , String processDefinition , String processFlowId , String processFlowexecutionId) {
    this.id = id;
    this.processDefinition = processDefinition;
    this.processFlowexecutionId = processFlowexecutionId;
    this.processName = processName;
    this.processFlowId = processFlowId;
    }

    public ProcessState(){}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static String getDbTable() {
        return DB_TABLE;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProcessDefinition() {
        return processDefinition;
    }

    public void setProcessDefinition(String processDefinition) {
        this.processDefinition = processDefinition;
    }

    public String getProcessFlowId() {
        return processFlowId;
    }

    public void setProcessFlowId(String processFlowId) {
        this.processFlowId = processFlowId;
    }

    public String getProcessFlowexecutionId() {
        return processFlowexecutionId;
    }

    public void setProcessFlowexecutionId(String processFlowexecutionId) {
        this.processFlowexecutionId = processFlowexecutionId;
    }


    public JsonObject toJson() {
        return JsonObject.mapFrom(this);
    }

    @Override
    public String toString() {
        return Json.encodePrettily(this);
    }
}
