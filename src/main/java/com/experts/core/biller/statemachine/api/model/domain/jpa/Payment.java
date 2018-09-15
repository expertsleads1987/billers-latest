package com.experts.core.biller.statemachine.api.model.domain.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Payment extends AbstractEntity{

    @ManyToOne
    private Transaction transaction;

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public boolean isWaitingPay() {
        return this.getStatus().isWaitingPay();
    }

    public boolean isPaid() {
        return this.getStatus().isPaid();
    }

    public boolean isCancelled() {
        return this.getStatus().isCancelled();
    }

    public abstract <S extends PaymentStatus> S getStatus();

}
