/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons;

import java.util.ArrayList;
import java.util.List;

public class ArtificialContextValue {
	private String uid;
	private boolean constant;
	private String value;
	private List<ArtificialExpressionPart>  expression = new ArrayList<>();
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public boolean isConstant() {
		return constant;
	}
	public void setConstant(boolean constant) {
		this.constant = constant;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<ArtificialExpressionPart> getExpression() {
		return expression;
	}
	public void setExpression(List<ArtificialExpressionPart> expression) {
		this.expression = expression;
	}

	
	
}
