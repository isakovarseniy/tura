package org.eclipse.e4.xwt.converters;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.swt.widgets.Control;
import org.eclipse.wb.elsoft.components.SecurityTrigger;

public class SecurityTriggerToControl implements IConverter {
	public static SecurityTriggerToControl instance = new SecurityTriggerToControl();

	public Object getFromType() {
		// TODO Auto-generated method stub
		return SecurityTrigger.class;
	}

	public Object getToType() {
		// TODO Auto-generated method stub
		return Control.class;
	}

	public Object convert(Object fromObject) {
		return null;
	}
}
