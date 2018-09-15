package com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class SattelementBankHistory {

  @Id
  private Long id;

  private String description;

  private Date createdDate;

  private Users users;

  private SattelementBank sattelementBank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public SattelementBank getSattelementBank() {
        return sattelementBank;
    }

    public void setSattelementBank(SattelementBank sattelementBank) {
        this.sattelementBank = sattelementBank;
    }
}
