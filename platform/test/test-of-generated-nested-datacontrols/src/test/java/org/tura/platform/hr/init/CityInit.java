/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.hr.init;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.jpa.City;
import org.tura.platform.hr.objects.jpa.State;



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
		dpt.setName(cityName);
		
		State cmp = em.find(State.class, state_id);
		if ( cmp.getCity() == null){
			cmp.setCity(new ArrayList<City>()); 	     
		}
		cmp.getCity().add(dpt);
		
		em.persist(dpt);
		return dpt;

	}
	
}
