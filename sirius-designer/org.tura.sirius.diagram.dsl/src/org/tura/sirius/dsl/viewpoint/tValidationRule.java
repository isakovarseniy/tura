/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.dsl.viewpoint;

import java.util.Arrays;
import java.util.List;

import org.eclipse.sirius.viewpoint.description.validation.RuleAudit;
import org.eclipse.sirius.viewpoint.description.validation.SemanticValidationRule;
import org.eclipse.sirius.viewpoint.description.validation.ValidationFactory;
import org.eclipse.sirius.viewpoint.description.validation.ValidationRule;
import org.tura.sirius.dsl.config.ValidationRuleConfigurator;

public class tValidationRule implements ValidationRuleConfigurator {
	private String name;
	private String context;
	private String message;
	private List<String> validations;

	public tValidationRule(String name, String context, String message, String[] validations) {
		this.context = context;
		this.name = name;
		this.message = message;
		this.validations = Arrays.asList(validations);
	}

	public ValidationRule getRule() {
		SemanticValidationRule rule = ValidationFactory.eINSTANCE.createSemanticValidationRule();
		rule.setName(this.name);
		rule.setMessage(this.message);
		rule.setTargetClass(this.context);
		for (String validation : this.validations) {
			RuleAudit audit = ValidationFactory.eINSTANCE.createRuleAudit();
			audit.setAuditExpression(validation);
			rule.getAudits().add(audit);
		}
		return rule;
	}
}
