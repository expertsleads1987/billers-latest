package com.experts.core.biller.statemachine.api.model.domain.jpa;

import javax.persistence.*;

import com.experts.core.biller.statemachine.api.constants.PaymentStatusType;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Table(name  = "payment_status")
public abstract class PaymentStatus {

    @Id
    @Column(length = 3072)
    private String id;

    public abstract <S extends PaymentStatusType> S asType();

    public abstract boolean isWaitingPay();

    public abstract boolean isPaid();

    public abstract boolean isCancelled();

}