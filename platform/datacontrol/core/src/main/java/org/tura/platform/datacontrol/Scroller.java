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
package org.tura.platform.datacontrol;

import java.util.AbstractList;

import org.tura.platform.datacontrol.commons.TuraException;

public class Scroller<T>  extends AbstractList<T> {

	private Pager<T> pager;
	
	public Scroller(Pager<T> pager ){
		this.pager=pager;
	}
	
	@Override
	public T get(int index) {
		try {
			return pager.getObject(index);
		} catch (TuraException e) {
			throw new IndexOutOfBoundsException(e.getMessage());
		}
	}

	@Override
	public int size() {
		try {
			return (int)pager.actualListSize();
		} catch (TuraException e) {
			throw new RuntimeException(e);
		}
	}
	
	protected Pager<T>  getPager(){
		return pager;
	}

}
