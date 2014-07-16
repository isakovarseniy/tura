package org.tura.platform.datacontrol.shift.rules;

import org.tura.platform.datacontrol.shift.rules.remove.PositionElementDoesNotExistsRemoveRule;
import org.tura.platform.datacontrol.shift.rules.remove.PositionElementNewExistsRemoveRule;
import org.tura.platform.datacontrol.shift.rules.remove.ResultSetEmptyRemoveRule;
import org.tura.platform.datacontrol.shift.rules.remove.PositionElementExistsShift0RemoveRule;
import org.tura.platform.datacontrol.shift.rules.remove.PositionElementExistsShiftNot0RemoveRule;

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

	   public Rule getRule() throws InstantiationException, IllegalAccessException{
		   return (Rule) clazz.newInstance();
	   }
	
}
