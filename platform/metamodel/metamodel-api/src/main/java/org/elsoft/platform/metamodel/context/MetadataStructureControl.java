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
package org.elsoft.platform.metamodel.context;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.datacontrol.StructureControl;


import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InterfaceMaker;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MetadataStructureControl implements MethodInterceptor {

	private Object obj;

	private static Logger logger = Logger
			.getLogger(MetadataStructureControl.class.getName());

	public Object intercept(Object proxy, Method m, Object[] args,
			MethodProxy arg3) throws Throwable {

		Object result;

		try {

			if (m.getName().equals("getWrapper")) {
				return this;
			}

			if (m.getName().equals("createObjectCommand")) {

				result = m.invoke(obj, args);

				SessionContext context = new PostCreateContext();
				context.set(((DataControl<?>) args[0]).getMode(), result);
				return null;
			}

			if (m.getName().equals("insertObjectCommand")) {
				SessionContext context = new InsertContext();
				context.set(((DataControl<?>) args[1]).getMode(), args[0]);

				result = m.invoke(obj, args);

				context.unset(((DataControl<?>) args[1]).getMode());

				return result;
			}

			if (m.getName().equals("updateObjectCommand")) {
				SessionContext context = new UpdateContext();
				context.set(((DataControl<?>) args[1]).getMode(), args[0]);

				result = m.invoke(obj, args);

				context.unset(((DataControl<?>) args[1]).getMode());

				return result;
			}

			if (m.getName().equals("removeObjectCommand")) {
				SessionContext context = new RemoveContext();
				context.set(((DataControl<?>) args[1]).getMode(), args[0]);

				result = m.invoke(obj, args);

				context.unset(((DataControl<?>) args[1]).getMode());

				return result;
			}

			result = m.invoke(obj, args);

		} catch (Exception e) {
			throw new RuntimeException("unexpected invocation exception: "
					+ e.getMessage());
		}

		return result;
	}

	@SuppressWarnings("rawtypes")
	public static Object newInstance() {
		try {

			// Create a dynamice interface
			InterfaceMaker im = new InterfaceMaker();

			// Define a getter method to get Wrapper object
			org.objectweb.asm.Type[] parameters = new org.objectweb.asm.Type[] {};
			Signature signature = new Signature("getWrapper",
					org.objectweb.asm.Type
							.getType(MetadataStructureControl.class),
					parameters);
			im.add(signature, parameters);

			// public void createObjectCommand(DataControl<?> datacontrol)
			parameters = new org.objectweb.asm.Type[] { org.objectweb.asm.Type
					.getType(DataControl.class) };
			signature = new Signature("createObjectCommand",
					org.objectweb.asm.Type.VOID_TYPE, parameters);
			im.add(signature, parameters);

			// public void insertObjectCommand(Object obj, DataControl<?>
			// datacontrol)

			parameters = new org.objectweb.asm.Type[] {
					org.objectweb.asm.Type.getType(Object.class),
					org.objectweb.asm.Type.getType(DataControl.class) };
			signature = new Signature("insertObjectCommand",
					org.objectweb.asm.Type.VOID_TYPE, parameters);
			im.add(signature, parameters);

			// public void updateObjectCommand(Object obj, DataControl<?>
			// datacontrol)

			// public void removeObjectCommand(Object obj, DataControl<?>
			// datacontrol)

			// Finish creating the interface
			Class myInterface = im.create();

			MetadataStructureControl interceptor = new MetadataStructureControl();
			Enhancer e = new Enhancer();
			e.setSuperclass(StructureControl.class);
			e.setInterfaces(new Class[] { myInterface });
			e.setCallback(interceptor);

			Object bean = e.create();

			return bean;
		} catch (Throwable e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
			throw new Error(e.getMessage());
		}

	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
