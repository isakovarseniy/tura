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
import org.tura.jpa.test.OneWay3A;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.data.AddContainmentObjectData;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.UpdateObjectData;

public class DiffOne2ManyTest  extends AbstractDiffCommon{

	@Test
	public void t1_one2ManyDifTest() {
		try {
			OneWay1A oneWay1A = initObject();

			objects.test.serialazable.jpa.OneWay1A proxyOneWay1A = getProxyObject(oneWay1A);

			oneWay1A.setObjId(1234L);
			oneWay1A.getOneWay3A().iterator().next().setName("newName");;
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
			
			key = cmd.getPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1234", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			key = cmd.getPk().getPath().get(1);
			assertEquals(objects.test.serialazable.jpa.OneWay3A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("3", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	@Test
	public void t2_one2ManyDifTest() {
		try {
			OneWay1A oneWay1A = initObject();

			objects.test.serialazable.jpa.OneWay1A proxyOneWay1A = getProxyObject(oneWay1A);

			oneWay1A.setObjId(1234L);
			oneWay1A.getOneWay3A().iterator().next().setObjId(567L);
			diff(oneWay1A, proxyOneWay1A);
			
			assertEquals(4, sp.get().getListOfCommand().size());
			
			UpdateObjectData cmd = (UpdateObjectData) sp.get().getListOfCommand().get(0);
			assertEquals("ObjId", cmd.getProperty());
			assertEquals(1234L, cmd.getValue());
			assertEquals(1, cmd.getPk().getPath().size());

			RepoObjectKey key = cmd.getPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			

			AddContainmentObjectData aCmd = (AddContainmentObjectData) sp.get().getListOfCommand().get(1);
			assertEquals("OneWay3A", aCmd.getMasterProperty());
			assertEquals("OneWay1A", aCmd.getDetailProperty());
			
			key = aCmd.getMasterPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1234", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());

			objects.test.serialazable.jpa.OneWay3A object = (objects.test.serialazable.jpa.OneWay3A) aCmd.getObject();
			assertEquals( Long.valueOf(567L), object.getObjId());
			
			
			cmd = (UpdateObjectData) sp.get().getListOfCommand().get(2);
			assertEquals("Name", cmd.getProperty());
			assertEquals("name3", cmd.getValue());
			assertEquals(2, cmd.getPk().getPath().size());

			key = cmd.getPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1234", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			key = cmd.getPk().getPath().get(1);
			assertEquals(objects.test.serialazable.jpa.OneWay3A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("567", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			
			RemoveContainmentObjectData rCmd = (RemoveContainmentObjectData) sp.get().getListOfCommand().get(3);
			assertEquals("OneWay3A", rCmd.getMasterProperty());
			assertEquals("OneWay1A", rCmd.getDetailProperty());
			
			key = rCmd.getMasterPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1234", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			object = (objects.test.serialazable.jpa.OneWay3A) rCmd.getObject();
			assertEquals( Long.valueOf(3L), object.getObjId());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	@Test
	public void t3_one2ManyDifTest() {
		try {
			OneWay1A oneWay1A = initObject();
			objects.test.serialazable.jpa.OneWay1A proxyOneWay1A = getProxyObject(oneWay1A);


			OneWay3A oneWay3A = new OneWay3A();
			oneWay3A.setObjId(5L);
			oneWay3A.setName("name5");
			oneWay1A.getOneWay3A().add(oneWay3A);

			
			diff(oneWay1A, proxyOneWay1A);
			
			
			assertEquals(2, sp.get().getListOfCommand().size());
			
			AddContainmentObjectData aCmd = (AddContainmentObjectData) sp.get().getListOfCommand().get(0);
			assertEquals("OneWay3A", aCmd.getMasterProperty());
			assertEquals("OneWay1A", aCmd.getDetailProperty());
			
			RepoObjectKey key = aCmd.getMasterPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());

			objects.test.serialazable.jpa.OneWay3A object = (objects.test.serialazable.jpa.OneWay3A) aCmd.getObject();
			assertEquals( Long.valueOf(5), object.getObjId());
			
			
			UpdateObjectData cmd = (UpdateObjectData) sp.get().getListOfCommand().get(1);
			assertEquals("Name", cmd.getProperty());
			assertEquals("name5", cmd.getValue());
			assertEquals(2, cmd.getPk().getPath().size());

			key = cmd.getPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());
			
			key = cmd.getPk().getPath().get(1);
			assertEquals(objects.test.serialazable.jpa.OneWay3A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("5", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void t4_one2ManyDifTest() {
		try {
			OneWay1A oneWay1A = initObject();
			objects.test.serialazable.jpa.OneWay1A proxyOneWay1A = getProxyObject(oneWay1A);


			OneWay3A oneWay3A = oneWay1A.getOneWay3A().iterator().next();
			oneWay1A.getOneWay3A().remove(oneWay3A);

			
			diff(oneWay1A, proxyOneWay1A);
			
			
			assertEquals(1, sp.get().getListOfCommand().size());
			
			RemoveContainmentObjectData aCmd = (RemoveContainmentObjectData) sp.get().getListOfCommand().get(0);
			assertEquals("OneWay3A", aCmd.getMasterProperty());
			assertEquals("OneWay1A", aCmd.getDetailProperty());
			
			RepoObjectKey key = aCmd.getMasterPk().getPath().get(0);
			assertEquals(objects.test.serialazable.jpa.OneWay1A.class.getName(), key.getType());
			assertEquals("ObjId", key.getKey().get(0).getName());
			assertEquals("1", key.getKey().get(0).getValue());
			assertEquals(Long.class.getName(), key.getKey().get(0).getType());

			objects.test.serialazable.jpa.OneWay3A object = (objects.test.serialazable.jpa.OneWay3A) aCmd.getObject();
			assertEquals( Long.valueOf(3), object.getObjId());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	
}
