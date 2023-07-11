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

package org.tura.example.ui.hrmanager.testform2.triggers;

import java.util.Map;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.example.ui.hrmanager.testform2.datacontrol.EmployeeArtifitialFieldsAdapter;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.ArtificialFieldInterceptor;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.hr.objects.serialization.Employee;
import org.tura.platform.repository.core.ObjectControl;


@Alternative
@Priority(10)
@Selector("hrmanager.testform2")
@PostQuery("employee")
@PostCreate("employee")
@ArtificialFieldInterceptor("employee")
public class EmployeeTrigger implements PostQueryTrigger, OnChangeArtificialFieldTrigger,PostCreateTrigger{

	private static final long serialVersionUID = 1943591742427294912L;

	@Override
	public void execute(DataControl<?> datacontrol, Object obj)
			throws TuraException {
		Employee employee = (Employee) obj;
		EmployeeArtifitialFieldsAdapter af = new EmployeeArtifitialFieldsAdapter( (ObjectControl) obj);
		af.setNameArf(employee.getFirstName()+" "+employee.getLastName());
		
	}

	
	@Override
	public boolean onSet(Object obj, Map<String, Object> attributes, String field, Object value) throws TuraException {
		return true;
	}

	@Override
	public Object[] onGet(Object obj, Map<String, Object> attributes, String field) throws TuraException {
		return new Object[] { ((Employee) obj).getFirstName()+" "+ ((Employee) obj).getLastName()};
	}


	@Override
	public void execute(DataControl<?> datacontrol, Object obj, Map<String, Object> attributes) throws TuraException {
		((Employee) obj).setFirstName("NA");
		((Employee) obj).setLastName("NA");
	}

	
}