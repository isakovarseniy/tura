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

import org.elsoft.platform.hr.objects.StateDAO;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.DataControlFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.Connection;
import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.CreateTrigger;
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
import org.tura.platform.services.JPAService;

import java.io.Serializable;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import javax.enterprise.inject.Instance;

import javax.inject.Inject;
import javax.inject.Named;

public class StateDC extends DataControl<StateDAO> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private transient Logger logger;
    @Inject
    private JPAService provider_0;
    @Inject
    private Instance<CityDC> cityproducer;

    public StateDC() throws Exception {
        super();

    }

    @PostConstruct
    public void init() {
        try {
            setBaseClass(StateDAO.class);
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
                "org.tura.platform.commons.jpa.TuraJPAEntityService");
            this.insertCommand.setProvider(provider_0,
                "org.tura.platform.commons.jpa.TuraJPAEntityService");
            this.updateCommand.setProvider(provider_0,
                "org.tura.platform.commons.jpa.TuraJPAEntityService");
            this.deleteCommand.setProvider(provider_0,
                "org.tura.platform.commons.jpa.TuraJPAEntityService");
            this.searchCommand.setProvider(provider_0,
                "org.tura.platform.commons.jpa.TuraJPAEntityService");
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
        @Parameter(name = "objectType", expression = "org.elsoft.platform.hr.objects.StateDAO", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.hrcontroller")
    @CreateTrigger("state")
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
    @InsertTrigger("state")
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
    @UpdateTrigger("state")
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
    @DeleteTrigger("state")
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
        , @Parameter(name = "objectType", expression = "org.elsoft.platform.hr.objects.StateDAO", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.hrcontroller")
    @SearchTrigger("state")
    SearchCommandBase searchCommand) {
        this.searchCommand = searchCommand;
    }

    @Override
    @Inject
    public void setPreQueryTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreQuery("state")
    PreQueryTrigger preQueryTrigger) {
        this.preQueryTrigger = preQueryTrigger;
    }

    @Override
    @Inject
    public void setPostQueryTrigger(
        @Selector("hrmanager.hrcontroller")
    @PostQuery("state")
    PostQueryTrigger postQueryTrigger) {
        this.postQueryTrigger = postQueryTrigger;
    }

    @Override
    @Inject
    public void setPostCreateTrigger(
        @Selector("hrmanager.hrcontroller")
    @PostCreate("state")
    PostCreateTrigger postCreateTrigger) {
        this.postCreateTrigger = postCreateTrigger;
    }

    @Override
    @Inject
    public void setPreDeleteTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreDelete("state")
    PreDeleteTrigger preDeleteTrigger) {
        this.preDeleteTrigger = preDeleteTrigger;
    }

    @Override
    @Inject
    public void setPreInsertTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreInsert("state")
    PreInsertTrigger preInsertTrigger) {
        this.preInsertTrigger = preInsertTrigger;
    }

    @Override
    @Inject
    public void setPreUpdateTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreUpdate("state")
    PreUpdateTrigger preUpdateTrigger) {
        this.preUpdateTrigger = preUpdateTrigger;
    }

    @Connection(connectionName = "state2city", links =  {
        @Link(field1 = "objId", field2 = "parentId")

    }
    )
    public IDataControl getState2City()
        throws org.tura.platform.datacontrol.commons.TuraException {
        createChild("state2city");
        Relation relation = this.getChild("state2city");
        return relation.getChild();
    }

    @Override
    public void createChild(String relName)
        throws org.tura.platform.datacontrol.commons.TuraException {
        Relation relation = this.getChild(relName);
        if (relation.getChild() == null) {
            IDataControl dc = null;
            if ("state2city".equals(relName)) {
                dc = cityproducer.get();
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
    }
    )
    List<OrderCriteria> defaultOrderCriteria) {
        this.defaultOrderCriteria = defaultOrderCriteria;
    }
}
