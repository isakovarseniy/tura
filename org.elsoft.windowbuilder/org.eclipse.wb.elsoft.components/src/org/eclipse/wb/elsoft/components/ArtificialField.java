package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.PrimitiveType;
import org.eclipse.swt.widgets.Composite;

public class ArtificialField extends Composite {

	public ArtificialField(Composite parent, int style) {
		super(parent, style);
	}

	private String defaultValue;
	private PrimitiveType primitiveType;

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public PrimitiveType getPrimitiveType() {
		return primitiveType;
	}

	public void setPrimitiveType(PrimitiveType primitiveType) {
		this.primitiveType = primitiveType;
	}

}
