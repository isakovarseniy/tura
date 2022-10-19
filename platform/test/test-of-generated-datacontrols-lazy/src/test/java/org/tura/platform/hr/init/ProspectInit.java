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

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.jpa.Prospect;


public class ProspectInit {

	private EntityManager em;

	public ProspectInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		create(1L, "Prospect");

	}

	private Prospect create(Long obj_id, String prospectName) {
		Prospect dpt = new Prospect();
//		dpt.setObjId(obj_id);
		dpt.setName(prospectName);
		em.persist(dpt);
		return dpt;
	}
}
