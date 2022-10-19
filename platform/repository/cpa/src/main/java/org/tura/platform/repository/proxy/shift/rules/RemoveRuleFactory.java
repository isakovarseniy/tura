/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.proxy.shift.rules;

import org.tura.platform.repository.proxy.shift.rules.remove.PositionElementDoesNotExistsRemoveRule;
import org.tura.platform.repository.proxy.shift.rules.remove.PositionElementExistsShift0RemoveRule;
import org.tura.platform.repository.proxy.shift.rules.remove.PositionElementExistsShiftNot0RemoveRule;
import org.tura.platform.repository.proxy.shift.rules.remove.PositionElementNewExistsRemoveRule;
import org.tura.platform.repository.proxy.shift.rules.remove.ResultSetEmptyRemoveRule;

public enum  RemoveRuleFactory {
	
	FirstRowRemoveRule(ResultSetEmptyRemoveRule.class),
	PositionElementDoesNotExistsRemoveRule(PositionElementDoesNotExistsRemoveRule.class),
	PositionElementNewExistsRemoveRule(PositionElementNewExistsRemoveRule.class),
	PositionElementExistsShift0RemoveRule(PositionElementExistsShift0RemoveRule.class),
	PositionElementExistsShiftNot0RemoveRule(PositionElementExistsShiftNot0RemoveRule.class);
	
	private Class<?> clazz;

	RemoveRuleFactory(Class<?> clazz) {
		this.clazz = clazz;
	}

	   public Rule getRule() throws Exception{
		   return (Rule) clazz.getDeclaredConstructor().newInstance();
	   }
	
}
