/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
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
