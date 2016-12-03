package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.tura.metamodel.commons.Helper;

import repository.ObjectMapper;

public class ObjectMapperTypePropertySelection  extends TypePropertySelection{
	
	public void afterUpdate(){
		
		ObjectMapper objectMapper = (ObjectMapper) getModel();
		new Helper().populateObjectMapper(objectMapper, getModel());
		
	}
	
	
}
