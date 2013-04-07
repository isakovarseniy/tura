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
package org.elsoft.platform.datacontrol.qry;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.datacontrol.DCMetaInfo;
import org.elsoft.platform.datacontrol.DCMetaInfoLevel;
import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.datacontrol.MethodFilter;
import org.elsoft.platform.datacontrol.metainfo.ArtificialProperty;


import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InterfaceMaker;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

public class QryModeBeanWrapper implements MethodInterceptor {

	private HashMap<String, Object> properties = new HashMap<String, Object>();
	private Object obj;
	private ArrayList<String> artificialmethod = new ArrayList<String>();
	private HashMap<String, Object> artificialvalues = new HashMap<String, Object>();
	
	private static Logger logger = Logger.getLogger(QryModeBeanWrapper.class.getName());


	public void addArtificialmethod(String method) {
		artificialmethod.add(method);
	}
	
	public ArrayList<String> getArtificialmethod() {
		return artificialmethod;
	}
	
	
	@SuppressWarnings("rawtypes")
	public static Object newInstance(Class clazz, String object ,DataControl<?> datacontrol) {
		try {

			InterfaceMaker im = new InterfaceMaker();

			org.objectweb.asm.Type[] parameters = new org.objectweb.asm.Type[] {};
			Signature signature = new Signature("getWrapper",
					org.objectweb.asm.Type.getType(QryModeBeanWrapper.class),
					parameters);
			im.add(signature, parameters);

			Method methods[] = clazz.getMethods();
			for (int i = 0; i < methods.length; i++) {

				if (methods[i].getName().startsWith("set")) {
					String suffix = methods[i].getName().substring(3);

					// Add comparator
					// getter
					parameters = new org.objectweb.asm.Type[] {};
					signature = new Signature("getComparator" + suffix,
							org.objectweb.asm.Type.getType(String.class),
							parameters);

					im.add(signature, parameters);

					// setter
					parameters = new org.objectweb.asm.Type[] { org.objectweb.asm.Type
							.getType(String.class) };
					signature = new Signature("setComparator" + suffix,
							org.objectweb.asm.Type.VOID_TYPE, parameters);
					im.add(signature, parameters);

					// Add order by
					// getter
					parameters = new org.objectweb.asm.Type[] {};
					signature = new Signature("getOrderBy" + suffix,
							org.objectweb.asm.Type.getType(String.class),
							parameters);

					im.add(signature, parameters);

					// setter
					parameters = new org.objectweb.asm.Type[] { org.objectweb.asm.Type
							.getType(String.class) };
					signature = new Signature("setOrderBy" + suffix,
							org.objectweb.asm.Type.VOID_TYPE, parameters);
					im.add(signature, parameters);

					
				}
			}

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
					
					// setter
					parameters = new org.objectweb.asm.Type[] { org.objectweb.asm.Type
							.getType(String.class) };
					signature = new Signature("setComparator" + StringUtils.capitalize(obj.getProperty()),
							org.objectweb.asm.Type.VOID_TYPE, parameters);
					im.add(signature, parameters);

					// getter
					parameters = new org.objectweb.asm.Type[] {};
					signature = new Signature("getComparator" + StringUtils.capitalize(obj.getProperty()),
							org.objectweb.asm.Type.getType(String.class),
							parameters);
					im.add(signature, parameters);

					
					// Add order by
					// getter
					parameters = new org.objectweb.asm.Type[] {};
					signature = new Signature("getOrderBy" + StringUtils.capitalize(obj.getProperty()),
							org.objectweb.asm.Type.getType(String.class),
							parameters);

					im.add(signature, parameters);

					// setter
					parameters = new org.objectweb.asm.Type[] { org.objectweb.asm.Type
							.getType(String.class) };
					signature = new Signature("setOrderBy" + StringUtils.capitalize(obj.getProperty()),
							org.objectweb.asm.Type.VOID_TYPE, parameters);
					im.add(signature, parameters);

				}
			}
			
			
			
			Class myInterface = im.create();

			QryModeBeanWrapper interceptor = new QryModeBeanWrapper();
			Enhancer e = new Enhancer();
			e.setSuperclass(clazz);
			e.setInterfaces(new Class[] { myInterface });
			e.setCallbackFilter(new MethodFilter());
			e.setCallbacks ( new Callback[]{
					interceptor,
					NoOp.INSTANCE
			});

			Object bean = e.create();
			h = datacontrol
					.getMode()
					.getStControl()
					.getAnnotation(object, DCMetaInfoLevel.Field,
							DCMetaInfo.ArtificialProperty);
			if (h != null) {
				Iterator<Object> itr = h.values().iterator();
				QryModeBeanWrapper w = (QryModeBeanWrapper) Reflection.call(
						bean, "getWrapper");

				while (itr.hasNext()) {
					ArtificialProperty obj = (ArtificialProperty) itr.next();
					w.addArtificialmethod(obj
							.getProperty());
				}
			}
			
			
			return bean;

		} catch (Exception e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
			return null;
		}
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		
		//Clean up object
		Method[] m = obj.getClass().getMethods();
		for (int i = 0; i < m.length; i++) {
			if (m[i].getName().substring(0, 3).equals("set")) {
				try {
					Class<?>[] parmClass = m[i].getParameterTypes();
					if (parmClass[0].isPrimitive())
							continue;
					m[i].invoke(obj, new Object[] { null });
				} catch (Exception e) {
					logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);

				}
			}
		}

		this.obj = obj;
	}

	public Object intercept(Object proxy, Method m, Object[] args,
			MethodProxy arg3) throws Throwable {

		if (m.getName().equals("getWrapper")) {
			return this;
		}

		String suffix = m.getName().substring(3);

		if ((m.getName().startsWith("setComparator"))
				|| (m.getName().startsWith("setOrderBy"))) {
			properties.put(suffix, args[0]);
			return null;
		}
		if ((m.getName().startsWith("getComparator"))
				|| (m.getName().startsWith("getOrderBy"))

		) {
			return properties.get(suffix);
		}
		String field = StringUtils.uncapitalize(m.getName().substring(3));
		
		if (artificialmethod.contains(field)) {
			if ((m.getName().substring(0, 3).equals("set"))) {
				artificialvalues.put(field,
						args[0]);
				return null;
			} else {
				return artificialvalues.get(field);
			}
		} 

		Object result = m.invoke(obj, args);
		return result;

	}

}
