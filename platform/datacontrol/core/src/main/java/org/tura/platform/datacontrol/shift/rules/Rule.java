/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.datacontrol.shift.rules;

import java.util.List;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.datacontrol.shift.ShiftControl;

public abstract class Rule {
	
	public abstract boolean guard(ShiftControl shiftControl ,List<Object> result  , int position);
	
	public abstract void execute(ShiftControl shiftControl , List<Object> result ,int position, Object obj) throws QueryParseException, QueryExecutionException;

	protected void removeZeroShift( ShiftControl shiftControl) throws QueryParseException, QueryExecutionException{
		Query query = new Query();
		query.parse(ShiftConstants.SELECT_ZERO_SHIFT);

		QueryResults result = query.execute(shiftControl.getShiftControlData().getShifterArray());

		for (Object obj : result.getResults()) {
			shiftControl.getShiftControlData().getShifterArray().remove((Element) obj);
		}
	}



}
