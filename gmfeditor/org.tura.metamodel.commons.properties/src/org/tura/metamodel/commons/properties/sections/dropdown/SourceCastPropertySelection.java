package org.tura.metamodel.commons.properties.sections.dropdown;

import org.tura.metamodel.commons.properties.sections.dropdown.impl.SourcesPointerSourceCast;

public class SourceCastPropertySelection extends AbstractCastPropertySelection{

	protected void init(){
		dropDownDataSupplier = new SourcesPointerSourceCast();
	}
}