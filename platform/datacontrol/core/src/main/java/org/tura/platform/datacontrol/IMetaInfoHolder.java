package org.tura.platform.datacontrol;

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

public interface IMetaInfoHolder {

	public void setDefaultQuery(SelectQuery selectQuery);

	public void setCreateCommand(CreateCommand createCommand);

	public void setInsertCommand(InsertCommand insertCommand);

	public void setUpdateCommand(UpdateCommand updateCommand);

	public void setDeleteCommand(DeleteCommand deleteCommand);

	public void setPreQueryTrigger(PreQueryTrigger preQueryTrigger);

	public void setPostQueryTrigger(PostQueryTrigger postQueryTrigger);

	public void setSearchCommand(SearchCommand searchCommand);

	public void setPostCreateTrigger(PostCreateTrigger postCreateTrigger);

	public void setPreDeleteTrigger(PreDeleteTrigger preDeleteTrigger);

	public void setPreInsertTrigger(PreInsertTrigger preInsertTrigger);

	public void setPreUpdateTrigger(PreUpdateTrigger preUpdateTrigger);

	public void setElResolver(ELResolver elResolver);

	public void addChildren(String relationName, Relation relation);

	public Relation getChild(String relationName);

	public Collection<String> getRelationsName();

	public Relation getParent();

	public void setParent(Relation parent);

	public ELResolver getElResolver();

	public CreateCommand getCreateCommand();

	public InsertCommand getInsertCommand();

	public UpdateCommand getUpdateCommand();

	public DeleteCommand getDeleteCommand();

	public SearchCommand getSearchCommand();

	public PreQueryTrigger getPreQueryTrigger();

	public PostQueryTrigger getPostQueryTrigger();

	public PostCreateTrigger getPostCreateTrigger();

	public PreInsertTrigger getPreInsertTrigger();

	public PreUpdateTrigger getPreUpdateTrigger();

	public PreDeleteTrigger getPreDeleteTrigger();

	public HashMap<String, Object> getDependency();

	public void setDependency(HashMap<String, Object> dependency);

	public List<ArtificialProperty> getArtificialProperties();

	public List<String> getKeys();

	public SelectQuery getDefaultQuery();

}
