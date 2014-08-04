package org.tura.platform.hr.controls;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
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
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.hr.objects.EmployeesDAO;

import com.octo.java.sql.query.SelectQuery;

public class EmployeesDC extends DataControl<EmployeesDAO>{

	public EmployeesDC() throws Exception {
		super();
	}

	@Override
	public void setDefaultQuery(SelectQuery selectQuery) {
		this.defaultQuery = selectQuery;

	}

	@Override
	public void setCreateCommand(CreateCommand createCommand) {
		this.createCommand = createCommand;

	}

	@Override
	public void setInsertCommand(InsertCommand insertCommand) {
		this.insertCommand = insertCommand;

	}

	@Override
	public void setUpdateCommand(UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;
	}

	@Override
	public void setDeleteCommand(DeleteCommand deleteCommand) {
		this.deleteCommand = deleteCommand;
	}

	@Override
	public void setPreQueryTrigger(PreQueryTrigger preQueryTrigger) {
		this.preQueryTrigger = preQueryTrigger;
	}

	@Override
	public void setPostQueryTrigger(PostQueryTrigger postQueryTrigger) {
		this.postQueryTrigger = postQueryTrigger;
	}

	@Override
	public void setSearchCommand(SearchCommand searchCommand) {
		this.searchCommand = searchCommand;
	}

	@Override
	public void setPostCreateTrigger(PostCreateTrigger postCreateTrigger) {
		this.postCreateTrigger = postCreateTrigger;
	}

	@Override
	public void setPreDeleteTrigger(PreDeleteTrigger preDeleteTrigger) {
		this.preDeleteTrigger = preDeleteTrigger;
	}

	@Override
	public void setPreInsertTrigger(PreInsertTrigger preInsertTrigger) {
		this.preInsertTrigger = preInsertTrigger;

	}

	@Override
	public void setPreUpdateTrigger(PreUpdateTrigger preUpdateTrigger) {
		this.preUpdateTrigger = preUpdateTrigger;
	}

	@Override
	public void setElResolver(ELResolver elResolver) {
		this.elResolver = elResolver;

	}

	@Override
	public void createChild(DataControl<?> dc, Relation relation) {
		
	}
	
	
	
}
