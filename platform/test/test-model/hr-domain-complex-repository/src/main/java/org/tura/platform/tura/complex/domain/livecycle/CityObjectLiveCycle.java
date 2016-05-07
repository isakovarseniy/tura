package org.tura.platform.tura.complex.domain.livecycle;

import java.util.List;

import org.elsoft.platform.hr.objects.complex.model.CityObject;
import org.elsoft.platform.hr.objects.complex.model.StreetObject;
import org.elsoft.platform.hr.objects.jpa.simple.model.CityJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.StreetJPA;
import org.tura.platform.object.model.DomainObject;
import org.tura.platform.object.persistence.PersistenceObject;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.complex.domain.provider.ComplexObjectTuraProvider;
import org.tura.platform.tura.complex.domain.provider.ObjectLiveCycle;

public class CityObjectLiveCycle extends ObjectLiveCycle{

	public CityObjectLiveCycle(JPAService service) {
		super(service);
	}


	public ObjectLiveCycle getLiveCycle() {
		return ((ComplexObjectTuraProvider)getProvider()).getObjectLiveCycle(StreetObject.class.getName());
	}

	
	@Override
	public Object load(Object persistedObject) throws Exception {
        check(persistedObject,CityJPA.class);
		DomainObject domainObject = loadObject(persistedObject, CityObject.class);

		loadChildren(domainObject,getLiveCycle(), "StreetObject", StreetJPA.class);		
		return domainObject;
	}	
	

	@Override
	public void save(Object object) throws Exception {
        check(object,CityObject.class);
        CityObject domainObject = (CityObject) object;
        
		saveObject(domainObject,CityJPA.class);
		saveChildren(domainObject, getLiveCycle(), domainObject.getStreetObject(), StreetJPA.class,StreetObject.class);

	}
	
	@Override
	public void remove(Object object) throws Exception {
        check(object,CityObject.class);
        CityObject domainObject = (CityObject) object;

	   	@SuppressWarnings("rawtypes")
		List list = findChildren(domainObject, StreetJPA.class);
 
    	if (list.size() != 0 ){
			for (Object obj : list){
				StreetObject dObject = new StreetObject();
				dObject.setObjId(((PersistenceObject)obj).getObjId());
				getLiveCycle().remove(dObject);
			}
	    }		
    	
		PersistenceObject persistedObject =  findObjectByDomainObject(domainObject, CityJPA.class);		
		if (persistedObject != null)
		getService().remove(persistedObject);
	}
	
}
