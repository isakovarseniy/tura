package org.tura.platform.datacontrol.metainfo;

public class PropertyLink {

	private String parent;
	private String child;

	public PropertyLink(String parent, String child) {
		this.parent = parent;
		this.child = child;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getChild() {
		return child;
	}

	public void setChild(String child) {
		this.child = child;
	}

}
