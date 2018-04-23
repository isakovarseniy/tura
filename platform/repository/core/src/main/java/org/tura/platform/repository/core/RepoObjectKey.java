package org.tura.platform.repository.core;

import java.util.ArrayList;
import java.util.List;

public class RepoObjectKey {

	private List <FieldValue> key = new ArrayList<>();
	private String type;
	private String relation;
	
	public void addValue (FieldValue value){
		key.add(value);
	}

	public List<FieldValue> getKey() {
		return key;
	}

	public void setKey(List<FieldValue> key) {
		this.key = key;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	
	
}
