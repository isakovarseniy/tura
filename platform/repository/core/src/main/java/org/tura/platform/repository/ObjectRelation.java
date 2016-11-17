package org.tura.platform.repository;

public interface ObjectRelation {

	ObjectsFilter getObjectsFilter();
	
	Description getDescription();
	
	void load();
	
	void save();
	
	
}
