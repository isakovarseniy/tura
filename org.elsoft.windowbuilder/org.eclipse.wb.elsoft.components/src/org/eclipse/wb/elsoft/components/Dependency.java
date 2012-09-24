package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.ExpressionProperty;
import org.eclipse.swt.widgets.Composite;

public class Dependency  extends Composite{
	private ExpressionProperty expressionProperty;

	public ExpressionProperty getExpressionProperty() {
		return expressionProperty;
	}

	public void setExpressionProperty(ExpressionProperty expressionProperty) {
		this.expressionProperty = expressionProperty;
	}
	public Dependency(Composite parent, int style) {
		super(parent, style);
	}

}
