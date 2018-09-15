package com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserRoles {

    private Auths auths;

    @Id
    private Users users;


    public Auths getAuths() {
        return auths;
    }

    public void setAuths(Auths auths) {
        this.auths = auths;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
