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
package org.tura.platform.datacontrol.model;

import java.util.AbstractList;

import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.commons.TuraException;

public class GridModel<T> extends AbstractList<T> {

	private Pager<T> pager;

	public GridModel( Pager<T> pager) {
		this.pager = pager;
	}

	public int size() {
		return pager.listSize();
	}

	public T get(int index) {
		try {
			return this.pager.getObject(index);
		} catch (TuraException e) {
			throw new RuntimeException(e);
		}
	}

}
