package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

public class DataExporterTargetDS extends DataExporterDS{

	public DataExporterTargetDS(GridProperty property) {
		super(property);
	}

	@Override
	public int getGroup() {
		return 1;
	}

}