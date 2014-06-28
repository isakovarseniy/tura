package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.metainfo.DefaultSearchCriteria;
import org.tura.platform.datacontrol.metainfo.Relation;

public abstract class MetaInfoHolder {


	protected HashMap<String, Object> dependency = new HashMap<String, Object>();
	private Relation parent;
	protected HashMap<String, Relation> children = new HashMap<String, Relation>();
	protected ArrayList<ArtificialProperty> artificialProperties = new ArrayList<>();
	
	
	protected ELResolver elResolver;
	protected Command createCommand;
	protected Command insertCommand;
	protected Command updateCommand;
	protected Command removeCommand;
	protected Command searchCommand;
	protected Command preQueryCommand;
	protected Command postQueryCommand;
	protected Command postCreateCommand;
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
	public abstract void setPreQueryCommand(Command preQueryCommand) ;
	public abstract void setPostQueryCommand(Command postQueryCommand) ;
	public abstract void setSearchCommand(Command searchCommand) ;
	public abstract void setPostCreateCommand(Command postCreateCommand);
	public abstract void setPreDeleteCommand(Command preDeleteCommand) ;
	public abstract void setPreInsertCommand(Command preInsertCommand);
	public abstract void setPreUpdateCommand(Command preUpdateCommand) ;
	public abstract void setElResolver(ELResolver elResolver);
	public abstract void setRootClass(Class<?> rootClass);

	
	public void addChildren(String relationName, Relation relation) {
		children.put(relationName, relation);
		relation.setParent(this);
		if (relation.getChild() != null)
			relation.getChild().setParent(relation);
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
	
	public Command getPreQueryCommand() {
		return preQueryCommand;
	}

	public Command getPostQueryCommand() {
		return postQueryCommand;
	}
	
	public Command getPostCreateCommand() {
		return postCreateCommand;
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
	
	
	
}
