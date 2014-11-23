package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.dropdown.impl.SourcesPointerValuePointerTableIterator;

public class ValuePointerAttributePropertySelectionTableIterator extends AbstractAttributePropertySelection{
	protected void init(){
		dropDownDataSupplier = new SourcesPointerValuePointerTableIterator();
	}

}
