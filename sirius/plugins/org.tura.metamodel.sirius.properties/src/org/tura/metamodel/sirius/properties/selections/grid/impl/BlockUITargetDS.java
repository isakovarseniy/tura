package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

public class BlockUITargetDS extends BlockUIDS{

	public BlockUITargetDS(GridProperty property) {
		super(property);
	}

	@Override
	public int getGroup() {
		return 2;
	}

}