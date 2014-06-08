package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.dropdown.impl.OptionSelectionOptionPointer;

public class OptionsPointerDataControlPropertySelection extends AbstractDataControlPropertySelection{

	protected void init() {
		dropDownDataSupplier = new OptionSelectionOptionPointer();
	}

}
