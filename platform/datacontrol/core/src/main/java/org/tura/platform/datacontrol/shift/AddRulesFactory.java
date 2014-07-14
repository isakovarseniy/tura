package org.tura.platform.datacontrol.shift;

import org.tura.platform.datacontrol.shift.rules.FirstRowAddRule;
import org.tura.platform.datacontrol.shift.rules.PositionElementDoesNotExistsAddRule;
import org.tura.platform.datacontrol.shift.rules.PositionElementNewExistsAddRule;

public enum AddRulesFactory {

	FirstRowAddRule(FirstRowAddRule.class), 
	PositionElementDoesNotExistsAddRule(PositionElementDoesNotExistsAddRule.class),
	PositionElementNewExistsAddRule(PositionElementNewExistsAddRule.class);

	private Class<?> clazz;

	AddRulesFactory(Class<?> clazz) {
		this.clazz = clazz;
	}
	
   public Rule getRule() throws InstantiationException, IllegalAccessException{
	   return (Rule) clazz.newInstance();
   }
	
}
