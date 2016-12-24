package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.Comparator;

import mapper.MappingLayer;

public class MappingLayerComparator implements Comparator<MappingLayer> {

	@Override
	public int compare(MappingLayer o1, MappingLayer o2) {
		if (o1.getOrder() > o2.getOrder()){
			return -1;
		}else{
			if (o1.getOrder() < o2.getOrder()){
				return 1;
			}else{
				return 0;
			}
		}
	}
}