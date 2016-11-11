package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class RefreshAreaGetPropertySelection extends RefreshAreaPropertySelection{

	public RefreshAreaGetPropertySelection() {
		ds = new RefreshAreaGetDS(this);
	}		
	
	
	@Override
	public String getColumnName() {
		return "Get Refresh Area";
	}
	
	
	
}
