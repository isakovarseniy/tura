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

package org.tura.platform.repository.mixed.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.tura.jpa.test.OneWay1A;
import org.tura.jpa.test.OneWay2A;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.data.AddContainmentObjectData;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.UpdateObjectData;

public class DiffOne2OneTest extends AbstractDiffCommon{

	@Test
	public void t1_one2oneDifTest() {
		try {
			OneWay1A oneWay1A = initObject();

			objects.test.serialazable.jpa.OneWay1A proxyOneWay1A = getProxyObject(oneWay1A);

			oneWay1A.setObjId(1234L);
			oneWay1A.getOneWay2A().setName("newName");

			diff(oneWay1A, proxyOneWay1A);

			assertEquals(2, sp.get().getListOfCommand().size());

			UpdateObjectData cmd = (UpdateObjectData) sp.get().getListOfCommand().get(0);
			assertEquals("ObjId", cmd.getProperty());
			assertEquals(1234L, cmd.getValue());
			assertEquals(1, cmd.getPk().getPath().size());

			RepoObjectKey key = cmd.getPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());

			cmd = (UpdateObjectData) sp.get().getListOfCommand().get(1);
			assertEquals("Name", cmd.getProperty());
			assertEquals("newName", cmd.getValue());
			
			key = cmd.getPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1234", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			
			key = cmd.getPk().getPath().get(1);
			assertEquals(objects.test.serialazable.jpa.OneWay2A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("2", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t2_one2oneDifTest() {
		try {
			OneWay1A oneWay1A = initObject();
			objects.test.serialazable.jpa.OneWay1A proxyOneWay1A = getProxyObject(oneWay1A);
			oneWay1A.getOneWay2A().setObjId(567L);

			diff(oneWay1A, proxyOneWay1A);

			assertEquals(3, sp.get().getListOfCommand().size());
			
			RemoveContainmentObjectData rCmd = (RemoveContainmentObjectData) sp.get().getListOfCommand().get(0);
			assertEquals("OneWay2A", rCmd.getMasterProperty());
			assertEquals("OneWay1A", rCmd.getDetailProperty());
			
			RepoObjectKey key = rCmd.getMasterPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			objects.test.serialazable.jpa.OneWay2A object = (objects.test.serialazable.jpa.OneWay2A) rCmd.getObject();
			assertEquals( Long.valueOf(2L), object.getObjId());
			
			AddContainmentObjectData aCmd = (AddContainmentObjectData) sp.get().getListOfCommand().get(1);
			assertEquals("OneWay2A", aCmd.getMasterProperty());
			assertEquals("OneWay1A", aCmd.getDetailProperty());
			
			key = aCmd.getMasterPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());

			object = (objects.test.serialazable.jpa.OneWay2A) aCmd.getObject();
			assertEquals( Long.valueOf(567L), object.getObjId());
	
			
			UpdateObjectData cmd = (UpdateObjectData) sp.get().getListOfCommand().get(2);
			assertEquals("Name", cmd.getProperty());
			assertEquals("name2", cmd.getValue());
			assertEquals(2, cmd.getPk().getPath().size());

			key = cmd.getPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			key = cmd.getPk().getPath().get(1);
			assertEquals(objects.test.serialazable.jpa.OneWay2A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("567", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t3_one2oneDifTest() {
		try {
			OneWay1A oneWay1A = initObject();
			objects.test.serialazable.jpa.OneWay1A proxyOneWay1A = getProxyObject(oneWay1A);

			oneWay1A.setOneWay2A(null);

			diff(oneWay1A, proxyOneWay1A);
	
			
			assertEquals(1, sp.get().getListOfCommand().size());

			RemoveContainmentObjectData rCmd = (RemoveContainmentObjectData) sp.get().getListOfCommand().get(0);
			assertEquals("OneWay2A", rCmd.getMasterProperty());
			assertEquals("OneWay1A", rCmd.getDetailProperty());
			
			RepoObjectKey key = rCmd.getMasterPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			objects.test.serialazable.jpa.OneWay2A object = (objects.test.serialazable.jpa.OneWay2A) rCmd.getObject();
			assertEquals( Long.valueOf(2L), object.getObjId());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t4_one2oneDifTest() {
		try {
			OneWay1A oneWay1A = initObject();
			oneWay1A.setOneWay2A(null);
			objects.test.serialazable.jpa.OneWay1A proxyOneWay1A = getProxyObject(oneWay1A);
	
			OneWay2A oneWay2A = new OneWay2A();
			oneWay2A.setObjId(2L);
			oneWay2A.setName("name2");
			oneWay1A.setOneWay2A(oneWay2A);
			
			diff(oneWay1A, proxyOneWay1A);
	
			assertEquals(2, sp.get().getListOfCommand().size());

			AddContainmentObjectData aCmd = (AddContainmentObjectData) sp.get().getListOfCommand().get(0);
			assertEquals("OneWay2A", aCmd.getMasterProperty());
			assertEquals("OneWay1A", aCmd.getDetailProperty());
			
			RepoObjectKey key = aCmd.getMasterPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());

			objects.test.serialazable.jpa.OneWay2A object = (objects.test.serialazable.jpa.OneWay2A) aCmd.getObject();
			assertEquals( Long.valueOf(2), object.getObjId());
			
			UpdateObjectData cmd = (UpdateObjectData) sp.get().getListOfCommand().get(1);
			assertEquals("Name", cmd.getProperty());
			assertEquals("name2", cmd.getValue());
			assertEquals(2, cmd.getPk().getPath().size());

			key = cmd.getPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			key = cmd.getPk().getPath().get(1);
			assertEquals(objects.test.serialazable.jpa.OneWay2A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("2", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	


}
