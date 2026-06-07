/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.repository.test.init.jpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import org.h2.tools.Server;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaRepositoryProvider;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.init.ELResolverImpl;
import org.tura.platform.repository.init.RepositoryProducer;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.init.UUIPrimaryKeyStrategy;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;

public class H2StorageProvider implements StorageProvider {

	private Server server;
	private CpaRepository repository;
	private RepositoryProducer repositoryProducer = new RepositoryProducer();
	private ELResolver elResolver = new ELResolverImpl();
	protected  Map<Long, Long> departmentConverter = new HashMap<>();
	protected Map<Long, Long> employeeConverter = new HashMap<>();
	

	@Override
	public void startServer() throws Exception {
		server = Server.createTcpServer().start();
	}

	@Override
	public void stopServer() {
		server.stop();
	}

	@Override
	public void initSession() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository");
		repositoryProducer.em = emf.createEntityManager();
	}

	@Override
	public void initData(String name, Object... params) throws Exception {
		if ("InitDB0".equals(name)) {
			if (params.length > 0) {
				String deparmentString = (String) params[0];
				initDB(deparmentString, repositoryProducer.em);
			}
			if (params.length == 2) {
				String employeeString = (String) params[1];
				initDB(employeeString, repositoryProducer.em);
			}
		}
		if ("initDb1".equals(name)) {
			initDb1();
		}		
		if ("initDb2".equals(name)) {
			initDb2();
		}			
		if ("initDb3".equals(name)) {
			initDb3();
		}			
		if ("initDb4".equals(name)) {
			initDb4();
		}			
	}

	private void initDB(String initializer, EntityManager em) throws Exception {

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

	
	private  void initDb1() {
		org.tura.jpa.test.One2One1A a1 = new org.tura.jpa.test.One2One1A();
		org.tura.jpa.test.One2One1B b1 = new org.tura.jpa.test.One2One1B();
		a1.setOne2One1B(b1);
		b1.setOne2One1A(a1);
		this.persist(b1);
		this.persist(a1);
//		repositoryProducer.em.flush();
		
	}	
	
	
	private  void initDb2() {

		org.tura.jpa.test.Many2Many1A a1 = new org.tura.jpa.test.Many2Many1A();
		a1.setMany2Many1B(new ArrayList<>());

		org.tura.jpa.test.Many2Many1B b1 = new org.tura.jpa.test.Many2Many1B();
		a1.getMany2Many1B().add(b1);
		b1.setMany2Many1A(new ArrayList<>());
		b1.getMany2Many1A().add(a1);

		this.persist(b1);
		this.persist(a1);

		b1 = new org.tura.jpa.test.Many2Many1B();
		a1.getMany2Many1B().add(b1);
		b1.setMany2Many1A(new ArrayList<>());
		b1.getMany2Many1A().add(a1);

		this.persist(b1);
		this.persist(a1);

		a1 = new org.tura.jpa.test.Many2Many1A();
		a1.setMany2Many1B(new ArrayList<>());

		b1 = new org.tura.jpa.test.Many2Many1B();
		a1.getMany2Many1B().add(b1);
		b1.setMany2Many1A(new ArrayList<>());
		b1.getMany2Many1A().add(a1);

		this.persist(b1);
		this.persist(a1);

		b1 = new org.tura.jpa.test.Many2Many1B();
		a1.getMany2Many1B().add(b1);
		b1.setMany2Many1A(new ArrayList<>());
		b1.getMany2Many1A().add(a1);

		this.persist(b1);
		this.persist(a1);
		
//		repositoryProducer.em.flush();

	}
	
	
	private  void initDb3() {
		
		org.tura.jpa.test.One2Many1A a1 = new org.tura.jpa.test.One2Many1A();
		a1.setOne2Many1B(new ArrayList<>());
		
		org.tura.jpa.test.One2Many1B b1 = new org.tura.jpa.test.One2Many1B();
		a1.getOne2Many1B().add(b1);
		b1.setOne2Many1A(a1);
		
		this.persist(b1);
		this.persist(a1);
		
		b1 = new org.tura.jpa.test.One2Many1B();
		a1.getOne2Many1B().add(b1);
		b1.setOne2Many1A(a1);
		
		this.persist(b1);
		this.persist(a1);
		
//		repositoryProducer.em.flush();
		
	}	
	
	
	private  void initDb4() {

		org.tura.jpa.test.Client client = new org.tura.jpa.test.Client();
		client.setName("Cleint 1");
		
		 org.tura.jpa.test.Person person = new org.tura.jpa.test.Person();
	     person.setName("Jon Jonson");
	     client.setPerson(person);
	     person.setClient(client);

	     
	     org.tura.jpa.test.MailAddress mail = new org.tura.jpa.test.MailAddress();
	     mail.setAddress("qwerty@gmail.com");
	     ArrayList<org.tura.jpa.test.Person> array = new ArrayList<>();
	     array.add(person);
	     mail.setPerson(array);

	     
	     org.tura.jpa.test.Phone phone = new org.tura.jpa.test.Phone();
	     phone.setPhone("111-111-1111");
	     phone.setPerson(person);
	     person.setPhone(new ArrayList<org.tura.jpa.test.Phone>());
	     person.getPhone().add(phone);
		
		 
	     this.persist(client);
	     this.persist(person);
	     this.persist(mail);
	     this.persist(phone);
		 
		 
//		repositoryProducer.em.flush();

	}
	
	
	public CpaRepositoryProvider getCpaRepositoryProvider() throws Exception {
		return new CpaRepositoryProvider() {
			private static final long serialVersionUID = 1L;

			@Override
			public CpaRepository get() {
				try {
					return getExistingRepository();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		};
	}

	public CpaRepository getRepository() throws Exception {
		Repository transport = repositoryProducer.getJpaRepository();
		repository = repositoryProducer.getProxyRepository(transport);
		return repository;
	}

	public CpaRepository getMetamodelRepository() throws Exception {
		Repository transport = repositoryProducer.getMetamodelRepository();
		CpaRepository repository = repositoryProducer.getProxyRepository(transport);
		return repository;
	}

	public CpaRepository getMixRepository() throws Exception {
		Repository transport = repositoryProducer.getMixRepository();
		CpaRepository repository = repositoryProducer.getProxyRepository(transport);
		return repository;
	}

	public CpaRepository getSpaRepository() throws Exception {
		Repository transport = repositoryProducer.getSpaRepository();
		CpaRepository repository = repositoryProducer.getProxyRepository(transport);
		return repository;
	}

	
	
	public CpaRepository getExistingRepository() throws Exception {
		if (repository == null) {
			Repository transport = repositoryProducer.getJpaRepository();
			repository = repositoryProducer.getProxyRepository(transport);
		}
		return repository;
	}

	public CpaStorageProvider getCpaStorageProvider() throws Exception {
		return repositoryProducer.cpaStorageProvider;
	}

	public Registry getRegistry() throws Exception {
		return repositoryProducer.registry;
	}

	public void clearSession() throws Exception {
		repositoryProducer.em.clear();
		;
	}

	public void setRelatioin(DataControl<?> ddc, DataControl<?> edc) throws TuraException {
		Relation relation = new Relation();
		relation.setParent(ddc);
		relation.setChild(edc);
		PropertyLink link = new PropertyLink("objId", "parentId");
		relation.getLinks().add(link);

		ddc.addChildren("departmentsToemployees", relation);

	}

	@Override
	public void startTransaction() throws Exception {
		repositoryProducer.em.getTransaction().begin();

	}

	@Override
	public void commitTransaction() throws Exception {
		repositoryProducer.em.getTransaction().commit();
	}

	@Override
	public void clean() {
		repository = null;
	}

	@Override
	public Object getSession() throws Exception {
		return repositoryProducer.em;
	}

	@SuppressWarnings("unchecked")
	public DataControl<DepartmentType> initDepartments(String elPrefix, String initializer) throws Exception {
		switch (initializer) {
		case "Department1":
			return new FactoryDC1(elResolver).initDepartments(elPrefix,this);
		case "Department2":
			return new FactoryDC2(elResolver).initDepartments(elPrefix,this);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public DataControl<EmployeeType> initEmployees(String elPrefix, String initializer) throws Exception {
		switch (initializer) {
		case "Employee1":
			return new FactoryDC1(elResolver).initEmployees(elPrefix,this);
		case "Employee2":
			return new FactoryDC2(elResolver).initEmployees(elPrefix,this);
		}
		return null;
	}	

	public Long cDept(Long id) {
		return departmentConverter.get(id);
	}

	public Long cEmp(Long id) {
		return employeeConverter.get(id);
	}

	@Override
	public void setSequence(long seq) {
		UUIPrimaryKeyStrategy.sequence  = seq;
		
	}
	

	@Override
	public void persist(Object obj) {
		repositoryProducer.em.persist(obj);
	}

	@Override
	public void beforeSuite() {
		
	}

	@Override
	public void afterSuite() {
		
	}
	
	
}
