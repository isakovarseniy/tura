package org.tura.platform.repository.test;

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
