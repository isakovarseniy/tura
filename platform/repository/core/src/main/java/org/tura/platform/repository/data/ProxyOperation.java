/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.repository.data;

import java.io.Serializable;

public class ProxyOperation implements Serializable{

	private static final long serialVersionUID = -295456559529407648L;
	String relationType;
	String masterProperty;
	String detailProperty;
	
	public String getRelationType() {
		return relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}
	public String getMasterProperty() {
		return masterProperty;
	}
	public void setMasterProperty(String masterProperty) {
		this.masterProperty = masterProperty;
	}
	public String getDetailProperty() {
		return detailProperty;
	}
	public void setDetailProperty(String detailProperty) {
		this.detailProperty = detailProperty;
	}

	protected void populate(ProxyData data){
		data.setDetailProperty(detailProperty);
		data.setMasterProperty(masterProperty);
		data.setRelationType(relationType);
	}
	
	
}
