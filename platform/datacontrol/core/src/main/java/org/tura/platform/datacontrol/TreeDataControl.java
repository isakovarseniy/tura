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
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.metainfo.Relation;

import com.octo.java.sql.query.SelectQuery;

public abstract class TreeDataControl implements IDataControl {

	private Relation parent;
	protected HashMap<String, Relation> children = new HashMap<String, Relation>();
	private ArrayList<ChangeRecordListener> chageRecordLiteners = new ArrayList<>();

	private DataControl<?> root;
	private DataControl<?> current;
	

	public DataControl<?> getRoot() {
		return root;
	}

	public void setRoot(DataControl<?> root) {
		this.root = root;
		this.current = root;
	}

	@Override
	public Relation getParent() {
		return parent;
	}

	@Override
	public Relation getChild(String relationName) {
		return null;
	}

	@Override
	public Collection<String> getRelationsName() {
		return null;
	}
	
	
	@Override
	public void setParent(Relation parent) {
		this.parent = parent;
	}

	@Override
	public HashMap<String, Object> getDependency() {
		return null;
	}
	
	@Override
	public void setDependency(HashMap<String, Object> dependency) {
	}

	@Override
	public void addChageRecordLiteners(ChangeRecordListener listener) {
		chageRecordLiteners.add(listener);
	}

	@Override
	public void addChildren(String relationName, Relation relation) {
	}
	
	
	@Override
	public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException {
	}

	protected void notifyChageRecordAll(Object newCurrentObject)
			throws TuraException {
		notifyChildrenDataControlsChangeCurrentRecord(newCurrentObject);
		notifyChangeRecordLiteners(newCurrentObject);
	}

	private void notifyChangeRecordLiteners(Object newCurrentObject) {
		for (ChangeRecordListener listener : chageRecordLiteners) {
			listener.handleChangeRecord(this, newCurrentObject);
		}
	}

	private void notifyChildrenDataControlsChangeCurrentRecord(
			Object newCurrentObject) throws TuraException {
		for (Relation relation : children.values()) {
			relation.setMasterCurrentObject(newCurrentObject);
			if (relation.getChild() != null)
				((DataControl<?>) relation.getChild())
						.handleChangeMusterCurrentRecordNotification(newCurrentObject);
		}
	}

	@Override
	public Object getCurrentObject() throws TuraException {
		return null;
	}

	@Override
	public Object createObject() throws TuraException {
		return null;
	}

	@Override
	public void removeObject() throws Exception {
	}

	@Override
	public void removeAll() throws Exception {
	}

	
	@Override
	public void setDefaultQuery(SelectQuery selectQuery) {
	}

	@Override
	public void setCreateCommand(CreateCommand createCommand) {
	}

	@Override
	public void setInsertCommand(InsertCommand insertCommand) {
	}

	@Override
	public void setUpdateCommand(UpdateCommand updateCommand) {
	}

	@Override
	public void setDeleteCommand(DeleteCommand deleteCommand) {
	}

	@Override
	public void setPreQueryTrigger(PreQueryTrigger preQueryTrigger) {
	}

	@Override
	public void setPostQueryTrigger(PostQueryTrigger postQueryTrigger) {
	}

	@Override
	public void setSearchCommand(SearchCommand searchCommand) {
	}

	@Override
	public void setPostCreateTrigger(PostCreateTrigger postCreateTrigger) {
	}

	@Override
	public void setPreDeleteTrigger(PreDeleteTrigger preDeleteTrigger) {
	}

	@Override
	public void setPreInsertTrigger(PreInsertTrigger preInsertTrigger) {
	}

	@Override
	public void setPreUpdateTrigger(PreUpdateTrigger preUpdateTrigger) {
	}

	@Override
	public void setElResolver(ELResolver elResolver) {
	}

	@Override
	public ELResolver getElResolver() {
		return current.getElResolver();
	}

	@Override
	public CreateCommand getCreateCommand() {
		return current.getCreateCommand();
	}

	@Override
	public InsertCommand getInsertCommand() {
		return current.getInsertCommand();
	}

	@Override
	public UpdateCommand getUpdateCommand() {
		return current.getUpdateCommand();
	}

	@Override
	public DeleteCommand getDeleteCommand() {
		return current.getDeleteCommand();
	}

	@Override
	public SearchCommand getSearchCommand() {
		return current.getSearchCommand();
	}

	@Override
	public PreQueryTrigger getPreQueryTrigger() {
		return current.getPreQueryTrigger();
	}

	@Override
	public PostQueryTrigger getPostQueryTrigger() {
		return current.getPostQueryTrigger();
	}

	@Override
	public PostCreateTrigger getPostCreateTrigger() {
		return current.getPostCreateTrigger();
	}

	@Override
	public PreInsertTrigger getPreInsertTrigger() {
		return current.getPreInsertTrigger();
	}

	@Override
	public PreUpdateTrigger getPreUpdateTrigger() {
		return current.getPreUpdateTrigger();
	}

	@Override
	public PreDeleteTrigger getPreDeleteTrigger() {
		return current.getPreDeleteTrigger();
	}

	@Override
	public List<ArtificialProperty> getArtificialProperties() {
		return current.getArtificialProperties();
	}

	@Override
	public List<String> getKeys() {
		return current.getKeys();
	}

	@Override
	public SelectQuery getDefaultQuery() {
		return current.getDefaultQuery();
	}

	@Override
	public abstract void createChild(IDataControl dc, Relation relation) ;

}
