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

import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.elsoft.platform.hr.objects.EmployeesDAO;
import org.tura.platform.datacontrol.DataControl;

public interface Factory {
	
	public void initCommandStack();
	public DataControl<EmployeesDAO> initEmployees(String elPrefix) throws Exception;
	public DataControl<DepartmentsDAO> initDepartments(String elPrefix) throws Exception;
	public EntityManager getEntityManager();
	public EmployeesDAO getNewEmployeesDAO() throws Exception;
	public DepartmentsDAO getNewDepartmentsDAO() throws Exception;

}
