package org.tura.platform.repository.core;

import java.util.List;

public class SearchResult {
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
