/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.test;

import javax.persistence.EntityManager;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;

public interface Factory {
	
	public Repository getRepository();
	public DataControl<EmployeeType> initEmployees(String elPrefix) throws Exception;
	public DataControl<DepartmentType> initDepartments(String elPrefix) throws Exception;
	public EntityManager getEntityManager();
	public EmployeeType getNewEmployeeType() throws Exception;
	public DepartmentType getNewDepartmentType() throws Exception;
	
	public void initDB(String initializer, EntityManager em) throws Exception;
	public void clean();
	@SuppressWarnings("rawtypes")
	public void setRelatioin(DataControl ddc,DataControl edc) throws TuraException;

}
