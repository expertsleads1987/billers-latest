package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.constants.TasksType;
import com.experts.core.biller.statemachine.api.persist.OpsEntityListener;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name  = "tasks")
@Data
@Builder
@EntityListeners({AuditingEntityListener.class , OpsEntityListener.class})
public class Tasks extends AbstractEntity{

    @Column(name  = "task_name" , nullable = false)
    private String taskName;

    @Column(name  = "task_id" , nullable = false)
    private String taskId;

    @Column(name  = "type" , nullable = false)
    private TasksType type;

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "tasks" , cascade = CascadeType.ALL)
    private List<TaskVariables> variables;

    
    public Tasks() {}
    public Tasks(String taskName , String taskId , TasksType type , List<TaskVariables> variables ) {
    	this.taskId = taskId;
    	this.taskName=taskName;
    	this.type=type;
    	this.variables = variables;
    }
    
    
    public static class Builder {

        private String taskName;
        private String taskId;
        private TasksType type;
        private List<TaskVariables> variables;

        public Builder taskName(String taskName){
            this.taskName = taskName;
            return this;
        }

        public Builder taskId(String taskId){
            this.taskId = taskId;
            return this;
        }

        public Builder type(TasksType type){
            this.type = type;
            return this;
        }
        public Builder variables(List<TaskVariables> variables){
            this.variables = variables;
            return this;
        }
        public Tasks build(){
            return new Tasks(taskName , taskId , type , variables);
        }
    }
}
