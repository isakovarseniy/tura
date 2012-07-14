package org.eclipse.wb.elsoft.components;

import org.eclipse.swt.widgets.Composite;

public class DataDefinition extends Composite {

	private String form;
	
	public DataDefinition(Composite parent, int style) {
		super(parent, style);
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

}
