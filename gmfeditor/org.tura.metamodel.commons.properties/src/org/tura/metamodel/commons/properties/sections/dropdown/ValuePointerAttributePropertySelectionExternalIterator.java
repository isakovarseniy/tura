package org.tura.metamodel.commons.properties.sections.dropdown;

import org.tura.metamodel.commons.properties.sections.dropdown.impl.SourcesPointerValuePointerExternalIterator;

public class ValuePointerAttributePropertySelectionExternalIterator extends AbstractAttributePropertySelection{
	protected void init(){
		dropDownDataSupplier = new SourcesPointerValuePointerExternalIterator();
	}

}
