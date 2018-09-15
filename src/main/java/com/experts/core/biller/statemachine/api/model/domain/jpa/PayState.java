package com.experts.core.biller.statemachine.api.model.domain.jpa;


import com.experts.core.biller.statemachine.api.constants.Currency;
import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name =  "pay_state")
@Data
@EntityListeners({AuditingEntityListener.class , OpsEntityListener.class})
public class PayState extends AbstractEntity{


    /*private String id;*/

    @Column(name  = "transaction" , nullable = false)
    private String transaction;

    @Column(name  = "amount" , nullable = false)
    private String amount;

    @Column(name  = "currency" , nullable = false)
    private Currency currency;

    @Column(name  = "bank_code" , nullable = false)
    private String bankCode;


    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name =  "initial_state" , nullable = false)
    private InitialState state;

    @JsonCreator( mode  = JsonCreator.Mode.PROPERTIES)
    public PayState(){}

    public static class Builder {

        private String transaction;

        private String amount;

        private Currency currency;

        private String bankCode;

        private InitialState initialState;

        public Builder transaction(String transaction){
            this.transaction = transaction;
            return this;
        }

        public Builder amount(String amount){
            this.amount = amount;
            return this;
        }

        public Builder currency(Currency currency){
            this.currency = currency;
            return this;
        }

        public Builder bankCode(String bankCode){
            this.bankCode = bankCode;
            return this;
        }

        public Builder initialState(InitialState initialState){
            this.initialState =initialState;
            return this;
        }

        public PayState build(){
            return new PayState();
        }
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
