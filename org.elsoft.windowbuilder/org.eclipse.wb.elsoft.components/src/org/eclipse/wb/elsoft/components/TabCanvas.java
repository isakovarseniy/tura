package org.eclipse.wb.elsoft.components;

import org.eclipse.swt.widgets.Composite;

public class TabCanvas extends MetaTabFolder {

	private String viewPortName;

	public TabCanvas(Composite parent, int style) {
		super(parent, style);
	}

	public String getViewPortName() {
		return viewPortName;
	}

	public void setViewPortName(String viewPortName) {
		this.viewPortName = viewPortName;
	}
}
