package org.tura.platform.datacontrol.shift.rules;

import java.util.List;

import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.tura.platform.datacontrol.shift.AddRule;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ElementType;
import org.tura.platform.datacontrol.shift.ShiftControl;

public class FirstRowAddRule extends AddRule {

	@Override
	public boolean guard(ShiftControl shiftControl,List<Object> result, int position) {
		if (shiftControl.getShiftTracker().size() == 0)
			return true;
		return false;
	}

	@Override
	public void execute( ShiftControl shiftControl, List<Object> result , int position) throws QueryParseException, QueryExecutionException{
		super.execute(shiftControl,result,position);
		shiftControl.getShiftTracker().add(new Element(position , position,
				ElementType.NEW));
		shiftControl.getShiftTracker().add(new Element(position +1, position,
				ElementType.EXISTING));
		
	}
	
	
}
