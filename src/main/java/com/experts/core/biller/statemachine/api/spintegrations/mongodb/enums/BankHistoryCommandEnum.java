package com.experts.core.biller.statemachine.api.spintegrations.mongodb.enums;

public enum BankHistoryCommandEnum {


     Created("created"),Updated("Updated"),Insert("Insert"),Deleted("Deleted");
     BankHistoryCommandEnum(String cmd){
       this.cmd = cmd;
     }
     private String cmd;
}
