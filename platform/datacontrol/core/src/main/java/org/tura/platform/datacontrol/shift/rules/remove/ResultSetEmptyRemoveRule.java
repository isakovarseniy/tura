package org.tura.platform.datacontrol.shift.rules.remove;

import java.util.List;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ElementType;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.datacontrol.shift.rules.RemoveRule;

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
			int position, Object obj) throws QueryParseException, QueryExecutionException {

		Query query = new Query();
		query.parse(ShiftConstants.SELECT_UPPER_ELEMENTS);
		query.setVariable("position", new Integer(position));

		QueryResults upperResult = query
				.execute(shiftControl.getShiftControlData().getShifterArray());
		if (upperResult.getResults().size() != 0) {
			Element e = ((Element) upperResult.getResults().get(0));
			int original = position + 1 - e.getActualPosition()
					+ e.getOriginalPosition();
			if (e.getShift() > 0)
				original++;

			shiftControl.getShiftControlData().getShifterArray().add(
					new Element(position, original, ElementType.EXISTING));
		} else {
			shiftControl.getShiftControlData().getShifterArray().add(
					new Element(position, position + 1, ElementType.EXISTING));

		}
		super.execute(shiftControl, result, position,obj);

	}

}
