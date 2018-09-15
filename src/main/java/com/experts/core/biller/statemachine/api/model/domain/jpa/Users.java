package com.experts.core.biller.statemachine.api.model.domain.jpa;


import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name =  "users_")
@Data
public class Users extends AbstractEntity{

    @Column(name  = "username_token" , nullable = false)
    private String usernameToken;

    @Column(name  = "password_token" , nullable = false)
    private String passwordToken;

    @Column(name  = "enabled" , nullable = false)
    private boolean isEnabled;

    @Column(name  = "blocked" , nullable = true)
    private boolean isBlocked;

    @JsonCreator( mode  = JsonCreator.Mode.PROPERTIES)
    public Users(){}

    public String getUsernameToken() {
        return usernameToken;
    }

    public void setUsernameToken(String usernameToken) {
        this.usernameToken = usernameToken;
    }

    public String getPasswordToken() {
        return passwordToken;
    }

    public void setPasswordToken(String passwordToken) {
        this.passwordToken = passwordToken;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
