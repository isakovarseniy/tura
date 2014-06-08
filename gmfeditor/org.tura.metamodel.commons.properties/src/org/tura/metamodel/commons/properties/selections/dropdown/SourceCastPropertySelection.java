package org.tura.metamodel.commons.properties.selections.dropdown;

import org.tura.metamodel.commons.properties.selections.dropdown.impl.SourcesPointerSourceCast;

public class SourceCastPropertySelection extends AbstractCastPropertySelection{

	protected void init(){
		dropDownDataSupplier = new SourcesPointerSourceCast();
	}
}