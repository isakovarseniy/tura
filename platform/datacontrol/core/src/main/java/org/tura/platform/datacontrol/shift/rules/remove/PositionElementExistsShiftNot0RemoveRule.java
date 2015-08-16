/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.datacontrol.shift.rules.remove;

import java.util.List;

import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ElementType;
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.datacontrol.shift.rules.RemoveRule;

public class PositionElementExistsShiftNot0RemoveRule extends RemoveRule{

	
	@Override
	public boolean guard(ShiftControl shiftControl,List<Object> result, int position) {
		if (shiftControl.getShiftControlData().getShifterArray().size() == 0 || result.size() == 0 )
			return false;

		Element element = (Element) result.get(0);
		if (element.getActualPosition() == position && element.getShift() !=0
				&& element.getElementType().equals(ElementType.EXISTING.name())) {
			return true;
		}
		return false;
	}
	
	@Override
	public void execute(ShiftControl shiftControl, List<Object> result,
			int position, Object obj) throws QueryParseException, QueryExecutionException {

		Element e = (Element) result.get(0);
		int original =  e.getOriginalPosition();
	    original++;

	    shiftControl.getShiftControlData().getShifterArray().remove(e);
	    shiftControl.getShiftControlData().getShifterArray().add(
				new Element(position, original, ElementType.EXISTING));

		super.execute(shiftControl, result, position,obj);
	}

	
}




