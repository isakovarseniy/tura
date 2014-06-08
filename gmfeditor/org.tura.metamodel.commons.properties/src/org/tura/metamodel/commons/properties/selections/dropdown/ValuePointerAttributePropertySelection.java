package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.dropdown.impl.SourcesPointerValuePointer;

public class ValuePointerAttributePropertySelection extends AbstractAttributePropertySelection{

	protected void init(){
		dropDownDataSupplier = new SourcesPointerValuePointer();
	}
}
