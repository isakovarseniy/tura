/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.init.Factory;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.GridType;
import org.tura.platform.uuiclient.model.ModelHelper;

import com.octo.java.sql.exp.Operator;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class AbstractSingleDataControl {

	protected static Factory factory;

	private static Server server;

	public static Class<?> deparmentClass;
	public static Class<?> employeeClass;
	public static String deparmentString;
	public static String employeeString;

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}

	public static void beforeClass() throws Exception {
		PlatformConfig.TEST_MODE = true;
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
			factory.getEntityManager().getTransaction().commit();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	@Before
	public void init() throws Exception {
		factory.clean();
	}

	@Test
	public void t1_getObject() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(10L) );

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t2_scrolling() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			Long id = Long.valueOf(10);
			do {
				DepartmentType row = dc.getCurrentObject();
				assertEquals(row.getObjId(), factory.cDept(id));
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), factory.cDept(id));

			id = Long.valueOf(270);
			do {
				DepartmentType row = dc.getCurrentObject();
				assertEquals(row.getObjId(), factory.cDept(id));
				id = id - 10L;
				dc.prevObject();
			} while (dc.hasPrev());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), factory.cDept(id));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t3_defaultSearchCriteriaWithConstant() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);

			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s.setName("objId");
			s.setComparator(Operator.GT.name());
			s.setValue(factory.cDept(Long.valueOf(30)));
			sc.add(s);

			dc.setDefaultSearchCriteria(sc);

			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(40)));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t4_defaultSearchCriteriaWithExpression() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.getElResolver().setValue("limit", factory.cDept(Long.valueOf(30)));

			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s.setName("objId");
			s.setComparator(Operator.GT.name());
			s.setValue("#{limit}");
			sc.add(s);

			dc.setDefaultSearchCriteria(sc);

			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(40)));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t3_randomUpdate() {
		try {

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			DepartmentType obj = dc.getCurrentObject();

			ArrayList<DepartmentType> array = new ArrayList<DepartmentType>();
			List<DepartmentType> scroller = dc.getScroller();
			for (int i = 0; i < 8; i++) {
				array.add(scroller.get(i));
			}

			array.get(3).setDepartmentName("qwerty");

			array = new ArrayList<DepartmentType>();
			scroller = dc.getScroller();
			for (int i = 0; i < 8; i++) {
				array.add(scroller.get(i));
			}

			assertEquals(obj.getDepartmentName(), array.get(0).getDepartmentName());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void t5_removeScrollDownScrollUpCpmmitScrollDown() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			setPreDeleteTrigger(dc);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();

			int beforeRemove = dc.getScroller().size();

			for (int i = 0; i < 4; i++) {
				dc.removeObject();
			}

			int afterRemove = dc.getScroller().size();

			int diff = beforeRemove - afterRemove;

			assertEquals(diff, 4);

			dc.forceRefresh();

			Long id = Long.valueOf(50);
			do {
				DepartmentType row = dc.getCurrentObject();
				assertEquals(row.getObjId(), factory.cDept(id));
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), factory.cDept(id));

			id = Long.valueOf(270);
			do {
				DepartmentType row = dc.getCurrentObject();
				assertEquals(row.getObjId(), factory.cDept(id));
				id = id - 10L;
				dc.prevObject();
			} while (dc.hasPrev());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), factory.cDept(id));

			stackProvider.get().commit();

			id = Long.valueOf(50);
			do {
				DepartmentType row = dc.getCurrentObject();
				assertEquals(row.getObjId(), factory.cDept(id));
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), factory.cDept(id));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	protected abstract void setPreDeleteTrigger(DataControl<DepartmentType> dc);

	@Test
	public void t6_defaultSearchCriteriaWithConstantUpdateRequery() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);

			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s.setName("objId");
			s.setComparator(Operator.EQ.name());
			s.setValue(factory.cDept(Long.valueOf(70)));
			sc.add(s);

			dc.setDefaultSearchCriteria(sc);

			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(70)));

			dc.getCurrentObject().setDepartmentName("test");
			dc.getCurrentObject().setDepartmentName("qwerty");

			stackProvider.get().commit();

			dc.forceRefresh();
			row = dc.getCurrentObject();
			assertEquals("qwerty", row.getDepartmentName());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t7_preQueryPostQueryTriggers() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);

			dc.getElResolver().setValue("departments", dc);
			dc.setPreQueryTrigger(new DepartmentDCPreQueryTrigger());
			dc.setPostQueryTrigger(new DepartmentDCPostQueryTrigger());
			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(70)));
			assertEquals(row.getDepartmentName(), "test");

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t8_scrollDownAddCommitScrollDown() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.setPostCreateTrigger(new DeparmentPostCreatTrigger());

			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();
			for (int i = 0; i < 4; i++) {
				dc.nextObject();
			}

			int beforeAdd = dc.getScroller().size();

			DepartmentType d1 = dc.createObject();
			assertEquals(d1.getDepartmentName(), "test");
			DepartmentType d2 = dc.createObject();
			assertEquals(d2.getDepartmentName(), "test");

			int afterAdd = dc.getScroller().size();

			int diff = beforeAdd - afterAdd;

			assertEquals(diff, -2);

			d1.setDepartmentName("d1");
			d2.setDepartmentName("d2");

			assertTrue(dc.setCurrentPosition(20));
			assertTrue(dc.setCurrentPosition(0));

			Long id = 50L;
			for (int i = 0; i < 4; i++) {
				DepartmentType row = dc.getCurrentObject();
				assertEquals(row.getObjId(), factory.cDept(id));
				id = id + 10L;
				dc.nextObject();
			}
			
			DepartmentType r= dc.getCurrentObject();
			assertEquals(d2.getObjId(), r.getObjId());
			dc.nextObject();
			
			r = dc.getCurrentObject();
			assertEquals(d1.getObjId(), r.getObjId());
			dc.nextObject();
			
			dc.forceRefresh();

			r= dc.getCurrentObject();
			assertEquals(d2.getObjId(), r.getObjId());
			dc.nextObject();
			
			r = dc.getCurrentObject();
			assertEquals(d1.getObjId(), r.getObjId());
			dc.nextObject();
			
			id = 50L;
			do {
				DepartmentType row = dc.getCurrentObject();
				assertEquals(row.getObjId(), factory.cDept(id));
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			
			stackProvider.get().commit();

			dc.forceRefresh();

			id = 50L;
			do {
				DepartmentType row = dc.getCurrentObject();
				if (factory.cDept(id) != null) {
					assertEquals(row.getObjId(), factory.cDept(id));
				} else {
					break;
				}
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());

			r = dc.getCurrentObject();
			assertEquals(r.getObjId(), d1.getObjId());
			dc.nextObject();

			r = dc.getCurrentObject();
			assertEquals(r.getObjId(), d2.getObjId());
			dc.nextObject();

			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), d2.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t9_removeLastRow() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();

			Stack<DepartmentType> st = new Stack<>();
			do {
				DepartmentType row = dc.getCurrentObject();
				st.push(row);
				dc.nextObject();
			} while (dc.hasNext());
			
			DepartmentType cdp= st.peek();
			DepartmentType row = dc.getCurrentObject();
			assertNotEquals(row.getObjId(), cdp.getObjId());
			dc.removeObject();
			row = dc.getCurrentObject();
			assertEquals(row.getObjId(), cdp.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t10_seek() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			DepartmentType o = dc.getCurrentObject();
			Long  id   = o.getObjId();

			List<Object[]> options = new ArrayList<>();
			try {
				List<?> scroler = dc.getScroller();

				Iterator<?> itr = scroler.iterator();
				while (itr.hasNext()) {
					Object obj = itr.next();
					Object objLabel = Reflection.call(obj, "getObjId");
					Object objValue = Reflection.call(obj, "getDepartmentName");
					options.add(new Object[] { objLabel, objValue });
				}
				boolean isSet = dc.setCurrentPosition(0);
				assertEquals(true, isSet);

				assertEquals(id, dc.getCurrentObject().getObjId());

				isSet = dc.setCurrentPosition(26);
				assertEquals(true, isSet);
				assertEquals((long) (factory.cDept((long) 270)), (long) (dc.getCurrentObject().getObjId()));

				isSet = dc.setCurrentPosition(-3);
				assertEquals(false, isSet);

				isSet = dc.setCurrentPosition(40);
				assertEquals(false, isSet);

				isSet = dc.setCurrentPosition(25);
				assertEquals(true, isSet);
				assertEquals((long) (factory.cDept((long) 260)), (long) (dc.getCurrentObject().getObjId()));

			} catch (Exception e) {
				e.printStackTrace();
				fail(e.getMessage());
			}

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t11_rallback() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			DepartmentType o = dc.getCurrentObject();
			stackProvider.get().savePoint();

			dc.createObject();

			stackProvider.get().rallbackSavePoint();

			DepartmentType o1 = dc.getCurrentObject();
			assertEquals(o.getObjId(), o1.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void t12_create() {
		final int[] createRow = { 0 };

		try {

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.addEventLiteners(new EventListener() {

				@Override
				public void handleEventListener(Event event) throws TuraException {
					createRow[0]++;
				}

			});

			dc.createObject();
			assertEquals(1, createRow[0]);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void t13_removeWithPositioning() {

		try {

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);

			dc.setCurrentPosition(24);

			DepartmentType d = dc.getCurrentObject();
			assertEquals(factory.cDept(Long.valueOf(250)), d.getObjId());

			dc.removeObject();

			boolean isSet = dc.setCurrentPosition(25);
			assertTrue(isSet);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void t14_defaultSearchCriteriaWithConstant() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);

			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s.setName("objId");
			s.setComparator(Operator.EQ.name());
			s.setValue(factory.cDept(Long.valueOf(10)));
			sc.add(s);

			dc.setDefaultSearchCriteria(sc);
			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(10)));

			dc.forceRefresh();
			row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(10)));

			stackProvider.get().savePoint();

			sc = new ArrayList<>();

			s = new SearchCriteria();
			s.setName("objId");
			s.setComparator(Operator.EQ.name());
			s.setValue(factory.cDept(Long.valueOf(20)));
			sc.add(s);

			dc.setDefaultSearchCriteria(sc);

			dc.forceRefresh();
			row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(20)));

			sc = new ArrayList<>();

			s = new SearchCriteria();
			s.setName("objId");
			s.setComparator(Operator.EQ.name());
			s.setValue(factory.cDept(Long.valueOf(30)));
			sc.add(s);
			dc.setDefaultSearchCriteria(sc);

			sc = new ArrayList<>();

			s = new SearchCriteria();
			s.setName("objId");
			s.setComparator(Operator.EQ.name());
			s.setValue(factory.cDept(Long.valueOf(40)));
			sc.add(s);
			dc.setDefaultSearchCriteria(sc);

			dc.forceRefresh();
			row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(40)));

			dc.forceRefresh();
			row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(40)));

			stackProvider.get().rallbackSavePoint();

			dc.forceRefresh();
			row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(40)));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	public class DeparmentPostCreatTrigger implements PostCreateTrigger {

		private static final long serialVersionUID = -6211662177439727224L;

		@Override
		public void execute(DataControl<?> datacontrol, Object obj, Map<String, Object> attributes)
				throws TuraException {
			try {
				Reflection.call(obj, "setDepartmentName", "test");
			} catch (Exception e) {
				throw new TuraException(e);
			}

		}

	}

	public class DepartmentDCPreQueryTrigger implements PreQueryTrigger {

		private static final long serialVersionUID = 1L;

		@Override
		public void execute(DataControl<?> datacontrol) throws TuraException {
			try {

				SearchCriteria s = new SearchCriteria();
				s.setName("objId");
				s.setComparator(Operator.EQ.name());
				s.setValue(factory.cDept(Long.valueOf(70)));
				s.setClassName(Long.class.getName());

				datacontrol.getSearchCriteria().add(s);

			} catch (Exception e) {
				throw new TuraException(e);
			}

		}
	}

	
	@Test
	public void t15_findObjectKey() {
		try {

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			
			DepartmentType obj = dc.getCurrentObject();
			ObjectControl oc = (ObjectControl) obj;
			RepoKeyPath key = oc.getPath();
			
			ObjectControl oc1 = (ObjectControl) dc.findObject( key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getPath());
			
            assertTrue( dc.setCurrentPosition(10));
			
			obj = dc.getCurrentObject();
			oc = (ObjectControl) obj;
			key = oc.getPath();
            
			assertTrue( dc.setCurrentPosition(0));
			dc.getCurrentObject();
			
			ArrayList<SearchCriteria> search = new ArrayList<SearchCriteria>();
			SearchCriteria sc = new SearchCriteria("objId", Operator.EQ.name(), obj.getObjId(), Long.class.getName() );
			search.add(sc);
			
			oc1 = (ObjectControl) dc.findObject( key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getPath());
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	@Test
	public void t16_findObjectKey() {
		try {
			
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			
			DepartmentType obj = dc.getCurrentObject();
			ObjectControl oc = (ObjectControl) obj;
			RepoKeyPath key = oc.getPath();
			
			stackProvider.get().savePoint();
			dc.removeObject();
			ObjectControl oc1 = (ObjectControl) dc.findObject( key);
			assertNull(oc1);
			
			stackProvider.get().rallbackSavePoint();
			
			oc1 = (ObjectControl) dc.findObject(key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getPath());
			
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	
	@Test
	public void t17_findObjectKey() {
		try {

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			
			DepartmentType obj = dc.getCurrentObject();
			ObjectControl oc = (ObjectControl) obj;
			RepoKeyPath key = oc.getPath();
			
			assertTrue( dc.setCurrentPosition(10));
			obj = dc.getCurrentObject();
			obj.setDepartmentName("qwerty");
			
			oc = (ObjectControl) obj;
			key = oc.getPath();
            
			assertTrue(dc.setCurrentPosition(0));
			dc.getCurrentObject();
			
			
			ObjectControl oc1 = (ObjectControl) dc.findObject(key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getPath());
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}	

	
	@Test
	public void t18_findObjectKey() {
		try {

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);

			DepartmentType obj = dc.getCurrentObject();

			GridModel model = new GridModel(dc, null, GridType.SingleSelect, "1");
			model.setPageSize(5);
			model.load();
			
			
            assertTrue( dc.setCurrentPosition(10));
			
            obj = dc.getCurrentObject();
            ObjectControl oc = (ObjectControl) obj;
			RepoKeyPath path = oc.getPath();
			String key = oc.getKey();
			
			HashMap<String,Object> hash = new HashMap<>();
			hash.put("ObjId",obj.getObjId());
			hash.put("key",key);
			hash.put("path",ModelHelper.serialize(path));
			

            assertTrue( dc.setCurrentPosition(0));
			
			model.decodeAndSetSelected(hash);
            
            ObjectControl oc1 =  (ObjectControl) model.getSelected();
            assertEquals(key, oc1.getKey());
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	
	public class DepartmentDCPostQueryTrigger implements PostQueryTrigger {

		private static final long serialVersionUID = 1L;

		@Override
		public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {

			DepartmentType d = (DepartmentType) obj;
			d.setDepartmentName("test");
		}

	}

}
