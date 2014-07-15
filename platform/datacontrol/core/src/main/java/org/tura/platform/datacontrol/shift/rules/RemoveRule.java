package org.tura.platform.datacontrol.shift.rules;

import java.util.List;

import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ShiftControl;

public abstract class RemoveRule extends Rule {

	@Override
	public void execute(ShiftControl shiftControl, List<Object> result,
			int position) throws QueryParseException, QueryExecutionException {
		for (int i = 0; i < result.size(); i++) {
			Element element = (Element) result.get(i);
			element.setActualPosition(element.getActualPosition() - 1);

//			if (element.getShift() == 0) {
//
//				Query query = new Query();
//				query.parse(ShiftConstants.SELECT_UPPER_ELEMENTS);
//				query.setVariable("position", i);
//
//				QueryResults upperResult = query.execute(shiftControl
//						.getShiftTracker());
//				if (upperResult.getResults().size() != 0) {
//					element.setOriginalPosition(element.getOriginalPosition() - 1);
//					element.setActualPosition(element.getActualPosition() - 1);
//				}
//			}

		}
//		removeZeroShift(shiftControl);
	}

}
