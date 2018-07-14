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
	public static String COLUMN_ACTUALOWNER_ID="ACTUALOWNER_ID";
	
	public static List<ColumnFilter> securityBoundaries( UserPreferences preferences) {
		List<ColumnFilter> filters = new ArrayList<>();
		if ( preferences.isSuperAdmin() ) {
			return filters;
		}else {
			if (preferences == null || preferences.getStates() == null  || preferences.getCities() == null) {
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
