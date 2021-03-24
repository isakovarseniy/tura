/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.hr.init;

import java.text.ParseException;
import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.tura.platform.hr.objects.jpa.Department;
import org.tura.platform.hr.objects.jpa.Vehicle;

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
		Vehicle vehicle = new Vehicle();
		vehicle.setObjId(obj_id);
		vehicle.setVehicleMaker(vehicleMaker);
		vehicle.setPlateNumber(plateNumber);
		
		Department cmp = em.find(Department.class, parentId);
		if ( cmp.getVehicle() == null){
			cmp.setVehicle(new ArrayList<Vehicle>()); 	     
		}
		cmp.getVehicle().add(vehicle);
		
		
		
		em.persist(vehicle);

	}
	
	
}
