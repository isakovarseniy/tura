package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.CastObjectProperty;
import org.eclipse.e4.xwt.elsoft.types.IteratorProperty;
import org.eclipse.e4.xwt.elsoft.types.SourceProperty;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class MetaCheckbox extends Button{

	private IteratorProperty iteratorProperty;
	private SourceProperty sourceProperty;
	private CastObjectProperty castObject;
	private String cssStyle;
	private String cssStyleClass;

	
	public IteratorProperty getIteratorProperty() {
		return iteratorProperty;
	}


	public void setIteratorProperty(IteratorProperty iteratorProperty) {
		this.iteratorProperty = iteratorProperty;
	}


	public SourceProperty getSourceProperty() {
		return sourceProperty;
	}


	public void setSourceProperty(SourceProperty sourceProperty) {
		this.sourceProperty = sourceProperty;
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


	public MetaCheckbox(Composite parent, int style) {
		super(parent, org.eclipse.swt.SWT.CHECK);
	}

	protected void checkSubclass() {
	}


	public CastObjectProperty getCastObject() {
		return castObject;
	}


	public void setCastObject(CastObjectProperty castObject) {
		this.castObject = castObject;
	}
	
	
}
