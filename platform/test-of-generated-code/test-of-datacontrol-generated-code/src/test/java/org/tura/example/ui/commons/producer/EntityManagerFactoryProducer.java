package org.tura.example.ui.commons.producer;

import javax.annotation.Priority;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Alternative
@Priority(0)
public class EntityManagerFactoryProducer {
    @Produces
    public EntityManagerFactory getEntityManagerFactory(
        InjectionPoint injectionPoint) {
        return Persistence.createEntityManagerFactory("UIComponent");
    }
}
