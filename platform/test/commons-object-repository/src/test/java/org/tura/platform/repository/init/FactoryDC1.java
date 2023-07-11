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

package org.tura.platform.repository.init;

import java.util.List;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.base.CreateObjectParameters;
import org.tura.platform.datacontrol.command.base.SearchObjectParameters;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.datacontrol.metainfo.Relation;

import objects.test.serialazable.jpa.Department1;
import objects.test.serialazable.jpa.Employee1;
import objects.test.serialazable.jpa.pager.Department1Pager;
import objects.test.serialazable.jpa.pager.Employee1Pager;

public class FactoryDC1 {

	private ELResolver elResolver;
	
	
	public  FactoryDC1(ELResolver elResolver) {
		this.elResolver = elResolver;
	}

	@SuppressWarnings({  "rawtypes" })
	public DataControl initEmployees(String elPrefix) throws Exception {
		EmployeesDC<Employee1> employeesDS = new EmployeesDC<Employee1>();
		Employee1Pager pager = new Employee1Pager(employeesDS);
		pager.setRepository(Factory.getRepository());
		pager.addCpaStorageEventListenetr();

		employeesDS.setElResolver(elResolver);
		employeesDS.getKeys().add("objId");
		employeesDS.setBaseClass(Employee1.class);
		
		createCreateCommand(employeesDS, elPrefix + "employees", Employee1.class);
		createSearchCommand(employeesDS, elPrefix + "employees", Employee1.class);

		return employeesDS;
	}

	@SuppressWarnings({ "rawtypes" })
	public DataControl initDepartments(String elPrefix) throws Exception {
		DepartmentsDC<Department1> departmentsDS = new DepartmentsDC<Department1>();
		Department1Pager pager = new Department1Pager(departmentsDS);
		pager.setRepository(Factory.getRepository());
		pager.addCommandStackListener();
		pager.addCpaStorageEventListenetr();

		departmentsDS.setElResolver(elResolver);
		departmentsDS.getKeys().add("objId");
		departmentsDS.setBaseClass(Department1.class);

		createCreateCommand(departmentsDS, elPrefix + "departments", Department1.class);
		createSearchCommand(departmentsDS, elPrefix + "departments", Department1.class);

		
		return departmentsDS;
	}

	void createCreateCommand(DataControl<?> control, String expr, Class<?> clazz) {

		CallParameter prm = new CallParameter();
		prm.setName("obj");
		prm.setClazz(String.class);
		prm.setValue(clazz.getName());

		CreateObjectParameters createObjectParameters = new CreateObjectParameters();
		createObjectParameters.setObjectType(prm);

		control.setCreateObjectParameters(createObjectParameters);
	}


	void createSearchCommand(DataControl<?> control, String expr, Class<?> clazz) {

		SearchObjectParameters searchObjectParameters = new SearchObjectParameters();

		CallParameter prm = new CallParameter();
		prm.setName("searchCriteria");
		prm.setClazz(List.class);
		prm.setExpression("#{" + expr + ".searchCriteria" + "}");
		searchObjectParameters.setSearchCriteria(prm);

		prm = new CallParameter();
		prm.setName("orderCriteria");
		prm.setClazz(List.class);
		prm.setExpression("#{" + expr + ".orderCriteria" + "}");
		searchObjectParameters.setOrderByCriteria(prm);

		prm = new CallParameter();
		prm.setName("startIndex");
		prm.setClazz(Integer.class);
		prm.setExpression("#{" + expr + ".startIndex" + "}");
		searchObjectParameters.setStartIndex(prm);

		prm = new CallParameter();
		prm.setName("endIndex");
		prm.setClazz(Integer.class);
		prm.setExpression("#{" + expr + ".endIndex" + "}");
		searchObjectParameters.setEndIndex(prm);

		prm = new CallParameter();
		prm.setName("objectType");
		prm.setClazz(String.class);
		prm.setValue(clazz.getName());
		searchObjectParameters.setObjectType(prm);

		control.setSearchObjectParameters(searchObjectParameters);

	}

	@SuppressWarnings("rawtypes")
	public void setRelatioin(DataControl ddc, DataControl edc) throws TuraException {
		Relation relation = new Relation();
		relation.setParent(ddc);
		relation.setChild(edc);
		PropertyLink link = new PropertyLink("objId", "parentId");
		relation.getLinks().add(link);

		ddc.addChildren("departmentsToemployees", relation);

	}

}
