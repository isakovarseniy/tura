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
package org.tura.platform.test;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.elsoft.platform.hr.objects.complex.model.CityObject;
import org.elsoft.platform.hr.objects.complex.model.CompanyObject;
import org.elsoft.platform.hr.objects.complex.model.CountryObject;
import org.elsoft.platform.hr.objects.complex.model.DepartmentsObject;
import org.elsoft.platform.hr.objects.complex.model.EmployeeObject;
import org.elsoft.platform.hr.objects.complex.model.FileObject;
import org.elsoft.platform.hr.objects.complex.model.StateObject;
import org.elsoft.platform.hr.objects.complex.model.StreetObject;
import org.elsoft.platform.hr.objects.complex.model.VehicleObject;
import org.tura.platform.repository.ObjectProvider;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.complex.domain.livecycle.CityObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.CompanyObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.CountryObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.DepartmentObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.EmployeeObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.FileObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.StateObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.StreetObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.VehicleObjectLiveCycle;
import org.tura.platform.tura.complex.domain.provider.ComplexObjectTuraProvider;

@ObjectProvider
public class ComplexProviderProvider extends ComplexObjectTuraProvider{

	   @Inject
		private JPAService service;

	   @PostConstruct
	   public void init(){
		   this.setService(service);
		   this.setObjectLiveCycle(CompanyObject.class.getName(), new CompanyObjectLiveCycle(service));
		   this.setObjectLiveCycle(CountryObject.class.getName(), new CountryObjectLiveCycle(service));
		   this.setObjectLiveCycle(StateObject.class.getName(), new StateObjectLiveCycle(service));
		   this.setObjectLiveCycle(CityObject.class.getName(), new CityObjectLiveCycle(service));
		   this.setObjectLiveCycle(StreetObject.class.getName(), new StreetObjectLiveCycle(service));
		   this.setObjectLiveCycle(DepartmentsObject.class.getName(), new DepartmentObjectLiveCycle(service));
		   this.setObjectLiveCycle(EmployeeObject.class.getName(), new EmployeeObjectLiveCycle(service));
		   this.setObjectLiveCycle(FileObject.class.getName(), new FileObjectLiveCycle(service));
		   this.setObjectLiveCycle(VehicleObject.class.getName(), new VehicleObjectLiveCycle(service));
	   }
	
	
}
