package org.tura.platform.datacontrol.shift;

import java.util.List;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;

public abstract class RemoveRule extends Rule {

	@Override
	public void execute(ShiftControl shiftControl, List<Object> result,
			int position) throws QueryParseException, QueryExecutionException {
		for (int i = 0; i < result.size(); i++) {
			Element element = (Element) result.get(i);
			element.setActualPosition(element.getActualPosition() - 1);
			element.setShift(element.getShift() - 1);

			if (element.getShift() == 0) {

				Query query = new Query();
				query.parse(ShiftConstants.SELECT_UPPER_ELEMENTS);
				query.setVariable("position", i);

				QueryResults upperResult = query.execute(shiftControl
						.getShiftTracker());
				if (upperResult.getResults().size() != 0) {
					element.setOriginalPosition(element.getOriginalPosition() - 1);
					element.setActualPosition(element.getActualPosition() - 1);
					element.setShift(element.getShift() - 1);
				}
			}

		}
		removeZeroShift(shiftControl);
	}

}
