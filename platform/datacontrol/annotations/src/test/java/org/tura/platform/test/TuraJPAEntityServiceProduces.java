package org.tura.platform.test;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.tura.platform.commons.jpa.TuraJPAEntityService;

public class TuraJPAEntityServiceProduces {
	@Inject
	private EntityManager em;
	
	@Produces
	public TuraJPAEntityService getTuraJPAEntityService(){
		TuraJPAEntityService service = new TuraJPAEntityService();
		service.setEntityManager(em);
		return service;
	}

}
