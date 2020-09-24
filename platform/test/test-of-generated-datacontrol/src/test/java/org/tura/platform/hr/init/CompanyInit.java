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

import java.util.Map;

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.jpa.Company;


public class CompanyInit {
	private EntityManager em;
	private Map<Long,Long> companyConverter ;

	public CompanyInit(EntityManager em,Map<Long,Long> companyConverter ) {
		this.em = em;
		this.companyConverter = companyConverter;
	}

	public void init() {
		create(1L, "Company 1");
		create(2L, "Company 2");

	}

	private Company create(Long obj_id, String companyName) {
		Company dpt = new Company();
//		dpt.setObjId(obj_id);
		dpt.setCompanyName(companyName);
		
		em.persist(dpt);
		em.flush();
		companyConverter.put(obj_id, dpt.getObjId());

		return dpt;

	}

}
