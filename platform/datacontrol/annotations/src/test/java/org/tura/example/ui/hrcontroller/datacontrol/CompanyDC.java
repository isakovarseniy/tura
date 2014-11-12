package org.tura.example.ui.hrcontroller.datacontrol;

import org.elsoft.platform.hr.objects.CompanyDAO;

import org.tura.platform.commons.jpa.TuraJPAEntityService;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.DataControlFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.annotations.ArtificialField;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.Base;
import org.tura.platform.datacontrol.annotations.Connection;
import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.DefaultOrderBy;
import org.tura.platform.datacontrol.annotations.DefaultOrderBys;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriterias;
import org.tura.platform.datacontrol.annotations.Delete;
import org.tura.platform.datacontrol.annotations.Insert;
import org.tura.platform.datacontrol.annotations.Key;
import org.tura.platform.datacontrol.annotations.Keys;
import org.tura.platform.datacontrol.annotations.Link;
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
import org.tura.platform.persistence.TuraObject;

import java.util.List;

import javax.annotation.PostConstruct;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;

import javax.inject.Inject;
import javax.inject.Named;

import com.octo.java.sql.query.SelectQuery;

@Named("company")
@ApplicationScoped
public class CompanyDC extends DataControl<CompanyDAO> {
    @Inject
    private TuraJPAEntityService provider_0;
    @Inject
    private Instance<TreeRootCountryDC> countryproducer;

    public CompanyDC() throws Exception {
        super();
    }

    @PostConstruct
    public void init() throws IllegalArgumentException, IllegalAccessException {
        this.createCommand.setProvider(provider_0);
        this.createCommand.setDatacontrol(this);

        this.insertCommand.setProvider(provider_0);
        this.insertCommand.setDatacontrol(this);

        this.updateCommand.setProvider(provider_0);
        this.updateCommand.setDatacontrol(this);

        this.deleteCommand.setProvider(provider_0);
        this.deleteCommand.setDatacontrol(this);

        this.searchCommand.setProvider(provider_0);
        this.searchCommand.setDatacontrol(this);

        DataControlFactory.buildConnection(this);

    }

    @Inject
    public void setKeys(
        @Keys(fields =  {
        @Key(field = "objId")

    }
    )
    List<String> keys) {
        this.keys = keys;
    }

    @Inject
    public void setArtificialProperties(
        @ArtificialFields(fields =  {
        @ArtificialField(field = "testfield1", type = String.class)
        , @ArtificialField(field = "testField2", type = Integer.class)

    }
    )
    List<ArtificialProperty> properties) {
        this.artificialProperties = properties;
    }

    @Override
    @Inject
    public void setElResolver(ELResolver elResolver) {
        this.elResolver = elResolver;
    }

    @Inject
    public void setCommandStack(CommandStack commandStack) {
        this.commandStack = commandStack;
    }

    @Override
    @Inject
    public void setCreateCommand(
        @Create(objectAction = "create", parameters = @Parameters(value =  {
        @Parameter(name = "objectClass", value = "org.elsoft.platform.hr.objects.CompanyDAO", type = String.class)

    }
    )
    )
    CreateCommand createCommand) {
        this.createCommand = createCommand;
    }

    @Override
    @Inject
    public void setInsertCommand(
        @Insert(objectAction = "insert", parameters = @Parameters(value =  {
        @Parameter(name = "obj", expression = "company.currentObject", type = TuraObject.class)

    }
    )
    )
    InsertCommand insertCommand) {
        this.insertCommand = insertCommand;
    }

    @Override
    @Inject
    public void setUpdateCommand(
        @Update(objectAction = "update", parameters = @Parameters(value =  {
        @Parameter(name = "obj", expression = "company.currentObject", type = TuraObject.class)

    }
    )
    )
    UpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
    }

    @Override
    @Inject
    public void setDeleteCommand(
        @Delete(objectAction = "remove", parameters = @Parameters(value =  {
        @Parameter(name = "obj", expression = "company.currentObject", type = TuraObject.class)

    }
    )
    )
    DeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
    }

    @Override
    @Inject
    public void setSearchCommand(
        @Search(objectAction = "find", parameters = @Parameters(value =  {
        @Parameter(name = "search", expression = "company.query", type = SelectQuery.class)
        , @Parameter(name = "startIndex", expression = "company.startIndex", type = Integer.class)
        , @Parameter(name = "endIndex", expression = "company.endIndex", type = Integer.class)
        , @Parameter(name = "className", value = "org.elsoft.platform.hr.objects.CompanyDAO", type = String.class)

    }
    )
    )
    SearchCommand searchCommand) {
        this.searchCommand = searchCommand;
    }

    @Override
    @Inject
    public void setPreQueryTrigger(
        @PreQuery("company")
    PreQueryTrigger preQueryTrigger) {
        this.preQueryTrigger = preQueryTrigger;
    }

    @Override
    @Inject
    public void setPostQueryTrigger(
        @PostQuery("company")
    PostQueryTrigger postQueryTrigger) {
        this.postQueryTrigger = postQueryTrigger;
    }

    @Override
    @Inject
    public void setPostCreateTrigger(
        @PostCreate("company")
    PostCreateTrigger postCreateTrigger) {
        this.postCreateTrigger = postCreateTrigger;
    }

    @Override
    @Inject
    public void setPreDeleteTrigger(
        @PreDelete("company")
    PreDeleteTrigger preDeleteTrigger) {
        this.preDeleteTrigger = preDeleteTrigger;
    }

    @Override
    @Inject
    public void setPreInsertTrigger(
        @PreInsert("company")
    PreInsertTrigger preInsertTrigger) {
        this.preInsertTrigger = preInsertTrigger;
    }

    @Override
    @Inject
    public void setPreUpdateTrigger(
        @PreUpdate("company")
    PreUpdateTrigger preUpdateTrigger) {
        this.preUpdateTrigger = preUpdateTrigger;
    }

    @Connection(connectionName = "company2country", links =  {
        @Link(field1 = "objId", field2 = "parentId")

    }
    )
    public IDataControl getCompany2Country()
        throws org.tura.platform.datacontrol.commons.TuraException {
        createChild("company2country");
        Relation relation = this.getChild("company2country");
        return relation.getChild();
    }

    @Override
    public void createChild(String relName)
        throws org.tura.platform.datacontrol.commons.TuraException {
        Relation relation = this.getChild(relName);
        if (relation.getChild() == null) {
            IDataControl dc = null;
            if ("company2country".equals(relName)) {
                dc = countryproducer.get();
            }

            relation.setChild(dc);
            relation.setMasterCurrentObject(getCurrentObject());
            dc.setParent(relation);

        }
    }

    @Override
    @Inject
    public void setDefaultQuery(
        @Query(base = @Base(clazz = CompanyDAO.class)
    , search = @DefaultSearchCriterias(criterias =  {
    }
    )
    , orders = @DefaultOrderBys(orders =  {
        @DefaultOrderBy(field = "objId", order = SelectQuery.Order.ASC)

    }
    )
    )
    SelectQuery selectQuery) {
        this.defaultQuery = selectQuery;
    }
}
