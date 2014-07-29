package org.tura.platform.hr.controls.producer;

import javax.enterprise.inject.Produces;

import org.tura.platform.commons.jpa.TuraJPAEntityService;
import org.tura.platform.datacontrol.annotations.CreateTrigger;
import org.tura.platform.datacontrol.annotations.DeleteTrigger;
import org.tura.platform.datacontrol.annotations.InsertTrigger;
import org.tura.platform.datacontrol.annotations.SearchTrigger;
import org.tura.platform.datacontrol.annotations.UpdateTrigger;
import org.tura.platform.datacontrol.command.CreateCommand;
import org.tura.platform.datacontrol.command.DeleteCommand;
import org.tura.platform.datacontrol.command.InsertCommand;
import org.tura.platform.datacontrol.command.SearchCommand;
import org.tura.platform.datacontrol.command.UpdateCommand;
import org.tura.platform.datacontrol.command.Command.CallParameter;
import org.tura.platform.hr.objects.DepartmentsDAO;

import com.octo.java.sql.query.SelectQuery;

public class DepartmentProducer {
	
	
	private TuraJPAEntityService createMethodProvider = new TuraJPAEntityService();
	
	private TuraJPAEntityService insertMethodProvider= new TuraJPAEntityService();

	private TuraJPAEntityService updateMethodProvider= new TuraJPAEntityService();
	
	private TuraJPAEntityService deleteMethodProvider= new TuraJPAEntityService();
	
	private TuraJPAEntityService searchMethodProvider= new TuraJPAEntityService();
	
	
	@Produces @CreateTrigger("department")
	public CreateCommand getCreateCommand( ){
		CreateCommand command = new CreateCommand();
		command.setProvider(createMethodProvider);
		command.setMethod("create");

		CallParameter prm = command.new CallParameter();
		prm.setName("obj");
		prm.setClazz(String.class);
		prm.setValue(DepartmentsDAO.class.getName());
		command.getParameters().add(prm);

		return command;
	}


	@Produces @UpdateTrigger("department")
	public UpdateCommand getUpdateTrigger( ){
		UpdateCommand command = new UpdateCommand();
		command.setProvider(updateMethodProvider);
		command.setMethod("update");

		CallParameter prm = command.new CallParameter();
		prm.setName("obj");
		prm.setClazz(DepartmentsDAO.class);
		prm.setExpression("department.currentObject");
		command.getParameters().add(prm);


		return command;
	}

	@Produces @InsertTrigger("department")
	public InsertCommand getInsertTrigger(){

		InsertCommand command = new InsertCommand();
		command.setProvider(insertMethodProvider);
		command.setMethod("insert");

		CallParameter prm = command.new CallParameter();
		prm.setName("obj");
		prm.setClazz(DepartmentsDAO.class);
		prm.setExpression("department.currentObject");
		command.getParameters().add(prm);
		
		return command;
	}

	@Produces @DeleteTrigger("department")
	public DeleteCommand getDeleteTrigger( ){
		DeleteCommand command = new DeleteCommand();
		command.setProvider(deleteMethodProvider);
		command.setMethod("remove");

		CallParameter prm = command.new CallParameter();
		prm.setName("obj");
		prm.setClazz(DepartmentsDAO.class);
		prm.setExpression("department.currentObject");
		command.getParameters().add(prm);

		return command;
	}

	
	@Produces @SearchTrigger("department")
	public SearchCommand getSearchTrigger( ){

		SearchCommand command = new SearchCommand();
		command.setProvider(searchMethodProvider);
		command.setMethod("find");

		CallParameter prm = command.new CallParameter();
		prm.setName("dslQuery");
		prm.setClazz(SelectQuery.class);
		prm.setExpression("department.query");
		command.getParameters().add(prm);

		prm = command.new CallParameter();
		prm.setName("startIndex");
		prm.setClazz(Integer.class);
		prm.setExpression("department.startIndex");
		command.getParameters().add(prm);

		prm = command.new CallParameter();
		prm.setName("endIndex");
		prm.setClazz(Integer.class);
		prm.setExpression("department.endIndex");
		command.getParameters().add(prm);

		prm = command.new CallParameter();
		prm.setName("objectClass");
		prm.setClazz(String.class);
		prm.setValue(DepartmentsDAO.class.getName());
		command.getParameters().add(prm);
		
		return command;
	}
	
	
}
