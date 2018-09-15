package com.experts.core.biller.statemachine.api.model.domain.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name  = "modified_entity")
public class ModifiedEntityTypeEntity {
    @Id
    @Column(length = 3072)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "revision_id" , nullable = false)
    private CustomTrackingRevisionEntity revision;

    @Column(name  = "entity_cls_name" , nullable = false)
    private String entityClassName;

    public ModifiedEntityTypeEntity(CustomTrackingRevisionEntity entity , String entityClassName){

        this.revision = entity;
        this.entityClassName = entityClassName;

    }

    public CustomTrackingRevisionEntity getRevision() {
        return revision;
    }

    public void setRevision(CustomTrackingRevisionEntity revision) {
        this.revision = revision;
    }

    public String getEntityClassName() {
        return entityClassName;
    }

    public void setEntityClassName(String entityClassName) {
        this.entityClassName = entityClassName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
