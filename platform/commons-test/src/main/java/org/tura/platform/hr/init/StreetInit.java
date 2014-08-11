package org.tura.platform.hr.init;

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.StreetDAO;

public class StreetInit {
	private EntityManager em;

	public StreetInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		em.getTransaction().begin();

		create(1L,"Street 1 City 1 State 1 Ct 1",1700L);
		create(2L,"Street 2 City 1 State 1 Ct 1",2500L);
		create(3L,"Street 3 City 1 State 1 Ct 1",2500L);
		create(4L,"Street 4 City 1 State 1 Ct 1",2500L);

		create(5L,"Street 1 City 2 State 4 Ct 1", 1800L);
		create(6L,"Street 2 City 2 State 4 Ct 1", 2400L);
		create(7L,"Street 3 City 2 State 4 Ct 1", 2400L);
		create(8L,"Street 4 City 2 State 4 Ct 1", 2700L);

		
		create(9L,"Street 1 City 1 State 4 Ct 2",2400L);
		create(10L,"Street 2 City 1 State 4 Ct 2",1700L);
		create(11L,"Street 3 City 1 State 4 Ct 2",1700L);
		create(12L,"Street 4 City 1 State 4 Ct 2",1500L);

		create(13L,"Street 1 City 2 State 5 Ct 2",1500L);
		create(14L,"Street 2 City 2 State 5 Ct 2",1500L);
		create(15L,"Street 3 City 2 State 5 Ct 2",1500L);
		create(16L,"Street 4 City 2 State 5 Ct 2",2400L);
		
		em.getTransaction().commit();

	}
	
	private StreetDAO create(Long obj_id, String streetName, Long city_id) {
		StreetDAO dpt = new StreetDAO();
		dpt.setObjId(obj_id);
		dpt.setParentId(city_id);
		dpt.setStreetName(streetName);
		em.persist(dpt);
		return dpt;

	}
	
		
}
