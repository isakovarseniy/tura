package org.tura.platform.tura.complex.domain.livecycle;

import java.util.List;

import org.elsoft.platform.hr.objects.complex.model.DepartmentsObject;
import org.elsoft.platform.hr.objects.complex.model.EmployeeObject;
import org.elsoft.platform.hr.objects.jpa.simple.model.DepartmentJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.EmployeeJPA;
import org.tura.platform.object.model.DomainObject;
import org.tura.platform.object.persistence.PersistenceObject;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.complex.domain.provider.ComplexObjectTuraProvider;
import org.tura.platform.tura.complex.domain.provider.ObjectLiveCycle;

public class DepartmentObjectLiveCycle extends ObjectLiveCycle{

	public DepartmentObjectLiveCycle(JPAService service) {
		super(service);
	}


	public ObjectLiveCycle getLiveCycle() {
		return ((ComplexObjectTuraProvider)getProvider()).getObjectLiveCycle(EmployeeObject.class.getName());
	}

	
	@Override
	public Object load(Object persistedObject) throws Exception {
        check(persistedObject,DepartmentJPA.class);
		DomainObject domainObject = loadObject(persistedObject, DepartmentsObject.class);

		loadChildren(domainObject,getLiveCycle(), "EmployeeObject", EmployeeJPA.class);		
		return domainObject;
	}	
	

	@Override
	public void save(Object object) throws Exception {
        check(object,DepartmentsObject.class);
        DepartmentsObject domainObject = (DepartmentsObject) object;
        
		saveObject(domainObject,DepartmentJPA.class);
		saveChildren(domainObject, getLiveCycle(), domainObject.getEmployeeObject(), EmployeeJPA.class,EmployeeObject.class);

	}
	
	@Override
	public void remove(Object object) throws Exception {
        check(object,DepartmentsObject.class);
        DepartmentsObject domainObject = (DepartmentsObject) object;

	   	@SuppressWarnings("rawtypes")
		List list = findChildren(domainObject, EmployeeJPA.class);
 
    	if (list.size() != 0 ){
			for (Object obj : list){
				EmployeeObject dObject = new EmployeeObject();
				dObject.setObjId(((PersistenceObject)obj).getObjId());
				getLiveCycle().remove(dObject);
			}
	    }		
    	
		PersistenceObject persistedObject =  findObjectByDomainObject(domainObject, DepartmentJPA.class);		
		if (persistedObject != null)
		getService().remove(persistedObject);
	}
	
}
