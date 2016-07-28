package org.tura.metamodel.commons.properties.selections.adapters.helper;

import java.util.ArrayList;

import form.ArtificialField;
import type.TypeElement;

public class ExtendedType {
	
	private TypeElement type;
	private ArrayList<ArtificialField> ls = new ArrayList<>();
	
	public ExtendedType(TypeElement type){
		this.type = type;
	}

	public ArrayList<ArtificialField> getLs() {
		return ls;
	}

	public TypeElement getType() {
		return type;
	}
	
	
}
