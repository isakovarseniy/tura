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

package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.h2.tools.Server;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.example.ui.datacontroladminsimulation.admin.datacontrol.BeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.hr.init.RoleInit;
import org.tura.platform.hr.init.UserInit;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.test.spa.CRUDService;
import org.tura.platform.test.spa.ProcessCallback;
import org.tura.platform.test.spa.SearchBase;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.GridType;

import objects.test.serialazable.jpa.R1;
import objects.test.serialazable.jpa.Rref;
import objects.test.serialazable.jpa.U1;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CDITest {

	private Weld w;
	private WeldContainer weld;
	private static Server server;
	private Map<Long, Long> roleConverter = new HashMap<Long, Long>();

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
	}

	@Before
	public void before() {
		try {
			w = new Weld();
			weld = w.initialize();

			EntityManager em = weld.instance().select(EntityManager.class).get();

			em.getTransaction().begin();
			SearchBase.clear();
			new RoleInit(em, roleConverter).init();
			new UserInit(roleConverter).init();

			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t001_createUser() {
		try {
			CpaRepository repository = getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CRUDService.callbacks.put(org.tura.jpa.test.U1.class.getName(), new U1ProcessCallback());

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			DataControl<U1> dcU = bf.getU1();
			U1 ui = dcU.getCurrentObject();
			assertEquals(2, ui.getRref().size());

			assertEquals("ui-access", ui.getRref().get(0).getR1().getName());
			assertEquals("offline-access", ui.getRref().get(1).getR1().getName());

			ui = dcU.createObject();
			ui.setName("NewUser");
			assertEquals(0, ui.getRref().size());

			Long id = ui.getObjId();

			stackProvider.get().commit();

			assertNotEquals(id, ui.getObjId());
			assertEquals(2, ui.getRref().size());

			assertEquals("ui-access", ui.getRref().get(0).getR1().getName());

			ui.setName("NewUser1");
			stackProvider.get().commit();

			dcU.removeObject();
			stackProvider.get().commit();

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t002_createUser() {
		try {
			CpaRepository repository = getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CRUDService.callbacks.put(org.tura.jpa.test.U1.class.getName(), new U1ProcessCallback());

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			DataControl<U1> dcU = bf.getU1();
			U1 ui = dcU.getCurrentObject();
			DataControl<Rref> dcR = bf.getRref();
			Rref ref = dcR.getCurrentObject();
			assertEquals("ui-access", ui.getRref().get(0).getR1().getName());

			ui = dcU.createObject();
			ui.setName("NewUser");
			assertEquals(0, ui.getRref().size());
			assertNull(dcR.getCurrentObject());

			stackProvider.get().commit();

			ui = dcU.getCurrentObject();
			assertEquals("NewUser", ui.getName());
			assertEquals(2, ui.getRref().size());
			assertNotNull(dcR.getCurrentObject());

			for (Rref r : bf.getRref().getScroller()) {
				assertNotNull(r.getR1().getName());
			}

			ref = dcR.createObject();

			R1 r1 = bf.getR1().getCurrentObject();
			assertEquals("admin", r1.getName());
			ref.setR1(r1);
			assertEquals("admin", ref.getR1().getName());

			String[] names = new String[] { "admin", "ui-access", "offline-access" };
			int i = 0;
			Long adminId = null;
			List<Long> ids = new ArrayList<>();
			for (Rref r : bf.getRref().getScroller()) {
				assertEquals(names[i], r.getR1().getName());
				if ("admin".equals(r.getR1().getName())) {
					adminId = r.getObjId();
				} else {
					ids.add(r.getObjId());
				}
				i++;
			}

			stackProvider.get().commit();

			for (Rref r : bf.getRref().getScroller()) {
				if ("admin".equals(r.getR1().getName())) {
					assertNotEquals(adminId, r.getObjId());
				} else {
					assertTrue(ids.contains(r.getObjId()));
				}
			}

			dcR.setCurrentPosition(2);
			ref = dcR.getCurrentObject();
			assertEquals("admin", ref.getR1().getName());

			dcR.removeObject();

			stackProvider.get().commit();

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t003_createUser() {
		try {
			CpaRepository repository = getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			SearchBase.clear();
			CRUDService.callbacks.put(org.tura.jpa.test.U1.class.getName(), new U1ProcessWithRemoveCallback());

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			DataControl<U1> dcU = bf.getU1();

			U1 ui = dcU.createObject();
			ui.setName("NewUser");
			assertEquals(0, ui.getRref().size());

			DataControl<Rref> dcR = bf.getRref();
			Rref ref = dcR.createObject();

			R1 r1 = bf.getR1().getCurrentObject();
			assertEquals("admin", r1.getName());
			ref.setR1(r1);
			
			GridModel model = new GridModel(dcR, null, GridType.SingleSelect, "1");
			model.setPageSize(5);
			model.load();
			ObjectControl  oc  =  (ObjectControl) model.getSelected();
			oc.getKey();

			stackProvider.get().commit();

			assertEquals(2, bf.getRref().getScroller().size());
			oc  =  (ObjectControl) model.getSelected();
			oc.getKey();
			List<Object>  m =  model.load();
			assertEquals(2, m.size());
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	public CpaRepository getRepository() {

		ClientProxyRepo annotation = new ClientProxyRepo() {

			@Override
			public Class<? extends Annotation> annotationType() {
				return ClientProxyRepo.class;
			}

			@Override
			public String value() {
				return "datacontroladminsimulation.admin";
			}
		};
		return weld.instance().select(CpaRepository.class, annotation).get();
	}

	public class U1ProcessCallback extends ProcessCallback {
		public void preInsert(Object obj) {
			org.tura.jpa.test.U1 ui = (org.tura.jpa.test.U1) obj;
			boolean ui_access = false;
			boolean offline_access = false;
			if (ui.getRref() == null) {
				ui.setRref(new ArrayList<>());
			}

			for (org.tura.jpa.test.Rref ref : ui.getRref()) {
				new UUIPrimaryKeyStrategy().generatePk(ref);
				if (ref.getR1Ref() == null) {
					throw new RuntimeException("Ref to role is empty");
				}
				if (roleConverter.get(20L).equals(ref.getR1Ref())) {
					ui_access = true;
				}
				if (roleConverter.get(30L).equals(ref.getR1Ref())) {
					offline_access = true;
				}
			}
			if (!ui_access) {
				org.tura.jpa.test.Rref ref = new org.tura.jpa.test.Rref();
				ref.setR1Ref(roleConverter.get(20L));
				new UUIPrimaryKeyStrategy().generatePk(ref);
				ui.getRref().add(ref);
			}
			if (!offline_access) {
				org.tura.jpa.test.Rref ref = new org.tura.jpa.test.Rref();
				ref.setR1Ref(roleConverter.get(30L));
				new UUIPrimaryKeyStrategy().generatePk(ref);
				ui.getRref().add(ref);
			}
		}

		public void preUpdate(Object newObj, Object oldObj) {
			org.tura.jpa.test.U1 newUi = (org.tura.jpa.test.U1) newObj;
			org.tura.jpa.test.U1 oldUi = (org.tura.jpa.test.U1) oldObj;

			for (org.tura.jpa.test.Rref newRef : newUi.getRref()) {
				boolean found = false;
				for (org.tura.jpa.test.Rref oldRef : oldUi.getRref()) {
					if (newRef.getObjId().equals(oldRef.getObjId())) {
						found = true;
						break;
					}
				}
				if (!found) {
					new UUIPrimaryKeyStrategy().generatePk(newRef);
				}

			}

		}
	}

	public class U1ProcessWithRemoveCallback extends U1ProcessCallback {
		public void preInsert(Object obj) {
			org.tura.jpa.test.U1 ui = (org.tura.jpa.test.U1) obj;
			ui.setRref(new ArrayList<>());

			org.tura.jpa.test.Rref ref = new org.tura.jpa.test.Rref();
			ref.setR1Ref(roleConverter.get(20L));
			new UUIPrimaryKeyStrategy().generatePk(ref);
			ui.getRref().add(ref);
			ref = new org.tura.jpa.test.Rref();
			ref.setR1Ref(roleConverter.get(30L));
			new UUIPrimaryKeyStrategy().generatePk(ref);
			ui.getRref().add(ref);
		}
	}

}
