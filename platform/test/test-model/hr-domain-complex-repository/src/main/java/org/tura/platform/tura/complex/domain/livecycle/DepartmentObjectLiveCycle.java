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
