package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.IteratorProperty;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

public class MetaTable extends Table {
	private IteratorProperty iteratorProperty;
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

	public MetaTable(Composite parent, int style) {
		super(parent, style);
	}

	protected void checkSubclass() {
	}

	public IteratorProperty getIteratorProperty() {
		return iteratorProperty;
	}

	public void setIteratorProperty(IteratorProperty iteratorProperty) {
		this.iteratorProperty = iteratorProperty;
	}

}
