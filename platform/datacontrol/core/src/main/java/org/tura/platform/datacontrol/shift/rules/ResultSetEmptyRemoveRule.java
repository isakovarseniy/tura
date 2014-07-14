package org.tura.platform.datacontrol.shift.rules;

import java.util.List;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ElementType;
import org.tura.platform.datacontrol.shift.RemoveRule;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.datacontrol.shift.ShiftControl;

public class ResultSetEmptyRemoveRule extends RemoveRule {

	@Override
	public boolean guard(ShiftControl shiftControl, List<Object> result,
			int position) {
		if (result.size() == 0)
			return true;
		return false;
	}

	@Override
	public void execute(ShiftControl shiftControl, List<Object> result,
			int position) throws QueryParseException, QueryExecutionException {
		super.execute(shiftControl, result, position);

		Query query = new Query();
		query.parse(ShiftConstants.SELECT_UPPER_ELEMENTS);
		query.setVariable("position", new Integer(position));

		QueryResults upperResult = query
				.execute(shiftControl.getShiftTracker());
		if (upperResult.getResults().size() != 0) {
			Element e = ((Element) upperResult.getResults().get(0));
			int original = position + 1 - e.getActualPosition()
					+ e.getOriginalPosition();
			if (e.getShift() > 0)
				original++;

			shiftControl.getShiftTracker().add(
					new Element(position, original, ElementType.EXISTING));
		} else {
			shiftControl.getShiftTracker().add(
					new Element(position, position + 1, ElementType.EXISTING));

		}

	}

}
