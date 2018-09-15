package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.codegen.annotations.DataObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name  = "completed_state")
@Data
@EntityListeners({AuditingEntityListener.class , OpsEntityListener.class})
public class CompletedState extends AbstractEntity {

    public static final String DB_TABLE = "com/experts/core/biller/statemachine/api/vertxloader";

    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "code" , nullable = false)
    private String code;

    @Column(name  = "message" , nullable = false)
    private String message;

    @Column(name  = "execption" , nullable = true)
    private String execption;

    @Column(name  = "sucess" , nullable = false)
    private boolean isSuccess;

    @OneToOne
    @JoinColumn(name  = "processstate_completedState" , nullable = false)
    private ProcessState processstate_completedState;

    @Column(name  = "bill_no" , nullable = false)
    private String billNo;

    @Column(name  = "bill_code" , nullable = false)
    private String billCode;

    @Column(name  = "transaction_id" , nullable = false)
    private String transactionId;

    @Column(name  = "biller_name" , nullable = false)
    private String billerName;

    @Column(name  = "biller_code" , nullable = false)
    private String billerCode;


    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public CompletedState(){

    }


    public static String getDbTable() {
        return DB_TABLE;
    }

    public ProcessState getProcessstate_completedState() {
        return processstate_completedState;
    }

    public void setProcessstate_completedState(ProcessState processstate_completedState) {
        this.processstate_completedState = processstate_completedState;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getBillerName() {
        return billerName;
    }

    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    public String getBillerCode() {
        return billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

    public CompletedState(Long id, String name, String code, String  message , String execption , String billNo , String billCode , String transactionId , String billerName , String billerCode){
        this.id = id;
        this.name  = name ;
        this.code = code ;
        this.message = message;
        this.execption = execption;
        this.billNo = billNo;
        this.billCode = billCode;
        this.transactionId =  transactionId;
        this.billerName = billerName;
        this.billerCode = billerCode;
    }



    public static class Builder {
        private String name;
        private String code;
        private String message;
        private String execption;
        private boolean isSuccess;
        private ProcessState processState;

        private String billNo;
        private String billCode;
        private String transactionId;
        private String billerName;
        private String billerCode;

        private transient  String _id;
        private transient  String _name;
        private transient Integer _val;

        public Builder _id(String _id){
            this._id = _id;
            return this;
        }

        public Builder _name(String _name){
            this._name = _name;
            return this;
        }

        public Builder _val(Integer _val) {
            this._val = _val;
            return this;
        }

        public Builder transaction(String transactionId){
            this.transactionId = transactionId;
            return this;
        }

        public Builder billerName(String billerName){
            this.billerName = billerName;
            return this;
        }

        public Builder billerCode(String billerCode){
            this.billerCode = billerCode;
            return this;
        }

        public Builder billCode(String billCode){
            this.billCode = billCode;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder code(String code){
            this.code = code;
            return this;
        }

        public Builder message(String message){
            this.message = message;
            return this;
        }

        public Builder execption(String txt){
            this.message = txt;
            return this;
        }

        public Builder isSuccess(boolean isSuccess){
            this.isSuccess = isSuccess;
            return this;
        }

        public Builder  processState(ProcessState processState){
            this.processState = processState;
            return this;
        }

        public CompletedState build(){
            return new CompletedState(    );
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExecption() {
        return execption;
    }

    public void setExecption(String execption) {
        this.execption = execption;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
