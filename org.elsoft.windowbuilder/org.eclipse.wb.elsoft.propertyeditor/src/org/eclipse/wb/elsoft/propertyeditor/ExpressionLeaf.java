package org.eclipse.wb.elsoft.propertyeditor;

public class ExpressionLeaf extends TreeModel {
	public String expression;
	public boolean overwriten = true;

	public ExpressionLeaf(String nodeName, TreeModel parent,
			String expression) {
		super(nodeName, parent);
		this.expression = expression;
	}

	public String toString() {
		if (expression == null)
			return nodeName;
		else
			return expression + " - " + nodeName;
	}

}
