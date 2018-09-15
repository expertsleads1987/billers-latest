package com.experts.core.biller.statemachine.api.model;

import com.experts.core.biller.statemachine.api.model.domain.jpa.Users;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.*;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManagerFactory;

@Component
public class UiDateListener implements PostLoadEventListener, PreUpdateEventListener {
    @Inject EntityManagerFactory entityManagerFactory;

    @PostConstruct
    private void init() {
        HibernateEntityManagerFactory hibernateEntityManagerFactory = (HibernateEntityManagerFactory) this.entityManagerFactory;
        SessionFactoryImpl sessionFactoryImpl = (SessionFactoryImpl) hibernateEntityManagerFactory.getSessionFactory();
        EventListenerRegistry registry = sessionFactoryImpl.getServiceRegistry().getService(EventListenerRegistry.class);
        registry.appendListeners(EventType.POST_LOAD, this);
        registry.appendListeners(EventType.PRE_UPDATE, this);
    }

    @Override
    public void onPostLoad(PostLoadEvent event) {
        final Object entity = event.getEntity();
        if (entity == null) return;

        final Users currentUser = (Users) RequestContextHolder.currentRequestAttributes().getAttribute("currentUser", RequestAttributes.SCOPE_SESSION);
        // some logic after entity loaded
    }

    @Override
    public boolean onPreUpdate(PreUpdateEvent event) {
        final Object entity = event.getEntity();
        if (entity == null) return false;

        // some logic before entity persist

        return false;
    }
}