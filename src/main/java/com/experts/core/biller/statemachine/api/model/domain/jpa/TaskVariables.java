package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.constants.VaribleType;
import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "tasks_varible")
@Data
@Builder
@EntityListeners({AuditingEntityListener.class, OpsEntityListener.class})
public class TaskVariables extends AbstractEntity {

    @Column(name  = "name" , nullable = false)
    private String varibleName;

    @Column(name  = "type" , nullable = false)
    private VaribleType type;

    @Column(name  = "value" , nullable = false)
    private String value;

    @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JoinColumn(name  = "task_id" , nullable = false)
    private Tasks tasks;

    public TaskVariables() {}
    public TaskVariables(String varibleName , VaribleType type , String value , Tasks tasks) {
    	this.tasks = tasks;
    	this.type = type;
    	this.value=value;
    	this.varibleName = varibleName;
    }

    public static class Builder{

        private String varibleName;

        private VaribleType type;

        private String value;

        private Tasks task;


        public Builder varibleName(String varibleName){
            this.varibleName = varibleName;
            return this;
        }

        public Builder type(VaribleType type){
            this.type = type;
            return this;
        }

        public Builder value(String value){
            this.value = value;
            return this;
        }

        public Builder task(Tasks task){
            this.task = task;
            return this;
        }

        public TaskVariables build(){
            return new TaskVariables(varibleName , type , value , task);
        }
    }
}
