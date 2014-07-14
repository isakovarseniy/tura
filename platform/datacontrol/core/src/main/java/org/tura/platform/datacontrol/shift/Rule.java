package org.tura.platform.datacontrol.shift;

import java.util.List;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;

public abstract class Rule {
	
	public abstract boolean guard(ShiftControl shiftControl ,List<Object> result  , int position);
	
	public abstract void execute(ShiftControl shiftControl , List<Object> result ,int position) throws QueryParseException, QueryExecutionException;

	protected void removeZeroShift( ShiftControl shiftControl) throws QueryParseException, QueryExecutionException{
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_ZERO_SHIFT);

		QueryResults result = query.execute(shiftControl.getShiftTracker());

		for (Object obj : result.getResults()) {
			shiftControl.getShiftTracker().remove((Element) obj);
		}
	}



}
