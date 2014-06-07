package org.metamodel.tura.ui.properties.sections.dropdown;

import org.metamodel.tura.ui.properties.sections.dropdown.impl.OptionSelectionOptionPointer;

public class OptionsPointerDataControlPropertySelection extends AbstractDataControlPropertySelection{

	protected void init() {
		dropDownDataSupplier = new OptionSelectionOptionPointer();
	}

}
