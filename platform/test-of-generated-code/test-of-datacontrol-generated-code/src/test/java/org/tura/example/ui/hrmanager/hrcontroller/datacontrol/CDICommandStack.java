package org.tura.example.ui.hrmanager.hrcontroller.datacontrol;

import org.tura.example.ui.commons.producer.EntityManagerHelper;
import org.tura.platform.datacontrol.CommandStack;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;
import javax.inject.Named;

@ApplicationScoped
@Named("hrmanager.hrcontroller")
public class CDICommandStack extends CommandStack implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private EntityManagerHelper emHelper;

    @Override
    public void beginTransaction() {
        emHelper.getEntityManager().getTransaction().begin();
    }

    @Override
    public void commitTransaction() {
        try {
            emHelper.getEntityManager().getTransaction().commit();
        } finally {
            emHelper.destroyEntityManager();
        }
    }

    @Override
    public void rallbackTransaction() {
        try {
            emHelper.getEntityManager().getTransaction().rollback();
        } finally {
            emHelper.destroyEntityManager();
        }
    }
}
