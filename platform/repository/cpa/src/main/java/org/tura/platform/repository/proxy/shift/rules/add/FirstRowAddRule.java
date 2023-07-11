/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.repository.proxy.shift.rules.add;

import java.util.List;

import org.tura.platform.repository.proxy.shift.Element;
import org.tura.platform.repository.proxy.shift.ElementType;
import org.tura.platform.repository.proxy.shift.ShiftControl;
import org.tura.platform.repository.proxy.shift.rules.AddRule;

public class FirstRowAddRule extends AddRule {

	@Override
	public boolean guard(ShiftControl shiftControl,List<Object> result, int position) throws Exception {
		if (shiftControl.getShiftControlData().getShifterArray().size() == 0)
			return true;
		return false;
	}

	@Override
	public void execute( ShiftControl shiftControl, List<Object> result , int position, Object obj) throws Exception{
		super.execute(shiftControl,result,position,obj);
		shiftControl.getShiftControlData().getShifterArray().add(new Element(position , position,
				ElementType.NEW,obj));
		shiftControl.getShiftControlData().getShifterArray().add(new Element(position +1, position,
				ElementType.EXISTING));
		
	}
	
	
}
