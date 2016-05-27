/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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

import java.text.ParseException;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.jpa.simple.model.VehicleJPA;

public class VehicleInit {

	private EntityManager em;

	public VehicleInit(EntityManager em) {
		this.em = em;
	}

	public void init() throws ParseException {

		create(1L,100L,"Honda","AABB");
		create(2L,100L,"Ford","CCEE");

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
