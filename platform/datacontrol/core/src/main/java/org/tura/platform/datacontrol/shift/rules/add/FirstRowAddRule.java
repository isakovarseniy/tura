package org.tura.platform.datacontrol.shift.rules.add;

import java.util.List;

import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ElementType;
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.datacontrol.shift.rules.AddRule;

public class FirstRowAddRule extends AddRule {

	@Override
	public boolean guard(ShiftControl shiftControl,List<Object> result, int position) {
		if (shiftControl.getShiftControlData().getShifterArray().size() == 0)
			return true;
		return false;
	}

	@Override
	public void execute( ShiftControl shiftControl, List<Object> result , int position, Object obj) throws QueryParseException, QueryExecutionException{
		super.execute(shiftControl,result,position,obj);
		shiftControl.getShiftControlData().getShifterArray().add(new Element(position , position,
				ElementType.NEW,obj));
		shiftControl.getShiftControlData().getShifterArray().add(new Element(position +1, position,
				ElementType.EXISTING));
		
	}
	
	
}
