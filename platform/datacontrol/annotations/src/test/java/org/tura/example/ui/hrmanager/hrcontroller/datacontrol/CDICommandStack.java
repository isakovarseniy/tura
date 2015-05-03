package org.tura.example.ui.hrmanager.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.annotations.Selector;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;

import javax.persistence.EntityManager;

@ApplicationScoped
@Selector("hrmanager.hrcontroller")
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
