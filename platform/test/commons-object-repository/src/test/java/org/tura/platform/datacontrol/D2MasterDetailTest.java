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

import objects.test.serialazable.jpa.Department2;
import objects.test.serialazable.jpa.Employee2;

public class D2MasterDetailTest extends AbstractMasterDetail{

	@BeforeClass
	public static void beforeClass() throws Exception {
		AbstractMasterDetail.deparmentClass = Department2.class;
		AbstractMasterDetail.employeeClass = Employee2.class;
		AbstractMasterDetail.deparmentString = "Department2";
		AbstractMasterDetail.employeeString = "Employee2";
		AbstractMasterDetail.beforeClass();
	}
	
	
}