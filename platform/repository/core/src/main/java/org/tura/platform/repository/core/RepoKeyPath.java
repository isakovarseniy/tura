package org.tura.platform.repository.core;

import java.util.ArrayList;
import java.util.List;

public class RepoKeyPath {

	private List<RepoObjectKey>  path = new ArrayList<>();
	
	
	public void addRepoObjectKey (String relation , RepoObjectKey key){
		key.setRelation(relation);
		path.add(key);
	}


	public List<RepoObjectKey> getPath() {
		return path;
	}


	public void setPath(List<RepoObjectKey> path) {
		this.path = path;
	}
	
}
