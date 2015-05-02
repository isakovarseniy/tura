package org.tura.example.ui.hrmanager.tree2tree.datacontrol;

import org.tura.platform.datacontrol.CommandStack;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;

import javax.persistence.EntityManager;

@ApplicationScoped
public class CDICommandStack extends CommandStack implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private EntityManager em;

    @Override
    public void beginTransaction() {
        em.getTransaction().begin();

    }

    @Override
    public void commitTransaction() {
        em.getTransaction().commit();

    }

    @Override
    public void rallbackTransaction() {
        em.getTransaction().rollback();
    }
}
