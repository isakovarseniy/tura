/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
package org.sales.analyzer.services.impl;

import java.util.UUID;

import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.repository.core.PrImaryKeyStrategy;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.db.CityRefeence;
import org.tura.salesanalyzer.serialized.db.Country;
import org.tura.salesanalyzer.serialized.db.CountryReference;
import org.tura.salesanalyzer.serialized.db.ProductGroupHistory;
import org.tura.salesanalyzer.serialized.db.State;
import org.tura.salesanalyzer.serialized.db.StateReference;
import org.tura.salesanalyzer.serialized.jbpm.CaseProcess;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

public class UUIPrimaryKeyStrategy implements PrImaryKeyStrategy{
	public static long id =-100L;

	@Override
	public void generatePk(Object o) {
		try{
			
		if (o instanceof Role) {
			((Role)o).setId(UUID.randomUUID().toString());
			return;
		}
		if (o instanceof RoleReference) {
			((RoleReference)o).setId(UUID.randomUUID().toString());
			return;
		}
		if (o instanceof User) {
			((User)o).setId(UUID.randomUUID().toString());
			return;
		}
		
		if (o instanceof ProductGroupHistory) {
			((ProductGroupHistory)o).setObjId("gh"+UUID.randomUUID().toString());
			return;
		}
		
		if (o instanceof Country) {
			((Country)o).setObjId( new Long(id).intValue());
			id= id+1;
			return;
		}
		if (o instanceof State) {
			((State)o).setObjId( new Long(id).intValue());
			id= id+1;
			return;
		}
		if (o instanceof City) {
			((City)o).setObjId( new Long(id).intValue());
			id= id+1;
			return;
		}

		if (o instanceof CaseProcess) {
			((CaseProcess)o).setId( new Long(id));
			id= id+1;
			((CaseProcess)o).setCaseId(UUID.randomUUID().toString());
			return;
		}
		
		
		if (o instanceof CountryReference) {
			((CountryReference)o).setAdmin(false);
		}
		
		if (o instanceof StateReference) {
			((StateReference)o).setAdmin(false);
		}

		if (o instanceof CityRefeence) {
			((CityRefeence)o).setAdmin(false);
		}

		
		
		Reflection.callTyped(o, "setObjId", Long.class,id);
		id= id+1;
		
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}

}

