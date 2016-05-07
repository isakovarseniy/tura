package org.tura.platform.tura.complex.domain.livecycle;

import java.util.List;

import org.elsoft.platform.hr.objects.complex.model.CompanyObject;
import org.elsoft.platform.hr.objects.complex.model.CountryObject;
import org.elsoft.platform.hr.objects.jpa.simple.model.CompanyJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.CountryJPA;
import org.tura.platform.object.model.DomainObject;
import org.tura.platform.object.persistence.PersistenceObject;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.complex.domain.provider.ComplexObjectTuraProvider;
import org.tura.platform.tura.complex.domain.provider.ObjectLiveCycle;

public class CompanyObjectLiveCycle extends ObjectLiveCycle{

	public CompanyObjectLiveCycle(JPAService service) {
		super(service);
	}


	public ObjectLiveCycle getLiveCycle() {
		return ((ComplexObjectTuraProvider)getProvider()).getObjectLiveCycle(CountryObject.class.getName());
	}

	
	@Override
	public Object load(Object persistedObject) throws Exception {
        check(persistedObject,CompanyJPA.class);
		DomainObject domainObject = loadObject(persistedObject, CompanyObject.class);

		loadChildren(domainObject,getLiveCycle(), "CountryObject", CountryJPA.class);		
		return domainObject;
	}	
	

	@Override
	public void save(Object object) throws Exception {
        check(object,CompanyObject.class);
        CompanyObject domainObject = (CompanyObject) object;
        
		saveObject(domainObject,CompanyJPA.class);
		saveChildren(domainObject, getLiveCycle(), domainObject.getCountryObject(), CountryJPA.class,CountryObject.class);

	}
	
	@Override
	public void remove(Object object) throws Exception {
        check(object,CompanyObject.class);
        CompanyObject domainObject = (CompanyObject) object;

	   	@SuppressWarnings("rawtypes")
		List list = findChildren(domainObject, CountryJPA.class);
 
    	if (list.size() != 0 ){
			for (Object obj : list){
				CountryObject dObject = new CountryObject();
				dObject.setObjId(((PersistenceObject)obj).getObjId());
				getLiveCycle().remove(dObject);
			}
	    }		
    	
		PersistenceObject persistedObject =  findObjectByDomainObject(domainObject, CompanyJPA.class);		
		if (persistedObject != null)
		getService().remove(persistedObject);
	}
	
}
