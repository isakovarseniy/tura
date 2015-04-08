package org.tura.metamodel.commons.properties.selections.grid;

public interface TextColumnConverter {
	public String convertToText(Object obj);
	public Object convertToObject(String str);
}
