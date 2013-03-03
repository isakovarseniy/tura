package org.eclipse.wb.elsoft.components;

import org.eclipse.swt.widgets.Composite;

public class PopUpCanvas extends Composite{

    private String viewPortName;
	
	public PopUpCanvas(Composite parent, int style) {
		super(parent, style);
	}

	public String getViewPortName() {
		return viewPortName;
	}

	public void setViewPortName(String viewPortName) {
		this.viewPortName = viewPortName;
	}

}
