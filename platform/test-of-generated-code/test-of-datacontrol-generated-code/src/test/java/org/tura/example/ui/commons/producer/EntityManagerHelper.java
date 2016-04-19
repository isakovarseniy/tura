package org.tura.example.ui.commons.producer;

import java.io.Serializable;

import javax.annotation.Priority;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

import javax.inject.Inject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Alternative
@Priority(0)
@ApplicationScoped
public class EntityManagerHelper implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private EntityManagerFactory emf;
    private EntityManager em;

    public EntityManager getEntityManager() {
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }

    public void destroyEntityManager() {
        if (em.isOpen()) {
            em.close();
        }
        em = null;
    }
}
