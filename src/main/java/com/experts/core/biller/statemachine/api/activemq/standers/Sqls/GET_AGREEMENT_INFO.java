package com.experts.core.biller.statemachine.api.activemq.standers.Sqls;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class GET_AGREEMENT_INFO {

    private String P_NAME;
    private Integer  P_BALANCE;
    private String P_RESULT;

    public String getP_NAME() {
        return P_NAME;
    }

    public void setP_NAME(String p_NAME) {
        P_NAME = p_NAME;
    }

    public Integer getP_BALANCE() {
        return P_BALANCE;
    }

    public void setP_BALANCE(Integer p_BALANCE) {
        P_BALANCE = p_BALANCE;
    }

    public String getP_RESULT() {
        return P_RESULT;
    }

    public void setP_RESULT(String p_RESULT) {
        P_RESULT = p_RESULT;
    }
}
