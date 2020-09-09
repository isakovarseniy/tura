/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package sales.analyzer.process.query.builder;

import java.util.ArrayList;
import java.util.List;

import org.dashbuilder.dataset.filter.ColumnFilter;
import org.dashbuilder.dataset.filter.FilterFactory;

import sales.analyzer.user.UserPreferences;

public class SecurityRulesHelper {
	
	public static String COLUMN_CITY = "CITY";
	public static String COLUMN_STATE = "STATES";
	public static String COLUMN_ORG_ID = "ORG_ID";
	public static String COLUMN_PRODUCT ="PRODUCT";
	public static String COLUMN_CASE_ID ="CASE_ID";
	public static String COLUMN_ACTUALOWNER_ID="ACTUALOWNER_ID";
	
	public static List<ColumnFilter> securityBoundaries( UserPreferences preferences, String username) {
		List<ColumnFilter> filters = new ArrayList<>();
		if (username == null) {
			return blockEverything();
		}
		
		if ( preferences != null && preferences.isSuperAdmin() ) {
			return filters;
		}else {
			if (
			     preferences == null || preferences.getStates() == null  || preferences.getCities() == null
			  || preferences.getStates().size() == 0 || preferences.getCities().size() == 0)
			{
				return blockEverything();
			}
			
			ColumnFilter filter = FilterFactory.in(COLUMN_STATE, preferences.getStates()); 
			filters.add(filter);
			filter = FilterFactory.in(COLUMN_CITY, preferences.getCities()); 
			filters.add(filter);
			return filters;
		}
	}

	private static List<ColumnFilter> blockEverything() {
		List<ColumnFilter> filters = new ArrayList<>();
		
		ArrayList<Integer> blockCity = new ArrayList<>();
		blockCity.add(-1);

		ArrayList<Integer> blockStates = new ArrayList<>();
		blockStates.add(-1);
		
		ColumnFilter filter = FilterFactory.in(COLUMN_STATE, blockStates); 
		filters.add(filter);
		filter = FilterFactory.in(COLUMN_CITY, blockCity); 
		filters.add(filter);
		return filters;
	}
	

}
