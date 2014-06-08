package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.dropdown.impl.SourcesPointerSourcePointer;

public class SourcesPointerDataControlPropertySelection extends
		AbstractDataControlPropertySelection {

	protected void init() {
		dropDownDataSupplier = new SourcesPointerSourcePointer();
	}

}
