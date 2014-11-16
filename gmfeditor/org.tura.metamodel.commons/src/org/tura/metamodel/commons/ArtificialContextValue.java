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
