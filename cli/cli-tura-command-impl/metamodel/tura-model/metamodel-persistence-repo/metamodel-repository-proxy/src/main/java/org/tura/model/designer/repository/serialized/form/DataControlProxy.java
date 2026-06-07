/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.model.designer.repository.serialized.form;

import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import java.util.UUID;
import org.tura.platform.repository.core.ObjectControl;
import java.io.Serializable;
import org.tura.platform.repository.cpa.storage.TimeStampAware;
import org.tura.platform.repository.core.Cleanable;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.proxy.ProxyObjectUpdateListener;
import java.util.ArrayList;
import org.tura.platform.repository.proxy.ArtificialFieldWrapperProvider;
import org.tura.platform.repository.operation.AddLinkOperation;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.Registry;
import java.io.IOException;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.serialized.form.mapper.DataControlProxyMapper;
import org.tura.platform.repository.cpa.EClass;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.operation.UpdateObjectOperation;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import java.util.List;
import org.tura.platform.repository.operation.AddObjectOperation;
import org.tura.platform.repository.operation.RemoveObjectOperation;
import org.tura.platform.repository.proxy.access.EagerList;
import org.tura.platform.repository.proxy.access.DelStruc;
import org.tura.platform.repository.proxy.access.LazyList;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.model.designer.repository.serialized.type.TypePointerObj;
import org.tura.platform.repository.proxy.access.EagerSingleObject;
import org.tura.platform.repository.operation.RemoveContainmentObjectOperation;
import org.tura.platform.repository.operation.AddContainmentObjectOperation;
import org.tura.platform.repository.proxy.access.LazySingleObject;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class DataControlProxy extends DataControl
    implements ObjectControl, Serializable, TimeStampAware, Cleanable {

  private static final long serialVersionUID = 1L;

  private Map<String, Object> attributes = new HashMap<String, Object>();

  private ArrayList<ProxyObjectUpdateListener> listeners =
      new ArrayList<ProxyObjectUpdateListener>();

  private ArtificialFieldWrapperProvider artificialFieldWrapper;

  private AddLinkOperation linkOperation;

  private CpaRepository repository;

  private CpaStorageProvider storageProvider;

  private Map<String, ProxyCommadStackProvider> stackMap = new HashMap<>();

  private boolean forcePKupdate = false;

  private boolean inMemory = false;

  private Integer viewModelId1;

  @SuppressWarnings("unused")
  private String id = java.util.UUID.randomUUID().toString();

  private String _sourceId;

  private RepoKeyPath saveCpaPath;

  public DataControlProxy(
      org.tura.model.designer.repository.serialized.form.DataControl object,
      org.tura.platform.repository.cpa.CpaRepository repository,
      org.tura.platform.repository.cpa.storage.CpaStorageProvider storageProvider) {
    this.repository = repository;
    if (object.getCpaid() == null) {
      object.setCpaid(java.util.UUID.randomUUID().toString());
    }
    this.setCpaid(object.getCpaid());
    this.storageProvider = storageProvider;
    lock();
  }

  public DataControlProxy(DataControlProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.opSourcePointerControlPointerLazy = proxy.opSourcePointerControlPointerLazy;
    this.opSourcePointerControlPointerEager = proxy.opSourcePointerControlPointerEager;
    this.opSourceCastDataControlControlPointerLazy =
        proxy.opSourceCastDataControlControlPointerLazy;
    this.opSourceCastDataControlControlPointerEager =
        proxy.opSourceCastDataControlControlPointerEager;
    this.opOptionPointerOptionSelectionLazy = proxy.opOptionPointerOptionSelectionLazy;
    this.opOptionPointerOptionSelectionEager = proxy.opOptionPointerOptionSelectionEager;
    this.opOptionCastDataControlOptionSelectionLazy =
        proxy.opOptionCastDataControlOptionSelectionLazy;
    this.opOptionCastDataControlOptionSelectionEager =
        proxy.opOptionCastDataControlOptionSelectionEager;
    this.baseTypeLazySingleObject = proxy.baseTypeLazySingleObject;
    this.baseTypeEagerSingleObject = proxy.baseTypeEagerSingleObject;
    this.preQueryTriggerLazySingleObject = proxy.preQueryTriggerLazySingleObject;
    this.preQueryTriggerEagerSingleObject = proxy.preQueryTriggerEagerSingleObject;
    this.postQueryTriggerLazySingleObject = proxy.postQueryTriggerLazySingleObject;
    this.postQueryTriggerEagerSingleObject = proxy.postQueryTriggerEagerSingleObject;
    this.preInsertTriggerLazySingleObject = proxy.preInsertTriggerLazySingleObject;
    this.preInsertTriggerEagerSingleObject = proxy.preInsertTriggerEagerSingleObject;
    this.preDeleteTriggerLazySingleObject = proxy.preDeleteTriggerLazySingleObject;
    this.preDeleteTriggerEagerSingleObject = proxy.preDeleteTriggerEagerSingleObject;
    this.postCreateTriggerLazySingleObject = proxy.postCreateTriggerLazySingleObject;
    this.postCreateTriggerEagerSingleObject = proxy.postCreateTriggerEagerSingleObject;
    this.preUpdateTriggerLazySingleObject = proxy.preUpdateTriggerLazySingleObject;
    this.preUpdateTriggerEagerSingleObject = proxy.preUpdateTriggerEagerSingleObject;
    this.createLazySingleObject = proxy.createLazySingleObject;
    this.createEagerSingleObject = proxy.createEagerSingleObject;
    this.searchLazySingleObject = proxy.searchLazySingleObject;
    this.searchEagerSingleObject = proxy.searchEagerSingleObject;
    this.artificialFieldsLazy = proxy.artificialFieldsLazy;
    this.artificialFieldsEager = proxy.artificialFieldsEager;
    this.defaultSearchLazySingleObject = proxy.defaultSearchLazySingleObject;
    this.defaultSearchEagerSingleObject = proxy.defaultSearchEagerSingleObject;
    this.defaultOrderByLazySingleObject = proxy.defaultOrderByLazySingleObject;
    this.defaultOrderByEagerSingleObject = proxy.defaultOrderByEagerSingleObject;
    this.relationMappersLazy = proxy.relationMappersLazy;
    this.relationMappersEager = proxy.relationMappersEager;
    this.opDataControlRefRelationMapperLazy = proxy.opDataControlRefRelationMapperLazy;
    this.opDataControlRefRelationMapperEager = proxy.opDataControlRefRelationMapperEager;
    this.opMasterRelationLazy = proxy.opMasterRelationLazy;
    this.opMasterRelationEager = proxy.opMasterRelationEager;
    this.opDetailRelationLazy = proxy.opDetailRelationLazy;
    this.opDetailRelationEager = proxy.opDetailRelationEager;
    this.opMasterDependencyLazy = proxy.opMasterDependencyLazy;
    this.opMasterDependencyEager = proxy.opMasterDependencyEager;
    this.opDetailDependencyLazy = proxy.opDetailDependencyLazy;
    this.opDetailDependencyEager = proxy.opDetailDependencyEager;
    this.opControlsControlsLazySingleObject = proxy.opControlsControlsLazySingleObject;
    this.opControlsControlsEagerSingleObject = proxy.opControlsControlsEagerSingleObject;
    this.classifiersEager = proxy.classifiersEager;
    this.opSourceAttributeConnectorLazy = proxy.opSourceAttributeConnectorLazy;
    this.opSourceAttributeConnectorEager = proxy.opSourceAttributeConnectorEager;
    this.opTargetAttributeConnectorLazy = proxy.opTargetAttributeConnectorLazy;
    this.opTargetAttributeConnectorEager = proxy.opTargetAttributeConnectorEager;
    this.opRefObjContextParameterLazy = proxy.opRefObjContextParameterLazy;
    this.opRefObjContextParameterEager = proxy.opRefObjContextParameterEager;
    this.opObjRefExpressionPartLazy = proxy.opObjRefExpressionPartLazy;
    this.opObjRefExpressionPartEager = proxy.opObjRefExpressionPartEager;
    this.opValuePointerControlPointerLazy = proxy.opValuePointerControlPointerLazy;
    this.opValuePointerControlPointerEager = proxy.opValuePointerControlPointerEager;
    this.opDisplayOptionPointerSelectionLazy = proxy.opDisplayOptionPointerSelectionLazy;
    this.opDisplayOptionPointerSelectionEager = proxy.opDisplayOptionPointerSelectionEager;
    this.opValueOptionPointerSelectionLazy = proxy.opValueOptionPointerSelectionLazy;
    this.opValueOptionPointerSelectionEager = proxy.opValueOptionPointerSelectionEager;
    this.opRefObjOrderByLazy = proxy.opRefObjOrderByLazy;
    this.opRefObjOrderByEager = proxy.opRefObjOrderByEager;
    lock();
  }

  public boolean isInMemory() {
    return inMemory;
  }

  @Override
  public Repository getRepository() {
    return repository;
  }

  @Override
  public Registry getRegistry() {
    return repository.getRegistry();
  }

  @Override
  public void clean(String name) throws IOException {
    if ("opSourcePointerControlPointer".equals(name)) {
      cleanOpSourcePointerControlPointer();
    }
    if ("opSourceCastDataControlControlPointer".equals(name)) {
      cleanOpSourceCastDataControlControlPointer();
    }
    if ("opOptionPointerOptionSelection".equals(name)) {
      cleanOpOptionPointerOptionSelection();
    }
    if ("opOptionCastDataControlOptionSelection".equals(name)) {
      cleanOpOptionCastDataControlOptionSelection();
    }
    if ("baseType".equals(name)) {
      cleanBaseType();
    }
    if ("preQueryTrigger".equals(name)) {
      cleanPreQueryTrigger();
    }
    if ("postQueryTrigger".equals(name)) {
      cleanPostQueryTrigger();
    }
    if ("preInsertTrigger".equals(name)) {
      cleanPreInsertTrigger();
    }
    if ("preDeleteTrigger".equals(name)) {
      cleanPreDeleteTrigger();
    }
    if ("postCreateTrigger".equals(name)) {
      cleanPostCreateTrigger();
    }
    if ("preUpdateTrigger".equals(name)) {
      cleanPreUpdateTrigger();
    }
    if ("create".equals(name)) {
      cleanCreate();
    }
    if ("search".equals(name)) {
      cleanSearch();
    }
    if ("artificialFields".equals(name)) {
      cleanArtificialFields();
    }
    if ("defaultSearch".equals(name)) {
      cleanDefaultSearch();
    }
    if ("defaultOrderBy".equals(name)) {
      cleanDefaultOrderBy();
    }
    if ("relationMappers".equals(name)) {
      cleanRelationMappers();
    }
    if ("opDataControlRefRelationMapper".equals(name)) {
      cleanOpDataControlRefRelationMapper();
    }
    if ("opMasterRelation".equals(name)) {
      cleanOpMasterRelation();
    }
    if ("opDetailRelation".equals(name)) {
      cleanOpDetailRelation();
    }
    if ("opMasterDependency".equals(name)) {
      cleanOpMasterDependency();
    }
    if ("opDetailDependency".equals(name)) {
      cleanOpDetailDependency();
    }
    if ("opControlsControls".equals(name)) {
      cleanOpControlsControls();
    }
    if ("classifiers".equals(name)) {
      cleanClassifiers();
    }
    if ("opSourceAttributeConnector".equals(name)) {
      cleanOpSourceAttributeConnector();
    }
    if ("opTargetAttributeConnector".equals(name)) {
      cleanOpTargetAttributeConnector();
    }
    if ("opRefObjContextParameter".equals(name)) {
      cleanOpRefObjContextParameter();
    }
    if ("opObjRefExpressionPart".equals(name)) {
      cleanOpObjRefExpressionPart();
    }
    if ("opValuePointerControlPointer".equals(name)) {
      cleanOpValuePointerControlPointer();
    }
    if ("opDisplayOptionPointerSelection".equals(name)) {
      cleanOpDisplayOptionPointerSelection();
    }
    if ("opValueOptionPointerSelection".equals(name)) {
      cleanOpValueOptionPointerSelection();
    }
    if ("opRefObjOrderBy".equals(name)) {
      cleanOpRefObjOrderBy();
    }
  }

  public void setViewModelId1(Integer viewModelId1) {
    this.viewModelId1 = viewModelId1;
  }

  public Integer getViewModelId1() {
    return viewModelId1;
  }

  public DataControlProxy inMemory() {
    DataControlProxy inMProxy = new DataControlProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.form.DataControl.class;
  }

  public Object getArtificialFieldWrapper() {
    if (artificialFieldWrapper != null) {
      return artificialFieldWrapper.wrap(this);
    }
    return this;
  }

  public String get_SrcId() {
    return this._sourceId;
  }

  public void set_SrcId(String _sourceId) {
    this._sourceId = _sourceId;
  }

  public void addArtificialFieldWrapperProvider(
      org.tura.platform.repository.proxy.ArtificialFieldWrapperProvider artificialFieldWrapper) {
    this.artificialFieldWrapper = artificialFieldWrapper;
  }

  public ArtificialFieldWrapperProvider getArtificialFieldWrapperProvider() {
    return this.artificialFieldWrapper;
  }

  public void setLinkOperation(
      org.tura.platform.repository.operation.AddLinkOperation linkOperation) {
    this.linkOperation = linkOperation;
  }

  public AddLinkOperation getLinkOperation() {
    AddLinkOperation lnk = this.linkOperation;
    if (lnk == null) {
      lnk =
          (AddLinkOperation)
              this.attributes.get(org.tura.platform.datacontrol.commons.Constants.LINK_OPERATION);
    }
    if (lnk != null) {
      lnk.setDetail(this);
      return lnk;
    } else {
      return null;
    }
  }

  private void lock() {
    try {
      org.tura.platform.repository.cpa.storage.Locker.lock(this);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private void readObject(java.io.ObjectInputStream aInputStream)
      throws ClassNotFoundException, IOException {
    aInputStream.defaultReadObject();
    try {
      org.tura.platform.repository.cpa.storage.Locker.restoreLock(this, this.saveCpaPath);
      this.saveCpaPath = null;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private void writeObject(java.io.ObjectOutputStream aOutputStream) throws IOException {
    this.saveCpaPath = this.getCpaPath();
    aOutputStream.defaultWriteObject();
  }

  public void setForcePKupdate(boolean forcePKupdate) {
    this.forcePKupdate = forcePKupdate;
  }

  public DataControl clone() {
    try {
      return (DataControl)
          new DataControlProxyMapper(repository.getRegistry()).copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public DataControl deepClone() {
    try {
      return (DataControl)
          new DataControlProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public DataControl deepClone(java.util.Map<Object, Object> context) {
    try {
      return (DataControl)
          new DataControlProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    DataControlProxyMapper mapper = new DataControlProxyMapper(repository.getRegistry());
    Object pk = mapper.getPrimaryKeyFromRepositoryObject(this);
    mapper.put(context, pk, this);
  }

  protected void notifyListner(org.tura.platform.repository.core.ObjectControl obj, String property)
      throws Exception {
    for (ProxyObjectUpdateListener lst : listeners) {
      lst.listener(obj, property);
    }
  }

  public void notifyListner() throws Exception {
    notifyListner(this, null);
  }

  public Map<String, Object> getObjectControlAttributes() {
    return attributes;
  }

  public EClass eClass() {
    return new EClass("DataControl");
  }

  public Object eContainer() {
    DataControlProxy memPrx = new DataControlProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpControlsControls();
    if (container != null) {
      return container;
    }
    container = this.getOpControlsControls();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof DataControlProxy) {
      return this.getKey().equals(((DataControlProxy) o).getKey());
    } else {
      if (o instanceof DataControl) {
        DataControl obj = (DataControl) o;
        EqualsBuilder builder = new EqualsBuilder();
        builder.append(getObject().getUid(), obj.getUid());
        return builder.isEquals();
      } else {
        return false;
      }
    }
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(this.getKey());
    return builder.hashCode();
  }

  @Override
  public Boolean getAttached() {
    Boolean b = this.getObject().getAttached();
    if (b == null) {
      return false;
    }
    return b;
  }

  private DataControl getObject() {
    try {
      return storageProvider.get().getObject(this.getCpaPath());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public boolean isRemoved() {
    return getObject() == null;
  }

  public String getKey() {
    return getKey(getObject());
  }

  private String getKey(org.tura.model.designer.repository.serialized.form.DataControl object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.form.DataControl");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new DataControlProxyMapper(repository.getRegistry()).getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.DataControl");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), this.getCpaid());
    key.addValue(value);
    return key;
  }

  public static ArrayList<FieldValue> getPrimaryKeyFields() throws Exception {
    ArrayList<FieldValue> fields = new ArrayList<FieldValue>();
    FieldValue field = null;
    field = new FieldValue("Uid", "java.lang.String", null);
    fields.add(field);
    return fields;
  }

  public RepoKeyPath getPath() throws Exception {
    return new DataControlProxyMapper(repository.getRegistry()).getPath(this.getObject());
  }

  public RepoKeyPath getCpaPath() {
    try {
      RepoKeyPath path = new RepoKeyPath();
      path.addRepoObjectKey(null, getCpaPrimaryKey());
      return path;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String toString() {
    String str = "";
    str = str + " uid = " + getObject().getUid();
    str = str + " name = " + getObject().getName();
    str = str + " suid = " + getObject().getSuidCategorized();
    return str;
  }

  @Override
  public long getStorageControlTimeStamp() {
    try {
      return storageProvider.get().getStorageControl(this.getCpaPath()).getTimeStamp();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static UpdateObjectOperation upd(
      org.tura.platform.repository.core.ObjectControl obj,
      org.tura.platform.repository.proxy.ProxyCommadStackProvider localStackProvider,
      String property,
      Object oldValue,
      Object newValue,
      Class<?> valueType) {
    UpdateObjectOperation command = new UpdateObjectOperation();
    command.setProxy(obj);
    command.setStackProvider(localStackProvider);
    command.setNewValue(newValue);
    command.setOldValue(oldValue);
    command.setProperty(property);
    command.setPropertyType(valueType);
    return command;
  }

  @Override
  public void setAttached(Boolean attachment) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "attached",
              this.getObject().getAttached(),
              attachment,
              Boolean.class);
      if (command.prepare()) {
        localStackProvider.get().commit();
      }
      if (((ObjectControl) this.getBaseTypeEager()) != null) {
        ((ObjectControl) this.getBaseTypeEager()).setAttached(true);
      }
      if (((ObjectControl) this.getPreQueryTriggerEager()) != null) {
        ((ObjectControl) this.getPreQueryTriggerEager()).setAttached(true);
      }
      if (((ObjectControl) this.getPostQueryTriggerEager()) != null) {
        ((ObjectControl) this.getPostQueryTriggerEager()).setAttached(true);
      }
      if (((ObjectControl) this.getPreInsertTriggerEager()) != null) {
        ((ObjectControl) this.getPreInsertTriggerEager()).setAttached(true);
      }
      if (((ObjectControl) this.getPreDeleteTriggerEager()) != null) {
        ((ObjectControl) this.getPreDeleteTriggerEager()).setAttached(true);
      }
      if (((ObjectControl) this.getPostCreateTriggerEager()) != null) {
        ((ObjectControl) this.getPostCreateTriggerEager()).setAttached(true);
      }
      if (((ObjectControl) this.getPreUpdateTriggerEager()) != null) {
        ((ObjectControl) this.getPreUpdateTriggerEager()).setAttached(true);
      }
      if (((ObjectControl) this.getCreateEager()) != null) {
        ((ObjectControl) this.getCreateEager()).setAttached(true);
      }
      if (((ObjectControl) this.getSearchEager()) != null) {
        ((ObjectControl) this.getSearchEager()).setAttached(true);
      }
      for (ArtificialField t : this.getArtificialFieldsEager()) {
        ((ObjectControl) t).setAttached(true);
      }
      if (((ObjectControl) this.getDefaultSearchEager()) != null) {
        ((ObjectControl) this.getDefaultSearchEager()).setAttached(true);
      }
      if (((ObjectControl) this.getDefaultOrderByEager()) != null) {
        ((ObjectControl) this.getDefaultOrderByEager()).setAttached(true);
      }
      for (RelationMapper t : this.getRelationMappersEager()) {
        ((ObjectControl) t).setAttached(true);
      }
      for (Classifier t : this.getClassifiersEager()) {
        ((ObjectControl) t).setAttached(true);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefControlsControls() {
    return this.getObject().getTransientrefControlsControls();
  }

  @Override
  public void setTransientrefControlsControls(java.lang.String refControlsControls) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefControlsControls",
              this.getObject().getTransientrefControlsControls(),
              refControlsControls,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefControlsControls");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getUid() {
    return this.getObject().getUid();
  }

  @Override
  public void setUid(java.lang.String uid) {
    String session = UUID.randomUUID().toString();
    if (this.getObject().getAttached() == null || !this.getObject().getAttached()) {
      try {
        ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
        UpdateObjectOperation command =
            upd(
                this,
                localStackProvider,
                "Uid",
                this.getObject().getUid(),
                uid,
                java.lang.String.class);
        if (command.prepare()) {
          localStackProvider.get().getListOfCommand();
          localStackProvider.get().commit();
          notifyListner(this, "uid");
        }
      } catch (Exception e) {
        throw new RuntimeException(e);
      } finally {
        removeLocalStackProvider(session);
      }
    } else {
      if (forcePKupdate) {
        try {
          ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
          UpdateObjectOperation command =
              upd(
                  this,
                  localStackProvider,
                  "Uid",
                  this.getObject().getUid(),
                  uid,
                  java.lang.String.class);
          if (command.prepare()) {
            List<Object> changes = localStackProvider.get().getListOfCommand();
            localStackProvider.get().commit();
            repository.getStackProvider().get().addCommands(changes);
            notifyListner(this, "uid");
          }
          return;
        } catch (Exception e) {
          throw new RuntimeException(e);
        } finally {
          removeLocalStackProvider(session);
        }
      }
      throw new RuntimeException("Could  not modify primary key on attached object");
    }
  }

  @Override
  public String getName() {
    return this.getObject().getName();
  }

  @Override
  public void setName(java.lang.String name) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "Name",
              this.getObject().getName(),
              name,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "name");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  public List<ControlPointer> getOpSourcePointerControlPointer() {
    if (inMemory) {
      return getOpSourcePointerControlPointerEager();
    } else {
      return getOpSourcePointerControlPointerLazy();
    }
  }

  public void cleanOpSourcePointerControlPointer() throws IOException {
    if (opSourcePointerControlPointerEager != null) {
      opSourcePointerControlPointerEager.close();
      opSourcePointerControlPointerEager = null;
    }
    if (opSourcePointerControlPointerLazy != null) {
      opSourcePointerControlPointerLazy.close();
      opSourcePointerControlPointerLazy = null;
    }
  }

  public static AddObjectOperation addOpSourcePointerControlPointer(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.ControlPointer detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpSourcePointerControlPointer");
    command.setDetailProperty("SourcePointer");
    return command;
  }

  public static RemoveObjectOperation rmOpSourcePointerControlPointer(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.ControlPointer detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpSourcePointerControlPointer");
    command.setDetailProperty("SourcePointer");
    return command;
  }

  private EagerList<ControlPointer> opSourcePointerControlPointerEager;

  public List<ControlPointer> getOpSourcePointerControlPointerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opSourcePointerControlPointerEager == null) {
      opSourcePointerControlPointerEager =
          new EagerList<ControlPointer>(
              org.tura.model.designer.repository.serialized.form.ControlPointer.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ControlPointer
                    opSourcePointerControlPointer) {
              if (opSourcePointerControlPointer == null) {
                return;
              }
              if (opSourcePointerControlPointer != null
                  && (opSourcePointerControlPointer.getAttached() == null
                      || !opSourcePointerControlPointer.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opSourcePointerControlPointer);
                  repository.insert(opSourcePointerControlPointer, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.form.DataControl.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpSourcePointerControlPointer(
                        DataControlProxy.this, opSourcePointerControlPointer);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opSourcePointerControlPointer);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ControlPointer opSourcePointerControlPointer = (ControlPointer) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opSourcePointerControlPointer);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpSourcePointerControlPointer(
                          DataControlProxy.this, opSourcePointerControlPointer);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ControlPointer remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpSourcePointerControlPointer(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "4602eb8d-c89b-4a6c-97ca-541586b81ddf";
            }
          };
    }
    return opSourcePointerControlPointerEager;
  }

  private LazyList<ControlPointer> opSourcePointerControlPointerLazy;

  public List<ControlPointer> getOpSourcePointerControlPointerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opSourcePointerControlPointerLazy == null) {
      opSourcePointerControlPointerLazy =
          new LazyList<ControlPointer>(
              org.tura.model.designer.repository.serialized.form.ControlPointer.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpSourcePointerControlPointerDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ControlPointer
                    opSourcePointerControlPointer) {
              if (opSourcePointerControlPointer == null) {
                return;
              }
              getOpSourcePointerControlPointerEager().add(i, opSourcePointerControlPointer);
              super.add(i, opSourcePointerControlPointer);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ControlPointer opSourcePointerControlPointer = (ControlPointer) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opSourcePointerControlPointer);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpSourcePointerControlPointer(
                          DataControlProxy.this, opSourcePointerControlPointer);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ControlPointer remove(int index) {
              super.remove(index);
              return getOpSourcePointerControlPointerEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "4602eb8d-c89b-4a6c-97ca-541586b81ddf";
            }
          };
    }
    return opSourcePointerControlPointerLazy;
  }

  public List<ControlPointer> getOpSourceCastDataControlControlPointer() {
    if (inMemory) {
      return getOpSourceCastDataControlControlPointerEager();
    } else {
      return getOpSourceCastDataControlControlPointerLazy();
    }
  }

  public void cleanOpSourceCastDataControlControlPointer() throws IOException {
    if (opSourceCastDataControlControlPointerEager != null) {
      opSourceCastDataControlControlPointerEager.close();
      opSourceCastDataControlControlPointerEager = null;
    }
    if (opSourceCastDataControlControlPointerLazy != null) {
      opSourceCastDataControlControlPointerLazy.close();
      opSourceCastDataControlControlPointerLazy = null;
    }
  }

  public static AddObjectOperation addOpSourceCastDataControlControlPointer(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.ControlPointer detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpSourceCastDataControlControlPointer");
    command.setDetailProperty("SourceCastDataControl");
    return command;
  }

  public static RemoveObjectOperation rmOpSourceCastDataControlControlPointer(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.ControlPointer detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpSourceCastDataControlControlPointer");
    command.setDetailProperty("SourceCastDataControl");
    return command;
  }

  private EagerList<ControlPointer> opSourceCastDataControlControlPointerEager;

  public List<ControlPointer> getOpSourceCastDataControlControlPointerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opSourceCastDataControlControlPointerEager == null) {
      opSourceCastDataControlControlPointerEager =
          new EagerList<ControlPointer>(
              org.tura.model.designer.repository.serialized.form.ControlPointer.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ControlPointer
                    opSourceCastDataControlControlPointer) {
              if (opSourceCastDataControlControlPointer == null) {
                return;
              }
              if (opSourceCastDataControlControlPointer != null
                  && (opSourceCastDataControlControlPointer.getAttached() == null
                      || !opSourceCastDataControlControlPointer.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opSourceCastDataControlControlPointer);
                  repository.insert(opSourceCastDataControlControlPointer, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.form.DataControl.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpSourceCastDataControlControlPointer(
                        DataControlProxy.this, opSourceCastDataControlControlPointer);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opSourceCastDataControlControlPointer);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ControlPointer opSourceCastDataControlControlPointer = (ControlPointer) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opSourceCastDataControlControlPointer);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpSourceCastDataControlControlPointer(
                          DataControlProxy.this, opSourceCastDataControlControlPointer);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ControlPointer remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpSourceCastDataControlControlPointer(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "b77b09c0-4bb1-4eca-861d-7260caaa15f0";
            }
          };
    }
    return opSourceCastDataControlControlPointerEager;
  }

  private LazyList<ControlPointer> opSourceCastDataControlControlPointerLazy;

  public List<ControlPointer> getOpSourceCastDataControlControlPointerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opSourceCastDataControlControlPointerLazy == null) {
      opSourceCastDataControlControlPointerLazy =
          new LazyList<ControlPointer>(
              org.tura.model.designer.repository.serialized.form.ControlPointer.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpSourceCastDataControlControlPointerDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ControlPointer
                    opSourceCastDataControlControlPointer) {
              if (opSourceCastDataControlControlPointer == null) {
                return;
              }
              getOpSourceCastDataControlControlPointerEager()
                  .add(i, opSourceCastDataControlControlPointer);
              super.add(i, opSourceCastDataControlControlPointer);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ControlPointer opSourceCastDataControlControlPointer = (ControlPointer) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opSourceCastDataControlControlPointer);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpSourceCastDataControlControlPointer(
                          DataControlProxy.this, opSourceCastDataControlControlPointer);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ControlPointer remove(int index) {
              super.remove(index);
              return getOpSourceCastDataControlControlPointerEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "b77b09c0-4bb1-4eca-861d-7260caaa15f0";
            }
          };
    }
    return opSourceCastDataControlControlPointerLazy;
  }

  public List<OptionSelection> getOpOptionPointerOptionSelection() {
    if (inMemory) {
      return getOpOptionPointerOptionSelectionEager();
    } else {
      return getOpOptionPointerOptionSelectionLazy();
    }
  }

  public void cleanOpOptionPointerOptionSelection() throws IOException {
    if (opOptionPointerOptionSelectionEager != null) {
      opOptionPointerOptionSelectionEager.close();
      opOptionPointerOptionSelectionEager = null;
    }
    if (opOptionPointerOptionSelectionLazy != null) {
      opOptionPointerOptionSelectionLazy.close();
      opOptionPointerOptionSelectionLazy = null;
    }
  }

  public static AddObjectOperation addOpOptionPointerOptionSelection(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.OptionSelection detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpOptionPointerOptionSelection");
    command.setDetailProperty("OptionPointer");
    return command;
  }

  public static RemoveObjectOperation rmOpOptionPointerOptionSelection(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.OptionSelection detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpOptionPointerOptionSelection");
    command.setDetailProperty("OptionPointer");
    return command;
  }

  private EagerList<OptionSelection> opOptionPointerOptionSelectionEager;

  public List<OptionSelection> getOpOptionPointerOptionSelectionEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opOptionPointerOptionSelectionEager == null) {
      opOptionPointerOptionSelectionEager =
          new EagerList<OptionSelection>(
              org.tura.model.designer.repository.serialized.form.OptionSelection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.OptionSelection
                    opOptionPointerOptionSelection) {
              if (opOptionPointerOptionSelection == null) {
                return;
              }
              if (opOptionPointerOptionSelection != null
                  && (opOptionPointerOptionSelection.getAttached() == null
                      || !opOptionPointerOptionSelection.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opOptionPointerOptionSelection);
                  repository.insert(opOptionPointerOptionSelection, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.form.DataControl.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpOptionPointerOptionSelection(
                        DataControlProxy.this, opOptionPointerOptionSelection);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opOptionPointerOptionSelection);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              OptionSelection opOptionPointerOptionSelection = (OptionSelection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opOptionPointerOptionSelection);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpOptionPointerOptionSelection(
                          DataControlProxy.this, opOptionPointerOptionSelection);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public OptionSelection remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpOptionPointerOptionSelection(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "88c25fc0-9bae-44fe-bf42-e0862b711394";
            }
          };
    }
    return opOptionPointerOptionSelectionEager;
  }

  private LazyList<OptionSelection> opOptionPointerOptionSelectionLazy;

  public List<OptionSelection> getOpOptionPointerOptionSelectionLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opOptionPointerOptionSelectionLazy == null) {
      opOptionPointerOptionSelectionLazy =
          new LazyList<OptionSelection>(
              org.tura.model.designer.repository.serialized.form.OptionSelection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpOptionPointerOptionSelectionDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.OptionSelection
                    opOptionPointerOptionSelection) {
              if (opOptionPointerOptionSelection == null) {
                return;
              }
              getOpOptionPointerOptionSelectionEager().add(i, opOptionPointerOptionSelection);
              super.add(i, opOptionPointerOptionSelection);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              OptionSelection opOptionPointerOptionSelection = (OptionSelection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opOptionPointerOptionSelection);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpOptionPointerOptionSelection(
                          DataControlProxy.this, opOptionPointerOptionSelection);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public OptionSelection remove(int index) {
              super.remove(index);
              return getOpOptionPointerOptionSelectionEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "88c25fc0-9bae-44fe-bf42-e0862b711394";
            }
          };
    }
    return opOptionPointerOptionSelectionLazy;
  }

  public List<OptionSelection> getOpOptionCastDataControlOptionSelection() {
    if (inMemory) {
      return getOpOptionCastDataControlOptionSelectionEager();
    } else {
      return getOpOptionCastDataControlOptionSelectionLazy();
    }
  }

  public void cleanOpOptionCastDataControlOptionSelection() throws IOException {
    if (opOptionCastDataControlOptionSelectionEager != null) {
      opOptionCastDataControlOptionSelectionEager.close();
      opOptionCastDataControlOptionSelectionEager = null;
    }
    if (opOptionCastDataControlOptionSelectionLazy != null) {
      opOptionCastDataControlOptionSelectionLazy.close();
      opOptionCastDataControlOptionSelectionLazy = null;
    }
  }

  public static AddObjectOperation addOpOptionCastDataControlOptionSelection(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.OptionSelection detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpOptionCastDataControlOptionSelection");
    command.setDetailProperty("OptionCastDataControl");
    return command;
  }

  public static RemoveObjectOperation rmOpOptionCastDataControlOptionSelection(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.OptionSelection detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpOptionCastDataControlOptionSelection");
    command.setDetailProperty("OptionCastDataControl");
    return command;
  }

  private EagerList<OptionSelection> opOptionCastDataControlOptionSelectionEager;

  public List<OptionSelection> getOpOptionCastDataControlOptionSelectionEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opOptionCastDataControlOptionSelectionEager == null) {
      opOptionCastDataControlOptionSelectionEager =
          new EagerList<OptionSelection>(
              org.tura.model.designer.repository.serialized.form.OptionSelection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.OptionSelection
                    opOptionCastDataControlOptionSelection) {
              if (opOptionCastDataControlOptionSelection == null) {
                return;
              }
              if (opOptionCastDataControlOptionSelection != null
                  && (opOptionCastDataControlOptionSelection.getAttached() == null
                      || !opOptionCastDataControlOptionSelection.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opOptionCastDataControlOptionSelection);
                  repository.insert(opOptionCastDataControlOptionSelection, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.form.DataControl.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpOptionCastDataControlOptionSelection(
                        DataControlProxy.this, opOptionCastDataControlOptionSelection);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opOptionCastDataControlOptionSelection);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              OptionSelection opOptionCastDataControlOptionSelection = (OptionSelection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opOptionCastDataControlOptionSelection);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpOptionCastDataControlOptionSelection(
                          DataControlProxy.this, opOptionCastDataControlOptionSelection);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public OptionSelection remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpOptionCastDataControlOptionSelection(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "fb051eb2-71e5-4252-9e35-b93c2376e263";
            }
          };
    }
    return opOptionCastDataControlOptionSelectionEager;
  }

  private LazyList<OptionSelection> opOptionCastDataControlOptionSelectionLazy;

  public List<OptionSelection> getOpOptionCastDataControlOptionSelectionLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opOptionCastDataControlOptionSelectionLazy == null) {
      opOptionCastDataControlOptionSelectionLazy =
          new LazyList<OptionSelection>(
              org.tura.model.designer.repository.serialized.form.OptionSelection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpOptionCastDataControlOptionSelectionDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.OptionSelection
                    opOptionCastDataControlOptionSelection) {
              if (opOptionCastDataControlOptionSelection == null) {
                return;
              }
              getOpOptionCastDataControlOptionSelectionEager()
                  .add(i, opOptionCastDataControlOptionSelection);
              super.add(i, opOptionCastDataControlOptionSelection);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              OptionSelection opOptionCastDataControlOptionSelection = (OptionSelection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opOptionCastDataControlOptionSelection);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpOptionCastDataControlOptionSelection(
                          DataControlProxy.this, opOptionCastDataControlOptionSelection);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public OptionSelection remove(int index) {
              super.remove(index);
              return getOpOptionCastDataControlOptionSelectionEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "fb051eb2-71e5-4252-9e35-b93c2376e263";
            }
          };
    }
    return opOptionCastDataControlOptionSelectionLazy;
  }

  public void setBaseType(
      org.tura.model.designer.repository.serialized.type.TypePointerObj baseType) {
    this.setBaseTypeEager(baseType);
  }

  public TypePointerObj getBaseType() {
    if (inMemory) {
      return this.getBaseTypeEager();
    } else {
      return this.getBaseTypeLazy();
    }
  }

  public void cleanBaseType() throws IOException {
    if (baseTypeLazySingleObject != null) {
      baseTypeLazySingleObject.close();
      baseTypeLazySingleObject = null;
    }
    if (baseTypeEagerSingleObject != null) {
      baseTypeEagerSingleObject.close();
      baseTypeEagerSingleObject = null;
    }
  }

  private EagerSingleObject<TypePointerObj> baseTypeEagerSingleObject;

  public static RemoveContainmentObjectOperation rmBaseType(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.type.TypePointerObj detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("BaseType");
    command.setDetailProperty("OpBaseTypeDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addBaseType(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.type.TypePointerObj detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("BaseType");
    command.setDetailProperty("OpBaseTypeDataControl");
    return command;
  }

  public TypePointerObj getBaseTypeEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (baseTypeEagerSingleObject == null) {
      baseTypeEagerSingleObject =
          new EagerSingleObject<TypePointerObj>(
              org.tura.model.designer.repository.serialized.type.TypePointerObj.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return baseTypeEagerSingleObject.get(this.getCpaPath(), "e85eb79e-92a9-4091-b176-bbc668aec8dd");
  }

  private void setBaseTypeEager(
      org.tura.model.designer.repository.serialized.type.TypePointerObj baseType) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (baseType != null) {
        saveAttached = ((ObjectControl) baseType).getAttached();
        ((ObjectControl) baseType).setAttached(this.getAttached());
      }
      if (this.getBaseTypeEager() != null) {
        RemoveContainmentObjectOperation command = rmBaseType(this, this.getBaseTypeEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (baseType != null) {
        AddContainmentObjectOperation command2 = addBaseType(this, baseType);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (baseType != null) {
        ((ObjectControl) baseType).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<TypePointerObj> baseTypeLazySingleObject;

  private TypePointerObj getBaseTypeLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (baseTypeLazySingleObject == null) {
      baseTypeLazySingleObject =
          new LazySingleObject<TypePointerObj>(
              org.tura.model.designer.repository.serialized.type.TypePointerObj.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refBaseTypeDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return baseTypeLazySingleObject.get(this.getCpaPath(), "e85eb79e-92a9-4091-b176-bbc668aec8dd");
  }

  public void setPreQueryTrigger(
      org.tura.model.designer.repository.serialized.form.PREQueryTrigger preQueryTrigger) {
    this.setPreQueryTriggerEager(preQueryTrigger);
  }

  public PREQueryTrigger getPreQueryTrigger() {
    if (inMemory) {
      return this.getPreQueryTriggerEager();
    } else {
      return this.getPreQueryTriggerLazy();
    }
  }

  public void cleanPreQueryTrigger() throws IOException {
    if (preQueryTriggerLazySingleObject != null) {
      preQueryTriggerLazySingleObject.close();
      preQueryTriggerLazySingleObject = null;
    }
    if (preQueryTriggerEagerSingleObject != null) {
      preQueryTriggerEagerSingleObject.close();
      preQueryTriggerEagerSingleObject = null;
    }
  }

  private EagerSingleObject<PREQueryTrigger> preQueryTriggerEagerSingleObject;

  public static RemoveContainmentObjectOperation rmPreQueryTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.PREQueryTrigger detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("PreQueryTrigger");
    command.setDetailProperty("OpPreQueryTriggerDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addPreQueryTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.PREQueryTrigger detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("PreQueryTrigger");
    command.setDetailProperty("OpPreQueryTriggerDataControl");
    return command;
  }

  public PREQueryTrigger getPreQueryTriggerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (preQueryTriggerEagerSingleObject == null) {
      preQueryTriggerEagerSingleObject =
          new EagerSingleObject<PREQueryTrigger>(
              org.tura.model.designer.repository.serialized.form.PREQueryTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return preQueryTriggerEagerSingleObject.get(
        this.getCpaPath(), "f34a8aeb-6ad2-4f67-83fa-77f9aab0568a");
  }

  private void setPreQueryTriggerEager(
      org.tura.model.designer.repository.serialized.form.PREQueryTrigger preQueryTrigger) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (preQueryTrigger != null) {
        saveAttached = ((ObjectControl) preQueryTrigger).getAttached();
        ((ObjectControl) preQueryTrigger).setAttached(this.getAttached());
      }
      if (this.getPreQueryTriggerEager() != null) {
        RemoveContainmentObjectOperation command =
            rmPreQueryTrigger(this, this.getPreQueryTriggerEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (preQueryTrigger != null) {
        AddContainmentObjectOperation command2 = addPreQueryTrigger(this, preQueryTrigger);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (preQueryTrigger != null) {
        ((ObjectControl) preQueryTrigger).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<PREQueryTrigger> preQueryTriggerLazySingleObject;

  private PREQueryTrigger getPreQueryTriggerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (preQueryTriggerLazySingleObject == null) {
      preQueryTriggerLazySingleObject =
          new LazySingleObject<PREQueryTrigger>(
              org.tura.model.designer.repository.serialized.form.PREQueryTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refPreQueryTriggerDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return preQueryTriggerLazySingleObject.get(
        this.getCpaPath(), "f34a8aeb-6ad2-4f67-83fa-77f9aab0568a");
  }

  public void setPostQueryTrigger(
      org.tura.model.designer.repository.serialized.form.POSTQueryTrigger postQueryTrigger) {
    this.setPostQueryTriggerEager(postQueryTrigger);
  }

  public POSTQueryTrigger getPostQueryTrigger() {
    if (inMemory) {
      return this.getPostQueryTriggerEager();
    } else {
      return this.getPostQueryTriggerLazy();
    }
  }

  public void cleanPostQueryTrigger() throws IOException {
    if (postQueryTriggerLazySingleObject != null) {
      postQueryTriggerLazySingleObject.close();
      postQueryTriggerLazySingleObject = null;
    }
    if (postQueryTriggerEagerSingleObject != null) {
      postQueryTriggerEagerSingleObject.close();
      postQueryTriggerEagerSingleObject = null;
    }
  }

  private EagerSingleObject<POSTQueryTrigger> postQueryTriggerEagerSingleObject;

  public static RemoveContainmentObjectOperation rmPostQueryTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.POSTQueryTrigger detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("PostQueryTrigger");
    command.setDetailProperty("OpPostQueryTriggerDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addPostQueryTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.POSTQueryTrigger detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("PostQueryTrigger");
    command.setDetailProperty("OpPostQueryTriggerDataControl");
    return command;
  }

  public POSTQueryTrigger getPostQueryTriggerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (postQueryTriggerEagerSingleObject == null) {
      postQueryTriggerEagerSingleObject =
          new EagerSingleObject<POSTQueryTrigger>(
              org.tura.model.designer.repository.serialized.form.POSTQueryTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return postQueryTriggerEagerSingleObject.get(
        this.getCpaPath(), "92a22823-dcb9-4e14-9fa5-94130554434d");
  }

  private void setPostQueryTriggerEager(
      org.tura.model.designer.repository.serialized.form.POSTQueryTrigger postQueryTrigger) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (postQueryTrigger != null) {
        saveAttached = ((ObjectControl) postQueryTrigger).getAttached();
        ((ObjectControl) postQueryTrigger).setAttached(this.getAttached());
      }
      if (this.getPostQueryTriggerEager() != null) {
        RemoveContainmentObjectOperation command =
            rmPostQueryTrigger(this, this.getPostQueryTriggerEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (postQueryTrigger != null) {
        AddContainmentObjectOperation command2 = addPostQueryTrigger(this, postQueryTrigger);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (postQueryTrigger != null) {
        ((ObjectControl) postQueryTrigger).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<POSTQueryTrigger> postQueryTriggerLazySingleObject;

  private POSTQueryTrigger getPostQueryTriggerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (postQueryTriggerLazySingleObject == null) {
      postQueryTriggerLazySingleObject =
          new LazySingleObject<POSTQueryTrigger>(
              org.tura.model.designer.repository.serialized.form.POSTQueryTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refPostQueryTriggerDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return postQueryTriggerLazySingleObject.get(
        this.getCpaPath(), "92a22823-dcb9-4e14-9fa5-94130554434d");
  }

  public void setPreInsertTrigger(
      org.tura.model.designer.repository.serialized.form.PREInsertTrigger preInsertTrigger) {
    this.setPreInsertTriggerEager(preInsertTrigger);
  }

  public PREInsertTrigger getPreInsertTrigger() {
    if (inMemory) {
      return this.getPreInsertTriggerEager();
    } else {
      return this.getPreInsertTriggerLazy();
    }
  }

  public void cleanPreInsertTrigger() throws IOException {
    if (preInsertTriggerLazySingleObject != null) {
      preInsertTriggerLazySingleObject.close();
      preInsertTriggerLazySingleObject = null;
    }
    if (preInsertTriggerEagerSingleObject != null) {
      preInsertTriggerEagerSingleObject.close();
      preInsertTriggerEagerSingleObject = null;
    }
  }

  private EagerSingleObject<PREInsertTrigger> preInsertTriggerEagerSingleObject;

  public static RemoveContainmentObjectOperation rmPreInsertTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.PREInsertTrigger detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("PreInsertTrigger");
    command.setDetailProperty("OpPreInsertTriggerDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addPreInsertTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.PREInsertTrigger detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("PreInsertTrigger");
    command.setDetailProperty("OpPreInsertTriggerDataControl");
    return command;
  }

  public PREInsertTrigger getPreInsertTriggerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (preInsertTriggerEagerSingleObject == null) {
      preInsertTriggerEagerSingleObject =
          new EagerSingleObject<PREInsertTrigger>(
              org.tura.model.designer.repository.serialized.form.PREInsertTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return preInsertTriggerEagerSingleObject.get(
        this.getCpaPath(), "b8ed35ca-93d3-4346-8046-96f635ebfc3c");
  }

  private void setPreInsertTriggerEager(
      org.tura.model.designer.repository.serialized.form.PREInsertTrigger preInsertTrigger) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (preInsertTrigger != null) {
        saveAttached = ((ObjectControl) preInsertTrigger).getAttached();
        ((ObjectControl) preInsertTrigger).setAttached(this.getAttached());
      }
      if (this.getPreInsertTriggerEager() != null) {
        RemoveContainmentObjectOperation command =
            rmPreInsertTrigger(this, this.getPreInsertTriggerEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (preInsertTrigger != null) {
        AddContainmentObjectOperation command2 = addPreInsertTrigger(this, preInsertTrigger);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (preInsertTrigger != null) {
        ((ObjectControl) preInsertTrigger).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<PREInsertTrigger> preInsertTriggerLazySingleObject;

  private PREInsertTrigger getPreInsertTriggerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (preInsertTriggerLazySingleObject == null) {
      preInsertTriggerLazySingleObject =
          new LazySingleObject<PREInsertTrigger>(
              org.tura.model.designer.repository.serialized.form.PREInsertTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refPreInsertTriggerDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return preInsertTriggerLazySingleObject.get(
        this.getCpaPath(), "b8ed35ca-93d3-4346-8046-96f635ebfc3c");
  }

  public void setPreDeleteTrigger(
      org.tura.model.designer.repository.serialized.form.PREDeleteTrigger preDeleteTrigger) {
    this.setPreDeleteTriggerEager(preDeleteTrigger);
  }

  public PREDeleteTrigger getPreDeleteTrigger() {
    if (inMemory) {
      return this.getPreDeleteTriggerEager();
    } else {
      return this.getPreDeleteTriggerLazy();
    }
  }

  public void cleanPreDeleteTrigger() throws IOException {
    if (preDeleteTriggerLazySingleObject != null) {
      preDeleteTriggerLazySingleObject.close();
      preDeleteTriggerLazySingleObject = null;
    }
    if (preDeleteTriggerEagerSingleObject != null) {
      preDeleteTriggerEagerSingleObject.close();
      preDeleteTriggerEagerSingleObject = null;
    }
  }

  private EagerSingleObject<PREDeleteTrigger> preDeleteTriggerEagerSingleObject;

  public static RemoveContainmentObjectOperation rmPreDeleteTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.PREDeleteTrigger detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("PreDeleteTrigger");
    command.setDetailProperty("OpPreDeleteTriggerDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addPreDeleteTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.PREDeleteTrigger detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("PreDeleteTrigger");
    command.setDetailProperty("OpPreDeleteTriggerDataControl");
    return command;
  }

  public PREDeleteTrigger getPreDeleteTriggerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (preDeleteTriggerEagerSingleObject == null) {
      preDeleteTriggerEagerSingleObject =
          new EagerSingleObject<PREDeleteTrigger>(
              org.tura.model.designer.repository.serialized.form.PREDeleteTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return preDeleteTriggerEagerSingleObject.get(
        this.getCpaPath(), "8b41511f-3479-49e0-a224-0957363a8210");
  }

  private void setPreDeleteTriggerEager(
      org.tura.model.designer.repository.serialized.form.PREDeleteTrigger preDeleteTrigger) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (preDeleteTrigger != null) {
        saveAttached = ((ObjectControl) preDeleteTrigger).getAttached();
        ((ObjectControl) preDeleteTrigger).setAttached(this.getAttached());
      }
      if (this.getPreDeleteTriggerEager() != null) {
        RemoveContainmentObjectOperation command =
            rmPreDeleteTrigger(this, this.getPreDeleteTriggerEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (preDeleteTrigger != null) {
        AddContainmentObjectOperation command2 = addPreDeleteTrigger(this, preDeleteTrigger);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (preDeleteTrigger != null) {
        ((ObjectControl) preDeleteTrigger).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<PREDeleteTrigger> preDeleteTriggerLazySingleObject;

  private PREDeleteTrigger getPreDeleteTriggerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (preDeleteTriggerLazySingleObject == null) {
      preDeleteTriggerLazySingleObject =
          new LazySingleObject<PREDeleteTrigger>(
              org.tura.model.designer.repository.serialized.form.PREDeleteTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refPreDeleteTriggerDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return preDeleteTriggerLazySingleObject.get(
        this.getCpaPath(), "8b41511f-3479-49e0-a224-0957363a8210");
  }

  public void setPostCreateTrigger(
      org.tura.model.designer.repository.serialized.form.POSTCreateTrigger postCreateTrigger) {
    this.setPostCreateTriggerEager(postCreateTrigger);
  }

  public POSTCreateTrigger getPostCreateTrigger() {
    if (inMemory) {
      return this.getPostCreateTriggerEager();
    } else {
      return this.getPostCreateTriggerLazy();
    }
  }

  public void cleanPostCreateTrigger() throws IOException {
    if (postCreateTriggerLazySingleObject != null) {
      postCreateTriggerLazySingleObject.close();
      postCreateTriggerLazySingleObject = null;
    }
    if (postCreateTriggerEagerSingleObject != null) {
      postCreateTriggerEagerSingleObject.close();
      postCreateTriggerEagerSingleObject = null;
    }
  }

  private EagerSingleObject<POSTCreateTrigger> postCreateTriggerEagerSingleObject;

  public static RemoveContainmentObjectOperation rmPostCreateTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.POSTCreateTrigger detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("PostCreateTrigger");
    command.setDetailProperty("OpPostCreateTriggerDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addPostCreateTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.POSTCreateTrigger detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("PostCreateTrigger");
    command.setDetailProperty("OpPostCreateTriggerDataControl");
    return command;
  }

  public POSTCreateTrigger getPostCreateTriggerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (postCreateTriggerEagerSingleObject == null) {
      postCreateTriggerEagerSingleObject =
          new EagerSingleObject<POSTCreateTrigger>(
              org.tura.model.designer.repository.serialized.form.POSTCreateTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return postCreateTriggerEagerSingleObject.get(
        this.getCpaPath(), "09fb397d-1372-4c5a-b71f-089cfcc07fb2");
  }

  private void setPostCreateTriggerEager(
      org.tura.model.designer.repository.serialized.form.POSTCreateTrigger postCreateTrigger) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (postCreateTrigger != null) {
        saveAttached = ((ObjectControl) postCreateTrigger).getAttached();
        ((ObjectControl) postCreateTrigger).setAttached(this.getAttached());
      }
      if (this.getPostCreateTriggerEager() != null) {
        RemoveContainmentObjectOperation command =
            rmPostCreateTrigger(this, this.getPostCreateTriggerEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (postCreateTrigger != null) {
        AddContainmentObjectOperation command2 = addPostCreateTrigger(this, postCreateTrigger);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (postCreateTrigger != null) {
        ((ObjectControl) postCreateTrigger).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<POSTCreateTrigger> postCreateTriggerLazySingleObject;

  private POSTCreateTrigger getPostCreateTriggerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (postCreateTriggerLazySingleObject == null) {
      postCreateTriggerLazySingleObject =
          new LazySingleObject<POSTCreateTrigger>(
              org.tura.model.designer.repository.serialized.form.POSTCreateTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refPostCreateTriggerDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return postCreateTriggerLazySingleObject.get(
        this.getCpaPath(), "09fb397d-1372-4c5a-b71f-089cfcc07fb2");
  }

  public void setPreUpdateTrigger(
      org.tura.model.designer.repository.serialized.form.PREUpdateTrigger preUpdateTrigger) {
    this.setPreUpdateTriggerEager(preUpdateTrigger);
  }

  public PREUpdateTrigger getPreUpdateTrigger() {
    if (inMemory) {
      return this.getPreUpdateTriggerEager();
    } else {
      return this.getPreUpdateTriggerLazy();
    }
  }

  public void cleanPreUpdateTrigger() throws IOException {
    if (preUpdateTriggerLazySingleObject != null) {
      preUpdateTriggerLazySingleObject.close();
      preUpdateTriggerLazySingleObject = null;
    }
    if (preUpdateTriggerEagerSingleObject != null) {
      preUpdateTriggerEagerSingleObject.close();
      preUpdateTriggerEagerSingleObject = null;
    }
  }

  private EagerSingleObject<PREUpdateTrigger> preUpdateTriggerEagerSingleObject;

  public static RemoveContainmentObjectOperation rmPreUpdateTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.PREUpdateTrigger detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("PreUpdateTrigger");
    command.setDetailProperty("OpPreUpdateTriggerDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addPreUpdateTrigger(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.PREUpdateTrigger detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("PreUpdateTrigger");
    command.setDetailProperty("OpPreUpdateTriggerDataControl");
    return command;
  }

  public PREUpdateTrigger getPreUpdateTriggerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (preUpdateTriggerEagerSingleObject == null) {
      preUpdateTriggerEagerSingleObject =
          new EagerSingleObject<PREUpdateTrigger>(
              org.tura.model.designer.repository.serialized.form.PREUpdateTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return preUpdateTriggerEagerSingleObject.get(
        this.getCpaPath(), "b2fa10a6-cbc3-445e-b61d-c2903055f1a1");
  }

  private void setPreUpdateTriggerEager(
      org.tura.model.designer.repository.serialized.form.PREUpdateTrigger preUpdateTrigger) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (preUpdateTrigger != null) {
        saveAttached = ((ObjectControl) preUpdateTrigger).getAttached();
        ((ObjectControl) preUpdateTrigger).setAttached(this.getAttached());
      }
      if (this.getPreUpdateTriggerEager() != null) {
        RemoveContainmentObjectOperation command =
            rmPreUpdateTrigger(this, this.getPreUpdateTriggerEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (preUpdateTrigger != null) {
        AddContainmentObjectOperation command2 = addPreUpdateTrigger(this, preUpdateTrigger);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (preUpdateTrigger != null) {
        ((ObjectControl) preUpdateTrigger).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<PREUpdateTrigger> preUpdateTriggerLazySingleObject;

  private PREUpdateTrigger getPreUpdateTriggerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (preUpdateTriggerLazySingleObject == null) {
      preUpdateTriggerLazySingleObject =
          new LazySingleObject<PREUpdateTrigger>(
              org.tura.model.designer.repository.serialized.form.PREUpdateTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refPreUpdateTriggerDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return preUpdateTriggerLazySingleObject.get(
        this.getCpaPath(), "b2fa10a6-cbc3-445e-b61d-c2903055f1a1");
  }

  public void setCreate(org.tura.model.designer.repository.serialized.form.CreateTrigger create) {
    this.setCreateEager(create);
  }

  public CreateTrigger getCreate() {
    if (inMemory) {
      return this.getCreateEager();
    } else {
      return this.getCreateLazy();
    }
  }

  public void cleanCreate() throws IOException {
    if (createLazySingleObject != null) {
      createLazySingleObject.close();
      createLazySingleObject = null;
    }
    if (createEagerSingleObject != null) {
      createEagerSingleObject.close();
      createEagerSingleObject = null;
    }
  }

  private EagerSingleObject<CreateTrigger> createEagerSingleObject;

  public static RemoveContainmentObjectOperation rmCreate(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.CreateTrigger detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("Create");
    command.setDetailProperty("OpCreateDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addCreate(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.CreateTrigger detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("Create");
    command.setDetailProperty("OpCreateDataControl");
    return command;
  }

  public CreateTrigger getCreateEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (createEagerSingleObject == null) {
      createEagerSingleObject =
          new EagerSingleObject<CreateTrigger>(
              org.tura.model.designer.repository.serialized.form.CreateTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return createEagerSingleObject.get(this.getCpaPath(), "ca65e1b6-c18f-4424-9120-cfdbf225644e");
  }

  private void setCreateEager(
      org.tura.model.designer.repository.serialized.form.CreateTrigger create) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (create != null) {
        saveAttached = ((ObjectControl) create).getAttached();
        ((ObjectControl) create).setAttached(this.getAttached());
      }
      if (this.getCreateEager() != null) {
        RemoveContainmentObjectOperation command = rmCreate(this, this.getCreateEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (create != null) {
        AddContainmentObjectOperation command2 = addCreate(this, create);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (create != null) {
        ((ObjectControl) create).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<CreateTrigger> createLazySingleObject;

  private CreateTrigger getCreateLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (createLazySingleObject == null) {
      createLazySingleObject =
          new LazySingleObject<CreateTrigger>(
              org.tura.model.designer.repository.serialized.form.CreateTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refCreateDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return createLazySingleObject.get(this.getCpaPath(), "ca65e1b6-c18f-4424-9120-cfdbf225644e");
  }

  public void setSearch(org.tura.model.designer.repository.serialized.form.SearchTrigger search) {
    this.setSearchEager(search);
  }

  public SearchTrigger getSearch() {
    if (inMemory) {
      return this.getSearchEager();
    } else {
      return this.getSearchLazy();
    }
  }

  public void cleanSearch() throws IOException {
    if (searchLazySingleObject != null) {
      searchLazySingleObject.close();
      searchLazySingleObject = null;
    }
    if (searchEagerSingleObject != null) {
      searchEagerSingleObject.close();
      searchEagerSingleObject = null;
    }
  }

  private EagerSingleObject<SearchTrigger> searchEagerSingleObject;

  public static RemoveContainmentObjectOperation rmSearch(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.SearchTrigger detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("Search");
    command.setDetailProperty("OpSearchDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addSearch(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.SearchTrigger detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("Search");
    command.setDetailProperty("OpSearchDataControl");
    return command;
  }

  public SearchTrigger getSearchEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (searchEagerSingleObject == null) {
      searchEagerSingleObject =
          new EagerSingleObject<SearchTrigger>(
              org.tura.model.designer.repository.serialized.form.SearchTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return searchEagerSingleObject.get(this.getCpaPath(), "188a51c6-1310-42d2-a09b-d25a5e3364aa");
  }

  private void setSearchEager(
      org.tura.model.designer.repository.serialized.form.SearchTrigger search) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (search != null) {
        saveAttached = ((ObjectControl) search).getAttached();
        ((ObjectControl) search).setAttached(this.getAttached());
      }
      if (this.getSearchEager() != null) {
        RemoveContainmentObjectOperation command = rmSearch(this, this.getSearchEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (search != null) {
        AddContainmentObjectOperation command2 = addSearch(this, search);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (search != null) {
        ((ObjectControl) search).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<SearchTrigger> searchLazySingleObject;

  private SearchTrigger getSearchLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (searchLazySingleObject == null) {
      searchLazySingleObject =
          new LazySingleObject<SearchTrigger>(
              org.tura.model.designer.repository.serialized.form.SearchTrigger.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refSearchDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return searchLazySingleObject.get(this.getCpaPath(), "188a51c6-1310-42d2-a09b-d25a5e3364aa");
  }

  public List<ArtificialField> getArtificialFields() {
    if (inMemory) {
      return getArtificialFieldsEager();
    } else {
      return getArtificialFieldsLazy();
    }
  }

  public void cleanArtificialFields() throws IOException {
    if (artificialFieldsEager != null) {
      artificialFieldsEager.close();
      artificialFieldsEager = null;
    }
    if (artificialFieldsLazy != null) {
      artificialFieldsLazy.close();
      artificialFieldsLazy = null;
    }
  }

  public static AddContainmentObjectOperation addArtificialFields(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.ArtificialField detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("ArtificialFields");
    command.setDetailProperty("OpArtificialFieldsDataControl");
    return command;
  }

  public static RemoveContainmentObjectOperation rmArtificialFields(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.ArtificialField detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("ArtificialFields");
    command.setDetailProperty("OpArtificialFieldsDataControl");
    return command;
  }

  private EagerList<ArtificialField> artificialFieldsEager;

  public List<ArtificialField> getArtificialFieldsEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (artificialFieldsEager == null) {
      artificialFieldsEager =
          new EagerList<ArtificialField>(
              org.tura.model.designer.repository.serialized.form.ArtificialField.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ArtificialField
                    artificialFields) {
              if (artificialFields == null) {
                return;
              }
              Boolean saveAttached = false;
              if (artificialFields != null) {
                saveAttached = ((ObjectControl) artificialFields).getAttached();
                ((ObjectControl) artificialFields).setAttached(getAttached());
                ;
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddContainmentObjectOperation command =
                    addArtificialFields(DataControlProxy.this, artificialFields);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, artificialFields);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                if (artificialFields != null) {
                  ((ObjectControl) artificialFields).setAttached(saveAttached);
                }
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ArtificialField artificialFields = (ArtificialField) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(artificialFields);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveContainmentObjectOperation command =
                      rmArtificialFields(DataControlProxy.this, artificialFields);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ArtificialField remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveContainmentObjectOperation command =
                    rmArtificialFields(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "a585d946-8d9d-4596-ad86-a55e6834809f";
            }
          };
    }
    return artificialFieldsEager;
  }

  private LazyList<ArtificialField> artificialFieldsLazy;

  public List<ArtificialField> getArtificialFieldsLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (artificialFieldsLazy == null) {
      artificialFieldsLazy =
          new LazyList<ArtificialField>(
              org.tura.model.designer.repository.serialized.form.ArtificialField.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refArtificialFieldsDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ArtificialField
                    artificialFields) {
              if (artificialFields == null) {
                return;
              }
              getArtificialFieldsEager().add(i, artificialFields);
              super.add(i, artificialFields);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ArtificialField artificialFields = (ArtificialField) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(artificialFields);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveContainmentObjectOperation command =
                      rmArtificialFields(DataControlProxy.this, artificialFields);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ArtificialField remove(int index) {
              super.remove(index);
              return getArtificialFieldsEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "a585d946-8d9d-4596-ad86-a55e6834809f";
            }
          };
    }
    return artificialFieldsLazy;
  }

  public void setDefaultSearch(
      org.tura.model.designer.repository.serialized.form.ContextParametersObj defaultSearch) {
    this.setDefaultSearchEager(defaultSearch);
  }

  public ContextParametersObj getDefaultSearch() {
    if (inMemory) {
      return this.getDefaultSearchEager();
    } else {
      return this.getDefaultSearchLazy();
    }
  }

  public void cleanDefaultSearch() throws IOException {
    if (defaultSearchLazySingleObject != null) {
      defaultSearchLazySingleObject.close();
      defaultSearchLazySingleObject = null;
    }
    if (defaultSearchEagerSingleObject != null) {
      defaultSearchEagerSingleObject.close();
      defaultSearchEagerSingleObject = null;
    }
  }

  private EagerSingleObject<ContextParametersObj> defaultSearchEagerSingleObject;

  public static RemoveContainmentObjectOperation rmDefaultSearch(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.ContextParametersObj detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("DefaultSearch");
    command.setDetailProperty("OpDefaultSearchDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addDefaultSearch(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.ContextParametersObj detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("DefaultSearch");
    command.setDetailProperty("OpDefaultSearchDataControl");
    return command;
  }

  public ContextParametersObj getDefaultSearchEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (defaultSearchEagerSingleObject == null) {
      defaultSearchEagerSingleObject =
          new EagerSingleObject<ContextParametersObj>(
              org.tura.model.designer.repository.serialized.form.ContextParametersObj.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return defaultSearchEagerSingleObject.get(
        this.getCpaPath(), "72df119b-33cc-401d-9d82-9ce7410e804a");
  }

  private void setDefaultSearchEager(
      org.tura.model.designer.repository.serialized.form.ContextParametersObj defaultSearch) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (defaultSearch != null) {
        saveAttached = ((ObjectControl) defaultSearch).getAttached();
        ((ObjectControl) defaultSearch).setAttached(this.getAttached());
      }
      if (this.getDefaultSearchEager() != null) {
        RemoveContainmentObjectOperation command =
            rmDefaultSearch(this, this.getDefaultSearchEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (defaultSearch != null) {
        AddContainmentObjectOperation command2 = addDefaultSearch(this, defaultSearch);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (defaultSearch != null) {
        ((ObjectControl) defaultSearch).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<ContextParametersObj> defaultSearchLazySingleObject;

  private ContextParametersObj getDefaultSearchLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (defaultSearchLazySingleObject == null) {
      defaultSearchLazySingleObject =
          new LazySingleObject<ContextParametersObj>(
              org.tura.model.designer.repository.serialized.form.ContextParametersObj.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refDefaultSearchDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return defaultSearchLazySingleObject.get(
        this.getCpaPath(), "72df119b-33cc-401d-9d82-9ce7410e804a");
  }

  public void setDefaultOrderBy(
      org.tura.model.designer.repository.serialized.form.Orders defaultOrderBy) {
    this.setDefaultOrderByEager(defaultOrderBy);
  }

  public Orders getDefaultOrderBy() {
    if (inMemory) {
      return this.getDefaultOrderByEager();
    } else {
      return this.getDefaultOrderByLazy();
    }
  }

  public void cleanDefaultOrderBy() throws IOException {
    if (defaultOrderByLazySingleObject != null) {
      defaultOrderByLazySingleObject.close();
      defaultOrderByLazySingleObject = null;
    }
    if (defaultOrderByEagerSingleObject != null) {
      defaultOrderByEagerSingleObject.close();
      defaultOrderByEagerSingleObject = null;
    }
  }

  private EagerSingleObject<Orders> defaultOrderByEagerSingleObject;

  public static RemoveContainmentObjectOperation rmDefaultOrderBy(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.Orders detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("DefaultOrderBy");
    command.setDetailProperty("OpDefaultOrderByDataControl");
    return command;
  }

  public static AddContainmentObjectOperation addDefaultOrderBy(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.Orders detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("DefaultOrderBy");
    command.setDetailProperty("OpDefaultOrderByDataControl");
    return command;
  }

  public Orders getDefaultOrderByEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (defaultOrderByEagerSingleObject == null) {
      defaultOrderByEagerSingleObject =
          new EagerSingleObject<Orders>(
              org.tura.model.designer.repository.serialized.form.Orders.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return defaultOrderByEagerSingleObject.get(
        this.getCpaPath(), "c9035c7b-d53a-4bf5-aaa8-149dd5a44f26");
  }

  private void setDefaultOrderByEager(
      org.tura.model.designer.repository.serialized.form.Orders defaultOrderBy) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (defaultOrderBy != null) {
        saveAttached = ((ObjectControl) defaultOrderBy).getAttached();
        ((ObjectControl) defaultOrderBy).setAttached(this.getAttached());
      }
      if (this.getDefaultOrderByEager() != null) {
        RemoveContainmentObjectOperation command =
            rmDefaultOrderBy(this, this.getDefaultOrderByEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (defaultOrderBy != null) {
        AddContainmentObjectOperation command2 = addDefaultOrderBy(this, defaultOrderBy);
        command2.setStackProvider(localStackProvider);
        command2.prepare();
      }
      List<Object> changes = localStackProvider.get().getListOfCommand();
      if (changes.size() != 0) {
        localStackProvider.get().commit();
        if (this.getAttached() != null && this.getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
      }
    } catch (Exception e) {
      if (defaultOrderBy != null) {
        ((ObjectControl) defaultOrderBy).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<Orders> defaultOrderByLazySingleObject;

  private Orders getDefaultOrderByLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (defaultOrderByLazySingleObject == null) {
      defaultOrderByLazySingleObject =
          new LazySingleObject<Orders>(
              org.tura.model.designer.repository.serialized.form.Orders.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refDefaultOrderByDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return defaultOrderByLazySingleObject.get(
        this.getCpaPath(), "c9035c7b-d53a-4bf5-aaa8-149dd5a44f26");
  }

  public List<RelationMapper> getRelationMappers() {
    if (inMemory) {
      return getRelationMappersEager();
    } else {
      return getRelationMappersLazy();
    }
  }

  public void cleanRelationMappers() throws IOException {
    if (relationMappersEager != null) {
      relationMappersEager.close();
      relationMappersEager = null;
    }
    if (relationMappersLazy != null) {
      relationMappersLazy.close();
      relationMappersLazy = null;
    }
  }

  public static AddContainmentObjectOperation addRelationMappers(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.RelationMapper detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("RelationMappers");
    command.setDetailProperty("OpRelationMappersDataControl");
    return command;
  }

  public static RemoveContainmentObjectOperation rmRelationMappers(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.RelationMapper detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("RelationMappers");
    command.setDetailProperty("OpRelationMappersDataControl");
    return command;
  }

  private EagerList<RelationMapper> relationMappersEager;

  public List<RelationMapper> getRelationMappersEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (relationMappersEager == null) {
      relationMappersEager =
          new EagerList<RelationMapper>(
              org.tura.model.designer.repository.serialized.form.RelationMapper.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.RelationMapper relationMappers) {
              if (relationMappers == null) {
                return;
              }
              Boolean saveAttached = false;
              if (relationMappers != null) {
                saveAttached = ((ObjectControl) relationMappers).getAttached();
                ((ObjectControl) relationMappers).setAttached(getAttached());
                ;
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddContainmentObjectOperation command =
                    addRelationMappers(DataControlProxy.this, relationMappers);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, relationMappers);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                if (relationMappers != null) {
                  ((ObjectControl) relationMappers).setAttached(saveAttached);
                }
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              RelationMapper relationMappers = (RelationMapper) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(relationMappers);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveContainmentObjectOperation command =
                      rmRelationMappers(DataControlProxy.this, relationMappers);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public RelationMapper remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveContainmentObjectOperation command =
                    rmRelationMappers(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "9bca65be-1a74-4522-a0dd-92615c29641c";
            }
          };
    }
    return relationMappersEager;
  }

  private LazyList<RelationMapper> relationMappersLazy;

  public List<RelationMapper> getRelationMappersLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (relationMappersLazy == null) {
      relationMappersLazy =
          new LazyList<RelationMapper>(
              org.tura.model.designer.repository.serialized.form.RelationMapper.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refRelationMappersDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.RelationMapper relationMappers) {
              if (relationMappers == null) {
                return;
              }
              getRelationMappersEager().add(i, relationMappers);
              super.add(i, relationMappers);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              RelationMapper relationMappers = (RelationMapper) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(relationMappers);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveContainmentObjectOperation command =
                      rmRelationMappers(DataControlProxy.this, relationMappers);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public RelationMapper remove(int index) {
              super.remove(index);
              return getRelationMappersEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "9bca65be-1a74-4522-a0dd-92615c29641c";
            }
          };
    }
    return relationMappersLazy;
  }

  public List<RelationMapper> getOpDataControlRefRelationMapper() {
    if (inMemory) {
      return getOpDataControlRefRelationMapperEager();
    } else {
      return getOpDataControlRefRelationMapperLazy();
    }
  }

  public void cleanOpDataControlRefRelationMapper() throws IOException {
    if (opDataControlRefRelationMapperEager != null) {
      opDataControlRefRelationMapperEager.close();
      opDataControlRefRelationMapperEager = null;
    }
    if (opDataControlRefRelationMapperLazy != null) {
      opDataControlRefRelationMapperLazy.close();
      opDataControlRefRelationMapperLazy = null;
    }
  }

  public static AddObjectOperation addOpDataControlRefRelationMapper(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.RelationMapper detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpDataControlRefRelationMapper");
    command.setDetailProperty("DataControlRef");
    return command;
  }

  public static RemoveObjectOperation rmOpDataControlRefRelationMapper(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.RelationMapper detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpDataControlRefRelationMapper");
    command.setDetailProperty("DataControlRef");
    return command;
  }

  private EagerList<RelationMapper> opDataControlRefRelationMapperEager;

  public List<RelationMapper> getOpDataControlRefRelationMapperEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opDataControlRefRelationMapperEager == null) {
      opDataControlRefRelationMapperEager =
          new EagerList<RelationMapper>(
              org.tura.model.designer.repository.serialized.form.RelationMapper.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.RelationMapper
                    opDataControlRefRelationMapper) {
              if (opDataControlRefRelationMapper == null) {
                return;
              }
              if (opDataControlRefRelationMapper != null
                  && (opDataControlRefRelationMapper.getAttached() == null
                      || !opDataControlRefRelationMapper.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opDataControlRefRelationMapper);
                  repository.insert(opDataControlRefRelationMapper, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.form.DataControl.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpDataControlRefRelationMapper(
                        DataControlProxy.this, opDataControlRefRelationMapper);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opDataControlRefRelationMapper);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              RelationMapper opDataControlRefRelationMapper = (RelationMapper) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opDataControlRefRelationMapper);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpDataControlRefRelationMapper(
                          DataControlProxy.this, opDataControlRefRelationMapper);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public RelationMapper remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpDataControlRefRelationMapper(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "77bcd4b3-dff5-4943-b99e-f1d20e238cef";
            }
          };
    }
    return opDataControlRefRelationMapperEager;
  }

  private LazyList<RelationMapper> opDataControlRefRelationMapperLazy;

  public List<RelationMapper> getOpDataControlRefRelationMapperLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opDataControlRefRelationMapperLazy == null) {
      opDataControlRefRelationMapperLazy =
          new LazyList<RelationMapper>(
              org.tura.model.designer.repository.serialized.form.RelationMapper.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpDataControlRefRelationMapperDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.RelationMapper
                    opDataControlRefRelationMapper) {
              if (opDataControlRefRelationMapper == null) {
                return;
              }
              getOpDataControlRefRelationMapperEager().add(i, opDataControlRefRelationMapper);
              super.add(i, opDataControlRefRelationMapper);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              RelationMapper opDataControlRefRelationMapper = (RelationMapper) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opDataControlRefRelationMapper);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpDataControlRefRelationMapper(
                          DataControlProxy.this, opDataControlRefRelationMapper);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public RelationMapper remove(int index) {
              super.remove(index);
              return getOpDataControlRefRelationMapperEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "77bcd4b3-dff5-4943-b99e-f1d20e238cef";
            }
          };
    }
    return opDataControlRefRelationMapperLazy;
  }

  public List<Relation> getOpMasterRelation() {
    if (inMemory) {
      return getOpMasterRelationEager();
    } else {
      return getOpMasterRelationLazy();
    }
  }

  public void cleanOpMasterRelation() throws IOException {
    if (opMasterRelationEager != null) {
      opMasterRelationEager.close();
      opMasterRelationEager = null;
    }
    if (opMasterRelationLazy != null) {
      opMasterRelationLazy.close();
      opMasterRelationLazy = null;
    }
  }

  public static AddObjectOperation addOpMasterRelation(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.Relation detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpMasterRelation");
    command.setDetailProperty("Master");
    return command;
  }

  public static RemoveObjectOperation rmOpMasterRelation(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.Relation detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpMasterRelation");
    command.setDetailProperty("Master");
    return command;
  }

  private EagerList<Relation> opMasterRelationEager;

  public List<Relation> getOpMasterRelationEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMasterRelationEager == null) {
      opMasterRelationEager =
          new EagerList<Relation>(
              org.tura.model.designer.repository.serialized.form.Relation.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Relation opMasterRelation) {
              if (opMasterRelation == null) {
                return;
              }
              if (opMasterRelation != null
                  && (opMasterRelation.getAttached() == null || !opMasterRelation.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opMasterRelation);
                  repository.insert(opMasterRelation, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.form.DataControl.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpMasterRelation(DataControlProxy.this, opMasterRelation);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opMasterRelation);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Relation opMasterRelation = (Relation) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opMasterRelation);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpMasterRelation(DataControlProxy.this, opMasterRelation);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Relation remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpMasterRelation(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "ed91a404-8bac-467d-9622-8e01f9db69ec";
            }
          };
    }
    return opMasterRelationEager;
  }

  private LazyList<Relation> opMasterRelationLazy;

  public List<Relation> getOpMasterRelationLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMasterRelationLazy == null) {
      opMasterRelationLazy =
          new LazyList<Relation>(
              org.tura.model.designer.repository.serialized.form.Relation.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpMasterRelationDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Relation opMasterRelation) {
              if (opMasterRelation == null) {
                return;
              }
              getOpMasterRelationEager().add(i, opMasterRelation);
              super.add(i, opMasterRelation);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Relation opMasterRelation = (Relation) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opMasterRelation);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpMasterRelation(DataControlProxy.this, opMasterRelation);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Relation remove(int index) {
              super.remove(index);
              return getOpMasterRelationEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "ed91a404-8bac-467d-9622-8e01f9db69ec";
            }
          };
    }
    return opMasterRelationLazy;
  }

  public List<Relation> getOpDetailRelation() {
    if (inMemory) {
      return getOpDetailRelationEager();
    } else {
      return getOpDetailRelationLazy();
    }
  }

  public void cleanOpDetailRelation() throws IOException {
    if (opDetailRelationEager != null) {
      opDetailRelationEager.close();
      opDetailRelationEager = null;
    }
    if (opDetailRelationLazy != null) {
      opDetailRelationLazy.close();
      opDetailRelationLazy = null;
    }
  }

  public static AddObjectOperation addOpDetailRelation(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.Relation detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpDetailRelation");
    command.setDetailProperty("Detail");
    return command;
  }

  public static RemoveObjectOperation rmOpDetailRelation(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.Relation detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpDetailRelation");
    command.setDetailProperty("Detail");
    return command;
  }

  private EagerList<Relation> opDetailRelationEager;

  public List<Relation> getOpDetailRelationEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opDetailRelationEager == null) {
      opDetailRelationEager =
          new EagerList<Relation>(
              org.tura.model.designer.repository.serialized.form.Relation.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Relation opDetailRelation) {
              if (opDetailRelation == null) {
                return;
              }
              if (opDetailRelation != null
                  && (opDetailRelation.getAttached() == null || !opDetailRelation.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opDetailRelation);
                  repository.insert(opDetailRelation, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.form.DataControl.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpDetailRelation(DataControlProxy.this, opDetailRelation);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opDetailRelation);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Relation opDetailRelation = (Relation) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opDetailRelation);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpDetailRelation(DataControlProxy.this, opDetailRelation);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Relation remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpDetailRelation(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "59c1f6f5-21c9-446a-8ae4-697258994ac7";
            }
          };
    }
    return opDetailRelationEager;
  }

  private LazyList<Relation> opDetailRelationLazy;

  public List<Relation> getOpDetailRelationLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opDetailRelationLazy == null) {
      opDetailRelationLazy =
          new LazyList<Relation>(
              org.tura.model.designer.repository.serialized.form.Relation.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpDetailRelationDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Relation opDetailRelation) {
              if (opDetailRelation == null) {
                return;
              }
              getOpDetailRelationEager().add(i, opDetailRelation);
              super.add(i, opDetailRelation);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Relation opDetailRelation = (Relation) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opDetailRelation);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpDetailRelation(DataControlProxy.this, opDetailRelation);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Relation remove(int index) {
              super.remove(index);
              return getOpDetailRelationEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "59c1f6f5-21c9-446a-8ae4-697258994ac7";
            }
          };
    }
    return opDetailRelationLazy;
  }

  public List<Dependency> getOpMasterDependency() {
    if (inMemory) {
      return getOpMasterDependencyEager();
    } else {
      return getOpMasterDependencyLazy();
    }
  }

  public void cleanOpMasterDependency() throws IOException {
    if (opMasterDependencyEager != null) {
      opMasterDependencyEager.close();
      opMasterDependencyEager = null;
    }
    if (opMasterDependencyLazy != null) {
      opMasterDependencyLazy.close();
      opMasterDependencyLazy = null;
    }
  }

  public static AddObjectOperation addOpMasterDependency(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.Dependency detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpMasterDependency");
    command.setDetailProperty("Master");
    return command;
  }

  public static RemoveObjectOperation rmOpMasterDependency(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.Dependency detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpMasterDependency");
    command.setDetailProperty("Master");
    return command;
  }

  private EagerList<Dependency> opMasterDependencyEager;

  public List<Dependency> getOpMasterDependencyEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMasterDependencyEager == null) {
      opMasterDependencyEager =
          new EagerList<Dependency>(
              org.tura.model.designer.repository.serialized.form.Dependency.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Dependency opMasterDependency) {
              if (opMasterDependency == null) {
                return;
              }
              if (opMasterDependency != null
                  && (opMasterDependency.getAttached() == null
                      || !opMasterDependency.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opMasterDependency);
                  repository.insert(opMasterDependency, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.form.DataControl.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpMasterDependency(DataControlProxy.this, opMasterDependency);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opMasterDependency);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Dependency opMasterDependency = (Dependency) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opMasterDependency);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpMasterDependency(DataControlProxy.this, opMasterDependency);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Dependency remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpMasterDependency(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "2cd598f1-558b-4b7b-b788-740a9bf0f535";
            }
          };
    }
    return opMasterDependencyEager;
  }

  private LazyList<Dependency> opMasterDependencyLazy;

  public List<Dependency> getOpMasterDependencyLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMasterDependencyLazy == null) {
      opMasterDependencyLazy =
          new LazyList<Dependency>(
              org.tura.model.designer.repository.serialized.form.Dependency.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpMasterDependencyDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Dependency opMasterDependency) {
              if (opMasterDependency == null) {
                return;
              }
              getOpMasterDependencyEager().add(i, opMasterDependency);
              super.add(i, opMasterDependency);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Dependency opMasterDependency = (Dependency) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opMasterDependency);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpMasterDependency(DataControlProxy.this, opMasterDependency);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Dependency remove(int index) {
              super.remove(index);
              return getOpMasterDependencyEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "2cd598f1-558b-4b7b-b788-740a9bf0f535";
            }
          };
    }
    return opMasterDependencyLazy;
  }

  public List<Dependency> getOpDetailDependency() {
    if (inMemory) {
      return getOpDetailDependencyEager();
    } else {
      return getOpDetailDependencyLazy();
    }
  }

  public void cleanOpDetailDependency() throws IOException {
    if (opDetailDependencyEager != null) {
      opDetailDependencyEager.close();
      opDetailDependencyEager = null;
    }
    if (opDetailDependencyLazy != null) {
      opDetailDependencyLazy.close();
      opDetailDependencyLazy = null;
    }
  }

  public static AddObjectOperation addOpDetailDependency(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.Dependency detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpDetailDependency");
    command.setDetailProperty("Detail");
    return command;
  }

  public static RemoveObjectOperation rmOpDetailDependency(
      org.tura.model.designer.repository.serialized.form.DataControl master,
      org.tura.model.designer.repository.serialized.form.Dependency detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpDetailDependency");
    command.setDetailProperty("Detail");
    return command;
  }

  private EagerList<Dependency> opDetailDependencyEager;

  public List<Dependency> getOpDetailDependencyEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opDetailDependencyEager == null) {
      opDetailDependencyEager =
          new EagerList<Dependency>(
              org.tura.model.designer.repository.serialized.form.Dependency.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Dependency opDetailDependency) {
              if (opDetailDependency == null) {
                return;
              }
              if (opDetailDependency != null
                  && (opDetailDependency.getAttached() == null
                      || !opDetailDependency.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opDetailDependency);
                  repository.insert(opDetailDependency, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.form.DataControl.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpDetailDependency(DataControlProxy.this, opDetailDependency);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opDetailDependency);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Dependency opDetailDependency = (Dependency) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opDetailDependency);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpDetailDependency(DataControlProxy.this, opDetailDependency);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Dependency remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpDetailDependency(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "414b0765-baca-452b-aab2-5d9130131fa8";
            }
          };
    }
    return opDetailDependencyEager;
  }

  private LazyList<Dependency> opDetailDependencyLazy;

  public List<Dependency> getOpDetailDependencyLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opDetailDependencyLazy == null) {
      opDetailDependencyLazy =
          new LazyList<Dependency>(
              org.tura.model.designer.repository.serialized.form.Dependency.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpDetailDependencyDataControl",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Dependency opDetailDependency) {
              if (opDetailDependency == null) {
                return;
              }
              getOpDetailDependencyEager().add(i, opDetailDependency);
              super.add(i, opDetailDependency);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Dependency opDetailDependency = (Dependency) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opDetailDependency);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpDetailDependency(DataControlProxy.this, opDetailDependency);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Dependency remove(int index) {
              super.remove(index);
              return getOpDetailDependencyEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "414b0765-baca-452b-aab2-5d9130131fa8";
            }
          };
    }
    return opDetailDependencyLazy;
  }

  @Override
  public void setOpControlsControls(
      org.tura.model.designer.repository.serialized.form.Controls opControlsControls) {
    this.setOpControlsControlsEager(opControlsControls);
  }

  @Override
  public Controls getOpControlsControls() {
    if (inMemory) {
      return this.getOpControlsControlsEager();
    } else {
      return this.getOpControlsControlsLazy();
    }
  }

  public void cleanOpControlsControls() throws IOException {
    if (opControlsControlsEagerSingleObject != null) {
      opControlsControlsEagerSingleObject.close();
      opControlsControlsEagerSingleObject = null;
    }
    if (opControlsControlsLazySingleObject != null) {
      opControlsControlsLazySingleObject.close();
      opControlsControlsLazySingleObject = null;
    }
  }

  private EagerSingleObject<Controls> opControlsControlsEagerSingleObject;

  public Controls getOpControlsControlsEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opControlsControlsEagerSingleObject == null) {
      opControlsControlsEagerSingleObject =
          new EagerSingleObject<Controls>(
              org.tura.model.designer.repository.serialized.form.Controls.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opControlsControlsEagerSingleObject.get(
        this.getCpaPath(), "8103ac78-57d6-4e46-8c92-f090645130e7");
  }

  private void setOpControlsControlsEager(
      org.tura.model.designer.repository.serialized.form.Controls opControlsControls) {
    if (opControlsControls != null) {
      opControlsControls.getControls().add(this);
    }
  }

  private LazySingleObject<Controls> opControlsControlsLazySingleObject;

  private Controls getOpControlsControlsLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opControlsControlsLazySingleObject == null) {
      opControlsControlsLazySingleObject =
          new LazySingleObject<Controls>(
              org.tura.model.designer.repository.serialized.form.Controls.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite) {

            private static final long serialVersionUID = 1L;

            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "uid",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getTransientRefControlsControls(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opControlsControlsLazySingleObject.get(
        this.getCpaPath(), "8103ac78-57d6-4e46-8c92-f090645130e7");
  }

  @Override
  public String getSuidCategorized() {
    return this.getObject().getSuidCategorized();
  }

  public List<Classifier> getClassifiers() {
    return getClassifiersEager();
  }

  public void cleanClassifiers() throws IOException {
    if (classifiersEager != null) {
      classifiersEager.close();
      classifiersEager = null;
    }
  }

  public static AddContainmentObjectOperation addClassifiers(
      org.tura.model.designer.repository.serialized.artifact.Categorized master,
      org.tura.model.designer.repository.serialized.artifact.Classifier detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("Classifiers");
    command.setDetailProperty("OpClassifiersCategorized");
    return command;
  }

  public static RemoveContainmentObjectOperation rmClassifiers(
      org.tura.model.designer.repository.serialized.artifact.Categorized master,
      org.tura.model.designer.repository.serialized.artifact.Classifier detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("Classifiers");
    command.setDetailProperty("OpClassifiersCategorized");
    return command;
  }

  private EagerList<Classifier> classifiersEager;

  public List<Classifier> getClassifiersEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (classifiersEager == null) {
      classifiersEager =
          new EagerList<Classifier>(
              org.tura.model.designer.repository.serialized.artifact.Classifier.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.artifact.Classifier classifiers) {
              if (classifiers == null) {
                return;
              }
              Boolean saveAttached = false;
              if (classifiers != null) {
                saveAttached = ((ObjectControl) classifiers).getAttached();
                ((ObjectControl) classifiers).setAttached(getAttached());
                ;
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddContainmentObjectOperation command =
                    addClassifiers(DataControlProxy.this, classifiers);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, classifiers);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                if (classifiers != null) {
                  ((ObjectControl) classifiers).setAttached(saveAttached);
                }
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Classifier classifiers = (Classifier) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(classifiers);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveContainmentObjectOperation command =
                      rmClassifiers(DataControlProxy.this, classifiers);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Classifier remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveContainmentObjectOperation command =
                    rmClassifiers(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "1bb1f934-5eba-4f36-932f-0f3c7ef54731";
            }
          };
    }
    return classifiersEager;
  }

  @Override
  public String getSuidMetaObject() {
    return this.getObject().getSuidMetaObject();
  }

  public List<AttributeConnector> getOpSourceAttributeConnector() {
    if (inMemory) {
      return getOpSourceAttributeConnectorEager();
    } else {
      return getOpSourceAttributeConnectorLazy();
    }
  }

  public void cleanOpSourceAttributeConnector() throws IOException {
    if (opSourceAttributeConnectorEager != null) {
      opSourceAttributeConnectorEager.close();
      opSourceAttributeConnectorEager = null;
    }
    if (opSourceAttributeConnectorLazy != null) {
      opSourceAttributeConnectorLazy.close();
      opSourceAttributeConnectorLazy = null;
    }
  }

  public static AddObjectOperation addOpSourceAttributeConnector(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpSourceAttributeConnector");
    command.setDetailProperty("Source");
    return command;
  }

  public static RemoveObjectOperation rmOpSourceAttributeConnector(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpSourceAttributeConnector");
    command.setDetailProperty("Source");
    return command;
  }

  private EagerList<AttributeConnector> opSourceAttributeConnectorEager;

  public List<AttributeConnector> getOpSourceAttributeConnectorEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opSourceAttributeConnectorEager == null) {
      opSourceAttributeConnectorEager =
          new EagerList<AttributeConnector>(
              org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector
                    opSourceAttributeConnector) {
              if (opSourceAttributeConnector == null) {
                return;
              }
              if (opSourceAttributeConnector != null
                  && (opSourceAttributeConnector.getAttached() == null
                      || !opSourceAttributeConnector.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opSourceAttributeConnector);
                  repository.insert(opSourceAttributeConnector, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpSourceAttributeConnector(
                        DataControlProxy.this, opSourceAttributeConnector);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opSourceAttributeConnector);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              AttributeConnector opSourceAttributeConnector = (AttributeConnector) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opSourceAttributeConnector);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpSourceAttributeConnector(
                          DataControlProxy.this, opSourceAttributeConnector);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public AttributeConnector remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpSourceAttributeConnector(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "ee8133a7-72b3-48b1-9807-e554f5a27019";
            }
          };
    }
    return opSourceAttributeConnectorEager;
  }

  private LazyList<AttributeConnector> opSourceAttributeConnectorLazy;

  public List<AttributeConnector> getOpSourceAttributeConnectorLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opSourceAttributeConnectorLazy == null) {
      opSourceAttributeConnectorLazy =
          new LazyList<AttributeConnector>(
              org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpSourceAttributeConnectorMetaObject",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMetaObject(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector
                    opSourceAttributeConnector) {
              if (opSourceAttributeConnector == null) {
                return;
              }
              getOpSourceAttributeConnectorEager().add(i, opSourceAttributeConnector);
              super.add(i, opSourceAttributeConnector);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              AttributeConnector opSourceAttributeConnector = (AttributeConnector) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opSourceAttributeConnector);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpSourceAttributeConnector(
                          DataControlProxy.this, opSourceAttributeConnector);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public AttributeConnector remove(int index) {
              super.remove(index);
              return getOpSourceAttributeConnectorEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "ee8133a7-72b3-48b1-9807-e554f5a27019";
            }
          };
    }
    return opSourceAttributeConnectorLazy;
  }

  public List<AttributeConnector> getOpTargetAttributeConnector() {
    if (inMemory) {
      return getOpTargetAttributeConnectorEager();
    } else {
      return getOpTargetAttributeConnectorLazy();
    }
  }

  public void cleanOpTargetAttributeConnector() throws IOException {
    if (opTargetAttributeConnectorEager != null) {
      opTargetAttributeConnectorEager.close();
      opTargetAttributeConnectorEager = null;
    }
    if (opTargetAttributeConnectorLazy != null) {
      opTargetAttributeConnectorLazy.close();
      opTargetAttributeConnectorLazy = null;
    }
  }

  public static AddObjectOperation addOpTargetAttributeConnector(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTargetAttributeConnector");
    command.setDetailProperty("Target");
    return command;
  }

  public static RemoveObjectOperation rmOpTargetAttributeConnector(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTargetAttributeConnector");
    command.setDetailProperty("Target");
    return command;
  }

  private EagerList<AttributeConnector> opTargetAttributeConnectorEager;

  public List<AttributeConnector> getOpTargetAttributeConnectorEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTargetAttributeConnectorEager == null) {
      opTargetAttributeConnectorEager =
          new EagerList<AttributeConnector>(
              org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector
                    opTargetAttributeConnector) {
              if (opTargetAttributeConnector == null) {
                return;
              }
              if (opTargetAttributeConnector != null
                  && (opTargetAttributeConnector.getAttached() == null
                      || !opTargetAttributeConnector.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opTargetAttributeConnector);
                  repository.insert(opTargetAttributeConnector, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpTargetAttributeConnector(
                        DataControlProxy.this, opTargetAttributeConnector);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opTargetAttributeConnector);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              AttributeConnector opTargetAttributeConnector = (AttributeConnector) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTargetAttributeConnector);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpTargetAttributeConnector(
                          DataControlProxy.this, opTargetAttributeConnector);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public AttributeConnector remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpTargetAttributeConnector(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "1b246eaf-a5bc-4e1a-960f-6fcc29adf71a";
            }
          };
    }
    return opTargetAttributeConnectorEager;
  }

  private LazyList<AttributeConnector> opTargetAttributeConnectorLazy;

  public List<AttributeConnector> getOpTargetAttributeConnectorLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTargetAttributeConnectorLazy == null) {
      opTargetAttributeConnectorLazy =
          new LazyList<AttributeConnector>(
              org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpTargetAttributeConnectorMetaObject",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMetaObject(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector
                    opTargetAttributeConnector) {
              if (opTargetAttributeConnector == null) {
                return;
              }
              getOpTargetAttributeConnectorEager().add(i, opTargetAttributeConnector);
              super.add(i, opTargetAttributeConnector);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              AttributeConnector opTargetAttributeConnector = (AttributeConnector) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTargetAttributeConnector);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpTargetAttributeConnector(
                          DataControlProxy.this, opTargetAttributeConnector);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public AttributeConnector remove(int index) {
              super.remove(index);
              return getOpTargetAttributeConnectorEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "1b246eaf-a5bc-4e1a-960f-6fcc29adf71a";
            }
          };
    }
    return opTargetAttributeConnectorLazy;
  }

  public List<ContextParameter> getOpRefObjContextParameter() {
    if (inMemory) {
      return getOpRefObjContextParameterEager();
    } else {
      return getOpRefObjContextParameterLazy();
    }
  }

  public void cleanOpRefObjContextParameter() throws IOException {
    if (opRefObjContextParameterEager != null) {
      opRefObjContextParameterEager.close();
      opRefObjContextParameterEager = null;
    }
    if (opRefObjContextParameterLazy != null) {
      opRefObjContextParameterLazy.close();
      opRefObjContextParameterLazy = null;
    }
  }

  public static AddObjectOperation addOpRefObjContextParameter(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.ContextParameter detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpRefObjContextParameter");
    command.setDetailProperty("RefObj");
    return command;
  }

  public static RemoveObjectOperation rmOpRefObjContextParameter(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.ContextParameter detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpRefObjContextParameter");
    command.setDetailProperty("RefObj");
    return command;
  }

  private EagerList<ContextParameter> opRefObjContextParameterEager;

  public List<ContextParameter> getOpRefObjContextParameterEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opRefObjContextParameterEager == null) {
      opRefObjContextParameterEager =
          new EagerList<ContextParameter>(
              org.tura.model.designer.repository.serialized.form.ContextParameter.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ContextParameter
                    opRefObjContextParameter) {
              if (opRefObjContextParameter == null) {
                return;
              }
              if (opRefObjContextParameter != null
                  && (opRefObjContextParameter.getAttached() == null
                      || !opRefObjContextParameter.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opRefObjContextParameter);
                  repository.insert(opRefObjContextParameter, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpRefObjContextParameter(DataControlProxy.this, opRefObjContextParameter);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opRefObjContextParameter);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ContextParameter opRefObjContextParameter = (ContextParameter) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opRefObjContextParameter);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpRefObjContextParameter(DataControlProxy.this, opRefObjContextParameter);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ContextParameter remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpRefObjContextParameter(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "ef46af04-c245-46b5-9b3b-24f475002cd1";
            }
          };
    }
    return opRefObjContextParameterEager;
  }

  private LazyList<ContextParameter> opRefObjContextParameterLazy;

  public List<ContextParameter> getOpRefObjContextParameterLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opRefObjContextParameterLazy == null) {
      opRefObjContextParameterLazy =
          new LazyList<ContextParameter>(
              org.tura.model.designer.repository.serialized.form.ContextParameter.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpRefObjContextParameterMetaObject",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMetaObject(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ContextParameter
                    opRefObjContextParameter) {
              if (opRefObjContextParameter == null) {
                return;
              }
              getOpRefObjContextParameterEager().add(i, opRefObjContextParameter);
              super.add(i, opRefObjContextParameter);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ContextParameter opRefObjContextParameter = (ContextParameter) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opRefObjContextParameter);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpRefObjContextParameter(DataControlProxy.this, opRefObjContextParameter);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ContextParameter remove(int index) {
              super.remove(index);
              return getOpRefObjContextParameterEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "ef46af04-c245-46b5-9b3b-24f475002cd1";
            }
          };
    }
    return opRefObjContextParameterLazy;
  }

  public List<ExpressionPart> getOpObjRefExpressionPart() {
    if (inMemory) {
      return getOpObjRefExpressionPartEager();
    } else {
      return getOpObjRefExpressionPartLazy();
    }
  }

  public void cleanOpObjRefExpressionPart() throws IOException {
    if (opObjRefExpressionPartEager != null) {
      opObjRefExpressionPartEager.close();
      opObjRefExpressionPartEager = null;
    }
    if (opObjRefExpressionPartLazy != null) {
      opObjRefExpressionPartLazy.close();
      opObjRefExpressionPartLazy = null;
    }
  }

  public static AddObjectOperation addOpObjRefExpressionPart(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.ExpressionPart detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpObjRefExpressionPart");
    command.setDetailProperty("ObjRef");
    return command;
  }

  public static RemoveObjectOperation rmOpObjRefExpressionPart(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.ExpressionPart detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpObjRefExpressionPart");
    command.setDetailProperty("ObjRef");
    return command;
  }

  private EagerList<ExpressionPart> opObjRefExpressionPartEager;

  public List<ExpressionPart> getOpObjRefExpressionPartEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opObjRefExpressionPartEager == null) {
      opObjRefExpressionPartEager =
          new EagerList<ExpressionPart>(
              org.tura.model.designer.repository.serialized.form.ExpressionPart.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ExpressionPart
                    opObjRefExpressionPart) {
              if (opObjRefExpressionPart == null) {
                return;
              }
              if (opObjRefExpressionPart != null
                  && (opObjRefExpressionPart.getAttached() == null
                      || !opObjRefExpressionPart.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opObjRefExpressionPart);
                  repository.insert(opObjRefExpressionPart, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpObjRefExpressionPart(DataControlProxy.this, opObjRefExpressionPart);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opObjRefExpressionPart);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ExpressionPart opObjRefExpressionPart = (ExpressionPart) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opObjRefExpressionPart);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpObjRefExpressionPart(DataControlProxy.this, opObjRefExpressionPart);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ExpressionPart remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpObjRefExpressionPart(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "c7db89bb-57ce-41f4-915f-31af456f91e6";
            }
          };
    }
    return opObjRefExpressionPartEager;
  }

  private LazyList<ExpressionPart> opObjRefExpressionPartLazy;

  public List<ExpressionPart> getOpObjRefExpressionPartLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opObjRefExpressionPartLazy == null) {
      opObjRefExpressionPartLazy =
          new LazyList<ExpressionPart>(
              org.tura.model.designer.repository.serialized.form.ExpressionPart.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpObjRefExpressionPartMetaObject",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMetaObject(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ExpressionPart
                    opObjRefExpressionPart) {
              if (opObjRefExpressionPart == null) {
                return;
              }
              getOpObjRefExpressionPartEager().add(i, opObjRefExpressionPart);
              super.add(i, opObjRefExpressionPart);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ExpressionPart opObjRefExpressionPart = (ExpressionPart) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opObjRefExpressionPart);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpObjRefExpressionPart(DataControlProxy.this, opObjRefExpressionPart);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ExpressionPart remove(int index) {
              super.remove(index);
              return getOpObjRefExpressionPartEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "c7db89bb-57ce-41f4-915f-31af456f91e6";
            }
          };
    }
    return opObjRefExpressionPartLazy;
  }

  public List<ControlPointer> getOpValuePointerControlPointer() {
    if (inMemory) {
      return getOpValuePointerControlPointerEager();
    } else {
      return getOpValuePointerControlPointerLazy();
    }
  }

  public void cleanOpValuePointerControlPointer() throws IOException {
    if (opValuePointerControlPointerEager != null) {
      opValuePointerControlPointerEager.close();
      opValuePointerControlPointerEager = null;
    }
    if (opValuePointerControlPointerLazy != null) {
      opValuePointerControlPointerLazy.close();
      opValuePointerControlPointerLazy = null;
    }
  }

  public static AddObjectOperation addOpValuePointerControlPointer(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.ControlPointer detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpValuePointerControlPointer");
    command.setDetailProperty("ValuePointer");
    return command;
  }

  public static RemoveObjectOperation rmOpValuePointerControlPointer(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.ControlPointer detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpValuePointerControlPointer");
    command.setDetailProperty("ValuePointer");
    return command;
  }

  private EagerList<ControlPointer> opValuePointerControlPointerEager;

  public List<ControlPointer> getOpValuePointerControlPointerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opValuePointerControlPointerEager == null) {
      opValuePointerControlPointerEager =
          new EagerList<ControlPointer>(
              org.tura.model.designer.repository.serialized.form.ControlPointer.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ControlPointer
                    opValuePointerControlPointer) {
              if (opValuePointerControlPointer == null) {
                return;
              }
              if (opValuePointerControlPointer != null
                  && (opValuePointerControlPointer.getAttached() == null
                      || !opValuePointerControlPointer.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opValuePointerControlPointer);
                  repository.insert(opValuePointerControlPointer, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpValuePointerControlPointer(
                        DataControlProxy.this, opValuePointerControlPointer);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opValuePointerControlPointer);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ControlPointer opValuePointerControlPointer = (ControlPointer) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opValuePointerControlPointer);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpValuePointerControlPointer(
                          DataControlProxy.this, opValuePointerControlPointer);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ControlPointer remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpValuePointerControlPointer(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "f7c17e78-ca29-4283-8b59-58a4b320d35a";
            }
          };
    }
    return opValuePointerControlPointerEager;
  }

  private LazyList<ControlPointer> opValuePointerControlPointerLazy;

  public List<ControlPointer> getOpValuePointerControlPointerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opValuePointerControlPointerLazy == null) {
      opValuePointerControlPointerLazy =
          new LazyList<ControlPointer>(
              org.tura.model.designer.repository.serialized.form.ControlPointer.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpValuePointerControlPointerMetaObject",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMetaObject(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ControlPointer
                    opValuePointerControlPointer) {
              if (opValuePointerControlPointer == null) {
                return;
              }
              getOpValuePointerControlPointerEager().add(i, opValuePointerControlPointer);
              super.add(i, opValuePointerControlPointer);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ControlPointer opValuePointerControlPointer = (ControlPointer) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opValuePointerControlPointer);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpValuePointerControlPointer(
                          DataControlProxy.this, opValuePointerControlPointer);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public ControlPointer remove(int index) {
              super.remove(index);
              return getOpValuePointerControlPointerEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "f7c17e78-ca29-4283-8b59-58a4b320d35a";
            }
          };
    }
    return opValuePointerControlPointerLazy;
  }

  public List<Selection> getOpDisplayOptionPointerSelection() {
    if (inMemory) {
      return getOpDisplayOptionPointerSelectionEager();
    } else {
      return getOpDisplayOptionPointerSelectionLazy();
    }
  }

  public void cleanOpDisplayOptionPointerSelection() throws IOException {
    if (opDisplayOptionPointerSelectionEager != null) {
      opDisplayOptionPointerSelectionEager.close();
      opDisplayOptionPointerSelectionEager = null;
    }
    if (opDisplayOptionPointerSelectionLazy != null) {
      opDisplayOptionPointerSelectionLazy.close();
      opDisplayOptionPointerSelectionLazy = null;
    }
  }

  public static AddObjectOperation addOpDisplayOptionPointerSelection(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.Selection detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpDisplayOptionPointerSelection");
    command.setDetailProperty("DisplayOptionPointer");
    return command;
  }

  public static RemoveObjectOperation rmOpDisplayOptionPointerSelection(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.Selection detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpDisplayOptionPointerSelection");
    command.setDetailProperty("DisplayOptionPointer");
    return command;
  }

  private EagerList<Selection> opDisplayOptionPointerSelectionEager;

  public List<Selection> getOpDisplayOptionPointerSelectionEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opDisplayOptionPointerSelectionEager == null) {
      opDisplayOptionPointerSelectionEager =
          new EagerList<Selection>(
              org.tura.model.designer.repository.serialized.form.Selection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Selection
                    opDisplayOptionPointerSelection) {
              if (opDisplayOptionPointerSelection == null) {
                return;
              }
              if (opDisplayOptionPointerSelection != null
                  && (opDisplayOptionPointerSelection.getAttached() == null
                      || !opDisplayOptionPointerSelection.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opDisplayOptionPointerSelection);
                  repository.insert(opDisplayOptionPointerSelection, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpDisplayOptionPointerSelection(
                        DataControlProxy.this, opDisplayOptionPointerSelection);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opDisplayOptionPointerSelection);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Selection opDisplayOptionPointerSelection = (Selection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opDisplayOptionPointerSelection);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpDisplayOptionPointerSelection(
                          DataControlProxy.this, opDisplayOptionPointerSelection);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Selection remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpDisplayOptionPointerSelection(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "54a67340-af4b-4c9a-9c65-322903fd3278";
            }
          };
    }
    return opDisplayOptionPointerSelectionEager;
  }

  private LazyList<Selection> opDisplayOptionPointerSelectionLazy;

  public List<Selection> getOpDisplayOptionPointerSelectionLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opDisplayOptionPointerSelectionLazy == null) {
      opDisplayOptionPointerSelectionLazy =
          new LazyList<Selection>(
              org.tura.model.designer.repository.serialized.form.Selection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpDisplayOptionPointerSelectionMetaObject",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMetaObject(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Selection
                    opDisplayOptionPointerSelection) {
              if (opDisplayOptionPointerSelection == null) {
                return;
              }
              getOpDisplayOptionPointerSelectionEager().add(i, opDisplayOptionPointerSelection);
              super.add(i, opDisplayOptionPointerSelection);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Selection opDisplayOptionPointerSelection = (Selection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opDisplayOptionPointerSelection);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpDisplayOptionPointerSelection(
                          DataControlProxy.this, opDisplayOptionPointerSelection);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Selection remove(int index) {
              super.remove(index);
              return getOpDisplayOptionPointerSelectionEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "54a67340-af4b-4c9a-9c65-322903fd3278";
            }
          };
    }
    return opDisplayOptionPointerSelectionLazy;
  }

  public List<Selection> getOpValueOptionPointerSelection() {
    if (inMemory) {
      return getOpValueOptionPointerSelectionEager();
    } else {
      return getOpValueOptionPointerSelectionLazy();
    }
  }

  public void cleanOpValueOptionPointerSelection() throws IOException {
    if (opValueOptionPointerSelectionEager != null) {
      opValueOptionPointerSelectionEager.close();
      opValueOptionPointerSelectionEager = null;
    }
    if (opValueOptionPointerSelectionLazy != null) {
      opValueOptionPointerSelectionLazy.close();
      opValueOptionPointerSelectionLazy = null;
    }
  }

  public static AddObjectOperation addOpValueOptionPointerSelection(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.Selection detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpValueOptionPointerSelection");
    command.setDetailProperty("ValueOptionPointer");
    return command;
  }

  public static RemoveObjectOperation rmOpValueOptionPointerSelection(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.Selection detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpValueOptionPointerSelection");
    command.setDetailProperty("ValueOptionPointer");
    return command;
  }

  private EagerList<Selection> opValueOptionPointerSelectionEager;

  public List<Selection> getOpValueOptionPointerSelectionEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opValueOptionPointerSelectionEager == null) {
      opValueOptionPointerSelectionEager =
          new EagerList<Selection>(
              org.tura.model.designer.repository.serialized.form.Selection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Selection
                    opValueOptionPointerSelection) {
              if (opValueOptionPointerSelection == null) {
                return;
              }
              if (opValueOptionPointerSelection != null
                  && (opValueOptionPointerSelection.getAttached() == null
                      || !opValueOptionPointerSelection.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opValueOptionPointerSelection);
                  repository.insert(opValueOptionPointerSelection, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpValueOptionPointerSelection(
                        DataControlProxy.this, opValueOptionPointerSelection);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opValueOptionPointerSelection);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Selection opValueOptionPointerSelection = (Selection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opValueOptionPointerSelection);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpValueOptionPointerSelection(
                          DataControlProxy.this, opValueOptionPointerSelection);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Selection remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpValueOptionPointerSelection(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "93bb8f22-1ce5-4cf3-a754-e32db046108a";
            }
          };
    }
    return opValueOptionPointerSelectionEager;
  }

  private LazyList<Selection> opValueOptionPointerSelectionLazy;

  public List<Selection> getOpValueOptionPointerSelectionLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opValueOptionPointerSelectionLazy == null) {
      opValueOptionPointerSelectionLazy =
          new LazyList<Selection>(
              org.tura.model.designer.repository.serialized.form.Selection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpValueOptionPointerSelectionMetaObject",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMetaObject(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.Selection
                    opValueOptionPointerSelection) {
              if (opValueOptionPointerSelection == null) {
                return;
              }
              getOpValueOptionPointerSelectionEager().add(i, opValueOptionPointerSelection);
              super.add(i, opValueOptionPointerSelection);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Selection opValueOptionPointerSelection = (Selection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opValueOptionPointerSelection);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpValueOptionPointerSelection(
                          DataControlProxy.this, opValueOptionPointerSelection);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public Selection remove(int index) {
              super.remove(index);
              return getOpValueOptionPointerSelectionEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "93bb8f22-1ce5-4cf3-a754-e32db046108a";
            }
          };
    }
    return opValueOptionPointerSelectionLazy;
  }

  public List<OrderBy> getOpRefObjOrderBy() {
    if (inMemory) {
      return getOpRefObjOrderByEager();
    } else {
      return getOpRefObjOrderByLazy();
    }
  }

  public void cleanOpRefObjOrderBy() throws IOException {
    if (opRefObjOrderByEager != null) {
      opRefObjOrderByEager.close();
      opRefObjOrderByEager = null;
    }
    if (opRefObjOrderByLazy != null) {
      opRefObjOrderByLazy.close();
      opRefObjOrderByLazy = null;
    }
  }

  public static AddObjectOperation addOpRefObjOrderBy(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.OrderBy detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpRefObjOrderBy");
    command.setDetailProperty("RefObj");
    return command;
  }

  public static RemoveObjectOperation rmOpRefObjOrderBy(
      org.tura.model.designer.repository.serialized.metabase.MetaObject master,
      org.tura.model.designer.repository.serialized.form.OrderBy detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpRefObjOrderBy");
    command.setDetailProperty("RefObj");
    return command;
  }

  private EagerList<OrderBy> opRefObjOrderByEager;

  public List<OrderBy> getOpRefObjOrderByEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opRefObjOrderByEager == null) {
      opRefObjOrderByEager =
          new EagerList<OrderBy>(
              org.tura.model.designer.repository.serialized.form.OrderBy.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i, org.tura.model.designer.repository.serialized.form.OrderBy opRefObjOrderBy) {
              if (opRefObjOrderBy == null) {
                return;
              }
              if (opRefObjOrderBy != null
                  && (opRefObjOrderBy.getAttached() == null || !opRefObjOrderBy.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opRefObjOrderBy);
                  repository.insert(opRefObjOrderBy, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.DataControlProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpRefObjOrderBy(DataControlProxy.this, opRefObjOrderBy);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opRefObjOrderBy);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              OrderBy opRefObjOrderBy = (OrderBy) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opRefObjOrderBy);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpRefObjOrderBy(DataControlProxy.this, opRefObjOrderBy);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public OrderBy remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpRefObjOrderBy(DataControlProxy.this, get(index));
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.remove(index);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
                return null;
              } catch (Exception e) {
                throw new RuntimeException(e);
              } finally {
                removeLocalStackProvider(session);
              }
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "9aad0734-a04c-48ba-b372-2885482154f1";
            }
          };
    }
    return opRefObjOrderByEager;
  }

  private LazyList<OrderBy> opRefObjOrderByLazy;

  public List<OrderBy> getOpRefObjOrderByLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opRefObjOrderByLazy == null) {
      opRefObjOrderByLazy =
          new LazyList<OrderBy>(
              org.tura.model.designer.repository.serialized.form.OrderBy.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public List<OrderCriteria> getLazyObjectOrderCriteria() {
              return new ArrayList<>();
            }

            @Override
            public List<SearchCriteria> getLazyObjectSearchCriteria() {
              ArrayList<SearchCriteria> search = new ArrayList<>();
              search.add(
                  new SearchCriteria(
                      "refOpRefObjOrderByMetaObject",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMetaObject(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i, org.tura.model.designer.repository.serialized.form.OrderBy opRefObjOrderBy) {
              if (opRefObjOrderBy == null) {
                return;
              }
              getOpRefObjOrderByEager().add(i, opRefObjOrderBy);
              super.add(i, opRefObjOrderBy);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              OrderBy opRefObjOrderBy = (OrderBy) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opRefObjOrderBy);
                if (valid.isRemovable() && valid.getIndex() != -1) {
                  this.remove(valid.getIndex());
                  return true;
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
              if (valid.isRemovable() && valid.getIndex() == -1) {
                String session = UUID.randomUUID().toString();
                try {
                  ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                  RemoveObjectOperation command =
                      rmOpRefObjOrderBy(DataControlProxy.this, opRefObjOrderBy);
                  command.setStackProvider(localStackProvider);
                  if (command.prepare()) {
                    List<Object> changes = localStackProvider.get().getListOfCommand();
                    localStackProvider.get().commit();
                    if (getAttached() != null && getAttached()) {
                      repository.getStackProvider().get().addCommands(changes);
                    }
                  }
                  return true;
                } catch (Exception e) {
                  throw new RuntimeException(e);
                } finally {
                  removeLocalStackProvider(session);
                }
              }
              return false;
            }

            @Override
            public OrderBy remove(int index) {
              super.remove(index);
              return getOpRefObjOrderByEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return DataControlProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "9aad0734-a04c-48ba-b372-2885482154f1";
            }
          };
    }
    return opRefObjOrderByLazy;
  }

  private ProxyCommadStackProvider getLocalStackProvider(String session) {
    ProxyCommadStackProvider localStackProvider = stackMap.get(session);
    if (localStackProvider == null) {
      localStackProvider =
          new LocalCommadStackProvider(
              new RegistryProvider() {

                private static final long serialVersionUID = 1L;

                @Override
                public Registry get() {
                  return getRegistry();
                }
              });
      stackMap.put(session, localStackProvider);
      localStackProvider
          .get()
          .getEventSubscribersProvider()
          .get()
          .addProxyCommandStackEventListener(session, new LocalRepositoryCommitListener(session));
    }
    return localStackProvider;
  }

  private void removeLocalStackProvider(String session) {
    stackMap.remove(session);
  }

  private class LocalRepositoryCommitListener extends ProxyCommandStackEventListener {

    private static final long serialVersionUID = 1L;

    private String session;

    LocalRepositoryCommitListener(String session) {
      this.session = session;
    }

    public void beforeCommit() throws Exception {
      List<Object> changes = getLocalStackProvider(session).get().getListOfCommand();
      repository.getLocalRepository().applyChanges(changes);
    }
  }
}
