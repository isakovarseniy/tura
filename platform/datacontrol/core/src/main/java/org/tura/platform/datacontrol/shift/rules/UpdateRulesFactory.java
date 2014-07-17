package org.tura.platform.datacontrol.shift.rules;

import org.tura.platform.datacontrol.shift.rules.update.PositionElementDoesExistsUpdateRule;
import org.tura.platform.datacontrol.shift.rules.update.PositionElementExistsUpdateRule;

public enum UpdateRulesFactory {

	PositionElementDoesExistsUpdateRule(PositionElementDoesExistsUpdateRule.class), 
	PositionElementExistsUpdateRule(PositionElementExistsUpdateRule.class);

	private Class<?> clazz;

	UpdateRulesFactory(Class<?> clazz) {
		this.clazz = clazz;
	}

	public Rule getRule() throws InstantiationException, IllegalAccessException {
		return (Rule) clazz.newInstance();
	}

}
