package com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain;


import com.experts.core.biller.statemachine.api.spintegrations.mongodb.enums.BankHistoryCommandEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class BankHistoryCommand {

    @Id
    private Long id;

    private String commandDescription;

    private BankHistoryCommandEnum historyCommandEnum;

    private Date createdDate;

    private boolean isCompleted;

    private String errorDesc;

    private String errorCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommandDescription() {
        return commandDescription;
    }

    public void setCommandDescription(String commandDescription) {
        this.commandDescription = commandDescription;
    }

    public BankHistoryCommandEnum getHistoryCommandEnum() {
        return historyCommandEnum;
    }

    public void setHistoryCommandEnum(BankHistoryCommandEnum historyCommandEnum) {
        this.historyCommandEnum = historyCommandEnum;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
