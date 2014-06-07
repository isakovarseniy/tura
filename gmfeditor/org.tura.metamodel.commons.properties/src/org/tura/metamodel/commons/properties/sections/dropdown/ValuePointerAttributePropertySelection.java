package org.tura.metamodel.commons.properties.sections.dropdown;

import org.tura.metamodel.commons.properties.sections.dropdown.impl.SourcesPointerValuePointer;

public class ValuePointerAttributePropertySelection extends AbstractAttributePropertySelection{

	protected void init(){
		dropDownDataSupplier = new SourcesPointerValuePointer();
	}
}
