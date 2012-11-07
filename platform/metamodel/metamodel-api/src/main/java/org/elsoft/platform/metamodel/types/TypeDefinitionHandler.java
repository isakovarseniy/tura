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
package org.elsoft.platform.metamodel.types;

import java.lang.reflect.Method;

import org.elsoft.platform.datacontrol.Mode;
import org.elsoft.platform.datacontrol.annotations.CreateTrigger;
import org.elsoft.platform.datacontrol.annotations.InsertTrigger;
import org.elsoft.platform.datacontrol.annotations.RemoveTrigger;
import org.elsoft.platform.datacontrol.annotations.SearchTrigger;
import org.elsoft.platform.datacontrol.annotations.TriggerOutput;
import org.elsoft.platform.datacontrol.annotations.GetMode;
import org.elsoft.platform.datacontrol.annotations.IdField;
import org.elsoft.platform.datacontrol.annotations.Link;
import org.elsoft.platform.datacontrol.annotations.Variable;
import org.elsoft.platform.datacontrol.annotations.Variables;
import org.elsoft.platform.datacontrol.annotations.Proxy;
import org.elsoft.platform.datacontrol.annotations.Connection;
import org.elsoft.platform.datacontrol.annotations.Base;
import org.elsoft.platform.datacontrol.annotations.UpdateTrigger;
import org.elsoft.platform.datacontrol.annotations.VersionField;
import org.elsoft.platform.datacontrol.extender.Handler;
import org.elsoft.platform.metamodel.MetamodelTypeOfTypes;
import org.elsoft.platform.metamodel.PlatformPrimetiveTypes;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.ELsoftObject;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.persistence.ELsoftJPAEntityService;
import org.elsoft.platform.persistence.TransactionManagerImpl;

@TriggerOutput(expression = SessionContext.RESULT_EXPRESSION)
@Base(clazz = TypeDAO.class)
@VersionField(field = "version")
@IdField(field = "objId")
public class TypeDefinitionHandler extends
		Handler<TypeDefinitionHandler, TypeDAO> {

	@Proxy(name = "generalService")
	private ELsoftJPAEntityService generalService;
	@InsertTrigger(objectAction = "insert", parameters = @Variables(value = { @Variable(expression = SessionContext.CURRENT_RECORD, type = ELsoftObject.class) }), object = "generalService")
	private Method insert;
	@CreateTrigger(objectAction = "create", parameters = @Variables(value = { @Variable(value = "org.elsoft.platform.metamodel.objects.type.TypeDAO", type = String.class) }), object = "generalService")
	private Method create;
	@UpdateTrigger(objectAction = "update", parameters = @Variables(value = { @Variable(expression = SessionContext.CURRENT_RECORD, type = ELsoftObject.class) }), object = "generalService")
	private Method update;
	@RemoveTrigger(objectAction = "remove", parameters = @Variables(value = { @Variable(expression = SessionContext.CURRENT_RECORD, type = ELsoftObject.class) }), object = "generalService")
	private Method remove;
	@SearchTrigger(objectAction = "find", parameters = @Variables(value = {
			@Variable(type = java.util.List.class),
			@Variable(type = java.util.List.class),
			@Variable(type = java.lang.Integer.class),
			@Variable(type = java.lang.Integer.class),
			@Variable(value = "org.elsoft.platform.metamodel.objects.type.TypeDAO", type = String.class) }), object = "generalService")
	private Method search;
	@GetMode
	private Mode<TypeDAO> mode;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = PropertyHandler.class, connectionName = "WebService2Property")
	public PropertyHandler propertyHandler;
	@Connection(links = { @Link(field1 = "objId", field2 = "parentId") }, connectedObject = MethodHandler.class, connectionName = "WebService2Method")
	private MethodHandler methodHandler;
	@Connection(links = { @Link(field1 = "genericType", field2 = "objId") }, connectedObject = TypeDefinitionHandler.class, connectionName = "WebService2Type")
	private TypeDefinitionHandler genericTypeHandler;

	public TypeDefinitionHandler() {
	}

	public Object getGeneralService() {
		if (generalService == null)
		    generalService = new ELsoftJPAEntityService(TransactionManagerImpl.getCurrentInstance());
		return generalService;
	}

	public Method getInsert() {
		return insert;
	}

	public void setInsert(Method insert) {
		this.insert = insert;
	}

	public Method getCreate() {
		return create;
	}

	public void setCreate(Method create) {
		this.create = create;
	}

	public Method getUpdate() {
		return update;
	}

	public void setUpdate(Method update) {
		this.update = update;
	}

	public Method getRemove() {
		return remove;
	}

	public void setRemove(Method remove) {
		this.remove = remove;
	}

	public Method getSearch() {
		return search;
	}

	public void setSearch(Method search) {
		this.search = search;
	}

	public Mode<TypeDAO> getMode() {
		return mode;
	}

	public TypeDAO addPrimitiveType(PlatformPrimetiveTypes primitive) {
		TypeDAO obj = getMode().getControl().createObject();
		obj.setTypeName(primitive.name());
		obj.setTypeOfType(MetamodelTypeOfTypes.Primitive.name());
		return obj;
	}

	public TypeDAO addType(String domain, String functionalDomain,
			String application, String typeName) {

		TypeDAO obj = getMode().getControl().createObject();
		obj.setTypeName(typeName);
		obj.setDomain(domain);
		obj.setFunctionalDomain(functionalDomain);
		obj.setApplication(application);
		return obj;
	}

	public PropertyHandler getPropertyHandler() {
		return propertyHandler;
	}

	public MethodHandler getMethodHandler() {
		return methodHandler;
	}

	public TypeDefinitionHandler getGenericTypeHandler() {
		return genericTypeHandler;
	}
}
