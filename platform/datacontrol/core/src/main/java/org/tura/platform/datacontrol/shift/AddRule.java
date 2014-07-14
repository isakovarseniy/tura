package org.tura.platform.datacontrol.shift;

import java.util.List;

import org.josql.QueryExecutionException;
import org.josql.QueryParseException;

public abstract class AddRule extends Rule {


	@Override
	public void execute(ShiftControl shiftControl, List<Object> result, int position)
			throws QueryParseException, QueryExecutionException {
		for (int i = 0; i < result.size(); i++) {
			Element element = (Element) result.get(i);
			element.setActualPosition(element.getActualPosition() + 1);
			element.setShift(element.getShift() + 1);
			if (element.getShift() == 0 && i+1 < result.size()){
				element.setOriginalPosition(element.getOriginalPosition() + 1);
				element.setActualPosition(element.getActualPosition() + 1);
				element.setShift(element.getShift() + 1);
				
			}
			
		}
		removeZeroShift(shiftControl);
	}

}
