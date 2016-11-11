package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

public class RefreshAreaSetDS extends RefreshAreaDS{

	public RefreshAreaSetDS(GridProperty property) {
		super(property);
	}

	@Override
	public int getGroup() {
		return 1;
	}



}
