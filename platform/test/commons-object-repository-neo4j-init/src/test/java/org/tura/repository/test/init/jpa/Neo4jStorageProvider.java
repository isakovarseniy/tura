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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.connectors.BoltConnector;
import org.neo4j.configuration.connectors.HttpConnector;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseManagementServiceBuilder;
import org.neo4j.ogm.config.ClasspathConfigurationSource;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.neo4j.ogm.transaction.Transaction;
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

public class Neo4jStorageProvider implements StorageProvider {

	static private DatabaseManagementService managementService;
	static boolean localstart = false;
	private CpaRepository repository;
	private RepositoryProducer repositoryProducer = new RepositoryProducer();
	private ELResolver elResolver = new ELResolverImpl();
	protected Map<Long, Long> departmentConverter = new HashMap<>();
	protected Map<Long, Long> employeeConverter = new HashMap<>();
	private Transaction tx;

	@Override
	public void startServer() throws Exception {
		if ( managementService  == null) {
			beforeSuite();
			localstart = true;
		}
	}

	@Override
	public void stopServer() {
		repositoryProducer.session.purgeDatabase();
		if ( localstart ) {
			afterSuite();
		}
	}

	@Override
	public void initSession() {
		ClasspathConfigurationSource configurationSource = new ClasspathConfigurationSource("ogm.properties");
		Configuration configuration = new Configuration.Builder(configurationSource)
				.build();
		SessionFactory sessionFactory = new SessionFactory(configuration, "org.tura.jpa.test");
		repositoryProducer.session = sessionFactory.openSession();
	}

