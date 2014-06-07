package org.tura.metamodel.commons.properties.sections.dropdown;

import org.tura.metamodel.commons.properties.sections.dropdown.impl.OptionSelectionOptionCast;

public class OptionsCastDataControlPropertySelection extends AbstractCastPropertySelection{

	protected void init() {
		dropDownDataSupplier = new OptionSelectionOptionCast();
	}

}