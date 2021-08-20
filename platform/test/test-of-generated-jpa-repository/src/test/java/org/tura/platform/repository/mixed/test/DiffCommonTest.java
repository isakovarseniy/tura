/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.jpa.test.OneWay1A;
import org.tura.jpa.test.OneWay2A;
import org.tura.jpa.test.OneWay3A;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.mapper.OneWay1AMapper;

public class DiffCommonTest {

	
	CommadStackProvider sp = new CommadStackProvider();
	ProxyRepository proxyRepository = new ProxyRepository(null, sp);

	protected OneWay1A initObject() {
		OneWay1A oneWay1A = new OneWay1A();
		oneWay1A.setObjId(1L);
		oneWay1A.setType("type1");

		OneWay2A oneWay2A = new OneWay2A();
		oneWay2A.setObjId(2L);
		oneWay2A.setName("name2");

		oneWay1A.setOneWay2A(oneWay2A);
		

		oneWay1A.setOneWay3A(new ArrayList<>());
		
		OneWay3A oneWay3A = new OneWay3A();
		oneWay3A.setObjId(3L);
		oneWay3A.setName("name3");
		oneWay1A.getOneWay3A().add(oneWay3A);

		
		oneWay3A = new OneWay3A();
		oneWay3A.setObjId(4L);
		oneWay3A.setName("name4");
		oneWay1A.getOneWay3A().add(oneWay3A);
		
		

		return oneWay1A;

	}
	
	
	protected void diff(OneWay1A oneWay1A, objects.test.serialazable.jpa.OneWay1A proxyOneWay1A) throws Exception {
		OneWay1AMapper mapper = new OneWay1AMapper();
        mapper.setProxyFactory(proxyRepository);
		mapper.copyPKFromPersistence2Repository(oneWay1A , proxyOneWay1A );
		Object objPk =  mapper.getPrimaryKeyFromRepositoryObject(proxyOneWay1A);
	    Map<Object, Object> context = new HashMap<>();
		mapper.put(context, objPk, oneWay1A);
		mapper.differentiator(oneWay1A, proxyOneWay1A, context);
		
	}

	protected objects.test.serialazable.jpa.OneWay1A getProxyObject(OneWay1A oneWay1A) throws Exception {

		OneWay1AMapper mapper = new OneWay1AMapper();

		objects.test.serialazable.jpa.OneWay1A oneWay1ACloned = new objects.test.serialazable.jpa.OneWay1A();
		mapper.copyFromPersistence2Repository(oneWay1A, oneWay1ACloned);

		objects.test.serialazable.jpa.OneWay1A proxyOneWay1A = (objects.test.serialazable.jpa.OneWay1A) proxyRepository
				.factory(oneWay1ACloned, objects.test.serialazable.jpa.OneWay1A.class.getName());

		return proxyOneWay1A;
	}

	class CommadStackProvider implements ProxyCommadStackProvider {

		private List<Object> commands = new ArrayList<>();

		private static final long serialVersionUID = 1L;

		@Override
		public void addCommand(Object cmd) throws Exception {
			commands.add(cmd);

		}

		@Override
		public List<Object> getListOfCommand() throws Exception {
			return commands;
		}

		@Override
		public void clear() throws Exception {
			commands.clear();

		}

	}
	
}
