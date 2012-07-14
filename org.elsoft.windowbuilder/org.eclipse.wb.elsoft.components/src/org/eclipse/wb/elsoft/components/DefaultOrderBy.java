package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.AscDescProperty;
import org.eclipse.e4.xwt.elsoft.types.FieldsProperty;
import org.eclipse.swt.widgets.Composite;

public class DefaultOrderBy extends Composite{
	private FieldsProperty fieldsProperty;
	private AscDescProperty ascDescProperty;

	public DefaultOrderBy(Composite parent, int style) {
		super(parent, style);
	}

	public FieldsProperty getFieldsProperty() {
		return fieldsProperty;
	}

	public void setFieldsProperty(FieldsProperty fieldsProperty) {
		this.fieldsProperty = fieldsProperty;
	}

	public AscDescProperty getAscDescProperty() {
		return ascDescProperty;
	}

	public void setAscDescProperty(AscDescProperty ascDescProperty) {
		this.ascDescProperty = ascDescProperty;
	}

}
