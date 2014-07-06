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
import org.tura.platform.hr.objects.DepartmentsDAO;

import com.octo.java.sql.query.SelectQuery;

public class DepartmentsDC extends DataControl<DepartmentsDAO>{

	public DepartmentsDC() throws Exception {
		super();
	}

	@Override
	public void setDefaultQuery(SelectQuery selectQuery) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCreateCommand(CreateCommand createCommand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInsertCommand(InsertCommand insertCommand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpdateCommand(UpdateCommand updateCommand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDeleteCommand(DeleteCommand deleteCommand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPreQueryTrigger(PreQueryTrigger preQueryTrigger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPostQueryTrigger(PostQueryTrigger postQueryTrigger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSearchCommand(SearchCommand searchCommand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPostCreateTrigger(PostCreateTrigger postCreateTrigger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPreDeleteTrigger(PreDeleteTrigger preDeleteTrigger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPreInsertTrigger(PreInsertTrigger preInsertTrigger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPreUpdateTrigger(PreUpdateTrigger preUpdateCommand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setElResolver(ELResolver elResolver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setArtificialProperties() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVersionattribute(String versionattribute) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBaseClass(Class<?> baseClass) {
		// TODO Auto-generated method stub
		
	}

}
