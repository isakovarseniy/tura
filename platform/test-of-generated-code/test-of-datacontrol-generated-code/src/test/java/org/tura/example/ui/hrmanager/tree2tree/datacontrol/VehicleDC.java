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
package org.tura.example.ui.hrmanager.tree2tree.datacontrol;

import org.elsoft.platform.hr.objects.VehicleDAO;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.DataControlFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.ArtificialField;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
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
import org.tura.platform.object.TuraObject;
import org.tura.platform.repository.Repository;

import java.io.Serializable;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import javax.inject.Inject;
import javax.inject.Named;

import com.octo.java.sql.query.SelectQuery;

public class VehicleDC extends DataControl<VehicleDAO> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private transient Logger logger;
    @Inject
    private Repository provider_0;

    public VehicleDC() throws Exception {
        super();

    }

    @PostConstruct
    public void init() {
        try {
            setBaseClass(VehicleDAO.class);
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
            setArtificialInterface(IVehicleArtifitialFields.class);
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
        @ArtificialField(field = "nameArtf", type = String.class)

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
        @Named("hrmanager.tree2tree")
    CommandStack commandStack) {
        this.commandStack = commandStack;
    }

    @Override
    @Inject
    public void setCreateCommand(
        @Create(parameters = @Parameters(value =  {
        @Parameter(name = "objectType", expression = "org.elsoft.platform.hr.objects.VehicleDAO", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.tree2tree")
    @CreateTrigger("vehicle")
    CreateCommandBase createCommand) {
        this.createCommand = createCommand;
    }

    @Override
    @Inject
    public void setInsertCommand(
        @Insert(parameters = @Parameters(value =  {
        @Parameter(name = "object", expression = "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].currentObject}", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.tree2tree")
    @InsertTrigger("vehicle")
    InsertCommandBase insertCommand) {
        this.insertCommand = insertCommand;
    }

    @Override
    @Inject
    public void setUpdateCommand(
        @Update(parameters = @Parameters(value =  {
        @Parameter(name = "object", expression = "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].currentObject}", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.tree2tree")
    @UpdateTrigger("vehicle")
    UpdateCommandBase updateCommand) {
        this.updateCommand = updateCommand;
    }

    @Override
    @Inject
    public void setDeleteCommand(
        @Delete(parameters = @Parameters(value =  {
        @Parameter(name = "object", expression = "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].currentObject}", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.tree2tree")
    @DeleteTrigger("vehicle")
    DeleteCommandBase deleteCommand) {
        this.deleteCommand = deleteCommand;
    }

    @Override
    @Inject
    public void setSearchCommand(
        @Search(parameters = @Parameters(value =  {
        @Parameter(name = "searchCriteria", expression = "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].searchCriteria}", type = List.class)
        , @Parameter(name = "orderByCriteria", expression = "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].orderCriteria}", type = List.class)
        , @Parameter(name = "start Index", expression = "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].startIndex}", type = Integer.class)
        , @Parameter(name = "end Index", expression = "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].endIndex}", type = Integer.class)
        , @Parameter(name = "objectType", expression = "org.elsoft.platform.hr.objects.VehicleDAO", type = TuraObject.class)

    }
    )
    )
    @Selector("hrmanager.tree2tree")
    @SearchTrigger("vehicle")
    SearchCommandBase searchCommand) {
        this.searchCommand = searchCommand;
    }

    @Override
    @Inject
    public void setPreQueryTrigger(
        @Selector("hrmanager.tree2tree")
    @PreQuery("vehicle")
    PreQueryTrigger preQueryTrigger) {
        this.preQueryTrigger = preQueryTrigger;
    }

    @Override
    @Inject
    public void setPostQueryTrigger(
        @Selector("hrmanager.tree2tree")
    @PostQuery("vehicle")
    PostQueryTrigger postQueryTrigger) {
        this.postQueryTrigger = postQueryTrigger;
    }

    @Override
    @Inject
    public void setPostCreateTrigger(
        @Selector("hrmanager.tree2tree")
    @PostCreate("vehicle")
    PostCreateTrigger postCreateTrigger) {
        this.postCreateTrigger = postCreateTrigger;
    }

    @Override
    @Inject
    public void setPreDeleteTrigger(
        @Selector("hrmanager.tree2tree")
    @PreDelete("vehicle")
    PreDeleteTrigger preDeleteTrigger) {
        this.preDeleteTrigger = preDeleteTrigger;
    }

    @Override
    @Inject
    public void setPreInsertTrigger(
        @Selector("hrmanager.tree2tree")
    @PreInsert("vehicle")
    PreInsertTrigger preInsertTrigger) {
        this.preInsertTrigger = preInsertTrigger;
    }

    @Override
    @Inject
    public void setPreUpdateTrigger(
        @Selector("hrmanager.tree2tree")
    @PreUpdate("vehicle")
    PreUpdateTrigger preUpdateTrigger) {
        this.preUpdateTrigger = preUpdateTrigger;
    }

    @Override
    public void createChild(String relName)
        throws org.tura.platform.datacontrol.commons.TuraException {
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
