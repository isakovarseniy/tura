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
		create(1L,"Street 2 City 1 State 1 Ct 1",2500L);
		create(1L,"Street 3 City 1 State 1 Ct 1",2500L);
		create(1L,"Street 4 City 1 State 1 Ct 1",2500L);

		create(2L,"Street 1 City 2 State 4 Ct 1", 1800L);
		create(2L,"Street 2 City 2 State 4 Ct 1", 2400L);
		create(2L,"Street 3 City 2 State 4 Ct 1", 2400L);
		create(2L,"Street 4 City 2 State 4 Ct 1", 2700L);

		
		create(3L,"Street 1 City 1 State 4 Ct 2",2400L);
		create(3L,"Street 2 City 1 State 4 Ct 2",1700L);
		create(3L,"Street 3 City 1 State 4 Ct 2",1700L);
		create(3L,"Street 4 City 1 State 4 Ct 2",1500L);

		create(4L,"Street 1 City 2 State 5 Ct 2",1500L);
		create(4L,"Street 2 City 2 State 5 Ct 2",1500L);
		create(4L,"Street 3 City 2 State 5 Ct 2",1500L);
		create(4L,"Street 4 City 2 State 5 Ct 2",2400L);
		
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
