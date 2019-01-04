package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class BlockUITargetPropertySelection  extends RefreshAreaPropertySelection{

	public BlockUITargetPropertySelection() {
		ds = new BlockUITargetDS(this);
	}		
	
	
	@Override
	public String getColumnName() {
		return "Blocking targets";
	}
	
	
}
