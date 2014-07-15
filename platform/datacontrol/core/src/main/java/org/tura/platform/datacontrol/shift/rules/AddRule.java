package org.tura.platform.datacontrol.shift.rules;

import java.util.List;

import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ShiftControl;

public abstract class AddRule extends Rule {


	@Override
	public void execute(ShiftControl shiftControl, List<Object> result, int position)
			throws QueryParseException, QueryExecutionException {
		for (int i = 0; i < result.size(); i++) {
			Element element = (Element) result.get(i);
			element.setActualPosition(element.getActualPosition() + 1);
//			if (element.getShift() == 0 ){
//				element.setOriginalPosition(element.getOriginalPosition() + 2);
//				element.setActualPosition(element.getActualPosition() + 1);
//			}
			
		}
//		removeZeroShift(shiftControl);
	}

}
