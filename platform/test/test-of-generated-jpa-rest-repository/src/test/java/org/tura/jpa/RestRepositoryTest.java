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
package org.tura.jpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.client.rest.RestClientRepository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.One2One1A;
import objects.test.serialazable.jpa.One2One1B;
import objects.test.serialazable.jpa.ProxyRepository;

@RunWith(Arquillian.class)
public class RestRepositoryTest {

	@SuppressWarnings("rawtypes")
	private static List commandStack;
	
	
	@Deployment
	public static WebArchive createDeployment() {
		File[] libs = Maven.resolver().loadPomFromFile("pom.xml")
				.resolve("org.tura.platform.test.generated-code:test-objects-restservice-repository:war:1.0")
				.withTransitivity().as(File.class);
		
		File[] libs1 = Maven.resolver().loadPomFromFile("pom.xml")
				.resolve("org.tura.platform.test.generated-code:test-objects-repository-proxy:1.0")
				.withTransitivity().as(File.class);
		

		 
				
				
				WebArchive a =  ShrinkWrap.createFromZipFile(WebArchive.class, libs[0])
				.addAsLibraries(libs1[0])
				.addAsWebInfResource("jbossas-ds.xml")
				.addAsWebInfResource("jboss-deployment-structure.xml")
				;
				a.toString();
				return a;
	}

	
	private ProxyRepository getRepository() throws MalformedURLException {
		URL url = new URL("http://127.0.0.1:8080/test-objects-restservice-repository-1.0/");
		commandStack = new ArrayList<>();
		return  new ProxyRepository(new RestClientRepository(url),stackProvider);
		
	}
	
	@Test
	@RunAsClient
	public void t0000_One2One1() {
		try {
			ProxyRepository repository = getRepository();

			One2One1A o1 = (One2One1A) repository.create(One2One1A.class.getName());
			
			One2One1B o2 = (One2One1B) repository.create(One2One1B.class.getName());
			
			o1.setOne2One1B(o2);
			
			repository.insert(o1, One2One1A.class.getName());
			
			repository.applyChanges(null);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One1B.class.getName());
			assertEquals(1,result.getSearchResult().size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One1A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			
			SearchCriteria sc = new SearchCriteria();
			sc.setName("objId");
			sc.setComparator("EQ");
			sc.setValue(o1.getObjId());
			ArrayList<SearchCriteria> search = new ArrayList<SearchCriteria>();
			search.add(sc);
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 0, One2One1A.class.getName());
			assertEquals(1,result.getSearchResult().size());

			
			
			repository.remove(result.getSearchResult().get(0), One2One1A.class.getName());
			
			repository.applyChanges(null);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One1B.class.getName());
			assertEquals(0,result.getSearchResult().size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One1A.class.getName());
			assertEquals(0,result.getSearchResult().size());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	
	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider(){

		@SuppressWarnings("unchecked")
		@Override
		public void addCommand(Object cmd) throws Exception {
			commandStack.add(cmd);
			
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Object> getListOfCommand() throws Exception {
			return commandStack;
		}

		@Override
		public void clear() throws Exception {
			commandStack.clear();
			
		}
		
	};	
	

}
