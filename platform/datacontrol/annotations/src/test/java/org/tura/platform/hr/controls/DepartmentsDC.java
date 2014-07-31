package org.tura.platform.hr.controls;

import java.util.List;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.commons.jpa.TuraJPAEntityService;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.ArtificialField;
import org.tura.platform.datacontrol.annotations.Base;
import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.DefaultOrderBys;
import org.tura.platform.datacontrol.annotations.DefaultOrderBy;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriteria;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriterias;
import org.tura.platform.datacontrol.annotations.Delete;
import org.tura.platform.datacontrol.annotations.Insert;
import org.tura.platform.datacontrol.annotations.Keys;
import org.tura.platform.datacontrol.annotations.Key;
import org.tura.platform.datacontrol.annotations.Parameter;
import org.tura.platform.datacontrol.annotations.Parameters;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.PreDelete;
import org.tura.platform.datacontrol.annotations.PreInsert;
import org.tura.platform.datacontrol.annotations.PreQuery;
import org.tura.platform.datacontrol.annotations.PreUpdate;
import org.tura.platform.datacontrol.annotations.Provider;
import org.tura.platform.datacontrol.annotations.Query;
import org.tura.platform.datacontrol.annotations.Qwerty;
import org.tura.platform.datacontrol.annotations.Search;
import org.tura.platform.datacontrol.annotations.TransactionUnit;
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

	private Object provider;

	public DepartmentsDC() throws Exception {
		super();
	}

	
	@Provider
	public Object getProvider() {
		if (provider == null)
			provider = new TuraJPAEntityService();
		return provider;
	}

//	@Inject
//	@TransactionUnit("MasterDetail")
	public void setCommandStack(CommandStack commandStack) {
		this.commandStack = commandStack;
	}

//	@Inject
//	@ArtificialFields(fields = {
//			@ArtificialField(field = "prop1", type = String.class),
//			@ArtificialField(field = "prop2", type = String.class) })
	public void setArtificialProperties( List<ArtificialProperty> properties) {
		this.artificialProperties = properties;
	}
	
	@Override
	@Inject
//	@Create(objectAction = "create", parameters = @Parameters(value = { @Parameter(name = "objType", value = "org.tura.platform.hr.objects.DepartmentsDAO", type = String.class) }))
	public void setCreateCommand( @Qwerty CreateCommand createCommand) {
		this.createCommand = createCommand;
		this.createCommand.setDatacontrol(this);
	}

	@Override
//	@Inject
//	@Insert(objectAction = "insert", parameters = @Parameters(value = { @Parameter(name = "obj", expression = "department.currentObject", type = TuraObject.class) }))
	public void setInsertCommand(  InsertCommand insertCommand) {
		this.insertCommand = insertCommand;
		this.insertCommand.setDatacontrol(this);
	}

	@Override
//	@Inject
//	@Update(objectAction = "update", parameters = @Parameters(value = { @Parameter(name = "obj", expression = "department.currentObject", type = TuraObject.class) }))
	public void setUpdateCommand( UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;
		this.updateCommand.setDatacontrol(this);
	}

	@Override
//	@Inject
//	@Delete(objectAction = "remove", parameters = @Parameters(value = { @Parameter(name = "obj", expression = "department.currentObject", type = TuraObject.class) }))
	public void setDeleteCommand( DeleteCommand deleteCommand) {
		this.deleteCommand = deleteCommand;
		this.deleteCommand.setDatacontrol(this);
	}

	@Override
//	@Inject
//	@Search(objectAction = "find", parameters = @Parameters(value = {
//			@Parameter(name = "dslQuery", expression = "department.query"),
//			@Parameter(name = "startindex", expression = "department.startIndex"),
//			@Parameter(name = "endindex", expression = "department.endIndex"),
//			@Parameter(name = "objectClass", value = "org.tura.platform.hr.objects.DepartmentsDAO", type = String.class) }))
	public void setSearchCommand(@Default SearchCommand searchCommand) {
		this.searchCommand = searchCommand;
		this.searchCommand.setDatacontrol(this);
	}

	@Override
	@Inject
//	@Query(
//	       base = @Base(clazz = DepartmentsDAO.class),
//	       keys = @Keys(fields = { @Key(field = "objId") }),
//	       search = @DefaultSearchCriterias(criterias = { @DefaultSearchCriteria(field = "objId", comparator = Operator.GT, value = "30", type = Integer.class, expression = "") }),
//	       orders = @DefaultOrderBys(orders = { @DefaultOrderBy(field = "objId", type = SelectQuery.Order.ASC) })
//	       )
	public void setDefaultQuery( SelectQuery selectQuery) {
		this.defaultQuery = selectQuery;
	}

	@Override
//	@Inject
	public void setElResolver( ELResolver elResolver) {
		this.elResolver = elResolver;

	}

	@Override
//	@Inject
//	@PreQuery("department")
	public void setPreQueryTrigger( PreQueryTrigger preQueryTrigger) {
		this.preQueryTrigger = preQueryTrigger;
	}

	@Override
//	@Inject
//	@PostQuery("department")
	public void setPostQueryTrigger( PostQueryTrigger postQueryTrigger) {
		this.postQueryTrigger = postQueryTrigger;
	}

	@Override
//	@Inject
//	@PostCreate("department")
	public void setPostCreateTrigger( PostCreateTrigger postCreateTrigger) {
		this.postCreateTrigger = postCreateTrigger;
	}

	@Override
//	@Inject
//	@PreDelete("department")
	public void setPreDeleteTrigger( PreDeleteTrigger preDeleteTrigger) {
		this.preDeleteTrigger = preDeleteTrigger;
	}

	@Override
//	@Inject
//	@PreInsert("department")
	public void setPreInsertTrigger( PreInsertTrigger preInsertTrigger) {
		this.preInsertTrigger = preInsertTrigger;
	}

	@Override
//	@Inject
//	@PreUpdate("department")
	public void setPreUpdateTrigger( PreUpdateTrigger preUpdateTrigger) {
		this.preUpdateTrigger = preUpdateTrigger;
	}

}