	@Override
	public void initData(String name, Object... params) throws Exception {
		if ("InitDB0".equals(name)) {
			if (params.length > 0) {
				String deparmentString = (String) params[0];
				initDB(deparmentString, repositoryProducer.session);
			}
			if (params.length == 2) {
				String employeeString = (String) params[1];
				initDB(employeeString, repositoryProducer.session);
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

	private void initDB(String initializer, Session session) throws Exception {

		switch (initializer) {
		case "Department1":
			new Departments1Init(session, departmentConverter).init();
			break;
		case "Employee1":
			new Employeses1Init(session, departmentConverter, employeeConverter).init();
			break;
		case "Department2":
			new Departments2Init(session, departmentConverter).init();
			break;
		case "Employee2":
			new Employeses2Init(session, departmentConverter, employeeConverter).init();
			break;
		}

	}
	
	private  void initDb1() {
		org.tura.jpa.test.One2One1A a1 = new org.tura.jpa.test.One2One1A();
		a1.setObjId(10L);
		org.tura.jpa.test.One2One1B b1 = new org.tura.jpa.test.One2One1B();
		b1.setObjId(20L);
		
		b1.setRef(10L);
		
		this.persist(b1);
		this.persist(a1);
//		repositoryProducer.em.flush();
		
	}		

	private  void initDb2() {

		org.tura.jpa.test.Many2Many1A a1 = new org.tura.jpa.test.Many2Many1A();
		a1.setObjId(10L);
		a1.setMany2Many1B(new ArrayList<>());

		org.tura.jpa.test.Many2Many1B b1 = new org.tura.jpa.test.Many2Many1B();
		b1.setObjId1(20L);
		a1.getMany2Many1B().add(b1);
		b1.setMany2Many1A(new ArrayList<>());
		b1.getMany2Many1A().add(a1);

		this.persist(b1);
		this.persist(a1);

		b1 = new org.tura.jpa.test.Many2Many1B();
		b1.setObjId1(30L);
		a1.getMany2Many1B().add(b1);
		b1.setMany2Many1A(new ArrayList<>());
		b1.getMany2Many1A().add(a1);

		this.persist(b1);
		this.persist(a1);

		a1 = new org.tura.jpa.test.Many2Many1A();
		a1.setObjId(40L);
		a1.setMany2Many1B(new ArrayList<>());

		b1 = new org.tura.jpa.test.Many2Many1B();
		b1.setObjId1(50L);
		a1.getMany2Many1B().add(b1);
		b1.setMany2Many1A(new ArrayList<>());
		b1.getMany2Many1A().add(a1);

		this.persist(b1);
		this.persist(a1);

		b1 = new org.tura.jpa.test.Many2Many1B();
		b1.setObjId1(60L);
		a1.getMany2Many1B().add(b1);
		b1.setMany2Many1A(new ArrayList<>());
		b1.getMany2Many1A().add(a1);

		this.persist(b1);
		this.persist(a1);
		
//		repositoryProducer.em.flush();

	}
	
	private  void initDb3() {
		
		org.tura.jpa.test.One2Many1A a1 = new org.tura.jpa.test.One2Many1A();
		a1.setObjId(10L);
		
		org.tura.jpa.test.One2Many1B b1 = new org.tura.jpa.test.One2Many1B();
		b1.setObjId(20L);
		b1.setRef(10L);
		
		this.persist(b1);
		this.persist(a1);
		
		b1 = new org.tura.jpa.test.One2Many1B();
		b1.setObjId(30L);
		b1.setRef(10L);
		
		this.persist(b1);
		this.persist(a1);
		
//		repositoryProducer.em.flush();
		
	}		
	
	
	private  void initDb4() {

		org.tura.jpa.test.Client client = new org.tura.jpa.test.Client();
		client.setObjId(10L);
		client.setName("Cleint 1");
		
		 org.tura.jpa.test.Person person = new org.tura.jpa.test.Person();
		 person.setObjId(20L);
		 person.setClientId(10L);
	     person.setName("Jon Jonson");

	     
	     org.tura.jpa.test.MailAddress mail = new org.tura.jpa.test.MailAddress();
	     mail.setObjId(30L);
	     mail.setAddress("qwerty@gmail.com");
	     ArrayList<org.tura.jpa.test.Person> array = new ArrayList<>();
	     array.add(person);
	     mail.setPerson(array);

	     
	     org.tura.jpa.test.Phone phone = new org.tura.jpa.test.Phone();
	     phone.setObjId(40L);
	     phone.setPhone("111-111-1111");
	     phone.setPersonId(20L);
		
		 
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
		repositoryProducer.session.clear();
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
		tx = repositoryProducer.session.beginTransaction();
	}

	@Override
	public void commitTransaction() throws Exception {
		tx.commit();
	}

	@Override
	public void clean() {
		repository = null;
	}

	@Override
	public Object getSession() throws Exception {
		return repositoryProducer.session;
	}

	@SuppressWarnings("unchecked")
	public DataControl<DepartmentType> initDepartments(String elPrefix, String initializer) throws Exception {
		switch (initializer) {
		case "Department1":
			return new FactoryDC1(elResolver).initDepartments(elPrefix, this);
		case "Department2":
			return new FactoryDC2(elResolver).initDepartments(elPrefix, this);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public DataControl<EmployeeType> initEmployees(String elPrefix, String initializer) throws Exception {
		switch (initializer) {
		case "Employee1":
			return new FactoryDC1(elResolver).initEmployees(elPrefix, this);
		case "Employee2":
			return new FactoryDC2(elResolver).initEmployees(elPrefix, this);
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
		UUIPrimaryKeyStrategy.sequence = seq;

	}

	@Override
	public void persist(Object obj) {
		repositoryProducer.session.save(obj);
	}

	private static void registerShutdownHook(final DatabaseManagementService managementService) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				managementService.shutdown();
			}
		});
	}

	@Override
	public void beforeSuite() throws Exception {
		Path dir = Paths.get(  Paths.get(System.getProperty("user.home"), ".tura/neo4j").toString() );
		
		if (Files.exists(dir) ) {
			Files.walk(dir).sorted(Comparator.reverseOrder()).forEach(path -> {
				try {
					Files.delete(path);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}

		SocketAddress defaultAdvertised = new SocketAddress("localhost");
		SocketAddress defaultListen = new SocketAddress("0.0.0.0");
		managementService = new DatabaseManagementServiceBuilder(dir)
				.setConfig(GraphDatabaseSettings.default_advertised_address, defaultAdvertised)
				.setConfig(GraphDatabaseSettings.default_listen_address, defaultListen)
				.setConfig(BoltConnector.enabled, true).setConfig(HttpConnector.enabled, true).build();
		registerShutdownHook(managementService);
		
	}

	@Override
	public void afterSuite() {
		managementService.shutdown();
	}

}
