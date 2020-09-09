/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import org.tura.platform.hr.objects.jpa.City;



public class CityInit {
	private EntityManager em;

	public CityInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		create(1L,"City 1 State 1 Ct 1",1L);
		create(2L,"City 2 State 4 Ct 1", 4L);
		create(3L,"City 1 State 4 Ct 2",9L);
		create(4L,"City 2 State 5 Ct 2",9L);
		

	}
	
	private City create(Long obj_id, String cityName, Long state_id) {
		City dpt = new City();
		dpt.setObjId(obj_id);
		dpt.setParentId(state_id);
		dpt.setName(cityName);
		em.persist(dpt);
		return dpt;

	}
	
}
