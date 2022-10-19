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

package org.tura.platform.hr.init;

import java.util.ArrayList;
import java.util.Map;

import org.tura.jpa.test.Rref;
import org.tura.jpa.test.U1;
import org.tura.platform.test.spa.SearchBase;


public class UserInit {
	
	private Map<Long, Long> roleConverter;

	public UserInit(Map<Long, Long> roleConverter) {
		this.roleConverter  =  roleConverter;
	}

	
	public void init() throws Exception {
		create("sales-manager" );
	}

	private void create(String name) throws  Exception {
		U1 u1 = new U1();
		u1.setObjId(10l);
		u1.setName(name);
		
		u1.setRref(new ArrayList<>());
		
		Rref  ref =   new Rref();
		ref.setObjId(1L);
		ref.setR1Ref(roleConverter.get(20L));
		u1.getRref().add(ref);
		
		ref =   new Rref();
		ref.setObjId(2L);
		ref.setR1Ref(roleConverter.get(30L));
		u1.getRref().add(ref);
		
		SearchBase.put( Long.parseLong("10")  , u1, U1.class.getName());
		
	}	
}
