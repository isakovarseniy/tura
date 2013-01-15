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

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.transaction.TransactionManager;

import org.apache.commons.collections.map.MultiKeyMap;
import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.datacontrol.ins.InsModeBeanWrapper;
import org.elsoft.platform.datacontrol.metainfo.FunctionResult;
import org.elsoft.platform.datacontrol.metainfo.RemoteMethod;
import org.elsoft.platform.datacontrol.metainfo.Trigger;

import com.rits.cloning.Cloner;

public class StructureControl {

	private TransactionManager trx;

	private ArrayList<Command> transaction = new ArrayList<Command>();
	private MultiKeyMap annotation = new MultiKeyMap();
	private HashMap<Object, Object> updatedObjects = new HashMap<Object, Object>();
	private HashMap<Object, Object> createdObjects = new HashMap<Object, Object>();
	private HashMap<Object, Object> removedObjects = new HashMap<Object, Object>();

	private Class<?> postCreateTriggerParameters[] = new Class<?>[] { Object.class };
	private Class<?> preQueryTriggerParameters[] = new Class<?>[] {
			DataControl.class, List.class, List.class };
	private Class<?> postQueryTriggerParameters[] = new Class<?>[] { Object.class };
	private Class<?> preInsertTriggerParameters[] = new Class<?>[] { Object.class };

	public void addUpdatedObjects(Object t, DataControl<?> dc) {
		Object key = dc.getPager().getObjectKey(t);
		this.updatedObjects.put(key, t);
	}

	public void addCreatedObjects(Object t, DataControl<?> dc) {
		this.createdObjects.put(dc.getPager().getObjectKey(t), t);
	}

	public void addRemovedObjects(Object t, DataControl<?> dc) {
		this.removedObjects.put(dc.getPager().getObjectKey(t), t);
	}

	public MultiKeyMap getAnnotation() {
		return annotation;
	}

	public HashMap<Object, Object> getUpdatedObjects() {
		return updatedObjects;
	}

	public HashMap<Object, Object> getCreatedObjects() {
		return createdObjects;
	}

	public HashMap<Object, Object> getRemovedObjects() {
		return removedObjects;
	}

	public void cleaner() {
		updatedObjects = new HashMap<Object, Object>();
		createdObjects = new HashMap<Object, Object>();
		removedObjects = new HashMap<Object, Object>();
	}

	@SuppressWarnings({ "unchecked" })
	public void setAnnotation(String clazz, DCMetaInfoLevel annLevel,
			String annotetedObject, DCMetaInfo annName, Object value) {
		HashMap<String, Object> h = (HashMap<String, Object>) annotation.get(
				clazz, annLevel.name(), annotetedObject);
		if (h == null) {
			h = new HashMap<String, Object>();
			annotation.put(clazz, annLevel.name(), annotetedObject, h);
		}
		h.put(annName.name(), value);

		h = (HashMap<String, Object>) annotation.get(clazz, annLevel.name(),
				annName.name());
		if (h == null) {
			h = new HashMap<String, Object>();
			annotation.put(clazz, annLevel.name(), annName.name(), h);
		}
		h.put(annotetedObject, value);

	}

	@SuppressWarnings({ "unchecked" })
	public HashMap<String, Object> getAnnotation(String clazz,
			DCMetaInfoLevel annLevel, String annotetedObject) {

		return (HashMap<String, Object>) annotation.get(clazz, annLevel.name(),
				annotetedObject);
	}

	@SuppressWarnings({ "unchecked" })
	public HashMap<String, Object> getAnnotation(String clazz,
			DCMetaInfoLevel annLevel, DCMetaInfo annName) {
		return (HashMap<String, Object>) annotation.get(clazz, annLevel.name(),
				annName.name());
	}

