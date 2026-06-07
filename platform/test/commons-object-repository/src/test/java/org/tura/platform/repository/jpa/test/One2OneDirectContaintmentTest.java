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

package org.tura.platform.repository.jpa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.One2One1A;
import objects.test.serialazable.jpa.One2One1B;
import objects.test.serialazable.jpa.PersonType;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class One2OneDirectContaintmentTest {

	private static StorageProvider storageProvider = StorageFactory.getStorage();

	@AfterAll
	public static void afterClass() throws Exception {
		storageProvider.stopServer();
	}

	@BeforeAll
	public static void beforeClass() throws Exception {
		storageProvider.startServer();
		storageProvider.initSession();
	}

	@Test
	public void t0000_One2One1() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();

			One2One1A o1 = (One2One1A) repository.create(One2One1A.class);

			One2One1B o2 = (One2One1B) repository.create(One2One1B.class);

			o1.setOne2One1B(o2);

			List<Object> commands = stackProvider.get().getListOfCommand();
			assertEquals(0, commands.size());

			repository.insert(o1, One2One1A.class);
			commands = stackProvider.get().getListOfCommand();
			assertEquals(1, commands.size());

			List<StorageControl> array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					10, One2One1B.class);
			assertEquals(1, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2One1A.class);
			assertEquals(1, result.getSearchResult().size());

			repository.remove(result.getSearchResult().get(0), One2One1A.class);

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(1, array.size());

			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2One1B.class);
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,10,
					One2One1A.class);
			assertEquals(0, result.getSearchResult().size());

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(0, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(0, array.size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t0001_One2One1() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();

			One2One1A o1 = (One2One1A) repository.create(One2One1A.class);
			One2One1B o2 = (One2One1B) repository.create(One2One1B.class);

			o1.setOne2One1B(o2);
			o1.setEnum1(PersonType.MALE);

			repository.insert(o1, One2One1A.class);

			List<Object> commands = stackProvider.get().getListOfCommand();
			assertEquals(1, commands.size());

			List<StorageControl> array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					10, One2One1A.class);
			assertEquals(1, result.getSearchResult().size());

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			o1 = (One2One1A) result.getSearchResult().get(0);
			assertEquals(PersonType.MALE, o1.getEnum1());
			o1.setOne2One1B(null);
			assertNull(o1.getOne2One1B());

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Updated.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(1, array.size());

			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Updated.name() }));
			assertEquals(0, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2One1B.class);
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2One1A.class);
			assertEquals(1, result.getSearchResult().size());

			repository.remove(result.getSearchResult().get(0), One2One1A.class);

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(1, array.size());

			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(0, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(0, array.size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2One1A.class);
			assertEquals(0, result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@SuppressWarnings("rawtypes")
	@Test
	public void t0002_One2One1() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();

			One2One1A o1 = (One2One1A) repository.create(One2One1A.class);

			One2One1B o2 = (One2One1B) repository.create(One2One1B.class);

			o1.setOne2One1B(o2);

			repository.insert(o1, One2One1A.class);

			List<Object> commands = stackProvider.get().getListOfCommand();
			assertEquals(1, commands.size());

			List<StorageControl> array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2One1A.class);
			assertEquals(1, result.getSearchResult().size());

			o2 = (One2One1B) repository.create(One2One1B.class);
			o1.setOne2One1B(o2);

			assertEquals(repository.getStackProvider().get().getListOfCommand().size(), 2);
			commands = stackProvider.get().getListOfCommand();
			assertEquals(2, commands.size());

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Updated.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(1, array.size());

			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2One1B.class);
			assertEquals(1, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2One1A.class);
			assertEquals(1, result.getSearchResult().size());

			array = cpaStorageProvider.get().find(One2One1A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2One1B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t0003_One2One1() {
		try {
			CpaRepository repository = storageProvider.getRepository();

			One2One1A o1 = (One2One1A) repository.create(One2One1A.class);

			One2One1B o2 = (One2One1B) repository.create(One2One1B.class);

			o1.setOne2One1B(o2);

			repository.insert(o1, One2One1A.class);

			One2One1B o2_ = o1.getOne2One1B();
			assertEquals(o2.getObjId(), o2_.getObjId());

			o1.setOne2One1B(null);

			One2One1B o3_ = o1.getOne2One1B();
			assertNull(o3_);

			try {
				o2.getObjId();
				fail();
			} catch (Exception e) {

			}

			try {
				o2_.getObjId();
				fail();
			} catch (Exception e) {

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
}
