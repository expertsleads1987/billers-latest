package com.experts.core.biller.statemachine.api.vertxloader.initstate;

import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity;
import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import com.experts.core.biller.statemachine.api.vertxloader.data.Account;
import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.util.List;



@DataObject
public class InitialState {

    public static final String DB_TABLE = "com/experts/core/biller/statemachine/api/vertxloader";

    private long id;

    private String billCode;

    private String billName;

    private String billerName;

    private String billerCode;

    private String billerAddress;

    private String clientId;

    private String onServiceBy;

    private String bankId;

    private String bankName;

    private String bankAddress;

    private String bankCode;

    public InitialState(long id , String billCode , String billName ,String billerName , String billerCode , String billerAddress  , String clientId  , String onServiceBy  , String bankId , String bankName  ,String bankAddress , String bankCode){
        this.bankAddress = bankAddress;
        this.bankCode = bankCode;
        this.bankId = bankId;
        this.bankName = bankName;
        this.billCode = billCode;
        this.billerAddress = billerAddress;
        this.billerCode = billerCode;
        this.billName = billName;
        this.clientId = clientId;
        this.id = id;
        this.onServiceBy = onServiceBy;

    }
    public InitialState(JsonObject json) {
        this.id = json.getLong("id");
        this.billCode = json.getString("billCode");
        this.billName = json.getString("billName");

        this.billerName = json.getString("billerName");
        this.billerCode = json.getString("billerCode");

        this.billerAddress = json.getString("billerAddress");
        this.clientId = json.getString("clientId");

        this.onServiceBy = json.getString("onServiceBy");
        this.bankId = json.getString("bankId");

        this.bankName = json.getString("bankName");
        this.bankAddress = json.getString("bankAddress");

    }
    public InitialState() {

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

    public String getBillerAddress() {
        return billerAddress;
    }

    public void setBillerAddress(String billerAddress) {
        this.billerAddress = billerAddress;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getOnServiceBy() {
        return onServiceBy;
    }

    public void setOnServiceBy(String onServiceBy) {
        this.onServiceBy = onServiceBy;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public JsonObject toJson() {
        return JsonObject.mapFrom(this);
    }

    @Override
    public String toString() {
        return Json.encodePrettily(this);
    }

}