package org.metamodel.tura.ui.properties.sections.dropdown;

import org.metamodel.tura.ui.properties.sections.dropdown.impl.SourcesPointerSourcePointer;

public class SourcesPointerDataControlPropertySelection extends
		AbstractDataControlPropertySelection {

	protected void init() {
		dropDownDataSupplier = new SourcesPointerSourcePointer();
	}

}
