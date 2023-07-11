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

import java.util.ArrayList;
import java.util.Map;

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.jpa.Company;
import org.tura.platform.hr.objects.jpa.Country;


public class CountryInit {

	private EntityManager em;
	private Map<Long,Long> countryConverter;
	private Map<Long,Long> companyConverter ;

	public CountryInit(EntityManager em, Map<Long,Long> companyConverter , Map<Long,Long> countryConverter) {
		this.em = em;
		this.countryConverter = countryConverter;
		this.companyConverter = companyConverter;
	}
	
	public void init() {

		create(1L,"Country 1",1L);
		create(2L,"Country 2",2L);
		create(3L,"Country 3",1L);
		

	}

	private Country create(Long obj_id, String countryName, Long companyid) {
		Country dpt = new Country();
//		dpt.setObjId(obj_id);
		dpt.setName(countryName);
		
		Company cmp = em.find(Company.class, this.companyConverter.get( companyid));
		if ( cmp.getCountry() == null){
			cmp.setCountry(new ArrayList<Country>()); 	     
		}
		cmp.getCountry().add(dpt);
		dpt.setCompany(cmp);

		em.persist(dpt);
		em.persist(cmp);
		em.flush();
		
		countryConverter.put(obj_id, dpt.getObjId());

		
		return dpt;

	}	
	
}
