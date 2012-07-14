package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.ExpressionProperty;
import org.eclipse.e4.xwt.elsoft.types.FieldsProperty;
import org.eclipse.swt.widgets.Composite;

public class DefaultSearch extends Composite{

	private FieldsProperty fieldsProperty;
	private String value;
	private String refType;
	private ExpressionProperty expressionProperty;

	
	public DefaultSearch(Composite parent, int style) {
		super(parent, style);
	}

	public FieldsProperty getFieldsProperty() {
		return fieldsProperty;
	}

	public void setFieldsProperty(FieldsProperty fieldsProperty) {
		this.fieldsProperty = fieldsProperty;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ExpressionProperty getExpressionProperty() {
		return expressionProperty;
	}

	public void setExpressionProperty(ExpressionProperty expressionProperty) {
		this.expressionProperty = expressionProperty;
	}

	public String getRefType() {
		return refType;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}




}
