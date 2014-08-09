package org.tura.platform.hr.init;

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.StateDAO;

public class StateInit {

	private EntityManager em;

	public StateInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		em.getTransaction().begin();
		
		create(1L,"State 1 Ct 1", 1L);
		create(2L,"State 2 Ct 1", 1L);
		create(3L,"State 3 Ct 1", 1L);
		create(4L,"State 4 Ct 1", 1L);
		create(5L,"State 5 Ct 1", 1L);

		create(6L,"State 1 Ct 2", 2L);
		create(7L,"State 2 Ct 2", 2L);
		create(8L,"State 3 Ct 2", 2L);
		create(9L,"State 4 Ct 2", 2L);
		create(10L,"State 5 Ct 2", 2L);

		em.getTransaction().commit();

	}

	private StateDAO create(Long obj_id, String stateName, Long country_id) {
		StateDAO dpt = new StateDAO();
		dpt.setObjId(obj_id);
		dpt.setParentId(country_id);
		dpt.setStateName(stateName);
		em.persist(dpt);
		return dpt;

	}

}
