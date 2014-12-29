package org.tura.platform.hr.init;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.CountryDAO;


public class CountryInit {

	private EntityManager em;

	public CountryInit(EntityManager em) {
		this.em = em;
	}
	
	public void init() {
		em.getTransaction().begin();

		create(1L,"Country 1",1L);
		create(2L,"Country 2",2L);
		create(3L,"Country 3",1L);
		
		em.getTransaction().commit();

	}

	private CountryDAO create(Long obj_id, String countryName, Long companyid) {
		CountryDAO dpt = new CountryDAO();
		dpt.setObjId(obj_id);
		dpt.setName(countryName);
		dpt.setParentId(companyid);
		em.persist(dpt);
		return dpt;

	}	
	
}
