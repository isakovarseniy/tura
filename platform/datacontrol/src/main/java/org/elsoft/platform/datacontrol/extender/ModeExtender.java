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
package org.elsoft.platform.datacontrol.extender;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.datacontrol.AnnotationMethodFiltering;
import org.elsoft.platform.datacontrol.FactoryDataControl;
import org.elsoft.platform.datacontrol.Mode;
import org.elsoft.platform.datacontrol.annotations.Connection;
import org.elsoft.platform.datacontrol.annotations.GetMode;
import org.elsoft.platform.datacontrol.metainfo.Relation;

import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InterfaceMaker;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

public class ModeExtender implements MethodInterceptor {

	private Mode<?> obj;
	private Class<?> clazz;
	private FactoryDataControl factory;
	private HashMap<String, Connection> relationMethod = new HashMap<String, org.elsoft.platform.datacontrol.annotations.Connection>();
	private HashMap<String, String> relationByName = new HashMap<String, String>();

	private String getModeMethod;
	private static Logger logger = Logger.getLogger(ModeExtender.class
			.getName());

	public void addRelationsMethod(String method, Connection relation) {
		relationMethod.put(method, relation);
		relationByName.put(relation.connectionName(), method);
	}

	public void setGetModeMethod(String method) {
		getModeMethod = method;
	}

    public HashMap<String, Connection> getConnections(){
    	return relationMethod;
    }
    
	public Mode<?> getMode() {
		return obj;
	}

	public String getRelationMethod(String relationName) {
		return this.relationByName.get(relationName);
	}

	public HashMap<String, String> getRelations() {
		return relationByName;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	@SuppressWarnings("rawtypes")
	public static Object newInstance(Class clazz, Mode<?> mode,
			FactoryDataControl factory) {
		try {
			// Create a dynamice interface
			InterfaceMaker im = new InterfaceMaker();

			// Define a getter method to get Wrapper object
			org.objectweb.asm.Type[] parameters = new org.objectweb.asm.Type[] {};
			Signature signature = new Signature("getWrapper",
					org.objectweb.asm.Type.getType(ModeExtender.class),
					parameters);
			im.add(signature, parameters);

			// Finish creating the interface
			Class myInterface = im.create();

			AnnotationMethodFiltering filter = new AnnotationMethodFiltering();
			Field[] fields = clazz.getDeclaredFields();

			for (int i = 0; i < fields.length; i++) {
				if (fields[i].isAnnotationPresent(Connection.class)) {
					filter.addMethod("get"
							+ StringUtils.capitalize(fields[i].getName()));
				}

				if (fields[i].isAnnotationPresent(GetMode.class)) {
					filter.addMethod("get"
							+ StringUtils.capitalize(fields[i].getName()));
				}
			}

			ModeExtender interceptor = new ModeExtender();
			Enhancer e = new Enhancer();
			e.setSuperclass(clazz);
			e.setInterfaces(new Class[] { myInterface });
			e.setCallbackFilter(filter);
			e.setCallbacks(new Callback[] { interceptor, NoOp.INSTANCE });

			Object bean = e.create();
			ModeExtender w = (ModeExtender) Reflection.call(bean, "getWrapper");

			for (int i = 0; i < fields.length; i++) {
				if (fields[i].isAnnotationPresent(Connection.class)) {
					Connection relAnnotation = fields[i]
							.getAnnotation(Connection.class);

					Relation rel = new Relation();
					rel.setParent(mode);
					rel.setChild(null);
					rel.setCascade(relAnnotation.cascade());

					for (int j = 0; j < relAnnotation.links().length; j++) {
						rel.setLink(relAnnotation.links()[j].field1(),
								relAnnotation.links()[j].field2());
					}
					mode.addChildren(relAnnotation.connectionName(), rel);
					w.addRelationsMethod(
							"get" + StringUtils.capitalize(fields[i].getName()),
							relAnnotation);
				}

				if (fields[i].isAnnotationPresent(GetMode.class)) {
					w.setGetModeMethod("get"
							+ StringUtils.capitalize(fields[i].getName()));
				}
			}
			w.obj = mode;
			w.factory = factory;
			w.clazz = clazz;

			return bean;
		} catch (Throwable e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
			throw new Error(e.getMessage());
		}

	}

	public Object intercept(Object proxy, Method m, Object[] args,
			MethodProxy arg3) throws Throwable {
		Object result;

		try {

			if (m.getName().equals("getWrapper")) {
				return this;
			}

			if (relationMethod.keySet().contains(m.getName())) {
				Relation rel = obj.getChildren(relationMethod.get(m.getName())
						.connectionName());
				if (rel.getChild() == null) {
					Object object = factory.newInstance(relationMethod.get(
							m.getName()).connectedObject());
					Mode<?> mode = ((ModeExtender) Reflection.call(object,
							"getWrapper")).obj;
					mode.setExtender(object);
					rel.setChild(mode);
					this.obj.addChildren(relationMethod.get(m.getName())
							.connectionName(), rel);
					return object;
				} else {
					return rel.getChild().getExtender();
				}
			}
			if (m.getName().equals(this.getModeMethod)) {
				return this.obj;
			} else {

				result = m.invoke(proxy, args);
			}

		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw new RuntimeException("unexpected invocation exception: "
					+ e.getMessage());
		}
		return result;
	}

}
