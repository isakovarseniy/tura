package org.metamodel.tura.ui.properties.sections.dropdown;

import org.metamodel.tura.ui.properties.sections.dropdown.impl.SourcesPointerValuePointerExternalIterator;

public class ValuePointerAttributePropertySelectionExternalIterator extends AbstractAttributePropertySelection{
	protected void init(){
		dropDownDataSupplier = new SourcesPointerValuePointerExternalIterator();
	}

}
