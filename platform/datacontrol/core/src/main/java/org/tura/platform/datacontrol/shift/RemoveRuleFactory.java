package org.tura.platform.datacontrol.shift;

import org.tura.platform.datacontrol.shift.rules.ResultSetEmptyRemoveRule;
import org.tura.platform.datacontrol.shift.rules.PositionElementDoesNotExistsRemoveRule;
import org.tura.platform.datacontrol.shift.rules.PositionElementNewExistsRemoveRule;
public enum  RemoveRuleFactory {
	
	FirstRowRemoveRule(ResultSetEmptyRemoveRule.class),
	PositionElementDoesNotExistsRemoveRule(PositionElementDoesNotExistsRemoveRule.class),
	PositionElementNewExistsRemoveRule(PositionElementNewExistsRemoveRule.class);

	
	private Class<?> clazz;

	RemoveRuleFactory(Class<?> clazz) {
		this.clazz = clazz;
	}

	   public Rule getRule() throws InstantiationException, IllegalAccessException{
		   return (Rule) clazz.newInstance();
	   }
	
}
