package com.experts.core.biller.statemachine.api.vertxloader.waitingstate;

import com.experts.core.biller.statemachine.api.vertxloader.processtate.ProcessState;
        import io.vertx.codegen.annotations.DataObject;
        import io.vertx.core.json.Json;
        import io.vertx.core.json.JsonObject;

        import io.vertx.codegen.annotations.DataObject;
        import io.vertx.core.json.Json;
        import io.vertx.core.json.JsonObject;


@DataObject
public class WaitingState {

    public static final String DB_TABLE = "com/experts/core/biller/statemachine/api/vertxloader";

    private String waitingOpsName;

    private long id;

    private ProcessState processState;

    private String period;

    private String billCode;

    private String billName;

    private String bankCode;

    private String billerCode;

    private String transactionId;

    private String billerName;



    public WaitingState(JsonObject json) {
        this.id = json.getLong("id");
        this.waitingOpsName = json.getString("waitingOpsName");
        this.period = json.getString("period");

        this.billCode = json.getString("billCode");
        this.billName = json.getString("billName");
        this.bankCode = json.getString("bankCode");
        this.billerCode = json.getString("billerCode");
        this.transactionId = json.getString("transactionId");
    }
    public WaitingState(long  id , String waitingOpsName , String period , String billCode , String billName , String bankCode , String billerCode , String transactionId){
        this.id = id;
        this.waitingOpsName = waitingOpsName;
        this.period = period;
        this.bankCode = bankCode;
        this.billCode =  billCode;
        this.billName = billName;
        this.billerCode =  billerCode;
        this.transactionId = transactionId;
    }

    public static String getDbTable() {
        return DB_TABLE;
    }

    public String getWaitingOpsName() {
        return waitingOpsName;
    }

    public void setWaitingOpsName(String waitingOpsName) {
        this.waitingOpsName = waitingOpsName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ProcessState getProcessState() {
        return processState;
    }

    public void setProcessState(ProcessState processState) {
        this.processState = processState;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBillerCode() {
        return billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
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

    public JsonObject toJson() {
        return JsonObject.mapFrom(this);
    }

    @Override
    public String toString() {
        return Json.encodePrettily(this);
    }
}