package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.tura.platform.datacontrol.command.CreateCommand;
import org.tura.platform.datacontrol.command.DeleteCommand;
import org.tura.platform.datacontrol.command.InsertCommand;
import org.tura.platform.datacontrol.command.PostCreateTrigger;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
import org.tura.platform.datacontrol.command.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.PreInsertTrigger;
import org.tura.platform.datacontrol.command.PreQueryTrigger;
import org.tura.platform.datacontrol.command.PreUpdateTrigger;
import org.tura.platform.datacontrol.command.SearchCommand;
import org.tura.platform.datacontrol.command.UpdateCommand;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.metainfo.Relation;

import com.octo.java.sql.query.SelectQuery;

public abstract class MetaInfoHolder {


	protected HashMap<String, Object> dependency = new HashMap<String, Object>();
	private Relation parent;
	protected HashMap<String, Relation> children = new HashMap<String, Relation>();
	protected ArrayList<ArtificialProperty> artificialProperties = new ArrayList<>();
	protected List<String> keys = new ArrayList<>();
	protected String versionattribute;
	
	protected ELResolver elResolver;
	protected CreateCommand createCommand;
	protected InsertCommand insertCommand;
	protected UpdateCommand updateCommand;
	protected DeleteCommand deleteCommand;
	protected SearchCommand searchCommand;
	protected PreQueryTrigger preQueryTrigger;
	protected PostQueryTrigger postQueryTrigger;
	protected PostCreateTrigger postCreateTrigger;
	protected PreInsertTrigger preInsertTrigger;
	protected PreUpdateTrigger preUpdateTrigger;
	protected PreDeleteTrigger preDeleteTrigger;

	protected Class<?>  rootClass;
	protected SelectQuery defaultQuery;
	
	public abstract void setDefaultQuery(SelectQuery selectQuery) ;
	public abstract void setCreateCommand(CreateCommand createCommand) ;
	public abstract void setInsertCommand(InsertCommand insertCommand);
	public abstract void setUpdateCommand(UpdateCommand updateCommand);
	public abstract void setDeleteCommand(DeleteCommand deleteCommand) ;
	public abstract void setPreQueryTrigger(PreQueryTrigger preQueryTrigger) ;
	public abstract void setPostQueryTrigger(PostQueryTrigger postQueryTrigger) ;
	public abstract void setSearchCommand(SearchCommand searchCommand) ;
	public abstract void setPostCreateTrigger(PostCreateTrigger postCreateTrigger);
	public abstract void setPreDeleteTrigger(PreDeleteTrigger preDeleteTrigger) ;
	public abstract void setPreInsertTrigger(PreInsertTrigger preInsertTrigger);
	public abstract void setPreUpdateTrigger(PreUpdateTrigger preUpdateCommand) ;
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
	
	public ELResolver getElResolver() {
		return elResolver;
	}
	
	public CreateCommand getCreateCommand() {
		return createCommand;
	}
	
	public InsertCommand getInsertCommand() {
		return insertCommand;
	}
	
	public UpdateCommand getUpdateCommand() {
		return updateCommand;
	}
	
	public DeleteCommand getDeleteCommand() {
		return deleteCommand;
	}
	public SearchCommand getSearchCommand() {
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
	public SelectQuery getDefaultQuery() {
		return defaultQuery;
	}
	
	
}
