package org.tura.platform.hr.init;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.StreetDAO;


public class StreetInit {
	private EntityManager em;

	public StreetInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		em.getTransaction().begin();

		create(1L,"Street 1 City 1 State 1 Ct 1",1L);
		create(2L,"Street 2 City 1 State 1 Ct 1",2L);
		create(3L,"Street 3 City 1 State 1 Ct 1",3L);
		create(4L,"Street 4 City 1 State 1 Ct 1",4L);

		create(5L,"Street 1 City 2 State 4 Ct 1", 1L);
		create(6L,"Street 2 City 2 State 4 Ct 1", 2L);
		create(7L,"Street 3 City 2 State 4 Ct 1", 3L);
		create(8L,"Street 4 City 2 State 4 Ct 1", 4L);

		
		create(9L,"Street 1 City 1 State 4 Ct 2",1L);
		create(10L,"Street 2 City 1 State 4 Ct 2",2L);
		create(11L,"Street 3 City 1 State 4 Ct 2",3L);
		create(12L,"Street 4 City 1 State 4 Ct 2",4L);

		create(13L,"Street 1 City 2 State 5 Ct 2",1L);
		create(14L,"Street 2 City 2 State 5 Ct 2",2L);
		create(15L,"Street 3 City 2 State 5 Ct 2",3L);
		create(16L,"Street 4 City 2 State 5 Ct 2",4L);
		
		em.getTransaction().commit();

	}
	
	private StreetDAO create(Long obj_id, String streetName, Long city_id) {
		StreetDAO dpt = new StreetDAO();
		dpt.setObjId(obj_id);
		dpt.setParentId(city_id);
		dpt.setName(streetName);
		em.persist(dpt);
		return dpt;

	}
	
		
}
