package org.eclipse.e4.xwt.converters;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.e4.xwt.elsoft.types.OperetionTypeProperty;
import org.eclipse.e4.xwt.utils.ResourceManager;

public class StringToOperetionTypeProperty implements IConverter {
	public static StringToOperetionTypeProperty instance = new StringToOperetionTypeProperty();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.databinding.conversion.IConverter#convert(java.lang.Object)
	 */
	public Object convert(Object fromObject) {
		
		return ResourceManager.resources.getOperetionTypeProperty((String) fromObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.databinding.conversion.IConverter#getFromType()
	 */
	public Object getFromType() {
		return String.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.databinding.conversion.IConverter#getToType()
	 */
	public Object getToType() {
		return OperetionTypeProperty.class;
	}
}
