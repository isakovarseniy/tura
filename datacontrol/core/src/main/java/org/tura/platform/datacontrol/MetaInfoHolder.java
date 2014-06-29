package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.tura.platform.datacontrol.command.Command;
import org.tura.platform.datacontrol.command.PostCreateTrigger;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
import org.tura.platform.datacontrol.command.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.metainfo.DefaultSearchCriteria;
import org.tura.platform.datacontrol.metainfo.Relation;

public abstract class MetaInfoHolder {


	protected HashMap<String, Object> dependency = new HashMap<String, Object>();
	private Relation parent;
	protected HashMap<String, Relation> children = new HashMap<String, Relation>();
	protected ArrayList<ArtificialProperty> artificialProperties = new ArrayList<>();
	protected List<String> keys = new ArrayList<>();
	protected String versionattribute;
	
	protected ELResolver elResolver;
	protected Command createCommand;
	protected Command insertCommand;
	protected Command updateCommand;
	protected Command removeCommand;
	protected Command searchCommand;
	protected PreQueryTrigger preQueryTrigger;
	protected PostQueryTrigger postQueryTrigger;
	protected PostCreateTrigger postCreateTrigger;
	protected Command preInsertCommand;
	protected Command preUpdateCommand;
	protected Command preDeleteCommand;

	protected Class<?>  rootClass;

	protected List<DefaultSearchCriteria> defaultFilter;
	protected List<OrderCriteria> defaultOrderby;

	
	public abstract void setDefaultFilter(List<DefaultSearchCriteria> defaultFilter) ;
	public abstract void setDefaultOrderby(List<OrderCriteria> defaultOrderby) ;
	public abstract void setCreateCommand(Command createCommand) ;
	public abstract void setInsertCommand(Command insertCommand);
	public abstract void setUpdateCommand(Command updateCommand);
	public abstract void setRemoveCommand(Command removeCommand) ;
	public abstract void setPreQueryTrigger(PreQueryTrigger preQueryTrigger) ;
	public abstract void setPostQueryTrigger(PostQueryTrigger postQueryTrigger) ;
	public abstract void setSearchCommand(Command searchCommand) ;
	public abstract void setPostCreateTrigger(PostCreateTrigger postCreateTrigger);
	public abstract void setPreDeleteCommand(Command preDeleteCommand) ;
	public abstract void setPreInsertCommand(Command preInsertCommand);
	public abstract void setPreUpdateCommand(Command preUpdateCommand) ;
	public abstract void setElResolver(ELResolver elResolver);
	public abstract void setRootClass(Class<?> rootClass);
	public abstract void setArtificialProperties();
	public abstract void setVersionattribute(String versionattribute) ;

	
	public void addChildren(String relationName, Relation relation) {
		children.put(relationName, relation);
		relation.setParent((DataControl<?>) this);
		if (relation.getChild() != null)
			relation.getChild().setParent(relation);
	}

	public Relation getChild(String relationName){
		return children.get(relationName);
	}
	
	public Collection<String> getRelationsName(){
		return children.keySet();
	}
	
	public Class<?> getRootClass() {
		return rootClass;
	}
	
	
	public Relation getParent() {
		return parent;
	}

	public void setParent(Relation parent) {
		this.parent = parent;
	}
	
	
	public List<DefaultSearchCriteria> getDefaultFilter() {
		return defaultFilter;
	}


	public List<OrderCriteria> getDefaultOrderby() {
		return defaultOrderby;
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
	
	public Command getRemoveCommand() {
		return removeCommand;
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
	public Command getPreInsertCommand() {
		return preInsertCommand;
	}
	
	public Command getPreUpdateCommand() {
		return preUpdateCommand;
	}
	
	public Command getPreDeleteCommand() {
		return preDeleteCommand;
	}

	public HashMap<String, Object> getDependency() {
		return dependency;
	}

	public void setDependency(HashMap<String, Object> dependency) {
		this.dependency = dependency;
	}
	
	public ArrayList<ArtificialProperty> getArtificialProperties() {
		return artificialProperties;
	}
	public List<String> getKeys() {
		return keys;
	}
	public void setKeys(List<String> keys) {
		this.keys = keys;
	}
	public String getVersionattribute() {
		return versionattribute;
	}
	
	
}
