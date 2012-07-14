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
package org.elsoft.platform.metamodel.processor.datasource.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

import org.elsoft.platform.OrderType;
import org.elsoft.platform.metamodel.general.MethodDAO;
import org.elsoft.platform.metamodel.general.ParameterDAO;
import org.elsoft.platform.metamodel.types.MethodHandler;
import org.elsoft.platform.metamodel.general.TypeDAO;

public class RemoteMethod {

	private IndependentType proxy;
	private String parentUuid;
	private String methodName;
	private IndependentType returnType;
	private ArrayList<Parameter> paramClass = new ArrayList<Parameter>();
	private String methodType;
	private Long refMethod;
	private String uuid = UUID.randomUUID().toString();

	public RemoteMethod(MethodHandler mh, MethodDAO method , String methodType) {
		Iterator<ParameterDAO> itr = (Iterator<ParameterDAO>) mh
				.getParameterHandler().orderBy("objId", OrderType.ASC).getList();
		this.methodType = methodType;
		this.methodName = method.getMethod();

		if (method.getReturnType() != null)
			this.returnType = new IndependentType(mh.getTypeDefinitionHandler()
					.getObject());

		while (itr.hasNext()) {
			ParameterDAO param = itr.next();
			paramClass.add(new Parameter((TypeDAO) mh.getParameterHandler()
					.getTypeDefinitionHandler().getObject(), param));
		}

		this.proxy = new IndependentType(mh.getMasterTypeHandler().getObject());
	}

	public IndependentType getProxy() {
		return proxy;
	}

	public void setProxy(IndependentType proxy) {
		this.proxy = proxy;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public IndependentType getReturnType() {
		return returnType;
	}

	public void setReturnType(IndependentType returnType) {
		this.returnType = returnType;
	}

	public void addParam(Parameter param) {
		this.paramClass.add(param);
	}

	public ArrayList<Parameter> getParamClass() {
		return paramClass;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public Long getRefMethod() {
		return refMethod;
	}

	public void setRefMethod(Long refMethod) {
		this.refMethod = refMethod;
	}

	public String getParentUuid() {
		return parentUuid;
	}

	public void setParentUuid(String parentUuid) {
		this.parentUuid = parentUuid;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
