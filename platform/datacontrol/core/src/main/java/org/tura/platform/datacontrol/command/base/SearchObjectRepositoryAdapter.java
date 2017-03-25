/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.datacontrol.command.base;

import org.tura.platform.repository.core.SearchResult;

public abstract class SearchObjectRepositoryAdapter extends RepositoryAdapter{

	private CallParameter searchCriteria;
	private CallParameter orderCriteria;
	private CallParameter startIndex;
	private CallParameter endIndex;
	private CallParameter objectType;
	
	public abstract  SearchResult query() throws Exception;
	
	public CallParameter getSearchCriteria() {
		return searchCriteria;
	}


	public void setSearchCriteria(CallParameter searchCriteria) {
		this.searchCriteria = searchCriteria;
	}


	public CallParameter getOrderCriteria() {
		return orderCriteria;
	}


	public void setOrderCriteria(CallParameter orderCriteria) {
		this.orderCriteria = orderCriteria;
	}


	public CallParameter getStartIndex() {
		return startIndex;
	}


	public void setStartIndex(CallParameter startIndex) {
		this.startIndex = startIndex;
	}


	public CallParameter getEndIndex() {
		return endIndex;
	}


	public void setEndIndex(CallParameter endIndex) {
		this.endIndex = endIndex;
	}


	public CallParameter getObjectType() {
		return objectType;
	}


	public void setObjectType(CallParameter objectType) {
		this.objectType = objectType;
	}


	public void preQuery() throws Exception{
		if (getDatacontrol().getPreQueryTrigger() != null)
			getDatacontrol().getPreQueryTrigger().execute(getDatacontrol());
	}

	
}
