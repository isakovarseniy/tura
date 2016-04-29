/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.example.ui.hrmanager.hrcontroller.datacontrol;

import org.elsoft.platform.hr.objects.CountryDAO;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.DataControlFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.Connection;
import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.CreateTrigger;
import org.tura.platform.datacontrol.annotations.DefaultOrderBy;
import org.tura.platform.datacontrol.annotations.DefaultOrderBys;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriterias;
import org.tura.platform.datacontrol.annotations.Delete;
import org.tura.platform.datacontrol.annotations.DeleteTrigger;
import org.tura.platform.datacontrol.annotations.Insert;
import org.tura.platform.datacontrol.annotations.InsertTrigger;
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
import org.tura.platform.datacontrol.annotations.Search;
import org.tura.platform.datacontrol.annotations.SearchTrigger;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.annotations.Update;
import org.tura.platform.datacontrol.annotations.UpdateTrigger;
import org.tura.platform.datacontrol.command.base.CreateCommandBase;
import org.tura.platform.datacontrol.command.base.DeleteCommandBase;
import org.tura.platform.datacontrol.command.base.InsertCommandBase;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.base.PreInsertTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreUpdateTrigger;
import org.tura.platform.datacontrol.command.base.SearchCommandBase;
import org.tura.platform.datacontrol.command.base.UpdateCommandBase;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.object.TuraObject;
import org.tura.platform.repository.Repository;

import java.io.Serializable;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import javax.enterprise.inject.Instance;

import javax.inject.Inject;
import javax.inject.Named;

import com.octo.java.sql.query.SelectQuery;

