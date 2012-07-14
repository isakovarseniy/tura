package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.IteratorProperty;
import org.eclipse.e4.xwt.elsoft.types.SourceProperty;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class MetaLOV extends Button {

	private IteratorProperty iteratorProperty;
	private SourceProperty sourceProperty;
	private IteratorProperty optionIterator;
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

	protected void checkSubclass() {
	}

	public MetaLOV(Composite parent, int style) {
		super(parent, SWT.None);
		Display display = Display.getCurrent();
		ImageRegistry registry = new ImageRegistry(display);
		loadImages(registry);
		this.setImage(registry.get("element"));
	}


	public IteratorProperty getIteratorProperty() {
		return iteratorProperty;
	}

	public void setIteratorProperty(IteratorProperty iteratorProperty) {
		this.iteratorProperty = iteratorProperty;
	}

	public IteratorProperty getOptionIterator() {
		return optionIterator;
	}

	public void setOptionIterator(IteratorProperty optionIterator) {
		this.optionIterator = optionIterator;
	}

	private void loadImages(ImageRegistry registry) {
		registry.put("element", ImageDescriptor.createFromFile(MetaLOV.class,
				"lov.png"));
	}

	public SourceProperty getSourceProperty() {
		return sourceProperty;
	}

	public void setSourceProperty(SourceProperty sourceProperty) {
		this.sourceProperty = sourceProperty;
	}

}
