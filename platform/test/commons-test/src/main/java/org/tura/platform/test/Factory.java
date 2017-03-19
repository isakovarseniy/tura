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

import javax.persistence.EntityManager;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.hr.objects.jpa.Department;
import org.tura.platform.hr.objects.jpa.Employee;

public interface Factory {
	
	public void initCommandStack();
	public DataControl<Object> initEmployees(String elPrefix) throws Exception;
	public DataControl<Object> initDepartments(String elPrefix) throws Exception;
	public EntityManager getEntityManager();
	public Employee getNewEmployee() throws Exception;
	public Department getNewDepartment() throws Exception;

	public  Employee adaptEmployee(Object obj) throws Exception;
	public  Department adaptDepartment(Object obj) throws Exception;
	

	
}
