/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
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
package org.tura.jpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.tura.platform.test.ClassStructureTestUtils.findFieldAnnotation;
import static org.tura.platform.test.ClassStructureTestUtils.findMethod;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.jpa.test.Client;
import org.tura.jpa.test.File;
import org.tura.jpa.test.MailAddress;
import org.tura.jpa.test.Person;
import org.tura.jpa.test.PersonType;
import org.tura.jpa.test.Phone;
import org.tura.jpa.test.PhoneType;

public class JPATest {

	private static EntityManager em;

	private static Logger logger;
	private static Server server;

	
	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}
	
	
	@BeforeClass
	public static void beforeClass() throws Exception{
		server = Server.createTcpServer().start();

		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
//		ConsoleHandler handler = new ConsoleHandler();
//		handler.setFormatter(new LogFormatter());
//		logger.addHandler(handler);
//		logger.setLevel(Level.INFO);

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(
				"JPA_TEST", config.getProperties());
		em = emf.createEntityManager();

	}
	
	@Test
	public void createObject(){
		
		Client client = new Client();
		client.setObjId(1L);
		client.setName("Cleint 1");
		
	     Person person = new Person();
	     person.setObjId(2L);
	     person.setName("Jon Jonson");
	     client.setPerson(person);
	     
	     MailAddress mail = new MailAddress();
	     mail.setObjId(3L);
	     mail.setAddress("qwerty@gmail.com");
	     ArrayList<Person> array = new ArrayList<>();
	     array.add(person);
	     mail.setPerson(array);
	     
	     Phone phone = new Phone();
	     phone.setObjId(4L);
	     phone.setPhone("111-111-1111");
	     phone.setPerson(person);
	     
	     
	     
	     try{
	    	 em.getTransaction().begin();
		     em.persist(client);
		     em.persist(person);
		     em.persist(mail);
		     em.persist(phone);
		     em.getTransaction().commit();
	     }catch(Exception e){
	    	 e.printStackTrace();
	    	 fail();
	     }
	}	
	
	@Test
	public void checkClientClass(){
		assertEquals(10, Client.class.getDeclaredMethods().length);
		assertTrue(findMethod( Client.class,"getName" ));
		assertTrue(findMethod( Client.class,"setName",new Class[]{String.class} ));

		assertTrue(findMethod( Client.class,"getObjId" ));
		assertTrue(findMethod( Client.class,"setObjId",new Class[]{Long.class} ));
		
		assertTrue(findMethod( Client.class,"getCreateDate" ));
		assertTrue(findMethod( Client.class,"setCreateDate",new Class[]{Date.class} ));

		assertTrue(findMethod( Client.class,"getObjectType" ));
		assertTrue(findMethod( Client.class,"setObjectType",new Class[]{String.class} ));
		
		assertTrue(findMethod( Client.class,"getPerson" ));
		assertTrue(findMethod( Client.class,"setPerson",new Class[]{Person.class} ));
		
		Annotation a = findFieldAnnotation(Client.class,Id.class,"objId");
		assertNotNull(a);
		
		OneToOne b = (OneToOne) findFieldAnnotation(Client.class,OneToOne.class,"person");
		assertNotNull(b);
		assertEquals("client", b.mappedBy());
		
	}
	
	@Test
	public void checkPersonClass(){
		assertEquals(18, Person.class.getDeclaredMethods().length);

		assertTrue(findMethod( Person.class,"getName" ));
		assertTrue(findMethod( Person.class,"setName",new Class[]{String.class} ));

		assertTrue(findMethod( Person.class,"getObjId" ));
		assertTrue(findMethod( Person.class,"setObjId",new Class[]{Long.class} ));
		
		assertTrue(findMethod( Person.class,"getCreateDate" ));
		assertTrue(findMethod( Person.class,"setCreateDate",new Class[]{Date.class} ));

		assertTrue(findMethod( Person.class,"getObjectType" ));
		assertTrue(findMethod( Person.class,"setObjectType",new Class[]{String.class} ));
		
		assertTrue(findMethod( Person.class,"getMailAddress" ));
		assertTrue(findMethod( Person.class,"setMailAddress",new Class[]{Collection.class} ));
		
		assertTrue(findMethod( Person.class,"getPhone" ));
		assertTrue(findMethod( Person.class,"setPhone",new Class[]{Collection.class} ));

		assertTrue(findMethod( Person.class,"getClient" ));
		assertTrue(findMethod( Person.class,"setClient",new Class[]{Client.class} ));
		
		assertTrue(findMethod( Person.class,"getFile" ));
		assertTrue(findMethod( Person.class,"setFile",new Class[]{File.class} ));
		
		assertTrue(findMethod( Person.class,"getGender" ));
		assertTrue(findMethod( Person.class,"setGender",new Class[]{PersonType.class} ));
		
		
		Annotation a = findFieldAnnotation(Person.class,Id.class,"objId");
		assertNotNull(a);
		
		OneToOne b = (OneToOne) findFieldAnnotation(Person.class,OneToOne.class,"client");
		assertNotNull(b);
		
		b = (OneToOne) findFieldAnnotation(Person.class,OneToOne.class,"file");
		assertNotNull(b);

		
		JoinColumns c = (JoinColumns) findFieldAnnotation(Person.class,JoinColumns.class,"client");
		assertNotNull(c);
		assertEquals(1, c.value().length); 
		
		assertEquals("CLIENT_ID", c.value()[0].name()); 
		
		OneToMany d = (OneToMany) findFieldAnnotation(Person.class,OneToMany.class,"phone");
		assertNotNull(d);
		assertEquals("person", d.mappedBy());
		
		
		ManyToMany f = (ManyToMany) findFieldAnnotation(Person.class,ManyToMany.class,"mailAddress");
		assertNotNull(f);
		assertEquals("person",f.mappedBy());
		
	}

	
	@Test
	public void checkMailAddressClass(){
		assertEquals(12, MailAddress.class.getDeclaredMethods().length);

		assertTrue(findMethod( MailAddress.class,"getObjId" ));
		assertTrue(findMethod( MailAddress.class,"setObjId",new Class[]{Long.class} ));
		
		assertTrue(findMethod( MailAddress.class,"getCreateDate" ));
		assertTrue(findMethod( MailAddress.class,"setCreateDate",new Class[]{Date.class} ));

		assertTrue(findMethod( MailAddress.class,"getObjectType" ));
		assertTrue(findMethod( MailAddress.class,"setObjectType",new Class[]{String.class} ));
		
		assertTrue(findMethod( MailAddress.class,"getAddress" ));
		assertTrue(findMethod( MailAddress.class,"setAddress",new Class[]{String.class} ));

		assertTrue(findMethod( MailAddress.class,"getPerson" ));
		assertTrue(findMethod( MailAddress.class,"setPerson",new Class[]{Collection.class} ));
		
		assertTrue(findMethod( MailAddress.class,"getPhoneType" ));
		assertTrue(findMethod( MailAddress.class,"setPhoneType",new Class[]{PhoneType.class} ));
		
		
		Annotation a = findFieldAnnotation(MailAddress.class,Id.class,"objId");
		assertNotNull(a);
		
		JoinTable b = (JoinTable) findFieldAnnotation(MailAddress.class,JoinTable.class,"person");
		assertNotNull(b);
		assertEquals("RL_MAILADDRESS_PERSON", b.name());
		
		assertEquals(1, b.joinColumns().length);
		assertEquals("mailaddress_objid", b.joinColumns()[0].name());
		assertEquals("person_objid", b.inverseJoinColumns()[0].name());
		
	}
	
	
	
}
