package org.tura.platform.datacontrol.shift.rules;

import org.tura.platform.datacontrol.shift.rules.add.FirstRowAddRule;
import org.tura.platform.datacontrol.shift.rules.add.PositionElementDoesNotExistsAddRule;
import org.tura.platform.datacontrol.shift.rules.add.PositionElementNewExistsAddRule;
import org.tura.platform.datacontrol.shift.rules.add.PositionElementNotNewExistsAddRule;
public enum AddRulesFactory {

	FirstRowAddRule(FirstRowAddRule.class), 
	PositionElementDoesNotExistsAddRule(PositionElementDoesNotExistsAddRule.class),
	PositionElementNewExistsAddRule(PositionElementNewExistsAddRule.class),
	PositionElementNotNewExistsAddRule(PositionElementNotNewExistsAddRule.class);

	private Class<?> clazz;

	AddRulesFactory(Class<?> clazz) {
		this.clazz = clazz;
	}
	
   public Rule getRule() throws InstantiationException, IllegalAccessException{
	   return (Rule) clazz.newInstance();
   }
	
}
