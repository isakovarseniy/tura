package org.tura.platform.datacontrol;

import java.io.Serializable;

public class TreePath implements Serializable {

	private static final long serialVersionUID = 3105405649167172920L;
	private int key;
	private String relation;

	public TreePath(String relation, int key) {
		this.relation = relation;
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Override
	public boolean equals(Object o) {
		TreePath obj = (TreePath) o;
		if (relation != null && key == obj.getKey() && relation.equals(obj.getRelation()))
			return true;
		return false;

	}
}
