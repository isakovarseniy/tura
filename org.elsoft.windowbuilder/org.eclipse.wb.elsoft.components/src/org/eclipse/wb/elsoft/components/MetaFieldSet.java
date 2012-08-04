package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.IDProperty;
import org.eclipse.swt.widgets.Composite;

public class MetaFieldSet extends Composite{

	private IDProperty idObject;
	
	public MetaFieldSet(Composite parent, int style) {
		super(parent, style);
	}

	public IDProperty getIdObject() {
		return idObject;
	}

	public void setIdObject(IDProperty idObject) {
		this.idObject = idObject;
	}

}
