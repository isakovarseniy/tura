package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class BlockUISourcePropertySelection extends RefreshAreaPropertySelection{

	public BlockUISourcePropertySelection() {
		ds = new BlockUISourcesDS(this);
	}		
	
	
	@Override
	public String getColumnName() {
		return "Events sources";
	}
	
	
	
}
