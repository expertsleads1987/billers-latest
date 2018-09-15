package com.experts.core.biller.statemachine.api.spintegrations.mongodb.enums;

public enum BankTrxEnum {

    ROLLBACKED("ROLLEDBACK") , COMMITTED("COMITTED");

    private String trx;

    BankTrxEnum(String trx){
    this.trx = trx;
    }


}
