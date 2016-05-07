package org.tura.platform.tura.complex.domain.livecycle;

import java.util.List;

import org.elsoft.platform.hr.objects.complex.model.StreetObject;
import org.elsoft.platform.hr.objects.complex.model.DepartmentsObject;
import org.elsoft.platform.hr.objects.jpa.simple.model.StreetJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.DepartmentJPA;
import org.tura.platform.object.model.DomainObject;
import org.tura.platform.object.persistence.PersistenceObject;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.complex.domain.provider.ComplexObjectTuraProvider;
import org.tura.platform.tura.complex.domain.provider.ObjectLiveCycle;

public class StreetObjectLiveCycle extends ObjectLiveCycle {

	public StreetObjectLiveCycle(JPAService service) {
		super(service);
	}

	public ObjectLiveCycle getLiveCycle() {
		return ((ComplexObjectTuraProvider)getProvider()).getObjectLiveCycle(DepartmentsObject.class.getName());
	}

	@Override
	public Object load(Object persistedObject) throws Exception {
		check(persistedObject, StreetJPA.class);
		DomainObject domainObject = loadObject(persistedObject, StreetObject.class);

		loadChildren(domainObject, getLiveCycle(), "DepartmentsObject", DepartmentJPA.class);
		return domainObject;
	}

	@Override
	public void save(Object object) throws Exception {
		check(object, StreetObject.class);
		StreetObject domainObject = (StreetObject) object;

		saveObject(domainObject, StreetJPA.class);
		saveChildren(domainObject, getLiveCycle(), domainObject.getDepartmentsObject(), DepartmentJPA.class,DepartmentsObject.class);

	}

	@Override
	public void remove(Object object) throws Exception {
		check(object, StreetObject.class);
		StreetObject domainObject = (StreetObject) object;

		@SuppressWarnings("rawtypes")
		List list = findChildren(domainObject, DepartmentJPA.class);

		if (list.size() != 0) {
			for (Object obj : list) {
				DepartmentsObject dObject = new DepartmentsObject();
				dObject.setObjId(((PersistenceObject) obj).getObjId());
				getLiveCycle().remove(dObject);
			}
		}

		PersistenceObject persistedObject = findObjectByDomainObject(domainObject, StreetJPA.class);
		if (persistedObject != null)
			getService().remove(persistedObject);
	}

}
