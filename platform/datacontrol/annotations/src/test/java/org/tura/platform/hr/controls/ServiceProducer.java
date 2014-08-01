package org.tura.platform.hr.controls;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.tura.platform.commons.jpa.TuraJPAEntityService;

public class ServiceProducer {
	@Inject
	private CDICommandStack sc;

	@Produces
	public TuraJPAEntityService getDepartmenrService(){
		TuraJPAEntityService service = new TuraJPAEntityService();
		service.setEntityManager(sc.getEm());
		return service;
	}


}