public class CountryDC extends DataControl<CountryDAO> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private transient Logger logger;
    @Inject
    private Repository provider_0;
    @Inject
    private Instance<StateDC> stateproducer;

    public CountryDC() throws Exception {
        super();

    }

    @PostConstruct
    public void init() {
        try {
            setBaseClass(CountryDAO.class);
            this.createCommand.fixParameters("\\*\\*\\*\\*\\*\\*\\*", getId());
            this.createCommand.setDatacontrol(this);

            this.insertCommand.fixParameters("\\*\\*\\*\\*\\*\\*\\*", getId());
            this.insertCommand.setDatacontrol(this);

            this.updateCommand.fixParameters("\\*\\*\\*\\*\\*\\*\\*", getId());
            this.updateCommand.setDatacontrol(this);

            this.deleteCommand.fixParameters("\\*\\*\\*\\*\\*\\*\\*", getId());
            this.deleteCommand.setDatacontrol(this);

            this.searchCommand.fixParameters("\\*\\*\\*\\*\\*\\*\\*", getId());
            this.searchCommand.setDatacontrol(this);

            this.createCommand.setProvider(provider_0,
                "org.tura.platform.repository.Repository");
            this.insertCommand.setProvider(provider_0,
                "org.tura.platform.repository.Repository");
            this.updateCommand.setProvider(provider_0,
                "org.tura.platform.repository.Repository");
            this.deleteCommand.setProvider(provider_0,
                "org.tura.platform.repository.Repository");
            this.searchCommand.setProvider(provider_0,
                "org.tura.platform.repository.Repository");
            this.commandStack.getPoolFlushAware().add(this);
            DataControlFactory.buildConnection(this);
        } catch (Exception e) {
            logger.info(e.getMessage());
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
        @Named("hrmanager.hrcontroller")
    CommandStack commandStack) {
        this.commandStack = commandStack;
    }

    @Override
    @Inject
    public void setCreateCommand(
        @Create(parameters = @Parameters(value =  {
        @Parameter(name = "objectType", expression = "org.elsoft.platform.hr.objects.CountryDAO", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.hrcontroller")
    @CreateTrigger("country")
    CreateCommandBase createCommand) {
        this.createCommand = createCommand;
    }

    @Override
    @Inject
    public void setInsertCommand(
        @Insert(parameters = @Parameters(value =  {
        @Parameter(name = "object", expression = "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].currentObject}", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.hrcontroller")
    @InsertTrigger("country")
    InsertCommandBase insertCommand) {
        this.insertCommand = insertCommand;
    }

    @Override
    @Inject
    public void setUpdateCommand(
        @Update(parameters = @Parameters(value =  {
        @Parameter(name = "object", expression = "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].currentObject}", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.hrcontroller")
    @UpdateTrigger("country")
    UpdateCommandBase updateCommand) {
        this.updateCommand = updateCommand;
    }

    @Override
    @Inject
    public void setDeleteCommand(
        @Delete(parameters = @Parameters(value =  {
        @Parameter(name = "object", expression = "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].currentObject}", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.hrcontroller")
    @DeleteTrigger("country")
    DeleteCommandBase deleteCommand) {
        this.deleteCommand = deleteCommand;
    }

    @Override
    @Inject
    public void setSearchCommand(
        @Search(parameters = @Parameters(value =  {
        @Parameter(name = "searchCriteria", expression = "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].searchCriteria}", type = List.class)
        , @Parameter(name = "orderByCriteria", expression = "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].orderCriteria}", type = List.class)
        , @Parameter(name = "start Index", expression = "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].startIndex}", type = Integer.class)
        , @Parameter(name = "end Index", expression = "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].endIndex}", type = Integer.class)
        , @Parameter(name = "objectType", expression = "org.elsoft.platform.hr.objects.CountryDAO", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.hrcontroller")
    @SearchTrigger("country")
    SearchCommandBase searchCommand) {
        this.searchCommand = searchCommand;
    }

    @Override
    @Inject
    public void setPreQueryTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreQuery("country")
    PreQueryTrigger preQueryTrigger) {
        this.preQueryTrigger = preQueryTrigger;
    }

    @Override
    @Inject
    public void setPostQueryTrigger(
        @Selector("hrmanager.hrcontroller")
    @PostQuery("country")
    PostQueryTrigger postQueryTrigger) {
        this.postQueryTrigger = postQueryTrigger;
    }

    @Override
    @Inject
    public void setPostCreateTrigger(
        @Selector("hrmanager.hrcontroller")
    @PostCreate("country")
    PostCreateTrigger postCreateTrigger) {
        this.postCreateTrigger = postCreateTrigger;
    }

    @Override
    @Inject
    public void setPreDeleteTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreDelete("country")
    PreDeleteTrigger preDeleteTrigger) {
        this.preDeleteTrigger = preDeleteTrigger;
    }

    @Override
    @Inject
    public void setPreInsertTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreInsert("country")
    PreInsertTrigger preInsertTrigger) {
        this.preInsertTrigger = preInsertTrigger;
    }

    @Override
    @Inject
    public void setPreUpdateTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreUpdate("country")
    PreUpdateTrigger preUpdateTrigger) {
        this.preUpdateTrigger = preUpdateTrigger;
    }

    @Connection(connectionName = "country2state", links =  {
        @Link(field1 = "objId", field2 = "parentId")

    }
    )
    public IDataControl getCountry2State()
        throws org.tura.platform.datacontrol.commons.TuraException {
        createChild("country2state");
        Relation relation = this.getChild("country2state");
        return relation.getChild();
    }

    @Override
    public void createChild(String relName)
        throws org.tura.platform.datacontrol.commons.TuraException {
        Relation relation = this.getChild(relName);
        if (relation.getChild() == null) {
            IDataControl dc = null;
            if ("country2state".equals(relName)) {
                dc = stateproducer.get();
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
    public void setDefaultSearchCriteria(
        @DefaultSearchCriterias(criterias =  {
    }
    )
    List<SearchCriteria> defaultSearchCriteria) {
        this.defaultSearchCriteria = defaultSearchCriteria;
    }

    @Override
    @Inject
    public void setDefaultOrderCriteria(
        @DefaultOrderBys(orders =  {
        @DefaultOrderBy(field = "objId", order = SelectQuery.Order.ASC)

    }
    )
    List<OrderCriteria> defaultOrderCriteria) {
        this.defaultOrderCriteria = defaultOrderCriteria;
    }
}
