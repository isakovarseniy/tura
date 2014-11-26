package org.tura.metamodel.commons.properties.selections.adapters.helper;

import java.util.ArrayList;

public class ExtendedType {
	
	private domain.TypeElement type;
	private ArrayList<domain.ArtificialField> ls = new ArrayList<>();
	
	public ExtendedType(domain.TypeElement type){
		this.type = type;
	}

	public ArrayList<domain.ArtificialField> getLs() {
		return ls;
	}

	public domain.TypeElement getType() {
		return type;
	}
	
	
}
