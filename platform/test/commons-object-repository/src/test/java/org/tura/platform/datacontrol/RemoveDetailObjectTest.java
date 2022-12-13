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

package org.tura.platform.datacontrol;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.init.Factory;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.proxy.access.TopLazyList;

import objects.test.serialazable.jpa.Department2;
import objects.test.serialazable.jpa.Employee2;

public class RemoveDetailObjectTest {

	protected static Factory factory;

	private static Server server;
	
	public static Class<?> deparmentClass =  Department2.class;
	public static Class<?> employeeClass  = Employee2.class;
	public static String deparmentString = "Department2";
	public static String employeeString  = "Employee2";
	
	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}
	
	@BeforeClass
	public static void beforeClass() throws Exception{
		
		PlatformConfig.TEST_MODE = true;
		PlatformConfig.LOADSTEP = 3;
		server = Server.createTcpServer().start();
		factory = new Factory();

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		Factory.getRepositoryProducer().em = emf.createEntityManager();

		factory.getEntityManager().getTransaction().begin();

		factory.initDB(deparmentString, factory.getEntityManager());
		try {
			factory.initDB(employeeString, factory.getEntityManager());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		factory.getEntityManager().getTransaction().commit();

	}
	
	@Before
	public void init() throws Exception{
		factory.clean();
	}	
	
	@SuppressWarnings("resource")
	@Test
	public void t001_remove() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = Factory.repositoryProducer.cpaStorageProvider;
			
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			Department2 obj  =  (Department2) list.get(0);
			
			List<Employee2>  empList = obj.getEmployee2();
			Employee2 emp  =   empList.get(0);
			Long id = emp.getObjId();
			
			empList.remove(emp);
			emp  =   empList.get(0);
			assertNotEquals(id,  emp.getObjId());
			stackProvider.get().commit();
			
		}catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
		
   @Test	
	@SuppressWarnings("resource")
	public void t002_remove() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = Factory.repositoryProducer.cpaStorageProvider;
			
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			Department2 obj  =  (Department2) list.get(0);
			
			List<Employee2>  empList = obj.getEmployee2();
			Employee2 emp  =   empList.get(0);
			Long id = emp.getObjId();

			
			empList.get(10);
			
			empList.remove(emp);
			emp  =   empList.get(0);
			assertNotEquals(id,  emp.getObjId());
			stackProvider.get().commit();
			
		}catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	
}
