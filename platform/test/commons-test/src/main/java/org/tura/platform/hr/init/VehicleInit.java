package org.tura.platform.hr.init;

import java.text.ParseException;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.jpa.simple.model.VehicleJPA;

public class VehicleInit {

	private EntityManager em;

	public VehicleInit(EntityManager em) {
		this.em = em;
	}

	public void init() throws ParseException {
		em.getTransaction().begin();

		create(1L,100L,"Honda","AABB");
		create(2L,100L,"Ford","CCEE");

		em.getTransaction().commit();
		
	}
	
	private void create(Long obj_id, Long parentId, String vehicleMaker,String plateNumber) {
		VehicleJPA vehicle = new VehicleJPA();
		vehicle.setObjId(obj_id);
		vehicle.setParentId(parentId);
		vehicle.setVehicleMaker(vehicleMaker);
		vehicle.setPlateNumber(plateNumber);
		
		em.persist(vehicle);

	}
	
	
}
