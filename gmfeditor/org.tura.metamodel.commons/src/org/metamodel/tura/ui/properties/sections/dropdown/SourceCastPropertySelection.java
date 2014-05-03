package org.metamodel.tura.ui.properties.sections.dropdown;

import org.metamodel.tura.ui.properties.sections.dropdown.impl.SourcesPointerSourceCast;

public class SourceCastPropertySelection extends AbstractCastPropertySelection{

	protected void init(){
		dropDownDataSupplier = new SourcesPointerSourceCast();
	}
}