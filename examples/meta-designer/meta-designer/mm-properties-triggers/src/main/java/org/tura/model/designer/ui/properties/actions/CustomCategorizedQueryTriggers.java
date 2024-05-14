/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.properties.actions;

import java.util.List;
import java.util.Map;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.model.designer.exchange.CdiAppExchange;
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.annotations.CustomQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.QueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.proxy.access.ArrayListWithSearch;

@Alternative
@Priority(10)
@Selector("mmdesigner.properties")
@CustomQuery("categorized")
public class CustomCategorizedQueryTriggers implements QueryTrigger {

	private static final long serialVersionUID = 1L;

	@Inject
	private CdiAppExchange exchange;

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> execute(CpaRepository repository, Pager<T> pager) throws TuraException {
		try {
			Map<String, Object> selected = (Map<String, Object>) exchange.getObject("objectForProperty");
			if (selected != null) {
				String className = (String) selected.get("class");
				RepoKeyPath path = (RepoKeyPath) selected.get("path");

				if (className != null && path != null) {
					Class<?> clazz = Class.forName(className);
					if (Categorized.class.isAssignableFrom(clazz)) {
						Categorized c = (Categorized) repository.find(path, clazz);
						List<Categorized> list =  new ArrayListWithSearch<Categorized>();
						list.add(c);
						return (List<T>) list;
					}
				}
			}
			return new ArrayListWithSearch<T>();
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

}
