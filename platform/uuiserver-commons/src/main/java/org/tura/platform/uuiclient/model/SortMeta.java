package org.tura.platform.uuiclient.model;


/**
 * Copyright 2009-2018 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.Serializable;

public class SortMeta implements Serializable {

	private static final long serialVersionUID = -7681586156392073031L;

	private transient Object column;

    private String sortField;

    private SortOrder sortOrder;

    private String sortFunction;

    public SortMeta() {
    }

    public SortMeta(Object column, String sortField, SortOrder sortOrder, String sortFunction) {
        this.column = column;
        this.sortField = sortField;
        this.sortOrder = sortOrder;
        this.sortFunction = sortFunction;
    }

	public Object getColumn() {
		return column;
	}

	public void setColumn(Object column) {
		this.column = column;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public SortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(SortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getSortFunction() {
		return sortFunction;
	}

	public void setSortFunction(String sortFunction) {
		this.sortFunction = sortFunction;
	}

}
