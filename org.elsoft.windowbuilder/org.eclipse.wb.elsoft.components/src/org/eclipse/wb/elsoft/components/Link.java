package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.LinkFieldProperty;
import org.eclipse.swt.widgets.Composite;

public class Link extends Composite {

	private LinkFieldProperty masterField;
	private LinkFieldProperty detailField;

	public Link(Composite parent, int style) {
		super(parent, style);
	}

	public LinkFieldProperty getMasterField() {
		return masterField;
	}

	public void setMasterField(LinkFieldProperty masterField) {
		this.masterField = masterField;
	}

	public LinkFieldProperty getDetailField() {
		return detailField;
	}

	public void setDetailField(LinkFieldProperty detailField) {
		this.detailField = detailField;
	}

}
