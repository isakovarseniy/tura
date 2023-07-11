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

package org.tura.platform.hr.init;

import java.util.Map;

import javax.persistence.EntityManager;

import org.tura.jpa.test.R1;

public class RoleInit {

	private EntityManager em;
	private Map<Long, Long> roletConverter;

	public RoleInit(EntityManager em, Map<Long, Long> roletConverter) {
		this.em = em;
		this.roletConverter = roletConverter;

	}

	public void init() {
		create((long) 10, "admin");
		create((long) 20, "ui-access");
		create((long) 30, "offline-access");
		create((long) 40, "kie-server");
		create((long) 50, "restAll");
		create((long) 60, "manager");
	}

	private R1 create(Long obj_id, String roleName) {
		R1 role = new R1();
		role.setName(roleName);
		em.persist(role);
		roletConverter.put(obj_id, role.getObjId());
		return role;
	}

}
