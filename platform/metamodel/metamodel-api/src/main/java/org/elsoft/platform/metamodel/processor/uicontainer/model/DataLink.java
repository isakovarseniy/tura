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
package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

import org.elsoft.platform.metamodel.PersistentInterface;
import org.elsoft.platform.metamodel.general.CreateDataLinkDAO;
import org.elsoft.platform.metamodel.general.TypeDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.datasource.model.Field;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2BusinessObject;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2BusinessObjectMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2ServiceMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDefaultOrderBy;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDefaultSearch;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateMethodParameterExpression;

public class DataLink extends PersistentInterface {

	private String uuid = UUID.randomUUID().toString();
	private String domain;
	private String functionalDomain;
	private String businessObjectName;
	private String name;
	private IndependentType majorType;
	private HashMap<String, Field> fields = new HashMap<String, Field>();
	private ArrayList<RemoteMethod> remoteBusinessMethods = new ArrayList<RemoteMethod>();
	private ArrayList<RemoteMethod> remoteMethods = new ArrayList<RemoteMethod>();
	private ArrayList<RemoteMethod> remoteUIEventMethods = new ArrayList<RemoteMethod>();
	private ArrayList<String> triggers = new ArrayList<String>();
	private ArrayList<Annotation> annotations = new ArrayList<Annotation>();
	private HashMap<String, Relation> relations = new HashMap<String, Relation>();
	private ArrayList<DefaultSearch> defaultSearch = new ArrayList<DefaultSearch>();
	private ArrayList<DefaultOrderBy> defaultOrderBy = new ArrayList<DefaultOrderBy>();
	private ArrayList<String> dependency = new ArrayList<String>();
	private EventsMapper mapper = new EventsMapper(); 
    private HashMap<String,Object> triggerPropery = new HashMap<String,Object>(); 

	public HashMap<String, Object> getTriggerPropery() {
		return triggerPropery;
	}

	public DataLink(CreateDataLinkDAO command, HashMap<String, Object> context) {
		setName(command.getDataLinkName());
		setUuid(command.getUUID());
		context.put(command.getUUID(), this);
	}

	public Collection<String> getTriggers() {
		return triggers;
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

	public String getBusinessObjectName() {
		return businessObjectName;
	}

	public void setBusinessObjectName(String businessObjectName) {
		this.businessObjectName = businessObjectName;
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateDataLink.save(ch, getParentUuid(), uuid, name);

		CreateDataLink2BusinessObject.save(ch, uuid, domain, functionalDomain,
				businessObjectName);

		Iterator<RemoteMethod> itrRmi = remoteBusinessMethods.iterator();
		while (itrRmi.hasNext()) {
			RemoteMethod rmi = itrRmi.next();
			CreateDataLink2BusinessObjectMethod.save(ch, domain,
					functionalDomain, businessObjectName, rmi);
			CreateMethodParameterExpression.save(ch, rmi);
		}

		itrRmi = remoteMethods.iterator();
		while (itrRmi.hasNext()) {
			RemoteMethod rmi = itrRmi.next();
			TypeDAO type =rmi.getProxy().getTypedao();
			CreateDataLink2ServiceMethod.save(ch, type.getDomain(),
					type.getFunctionalDomain(),type.getApplication(),type.getTypeName() , rmi);
		}
		
		Iterator<DefaultSearch> itrDef = defaultSearch.iterator();
		while (itrDef.hasNext()) {
			DefaultSearch dsearch = itrDef.next();
			CreateDefaultSearch.save(ch, uuid, dsearch.getField(),
					dsearch.getTypeName(), dsearch.getComparator(),
					dsearch.getValue(), dsearch.getExpression());
		}

		Iterator<DefaultOrderBy> itrOrd = defaultOrderBy.iterator();
		while (itrOrd.hasNext()) {
			DefaultOrderBy dorder = itrOrd.next();
			CreateDefaultOrderBy.save(ch, uuid, dorder);
		}
	
	
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void addField(Field field) {
		fields.put(field.getName(), field);
	}

	public Field getField(String fieldName) {
		return fields.get(fieldName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IndependentType getMajorType() {
		return majorType;
	}

	public ArrayList<RemoteMethod> getRemoteBusinessMethods() {
		return remoteBusinessMethods;
	}

	public ArrayList<RemoteMethod> getRemoteMethods() {
		return remoteMethods;
	}

	public ArrayList<RemoteMethod> getRemoteUIEventMethods() {
		return remoteUIEventMethods;
	}
	
	public void addRemoteBusinessMethod(RemoteMethod remote) {
		remote.setParentUuid(uuid);
		remoteBusinessMethods.add(remote);
	}

	public void addRemoteMethod(RemoteMethod remote) {
		remote.setParentUuid(uuid);
		remoteMethods.add(remote);
	}

	public void addRemoteUIEventMethods(RemoteMethod remote) {
		remote.setParentUuid(uuid);
		remoteUIEventMethods.add(remote);
	}

	
	
	public void addAnnotation(Annotation ant) {
		annotations.add(ant);
	}

	public ArrayList<Annotation> getAnnotation() {
		return annotations;
	}

	public Collection<Relation> getRelation() {
		return relations.values();
	}

	public void addRelation(String relationName, Field2field f2f,
			DataLink masterLnk, DataLink detailLnk, Boolean treeRelation) {
		Relation rel = relations.get(relationName);
		if (rel == null) {
			rel = new Relation(relationName, masterLnk, detailLnk,treeRelation);
			relations.put(relationName, rel);
		}
		rel.addLink(f2f);
	}

	public void addDefaultSearch(DefaultSearch rel) {
		defaultSearch.add(rel);
	}

	public void addDefaultOrderBy(DefaultOrderBy rel) {
		defaultOrderBy.add(rel);
	}

	public ArrayList<DefaultSearch> getDefaultSearch() {
		return defaultSearch;
	}

	public ArrayList<DefaultOrderBy> getDefaultOrderBy() {
		return defaultOrderBy;
	}

	public ArrayList<String> getDependency() {
		return dependency;
	}

	public void addDependency(String dep) {
		dependency.add(dep);
	}

	public void setMajorType(IndependentType majorType) {
		this.majorType = majorType;
	}

	public void addTrigger(String uiElement, String triggerName) throws Exception {
		String result= mapper.map(uiElement, triggerName);
		if (!triggers.contains(result))
		    triggers.add(result);

	}

	public EventsMapper getMapper() {
		return mapper;
	}

	
}
