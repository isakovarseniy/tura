/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
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
