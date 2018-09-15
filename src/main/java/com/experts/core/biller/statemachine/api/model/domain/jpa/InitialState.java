package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Entity
@Table(name  = "initial_state")
@Data
@EntityListeners({AuditingEntityListener.class , OpsEntityListener.class})
public class InitialState extends AbstractEntity {

    public static final String DB_TABLE = "com/experts/core/biller/statemachine/api/vertxloader";
    /*private String id;*/

    @Column(name  = "bill_code" , nullable = false)
    private String billCode;

    @Column(name = "billName" , nullable = false)
    private String billName;

    @Column(name  = "biller_name" , nullable = false)
    private String billerName;

    @Column(name  = "biller_code" , nullable = false)
    private String billerCode;

    @Column(name  = "biller_address" , nullable = true)
    private String billerAddress;

    @Column(name  = "client_id" , nullable = false)
    private String clientId;

    @Column(name  = "service_used" , nullable = false)
    private String onServiceBy;

    @Column(name = "bank_id" , nullable = false)
    private String bankId;

    @Column(name  = "bank_name" , nullable = false)
    private String bankName;

    @Column(name  = "bank_addrs" , nullable =  true)
    private String bankAddress;

    @Column(name  = "bank_code" , nullable = false)
    private String bankCode;


    @JsonCreator(mode =  JsonCreator.Mode.PROPERTIES)
    public InitialState(){

    }

    public static  class Builder {

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

        public Builder billCode(String billCode){
            this.billCode =  billCode;
            return this;
        }

        public Builder billName(String billName){
            this.billName = billName;
            return this;
        }

        public Builder billerName(String billerName){
            this.billerName = billerName;
            return this;
        }

        public Builder billerCode(String billerCode){
            this.billerCode = billerCode;
            return this;
        }

        public Builder billerAddress(String billerAddress){
            this.billerAddress = billerAddress;
            return this;
        }

        public Builder clientId(String clientId){
            this.clientId = clientId;
            return this;
        }

        public Builder onServiceBy(String onServiceBy){
            this.onServiceBy = onServiceBy;
            return this;
        }

        public Builder bankId(String bankId){
            this.bankId = bankId;
            return this;
        }

        public Builder bankName(String bankName){
            this.bankName = bankName;
            return this;
        }

        public Builder bankAddress(String bankAddress){
            this.bankAddress = bankAddress;
            return this;
        }

        public Builder bankCode(String bankCode){
            this.bankCode = bankCode;
            return this;
        }

        public InitialState build(){
            return new InitialState ( );
        }
    }

    public static String getDbTable() {
        return DB_TABLE;
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
}
