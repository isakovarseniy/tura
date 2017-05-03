package org.tura.platform.repository.cdi;

import javax.annotation.Priority;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Alternative
@Priority(0)
public class EntityManagerProducer {
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Produces
    @RequestScoped
    protected EntityManager createEntityManager() {
        return emf.createEntityManager();
    }

    protected void closeEntityManager(@Disposes
    EntityManager entityManager) {
        if (entityManager.isOpen()) {
            entityManager.close();
        }
    }
}
