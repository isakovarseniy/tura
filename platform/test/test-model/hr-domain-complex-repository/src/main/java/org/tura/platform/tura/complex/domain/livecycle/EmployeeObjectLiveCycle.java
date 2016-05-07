package org.tura.platform.tura.complex.domain.livecycle;

import java.util.List;

import org.elsoft.platform.hr.objects.complex.model.EmployeeObject;
import org.elsoft.platform.hr.objects.complex.model.FileObject;
import org.elsoft.platform.hr.objects.complex.model.VehicleObject;
import org.elsoft.platform.hr.objects.jpa.simple.model.EmployeeJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.FileJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.VehicleJPA;
import org.tura.platform.object.model.DomainObject;
import org.tura.platform.object.persistence.PersistenceObject;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.complex.domain.provider.ComplexObjectTuraProvider;
import org.tura.platform.tura.complex.domain.provider.ObjectLiveCycle;

public class EmployeeObjectLiveCycle extends  ObjectLiveCycle {

	
	public EmployeeObjectLiveCycle(JPAService service) {
		super(service);
	}


	public ObjectLiveCycle getFileObjecLiveCycle() {
		return ((ComplexObjectTuraProvider)getProvider()).getObjectLiveCycle(FileObject.class.getName());
	}


	public ObjectLiveCycle getVehicleObjectLiveCycle() {
		return ((ComplexObjectTuraProvider)getProvider()).getObjectLiveCycle(VehicleObject.class.getName());
	}


	@Override
	public Object load(Object persistedObject) throws Exception {
        check(persistedObject,EmployeeJPA.class);
 		DomainObject domainObject = loadObject(persistedObject, EmployeeObject.class);

		loadChildren(domainObject,getFileObjecLiveCycle(), "fileObject", FileJPA.class);		
		
		loadChildren(domainObject,getVehicleObjectLiveCycle(), "vehicleObject", VehicleJPA.class);		
		
		return domainObject;
	}	
	

	@Override
	public void save(Object object) throws Exception {
        check(object,EmployeeObject.class);
        EmployeeObject domainObject = (EmployeeObject) object;
		saveObject(domainObject,EmployeeJPA.class);

		saveChildren(domainObject, getFileObjecLiveCycle(), domainObject.getFileObject(), FileJPA.class,FileObject.class);

		saveChildren(domainObject, getVehicleObjectLiveCycle(), domainObject.getVehicleObject(), VehicleJPA.class,VehicleObject.class);
	
	}

	@Override
	public void remove(Object object) throws Exception {
        check(object,EmployeeObject.class);
        EmployeeObject domainObject = (EmployeeObject) object;

	   	@SuppressWarnings("rawtypes")
		List list = findChildren(domainObject, FileJPA.class);
 
    	if (list.size() != 0 ){
			for (Object obj : list){
				FileObject dObject = new FileObject();
				dObject.setObjId(((PersistenceObject)obj).getObjId());
				getFileObjecLiveCycle().remove(dObject);
			}
	    }		

		list = findChildren(domainObject, VehicleJPA.class);
 
    	if (list.size() != 0 ){
			for (Object obj : list){
				VehicleObject dObject = new VehicleObject();
				dObject.setObjId(((PersistenceObject)obj).getObjId());
				getVehicleObjectLiveCycle().remove(dObject);
			}
	    }		
    	
		PersistenceObject persistedObject =  findObjectByDomainObject(domainObject, EmployeeJPA.class);		
		if (persistedObject != null)
		   getService().remove(persistedObject);
	}
	
	
}
