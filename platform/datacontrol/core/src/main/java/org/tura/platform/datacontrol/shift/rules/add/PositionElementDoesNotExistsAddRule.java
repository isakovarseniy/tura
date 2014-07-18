package org.tura.platform.datacontrol.shift.rules.add;

import java.util.List;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ElementType;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.datacontrol.shift.rules.AddRule;

public class PositionElementDoesNotExistsAddRule extends AddRule {

	@Override
	public boolean guard(ShiftControl shiftControl, List<Object> result,
			int position) {
		if (shiftControl.getShiftTracker().size() == 0 )
			return false;

		if ( result.size() == 0 )
			return true;
			
		Element element = (Element) result.get(0);
		if (element.getActualPosition() != position) {
			return true;
		}
		return false;
	}

	@Override
	public void execute(ShiftControl shiftControl, List<Object> result,
			int position, Object obj) throws QueryParseException, QueryExecutionException {
		super.execute(shiftControl, result, position,obj);
		shiftControl.getShiftTracker().add(
				new Element(position, position, ElementType.NEW,obj));

		Query query = new Query();
		query.parse(ShiftConstants.SELECT_UPPER_ELEMENTS);
		query.setVariable("position", new Integer(position));

		QueryResults upperResult = query
				.execute(shiftControl.getShiftTracker());
		if (upperResult.getResults().size() != 0) {
			Element e = ((Element) upperResult.getResults().get(0));
			int original = position - e.getActualPosition()
					+ e.getOriginalPosition();

			if (original != position + 1) {
				shiftControl.getShiftTracker().add(
						new Element(position + 1, original,
								ElementType.EXISTING));
			}
		} else {
			shiftControl.getShiftTracker().add(
					new Element(position + 1, position, ElementType.EXISTING));
		}
	}

}
