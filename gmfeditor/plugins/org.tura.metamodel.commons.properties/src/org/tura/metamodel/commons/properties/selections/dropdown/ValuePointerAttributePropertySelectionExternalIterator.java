package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.adapters.dropdown.SourcesPointerValuePointerExternalIterator;

public class ValuePointerAttributePropertySelectionExternalIterator extends AbstractAttributePropertySelection{
	protected void init(){
		dropDownDataSupplier = new SourcesPointerValuePointerExternalIterator();
	}

}
