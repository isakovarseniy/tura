package org.tura.metamodel.commons.properties.sections.dropdown;

import org.tura.metamodel.commons.properties.sections.dropdown.impl.OptionSelectionOptionPointer;

public class OptionsPointerDataControlPropertySelection extends AbstractDataControlPropertySelection{

	protected void init() {
		dropDownDataSupplier = new OptionSelectionOptionPointer();
	}

}
