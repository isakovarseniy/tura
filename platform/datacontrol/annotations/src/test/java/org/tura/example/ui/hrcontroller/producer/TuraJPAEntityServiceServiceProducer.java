package org.tura.example.ui.hrcontroller.producer;

import org.tura.platform.commons.jpa.TuraJPAEntityService;

import javax.enterprise.inject.Produces;

import javax.inject.Inject;

import javax.persistence.EntityManager;

public class TuraJPAEntityServiceServiceProducer {
    @Inject
    private EntityManager em;

    @Produces
    public TuraJPAEntityService getTuraJPAEntityService() {
        TuraJPAEntityService service = new TuraJPAEntityService();
        service.setEntityManager(em);
        return service;
    }
}
