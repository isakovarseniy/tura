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

package org.tura.model.designer.repository.serialized.infra;

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
import org.tura.model.designer.repository.serialized.infra.mapper.InfrastructureComponentProxyMapper;
import org.tura.platform.repository.cpa.EClass;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.operation.UpdateObjectOperation;
import java.util.List;
import org.tura.platform.repository.operation.AddObjectOperation;
import org.tura.platform.repository.operation.RemoveObjectOperation;
import org.tura.platform.repository.proxy.access.EagerList;
import org.tura.platform.repository.proxy.access.DelStruc;
import org.tura.platform.repository.proxy.access.LazyList;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.proxy.access.EagerSingleObject;
import org.tura.platform.repository.proxy.access.LazySingleObject;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class InfrastructureComponentProxy extends InfrastructureComponent
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

  public InfrastructureComponentProxy(
      org.tura.model.designer.repository.serialized.infra.InfrastructureComponent object,
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

  public InfrastructureComponentProxy(InfrastructureComponentProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.opSourceInfrastructureConnectionLazy = proxy.opSourceInfrastructureConnectionLazy;
    this.opSourceInfrastructureConnectionEager = proxy.opSourceInfrastructureConnectionEager;
    this.opTargetInfrastructureConnectionLazy = proxy.opTargetInfrastructureConnectionLazy;
    this.opTargetInfrastructureConnectionEager = proxy.opTargetInfrastructureConnectionEager;
    this.opInfrastructureComponentInfrastructureLayerLazySingleObject =
        proxy.opInfrastructureComponentInfrastructureLayerLazySingleObject;
    this.opInfrastructureComponentInfrastructureLayerEagerSingleObject =
        proxy.opInfrastructureComponentInfrastructureLayerEagerSingleObject;
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
    if ("opSourceInfrastructureConnection".equals(name)) {
      cleanOpSourceInfrastructureConnection();
    }
    if ("opTargetInfrastructureConnection".equals(name)) {
      cleanOpTargetInfrastructureConnection();
    }
    if ("opInfrastructureComponentInfrastructureLayer".equals(name)) {
      cleanOpInfrastructureComponentInfrastructureLayer();
    }
  }

  public void setViewModelId1(Integer viewModelId1) {
    this.viewModelId1 = viewModelId1;
  }

  public Integer getViewModelId1() {
    return viewModelId1;
  }

  public InfrastructureComponentProxy inMemory() {
    InfrastructureComponentProxy inMProxy = new InfrastructureComponentProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.infra.InfrastructureComponent.class;
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

  public InfrastructureComponent clone() {
    try {
      return (InfrastructureComponent)
          new InfrastructureComponentProxyMapper(repository.getRegistry())
              .copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public InfrastructureComponent deepClone() {
    try {
      return (InfrastructureComponent)
          new InfrastructureComponentProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public InfrastructureComponent deepClone(java.util.Map<Object, Object> context) {
    try {
      return (InfrastructureComponent)
          new InfrastructureComponentProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    InfrastructureComponentProxyMapper mapper =
        new InfrastructureComponentProxyMapper(repository.getRegistry());
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
    return new EClass("InfrastructureComponent");
  }

  public Object eContainer() {
    InfrastructureComponentProxy memPrx = new InfrastructureComponentProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpInfrastructureComponentInfrastructureLayer();
    if (container != null) {
      return container;
    }
    container = this.getOpInfrastructureComponentInfrastructureLayer();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof InfrastructureComponentProxy) {
      return this.getKey().equals(((InfrastructureComponentProxy) o).getKey());
    } else {
      if (o instanceof InfrastructureComponent) {
        InfrastructureComponent obj = (InfrastructureComponent) o;
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

  private InfrastructureComponent getObject() {
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

  private String getKey(
      org.tura.model.designer.repository.serialized.infra.InfrastructureComponent object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.infra.InfrastructureComponent");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new InfrastructureComponentProxyMapper(repository.getRegistry())
        .getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.infra.InfrastructureComponent");
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
    return new InfrastructureComponentProxyMapper(repository.getRegistry())
        .getPath(this.getObject());
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
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefInfrastructureComponentInfrastructureLayer() {
    return this.getObject().getTransientrefInfrastructureComponentInfrastructureLayer();
  }

  @Override
  public void setTransientrefInfrastructureComponentInfrastructureLayer(
      java.lang.String refInfrastructureComponentInfrastructureLayer) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefInfrastructureComponentInfrastructureLayer",
              this.getObject().getTransientrefInfrastructureComponentInfrastructureLayer(),
              refInfrastructureComponentInfrastructureLayer,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefInfrastructureComponentInfrastructureLayer");
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

  public List<InfrastructureConnection> getOpSourceInfrastructureConnection() {
    if (inMemory) {
      return getOpSourceInfrastructureConnectionEager();
    } else {
      return getOpSourceInfrastructureConnectionLazy();
    }
  }

  public void cleanOpSourceInfrastructureConnection() throws IOException {
    if (opSourceInfrastructureConnectionEager != null) {
      opSourceInfrastructureConnectionEager.close();
      opSourceInfrastructureConnectionEager = null;
    }
    if (opSourceInfrastructureConnectionLazy != null) {
      opSourceInfrastructureConnectionLazy.close();
      opSourceInfrastructureConnectionLazy = null;
    }
  }

  public static AddObjectOperation addOpSourceInfrastructureConnection(
      org.tura.model.designer.repository.serialized.infra.InfrastructureComponent master,
      org.tura.model.designer.repository.serialized.infra.InfrastructureConnection detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpSourceInfrastructureConnection");
    command.setDetailProperty("Source");
    return command;
  }

  public static RemoveObjectOperation rmOpSourceInfrastructureConnection(
      org.tura.model.designer.repository.serialized.infra.InfrastructureComponent master,
      org.tura.model.designer.repository.serialized.infra.InfrastructureConnection detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpSourceInfrastructureConnection");
    command.setDetailProperty("Source");
    return command;
  }

  private EagerList<InfrastructureConnection> opSourceInfrastructureConnectionEager;

  public List<InfrastructureConnection> getOpSourceInfrastructureConnectionEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opSourceInfrastructureConnectionEager == null) {
      opSourceInfrastructureConnectionEager =
          new EagerList<InfrastructureConnection>(
              org.tura.model.designer.repository.serialized.infra.InfrastructureConnection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.infra.InfrastructureConnection
                    opSourceInfrastructureConnection) {
              if (opSourceInfrastructureConnection == null) {
                return;
              }
              if (opSourceInfrastructureConnection != null
                  && (opSourceInfrastructureConnection.getAttached() == null
                      || !opSourceInfrastructureConnection.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opSourceInfrastructureConnection);
                  repository.insert(opSourceInfrastructureConnection, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.infra
                          .InfrastructureComponentProxy.this,
                      org.tura.model.designer.repository.serialized.infra.InfrastructureComponent
                          .class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpSourceInfrastructureConnection(
                        InfrastructureComponentProxy.this, opSourceInfrastructureConnection);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opSourceInfrastructureConnection);
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
              InfrastructureConnection opSourceInfrastructureConnection =
                  (InfrastructureConnection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opSourceInfrastructureConnection);
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
                      rmOpSourceInfrastructureConnection(
                          InfrastructureComponentProxy.this, opSourceInfrastructureConnection);
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
            public InfrastructureConnection remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpSourceInfrastructureConnection(
                        InfrastructureComponentProxy.this, get(index));
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
              return InfrastructureComponentProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "d75c995f-192d-4369-93e5-3df81466c280";
            }
          };
    }
    return opSourceInfrastructureConnectionEager;
  }

  private LazyList<InfrastructureConnection> opSourceInfrastructureConnectionLazy;

  public List<InfrastructureConnection> getOpSourceInfrastructureConnectionLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opSourceInfrastructureConnectionLazy == null) {
      opSourceInfrastructureConnectionLazy =
          new LazyList<InfrastructureConnection>(
              org.tura.model.designer.repository.serialized.infra.InfrastructureConnection.class,
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
                      "refOpSourceInfrastructureConnectionInfrastructureComponent",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.infra.InfrastructureConnection
                    opSourceInfrastructureConnection) {
              if (opSourceInfrastructureConnection == null) {
                return;
              }
              getOpSourceInfrastructureConnectionEager().add(i, opSourceInfrastructureConnection);
              super.add(i, opSourceInfrastructureConnection);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              InfrastructureConnection opSourceInfrastructureConnection =
                  (InfrastructureConnection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opSourceInfrastructureConnection);
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
                      rmOpSourceInfrastructureConnection(
                          InfrastructureComponentProxy.this, opSourceInfrastructureConnection);
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
            public InfrastructureConnection remove(int index) {
              super.remove(index);
              return getOpSourceInfrastructureConnectionEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return InfrastructureComponentProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "d75c995f-192d-4369-93e5-3df81466c280";
            }
          };
    }
    return opSourceInfrastructureConnectionLazy;
  }

  public List<InfrastructureConnection> getOpTargetInfrastructureConnection() {
    if (inMemory) {
      return getOpTargetInfrastructureConnectionEager();
    } else {
      return getOpTargetInfrastructureConnectionLazy();
    }
  }

  public void cleanOpTargetInfrastructureConnection() throws IOException {
    if (opTargetInfrastructureConnectionEager != null) {
      opTargetInfrastructureConnectionEager.close();
      opTargetInfrastructureConnectionEager = null;
    }
    if (opTargetInfrastructureConnectionLazy != null) {
      opTargetInfrastructureConnectionLazy.close();
      opTargetInfrastructureConnectionLazy = null;
    }
  }

  public static AddObjectOperation addOpTargetInfrastructureConnection(
      org.tura.model.designer.repository.serialized.infra.InfrastructureComponent master,
      org.tura.model.designer.repository.serialized.infra.InfrastructureConnection detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTargetInfrastructureConnection");
    command.setDetailProperty("Target");
    return command;
  }

  public static RemoveObjectOperation rmOpTargetInfrastructureConnection(
      org.tura.model.designer.repository.serialized.infra.InfrastructureComponent master,
      org.tura.model.designer.repository.serialized.infra.InfrastructureConnection detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTargetInfrastructureConnection");
    command.setDetailProperty("Target");
    return command;
  }

  private EagerList<InfrastructureConnection> opTargetInfrastructureConnectionEager;

  public List<InfrastructureConnection> getOpTargetInfrastructureConnectionEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTargetInfrastructureConnectionEager == null) {
      opTargetInfrastructureConnectionEager =
          new EagerList<InfrastructureConnection>(
              org.tura.model.designer.repository.serialized.infra.InfrastructureConnection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.infra.InfrastructureConnection
                    opTargetInfrastructureConnection) {
              if (opTargetInfrastructureConnection == null) {
                return;
              }
              if (opTargetInfrastructureConnection != null
                  && (opTargetInfrastructureConnection.getAttached() == null
                      || !opTargetInfrastructureConnection.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opTargetInfrastructureConnection);
                  repository.insert(opTargetInfrastructureConnection, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.infra
                          .InfrastructureComponentProxy.this,
                      org.tura.model.designer.repository.serialized.infra.InfrastructureComponent
                          .class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpTargetInfrastructureConnection(
                        InfrastructureComponentProxy.this, opTargetInfrastructureConnection);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opTargetInfrastructureConnection);
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
              InfrastructureConnection opTargetInfrastructureConnection =
                  (InfrastructureConnection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTargetInfrastructureConnection);
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
                      rmOpTargetInfrastructureConnection(
                          InfrastructureComponentProxy.this, opTargetInfrastructureConnection);
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
            public InfrastructureConnection remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpTargetInfrastructureConnection(
                        InfrastructureComponentProxy.this, get(index));
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
              return InfrastructureComponentProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "f779f9a3-8c67-4a35-85c7-5072d3694afb";
            }
          };
    }
    return opTargetInfrastructureConnectionEager;
  }

  private LazyList<InfrastructureConnection> opTargetInfrastructureConnectionLazy;

  public List<InfrastructureConnection> getOpTargetInfrastructureConnectionLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTargetInfrastructureConnectionLazy == null) {
      opTargetInfrastructureConnectionLazy =
          new LazyList<InfrastructureConnection>(
              org.tura.model.designer.repository.serialized.infra.InfrastructureConnection.class,
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
                      "refOpTargetInfrastructureConnectionInfrastructureComponent",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.infra.InfrastructureConnection
                    opTargetInfrastructureConnection) {
              if (opTargetInfrastructureConnection == null) {
                return;
              }
              getOpTargetInfrastructureConnectionEager().add(i, opTargetInfrastructureConnection);
              super.add(i, opTargetInfrastructureConnection);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              InfrastructureConnection opTargetInfrastructureConnection =
                  (InfrastructureConnection) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTargetInfrastructureConnection);
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
                      rmOpTargetInfrastructureConnection(
                          InfrastructureComponentProxy.this, opTargetInfrastructureConnection);
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
            public InfrastructureConnection remove(int index) {
              super.remove(index);
              return getOpTargetInfrastructureConnectionEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return InfrastructureComponentProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "f779f9a3-8c67-4a35-85c7-5072d3694afb";
            }
          };
    }
    return opTargetInfrastructureConnectionLazy;
  }

  @Override
  public void setOpInfrastructureComponentInfrastructureLayer(
      org.tura.model.designer.repository.serialized.infra.InfrastructureLayer
          opInfrastructureComponentInfrastructureLayer) {
    this.setOpInfrastructureComponentInfrastructureLayerEager(
        opInfrastructureComponentInfrastructureLayer);
  }

  @Override
  public InfrastructureLayer getOpInfrastructureComponentInfrastructureLayer() {
    if (inMemory) {
      return this.getOpInfrastructureComponentInfrastructureLayerEager();
    } else {
      return this.getOpInfrastructureComponentInfrastructureLayerLazy();
    }
  }

  public void cleanOpInfrastructureComponentInfrastructureLayer() throws IOException {
    if (opInfrastructureComponentInfrastructureLayerEagerSingleObject != null) {
      opInfrastructureComponentInfrastructureLayerEagerSingleObject.close();
      opInfrastructureComponentInfrastructureLayerEagerSingleObject = null;
    }
    if (opInfrastructureComponentInfrastructureLayerLazySingleObject != null) {
      opInfrastructureComponentInfrastructureLayerLazySingleObject.close();
      opInfrastructureComponentInfrastructureLayerLazySingleObject = null;
    }
  }

  private EagerSingleObject<InfrastructureLayer>
      opInfrastructureComponentInfrastructureLayerEagerSingleObject;

  public InfrastructureLayer getOpInfrastructureComponentInfrastructureLayerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opInfrastructureComponentInfrastructureLayerEagerSingleObject == null) {
      opInfrastructureComponentInfrastructureLayerEagerSingleObject =
          new EagerSingleObject<InfrastructureLayer>(
              org.tura.model.designer.repository.serialized.infra.InfrastructureLayer.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opInfrastructureComponentInfrastructureLayerEagerSingleObject.get(
        this.getCpaPath(), "906fed5b-6922-428f-a0ae-e5408add96d3");
  }

  private void setOpInfrastructureComponentInfrastructureLayerEager(
      org.tura.model.designer.repository.serialized.infra.InfrastructureLayer
          opInfrastructureComponentInfrastructureLayer) {
    if (opInfrastructureComponentInfrastructureLayer != null) {
      opInfrastructureComponentInfrastructureLayer.getInfrastructureComponent().add(this);
    }
  }

  private LazySingleObject<InfrastructureLayer>
      opInfrastructureComponentInfrastructureLayerLazySingleObject;

  private InfrastructureLayer getOpInfrastructureComponentInfrastructureLayerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opInfrastructureComponentInfrastructureLayerLazySingleObject == null) {
      opInfrastructureComponentInfrastructureLayerLazySingleObject =
          new LazySingleObject<InfrastructureLayer>(
              org.tura.model.designer.repository.serialized.infra.InfrastructureLayer.class,
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
                      getTransientRefInfrastructureComponentInfrastructureLayer(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opInfrastructureComponentInfrastructureLayerLazySingleObject.get(
        this.getCpaPath(), "906fed5b-6922-428f-a0ae-e5408add96d3");
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
