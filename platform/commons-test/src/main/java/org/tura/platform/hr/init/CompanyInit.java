package org.tura.platform.hr.init;

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.CompanyDAO;

public class CompanyInit {
	private EntityManager em;

	public CompanyInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		em.getTransaction().begin();
		create(1L, "Company 1");
		create(2L, "Company 2");
		em.getTransaction().commit();

	}

	private CompanyDAO create(Long obj_id, String companyName) {
		CompanyDAO dpt = new CompanyDAO();
		dpt.setObjId(obj_id);
		dpt.setCompanyName(companyName);
		em.persist(dpt);
		return dpt;

	}

}
