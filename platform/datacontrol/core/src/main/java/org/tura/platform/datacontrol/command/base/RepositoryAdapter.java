/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.datacontrol.command.base;

import java.lang.reflect.Constructor;

import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.Repository;

import com.rits.cloning.Cloner;

public  class RepositoryAdapter {

	private  DataControl<?> datacontrol;
	private Repository repository;
	private Object unwrappedProxyObject;

	
	
	public DataControl<?> getDatacontrol() {
		return datacontrol;
	}


	public void setDatacontrol(DataControl<?> datacontrol) {
		this.datacontrol = datacontrol;
	}


	public void prepareParameter(CallParameter parameter) throws Exception {

		Cloner cloner = new Cloner();

		String exp = parameter.getExpression();
		Object val = parameter.getValue();
		Class<?> clazz = parameter.getClazz();
		if ((exp != null && !exp.equals("")) && (val != null && !val.equals(""))) {
			new TuraException("Wrong combination of method's parameter");
		}
		if (exp != null && !exp.equals("")) {
			Object obj = datacontrol.getElResolver().getValue(exp);

			if (!obj.getClass().isPrimitive() && obj.getClass().getName().indexOf("EnhancerByCGLIB") != -1) {
				Object w = Reflection.call(obj, "getWrapper");
				if (w instanceof BeanWrapper)
					obj = ((BeanWrapper) w).getObj();
			}

			Object o = cloner.deepClone(obj);
			parameter.setObj(o);
		}
		if (val != null && !val.equals("")) {
			Constructor<?> cnt = clazz.getDeclaredConstructor(String.class);
			Object o = cnt.newInstance(val);
			parameter.setObj(o);
		}

	}

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	
	public Object getUnwrappedProxyObject() {
		return unwrappedProxyObject;
	}


	public void setUnwrappedProxyObject(Object unwrappedProxyObject) {
		this.unwrappedProxyObject = unwrappedProxyObject;
	}
	
	
	
	
}
