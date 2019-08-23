/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.datacontrol.commons;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ObjectProfileCriteria")
public class ObjectProfileCriteria extends SearchCriteria{
	
	private String profile;

	public ObjectProfileCriteria() {
	}
	
	
	public ObjectProfileCriteria(String profile) {
		this.profile = profile;
	}
	
	@XmlElement
	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
	@XmlElement
	@Override
	public String getName() {
		return null;
	}
	
	@XmlElement
	@Override
	public Object getValue() {
		return null;
	}
	
	@XmlElement
	@Override
	public String getClassName() {
		return null;
	}
	
	@XmlElement
	@Override
	public String getComparator() {
		return null;
	}

	@XmlElement
	@Override
	public String getParentClass() {
		return null;
	}


	@XmlElement
	@Override
	public String getProperty() {
		return null;
	}


}

