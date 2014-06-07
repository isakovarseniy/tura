package org.metamodel.tura.ui.properties.sections.dropdown;

import org.metamodel.tura.ui.properties.sections.dropdown.impl.SourcesPointerValuePointer;

public class ValuePointerAttributePropertySelection extends AbstractAttributePropertySelection{

	protected void init(){
		dropDownDataSupplier = new SourcesPointerValuePointer();
	}
}
