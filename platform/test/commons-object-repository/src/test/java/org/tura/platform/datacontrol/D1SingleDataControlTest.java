/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.tura.platform.test.hr.model.DepartmentType;

import objects.test.serialazable.jpa.Department1;
import objects.test.serialazable.jpa.Employee1;

public class D1SingleDataControlTest extends AbstractSingleDataControl{

	@BeforeClass
	public static void beforeClass() throws Exception {
		AbstractSingleDataControl.deparmentClass = Department1.class;
		AbstractSingleDataControl.employeeClass = Employee1.class;
		AbstractSingleDataControl.deparmentString = "Department1";
		AbstractSingleDataControl.employeeString = "Employee1";
		AbstractSingleDataControl.beforeClass();
	}

	@Override
	protected void setPreDeleteTrigger(DataControl<DepartmentType> dc) {
		
	}
	
}
