package org.metamodel.tura.ui.properties.sections.dropdown;

import org.metamodel.tura.ui.properties.sections.dropdown.impl.OptionSelectionOptionCast;

public class OptionsCastDataControlPropertySelection extends AbstractCastPropertySelection{

	protected void init() {
		dropDownDataSupplier = new OptionSelectionOptionCast();
	}

}