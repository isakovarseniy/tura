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

import java.util.UUID;

import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.repository.core.PrImaryKeyStrategy;

import objects.test.serialazable.jpa.Customer;
import objects.test.serialazable.jpa.Location;
import objects.test.serialazable.jpa.LocationMany2ManyCustomerRelation;
import objects.test.serialazable.jpa.Order;
import objects.test.serialazable.jpa.Vehicle;

public class UUIPrimaryKeyStrategy implements PrImaryKeyStrategy{

	@Override
	public void generatePk(Object o) {
		try{
			
		if (o instanceof Customer){
			((Customer)o).setCustomerId(UUID.randomUUID().getMostSignificantBits());
			return;
		}

		if (o instanceof Vehicle){
			((Vehicle)o).setObjId(UUID.randomUUID().getMostSignificantBits());
			return;
		}
		
		if (o instanceof Order){
			((Order)o).setOrderId(UUID.randomUUID().getMostSignificantBits());
			return;
		}
		
		if (o instanceof Location){
			((Location)o).setObjId(UUID.randomUUID().getMostSignificantBits());
			return;
		}		
		
		if (o instanceof LocationMany2ManyCustomerRelation){
			return;
		}		

		Reflection.callTyped(o, "setObjId", Long.class,UUID.randomUUID().getMostSignificantBits());
		
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}

}
