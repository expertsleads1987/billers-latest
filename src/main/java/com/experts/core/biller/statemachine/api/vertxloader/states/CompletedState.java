package com.experts.core.biller.statemachine.api.vertxloader.states;


import com.experts.core.biller.statemachine.api.vertxloader.processtate.ProcessState;
import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;

import io.vertx.codegen.annotations.DataObject;
        import io.vertx.core.json.Json;
        import io.vertx.core.json.JsonObject;


@DataObject
public class CompletedState {

    public static final String DB_TABLE = "com/experts/core/biller/statemachine/api/vertxloader";

    private long id;

    private String name;

    private String code;

    private String message;

    private String execption;

    private boolean isSuccess;

    private ProcessState processState;

    private String billNo;

    private String billCode;

    private String transactionId;

    private String billerName;

    private String billerCode;

    public CompletedState(JsonObject json) {
        this.id = json.getLong("id");
        this.billCode = json.getString("billCode");
        this.name = json.getString("name");

        this.billerName = json.getString("billerName");
        this.billerCode = json.getString("billerCode");

        this.code = json.getString("code");
        this.message = json.getString("message");

        this.isSuccess = json.getBoolean("onServiceBy");
        this.billNo = json.getString("billNo");

        this.transactionId = json.getString("transactionId");
        this.execption = json.getString("execption");

    }
    public CompletedState(Long id, String name, String code, String  message , String execption , String billNo , String billCode , String transactionId , String billerName , String billerCode){
        this.id = id;
        this.name  = name ;
        this.code = code ;
        this.message = message;
        this.execption = execption;
        this.billNo = billNo;
        this.billCode = billCode;
        this.transactionId =  transactionId;
        this.billerName = billerName;
        this.billerCode = billerCode;
    }
    public CompletedState(){

    }

    public static String getDbTable() {
        return DB_TABLE;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExecption() {
        return execption;
    }

    public void setExecption(String execption) {
        this.execption = execption;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public ProcessState getProcessState() {
        return processState;
    }

    public void setProcessState(ProcessState processState) {
        this.processState = processState;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getBillerName() {
        return billerName;
    }

    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    public String getBillerCode() {
        return billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

    public JsonObject toJson() {
        return JsonObject.mapFrom(this);
    }

    @Override
    public String toString() {
        return Json.encodePrettily(this);
    }
}