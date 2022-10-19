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

import java.util.Map;

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.jpa.UserKk;


public class UserInit {
	private EntityManager em;
	private Map<Long,Long> userConverter ;

	public UserInit(EntityManager em,Map<Long,Long> userConverter ) {
		this.em = em;
		this.userConverter  = userConverter;
	}

	public void init() {
		create(1L, "User 1");
		create(2L, "User 2");

	}

	private UserKk create(Long obj_id, String userName) {
		UserKk dpt = new UserKk();
//		dpt.setObjId(obj_id);
		dpt.setName(userName);
		
		em.persist(dpt);
		em.flush();
		
		userConverter.put(obj_id, dpt.getObjId());
		
		return dpt;

	}

}
