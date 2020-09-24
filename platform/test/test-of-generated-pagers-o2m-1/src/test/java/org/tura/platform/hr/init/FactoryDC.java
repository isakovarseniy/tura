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

package org.tura.platform.hr.init;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;
import org.tura.jpa.test.repo.InitJPARepository;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.datacontrol.command.base.CreateObjectParameters;
import org.tura.platform.datacontrol.command.base.SearchObjectParameters;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
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
import org.tura.platform.repository.spa.test.SearchService;
import org.tura.platform.repository.spa.test.TestServiceInstantiator;
import org.tura.platform.test.Factory;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;
import org.tura.spa.test.repo.InitSPARepository;

import objects.test.serialazable.jpa.Department1;
import objects.test.serialazable.jpa.Department1Proxy;
import objects.test.serialazable.jpa.Employee1;
import objects.test.serialazable.jpa.Employee1Proxy;
import objects.test.serialazable.jpa.IndepObject1;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.ProxyRepositoryInstantiator;
import objects.test.serialazable.jpa.SPAObject1;
import objects.test.serialazable.jpa.pager.Department1Pager;
import objects.test.serialazable.jpa.pager.Employee1Pager;

public class FactoryDC implements Factory {

	private ELResolver elResolver;
	private EntityManager em;
	private CommandStack sc;
	private Repository repository;
	private Registry registry;
	private SpaObjectRegistry spaRegistry;
	private Map<Long,Long> departmentConverter = new HashMap<>();
	private Map<Long,Long> employeeConverter = new HashMap<>();
	

	private EntityManagerProvider emProvider = new EntityManagerProvider() {

		@Override
		public EntityManager getEntityManager() {
			return em;
		}

		@Override
		public void destroyEntityManager() {

		}
	};

	public FactoryDC(String unit) throws Exception {
		SpaRepository.SPA_REPOSITORY_DATA_THREAD_LOCAL.get() .set(null);
		registry = new Registry();
		spaRegistry = new SpaObjectRegistry();

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(unit, config.getProperties());
		em = emf.createEntityManager();

		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		repository = new BasicRepository(registry);

		InitJPARepository init = new InitJPARepository(registry, spaRegistry);
		init.initClassMapping();
		init.initFeldsMapping();
		init.initCommandProducer();
		init.initProvider();
		init.initEntityManagerProvider(emProvider);

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));
		registry.addInstantiator(new ProxyRepositoryInstantiator());

		InitSPARepository initSpa = new InitSPARepository(registry,spaRegistry);
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();
		
		spaRegistry.getRegistry("test-spa-repository").addInstantiator(new TestServiceInstantiator(registry, spaRegistry,"test-spa-repository"));
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject1.class,  SearchService.class);
		
		
		
		sc = new CommandStack();
		elResolver = new ELResolverImpl();

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DataControl initEmployees(String elPrefix) throws Exception {
		EmployeesDC<Employee1> employeesDS = new EmployeesDC<Employee1>();
		Employee1Pager<Employee1> pager = new Employee1Pager<Employee1>(employeesDS);
		pager.setCommandStack(sc);

		CommandStackProvider sp = new CommandStackProvider();
		sp.setDataControl(employeesDS);
		sp.setCommandStack(sc);

		ProxyRepository proxyRepository = new ProxyRepository(repository, sp);
		pager.setRepository(proxyRepository);

		employeesDS.setElResolver(elResolver);
		employeesDS.getKeys().add("objId");
		employeesDS.setCommandStack(sc);
		employeesDS.setBaseClass(Employee1.class);
		employeesDS.setPrimaryKeyFields(Employee1Proxy.getPrimaryKeyFields());
		
		sc.getPoolFlushAware().add(employeesDS);
		createCreateCommand(employeesDS, elPrefix + "employees", Employee1.class);
		createSearchCommand(employeesDS, elPrefix + "employees", Employee1.class);

		// createQuery(employeesDS, EmployeesDAO.class.getCanonicalName());

		return employeesDS;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DataControl initDepartments(String elPrefix) throws Exception {
		DepartmentsDC<Department1> departmentsDS = new DepartmentsDC<Department1>();
		Department1Pager<Department1> pager = new Department1Pager<Department1>(departmentsDS);
		pager.setCommandStack(sc);

		CommandStackProvider sp = new CommandStackProvider();
		sp.setDataControl(departmentsDS);
		sp.setCommandStack(sc);

		ProxyRepository proxyRepository = new ProxyRepository(repository, sp);
		pager.setRepository(proxyRepository);

		departmentsDS.setElResolver(elResolver);
		departmentsDS.getKeys().add("objId");
		departmentsDS.setCommandStack(sc);
		departmentsDS.setBaseClass(Department1.class);
		departmentsDS.setPrimaryKeyFields(Department1Proxy.getPrimaryKeyFields());
		sc.getPoolFlushAware().add(departmentsDS);

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

	@SuppressWarnings({  "rawtypes" })
	public DataControl initSPAObject1(String elPrefix) throws Exception {
		IndepObjDC<SPAObject1> indepobjDS = new IndepObjDC<SPAObject1>();
		Department1Pager<SPAObject1> pager = new Department1Pager<SPAObject1>(indepobjDS);
		pager.setCommandStack(sc);

		CommandStackProvider sp = new CommandStackProvider();
		sp.setDataControl(indepobjDS);
		sp.setCommandStack(sc);

		ProxyRepository proxyRepository = new ProxyRepository(repository, sp);
		pager.setRepository(proxyRepository);

		indepobjDS.setElResolver(elResolver);
		indepobjDS.getKeys().add("objId");
		indepobjDS.setCommandStack(sc);
		indepobjDS.setBaseClass(IndepObject1.class);
		sc.getPoolFlushAware().add(indepobjDS);

		createCreateCommand(indepobjDS, elPrefix + "spaobject", SPAObject1.class);
		createSearchCommand(indepobjDS, elPrefix + "spaobject", SPAObject1.class);

		return indepobjDS;
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
		ProxyRepository proxyRepository = (ProxyRepository) getRepository();
		return (EmployeeType) proxyRepository.create(Employee1.class.getName());
	}

	@Override
	public DepartmentType getNewDepartmentType() throws Exception {
		CommandStackProvider sp = new CommandStackProvider();
		sp.setCommandStack(sc);
		ProxyRepository proxyRepository = (ProxyRepository) getRepository();
		return (DepartmentType) proxyRepository.create(Department1.class.getName());
	}

	@Override
	public Repository getRepository() {
		CommandStackProvider sp = new CommandStackProvider();
		sp.setCommandStack(sc);
		ProxyRepository proxyRepository = new ProxyRepository(repository, sp);
		return proxyRepository;
	}

	@Override
	public void initDB(String initializer, EntityManager em) throws Exception {

		switch (initializer) {
		case "Departments":
			new DepartmentsInit(em,departmentConverter).init();
			break;
		case "Employes":
			new EmployesesInit(em,departmentConverter,employeeConverter).init();
			break;
		}
	}

	@Override
	public void clean() {
		sc = new CommandStack();

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void setRelatioin(DataControl ddc, DataControl edc) throws TuraException {
		Relation relation = new Relation();
		relation.setParent(ddc);
		relation.setChild(edc);
		PropertyLink link = new PropertyLink("objId", "parentId");
		relation.getLinks().add(link);

		ddc.addChildren("departmentsToemployees", relation);

	}

	@Override
	public Long cDept(Long id) {
		return departmentConverter.get(id);
	}

	@Override
	public Long cEmp(Long id) {
		return employeeConverter.get(id);
	}

}
