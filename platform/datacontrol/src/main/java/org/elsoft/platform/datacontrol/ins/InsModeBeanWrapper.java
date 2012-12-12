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
package org.elsoft.platform.datacontrol.ins;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.datacontrol.DCMetaInfo;
import org.elsoft.platform.datacontrol.DCMetaInfoLevel;
import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.datacontrol.MethodFilter;
import org.elsoft.platform.datacontrol.Pager;
import org.elsoft.platform.datacontrol.metainfo.ArtificialProperty;

import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.*;

public class InsModeBeanWrapper implements MethodInterceptor {

	private Object obj;
	private DataControl<?> datacontrol;
	private boolean insertMode = false;
	private ArrayList<String> exceptionmethod = new ArrayList<String>();
	private ArrayList<String> artificialmethod = new ArrayList<String>();
	private HashMap<String, Object> artificialvalues = new HashMap<String, Object>();

	@SuppressWarnings("rawtypes")
	private Pager pager;
	private static Logger logger = Logger.getLogger(InsModeBeanWrapper.class
			.getName());

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
	public static Object newInstance(Class clazz, String object,
			DataControl<?> datacontrol) {
		try {

			// Create a dynamice interface
			InterfaceMaker im = new InterfaceMaker();

			// Define a getter method to get Wrapper object
			org.objectweb.asm.Type[] parameters = new org.objectweb.asm.Type[] {};
			Signature signature = new Signature("getWrapper",
					org.objectweb.asm.Type.getType(InsModeBeanWrapper.class),
					parameters);
			im.add(signature, parameters);

			HashMap<String, Object> h = datacontrol
					.getMode()
					.getStControl()
					.getAnnotation(object, DCMetaInfoLevel.Field,
							DCMetaInfo.ArtificialProperty);
			if (h != null) {
				Iterator<Object> itr = h.values().iterator();
				while (itr.hasNext()) {
					ArtificialProperty obj = (ArtificialProperty) itr.next();

					parameters = new org.objectweb.asm.Type[] {};

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
			Class myInterface = im.create();

			InsModeBeanWrapper interceptor = new InsModeBeanWrapper();
			Enhancer e = new Enhancer();
			e.setSuperclass(clazz);
			e.setInterfaces(new Class[] { myInterface });
			e.setCallbackFilter(new MethodFilter());
			e.setCallbacks(new Callback[] { interceptor, NoOp.INSTANCE });

			Object bean = e.create();

			h = datacontrol
					.getMode()
					.getStControl()
					.getAnnotation(object, DCMetaInfoLevel.Field,
							DCMetaInfo.ArtificialProperty);
			if (h != null) {
				Iterator<Object> itr = h.values().iterator();
				InsModeBeanWrapper w = (InsModeBeanWrapper) Reflection.call(
						bean, "getWrapper");

				while (itr.hasNext()) {
					ArtificialProperty obj = (ArtificialProperty) itr.next();
					if (!obj.getDefaultValue().equals("")) {
						Constructor<?> cons = obj.getType().getConstructor(
								String.class);

						w.addArtificialmethod(obj.getProperty(),
								cons.newInstance(obj.getDefaultValue()));
					} else {
						w.addArtificialmethod(obj.getProperty(), null);
					}
				}
			}
			return bean;
		} catch (Throwable e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
			throw new Error(e.getMessage());
		}

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
				return ToStringBuilder.reflectionToString(obj);
			}

			String field = StringUtils.uncapitalize(m.getName().substring(3));

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

			if (artificialmethod.contains(field)) {
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
		if (datacontrol.getMode().getStControl() != null) {
			if (this.insertMode) {

				datacontrol.getMode().getStControl()
						.preInsertTrigger(datacontrol, new Object[] { obj });

				datacontrol.getMode().getStControl()
						.insertObjectCommand(obj, this.getDatacontrol());
				this.insertMode = false;
				datacontrol.getMode().getStControl()
						.addCreatedObjects(obj, datacontrol);
			} else {
				datacontrol.getMode().getStControl()
						.updateObjectCommand(obj, this.getDatacontrol());
				datacontrol.getMode().getStControl()
						.addUpdatedObjects(obj, datacontrol);
			}
		}
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Pager<?> getPager() {
		return pager;
	}

	public void setPager(Pager<?> pager) {
		this.pager = pager;
	}

}
