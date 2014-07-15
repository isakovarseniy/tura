package org.tura.platform.datacontrol.shift.rules.remove;

import java.util.List;

import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ElementType;
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.datacontrol.shift.rules.RemoveRule;

public class PositionElementNewExistsRemoveRule extends RemoveRule {

	@Override
	public boolean guard(ShiftControl shiftControl,List<Object> result, int position) {
		if (shiftControl.getShiftTracker().size() == 0 || result.size() == 0 )
			return false;

		Element element = (Element) result.get(0);
		if (element.getActualPosition() == position
				&& element.getElementType().equals(ElementType.NEW.name())) {
			return true;
		}
		return false;
	}

	@Override
	public void execute(ShiftControl shiftControl,List<Object> result, int position)
			throws QueryParseException, QueryExecutionException {

		 Element e = (Element) result.get(0);
		 shiftControl.getShiftTracker().remove(e);

		 super.execute(shiftControl,result, position);

	}

}
