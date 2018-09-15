package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Entity
@Table(name  = "process_state")
@Data
@Builder
@EntityListeners({AuditingEntityListener.class , OpsEntityListener.class})
public class ProcessState extends AbstractEntity{
    public static final String DB_TABLE = "com/experts/core/biller/statemachine/api/vertxloader";
    @Column(name = "process_name" , nullable = false)
    private String processName;

    @Column(name  = "process_definition" , nullable = false)
    private String processDefinition;

    @Column(name  = "process_flow_id" , nullable = false)
    private String processFlowId;

    @Column(name  = "process_flow_execution_id" , nullable = false)
    private String processFlowexecutionId;

    public ProcessState() {
    	
    }
    
    public ProcessState(String processName , String processDefinition , String processFlowId  ,  String processFlowexecutionId) {
    	this.processDefinition = processDefinition;
    	this.processFlowexecutionId = processFlowexecutionId;
    	this.processFlowId = processFlowId;
    	this.processName = processName;
    }
    
    public static String getDbTable() {
        return DB_TABLE;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProcessDefinition() {
        return processDefinition;
    }

    public void setProcessDefinition(String processDefinition) {
        this.processDefinition = processDefinition;
    }

    public String getProcessFlowId() {
        return processFlowId;
    }

    public void setProcessFlowId(String processFlowId) {
        this.processFlowId = processFlowId;
    }

    public String getProcessFlowexecutionId() {
        return processFlowexecutionId;
    }

    public void setProcessFlowexecutionId(String processFlowexecutionId) {
        this.processFlowexecutionId = processFlowexecutionId;
    }

    public static class Builder {

        private String processName;

        private String processDefinition;

        private String processFlowId;

        private String processFlowexecutionId;


        public Builder processName(String processName){
            this.processName = processName;
            return this;
        }

        public Builder processDefinition(String processDefinition){
            this.processDefinition = processDefinition;
            return this;
        }

        public Builder processFlowId(String processFlowId){
            this.processFlowId = processFlowId;
            return this;
        }

        public Builder processFlowexecutionId(String processFlowexecutionId){
            this.processFlowexecutionId = processFlowexecutionId;
            return this;
        }

        public ProcessState build(){
            return new ProcessState( processName , processDefinition , processFlowId , processFlowexecutionId);
        }
    }

}
