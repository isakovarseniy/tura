package org.tura.platform.hr.controls;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.commons.jpa.TuraJPAEntityService;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.DataControlFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.annotations.ArtificialField;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.Base;
import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.DefaultOrderBy;
import org.tura.platform.datacontrol.annotations.DefaultOrderBys;
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
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.hr.objects.StreetDAO;
import org.tura.platform.persistence.TuraObject;

import com.octo.java.sql.query.SelectQuery;

@Named("street")
public class StreetDC extends DataControl<StreetDAO> {

	@Inject
	private TuraJPAEntityService provider;

	@Inject
	private Instance<StreetDC> streetcproducers;

	public StreetDC() throws Exception {
		super();
	}

	@PostConstruct
	public void init() throws IllegalArgumentException, IllegalAccessException {
		this.insertCommand.setProvider(provider);
		this.insertCommand.setDatacontrol(this);

		this.updateCommand.setProvider(provider);
		this.updateCommand.setDatacontrol(this);

		this.deleteCommand.setProvider(provider);
		this.deleteCommand.setDatacontrol(this);

		this.createCommand.setProvider(provider);
		this.createCommand.setDatacontrol(this);

		this.searchCommand.setProvider(provider);
		this.searchCommand.setDatacontrol(this);

		DataControlFactory.buildConnection(this);

	}

	@Inject
	public void setCommandStack(CommandStack commandStack) {
		this.commandStack = commandStack;
	}

	@Inject
	public void setKeys(
			@Keys(fields = { @Key(field = "objId") }) List<String> keys) {
		this.keys = keys;
	}

	@Inject
	public void setArtificialProperties(
			@ArtificialFields(fields = {
					@ArtificialField(field = "prop1", type = String.class),
					@ArtificialField(field = "prop2", type = String.class) }) List<ArtificialProperty> properties) {
		this.artificialProperties = properties;
	}

	@Override
	@Inject
	public void setCreateCommand(
			@Create(objectAction = "create", parameters = @Parameters(value = { @Parameter(name = "objType", value = "org.tura.platform.hr.objects.StreetDAO", type = String.class) })) CreateCommand createCommand) {
		this.createCommand = createCommand;
	}

	@Override
	@Inject
	public void setInsertCommand(
			@Insert(objectAction = "insert", parameters = @Parameters(value = { @Parameter(name = "obj", expression = "street.currentObject", type = TuraObject.class) })) InsertCommand insertCommand) {
		this.insertCommand = insertCommand;
	}

	@Override
	@Inject
	public void setUpdateCommand(
			@Update(objectAction = "update", parameters = @Parameters(value = { @Parameter(name = "obj", expression = "street.currentObject", type = TuraObject.class) })) UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;
	}

	@Override
	@Inject
	public void setDeleteCommand(
			@Delete(objectAction = "remove", parameters = @Parameters(value = { @Parameter(name = "obj", expression = "street.currentObject", type = TuraObject.class) })) DeleteCommand deleteCommand) {
		this.deleteCommand = deleteCommand;
	}

	@Override
	@Inject
	public void setSearchCommand(
			@Search(objectAction = "find", parameters = @Parameters(value = {
					@Parameter(name = "dslQuery", type = SelectQuery.class, expression = "street.query"),
					@Parameter(name = "startindex", type = Integer.class, expression = "street.startIndex"),
					@Parameter(name = "endindex", type = Integer.class, expression = "street.endIndex"),
					@Parameter(name = "objectClass", type = String.class, value = "org.tura.platform.hr.objects.StreetDAO") })) SearchCommand searchCommand) {
		this.searchCommand = searchCommand;
	}

	@Override
	@Inject
	public void setDefaultQuery(
			@Query(base = @Base(clazz = StreetDAO.class), search = @DefaultSearchCriterias(criterias = {}), orders = @DefaultOrderBys(orders = { @DefaultOrderBy(field = "objId", type = SelectQuery.Order.ASC) })) SelectQuery selectQuery) {
		this.defaultQuery = selectQuery;
	}

	@Override
	@Inject
	public void setElResolver(ELResolver elResolver) {
		this.elResolver = elResolver;
	}

	@Override
	@Inject
	public void setPreQueryTrigger(
			@PreQuery("street") PreQueryTrigger preQueryTrigger) {
		this.preQueryTrigger = preQueryTrigger;
	}

	@Override
	@Inject
	public void setPostQueryTrigger(
			@PostQuery("street") PostQueryTrigger postQueryTrigger) {
		this.postQueryTrigger = postQueryTrigger;
	}

	@Override
	@Inject
	public void setPostCreateTrigger(
			@PostCreate("street") PostCreateTrigger postCreateTrigger) {
		this.postCreateTrigger = postCreateTrigger;
	}

	@Override
	@Inject
	public void setPreDeleteTrigger(
			@PreDelete("street") PreDeleteTrigger preDeleteTrigger) {
		this.preDeleteTrigger = preDeleteTrigger;
	}

	@Override
	@Inject
	public void setPreInsertTrigger(
			@PreInsert("street") PreInsertTrigger preInsertTrigger) {
		this.preInsertTrigger = preInsertTrigger;
	}

	@Override
	@Inject
	public void setPreUpdateTrigger(
			@PreUpdate("street") PreUpdateTrigger preUpdateTrigger) {
		this.preUpdateTrigger = preUpdateTrigger;
	}

	@Override
	public void createChild(IDataControl dc, String relName, Relation relation) {
	}

}