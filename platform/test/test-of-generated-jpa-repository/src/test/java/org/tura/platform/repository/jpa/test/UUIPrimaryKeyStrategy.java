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

package org.tura.platform.repository.jpa.test;

import java.util.UUID;

import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.repository.core.PrImaryKeyStrategy;

import objects.test.serialazable.jpa.A2;
import objects.test.serialazable.jpa.A3;
import objects.test.serialazable.jpa.A4;
import objects.test.serialazable.jpa.A5;
import objects.test.serialazable.jpa.Customer;
import objects.test.serialazable.jpa.F2;
import objects.test.serialazable.jpa.JPAObject1;
import objects.test.serialazable.jpa.JPAObject2;
import objects.test.serialazable.jpa.JPAObject3;
import objects.test.serialazable.jpa.JPAObject4;
import objects.test.serialazable.jpa.JPAObject5;
import objects.test.serialazable.jpa.JPAObject6;
import objects.test.serialazable.jpa.JPAObject7;
import objects.test.serialazable.jpa.JPAObject8;
import objects.test.serialazable.jpa.Location;
import objects.test.serialazable.jpa.LocationMany2ManyCustomerRelation;
import objects.test.serialazable.jpa.Order;
import objects.test.serialazable.jpa.SPAObject1;
import objects.test.serialazable.jpa.SPAObject2;
import objects.test.serialazable.jpa.SPAObject3;
import objects.test.serialazable.jpa.SPAObject4;
import objects.test.serialazable.jpa.SPAObject7;
import objects.test.serialazable.jpa.SPAObject8;
import objects.test.serialazable.jpa.Vehicle;

public class UUIPrimaryKeyStrategy implements PrImaryKeyStrategy{

	private static final long serialVersionUID = -8674066159162319557L;
	private static long sequence;
	private  boolean ordered = false;

	public UUIPrimaryKeyStrategy() {
		
	}
	
	public UUIPrimaryKeyStrategy(boolean ordered) {
		this.ordered = true;
	}
	
	
	private  long getSequence() {
		if (ordered ) {
			sequence ++;
			return sequence;
		}else {
			return UUID.randomUUID().getMostSignificantBits();
		}
	}
	
	@Override
	public void generatePk(Object o) {
		try{
			
		if (o instanceof Customer){
			((Customer)o).setCustomerId(getSequence());
			return;
		}

		if (o instanceof Vehicle){
			((Vehicle)o).setObjId(getSequence());
			return;
		}
		
		if (o instanceof Order){
			((Order)o).setOrderId(getSequence());
			return;
		}
		
		if (o instanceof Location){
			((Location)o).setObjId(getSequence());
			return;
		}		
		
		if (o instanceof JPAObject1){
			((JPAObject1)o).setJpaObj1(getSequence());
			return;
		}		
		if (o instanceof JPAObject2){
			((JPAObject2)o).setJpaObj2(getSequence());
			return;
		}		
		
		if (o instanceof JPAObject3){
			((JPAObject3)o).setJpaObj3(getSequence());
			return;
		}		
		
		if (o instanceof JPAObject4){
			((JPAObject4)o).setJpaObj4(getSequence());
			return;
		}		


		if (o instanceof JPAObject5){
			((JPAObject5)o).setJpaObj5(getSequence());
			return;
		}		
		
		if (o instanceof JPAObject6){
			((JPAObject6)o).setJpaObj6(getSequence());
			return;
		}		

		
		if (o instanceof JPAObject7){
			((JPAObject7)o).setJpaObj7(getSequence());
			return;
		}		

		if (o instanceof JPAObject8){
			((JPAObject8)o).setJpaObj8(getSequence());
			return;
		}		

		
		
		if (o instanceof SPAObject1){
			((SPAObject1)o).setSpaObj1(getSequence());
			return;
		}
		
		if (o instanceof org.tura.jpa.test.SPAObject1){
			((org.tura.jpa.test.SPAObject1)o).setSpaObj1(getSequence());
			return;
		}		
		
		
		if (o instanceof SPAObject2){
			((SPAObject2)o).setSpaObj2(getSequence());
			return;
		}		

		if (o instanceof org.tura.jpa.test.SPAObject2){
			((org.tura.jpa.test.SPAObject2)o).setSpaObj2(getSequence());
			return;
		}		

		
		
		if (o instanceof SPAObject3){
			((SPAObject3)o).setSpaObj3(getSequence());
			return;
		}		
		
		if (o instanceof org.tura.jpa.test.SPAObject3){
			((org.tura.jpa.test.SPAObject3)o).setSpaObj3(getSequence());
			return;
		}		
		
		
		
		if (o instanceof SPAObject4){
			((SPAObject4)o).setSpaObj4(getSequence());
			return;
		}		
		
		if (o instanceof org.tura.jpa.test.SPAObject4){
			((org.tura.jpa.test.SPAObject4)o).setSpaObj4(getSequence());
			return;
		}		
		
		
		if (o instanceof SPAObject7){
			((SPAObject7)o).setSpaObj7(getSequence());
			return;
		}		
		
		if (o instanceof SPAObject8){
			((SPAObject8)o).setSpaObj8(getSequence());
			return;
		}		
		
		
		if (o instanceof A2){
			((A2)o).setObjId2(getSequence());
			return;
		}		
		
		if (o instanceof A3){
			((A3)o).setObjId3(getSequence());
			return;
		}		

		if (o instanceof A4){
			((A4)o).setObjId4(getSequence());
			return;
		}		
		
		
		if (o instanceof A5){
			((A5)o).setObjId5(getSequence());
			return;
		}		
		
		if (o instanceof F2){
			((F2)o).setObjId2(getSequence());
			return;
		}		

		
		if (o instanceof LocationMany2ManyCustomerRelation){
			return;
		}		

		Object pk = Reflection.callTyped(o, "getObjId");
		if (pk == null ) {
			Reflection.callTyped(o, "setObjId", Long.class,getSequence());
		}

		
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}

}
