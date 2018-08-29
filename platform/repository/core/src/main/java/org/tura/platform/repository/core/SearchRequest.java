/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
package org.tura.platform.repository.core;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.tura.platform.datacontrol.commons.ObjectProfileCriteria;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;


@XmlRootElement(name = "SearchRequest")
@XmlSeeAlso( ObjectProfileCriteria.class)
public class SearchRequest {
	
	private List <SearchCriteria> search = new ArrayList<>();
	private List <OrderCriteria> order;
	private String profile;
	private Integer startIndex;
	private Integer endIndex;
	private String objectClass;
	
	
	@XmlElement
	public Integer getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}
	
	@XmlElement
	public Integer getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}
	
	@XmlElement
	public String getObjectClass() {
		return objectClass;
	}
	public void setObjectClass(String objectClass) {
		this.objectClass = objectClass;
	}
	@XmlElement
	public List<SearchCriteria> getSearch() {
		return search;
	}
	public void setSearch(List<SearchCriteria> search) {
		this.search = search;
	}
	@XmlElement
	public List<OrderCriteria> getOrder() {
		return order;
	}
	public void setOrder(List<OrderCriteria> order) {
		this.order = order;
	}
	
	@XmlElement
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}

	
	
}
