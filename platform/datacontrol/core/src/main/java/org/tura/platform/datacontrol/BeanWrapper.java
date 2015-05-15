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
package org.tura.platform.datacontrol;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InterfaceMaker;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;

public class BeanWrapper implements MethodInterceptor {

	private Object obj;
	private DataControl<?> datacontrol;
	private boolean insertMode = false;
	private ArrayList<String> exceptionmethod = new ArrayList<String>();
	private ArrayList<String> artificialmethod = new ArrayList<String>();
	private HashMap<String, Object> artificialvalues = new HashMap<String, Object>();

	public void addExceptionsmethod(String method) {
		exceptionmethod.add(method);
	}

	public void addArtificialmethod(String method, Object value) {
		artificialmethod.add(method);
		exceptionmethod.add(method);
		if (value != null) {
			artificialvalues.put(method, value);
		}
	}

	public boolean isInsertMode() {
		return insertMode;
	}

	public void setInsertMode(boolean insertMode) {
		this.insertMode = insertMode;
	}

	public DataControl<?> getDatacontrol() {
		return datacontrol;
	}

	public void setDatacontrol(DataControl<?> datacontrol) {
		this.datacontrol = datacontrol;
	}

	@SuppressWarnings("rawtypes")
	public static Object newInstance(Class clazz, DataControl<?> datacontrol)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Class[] interfaces;

		// Create a dynamice interface
		InterfaceMaker im = new InterfaceMaker();

		// Define a getter method to get Wrapper object
		org.objectweb.asm.Type[] parameters = new org.objectweb.asm.Type[] {};
		Signature signature = new Signature("getWrapper",
				org.objectweb.asm.Type.getType(BeanWrapper.class), parameters);
		im.add(signature, parameters);

		if (datacontrol.getArtificialInterface() == null) {
			for (ArtificialProperty obj : datacontrol.getArtificialProperties()) {

				parameters = new org.objectweb.asm.Type[] {};

				if (obj.getType().getCanonicalName()
						.equals("java.lang.Boolean")) {
					signature = new Signature("is"
							+ StringUtils.capitalize(obj.getProperty()),
							org.objectweb.asm.Type.getType(obj.getType()),
							parameters);
					im.add(signature, parameters);
				}

				signature = new Signature("get"
						+ StringUtils.capitalize(obj.getProperty()),
						org.objectweb.asm.Type.getType(obj.getType()),
						parameters);
				im.add(signature, parameters);

				parameters = new org.objectweb.asm.Type[] { org.objectweb.asm.Type
						.getType(obj.getType()) };
				signature = new Signature("set"
						+ StringUtils.capitalize(obj.getProperty()),
						org.objectweb.asm.Type.VOID_TYPE, parameters);
				im.add(signature, parameters);

			}
		}
		// Finish creating the interface
		Class  myInterface = im.create();

		if (datacontrol.getArtificialInterface() == null) 
			interfaces = new Class[]{myInterface};
		else
			interfaces = new Class[]{myInterface,datacontrol.getArtificialInterface() };
		
		BeanWrapper interceptor = new BeanWrapper();
		Enhancer e = new Enhancer();
		e.setSuperclass(clazz);
		e.setInterfaces(interfaces);
		e.setCallbackFilter(new MethodFilter());
		e.setCallbacks(new Callback[] { interceptor, NoOp.INSTANCE });

		Object bean = e.create();

		BeanWrapper w = (BeanWrapper) Reflection.call(bean, "getWrapper");

		for (ArtificialProperty obj : datacontrol.getArtificialProperties()) {
			w.addArtificialmethod(obj.getProperty(), obj.getDefaultValue());
		}
		return bean;

	}

	public Object intercept(Object proxy, Method m, Object[] args,
			MethodProxy arg3) throws Throwable {
		Object result;

		Object newValue = null;
		Object oldValue = null;

		try {

			if (m.getName().equals("getWrapper")) {
				return this;
			}

			if (m.getName().equals("toString")) {
				Field[] fields = obj.getClass().getDeclaredFields();
				ArrayList<String> list = new ArrayList<String>();
				for (int i = 0; i < fields.length; i++) {
					if (fields[i].getType() == byte[].class) {
						list.add(fields[i].getName());
					}
				}
				ReflectionToStringBuilder reflectionToStringBuilder = new ReflectionToStringBuilder(
						obj);
				reflectionToStringBuilder.setAppendStatics(false);
				reflectionToStringBuilder.setAppendTransients(false);
				reflectionToStringBuilder.setExcludeFieldNames(list
						.toArray(new String[0]));
				return reflectionToStringBuilder.toString();

			}

			String field = null;
			if ((m.getName().substring(0, 3).equals("set"))
					|| (m.getName().substring(0, 3).equals("get")))
				field = StringUtils.uncapitalize(m.getName().substring(3));
			else {
				if (m.getName().substring(0, 2).equals("is"))
					field = StringUtils.uncapitalize(m.getName().substring(2));
			}

			if ((m.getName().substring(0, 3).equals("set"))
					&& (!exceptionmethod.contains(field))) {

				Method getter = null;
				try {
					String getAccessor = "get" + m.getName().substring(3);

					getter = obj.getClass().getMethod(getAccessor,
							new Class[] {});

				} catch (NoSuchMethodException nm) {
					String getAccessor = "is" + m.getName().substring(3);

					getter = obj.getClass().getMethod(getAccessor,
							new Class[] {});

				}
				oldValue = getter.invoke(obj, new Object[] {});

				if ((oldValue != null) && (oldValue.equals("")))
					oldValue = null;

				newValue = args[0];
				if ((args[0] != null) && (args[0].equals("")))
					newValue = null;
			}

			if ((field != null) && (artificialmethod.contains(field))) {
				if ((m.getName().substring(0, 3).equals("set"))) {
					result = artificialvalues.put(field, args[0]);
				} else {
					result = artificialvalues.get(field);
				}
			} else {
				result = m.invoke(obj, args);
			}

			if ((m.getName().substring(0, 3).equals("set"))
					&& (!exceptionmethod.contains(field))) {

				if ((newValue == null) && (oldValue == null))
					return result;
				if ((newValue != null) && (oldValue == null)
						|| (newValue == null) && (oldValue != null)) {

					createCommand();

				} else if (!newValue.equals(oldValue)) {

					createCommand();
				}
			}
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw new RuntimeException("unexpected invocation exception: "
					+ e.getMessage());
		}
		return result;
	}

	private void createCommand() throws Exception {
		if (datacontrol.getCommandStack() != null) {
			if (this.insertMode) {

				datacontrol.getInsertCommand().setObj(obj);
				datacontrol.getInsertCommand().execute();
				setInsertMode(false);
			} else {
				datacontrol.getUpdateCommand().setObj(obj);
				datacontrol.getUpdateCommand().execute();
			}
		}
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}
