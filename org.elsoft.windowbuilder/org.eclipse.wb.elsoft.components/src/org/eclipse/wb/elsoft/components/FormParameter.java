package org.eclipse.wb.elsoft.components;

import org.eclipse.swt.widgets.Composite;

public class FormParameter extends Composite {

    private String parameterName;
	
	public FormParameter(Composite parent, int style) {
		super(parent, style);
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	
}
