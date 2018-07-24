package org.tura.platform.repository.mixed.test;

import java.util.HashMap;
import java.util.Map;

public class W1Source {
	
	private Long objId;
	private Map <String, Object> hash = new HashMap<>();
	
	
	public Long getObjId() {
		return objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Map<String, Object> getHash() {
		return hash;
	}
	public void setHash(Map<String, Object> hash) {
		this.hash = hash;
	}

	
	
	
}
