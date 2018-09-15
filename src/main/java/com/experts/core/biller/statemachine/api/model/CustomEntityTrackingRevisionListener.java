package com.experts.core.biller.statemachine.api.model;

import com.experts.core.biller.statemachine.api.model.domain.jpa.CustomTrackingRevisionEntity;
import com.experts.core.biller.statemachine.api.model.domain.jpa.ModifiedEntityTypeEntity;
import org.hibernate.SessionFactory;
import org.hibernate.envers.EntityTrackingRevisionListener;
import org.hibernate.envers.RevisionType;
import org.infinispan.persistence.manager.PersistenceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Auditable;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.annotation.Resource;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

public class CustomEntityTrackingRevisionListener implements EntityTrackingRevisionListener {
    @Resource
    private org.hibernate.engine.spi.PersistenceContext persistenceManagerHibernate;

    @Autowired
    private SessionFactory sessionFactory;

    public void newRevision(Object revisionEntity) {
        CustomTrackingRevisionEntity revision = (CustomTrackingRevisionEntity) revisionEntity;
        revision.setUsername(getUsername());
    }


    public String getUsername() {
        final SecurityContext context = SecurityContextHolder.getContext();
        if (context != null) {
            if (context.getAuthentication() != null) {
                return context.getAuthentication().getName();
            } else {
                return "anonymous";
            }
        }
        return "anonymous";
    }

    @Override
    public void entityChanged(@SuppressWarnings("rawtypes") Class entityClass, String entityName, Serializable entityId, RevisionType revisionType, Object revisionEntity) {
        ModifiedEntityTypeEntity revision = (ModifiedEntityTypeEntity) revisionEntity;
        revision.setId(entityId.toString());
        revision.setEntityClassName(entityName);
        revision.setRevision(revision.getRevision());
        Auditable auditable = null;
       // persistenceManagerHibernate.getSession().accessTransaction().begin();
        sessionFactory.openSession().persist(revision);
        sessionFactory.close();


    }
}