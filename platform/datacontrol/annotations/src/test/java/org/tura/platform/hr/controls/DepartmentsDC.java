package org.tura.platform.hr.controls;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.commons.jpa.TuraJPAEntityService;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.ArtificialField;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.Base;
import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.DefaultOrderBy;
import org.tura.platform.datacontrol.annotations.DefaultOrderBys;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriteria;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriterias;
import org.tura.platform.datacontrol.annotations.Delete;
import org.tura.platform.datacontrol.annotations.Insert;
import org.tura.platform.datacontrol.annotations.Key;
import org.tura.platform.datacontrol.annotations.Keys;
import org.tura.platform.datacontrol.annotations.Parameter;
import org.tura.platform.datacontrol.annotations.Parameters;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.PreDelete;
import org.tura.platform.datacontrol.annotations.PreInsert;
import org.tura.platform.datacontrol.annotations.PreQuery;
import org.tura.platform.datacontrol.annotations.PreUpdate;
import org.tura.platform.datacontrol.annotations.Query;
import org.tura.platform.datacontrol.annotations.Search;
import org.tura.platform.datacontrol.annotations.Update;
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
import org.tura.platform.hr.objects.DepartmentsDAO;
import org.tura.platform.persistence.TuraObject;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery;

@Named("department")
public class DepartmentsDC extends DataControl<DepartmentsDAO> {

	@Inject
	private TuraJPAEntityService provider;

	public DepartmentsDC() throws Exception {
		super();
	}

	@PostConstruct
	public void init(){
		this.insertCommand.setProvider(provider);
		this.updateCommand.setProvider(provider);
		this.deleteCommand.setProvider(provider);
		this.createCommand.setProvider(provider);
		this.searchCommand.setProvider(provider);
	}
	

	@Inject
	public void setCommandStack(CommandStack commandStack) {
		this.commandStack = commandStack;
	}

	@Inject
	public void setArtificialProperties( 
			@ArtificialFields(fields = {
					@ArtificialField(field = "prop1", type = String.class),
					@ArtificialField(field = "prop2", type = String.class) })
			List<ArtificialProperty> properties) {
		this.artificialProperties = properties;
	}
	
	@Override
	@Inject
	public void setCreateCommand( 
			@Create(objectAction = "create", parameters = @Parameters(value = { @Parameter(name = "objType", value = "org.tura.platform.hr.objects.DepartmentsDAO", type = String.class) }))
			CreateCommand createCommand) {
		this.createCommand = createCommand;
		this.createCommand.setDatacontrol(this);
	}

	@Override
	@Inject
	public void setInsertCommand(  
			@Insert(objectAction = "insert", parameters = @Parameters(value = { @Parameter(name = "obj", expression = "department.currentObject", type = TuraObject.class) }))
			InsertCommand insertCommand) {
		this.insertCommand = insertCommand;
		this.insertCommand.setDatacontrol(this);
	}

	@Override
	@Inject
	public void setUpdateCommand( 
			@Update(objectAction = "update", parameters = @Parameters(value = { @Parameter(name = "obj", expression = "department.currentObject", type = TuraObject.class) }))
			UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;
		this.updateCommand.setDatacontrol(this);
	}

	@Override
	@Inject
	public void setDeleteCommand( 
			@Delete(objectAction = "remove", parameters = @Parameters(value = { @Parameter(name = "obj", expression = "department.currentObject", type = TuraObject.class) }))
			DeleteCommand deleteCommand) {
		this.deleteCommand = deleteCommand;
		this.deleteCommand.setDatacontrol(this);
	}

	@Override
	@Inject
	public void setSearchCommand(
			@Search(objectAction = "find", parameters = @Parameters(value = {
					@Parameter(name = "dslQuery", expression = "department.query"),
					@Parameter(name = "startindex", expression = "department.startIndex"),
					@Parameter(name = "endindex", expression = "department.endIndex"),
					@Parameter(name = "objectClass", value = "org.tura.platform.hr.objects.DepartmentsDAO", type = String.class) }))
			SearchCommand searchCommand) {
		this.searchCommand = searchCommand;
		this.searchCommand.setDatacontrol(this);
	}

	@Override
	@Inject
	public void setDefaultQuery( 
			@Query(
				       base = @Base(clazz = DepartmentsDAO.class),
				       keys = @Keys(fields = { @Key(field = "objId") }),
				       search = @DefaultSearchCriterias(criterias = { @DefaultSearchCriteria(field = "objId", comparator = Operator.GT, value = "30", type = Integer.class, expression = "") }),
				       orders = @DefaultOrderBys(orders = { @DefaultOrderBy(field = "objId", type = SelectQuery.Order.ASC) })
				       )
			SelectQuery selectQuery) {
		this.defaultQuery = selectQuery;
	}

	@Override
	@Inject
	public void setElResolver( ELResolver elResolver) {
		this.elResolver = elResolver;

	}

	@Override
	@Inject
	public void setPreQueryTrigger( 
			@PreQuery("department")
			PreQueryTrigger preQueryTrigger) {
		this.preQueryTrigger = preQueryTrigger;
	}

	@Override
	@Inject
	public void setPostQueryTrigger( 
			@PostQuery("department")
			PostQueryTrigger postQueryTrigger) {
		this.postQueryTrigger = postQueryTrigger;
	}

	@Override
	@Inject
	public void setPostCreateTrigger(
			@PostCreate("department")
			PostCreateTrigger postCreateTrigger) {
		this.postCreateTrigger = postCreateTrigger;
	}

	@Override
	@Inject
	public void setPreDeleteTrigger(
			@PreDelete("department")
			PreDeleteTrigger preDeleteTrigger) {
		this.preDeleteTrigger = preDeleteTrigger;
	}

	@Override
	@Inject
	public void setPreInsertTrigger( 
			@PreInsert("department")
			PreInsertTrigger preInsertTrigger) {
		this.preInsertTrigger = preInsertTrigger;
	}

	@Override
	@Inject
	public void setPreUpdateTrigger( 
			@PreUpdate("department")
			PreUpdateTrigger preUpdateTrigger) {
		this.preUpdateTrigger = preUpdateTrigger;
	}

}
