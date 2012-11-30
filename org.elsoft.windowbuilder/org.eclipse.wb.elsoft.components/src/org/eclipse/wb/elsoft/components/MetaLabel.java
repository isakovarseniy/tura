package org.eclipse.wb.elsoft.components;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class MetaLabel extends Label{
	private String cssStyle;
	private String cssStyleClass;
	public MetaLabel(Composite parent, int style) {
		super(parent, style);
	}

	protected void checkSubclass() {
	}
	
	public String getCssStyleClass() {
		return cssStyleClass;
	}

	public void setCssStyleClass(String cssStyleClass) {
		this.cssStyleClass = cssStyleClass;
	}

	public String getCssStyle() {
		return cssStyle;
	}

	public void setCssStyle(String cssStyle) {
		this.cssStyle = cssStyle;
	}

}
