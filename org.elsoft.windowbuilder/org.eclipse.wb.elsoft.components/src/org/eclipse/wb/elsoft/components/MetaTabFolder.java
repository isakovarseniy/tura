package org.eclipse.wb.elsoft.components;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;

public class MetaTabFolder extends TabFolder{
	private String cssStyle;
	private String cssStyleClass;

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
	public MetaTabFolder(Composite parent, int style) {
		super(parent, style);
	}
	protected void checkSubclass() {
	}

}
