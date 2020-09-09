/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.datacontrol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.tura.platform.datacontrol.command.base.CreateObjectParameters;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.base.PreInsertTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreUpdateTrigger;
import org.tura.platform.datacontrol.command.base.SearchObjectParameters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.repository.core.FieldValue;

public abstract class MetaInfoHolder implements Serializable{


	private static final long serialVersionUID = -7390524799258172116L;
	protected List<DependecyProperty> dependency = new ArrayList<DependecyProperty>();
	private Relation parent;
	protected HashMap<String, Relation> children = new HashMap<String, Relation>();
	protected List<ArtificialProperty> artificialProperties = new ArrayList<>();
	protected Class<?> artificialInterface;
	protected List<String> keys = new ArrayList<>();
	protected Class<?> baseClass;
	protected Class<?> proxyClass;
	protected List<SearchCriteria> defaultSearchCriteria = new ArrayList<>();
	protected List<OrderCriteria> defaultOrderCriteria = new ArrayList<>();

	protected CreateObjectParameters createObjectParameters;
	protected SearchObjectParameters searchObjectParameters;
	
	
	protected ELResolver elResolver;
	protected PreQueryTrigger preQueryTrigger;
	protected PostQueryTrigger postQueryTrigger;
	protected PostCreateTrigger postCreateTrigger;
	protected PreInsertTrigger preInsertTrigger;
	protected PreUpdateTrigger preUpdateTrigger;
	protected PreDeleteTrigger preDeleteTrigger;
	protected DCRule autoCreateObjectRule;
	protected OnChangeArtificialFieldTrigger onChangeArtificialFieldTrigger;

	
	public abstract void setPreQueryTrigger(PreQueryTrigger preQueryTrigger) ;
	public abstract void setPostQueryTrigger(PostQueryTrigger postQueryTrigger) ;
	public abstract void setPostCreateTrigger(PostCreateTrigger postCreateTrigger);
	public abstract void setPreDeleteTrigger(PreDeleteTrigger preDeleteTrigger) ;
	public abstract void setPreInsertTrigger(PreInsertTrigger preInsertTrigger);
	public abstract void setPreUpdateTrigger(PreUpdateTrigger preUpdateTrigger) ;
	public abstract void setElResolver(ELResolver elResolver);
	public abstract void setDefaultOrderCriteria(List<OrderCriteria> orderCriteria);
	public abstract void setDefaultSearchCriteria(List<SearchCriteria> searchCriteria);
	public abstract void setCreateObjectParameters(CreateObjectParameters createObjectParameters);
	public abstract void setSearchObjectParameters(SearchObjectParameters searchObjectParameters);
	public abstract void setAutoCreateObjectRule(DCRule rule);
	public abstract List<FieldValue> getPrimaryKeyFields() throws Exception;
	public abstract  void setArtificialFieldInterceptor(OnChangeArtificialFieldTrigger onChangeArtificialFieldTrigger) ;

	
	
	public CreateObjectParameters getCreateObjectParameters(){
		return createObjectParameters;
	}
	public SearchObjectParameters getSearchObjectParameters(){
		return searchObjectParameters;
	}
	
	public void addChildren(String relationName, Relation relation) throws TuraException {
		children.put(relationName, relation);
		relation.setName(relationName);
		relation.setParent((IDataControl) this);
		if (relation.getChild() != null)
			relation.getChild().setParent(relation);
	}

	public Relation getChild(String relationName){
		return children.get(relationName);
	}
	
	public Collection<String> getRelationsName(){
		return children.keySet();
	}
	
	public Relation getParent() {
		return parent;
	}

	public void setParent(Relation parent) {
		this.parent = parent;
	}
	
	public ELResolver getElResolver() {
		return elResolver;
	}
	
	
	public PreQueryTrigger getPreQueryTrigger() {
		return preQueryTrigger;
	}

	public PostQueryTrigger getPostQueryTrigger() {
		return postQueryTrigger;
	}
	
	public PostCreateTrigger getPostCreateTrigger() {
		return postCreateTrigger;
	}
	public PreInsertTrigger getPreInsertTrigger() {
		return preInsertTrigger;
	}
	
	public PreUpdateTrigger getPreUpdateTrigger() {
		return preUpdateTrigger;
	}
	
	public PreDeleteTrigger getPreDeleteTrigger() {
		return preDeleteTrigger;
	}

	public List<DependecyProperty> getDependency() {
		return dependency;
	}

	public void setDependency(List<DependecyProperty> dependency) {
		this.dependency = dependency;
	}
	
	public List<ArtificialProperty> getArtificialProperties() {
		return artificialProperties;
	}

	public List<String> getKeys() {
		return keys;
	}

	public Class<?> getBaseClass() {
		return baseClass;
	}
	public void setBaseClass(Class<?> baseClass) {
		this.baseClass = baseClass;
	}

	public Class<?> getProxyClass() {
		return proxyClass;
	}
	public void setProxyClass(Class<?> proxyClass) {
		this.proxyClass = proxyClass;
	}
	
	public List<SearchCriteria> getDefaultSearchCriteria() {
		return defaultSearchCriteria;
	}
	
	public List<OrderCriteria> getDefaultOrderCriteria() {
		return defaultOrderCriteria;
	}
	
	public OnChangeArtificialFieldTrigger getOnChangeArtificialFieldTrigger() {
		return onChangeArtificialFieldTrigger;
	}
     
	
}
