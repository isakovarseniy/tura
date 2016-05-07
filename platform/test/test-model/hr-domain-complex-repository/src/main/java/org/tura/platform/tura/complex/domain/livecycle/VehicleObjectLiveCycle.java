package org.tura.platform.tura.complex.domain.livecycle;

import org.elsoft.platform.hr.objects.complex.model.VehicleObject;
import org.elsoft.platform.hr.objects.jpa.simple.model.VehicleJPA;
import org.tura.platform.object.model.DomainObject;
import org.tura.platform.object.persistence.PersistenceObject;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.complex.domain.provider.ObjectLiveCycle;

public class VehicleObjectLiveCycle extends ObjectLiveCycle {

	public VehicleObjectLiveCycle(JPAService service) {
		super(service);
	}

	@Override
	public Object load(Object persistedObject) throws Exception {
		check(persistedObject, VehicleJPA.class);
		DomainObject domainObject = loadObject(persistedObject, VehicleObject.class);
		return domainObject;
	}

	@Override
	public void save(Object object) throws Exception {
		check(object, VehicleObject.class);
		VehicleObject domainObject = (VehicleObject) object;

		saveObject(domainObject, VehicleJPA.class);

	}

	@Override
	public void remove(Object object) throws Exception {
		check(object, VehicleObject.class);
		VehicleObject domainObject = (VehicleObject) object;

		PersistenceObject persistedObject = findObjectByDomainObject(domainObject, VehicleJPA.class);
		if (persistedObject != null)
			getService().remove(persistedObject);
	}

}
