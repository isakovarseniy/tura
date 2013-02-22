package org.eclipse.wb.elsoft.components;

import org.eclipse.swt.widgets.Composite;

public class StackableCanvas extends Composite{

    private String viewPortName;
	
	public StackableCanvas(Composite parent, int style) {
		super(parent, style);
	}

	public String getViewPortName() {
		return viewPortName;
	}

	public void setViewPortName(String viewPortName) {
		this.viewPortName = viewPortName;
	}

}
