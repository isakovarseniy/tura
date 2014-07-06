package org.tura.platform.hr.init;

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.DepartmentsDAO;

public class DepartmentsInit {

	private EntityManager em;

	public DepartmentsInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		em.getTransaction().begin();
		create((long) 10, (long) 10, "Administration", (long) 200, (long) 1700);
		create((long) 20, (long) 20, "Marketing", (long) 201, (long) 1800);
		create((long) 30, (long) 30, "Purchasing", (long) 114, (long) 1700);
		create((long) 40, (long) 40, "Human Resources", (long) 203, (long) 2400);
		create((long) 50, (long) 50, "Shipping", (long) 121, (long) 1500);
		create((long) 60, (long) 60, "IT", (long) 103, (long) 1400);
		create((long) 70, (long) 70, "Public Relations", (long) 204,
				(long) 2700);
		create((long) 80, (long) 80, "Sales", (long) 145, (long) 2500);
		create((long) 90, (long) 90, "Executive", (long) 100, (long) 1700);
		create((long) 100, (long) 100, "Finance", (long) 108, (long) 1700);
		create((long) 110, (long) 110, "Accounting", (long) 205, (long) 1700);
		create((long) 120, (long) 120, "Treasury", null, (long) 1700);
		create((long) 130, (long) 130, "Corporate Tax", null, (long) 1700);
		create((long) 140, (long) 140, "Control And Credit", null, (long) 1700);
		create((long) 150, (long) 150, "Shareholder Services", null,
				(long) 1700);
		create((long) 160, (long) 160, "Benefits", null, (long) 1700);
		create((long) 170, (long) 170, "Manufacturing", null, (long) 1700);
		create((long) 180, (long) 180, "Construction", null, (long) 1700);
		create((long) 190, (long) 190, "Contracting", null, (long) 1700);
		create((long) 200, (long) 200, "Operations", null, (long) 1700);
		create((long) 210, (long) 210, "IT Support", null, (long) 1700);
		create((long) 220, (long) 220, "NOC", null, (long) 1700);
		create((long) 230, (long) 230, "IT Helpdesk", null, (long) 1700);
		create((long) 240, (long) 240, "Government Sales", null, (long) 1700);
		create((long) 250, (long) 250, "Retail Sales", null, (long) 1700);
		create((long) 260, (long) 260, "Recruiting", null, (long) 1700);
		create((long) 270, (long) 270, "Payroll", null, (long) 1700);
		em.getTransaction().commit();

	}

	private DepartmentsDAO create(Long obj_id, Long departmentId,
			String departmentName, Long managerId, Long locationId) {
		DepartmentsDAO dpt = new DepartmentsDAO();
		dpt.setObjId(obj_id);
		dpt.setDepartmentId(departmentId);
		dpt.setDepartmentName(departmentName);
		dpt.setManagerId(managerId);
		dpt.setLocationId(locationId);

		em.persist(dpt);
		return dpt;

	}

}
