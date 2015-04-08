package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.adapters.dropdown.SourcesPointerSourceCast;

public class SourceCastPropertySelection extends AbstractCastPropertySelection{

	protected void init(){
		dropDownDataSupplier = new SourcesPointerSourceCast();
	}
}