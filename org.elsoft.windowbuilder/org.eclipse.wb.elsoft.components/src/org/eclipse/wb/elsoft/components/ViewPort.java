package org.eclipse.wb.elsoft.components;

import org.eclipse.swt.widgets.Composite;

public class ViewPort extends Composite{

	private String viewPortName;
	private String canvasName;
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

	public String getViewPortName() {
		return viewPortName;
	}

	public void setViewPortName(String viewPortName) {
		this.viewPortName = viewPortName;
	}

	public String getCanvasName() {
		return canvasName;
	}

	public void setCanvasName(String canvasName) {
		this.canvasName = canvasName;
	}

	public ViewPort(Composite parent, int style) {
		super(parent, style);
	}

}
