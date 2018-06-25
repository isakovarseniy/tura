/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
package org.tura.platform.hr.init;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.datacontrol.command.base.CreateObjectParameters;
import org.tura.platform.datacontrol.command.base.SearchObjectParameters;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.hr.controls.DepartmentsDC;
import org.tura.platform.hr.controls.EmployeesDC;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.platform.test.Factory;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;

import objects.test.serialazable.jpa.Department2;
import objects.test.serialazable.jpa.Employee2;
import objects.test.serialazable.jpa.InitJPARepository;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.pager.Department22Employee2Pager;
import objects.test.serialazable.jpa.pager.Department2Pager;;

public class FactoryDC implements Factory {

	private ELResolver elResolver;
	private EntityManager em;
	private CommandStack sc;
	private Repository repository ;
	private Registry registry = new Registry();
	private SpaObjectRegistry spaRegistry = new SpaObjectRegistry();
	private  EntityManagerProvider emProvider = new EntityManagerProvider(){

		@Override
		public EntityManager getEntityManager() {
			return em;
		}

		@Override
		public void destroyEntityManager() {
			
		}
	};

	public FactoryDC(String unit) throws Exception {

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(unit, config.getProperties());
		em = emf.createEntityManager();

		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		repository = new BasicRepository(registry);

		InitJPARepository init = new InitJPARepository(new SpaRepository(),registry, spaRegistry);
		init.initClassMapping();
		init.initCommandProducer();
		init.initProvider();
		init.initEntityManagerProvider(emProvider);

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em,registry));
		
		sc = new CommandStack();
		elResolver = new ELResolverImpl();
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DataControl initEmployees(String elPrefix) throws Exception {
		EmployeesDC<Employee2> employeesDS = new EmployeesDC<Employee2>();
		Department22Employee2Pager<Employee2> pager =new Department22Employee2Pager<Employee2>(employeesDS);
		pager.setCommandStack(sc);

		CommandStackProvider sp = new CommandStackProvider();
		sp.setDataControl(employeesDS);
		sp.setCommandStack(sc);
		
		ProxyRepository proxyRepository =   new ProxyRepository(repository,sp);
		pager.setRepository(proxyRepository);
		
		employeesDS.setElResolver(elResolver);
		employeesDS.getKeys().add("objId");
		employeesDS.setCommandStack(sc);
		employeesDS.setBaseClass(Employee2.class);
		sc.getPoolFlushAware().add(employeesDS);
		createCreateCommand(employeesDS, elPrefix + "employees", Employee2.class);
		createSearchCommand(employeesDS, elPrefix + "employees", Employee2.class);

		// createQuery(employeesDS, EmployeesDAO.class.getCanonicalName());

		return employeesDS;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DataControl initDepartments(String elPrefix) throws Exception {
		DepartmentsDC<Department2> departmentsDS = new DepartmentsDC<Department2>();
		Department2Pager<Department2> pager =new Department2Pager<Department2>(departmentsDS);
		pager.setCommandStack(sc);
		
		
		CommandStackProvider sp = new CommandStackProvider();
		sp.setDataControl(departmentsDS);
		sp.setCommandStack(sc);
		
		ProxyRepository proxyRepository =   new ProxyRepository(repository,sp);
		pager.setRepository(proxyRepository);

		departmentsDS.setElResolver(elResolver);
		departmentsDS.getKeys().add("objId");
		departmentsDS.setCommandStack(sc);
		departmentsDS.setBaseClass(Department2.class);
		sc.getPoolFlushAware().add(departmentsDS);

		createCreateCommand(departmentsDS, elPrefix + "departments", Department2.class);
		createSearchCommand(departmentsDS, elPrefix + "departments", Department2.class);

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

	public EntityManager getEntityManager() {
		return em;
	}

	@Override
	public EmployeeType getNewEmployeeType() throws Exception {
		ProxyRepository proxyRepository =   (ProxyRepository) getRepository();
		return (EmployeeType) proxyRepository.create(Employee2.class.getName());
	}

	@Override
	public DepartmentType getNewDepartmentType() throws Exception {
		CommandStackProvider sp = new CommandStackProvider();
		sp.setCommandStack(sc);
		ProxyRepository proxyRepository =   (ProxyRepository) getRepository();
		return (DepartmentType) proxyRepository.create(Department2.class.getName());
	}




	@Override
	public Repository getRepository() {
		CommandStackProvider sp = new CommandStackProvider();
		sp.setCommandStack(sc);
		ProxyRepository proxyRepository =   new ProxyRepository(repository,sp);
		return proxyRepository;
	}


	@Override
	public void initDB(String initializer, EntityManager em) throws Exception {
		
		switch (initializer){
		case "Departments":  new DepartmentsInit(em).init(); break;
		case "Employes":       new EmployesesInit(em).init();   break;
		}
	}


	@SuppressWarnings("rawtypes")
	@Override
	public void setRelatioin(DataControl ddc, DataControl edc) throws TuraException {
		Relation relation = new Relation();
		relation.setParent(ddc);
		relation.setChild(edc);
		
		ddc.addChildren("departmentsToemployees", relation);
		
	}
	
	
	@Override
	public void clean() {
		sc = new CommandStack();
		
	}

}
