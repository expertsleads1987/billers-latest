package com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Auths {

    @Id
    private Long id;
    private String auth;
    private String auth_sec;
    private String auth_third;


    public String getAuth_sec() {
        return auth_sec;
    }

    public void setAuth_sec(String auth_sec) {
        this.auth_sec = auth_sec;
    }

    public String getAuth_third() {
        return auth_third;
    }

    public void setAuth_third(String auth_third) {
        this.auth_third = auth_third;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
