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
package org.elsoft.platform.datacontrol;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.ComparatorType;
import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.OrderType;
import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.datacontrol.metainfo.Relation;
import org.elsoft.platform.datacontrol.qry.QryModeBeanWrapper;


public class Qry2InsActivity implements Activity {
	private static Logger logger = Logger.getLogger(Relation.class.getName());

	public boolean execute(DataControl<?> carrentDC, DataControl<?> newDC) {
		try {
			Object searchObject = carrentDC.getCurrentObject();
			Method[] methods = searchObject.getClass().getMethods();

			ArrayList<SearchCriteria> scls = new ArrayList<SearchCriteria>();
			ArrayList<OrderCriteria> orls = new ArrayList<OrderCriteria>();

			for (int i = 0; i < methods.length; i++) {
				if ((methods[i].getName().startsWith("get"))
						&& (!methods[i].getName().startsWith("getWrapper"))
						&& (!methods[i].getName().startsWith("getCallback"))
						&& (!methods[i].getName().startsWith("getOrderBy"))
						&& (!methods[i].getName().startsWith("getComparator"))
						&& (!methods[i].getName().startsWith("getClass"))) {

					String suffix = methods[i].getName().substring(
							"set".length());

					QryModeBeanWrapper w = (QryModeBeanWrapper) Reflection
							.call(searchObject, "getWrapper");
					if (w.getArtificialmethod().contains(StringUtils.uncapitalize( suffix)))
						continue;

					Object obj = methods[i].invoke(searchObject,
							new Object[] {});
					if ((obj != null)&&(!obj.equals(""))) {

						String cmp = (String) Reflection.call(searchObject,
								"getComparator" + suffix);
						if (cmp == null)
							cmp = ComparatorType.EQ.name();

						SearchCriteria sc = new SearchCriteria();

						sc.setName(StringUtils.uncapitalize(suffix));
						sc.setClassName(obj.getClass().getName());
						sc.setValue(obj.toString());
						sc.setComparator(cmp);

						scls.add(sc);

						String ord = (String) Reflection.call(searchObject,
								"getOrderBy" + suffix);
						if (ord == null)
							ord = OrderType.ASC.getOrd();

						OrderCriteria oc = new OrderCriteria();

						oc.setName(StringUtils.uncapitalize(suffix));
						oc.setOrder(ord);

						orls.add(oc);

					}
				}
			}
			newDC.setFilter(scls);
			newDC.setOrderby(orls);
			newDC.setRefresh(true);

			return true;
		} catch (Exception e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
			return false;
		}
	}

}
