package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.adapters.dropdown.SourcesPointerSourcePointer;

public class SourcesPointerDataControlPropertySelection extends
		AbstractDataControlPropertySelection {

	protected void init() {
		dropDownDataSupplier = new SourcesPointerSourcePointer(this);
	}

}
