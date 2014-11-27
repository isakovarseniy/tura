package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.dropdown.impl.SourcesPointerValuePointerExternalIterator;

public class ValuePointerAttributePropertySelectionExternalIterator extends AbstractAttributePropertySelection{
	protected void init(){
		dropDownDataSupplier = new SourcesPointerValuePointerExternalIterator();
	}

}
