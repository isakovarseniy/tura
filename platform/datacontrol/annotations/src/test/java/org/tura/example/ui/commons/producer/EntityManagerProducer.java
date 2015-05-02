package org.tura.example.ui.commons.producer;

import org.hibernate.cfg.Configuration;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {
    private EntityManager em;

    @Produces
    public EntityManager getEntityManager(InjectionPoint injectionPoint) {
        if (em != null) {
            return em;
        }
        Configuration config = new Configuration();
        config.addResource("META-INF/persistence.xml");
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("UIComponent",
                config.getProperties());
        em = emf.createEntityManager();

        return em;
    }
}
