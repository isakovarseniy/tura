package org.eclipse.wb.elsoft.propertyeditor;

public class ValueLeaf extends TreeModel {
	public String value;
	public boolean overwriten = true;

	public ValueLeaf(String nodeName, TreeModel parent, String value) {
		super(nodeName, parent);
		this.value = value;
	}
}
