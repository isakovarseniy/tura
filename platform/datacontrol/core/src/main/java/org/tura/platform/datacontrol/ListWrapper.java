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

package org.tura.platform.datacontrol;

import java.util.AbstractList;
import java.util.List;

import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.proxy.ArtificialFieldWrapperProvider;

public class ListWrapper<T> extends AbstractList<T> {
	private List<T> list;
	private DataControl<T> dc;

	public ListWrapper(List<T> list, DataControl<T> dc) {
		this.list = list;
		this.dc = dc;
	}

	@Override
	public boolean add(T t) {
		return list.add(t);
	}

	@Override
	public void add(int index, T t) {
		list.add(index, t);
	}

	@Override
	public T remove(int index) {
		return list.remove(index);
	}

	@Override
	public T get(int index) {
		if  (list == null || list.size() == 0) {
			return null;
		}
		return wrapper(list.get(index));
	}

	@Override
	public int size() {
		if  (list == null) {
			return 0;
		}
		return list.size();
	}

	private T wrapper(T t) {
		try {
			if (  t == null) {
				return null;
			}
			ObjectControl oc = (ObjectControl) t;
			if (oc.getObjectControlAttributes() != null && oc.getObjectControlAttributes().get(Constants.POST_QUERY_TRIGGER_COMPLETED) == null) {
				PostQueryTrigger trigger  = dc.getPostQueryTrigger();
				if (trigger != null) {
					trigger.execute(dc, oc);
				}
				oc.getObjectControlAttributes().put(Constants.POST_QUERY_TRIGGER_COMPLETED, true);
			}
			oc.getObjectControlAttributes().put(Constants.DATA_CONTROL, dc);
			
			oc.addArtificialFieldWrapperProvider((ArtificialFieldWrapperProvider) dc);
			
			return t;
		} catch (Exception e) {
			throw new RuntimeException(e);

		}

	}

}
