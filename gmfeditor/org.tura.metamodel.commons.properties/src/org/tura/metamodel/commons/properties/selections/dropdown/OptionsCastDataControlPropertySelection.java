package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.dropdown.impl.OptionSelectionOptionCast;

public class OptionsCastDataControlPropertySelection extends AbstractCastPropertySelection{

	protected void init() {
		dropDownDataSupplier = new OptionSelectionOptionCast();
	}

}