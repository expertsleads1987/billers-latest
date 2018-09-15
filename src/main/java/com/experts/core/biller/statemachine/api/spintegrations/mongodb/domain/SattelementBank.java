package com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class SattelementBank {

    @Id
    private Long id;

    private String bankCode;

    private String bankName;

    private Date   createdDate;

    private String email;

    private String phone;

    private String mobile;

    private int maxTrxByDay;

    private Bank bank;

    private int jmsQueue;

    private int sqlQueries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getMaxTrxByDay() {
        return maxTrxByDay;
    }

    public void setMaxTrxByDay(int maxTrxByDay) {
        this.maxTrxByDay = maxTrxByDay;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public int getJmsQueue() {
        return jmsQueue;
    }

    public void setJmsQueue(int jmsQueue) {
        this.jmsQueue = jmsQueue;
    }

    public int getSqlQueries() {
        return sqlQueries;
    }

    public void setSqlQueries(int sqlQueries) {
        this.sqlQueries = sqlQueries;
    }
}
