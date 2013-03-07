package org.eclipse.e4.xwt.converters;


import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.e4.xwt.elsoft.types.CastObjectProperty;
import org.eclipse.e4.xwt.utils.ResourceManager;

public class StringToCastObjectProperty implements IConverter {
	public static StringToCastObjectProperty instance = new StringToCastObjectProperty();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.databinding.conversion.IConverter#convert(java.lang.Object)
	 */
	public Object convert(Object fromObject) {
		
		return ResourceManager.resources.getCastObjectProperty((String) fromObject);
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
		return CastObjectProperty.class;
	}
}
