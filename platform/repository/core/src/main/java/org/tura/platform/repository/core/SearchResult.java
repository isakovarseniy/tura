/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.core;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "@class")
public class SearchResult<T> implements Serializable{
	private static final long serialVersionUID = 1451767056951539998L;
	private List<T> searchResult;
	private long numberOfRows;

	
	public SearchResult( ){
		
	}
	
	
	public SearchResult( List<T> searchResult,long numberOfRows){
		this.searchResult=searchResult;
		this.numberOfRows=numberOfRows;
		
	}
	
	public List<T> getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(List<T> searchResult) {
		this.searchResult = searchResult;
	}

	public long getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(long numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	
}
