package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.DestinationDataControlProperty;
import org.eclipse.swt.widgets.Composite;

public class Relation extends Composite {

	private DestinationDataControlProperty dstDataControl;
	private Boolean treeRelation = new Boolean(false) ;
	
	
	public Relation(Composite parent, int style) {
		super(parent, style);
	}

	public DestinationDataControlProperty getDstDataControl() {
		return dstDataControl;
	}

	public void setDstDataControl(DestinationDataControlProperty dstDataControl) {
		this.dstDataControl = dstDataControl;
	}

	public Boolean getTreeRelation() {
		return treeRelation;
	}

	public void setTreeRelation(Boolean treeRelation) {
		this.treeRelation = treeRelation;
	}



}
