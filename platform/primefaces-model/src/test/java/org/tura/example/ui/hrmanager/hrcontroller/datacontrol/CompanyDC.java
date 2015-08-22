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
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.persistence.TuraObject;

import java.io.Serializable;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import javax.enterprise.inject.Instance;

import javax.inject.Inject;
import javax.inject.Named;

import com.octo.java.sql.query.SelectQuery;

public class CompanyDC extends DataControl<CompanyDAO> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private transient Logger logger;
    @Inject
    private TuraJPAEntityService provider_0;
    @Inject
    private Instance<TreeRootCountryDC> countryproducer;
    private IDataControl saveTreeContex;

    public CompanyDC() throws Exception {
        super();

    }

    @PostConstruct
    public void init() {
        try {
            setBaseClass(CompanyDAO.class);

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
            setArtificialInterface(ICompanyArtifitialFields.class);
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
    public void setCommandStack(
        @Named("hrmanager.hrcontroller")
    CommandStack commandStack) {
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
        @Parameter(name = "obj", expression = "#{beanFactoryHrManagerHRController.company.currentObject}", type = TuraObject.class)

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
        @Parameter(name = "obj", expression = "#{beanFactoryHrManagerHRController.company.currentObject}", type = TuraObject.class)

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
        @Parameter(name = "obj", expression = "#{beanFactoryHrManagerHRController.company.currentObject}", type = TuraObject.class)

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
        @Parameter(name = "search", expression = "#{beanFactoryHrManagerHRController.company.query}", type = SelectQuery.class)
        , @Parameter(name = "startIndex", expression = "#{beanFactoryHrManagerHRController.company.startIndex}", type = Integer.class)
        , @Parameter(name = "endIndex", expression = "#{beanFactoryHrManagerHRController.company.endIndex}", type = Integer.class)
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
        @Selector("hrmanager.hrcontroller")
    @PreQuery("company")
    PreQueryTrigger preQueryTrigger) {
        this.preQueryTrigger = preQueryTrigger;
    }

    @Override
    @Inject
    public void setPostQueryTrigger(
        @Selector("hrmanager.hrcontroller")
    @PostQuery("company")
    PostQueryTrigger postQueryTrigger) {
        this.postQueryTrigger = postQueryTrigger;
    }

    @Override
    @Inject
    public void setPostCreateTrigger(
        @Selector("hrmanager.hrcontroller")
    @PostCreate("company")
    PostCreateTrigger postCreateTrigger) {
        this.postCreateTrigger = postCreateTrigger;
    }

    @Override
    @Inject
    public void setPreDeleteTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreDelete("company")
    PreDeleteTrigger preDeleteTrigger) {
        this.preDeleteTrigger = preDeleteTrigger;
    }

    @Override
    @Inject
    public void setPreInsertTrigger(
        @Selector("hrmanager.hrcontroller")
    @PreInsert("company")
    PreInsertTrigger preInsertTrigger) {
        this.preInsertTrigger = preInsertTrigger;
    }

    @Override
    @Inject
    public void setPreUpdateTrigger(
        @Selector("hrmanager.hrcontroller")
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
            dc.setParent(relation);
            dc.setTreeContext(this.getTreeContext());
            relation.setMasterCurrentObject(getCurrentObject());
            dc.handleChangeMusterCurrentRecordNotification(relation.getMasterCurrentObject());
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

    private void saveState() {
        if (this.getTreeContext() != null) {
            saveTreeContex = this.getTreeContext().getCurrentControl();
            this.getTreeContext().setCurrentControl(this);
        }
    }

    private void restoreState() {
        if (saveTreeContex != null) {
            this.getTreeContext().setCurrentControl(saveTreeContex);
        }
    }

    private Object restoreState(Object obj) {
        if (saveTreeContex != null) {
            this.getTreeContext().setCurrentControl(saveTreeContex);
        }
        return obj;
    }

    @Override
    public void forceRefresh() throws TuraException {
        saveState();
        super.forceRefresh();
        restoreState();
    }

    @Override
    public void handleChangeMusterCurrentRecordNotification(
        Object newCurrentObject) throws TuraException {
        saveState();
        super.handleChangeMusterCurrentRecordNotification(newCurrentObject);
        restoreState();
    }

    @Override
    public void notifyLiteners(Event event) throws TuraException {
        saveState();
        super.notifyLiteners(event);
        restoreState();
    }

    @Override
    public CompanyDAO getCurrentObject() throws TuraException {
        saveState();
        return (CompanyDAO) restoreState(super.getCurrentObject());
    }

    @Override
    public boolean hasNext() throws TuraException {
        saveState();
        return (boolean) restoreState(super.hasNext());
    }

    @Override
    public void nextObject() throws TuraException {
        saveState();
        super.nextObject();
        restoreState();
    }

    @Override
    public boolean hasPrev() {
        saveState();
        return (boolean) restoreState(super.hasPrev());
    }

    @Override
    public void prevObject() throws TuraException {
        saveState();
        super.prevObject();
        restoreState();
    }

    @Override
    public void removeObject() throws Exception {
        saveState();
        super.removeObject();
        restoreState();
    }

    @Override
    public String getObjectKey(Object object) throws TuraException {
        saveState();
        return (String) restoreState(super.getObjectKey(object));
    }

    @Override
    public void removeAll() throws Exception {
        saveState();
        super.removeAll();
        restoreState();
    }

    @Override
    public CompanyDAO createObject() throws TuraException {
        saveState();
        return (CompanyDAO) restoreState(super.createObject());
    }

    @Override
    public Integer getCurrentPosition() {
        saveState();
        return (Integer) restoreState(super.getCurrentPosition());
    }

    @Override
    public boolean setCurrentPosition(Object crtPosition) throws TuraException {
        saveState();
        return (boolean) restoreState(super.setCurrentPosition(crtPosition));
    }

    @Override
    public SelectQuery getQuery() {
        saveState();
        return (SelectQuery) restoreState(super.getQuery());
    }

    @Override
    public void cleanShifter()
        throws org.tura.platform.datacontrol.commons.TuraException {
        saveState();
        super.cleanShifter();
        restoreState();
    }

    @Override
    public ShiftControl getShifter() throws TuraException {
        saveState();
        return (ShiftControl) restoreState(super.getShifter());
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<CompanyDAO> getScroller() {
        saveState();
        return (List<CompanyDAO>) restoreState(super.getScroller());
    }
}
