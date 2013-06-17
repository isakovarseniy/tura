package org.tura.metamodel.commons.properties.impl;

import org.tura.metamodel.commons.properties.TypeReference;

public class TypeReferenceImpl implements TypeReference {
	private String pckg;
	private String name;

	public TypeReferenceImpl(String pckg, String name) {
		this.name = name;
		this.pckg = pckg;
	}

	@Override
	public String toString() {
		return pckg + "." + name;
	}
}
