package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.ExpressionProperty;
import org.eclipse.e4.xwt.elsoft.types.VisualDependencyProperty;
import org.eclipse.swt.widgets.Composite;

public class DrugAndDrop extends Composite{

	private ExpressionProperty expressionProperty;
	private VisualDependencyProperty destination;
	private VisualDependencyProperty source;
	private VisualDependencyProperty updateOnDrop;

	public VisualDependencyProperty getSource() {
		return source;
	}

	public void setSource(VisualDependencyProperty source) {
		this.source = source;
	}

	public ExpressionProperty getExpressionProperty() {
		return expressionProperty;
	}

	public void setExpressionProperty(ExpressionProperty expressionProperty) {
		this.expressionProperty = expressionProperty;
	}

	
	public VisualDependencyProperty getDestination() {
		return destination;
	}

	public void setDestination(VisualDependencyProperty destination) {
		this.destination = destination;
	}

	public VisualDependencyProperty getUpdateOnDrop() {
		return updateOnDrop;
	}

	public void setUpdateOnDrop(VisualDependencyProperty updateOnDrop) {
		this.updateOnDrop = updateOnDrop;
	}

	public DrugAndDrop(Composite parent, int style) {
		super(parent, style);
	}


}
