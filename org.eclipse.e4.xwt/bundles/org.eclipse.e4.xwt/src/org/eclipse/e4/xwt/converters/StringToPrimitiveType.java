package org.eclipse.e4.xwt.converters;


import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.e4.xwt.elsoft.types.PrimitiveType;
import org.eclipse.e4.xwt.utils.ResourceManager;

public class StringToPrimitiveType implements IConverter {
	public static StringToPrimitiveType instance = new StringToPrimitiveType();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.databinding.conversion.IConverter#convert(java.lang.Object)
	 */
	public Object convert(Object fromObject) {
		
		return ResourceManager.resources.getPrimitiveType((String) fromObject);
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
		return PrimitiveType.class;
	}
}
