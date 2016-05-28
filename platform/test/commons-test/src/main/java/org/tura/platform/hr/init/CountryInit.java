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

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.jpa.simple.model.CountryJPA;


public class CountryInit {

	private EntityManager em;

	public CountryInit(EntityManager em) {
		this.em = em;
	}
	
	public void init() {

		create(1L,"Country 1",1L);
		create(2L,"Country 2",2L);
		create(3L,"Country 3",1L);
		

	}

	private CountryJPA create(Long obj_id, String countryName, Long companyid) {
		CountryJPA dpt = new CountryJPA();
		dpt.setObjId(obj_id);
		dpt.setName(countryName);
		dpt.setParentId(companyid);
		em.persist(dpt);
		return dpt;

	}	
	
}