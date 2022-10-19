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

package org.tura.platform.repository.init;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.repository.RepositoryProducer;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;

public class Factory {

	private Map<Long, Long> departmentConverter = new HashMap<>();
	private Map<Long, Long> employeeConverter = new HashMap<>();
	public static RepositoryProducer repositoryProducer = new RepositoryProducer();
	private static CpaRepository repository;
	private  ELResolver elResolver = new ELResolverImpl();


	public void initDB(String initializer, EntityManager em) throws Exception {

		switch (initializer) {
		case "Department1":
			new Departments1Init(em, departmentConverter).init();
			break;
		case "Employee1":
			new Employeses1Init(em, departmentConverter, employeeConverter).init();
			break;
		case "Department2":
			new Departments2Init(em, departmentConverter).init();
			break;
		case "Employee2":
			new Employeses2Init(em, departmentConverter, employeeConverter).init();
			break;
		}

	}
	
	
	public void setRelatioin(DataControl<DepartmentType> ddc, DataControl<EmployeeType> edc) throws TuraException {
		Relation relation = new Relation();
		relation.setParent(ddc);
		relation.setChild(edc);
		PropertyLink link = new PropertyLink("objId", "parentId");
		relation.getLinks().add(link);

		ddc.addChildren("departmentsToemployees", relation);

	}	

	public Long cDept(Long id) {
		return departmentConverter.get(id);
	}

	public Long cEmp(Long id) {
		return employeeConverter.get(id);
	}

	public EntityManager getEntityManager() {
		return repositoryProducer.em;
	}

	
	public static RepositoryProducer getRepositoryProducer() {
		return repositoryProducer;
	}

	public static CpaRepository getRepository() throws Exception {
		if ( repository == null) {
			Repository transport = repositoryProducer.getJpaRepository();
			repository = repositoryProducer.getProxyRepository(transport);
		}
		return repository;
	}


	public  static  CpaStorageProvider getStorageProvider() throws Exception {
		return getRepository().getStorageProvider();
	}
	
	@SuppressWarnings("unchecked")
	public DataControl<DepartmentType> initDepartments(String elPrefix, String initializer) throws Exception {
		switch (initializer) {
		case "Department1":
			return new FactoryDC1(elResolver).initDepartments(elPrefix);
		case "Department2":
			return  new FactoryDC2(elResolver).initDepartments(elPrefix);
		}
		return null;
	}

	
	@SuppressWarnings("unchecked")
	public DataControl<EmployeeType> initEmployees(String elPrefix, String initializer) throws Exception {
		switch (initializer) {
		case "Employee1":
			return new FactoryDC1(elResolver).initEmployees(elPrefix);
		case "Employee2":
			return  new FactoryDC2(elResolver).initEmployees(elPrefix);
		}
		return null;
	}
	
	
	
	public void clean() throws  Exception {
		repository = null;
	}
	
	
	
	
}
