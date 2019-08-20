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
package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.h2.tools.Server;
import org.jboss.weld.environment.se.Weld;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.example.ui.nestedformpackage.hrcontroller.CDITestHRController;
import org.tura.example.ui.nestedformpackage.hrcontroller.datacontrol.BeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.hr.init.CityInit;
import org.tura.platform.hr.init.CompanyInit;
import org.tura.platform.hr.init.CountryInit;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.ProspectInit;
import org.tura.platform.hr.init.StateInit;
import org.tura.platform.hr.init.StreetInit;
import org.tura.platform.hr.objects.serialization.Prospect;
import org.tura.platform.hr.objects.serialization.Regions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CDITest extends CDITestHRController {

	private Weld w;
	private static Server server;

	@After
	public void after() {
		EntityManager em = weld.instance().select(EntityManager.class).get();
		if (em.isOpen())
			em.close();

		weld = null;
		w.shutdown();
	}

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		server = Server.createTcpServer().start();

		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new LogFormatter());
		logger.addHandler(handler);
		logger.setLevel(Level.INFO);
	}

	@Before
	public void before() {
		w = new Weld();
		weld = w.initialize();

		EntityManager em = weld.instance().select(EntityManager.class).get();

		em.getTransaction().begin();

		new CompanyInit(em).init();
		new CountryInit(em).init();
		new StateInit(em).init();
		new CityInit(em).init();
		new StreetInit(em).init();

		new DepartmentsInit(em).init();
		new ProspectInit(em).init();
		
		try {
			new EmployesesInit(em).init();
			em.getTransaction().commit();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

	}

   @Test
	public void prospectRegionTest() {
		try {

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			@SuppressWarnings("rawtypes")
			DataControl dc = bf.getProspect();

			Prospect p = (Prospect) dc.getCurrentObject();
			assertEquals("Prospect", p.getName()); 
			
			
			List<Long> selected = new ArrayList<Long>();
			selected.add(1L);
			selected.add(2L);
			changeSelection(bf,selected);

			List<Regions> list =  bf.getRegions().getScroller();
			assertEquals(2, list.size());

			Long[] check = new Long[] {1L,2L};
			List<Long> checkList = Arrays.asList(check);
			for ( Regions r :list ) {
				assertTrue(  checkList.contains(  r.getCountryId() ));  
			}
			
			selected.clear();
			selected.add(3L);
			selected.add(4L);
			selected.add(5L);
			
			changeSelection(bf,selected);

			list =  bf.getRegions().getScroller();
			assertEquals(3, list.size());
			
			check = new Long[] {3L,4L,5L};
			checkList = Arrays.asList(check);
			for ( Regions r :list ) {
				assertTrue(  checkList.contains(  r.getCountryId() ));  
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
   
   @SuppressWarnings({ "unchecked", "rawtypes" })
private void changeSelection(BeanFactory bf ,List<Long>  selected) throws Exception {
	   
		DataControl dc = (DataControl) bf.getRegions();
		List<Object> regions = dc.getScroller();
		
		List<Long> removeRegion = new ArrayList<Long>();
		
		for ( Object obj : regions  ) {
			Regions r = (Regions) obj;
			if ( !selected.contains(r.getCountryId())) {
				removeRegion.add(r.getObjId());
			}
		}
		
		for ( Long id : removeRegion) {
     		int i=0;
			boolean found = false;
			for ( Object obj : regions) {
				Regions r = (Regions) obj;
				if ( r.getObjId().equals(id)) {
					found = true;
					break;
				}
				i++;
			}
			if ( found) {
				dc.setCurrentPosition(i);
				dc.removeObject();
			}
		}
		
		for ( Long obj : selected) {
			boolean found = false;
			for ( Object o : regions) {
				Regions r = (Regions) o;
				if ( r != null && r.getObjId().equals(obj)) {
					found = true;
					break;
				}
			}
			if ( !found) {
				Regions r = (Regions) dc.createObject();
				r.setCountryId(obj);
			}
			Regions r = (Regions) dc.getCurrentObject();
			System.out.println("");

		}
		
   }
   
}
