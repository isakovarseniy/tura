package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.adapters.dropdown.SourcesPointerSourceCastExternalIterator;

public class SourceCastPropertySelectionExternalIterator extends AbstractCastPropertySelection{

	protected void init(){
		dropDownDataSupplier = new SourcesPointerSourceCastExternalIterator();
	}
}