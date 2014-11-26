package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.dropdown.impl.SourcesPointerValuePointerExternalIterator;

public class ValuePointerAttributePropertySelectionTableIterator extends AbstractAttributePropertySelection{
	protected void init(){
		dropDownDataSupplier = new SourcesPointerValuePointerExternalIterator();
	}

}