	public Object createObjectCommand(DataControl<?> datacontrol)
			throws Exception {

		Command cmd = new Command(DCCommand.CREATE_COMMAND, datacontrol);

		RemoteMethod annotation = (RemoteMethod) getAnnotation(
				datacontrol.getMode().getAnnotatedObject(),
				DCMetaInfoLevel.Class, DCMetaInfo.CreateTrigger).values()
				.iterator().next();
		Object obj = null;

		try {
			trx.begin();

			obj = remoteMethodCall(annotation, cmd.params.toArray());
			trx.commit();

		} catch (Exception e) {
			trx.rollback();
			throw new Exception(e);
		}

		postCreateTrigger(datacontrol,new Object[] { obj });  
		
		FunctionResult functionResult = (FunctionResult) datacontrol
				.getMode()
				.getStControl()
				.getAnnotation(datacontrol.getMode().getAnnotatedObject(),
						DCMetaInfoLevel.Class, DCMetaInfo.FunctionResult)
				.values().iterator().next();

		datacontrol.getMode().getElResolver()
				.setValue(functionResult.getResultExpression(), obj);

		return obj;

	}

	public void insertObjectCommand(Object obj, DataControl<?> datacontrol)
			throws Exception {

		transaction.add(new Command(DCCommand.INSERT_COMMAND, datacontrol));

	}

	public void updateObjectCommand(Object obj, DataControl<?> datacontrol)
			throws Exception {
		transaction.add(new Command(DCCommand.UPDATE_COMMAND, datacontrol));

	}

	public void removeObjectCommand(Object obj, DataControl<?> datacontrol)
			throws Exception {
		transaction.add(new Command(DCCommand.REMOVE_COMMAND, datacontrol));

	}

	public void rallbackCommand() {
		
		Iterator<Command> itr = transaction.iterator();
		while (itr.hasNext()){
			Command cmd = itr.next();
			cmd.datacontrol.setRefresh(true);
		}
		cleaner();
		transaction = new ArrayList<Command>();
	}

	public void commitCommand() throws Exception {
		Iterator<Command> itr = transaction.iterator();

		try {
			trx.begin();
			while (itr.hasNext()) {
				Command cmd = itr.next();
				versionControl(cmd);

				RemoteMethod annotation = (RemoteMethod) getAnnotation(
						cmd.getDatacontrol().getMode().getAnnotatedObject(),
						DCMetaInfoLevel.Class, cmd.commandType.getMethod())
						.values().iterator().next();

				remoteMethodCall(annotation, cmd.params.toArray());

			}
			trx.commit();
			itr = transaction.iterator();
			while (itr.hasNext()) {
				Command cmd = itr.next();
				cmd.getDatacontrol().setRefresh(true);
			}

			cleaner();
			transaction = new ArrayList<Command>();

		} catch (Exception e) {
			trx.rollback();
			throw new Exception(e);
		}
	}

