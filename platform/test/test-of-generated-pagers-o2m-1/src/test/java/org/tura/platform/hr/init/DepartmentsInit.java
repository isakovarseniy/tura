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

import org.tura.jpa.test.Department1;

public class DepartmentsInit {

	private EntityManager em;

	public DepartmentsInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		create((long) 10, (long) 10, "Administration", (long) 200, 1L);
		create((long) 20, (long) 20, "Marketing", (long) 201, 1L);
		create((long) 30, (long) 30, "Purchasing", (long) 114, 2L);
		create((long) 40, (long) 40, "Human Resources", (long) 203, 2L);
		create((long) 50, (long) 50, "Shipping", (long) 121, 2L);
		create((long) 60, (long) 60, "IT", (long) 103, 3L);
		create((long) 70, (long) 70, "Public Relations", (long) 204, 3L);
		create((long) 80, (long) 80, "Sales", (long) 145, 4L);
		create((long) 90, (long) 90, "Executive", (long) 100, 4L);
		create((long) 100, (long) 100, "Finance", (long) 108, 5L);
		create((long) 110, (long) 110, "Accounting", (long) 205, 5L);
		create((long) 120, (long) 120, "Treasury", null, 6L);
		create((long) 130, (long) 130, "Corporate Tax", null, 6L);
		create((long) 140, (long) 140, "Control And Credit", null, 6L);
		create((long) 150, (long) 150, "Shareholder Services", null, 6L);
		create((long) 160, (long) 160, "Benefits", null, 7L);
		create((long) 170, (long) 170, "Manufacturing", null,7L);
		create((long) 180, (long) 180, "Construction", null, 7L);
		create((long) 190, (long) 190, "Contracting", null, 7L);
		create((long) 200, (long) 200, "Operations", null, 12L);
		create((long) 210, (long) 210, "IT Support", null, 12L);
		create((long) 220, (long) 220, "NOC", null, 12L);
		create((long) 230, (long) 230, "IT Helpdesk", null, 12L);
		create((long) 240, (long) 240, "Government Sales", null,12L);
		create((long) 250, (long) 250, "Retail Sales", null, 12L);
		create((long) 260, (long) 260, "Recruiting", null, 12L);
		create((long) 270, (long) 270, "Payroll", null, 12L);

	}

	private Department1 create(Long obj_id, Long departmentId,
			String departmentName, Long managerId, Long locationId) {
		Department1 dpt = new Department1();
		dpt.setObjId(obj_id);
		dpt.setDepartmentId(departmentId);
		dpt.setDepartmentName(departmentName);
		dpt.setManagerId(managerId);
		dpt.setLocationId(locationId);
		dpt.setParentId(locationId);
		

		em.persist(dpt);
		return dpt;

	}

}
