package org.tura.metamodel.commons.properties.sections.dropdown;

import org.tura.metamodel.commons.properties.sections.dropdown.impl.SourcesPointerSourcePointer;

public class SourcesPointerDataControlPropertySelection extends
		AbstractDataControlPropertySelection {

	protected void init() {
		dropDownDataSupplier = new SourcesPointerSourcePointer();
	}

}
