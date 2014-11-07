package org.tura.platform.hr.init;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.CityDAO;


public class CityInit {
	private EntityManager em;

	public CityInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		em.getTransaction().begin();

		create(1L,"City 1 State 1 Ct 1",1L);
		create(2L,"City 2 State 4 Ct 1", 4L);
		create(3L,"City 1 State 4 Ct 2",9L);
		create(4L,"City 2 State 5 Ct 2",10L);
		
		em.getTransaction().commit();

	}
	
	private CityDAO create(Long obj_id, String cityName, Long state_id) {
		CityDAO dpt = new CityDAO();
		dpt.setObjId(obj_id);
		dpt.setParentId(state_id);
		dpt.setCityName(cityName);
		em.persist(dpt);
		return dpt;

	}
	
}
