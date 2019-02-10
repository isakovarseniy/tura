/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
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

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.jpa.Street;


public class StreetInit {
	private EntityManager em;

	public StreetInit(EntityManager em) {
		this.em = em;
	}

	public void init() {

		create(1L,"Street 1 City 1 State 1 Ct 1",1L);
		create(2L,"Street 2 City 1 State 1 Ct 1",2L);
		create(3L,"Street 3 City 1 State 1 Ct 1",3L);
		create(4L,"Street 4 City 1 State 1 Ct 1",4L);

		create(5L,"Street 1 City 2 State 4 Ct 1", 1L);
		create(6L,"Street 2 City 2 State 4 Ct 1", 2L);
		create(7L,"Street 3 City 2 State 4 Ct 1", 3L);
		create(8L,"Street 4 City 2 State 4 Ct 1", 4L);

		
		create(9L,"Street 1 City 1 State 4 Ct 2",1L);
		create(10L,"Street 2 City 1 State 4 Ct 2",2L);
		create(11L,"Street 3 City 1 State 4 Ct 2",3L);
		create(12L,"Street 4 City 1 State 4 Ct 2",4L);

		create(13L,"Street 1 City 2 State 5 Ct 2",1L);
		create(14L,"Street 2 City 2 State 5 Ct 2",2L);
		create(15L,"Street 3 City 2 State 5 Ct 2",3L);
		create(16L,"Street 4 City 2 State 5 Ct 2",4L);
		

	}
	
	private Street create(Long obj_id, String streetName, Long city_id) {
		Street dpt = new Street();
		dpt.setObjId(obj_id);
		dpt.setParentId(city_id);
		dpt.setName(streetName);
		em.persist(dpt);
		return dpt;

	}
	
		
}
