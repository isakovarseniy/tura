package org.tura.platform.datacontrol.shift.rules.remove;

import java.util.List;

import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ElementType;
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.datacontrol.shift.rules.RemoveRule;

public class PositionElementDoesNotExistsRemoveRule extends RemoveRule {

	@Override
	public boolean guard(ShiftControl shiftControl, List<Object> result,
			int position) {
		if (shiftControl.getShiftControlData().getShifterArray().size() == 0 && result.size() == 0)
			return false;

		Element element = (Element) result.get(0);
		if (element.getActualPosition() != position) {
			return true;
		}
		return false;
	}

	@Override
	public void execute(ShiftControl shiftControl, List<Object> result,
			int position, Object obj) throws QueryParseException, QueryExecutionException {

		Element e = ((Element) result.get(0));
		if (e.getActualPosition() != position + 1) {

			int original = position + 1;

			shiftControl.getShiftControlData().getShifterArray().add(
					new Element(position, original, ElementType.EXISTING));

		}
		super.execute(shiftControl, result, position, obj);

	}

}
