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

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.jpa.Company;


public class CompanyInit {
	private EntityManager em;

	public CompanyInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		create(1L, "Company 1");
		create(2L, "Company 2");

	}

	private Company create(Long obj_id, String companyName) {
		Company dpt = new Company();
		dpt.setObjId(obj_id);
		dpt.setCompanyName(companyName);
		em.persist(dpt);
		return dpt;

	}

}
