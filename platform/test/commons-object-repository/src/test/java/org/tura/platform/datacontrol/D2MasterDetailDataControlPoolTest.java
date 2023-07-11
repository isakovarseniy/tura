/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.datacontrol;

import org.junit.BeforeClass;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;

import objects.test.serialazable.jpa.Department2;
import objects.test.serialazable.jpa.Employee2;


public class D2MasterDetailDataControlPoolTest extends AbstractMasterDetailDataControlPool{

	
	@BeforeClass
	public static void beforeClass() throws Exception {
		AbstractMasterDetailDataControlPool.deparmentClass = Department2.class;
		AbstractMasterDetailDataControlPool.employeeClass = Employee2.class;
		AbstractMasterDetailDataControlPool.deparmentString = "Department2";
		AbstractMasterDetailDataControlPool.employeeString = "Employee2";
		AbstractMasterDetailDataControlPool.beforeClass();
	}	
	
	@Override
	protected void setParent(DepartmentType dep, EmployeeType newrow,CpaRepository repository) {
		Department2 d = (Department2) dep;
		Employee2  e =   (Employee2) newrow;
		d.getEmployee2().add(e);
	}
	
	
}
