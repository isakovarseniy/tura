/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import org.tura.model.designer.repository.serialized.form.mapper.UielementProxyMapper;
import org.tura.platform.repository.cpa.EClass;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.operation.UpdateObjectOperation;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import java.util.List;
import org.tura.platform.repository.proxy.access.EagerSingleObject;
import org.tura.platform.repository.operation.RemoveContainmentObjectOperation;
import org.tura.platform.repository.operation.AddContainmentObjectOperation;
import org.tura.platform.repository.proxy.access.LazySingleObject;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.proxy.access.EagerList;
import org.tura.platform.repository.proxy.access.DelStruc;
import org.tura.platform.repository.proxy.access.LazyList;
import org.tura.platform.repository.operation.AddObjectOperation;
import org.tura.platform.repository.operation.RemoveObjectOperation;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class UielementProxy extends Uielement
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

  public UielementProxy(
      org.tura.model.designer.repository.serialized.form.Uielement object,
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

  public UielementProxy(UielementProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.requiredLazySingleObject = proxy.requiredLazySingleObject;
    this.requiredEagerSingleObject = proxy.requiredEagerSingleObject;
    this.readOnlyLazySingleObject = proxy.readOnlyLazySingleObject;
    this.readOnlyEagerSingleObject = proxy.readOnlyEagerSingleObject;
    this.refreshAreasLazy = proxy.refreshAreasLazy;
    this.refreshAreasEager = proxy.refreshAreasEager;
    this.opChildrenChildrenHolderLazySingleObject = proxy.opChildrenChildrenHolderLazySingleObject;
    this.opChildrenChildrenHolderEagerSingleObject =
        proxy.opChildrenChildrenHolderEagerSingleObject;
    this.opElementColumnLazySingleObject = proxy.opElementColumnLazySingleObject;
    this.opElementColumnEagerSingleObject = proxy.opElementColumnEagerSingleObject;
    this.styleLazySingleObject = proxy.styleLazySingleObject;
    this.styleEagerSingleObject = proxy.styleEagerSingleObject;
    this.opAreaAreaRefLazy = proxy.opAreaAreaRefLazy;
    this.opAreaAreaRefEager = proxy.opAreaAreaRefEager;
    this.classifiersEager = proxy.classifiersEager;
    this.enabledLazySingleObject = proxy.enabledLazySingleObject;
    this.enabledEagerSingleObject = proxy.enabledEagerSingleObject;
    this.fieldsLazy = proxy.fieldsLazy;
    this.fieldsEager = proxy.fieldsEager;
    this.menuLazySingleObject = proxy.menuLazySingleObject;
    this.menuEagerSingleObject = proxy.menuEagerSingleObject;
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
    if ("required".equals(name)) {
      cleanRequired();
    }
    if ("readOnly".equals(name)) {
      cleanReadOnly();
    }
    if ("refreshAreas".equals(name)) {
      cleanRefreshAreas();
    }
    if ("opChildrenChildrenHolder".equals(name)) {
      cleanOpChildrenChildrenHolder();
    }
    if ("opElementColumn".equals(name)) {
      cleanOpElementColumn();
    }
    if ("style".equals(name)) {
      cleanStyle();
    }
    if ("opAreaAreaRef".equals(name)) {
      cleanOpAreaAreaRef();
    }
    if ("classifiers".equals(name)) {
      cleanClassifiers();
    }
    if ("enabled".equals(name)) {
      cleanEnabled();
    }
    if ("fields".equals(name)) {
      cleanFields();
    }
    if ("menu".equals(name)) {
      cleanMenu();
    }
  }

  public void setViewModelId1(Integer viewModelId1) {
    this.viewModelId1 = viewModelId1;
  }

  public Integer getViewModelId1() {
    return viewModelId1;
  }

  public UielementProxy inMemory() {
    UielementProxy inMProxy = new UielementProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.form.Uielement.class;
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

  public Uielement clone() {
    try {
      return (Uielement)
          new UielementProxyMapper(repository.getRegistry()).copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public Uielement deepClone() {
    try {
      return (Uielement)
          new UielementProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public Uielement deepClone(java.util.Map<Object, Object> context) {
    try {
      return (Uielement)
          new UielementProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    UielementProxyMapper mapper = new UielementProxyMapper(repository.getRegistry());
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
    return new EClass("Uielement");
  }

  public Object eContainer() {
    UielementProxy memPrx = new UielementProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpChildrenChildrenHolder();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpElementColumn();
    if (container != null) {
      return container;
    }
    container = this.getOpChildrenChildrenHolder();
    if (container != null) {
      return container;
    }
    container = this.getOpElementColumn();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof UielementProxy) {
      return this.getKey().equals(((UielementProxy) o).getKey());
    } else {
      if (o instanceof Uielement) {
        Uielement obj = (Uielement) o;
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

  private Uielement getObject() {
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

  private String getKey(org.tura.model.designer.repository.serialized.form.Uielement object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.form.Uielement");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new UielementProxyMapper(repository.getRegistry()).getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.Uielement");
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
    return new UielementProxyMapper(repository.getRegistry()).getPath(this.getObject());
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
    str = str + " suid = " + getObject().getSuidStyleElement();
    str = str + " nickname = " + getObject().getNickname();
    str = str + " order = " + getObject().getOrder();
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
      if (((ObjectControl) this.getRequiredEager()) != null) {
        ((ObjectControl) this.getRequiredEager()).setAttached(true);
      }
      if (((ObjectControl) this.getReadOnlyEager()) != null) {
        ((ObjectControl) this.getReadOnlyEager()).setAttached(true);
      }
      for (AreaRef t : this.getRefreshAreasEager()) {
        ((ObjectControl) t).setAttached(true);
      }
      if (((ObjectControl) this.getStyleEager()) != null) {
        ((ObjectControl) this.getStyleEager()).setAttached(true);
      }
      for (Classifier t : this.getClassifiersEager()) {
        ((ObjectControl) t).setAttached(true);
      }
      if (((ObjectControl) this.getEnabledEager()) != null) {
        ((ObjectControl) this.getEnabledEager()).setAttached(true);
      }
      for (FlexField t : this.getFieldsEager()) {
        ((ObjectControl) t).setAttached(true);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefChildrenChildrenHolder() {
    return this.getObject().getTransientrefChildrenChildrenHolder();
  }

  @Override
  public void setTransientrefChildrenChildrenHolder(java.lang.String refChildrenChildrenHolder) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefChildrenChildrenHolder",
              this.getObject().getTransientrefChildrenChildrenHolder(),
              refChildrenChildrenHolder,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefChildrenChildrenHolder");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefElementColumn() {
    return this.getObject().getTransientrefElementColumn();
  }

  @Override
  public void setTransientrefElementColumn(java.lang.String refElementColumn) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefElementColumn",
              this.getObject().getTransientrefElementColumn(),
              refElementColumn,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefElementColumn");
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

  public void setRequired(org.tura.model.designer.repository.serialized.form.Context required) {
    this.setRequiredEager(required);
  }

  public Context getRequired() {
    if (inMemory) {
      return this.getRequiredEager();
    } else {
      return this.getRequiredLazy();
    }
  }

  public void cleanRequired() throws IOException {
    if (requiredLazySingleObject != null) {
      requiredLazySingleObject.close();
      requiredLazySingleObject = null;
    }
    if (requiredEagerSingleObject != null) {
      requiredEagerSingleObject.close();
      requiredEagerSingleObject = null;
    }
  }

  private EagerSingleObject<Context> requiredEagerSingleObject;

  public static RemoveContainmentObjectOperation rmRequired(
      org.tura.model.designer.repository.serialized.form.Uielement master,
      org.tura.model.designer.repository.serialized.form.Context detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("Required");
    command.setDetailProperty("OpRequiredUielement");
    return command;
  }

  public static AddContainmentObjectOperation addRequired(
      org.tura.model.designer.repository.serialized.form.Uielement master,
      org.tura.model.designer.repository.serialized.form.Context detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("Required");
    command.setDetailProperty("OpRequiredUielement");
    return command;
  }

  public Context getRequiredEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (requiredEagerSingleObject == null) {
      requiredEagerSingleObject =
          new EagerSingleObject<Context>(
              org.tura.model.designer.repository.serialized.form.Context.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return requiredEagerSingleObject.get(this.getCpaPath(), "ebceb22a-59c3-4bbc-b01a-634a49148e7f");
  }

  private void setRequiredEager(
      org.tura.model.designer.repository.serialized.form.Context required) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (required != null) {
        saveAttached = ((ObjectControl) required).getAttached();
        ((ObjectControl) required).setAttached(this.getAttached());
      }
      if (this.getRequiredEager() != null) {
        RemoveContainmentObjectOperation command = rmRequired(this, this.getRequiredEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (required != null) {
        AddContainmentObjectOperation command2 = addRequired(this, required);
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
      if (required != null) {
        ((ObjectControl) required).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<Context> requiredLazySingleObject;

  private Context getRequiredLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (requiredLazySingleObject == null) {
      requiredLazySingleObject =
          new LazySingleObject<Context>(
              org.tura.model.designer.repository.serialized.form.Context.class,
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
                      "refRequiredUielement",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return requiredLazySingleObject.get(this.getCpaPath(), "ebceb22a-59c3-4bbc-b01a-634a49148e7f");
  }

  public void setReadOnly(org.tura.model.designer.repository.serialized.form.Context readOnly) {
    this.setReadOnlyEager(readOnly);
  }

  public Context getReadOnly() {
    if (inMemory) {
      return this.getReadOnlyEager();
    } else {
      return this.getReadOnlyLazy();
    }
  }

  public void cleanReadOnly() throws IOException {
    if (readOnlyLazySingleObject != null) {
      readOnlyLazySingleObject.close();
      readOnlyLazySingleObject = null;
    }
    if (readOnlyEagerSingleObject != null) {
      readOnlyEagerSingleObject.close();
      readOnlyEagerSingleObject = null;
    }
  }

  private EagerSingleObject<Context> readOnlyEagerSingleObject;

  public static RemoveContainmentObjectOperation rmReadOnly(
      org.tura.model.designer.repository.serialized.form.Uielement master,
      org.tura.model.designer.repository.serialized.form.Context detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("ReadOnly");
    command.setDetailProperty("OpReadOnlyUielement");
    return command;
  }

  public static AddContainmentObjectOperation addReadOnly(
      org.tura.model.designer.repository.serialized.form.Uielement master,
      org.tura.model.designer.repository.serialized.form.Context detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("ReadOnly");
    command.setDetailProperty("OpReadOnlyUielement");
    return command;
  }

  public Context getReadOnlyEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (readOnlyEagerSingleObject == null) {
      readOnlyEagerSingleObject =
          new EagerSingleObject<Context>(
              org.tura.model.designer.repository.serialized.form.Context.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return readOnlyEagerSingleObject.get(this.getCpaPath(), "c5eba772-31e7-407b-a6a7-d4d40a0e778c");
  }

  private void setReadOnlyEager(
      org.tura.model.designer.repository.serialized.form.Context readOnly) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (readOnly != null) {
        saveAttached = ((ObjectControl) readOnly).getAttached();
        ((ObjectControl) readOnly).setAttached(this.getAttached());
      }
      if (this.getReadOnlyEager() != null) {
        RemoveContainmentObjectOperation command = rmReadOnly(this, this.getReadOnlyEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (readOnly != null) {
        AddContainmentObjectOperation command2 = addReadOnly(this, readOnly);
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
      if (readOnly != null) {
        ((ObjectControl) readOnly).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<Context> readOnlyLazySingleObject;

  private Context getReadOnlyLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (readOnlyLazySingleObject == null) {
      readOnlyLazySingleObject =
          new LazySingleObject<Context>(
              org.tura.model.designer.repository.serialized.form.Context.class,
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
                      "refReadOnlyUielement",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return readOnlyLazySingleObject.get(this.getCpaPath(), "c5eba772-31e7-407b-a6a7-d4d40a0e778c");
  }

  public List<AreaRef> getRefreshAreas() {
    if (inMemory) {
      return getRefreshAreasEager();
    } else {
      return getRefreshAreasLazy();
    }
  }

  public void cleanRefreshAreas() throws IOException {
    if (refreshAreasEager != null) {
      refreshAreasEager.close();
      refreshAreasEager = null;
    }
    if (refreshAreasLazy != null) {
      refreshAreasLazy.close();
      refreshAreasLazy = null;
    }
  }

  public static AddContainmentObjectOperation addRefreshAreas(
      org.tura.model.designer.repository.serialized.form.Uielement master,
      org.tura.model.designer.repository.serialized.form.AreaRef detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("RefreshAreas");
    command.setDetailProperty("OpRefreshAreasUielement");
    return command;
  }

  public static RemoveContainmentObjectOperation rmRefreshAreas(
      org.tura.model.designer.repository.serialized.form.Uielement master,
      org.tura.model.designer.repository.serialized.form.AreaRef detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("RefreshAreas");
    command.setDetailProperty("OpRefreshAreasUielement");
    return command;
  }

  private EagerList<AreaRef> refreshAreasEager;

  public List<AreaRef> getRefreshAreasEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (refreshAreasEager == null) {
      refreshAreasEager =
          new EagerList<AreaRef>(
              org.tura.model.designer.repository.serialized.form.AreaRef.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i, org.tura.model.designer.repository.serialized.form.AreaRef refreshAreas) {
              if (refreshAreas == null) {
                return;
              }
              Boolean saveAttached = false;
              if (refreshAreas != null) {
                saveAttached = ((ObjectControl) refreshAreas).getAttached();
                ((ObjectControl) refreshAreas).setAttached(getAttached());
                ;
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddContainmentObjectOperation command =
                    addRefreshAreas(UielementProxy.this, refreshAreas);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, refreshAreas);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                if (refreshAreas != null) {
                  ((ObjectControl) refreshAreas).setAttached(saveAttached);
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
              AreaRef refreshAreas = (AreaRef) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(refreshAreas);
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
                      rmRefreshAreas(UielementProxy.this, refreshAreas);
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
            public AreaRef remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveContainmentObjectOperation command =
                    rmRefreshAreas(UielementProxy.this, get(index));
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
              return UielementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "daf24c37-836a-4380-815b-6028e086439c";
            }
          };
    }
    return refreshAreasEager;
  }

  private LazyList<AreaRef> refreshAreasLazy;

  public List<AreaRef> getRefreshAreasLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (refreshAreasLazy == null) {
      refreshAreasLazy =
          new LazyList<AreaRef>(
              org.tura.model.designer.repository.serialized.form.AreaRef.class,
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
                      "refRefreshAreasUielement",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i, org.tura.model.designer.repository.serialized.form.AreaRef refreshAreas) {
              if (refreshAreas == null) {
                return;
              }
              getRefreshAreasEager().add(i, refreshAreas);
              super.add(i, refreshAreas);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              AreaRef refreshAreas = (AreaRef) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(refreshAreas);
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
                      rmRefreshAreas(UielementProxy.this, refreshAreas);
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
            public AreaRef remove(int index) {
              super.remove(index);
              return getRefreshAreasEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return UielementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "daf24c37-836a-4380-815b-6028e086439c";
            }
          };
    }
    return refreshAreasLazy;
  }

  @Override
  public void setOpChildrenChildrenHolder(
      org.tura.model.designer.repository.serialized.form.ChildrenHolder opChildrenChildrenHolder) {
    this.setOpChildrenChildrenHolderEager(opChildrenChildrenHolder);
  }

  @Override
  public ChildrenHolder getOpChildrenChildrenHolder() {
    if (inMemory) {
      return this.getOpChildrenChildrenHolderEager();
    } else {
      return this.getOpChildrenChildrenHolderLazy();
    }
  }

  public void cleanOpChildrenChildrenHolder() throws IOException {
    if (opChildrenChildrenHolderEagerSingleObject != null) {
      opChildrenChildrenHolderEagerSingleObject.close();
      opChildrenChildrenHolderEagerSingleObject = null;
    }
    if (opChildrenChildrenHolderLazySingleObject != null) {
      opChildrenChildrenHolderLazySingleObject.close();
      opChildrenChildrenHolderLazySingleObject = null;
    }
  }

  private EagerSingleObject<ChildrenHolder> opChildrenChildrenHolderEagerSingleObject;

  public ChildrenHolder getOpChildrenChildrenHolderEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opChildrenChildrenHolderEagerSingleObject == null) {
      opChildrenChildrenHolderEagerSingleObject =
          new EagerSingleObject<ChildrenHolder>(
              org.tura.model.designer.repository.serialized.form.ChildrenHolder.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opChildrenChildrenHolderEagerSingleObject.get(
        this.getCpaPath(), "cc436a8b-cbdd-4570-bd03-20f502e2f563");
  }

  private void setOpChildrenChildrenHolderEager(
      org.tura.model.designer.repository.serialized.form.ChildrenHolder opChildrenChildrenHolder) {
    if (opChildrenChildrenHolder != null) {
      opChildrenChildrenHolder.getChildren().add(this);
    }
  }

  private LazySingleObject<ChildrenHolder> opChildrenChildrenHolderLazySingleObject;

  private ChildrenHolder getOpChildrenChildrenHolderLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opChildrenChildrenHolderLazySingleObject == null) {
      opChildrenChildrenHolderLazySingleObject =
          new LazySingleObject<ChildrenHolder>(
              org.tura.model.designer.repository.serialized.form.ChildrenHolder.class,
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
                      "suid",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getTransientRefChildrenChildrenHolder(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opChildrenChildrenHolderLazySingleObject.get(
        this.getCpaPath(), "cc436a8b-cbdd-4570-bd03-20f502e2f563");
  }

  @Override
  public void setOpElementColumn(
      org.tura.model.designer.repository.serialized.form.Column opElementColumn) {
    this.setOpElementColumnEager(opElementColumn);
  }

  @Override
  public Column getOpElementColumn() {
    if (inMemory) {
      return this.getOpElementColumnEager();
    } else {
      return this.getOpElementColumnLazy();
    }
  }

  public void cleanOpElementColumn() throws IOException {
    if (opElementColumnEagerSingleObject != null) {
      opElementColumnEagerSingleObject.close();
      opElementColumnEagerSingleObject = null;
    }
    if (opElementColumnLazySingleObject != null) {
      opElementColumnLazySingleObject.close();
      opElementColumnLazySingleObject = null;
    }
  }

  private EagerSingleObject<Column> opElementColumnEagerSingleObject;

  public Column getOpElementColumnEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opElementColumnEagerSingleObject == null) {
      opElementColumnEagerSingleObject =
          new EagerSingleObject<Column>(
              org.tura.model.designer.repository.serialized.form.Column.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opElementColumnEagerSingleObject.get(
        this.getCpaPath(), "93e08144-a5d7-43bd-a30d-95f3e659f639");
  }

  private void setOpElementColumnEager(
      org.tura.model.designer.repository.serialized.form.Column opElementColumn) {
    if (opElementColumn != null) {
      opElementColumn.setElement(this);
    }
  }

  private LazySingleObject<Column> opElementColumnLazySingleObject;

  private Column getOpElementColumnLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opElementColumnLazySingleObject == null) {
      opElementColumnLazySingleObject =
          new LazySingleObject<Column>(
              org.tura.model.designer.repository.serialized.form.Column.class,
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
                      getTransientRefElementColumn(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opElementColumnLazySingleObject.get(
        this.getCpaPath(), "93e08144-a5d7-43bd-a30d-95f3e659f639");
  }

  @Override
  public String getSuidStyleElement() {
    return this.getObject().getSuidStyleElement();
  }

  public void setStyle(org.tura.model.designer.repository.serialized.form.Context style) {
    this.setStyleEager(style);
  }

  public Context getStyle() {
    if (inMemory) {
      return this.getStyleEager();
    } else {
      return this.getStyleLazy();
    }
  }

  public void cleanStyle() throws IOException {
    if (styleLazySingleObject != null) {
      styleLazySingleObject.close();
      styleLazySingleObject = null;
    }
    if (styleEagerSingleObject != null) {
      styleEagerSingleObject.close();
      styleEagerSingleObject = null;
    }
  }

  private EagerSingleObject<Context> styleEagerSingleObject;

  public static RemoveContainmentObjectOperation rmStyle(
      org.tura.model.designer.repository.serialized.form.StyleElement master,
      org.tura.model.designer.repository.serialized.form.Context detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("Style");
    command.setDetailProperty("OpStyleStyleElement");
    return command;
  }

  public static AddContainmentObjectOperation addStyle(
      org.tura.model.designer.repository.serialized.form.StyleElement master,
      org.tura.model.designer.repository.serialized.form.Context detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("Style");
    command.setDetailProperty("OpStyleStyleElement");
    return command;
  }

  public Context getStyleEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (styleEagerSingleObject == null) {
      styleEagerSingleObject =
          new EagerSingleObject<Context>(
              org.tura.model.designer.repository.serialized.form.Context.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return styleEagerSingleObject.get(this.getCpaPath(), "b04e4269-0ab9-4463-bc8b-9717bae47ec6");
  }

  private void setStyleEager(org.tura.model.designer.repository.serialized.form.Context style) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (style != null) {
        saveAttached = ((ObjectControl) style).getAttached();
        ((ObjectControl) style).setAttached(this.getAttached());
      }
      if (this.getStyleEager() != null) {
        RemoveContainmentObjectOperation command = rmStyle(this, this.getStyleEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (style != null) {
        AddContainmentObjectOperation command2 = addStyle(this, style);
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
      if (style != null) {
        ((ObjectControl) style).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<Context> styleLazySingleObject;

  private Context getStyleLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (styleLazySingleObject == null) {
      styleLazySingleObject =
          new LazySingleObject<Context>(
              org.tura.model.designer.repository.serialized.form.Context.class,
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
                      "refStyleStyleElement",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidStyleElement(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return styleLazySingleObject.get(this.getCpaPath(), "b04e4269-0ab9-4463-bc8b-9717bae47ec6");
  }

  @Override
  public String getSuidNickNamed() {
    return this.getObject().getSuidNickNamed();
  }

  @Override
  public String getNickname() {
    return this.getObject().getNickname();
  }

  @Override
  public void setNickname(java.lang.String nickname) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "Nickname",
              this.getObject().getNickname(),
              nickname,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "nickname");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  public List<AreaRef> getOpAreaAreaRef() {
    if (inMemory) {
      return getOpAreaAreaRefEager();
    } else {
      return getOpAreaAreaRefLazy();
    }
  }

  public void cleanOpAreaAreaRef() throws IOException {
    if (opAreaAreaRefEager != null) {
      opAreaAreaRefEager.close();
      opAreaAreaRefEager = null;
    }
    if (opAreaAreaRefLazy != null) {
      opAreaAreaRefLazy.close();
      opAreaAreaRefLazy = null;
    }
  }

  public static AddObjectOperation addOpAreaAreaRef(
      org.tura.model.designer.repository.serialized.form.NickNamed master,
      org.tura.model.designer.repository.serialized.form.AreaRef detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpAreaAreaRef");
    command.setDetailProperty("Area");
    return command;
  }

  public static RemoveObjectOperation rmOpAreaAreaRef(
      org.tura.model.designer.repository.serialized.form.NickNamed master,
      org.tura.model.designer.repository.serialized.form.AreaRef detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpAreaAreaRef");
    command.setDetailProperty("Area");
    return command;
  }

  private EagerList<AreaRef> opAreaAreaRefEager;

  public List<AreaRef> getOpAreaAreaRefEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opAreaAreaRefEager == null) {
      opAreaAreaRefEager =
          new EagerList<AreaRef>(
              org.tura.model.designer.repository.serialized.form.AreaRef.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i, org.tura.model.designer.repository.serialized.form.AreaRef opAreaAreaRef) {
              if (opAreaAreaRef == null) {
                return;
              }
              if (opAreaAreaRef != null
                  && (opAreaAreaRef.getAttached() == null || !opAreaAreaRef.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opAreaAreaRef);
                  repository.insert(opAreaAreaRef, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.form.UielementProxy.this,
                      org.tura.model.designer.repository.serialized.form.NickNamed.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command = addOpAreaAreaRef(UielementProxy.this, opAreaAreaRef);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opAreaAreaRef);
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
              AreaRef opAreaAreaRef = (AreaRef) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opAreaAreaRef);
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
                      rmOpAreaAreaRef(UielementProxy.this, opAreaAreaRef);
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
            public AreaRef remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command = rmOpAreaAreaRef(UielementProxy.this, get(index));
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
              return UielementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "47ccbb30-42b9-45c5-bdbe-b4a840bb9021";
            }
          };
    }
    return opAreaAreaRefEager;
  }

  private LazyList<AreaRef> opAreaAreaRefLazy;

  public List<AreaRef> getOpAreaAreaRefLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opAreaAreaRefLazy == null) {
      opAreaAreaRefLazy =
          new LazyList<AreaRef>(
              org.tura.model.designer.repository.serialized.form.AreaRef.class,
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
                      "refOpAreaAreaRefNickNamed",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidNickNamed(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i, org.tura.model.designer.repository.serialized.form.AreaRef opAreaAreaRef) {
              if (opAreaAreaRef == null) {
                return;
              }
              getOpAreaAreaRefEager().add(i, opAreaAreaRef);
              super.add(i, opAreaAreaRef);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              AreaRef opAreaAreaRef = (AreaRef) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opAreaAreaRef);
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
                      rmOpAreaAreaRef(UielementProxy.this, opAreaAreaRef);
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
            public AreaRef remove(int index) {
              super.remove(index);
              return getOpAreaAreaRefEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return UielementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "47ccbb30-42b9-45c5-bdbe-b4a840bb9021";
            }
          };
    }
    return opAreaAreaRefLazy;
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
                    addClassifiers(UielementProxy.this, classifiers);
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
                      rmClassifiers(UielementProxy.this, classifiers);
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
                    rmClassifiers(UielementProxy.this, get(index));
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
              return UielementProxy.this.getCpaPath();
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
  public String getSuidOrderable() {
    return this.getObject().getSuidOrderable();
  }

  @Override
  public Integer getOrder() {
    return this.getObject().getOrder();
  }

  @Override
  public void setOrder(java.lang.Integer order) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "Order",
              this.getObject().getOrder(),
              order,
              java.lang.Integer.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "order");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getSuidEnabledUIItem() {
    return this.getObject().getSuidEnabledUIItem();
  }

  public void setEnabled(org.tura.model.designer.repository.serialized.form.Context enabled) {
    this.setEnabledEager(enabled);
  }

  public Context getEnabled() {
    if (inMemory) {
      return this.getEnabledEager();
    } else {
      return this.getEnabledLazy();
    }
  }

  public void cleanEnabled() throws IOException {
    if (enabledLazySingleObject != null) {
      enabledLazySingleObject.close();
      enabledLazySingleObject = null;
    }
    if (enabledEagerSingleObject != null) {
      enabledEagerSingleObject.close();
      enabledEagerSingleObject = null;
    }
  }

  private EagerSingleObject<Context> enabledEagerSingleObject;

  public static RemoveContainmentObjectOperation rmEnabled(
      org.tura.model.designer.repository.serialized.form.EnabledUIItem master,
      org.tura.model.designer.repository.serialized.form.Context detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("Enabled");
    command.setDetailProperty("OpEnabledEnabledUIItem");
    return command;
  }

  public static AddContainmentObjectOperation addEnabled(
      org.tura.model.designer.repository.serialized.form.EnabledUIItem master,
      org.tura.model.designer.repository.serialized.form.Context detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("Enabled");
    command.setDetailProperty("OpEnabledEnabledUIItem");
    return command;
  }

  public Context getEnabledEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (enabledEagerSingleObject == null) {
      enabledEagerSingleObject =
          new EagerSingleObject<Context>(
              org.tura.model.designer.repository.serialized.form.Context.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return enabledEagerSingleObject.get(this.getCpaPath(), "40f34656-da59-4211-b0d8-3fcf0f2a64b4");
  }

  private void setEnabledEager(org.tura.model.designer.repository.serialized.form.Context enabled) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (enabled != null) {
        saveAttached = ((ObjectControl) enabled).getAttached();
        ((ObjectControl) enabled).setAttached(this.getAttached());
      }
      if (this.getEnabledEager() != null) {
        RemoveContainmentObjectOperation command = rmEnabled(this, this.getEnabledEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (enabled != null) {
        AddContainmentObjectOperation command2 = addEnabled(this, enabled);
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
      if (enabled != null) {
        ((ObjectControl) enabled).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<Context> enabledLazySingleObject;

  private Context getEnabledLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (enabledLazySingleObject == null) {
      enabledLazySingleObject =
          new LazySingleObject<Context>(
              org.tura.model.designer.repository.serialized.form.Context.class,
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
                      "refEnabledEnabledUIItem",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidEnabledUIItem(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return enabledLazySingleObject.get(this.getCpaPath(), "40f34656-da59-4211-b0d8-3fcf0f2a64b4");
  }

  @Override
  public String getSuidFlexFields() {
    return this.getObject().getSuidFlexFields();
  }

  public List<FlexField> getFields() {
    if (inMemory) {
      return getFieldsEager();
    } else {
      return getFieldsLazy();
    }
  }

  public void cleanFields() throws IOException {
    if (fieldsEager != null) {
      fieldsEager.close();
      fieldsEager = null;
    }
    if (fieldsLazy != null) {
      fieldsLazy.close();
      fieldsLazy = null;
    }
  }

  public static AddContainmentObjectOperation addFields(
      org.tura.model.designer.repository.serialized.form.FlexFields master,
      org.tura.model.designer.repository.serialized.form.FlexField detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("Fields");
    command.setDetailProperty("OpFieldsFlexFields");
    return command;
  }

  public static RemoveContainmentObjectOperation rmFields(
      org.tura.model.designer.repository.serialized.form.FlexFields master,
      org.tura.model.designer.repository.serialized.form.FlexField detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("Fields");
    command.setDetailProperty("OpFieldsFlexFields");
    return command;
  }

  private EagerList<FlexField> fieldsEager;

  public List<FlexField> getFieldsEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (fieldsEager == null) {
      fieldsEager =
          new EagerList<FlexField>(
              org.tura.model.designer.repository.serialized.form.FlexField.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i, org.tura.model.designer.repository.serialized.form.FlexField fields) {
              if (fields == null) {
                return;
              }
              Boolean saveAttached = false;
              if (fields != null) {
                saveAttached = ((ObjectControl) fields).getAttached();
                ((ObjectControl) fields).setAttached(getAttached());
                ;
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddContainmentObjectOperation command = addFields(UielementProxy.this, fields);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, fields);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                if (fields != null) {
                  ((ObjectControl) fields).setAttached(saveAttached);
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
              FlexField fields = (FlexField) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(fields);
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
                  RemoveContainmentObjectOperation command = rmFields(UielementProxy.this, fields);
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
            public FlexField remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveContainmentObjectOperation command =
                    rmFields(UielementProxy.this, get(index));
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
              return UielementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "6ed5ba2a-8b06-4f91-aef9-83c9c9117dfa";
            }
          };
    }
    return fieldsEager;
  }

  private LazyList<FlexField> fieldsLazy;

  public List<FlexField> getFieldsLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (fieldsLazy == null) {
      fieldsLazy =
          new LazyList<FlexField>(
              org.tura.model.designer.repository.serialized.form.FlexField.class,
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
                      "refFieldsFlexFields",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidFlexFields(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i, org.tura.model.designer.repository.serialized.form.FlexField fields) {
              if (fields == null) {
                return;
              }
              getFieldsEager().add(i, fields);
              super.add(i, fields);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              FlexField fields = (FlexField) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(fields);
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
                  RemoveContainmentObjectOperation command = rmFields(UielementProxy.this, fields);
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
            public FlexField remove(int index) {
              super.remove(index);
              return getFieldsEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return UielementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "6ed5ba2a-8b06-4f91-aef9-83c9c9117dfa";
            }
          };
    }
    return fieldsLazy;
  }

  private String getTransientRefOpMenuMenuHolderMenuFolder() {
    return this.getObject().getTransientrefOpMenuMenuHolderMenuFolder();
  }

  @Override
  public void setTransientrefOpMenuMenuHolderMenuFolder(
      java.lang.String refOpMenuMenuHolderMenuFolder) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefOpMenuMenuHolderMenuFolder",
              this.getObject().getTransientrefOpMenuMenuHolderMenuFolder(),
              refOpMenuMenuHolderMenuFolder,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefOpMenuMenuHolderMenuFolder");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getSuidMenuHolder() {
    return this.getObject().getSuidMenuHolder();
  }

  @Override
  public void setMenu(org.tura.model.designer.repository.serialized.form.MenuFolder menu) {
    this.setMenuEager(menu);
  }

  @Override
  public MenuFolder getMenu() {
    if (inMemory) {
      return this.getMenuEager();
    } else {
      return this.getMenuLazy();
    }
  }

  public void cleanMenu() throws IOException {
    if (menuEagerSingleObject != null) {
      menuEagerSingleObject.close();
      menuEagerSingleObject = null;
    }
    if (menuLazySingleObject != null) {
      menuLazySingleObject.close();
      menuLazySingleObject = null;
    }
  }

  private EagerSingleObject<MenuFolder> menuEagerSingleObject;

  public MenuFolder getMenuEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (menuEagerSingleObject == null) {
      menuEagerSingleObject =
          new EagerSingleObject<MenuFolder>(
              org.tura.model.designer.repository.serialized.form.MenuFolder.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return menuEagerSingleObject.get(this.getCpaPath(), "1b4e48c8-e605-4186-94e8-c834f732c46f");
  }

  private void setMenuEager(org.tura.model.designer.repository.serialized.form.MenuFolder menu) {
    if (menu != null) {
      menu.getOpMenuMenuHolder().add(this);
    }
  }

  private LazySingleObject<MenuFolder> menuLazySingleObject;

  private MenuFolder getMenuLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (menuLazySingleObject == null) {
      menuLazySingleObject =
          new LazySingleObject<MenuFolder>(
              org.tura.model.designer.repository.serialized.form.MenuFolder.class,
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
                      getTransientRefOpMenuMenuHolderMenuFolder(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return menuLazySingleObject.get(this.getCpaPath(), "1b4e48c8-e605-4186-94e8-c834f732c46f");
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
