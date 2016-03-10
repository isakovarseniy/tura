/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.tura.platform.datacontrol.command.base.Command;
import org.tura.platform.datacontrol.command.base.CreateCommandBase;
import org.tura.platform.datacontrol.command.base.DeleteCommandBase;
import org.tura.platform.datacontrol.command.base.InsertCommandBase;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.base.PreInsertTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreUpdateTrigger;
import org.tura.platform.datacontrol.command.base.SearchCommandBase;
import org.tura.platform.datacontrol.command.base.UpdateCommandBase;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;
import org.tura.platform.datacontrol.metainfo.Relation;

import com.octo.java.sql.query.SelectQuery;

public abstract class MetaInfoHolder {


	protected List<DependecyProperty> dependency = new ArrayList<DependecyProperty>();
	private Relation parent;
	protected HashMap<String, Relation> children = new HashMap<String, Relation>();
	protected List<ArtificialProperty> artificialProperties = new ArrayList<>();
	protected Class<?> artificialInterface;
	protected List<String> keys = new ArrayList<>();
	protected Class<?> baseClass;
	
	protected ELResolver elResolver;
	protected CreateCommandBase createCommand;
	protected InsertCommandBase insertCommand;
	protected UpdateCommandBase updateCommand;
	protected DeleteCommandBase deleteCommand;
	protected SearchCommandBase searchCommand;
	protected PreQueryTrigger preQueryTrigger;
	protected PostQueryTrigger postQueryTrigger;
	protected PostCreateTrigger postCreateTrigger;
	protected PreInsertTrigger preInsertTrigger;
	protected PreUpdateTrigger preUpdateTrigger;
	protected PreDeleteTrigger preDeleteTrigger;

	protected SelectQuery defaultQuery;
	
	public abstract void setDefaultQuery(SelectQuery selectQuery) ;
	public abstract void setCreateCommand(CreateCommandBase createCommand) ;
	public abstract void setInsertCommand(InsertCommandBase insertCommand);
	public abstract void setUpdateCommand(UpdateCommandBase updateCommand);
	public abstract void setDeleteCommand(DeleteCommandBase deleteCommand) ;
	public abstract void setPreQueryTrigger(PreQueryTrigger preQueryTrigger) ;
	public abstract void setPostQueryTrigger(PostQueryTrigger postQueryTrigger) ;
	public abstract void setSearchCommand(SearchCommandBase searchCommand) ;
	public abstract void setPostCreateTrigger(PostCreateTrigger postCreateTrigger);
	public abstract void setPreDeleteTrigger(PreDeleteTrigger preDeleteTrigger) ;
	public abstract void setPreInsertTrigger(PreInsertTrigger preInsertTrigger);
	public abstract void setPreUpdateTrigger(PreUpdateTrigger preUpdateTrigger) ;
	public abstract void setElResolver(ELResolver elResolver);
	
	
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
	
	public Command getCreateCommand() {
		return createCommand;
	}
	
	public Command getInsertCommand() {
		return insertCommand;
	}
	
	public Command getUpdateCommand() {
		return updateCommand;
	}
	
	public Command getDeleteCommand() {
		return deleteCommand;
	}
	public Command getSearchCommand() {
		return searchCommand;
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

	public SelectQuery getDefaultQuery() {
		return defaultQuery;
	}
	public Class<?> getArtificialInterface() {
		return artificialInterface;
	}

	public  void setArtificialInterface(Class<?> artificialInterface ){
		this.artificialInterface = artificialInterface;
	}
	public Class<?> getBaseClass() {
		return baseClass;
	}
	public void setBaseClass(Class<?> baseClass) {
		this.baseClass = baseClass;
	}
	
}
