package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.adapters.dropdown.OptionSelectionOptionCast;

public class OptionsCastDataControlPropertySelection extends AbstractCastPropertySelection{

	protected void init() {
		dropDownDataSupplier = new OptionSelectionOptionCast();
	}

}