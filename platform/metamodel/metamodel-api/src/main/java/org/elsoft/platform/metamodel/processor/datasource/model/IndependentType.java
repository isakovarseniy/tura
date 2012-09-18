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

import org.elsoft.platform.metamodel.PersistentInterface;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.objects.type.PropertyDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.datasource.command.CreateDataSource;
import org.elsoft.platform.metamodel.types.MethodHandler;
import org.elsoft.platform.metamodel.types.PropertyHandler;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;

public class IndependentType extends PersistentInterface {

	private String uuid = UUID.randomUUID().toString();
	private String domain;
	private String functionalDomain;
	private String application;
	private String typeName;
	private TypeDAO typedao;
	private IndependentType generic;
	private String typeOftype;
	private ArrayList<RemoteMethod> methods = new ArrayList<RemoteMethod>();
	private ArrayList<Field> fields = new ArrayList<Field>();

	public IndependentType(TypeDAO type) {
		domain = type.getDomain();
		functionalDomain = type.getFunctionalDomain();
		application = type.getApplication();
		typeName = type.getTypeName();
		setTypedao(type);
		setTypeOftype(type.getTypeOfType());
	}

	public IndependentType(TypeDefinitionHandler th) {

		TypeDAO type = th.getObject();
		
		domain = type.getDomain();
		functionalDomain = type.getFunctionalDomain();
		application = type.getApplication();
		typeName = type.getTypeName();
		setTypeOftype(type.getTypeOfType());
		setTypedao(type);

		PropertyHandler ph = th.getPropertyHandler();
		Iterator<PropertyDAO> itrProp = ph.getList();
		while (itrProp.hasNext()) {
			PropertyDAO property = itrProp.next();
			fields.add(new Field(ph,property));
		}

		MethodHandler mh = th.getMethodHandler();
		Iterator<MethodDAO> itrMeth = mh.cleanSearch().getList();
		while (itrMeth.hasNext()) {
			MethodDAO method = itrMeth.next();
			methods.add(new RemoteMethod(mh,method,null));
		}
		if (type.getGenericType() != null)
			generic = new IndependentType(th.getGenericTypeHandler());
	}

	public IndependentType getGeneric() {
		return generic;
	}

	public void setGeneric(IndependentType generic) {
		this.generic = generic;
	}

	public ArrayList<Field> getFields() {
		return fields;
	}

	public ArrayList<RemoteMethod> getMethods() {
		return methods;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getFunctionalDomain() {
		return functionalDomain;
	}

	public void setFunctionalDomain(String functionalDomain) {
		this.functionalDomain = functionalDomain;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public TypeDAO getTypedao() {
		return typedao;
	}

	public void setTypedao(TypeDAO typedao) {
		this.typedao = typedao;
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateDataSource.save(ch, this);
	}

	public String getTypeOftype() {
		return typeOftype;
	}

	public void setTypeOftype(String typeOftype) {
		this.typeOftype = typeOftype;
	}


}
