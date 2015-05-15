package org.tura.example.ui.hrmanager.hrcontroller.datacontrol;

import org.elsoft.platform.hr.objects.EmployeesDAO;

import org.tura.platform.commons.jpa.TuraJPAEntityService;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.DataControlFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.Base;
import org.tura.platform.datacontrol.annotations.Connection;
import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.DCProxy;
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
import org.tura.platform.datacontrol.annotations.Selector;
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

import java.io.Serializable;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import javax.enterprise.inject.Instance;

import javax.inject.Inject;

import com.octo.java.sql.query.SelectQuery;

@DCProxy
public class EmployeeDC extends DataControl<EmployeesDAO>
    implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private transient Logger logger;
    @Inject
    private TuraJPAEntityService provider_0;
    @Inject
    private Instance<TreeRootFilesDC> filesproducer;

    public EmployeeDC() throws Exception {
        super();

    }

    @PostConstruct
    public void init() {
        try {
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
        } catch (Exception e) {
            logger.fine(e.getMessage());
        }
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
    public void setCommandStack(
        @Selector("hrmanager.hrcontroller")
    CommandStack commandStack) {
        this.commandStack = commandStack;
    }

    @Override
    @Inject
    public void setCreateCommand(
        @Create(objectAction = "create", parameters = @Parameters(value =  {
        @Parameter(name = "objectClass", value = "org.elsoft.platform.hr.objects.EmployeesDAO", type = String.class)

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
        @Parameter(name = "obj", expression = "#{beanFactoryHrManagerHRController.employee.currentObject}", type = TuraObject.class)

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
        @Parameter(name = "obj", expression = "#{beanFactoryHrManagerHRController.employee.currentObject}", type = TuraObject.class)

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
        @Parameter(name = "obj", expression = "#{beanFactoryHrManagerHRController.employee.currentObject}", type = TuraObject.class)

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
        @Parameter(name = "search", expression = "#{beanFactoryHrManagerHRController.employee.query}", type = SelectQuery.class)
        , @Parameter(name = "startIndex", expression = "#{beanFactoryHrManagerHRController.employee.startIndex}", type = Integer.class)
        , @Parameter(name = "endIndex", expression = "#{beanFactoryHrManagerHRController.employee.endIndex}", type = Integer.class)
        , @Parameter(name = "className", value = "org.elsoft.platform.hr.objects.EmployeesDAO", type = String.class)

    }
    )
    )
    SearchCommand searchCommand) {
        this.searchCommand = searchCommand;
    }

    @Override
    @Inject
    public void setPreQueryTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreQuery("employee")
    PreQueryTrigger preQueryTrigger) {
        this.preQueryTrigger = preQueryTrigger;
    }

    @Override
    @Inject
    public void setPostQueryTrigger(
        @Selector("hrmanager.hrcontroller")
    @PostQuery("employee")
    PostQueryTrigger postQueryTrigger) {
        this.postQueryTrigger = postQueryTrigger;
    }

    @Override
    @Inject
    public void setPostCreateTrigger(
        @Selector("hrmanager.hrcontroller")
    @PostCreate("employee")
    PostCreateTrigger postCreateTrigger) {
        this.postCreateTrigger = postCreateTrigger;
    }

    @Override
    @Inject
    public void setPreDeleteTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreDelete("employee")
    PreDeleteTrigger preDeleteTrigger) {
        this.preDeleteTrigger = preDeleteTrigger;
    }

    @Override
    @Inject
    public void setPreInsertTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreInsert("employee")
    PreInsertTrigger preInsertTrigger) {
        this.preInsertTrigger = preInsertTrigger;
    }

    @Override
    @Inject
    public void setPreUpdateTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreUpdate("employee")
    PreUpdateTrigger preUpdateTrigger) {
        this.preUpdateTrigger = preUpdateTrigger;
    }

    @Connection(connectionName = "employee2files", links =  {
        @Link(field1 = "objId", field2 = "parentId")

    }
    )
    public IDataControl getEmployee2Files()
        throws org.tura.platform.datacontrol.commons.TuraException {
        createChild("employee2files");
        Relation relation = this.getChild("employee2files");
        return relation.getChild();
    }

    @Override
    public void createChild(String relName)
        throws org.tura.platform.datacontrol.commons.TuraException {
        Relation relation = this.getChild(relName);
        if (relation.getChild() == null) {
            IDataControl dc = null;
            if ("employee2files".equals(relName)) {
                dc = filesproducer.get();
            }

            relation.setChild(dc);
            dc.setParent(relation);
            dc.setTreeContext(this.getTreeContext());
            relation.setMasterCurrentObject(getCurrentObject());
            dc.handleChangeMusterCurrentRecordNotification(relation.getMasterCurrentObject());
        }
    }

    @Override
    @Inject
    public void setDefaultQuery(
        @Query(base = @Base(clazz = EmployeesDAO.class)
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
