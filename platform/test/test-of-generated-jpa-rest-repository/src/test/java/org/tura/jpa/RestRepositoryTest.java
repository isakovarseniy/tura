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

package org.tura.jpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Ignore;
import org.junit.Test;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.client.rest.RestClientRepository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.JPAObject11;
import objects.test.serialazable.jpa.One2One1A;
import objects.test.serialazable.jpa.One2One1B;
import objects.test.serialazable.jpa2.JPAObjectSecondDb;

public class RestRepositoryTest {

	private static  String version ;

	
	public static void getVersion() {
		File[] libs = Maven.resolver().loadPomFromFile("pom.xml")
				.resolve("org.tura.platform.test.generated-code:test-objects-restservice-repository:war:?")
				.withTransitivity().as(File.class);
		
		if ( libs.length != 0  ) {
			File f = libs[0];
		    String name = f.getName();
		    
		    int i = "test-objects-restservice-repository".length();
		    int j = name.lastIndexOf(".war");
		    version = name.substring(i+1,j);
			  
		}
	}

	
	public static  CpaRepository getRepository() throws Exception {
		if (version == null ) {
			getVersion();
		}
		
		URL url = new URL("http://127.0.0.1:8080/test-objects-restservice-repository-"+version+"/");
		
		CpaRepository proxy = new RepositoryProducer().getProxyRepository(new RestClientRepository(url));
		return proxy;
		
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void t0000_One2One1() {
		try {
			CpaRepository repository = getRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			One2One1A o1 = (One2One1A) repository.create(One2One1A.class);
			
			One2One1B o2 = (One2One1B) repository.create(One2One1B.class);
			
			o1.setOne2One1B(o2);
			
			repository.insert(o1, One2One1A.class);
			
			
			stackProvider.get().commit();
			

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One1B.class);
			assertEquals(1,result.getSearchResult().size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One1A.class);
			assertEquals(1,result.getSearchResult().size());
			
			SearchCriteria sc = new SearchCriteria();
			sc.setName("objId");
			sc.setComparator("EQ");
			sc.setValue(o1.getObjId());
			ArrayList<SearchCriteria> search = new ArrayList<SearchCriteria>();
			search.add(sc);
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 0, One2One1A.class);
			assertEquals(1,result.getSearchResult().size());

			
			
			repository.remove(result.getSearchResult().get(0), One2One1A.class);
			
			stackProvider.get().commit();
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One1B.class);
			assertEquals(0,result.getSearchResult().size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One1A.class);
			assertEquals(0,result.getSearchResult().size());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	

	@Test
	@Ignore
	public void t0001_JPAObject11JPAObjectSecondDb() {
		try {
			CpaRepository repository = getRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			JPAObject11 jpaObject11 = (JPAObject11) repository.create(JPAObject11.class);
			JPAObjectSecondDb jpaObjectSecondDb = (JPAObjectSecondDb) repository.create(JPAObjectSecondDb.class);
			
			repository.insert(jpaObject11, JPAObject11.class);
			repository.insert(jpaObjectSecondDb, JPAObjectSecondDb.class);

			jpaObjectSecondDb.setJPAObject11(jpaObject11);

			stackProvider.get().commit();;
		
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}


}
