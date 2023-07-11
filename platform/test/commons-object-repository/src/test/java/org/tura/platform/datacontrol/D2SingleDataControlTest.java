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
import org.tura.platform.datacontrol.command.base.PreDeleteTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.test.suite.DataControlTestSuite;
import org.tura.platform.test.hr.model.DepartmentType;

import objects.test.serialazable.jpa.Department2;
import objects.test.serialazable.jpa.Employee2;

public class D2SingleDataControlTest extends  AbstractSingleDataControl{

	@BeforeClass
	public static void beforeClass() throws Exception {
		AbstractSingleDataControl.deparmentClass = Department2.class;
		AbstractSingleDataControl.employeeClass = Employee2.class;
		AbstractSingleDataControl.deparmentString = "Department2";
		AbstractSingleDataControl.employeeString = "Employee2";
		AbstractSingleDataControl.beforeClass();
	}

	@Override
	protected void setPreDeleteTrigger(DataControl<DepartmentType> dc) {
		if ( DataControlTestSuite.isLazyObjectRepository()) {
			dc.setPreDeleteTrigger(new DepartmentPreDeleteTrigger());
		}
	}
	
	class DepartmentPreDeleteTrigger implements  PreDeleteTrigger{

		private static final long serialVersionUID = 1L;

		@Override
		public void execute(IDataControl dc, Object obj) throws TuraException {
			((Department2)obj).getEmployee2().get(0);
		}
		
	}
	
	
}
