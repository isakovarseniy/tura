package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class DataExporterTargetPropertySelection extends RefreshAreaPropertySelection{

	public DataExporterTargetPropertySelection() {
		ds = new DataExporterTargetDS(this);
	}		
	
	
	@Override
	public String getColumnName() {
		return "Export target";
	}
	
	
	
}
