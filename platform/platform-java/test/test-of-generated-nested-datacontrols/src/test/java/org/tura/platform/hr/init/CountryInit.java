/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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

import org.tura.platform.hr.objects.jpa.Company;
import org.tura.platform.hr.objects.jpa.Country;


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

	private Country create(Long obj_id, String countryName, Long companyid) {
		Country dpt = new Country();
		dpt.setObjId(obj_id);
		dpt.setName(countryName);
		
		Company cmp = em.find(Company.class, companyid);
		if ( cmp.getCountry() == null){
			cmp.setCountry(new ArrayList<Country>()); 	     
		}
		cmp.getCountry().add(dpt);
		dpt.setCompany(cmp);

		em.persist(dpt);
		em.persist(cmp);
		
		
		return dpt;

	}	
	
}