	private void versionControl(Command cmd) {

		@SuppressWarnings("rawtypes")
		Iterator itr = cmd.params.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();

			HashMap<String, Object> h = getAnnotation(cmd.getDatacontrol()
					.getMode().getAnnotatedObject(), DCMetaInfoLevel.Field,
					DCMetaInfo.Version);

			if (h != null) {
				String optlcrMethod = h.keySet().iterator().next();

				Object optlcr = (Number) Reflection.call(obj, "get"
						+ StringUtils.capitalize(optlcrMethod));
				if (optlcr == null) {
					optlcr = 0;
					Reflection.call(obj,
							"set" + StringUtils.capitalize(optlcrMethod), 0);
				}
			}
		}
	}

	public TransactionManager getTrx() {
		return trx;
	}

	public void setTrx(TransactionManager trx) {
		this.trx = trx;
	}

	public static Object remoteMethodCall(RemoteMethod annotation,
			Object[] params) throws Exception {

		Object proxy = annotation.getProxyObject();
		Method m = null;
		m = proxy.getClass().getMethod(
				annotation.getMethod(),
				annotation.getParamsClasses().toArray(
						new Class[annotation.getParamsClasses().size()]));
		Object obj = m.invoke(proxy, params);
		return obj;
	}

	@SuppressWarnings("unused")
	private class Command {
		private DCCommand commandType;
		private DataControl<?> datacontrol;
		@SuppressWarnings("rawtypes")
		private ArrayList params = new ArrayList();

		public DataControl<?> getDatacontrol() {
			return datacontrol;
		}

		public void setDatacontrol(DataControl<?> datacontrol) {
			this.datacontrol = datacontrol;
		}

		@SuppressWarnings("unchecked")
		public Command(DCCommand commandType, DataControl<?> datacontrol)
				throws Exception {
			this.commandType = commandType;
			this.datacontrol = datacontrol;

			RemoteMethod annotation = (RemoteMethod) getAnnotation(
					datacontrol.getMode().getAnnotatedObject(),
					DCMetaInfoLevel.Class, commandType.getMethod()).values()
					.iterator().next();

			Cloner cloner = new Cloner();
			if (annotation.getParamsClasses() != null) {
				int paramSize = annotation.getParamsClasses().size();
				for (int i = 0; i < paramSize; i++) {
					String exp = annotation.getExpressions().get(i);
					String val = annotation.getValues().get(i);
					Class<?> clazz = annotation.getParamsClasses().get(i);
					if (!exp.equals("") & (!val.equals(""))) {
						new Exception("Wrong combination of method's parameter");
					}
					if (!exp.equals("")) {
						Object obj = datacontrol.getMode().getElResolver()
								.getValue(exp);

						if (obj.getClass().getName().indexOf("EnhancerByCGLIB") != -1) {
							InsModeBeanWrapper w = (InsModeBeanWrapper) Reflection
									.call(obj, "getWrapper");
							obj = w.getObj();
						}
						Object o = cloner.deepClone(obj);
						params.add(o);
					}
					if (!val.equals("")) {
						Constructor<?> constructor = clazz
								.getConstructor(String.class);
						params.add(constructor.newInstance(val));
					}
				}
			}
		}

		@SuppressWarnings("rawtypes")
		public List getParams() {
			return params;
		}

	}

	public void preInsertTrigger(DataControl<?> dc, Object... parameters)
			throws Exception {
		callTrigger(dc, DCMetaInfo.PREInsertTrigger,
				preInsertTriggerParameters, parameters);
	}

	public void postQueryTrigger(DataControl<?> dc, Object... parameters)
			throws Exception {
		callTrigger(dc, DCMetaInfo.POSTQueryTrigger,
				postQueryTriggerParameters, parameters);
	}

	public void postCreateTrigger(DataControl<?> dc, Object... parameters)
			throws Exception {
		callTrigger(dc, DCMetaInfo.POSTCreateTrigger,
				postCreateTriggerParameters, parameters);
	}

	public void preQueryTrigger(DataControl<?> dc, Object... parameters)
			throws Exception {
		callTrigger(dc, DCMetaInfo.PREQueryTrigger, preQueryTriggerParameters,
				parameters);
	}

	private void callTrigger(DataControl<?> datacontrol, DCMetaInfo type,
			Class<?>[] parameterTypes, Object... parameters) throws Exception {
		Map<String, Object> triggerMap = datacontrol
				.getMode()
				.getStControl()
				.getAnnotation(datacontrol.getMode().getAnnotatedObject(),
						DCMetaInfoLevel.Class, type);

		if (triggerMap != null) {
			Trigger trigger = (Trigger) triggerMap.values().iterator().next();
			call(parameterTypes, parameters, trigger);
		}

	}

	private Object call(Class<?>[] arg, Object[] var, Trigger trigger)
			throws Exception {
		if (trigger.getCall() == null) {
			trigger.setObj(trigger.getClazz().newInstance());
			trigger.setCall(trigger.getClazz().getMethod(trigger.getMethod(),
					arg));
		}

		return trigger.getCall().invoke(trigger.getObj(), var);
	}

}
