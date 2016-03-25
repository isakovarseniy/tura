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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;

import com.rits.cloning.Cloner;

public abstract class Command {

	private transient DataControl<?> datacontrol;
	protected List<CallParameter> parameters = new ArrayList<>();

	private Object oldValue;
	private Object newValue;
	private String property;
	private Object obj;	
	private Object wrappedObject;
	public HashMap<String,Object> providers = new HashMap<>();
	
	public abstract Object execute() throws Exception;

	public abstract void delayedExecution() throws Exception;

	public void compress(HashMap <String,Object> context) throws TuraException{
		
	}
	
	public boolean isCompressable(Command prevCommand) throws TuraException{
		return false;
	}
	
	public Command(DataControl<?> datacontrol) {
		this.datacontrol =datacontrol;
	}	
	
	public Command() {
	}	
	
	public Object getProvider(String providerType) {
		return providers.get(providerType);
	}

	public void setParameters(List<CallParameter> parameters) {
		this.parameters = parameters;
	}

	public Object getOldValue() {
		return oldValue;
	}

	public void setOldValue(Object oldValue) {
		this.oldValue = oldValue;
	}

	public Object getNewValue() {
		return newValue;
	}

	public void setNewValue(Object newValue) {
		this.newValue = newValue;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Object getWrappedObject() {
		return wrappedObject;
	}

	public void setWrappedObject(Object wrappedObject) {
		this.wrappedObject = wrappedObject;
	}

	public void setProvider(Object provider,String providerType) {
		this.providers.put(providerType, provider);
	}

	public List<CallParameter> getParameters() {
		return parameters;
	}

	public DataControl<?> getDatacontrol() {
		return datacontrol;
	}

	public void setDatacontrol(DataControl<?> datacontrol) {
		this.datacontrol = datacontrol;
	}

	public Method prepareCall(  Object provider , String method ) throws Exception {
		ArrayList<Class<?>> ls = new ArrayList<>();
		for (CallParameter prm : parameters) {
			ls.add(prm.getClazz());
		}
		return  provider.getClass().getMethod(method,
				ls.toArray(new Class<?>[ls.size()]));
	}

	protected Object callMethod(Method call , Object provider , List<CallParameter> params ) throws Exception {

		ArrayList<Object> ls = new ArrayList<>();
		for (CallParameter prm : params) {
			ls.add(prm.getObj());
		}
		return call.invoke(provider, ls.toArray(new Object[ls.size()]));
	}

	public void fixParameters(String pattern,String replacement){
		for (CallParameter parameter : parameters){
			String exp = parameter.getExpression();
			if (exp != null && !exp.equals("")) {
				parameter.setExpression(exp.replaceAll(pattern, replacement));
			}			
		}
	}	
	
	public void prepareParameters() throws Exception {

		Cloner cloner = new Cloner();

		if (parameters.size() != 0) {
			for (CallParameter parameter : parameters) {

				String exp = parameter.getExpression();
				Object val = parameter.getValue();
				Class<?> clazz = parameter.getClazz();
				if ((exp != null && !exp.equals(""))
						&& (val != null && !val.equals(""))) {
					new TuraException("Wrong combination of method's parameter");
				}
				if (exp != null && !exp.equals("")) {
					Object obj = datacontrol.getElResolver().getValue(exp);

					if (!obj.getClass().isPrimitive()&& obj.getClass().getName().indexOf("EnhancerByCGLIB") != -1) {
						Object w = Reflection.call(obj, "getWrapper");
						if (w instanceof BeanWrapper)
						    obj = ((BeanWrapper)w).getObj();
					}

					Object o = cloner.deepClone(obj);
					parameter.setObj(o);
				}
				if (val != null && !val.equals("")) {
					Constructor<?> cnt =  clazz.getDeclaredConstructor(String.class);
					Object o = cnt.newInstance(val);
					parameter.setObj(o);
				}

			}
		}
	}

	public HashMap<String, Object> getProviders() {
		return providers;
	}

	public void setProviders(HashMap<String, Object> providers) {
		this.providers = providers;
	}
	
}
