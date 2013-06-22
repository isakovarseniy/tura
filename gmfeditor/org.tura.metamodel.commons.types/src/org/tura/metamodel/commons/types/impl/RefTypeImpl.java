package org.tura.metamodel.commons.types.impl;

import org.tura.metamodel.commons.types.RefType;

public class RefTypeImpl implements RefType {
	private String pckg;
	private String name;

	public RefTypeImpl( String name) {
		this.name = name;
		this.pckg = null;
	}

	@Override
	public String toString() {
		return pckg + "." + name;
	}
}
