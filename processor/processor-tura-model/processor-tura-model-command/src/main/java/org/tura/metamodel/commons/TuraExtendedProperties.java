/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.epsilon.eol.execute.context.ExtendedProperties;
import org.tura.platform.repository.core.ObjectControl;

public class TuraExtendedProperties extends ExtendedProperties{

	
	private Map<Object, Map<String, Object>> map = new HashMap<>();
	
	protected Map<String, Object> getPropertyValues(Object o, boolean create) {
		if ( o instanceof ObjectControl ) {
			ObjectControl oc = (ObjectControl) o;
			Object key;
			try {
				key = oc.getCpaPath().toString();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			
			Map<String, Object> propertyValues = map.get(key);
			if (propertyValues == null) {
				propertyValues = new HashMap<>(4);
				if (create) {
					map.put(key, propertyValues);
				}
			}
			
			return propertyValues;
		}
		return super.getPropertyValues(o,create);
	}

}
