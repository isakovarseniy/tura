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

package org.tura.platform.repository.core;

import java.io.Serializable;
import java.util.List;

public class SearchResult implements Serializable{
	private static final long serialVersionUID = 1451767056951539998L;
	private List<?> searchResult;
	private long numberOfRows;
	
	public SearchResult( List<?> searchResult,long numberOfRows){
		this.searchResult=searchResult;
		this.numberOfRows=numberOfRows;
		
	}
	
	public List<?> getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(List<?> searchResult) {
		this.searchResult = searchResult;
	}

	public long getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(long numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	
}
