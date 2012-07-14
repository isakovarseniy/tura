package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.SourceProperty;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;

public class LovDisplayField extends Item{

	private String fieldLabel;
	private SourceProperty displayField;
	

	public LovDisplayField(Composite parent, int style) {
		super(parent, style);
	}

	public String getFieldLabel() {
		return fieldLabel;
	}

	public void setFieldLabel(String fieldLabel) {
		this.fieldLabel = fieldLabel;
	}

	public SourceProperty getDisplayField() {
		return displayField;
	}

	public void setDisplayField(SourceProperty displayField) {
		this.displayField = displayField;
	}

	
}
