package com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain;

import com.experts.core.biller.statemachine.api.spintegrations.mongodb.enums.BankTrxEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BankTrx {

   @Id
   private Long id;

   private String trxCode;

   private String trxDescription;

   private BankTrxEnum trxEnum;

   private String errorDescription;

   private String errorCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrxCode() {
        return trxCode;
    }

    public void setTrxCode(String trxCode) {
        this.trxCode = trxCode;
    }

    public String getTrxDescription() {
        return trxDescription;
    }

    public void setTrxDescription(String trxDescription) {
        this.trxDescription = trxDescription;
    }

    public BankTrxEnum getTrxEnum() {
        return trxEnum;
    }

    public void setTrxEnum(BankTrxEnum trxEnum) {
        this.trxEnum = trxEnum;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
