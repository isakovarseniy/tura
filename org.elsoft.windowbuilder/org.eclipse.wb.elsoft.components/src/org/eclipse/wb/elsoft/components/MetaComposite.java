package org.eclipse.wb.elsoft.components;

import org.eclipse.swt.widgets.Composite;

public class MetaComposite extends Composite{

	private String cssStyle;
	private String cssStyleClass;

	public MetaComposite(Composite parent, int style) {
		super(parent, style);
	}

	public String getCssStyle() {
		return cssStyle;
	}

	public void setCssStyle(String cssStyle) {
		this.cssStyle = cssStyle;
	}

	public String getCssStyleClass() {
		return cssStyleClass;
	}

	public void setCssStyleClass(String cssStyleClass) {
		this.cssStyleClass = cssStyleClass;
	}
	
}
