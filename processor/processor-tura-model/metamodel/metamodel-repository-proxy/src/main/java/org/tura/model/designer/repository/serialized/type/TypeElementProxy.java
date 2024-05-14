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

package org.tura.model.designer.repository.serialized.type;

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
import org.tura.model.designer.repository.serialized.type.mapper.TypeElementProxyMapper;
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
import org.tura.model.designer.repository.serialized.objectmapper.OmRelation;
import org.tura.model.designer.repository.serialized.form.RelationMapper;
import org.tura.platform.repository.proxy.access.EagerSingleObject;
import org.tura.platform.repository.proxy.access.LazySingleObject;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class TypeElementProxy extends TypeElement
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

  public TypeElementProxy(
      org.tura.model.designer.repository.serialized.type.TypeElement object,
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

  public TypeElementProxy(TypeElementProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.opSourceRelationshipLazy = proxy.opSourceRelationshipLazy;
    this.opSourceRelationshipEager = proxy.opSourceRelationshipEager;
    this.opTargetRelationshipLazy = proxy.opTargetRelationshipLazy;
    this.opTargetRelationshipEager = proxy.opTargetRelationshipEager;
    this.opTypeRefTypePointerLazy = proxy.opTypeRefTypePointerLazy;
    this.opTypeRefTypePointerEager = proxy.opTypeRefTypePointerEager;
    this.opTypeRefOmRelationLazy = proxy.opTypeRefOmRelationLazy;
    this.opTypeRefOmRelationEager = proxy.opTypeRefOmRelationEager;
    this.opTypeRefRelationMapperLazy = proxy.opTypeRefRelationMapperLazy;
    this.opTypeRefRelationMapperEager = proxy.opTypeRefRelationMapperEager;
    this.opTypesTypeGroupLazySingleObject = proxy.opTypesTypeGroupLazySingleObject;
    this.opTypesTypeGroupEagerSingleObject = proxy.opTypesTypeGroupEagerSingleObject;
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
    if ("opSourceRelationship".equals(name)) {
      cleanOpSourceRelationship();
    }
    if ("opTargetRelationship".equals(name)) {
      cleanOpTargetRelationship();
    }
    if ("opTypeRefTypePointer".equals(name)) {
      cleanOpTypeRefTypePointer();
    }
    if ("opTypeRefOmRelation".equals(name)) {
      cleanOpTypeRefOmRelation();
    }
    if ("opTypeRefRelationMapper".equals(name)) {
      cleanOpTypeRefRelationMapper();
    }
    if ("opTypesTypeGroup".equals(name)) {
      cleanOpTypesTypeGroup();
    }
  }

  public void setViewModelId1(Integer viewModelId1) {
    this.viewModelId1 = viewModelId1;
  }

  public Integer getViewModelId1() {
    return viewModelId1;
  }

  public TypeElementProxy inMemory() {
    TypeElementProxy inMProxy = new TypeElementProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.type.TypeElement.class;
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

  public TypeElement clone() {
    try {
      return (TypeElement)
          new TypeElementProxyMapper(repository.getRegistry()).copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public TypeElement deepClone() {
    try {
      return (TypeElement)
          new TypeElementProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public TypeElement deepClone(java.util.Map<Object, Object> context) {
    try {
      return (TypeElement)
          new TypeElementProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    TypeElementProxyMapper mapper = new TypeElementProxyMapper(repository.getRegistry());
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
    return new EClass("TypeElement");
  }

  public Object eContainer() {
    TypeElementProxy memPrx = new TypeElementProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpTypesTypeGroup();
    if (container != null) {
      return container;
    }
    container = this.getOpTypesTypeGroup();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof TypeElementProxy) {
      return this.getKey().equals(((TypeElementProxy) o).getKey());
    } else {
      if (o instanceof TypeElement) {
        TypeElement obj = (TypeElement) o;
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

  private TypeElement getObject() {
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

  private String getKey(org.tura.model.designer.repository.serialized.type.TypeElement object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.type.TypeElement");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new TypeElementProxyMapper(repository.getRegistry()).getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.type.TypeElement");
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
    return new TypeElementProxyMapper(repository.getRegistry()).getPath(this.getObject());
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
    str = str + " keyId = " + getObject().getKeyId();
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

  private String getTransientRefTypesTypeGroup() {
    return this.getObject().getTransientrefTypesTypeGroup();
  }

  @Override
  public void setTransientrefTypesTypeGroup(java.lang.String refTypesTypeGroup) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefTypesTypeGroup",
              this.getObject().getTransientrefTypesTypeGroup(),
              refTypesTypeGroup,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefTypesTypeGroup");
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
  public String getKeyId() {
    return this.getObject().getKeyId();
  }

  @Override
  public void setKeyId(java.lang.String keyId) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "KeyId",
              this.getObject().getKeyId(),
              keyId,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "keyId");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
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

  public List<Relationship> getOpSourceRelationship() {
    if (inMemory) {
      return getOpSourceRelationshipEager();
    } else {
      return getOpSourceRelationshipLazy();
    }
  }

  public void cleanOpSourceRelationship() throws IOException {
    if (opSourceRelationshipEager != null) {
      opSourceRelationshipEager.close();
      opSourceRelationshipEager = null;
    }
    if (opSourceRelationshipLazy != null) {
      opSourceRelationshipLazy.close();
      opSourceRelationshipLazy = null;
    }
  }

  public static AddObjectOperation addOpSourceRelationship(
      org.tura.model.designer.repository.serialized.type.TypeElement master,
      org.tura.model.designer.repository.serialized.type.Relationship detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpSourceRelationship");
    command.setDetailProperty("Source");
    return command;
  }

  public static RemoveObjectOperation rmOpSourceRelationship(
      org.tura.model.designer.repository.serialized.type.TypeElement master,
      org.tura.model.designer.repository.serialized.type.Relationship detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpSourceRelationship");
    command.setDetailProperty("Source");
    return command;
  }

  private EagerList<Relationship> opSourceRelationshipEager;

  public List<Relationship> getOpSourceRelationshipEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opSourceRelationshipEager == null) {
      opSourceRelationshipEager =
          new EagerList<Relationship>(
              org.tura.model.designer.repository.serialized.type.Relationship.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.type.Relationship
                    opSourceRelationship) {
              if (opSourceRelationship == null) {
                return;
              }
              if (opSourceRelationship != null
                  && (opSourceRelationship.getAttached() == null
                      || !opSourceRelationship.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opSourceRelationship);
                  repository.insert(opSourceRelationship, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.type.TypeElementProxy.this,
                      org.tura.model.designer.repository.serialized.type.TypeElement.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpSourceRelationship(TypeElementProxy.this, opSourceRelationship);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opSourceRelationship);
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
              Relationship opSourceRelationship = (Relationship) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opSourceRelationship);
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
                      rmOpSourceRelationship(TypeElementProxy.this, opSourceRelationship);
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
            public Relationship remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpSourceRelationship(TypeElementProxy.this, get(index));
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
              return TypeElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "20b77333-64e4-4ec0-937f-c0e93eaa5873";
            }
          };
    }
    return opSourceRelationshipEager;
  }

  private LazyList<Relationship> opSourceRelationshipLazy;

  public List<Relationship> getOpSourceRelationshipLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opSourceRelationshipLazy == null) {
      opSourceRelationshipLazy =
          new LazyList<Relationship>(
              org.tura.model.designer.repository.serialized.type.Relationship.class,
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
                      "refOpSourceRelationshipTypeElement",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.type.Relationship
                    opSourceRelationship) {
              if (opSourceRelationship == null) {
                return;
              }
              getOpSourceRelationshipEager().add(i, opSourceRelationship);
              super.add(i, opSourceRelationship);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Relationship opSourceRelationship = (Relationship) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opSourceRelationship);
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
                      rmOpSourceRelationship(TypeElementProxy.this, opSourceRelationship);
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
            public Relationship remove(int index) {
              super.remove(index);
              return getOpSourceRelationshipEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return TypeElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "20b77333-64e4-4ec0-937f-c0e93eaa5873";
            }
          };
    }
    return opSourceRelationshipLazy;
  }

  public List<Relationship> getOpTargetRelationship() {
    if (inMemory) {
      return getOpTargetRelationshipEager();
    } else {
      return getOpTargetRelationshipLazy();
    }
  }

  public void cleanOpTargetRelationship() throws IOException {
    if (opTargetRelationshipEager != null) {
      opTargetRelationshipEager.close();
      opTargetRelationshipEager = null;
    }
    if (opTargetRelationshipLazy != null) {
      opTargetRelationshipLazy.close();
      opTargetRelationshipLazy = null;
    }
  }

  public static AddObjectOperation addOpTargetRelationship(
      org.tura.model.designer.repository.serialized.type.TypeElement master,
      org.tura.model.designer.repository.serialized.type.Relationship detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTargetRelationship");
    command.setDetailProperty("Target");
    return command;
  }

  public static RemoveObjectOperation rmOpTargetRelationship(
      org.tura.model.designer.repository.serialized.type.TypeElement master,
      org.tura.model.designer.repository.serialized.type.Relationship detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTargetRelationship");
    command.setDetailProperty("Target");
    return command;
  }

  private EagerList<Relationship> opTargetRelationshipEager;

  public List<Relationship> getOpTargetRelationshipEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTargetRelationshipEager == null) {
      opTargetRelationshipEager =
          new EagerList<Relationship>(
              org.tura.model.designer.repository.serialized.type.Relationship.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.type.Relationship
                    opTargetRelationship) {
              if (opTargetRelationship == null) {
                return;
              }
              if (opTargetRelationship != null
                  && (opTargetRelationship.getAttached() == null
                      || !opTargetRelationship.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opTargetRelationship);
                  repository.insert(opTargetRelationship, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.type.TypeElementProxy.this,
                      org.tura.model.designer.repository.serialized.type.TypeElement.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpTargetRelationship(TypeElementProxy.this, opTargetRelationship);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opTargetRelationship);
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
              Relationship opTargetRelationship = (Relationship) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTargetRelationship);
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
                      rmOpTargetRelationship(TypeElementProxy.this, opTargetRelationship);
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
            public Relationship remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpTargetRelationship(TypeElementProxy.this, get(index));
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
              return TypeElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "01f9192e-2bc6-40ea-9c1f-e4133f3b2a3a";
            }
          };
    }
    return opTargetRelationshipEager;
  }

  private LazyList<Relationship> opTargetRelationshipLazy;

  public List<Relationship> getOpTargetRelationshipLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTargetRelationshipLazy == null) {
      opTargetRelationshipLazy =
          new LazyList<Relationship>(
              org.tura.model.designer.repository.serialized.type.Relationship.class,
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
                      "refOpTargetRelationshipTypeElement",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.type.Relationship
                    opTargetRelationship) {
              if (opTargetRelationship == null) {
                return;
              }
              getOpTargetRelationshipEager().add(i, opTargetRelationship);
              super.add(i, opTargetRelationship);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              Relationship opTargetRelationship = (Relationship) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTargetRelationship);
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
                      rmOpTargetRelationship(TypeElementProxy.this, opTargetRelationship);
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
            public Relationship remove(int index) {
              super.remove(index);
              return getOpTargetRelationshipEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return TypeElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "01f9192e-2bc6-40ea-9c1f-e4133f3b2a3a";
            }
          };
    }
    return opTargetRelationshipLazy;
  }

  public List<TypePointer> getOpTypeRefTypePointer() {
    if (inMemory) {
      return getOpTypeRefTypePointerEager();
    } else {
      return getOpTypeRefTypePointerLazy();
    }
  }

  public void cleanOpTypeRefTypePointer() throws IOException {
    if (opTypeRefTypePointerEager != null) {
      opTypeRefTypePointerEager.close();
      opTypeRefTypePointerEager = null;
    }
    if (opTypeRefTypePointerLazy != null) {
      opTypeRefTypePointerLazy.close();
      opTypeRefTypePointerLazy = null;
    }
  }

  public static AddObjectOperation addOpTypeRefTypePointer(
      org.tura.model.designer.repository.serialized.type.TypeElement master,
      org.tura.model.designer.repository.serialized.type.TypePointer detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTypeRefTypePointer");
    command.setDetailProperty("TypeRef");
    return command;
  }

  public static RemoveObjectOperation rmOpTypeRefTypePointer(
      org.tura.model.designer.repository.serialized.type.TypeElement master,
      org.tura.model.designer.repository.serialized.type.TypePointer detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTypeRefTypePointer");
    command.setDetailProperty("TypeRef");
    return command;
  }

  private EagerList<TypePointer> opTypeRefTypePointerEager;

  public List<TypePointer> getOpTypeRefTypePointerEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTypeRefTypePointerEager == null) {
      opTypeRefTypePointerEager =
          new EagerList<TypePointer>(
              org.tura.model.designer.repository.serialized.type.TypePointer.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.type.TypePointer
                    opTypeRefTypePointer) {
              if (opTypeRefTypePointer == null) {
                return;
              }
              if (opTypeRefTypePointer != null
                  && (opTypeRefTypePointer.getAttached() == null
                      || !opTypeRefTypePointer.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opTypeRefTypePointer);
                  repository.insert(opTypeRefTypePointer, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.type.TypeElementProxy.this,
                      org.tura.model.designer.repository.serialized.type.TypeElement.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpTypeRefTypePointer(TypeElementProxy.this, opTypeRefTypePointer);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opTypeRefTypePointer);
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
              TypePointer opTypeRefTypePointer = (TypePointer) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTypeRefTypePointer);
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
                      rmOpTypeRefTypePointer(TypeElementProxy.this, opTypeRefTypePointer);
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
            public TypePointer remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpTypeRefTypePointer(TypeElementProxy.this, get(index));
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
              return TypeElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "0711687a-6c21-4561-b355-b6c2b5a7cfe8";
            }
          };
    }
    return opTypeRefTypePointerEager;
  }

  private LazyList<TypePointer> opTypeRefTypePointerLazy;

  public List<TypePointer> getOpTypeRefTypePointerLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTypeRefTypePointerLazy == null) {
      opTypeRefTypePointerLazy =
          new LazyList<TypePointer>(
              org.tura.model.designer.repository.serialized.type.TypePointer.class,
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
                      "refOpTypeRefTypePointerTypeElement",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.type.TypePointer
                    opTypeRefTypePointer) {
              if (opTypeRefTypePointer == null) {
                return;
              }
              getOpTypeRefTypePointerEager().add(i, opTypeRefTypePointer);
              super.add(i, opTypeRefTypePointer);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              TypePointer opTypeRefTypePointer = (TypePointer) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTypeRefTypePointer);
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
                      rmOpTypeRefTypePointer(TypeElementProxy.this, opTypeRefTypePointer);
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
            public TypePointer remove(int index) {
              super.remove(index);
              return getOpTypeRefTypePointerEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return TypeElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "0711687a-6c21-4561-b355-b6c2b5a7cfe8";
            }
          };
    }
    return opTypeRefTypePointerLazy;
  }

  public List<OmRelation> getOpTypeRefOmRelation() {
    if (inMemory) {
      return getOpTypeRefOmRelationEager();
    } else {
      return getOpTypeRefOmRelationLazy();
    }
  }

  public void cleanOpTypeRefOmRelation() throws IOException {
    if (opTypeRefOmRelationEager != null) {
      opTypeRefOmRelationEager.close();
      opTypeRefOmRelationEager = null;
    }
    if (opTypeRefOmRelationLazy != null) {
      opTypeRefOmRelationLazy.close();
      opTypeRefOmRelationLazy = null;
    }
  }

  public static AddObjectOperation addOpTypeRefOmRelation(
      org.tura.model.designer.repository.serialized.type.TypeElement master,
      org.tura.model.designer.repository.serialized.objectmapper.OmRelation detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTypeRefOmRelation");
    command.setDetailProperty("TypeRef");
    return command;
  }

  public static RemoveObjectOperation rmOpTypeRefOmRelation(
      org.tura.model.designer.repository.serialized.type.TypeElement master,
      org.tura.model.designer.repository.serialized.objectmapper.OmRelation detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTypeRefOmRelation");
    command.setDetailProperty("TypeRef");
    return command;
  }

  private EagerList<OmRelation> opTypeRefOmRelationEager;

  public List<OmRelation> getOpTypeRefOmRelationEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTypeRefOmRelationEager == null) {
      opTypeRefOmRelationEager =
          new EagerList<OmRelation>(
              org.tura.model.designer.repository.serialized.objectmapper.OmRelation.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.objectmapper.OmRelation
                    opTypeRefOmRelation) {
              if (opTypeRefOmRelation == null) {
                return;
              }
              if (opTypeRefOmRelation != null
                  && (opTypeRefOmRelation.getAttached() == null
                      || !opTypeRefOmRelation.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opTypeRefOmRelation);
                  repository.insert(opTypeRefOmRelation, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.type.TypeElementProxy.this,
                      org.tura.model.designer.repository.serialized.type.TypeElement.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpTypeRefOmRelation(TypeElementProxy.this, opTypeRefOmRelation);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opTypeRefOmRelation);
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
              OmRelation opTypeRefOmRelation = (OmRelation) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTypeRefOmRelation);
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
                      rmOpTypeRefOmRelation(TypeElementProxy.this, opTypeRefOmRelation);
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
            public OmRelation remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpTypeRefOmRelation(TypeElementProxy.this, get(index));
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
              return TypeElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "ad93eed2-c565-462f-aecb-7cc697e2308a";
            }
          };
    }
    return opTypeRefOmRelationEager;
  }

  private LazyList<OmRelation> opTypeRefOmRelationLazy;

  public List<OmRelation> getOpTypeRefOmRelationLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTypeRefOmRelationLazy == null) {
      opTypeRefOmRelationLazy =
          new LazyList<OmRelation>(
              org.tura.model.designer.repository.serialized.objectmapper.OmRelation.class,
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
                      "refOpTypeRefOmRelationTypeElement",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.objectmapper.OmRelation
                    opTypeRefOmRelation) {
              if (opTypeRefOmRelation == null) {
                return;
              }
              getOpTypeRefOmRelationEager().add(i, opTypeRefOmRelation);
              super.add(i, opTypeRefOmRelation);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              OmRelation opTypeRefOmRelation = (OmRelation) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTypeRefOmRelation);
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
                      rmOpTypeRefOmRelation(TypeElementProxy.this, opTypeRefOmRelation);
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
            public OmRelation remove(int index) {
              super.remove(index);
              return getOpTypeRefOmRelationEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return TypeElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "ad93eed2-c565-462f-aecb-7cc697e2308a";
            }
          };
    }
    return opTypeRefOmRelationLazy;
  }

  public List<RelationMapper> getOpTypeRefRelationMapper() {
    if (inMemory) {
      return getOpTypeRefRelationMapperEager();
    } else {
      return getOpTypeRefRelationMapperLazy();
    }
  }

  public void cleanOpTypeRefRelationMapper() throws IOException {
    if (opTypeRefRelationMapperEager != null) {
      opTypeRefRelationMapperEager.close();
      opTypeRefRelationMapperEager = null;
    }
    if (opTypeRefRelationMapperLazy != null) {
      opTypeRefRelationMapperLazy.close();
      opTypeRefRelationMapperLazy = null;
    }
  }

  public static AddObjectOperation addOpTypeRefRelationMapper(
      org.tura.model.designer.repository.serialized.type.TypeElement master,
      org.tura.model.designer.repository.serialized.form.RelationMapper detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTypeRefRelationMapper");
    command.setDetailProperty("TypeRef");
    return command;
  }

  public static RemoveObjectOperation rmOpTypeRefRelationMapper(
      org.tura.model.designer.repository.serialized.type.TypeElement master,
      org.tura.model.designer.repository.serialized.form.RelationMapper detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpTypeRefRelationMapper");
    command.setDetailProperty("TypeRef");
    return command;
  }

  private EagerList<RelationMapper> opTypeRefRelationMapperEager;

  public List<RelationMapper> getOpTypeRefRelationMapperEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTypeRefRelationMapperEager == null) {
      opTypeRefRelationMapperEager =
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
                    opTypeRefRelationMapper) {
              if (opTypeRefRelationMapper == null) {
                return;
              }
              if (opTypeRefRelationMapper != null
                  && (opTypeRefRelationMapper.getAttached() == null
                      || !opTypeRefRelationMapper.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opTypeRefRelationMapper);
                  repository.insert(opTypeRefRelationMapper, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.type.TypeElementProxy.this,
                      org.tura.model.designer.repository.serialized.type.TypeElement.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpTypeRefRelationMapper(TypeElementProxy.this, opTypeRefRelationMapper);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opTypeRefRelationMapper);
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
              RelationMapper opTypeRefRelationMapper = (RelationMapper) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTypeRefRelationMapper);
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
                      rmOpTypeRefRelationMapper(TypeElementProxy.this, opTypeRefRelationMapper);
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
                    rmOpTypeRefRelationMapper(TypeElementProxy.this, get(index));
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
              return TypeElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "0e03d1a7-f0cc-49df-99ef-6098330fb388";
            }
          };
    }
    return opTypeRefRelationMapperEager;
  }

  private LazyList<RelationMapper> opTypeRefRelationMapperLazy;

  public List<RelationMapper> getOpTypeRefRelationMapperLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTypeRefRelationMapperLazy == null) {
      opTypeRefRelationMapperLazy =
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
                      "refOpTypeRefRelationMapperTypeElement",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.RelationMapper
                    opTypeRefRelationMapper) {
              if (opTypeRefRelationMapper == null) {
                return;
              }
              getOpTypeRefRelationMapperEager().add(i, opTypeRefRelationMapper);
              super.add(i, opTypeRefRelationMapper);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              RelationMapper opTypeRefRelationMapper = (RelationMapper) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opTypeRefRelationMapper);
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
                      rmOpTypeRefRelationMapper(TypeElementProxy.this, opTypeRefRelationMapper);
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
              return getOpTypeRefRelationMapperEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return TypeElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "0e03d1a7-f0cc-49df-99ef-6098330fb388";
            }
          };
    }
    return opTypeRefRelationMapperLazy;
  }

  @Override
  public void setOpTypesTypeGroup(
      org.tura.model.designer.repository.serialized.type.TypeGroup opTypesTypeGroup) {
    this.setOpTypesTypeGroupEager(opTypesTypeGroup);
  }

  @Override
  public TypeGroup getOpTypesTypeGroup() {
    if (inMemory) {
      return this.getOpTypesTypeGroupEager();
    } else {
      return this.getOpTypesTypeGroupLazy();
    }
  }

  public void cleanOpTypesTypeGroup() throws IOException {
    if (opTypesTypeGroupEagerSingleObject != null) {
      opTypesTypeGroupEagerSingleObject.close();
      opTypesTypeGroupEagerSingleObject = null;
    }
    if (opTypesTypeGroupLazySingleObject != null) {
      opTypesTypeGroupLazySingleObject.close();
      opTypesTypeGroupLazySingleObject = null;
    }
  }

  private EagerSingleObject<TypeGroup> opTypesTypeGroupEagerSingleObject;

  public TypeGroup getOpTypesTypeGroupEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTypesTypeGroupEagerSingleObject == null) {
      opTypesTypeGroupEagerSingleObject =
          new EagerSingleObject<TypeGroup>(
              org.tura.model.designer.repository.serialized.type.TypeGroup.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opTypesTypeGroupEagerSingleObject.get(
        this.getCpaPath(), "7eaca994-bb25-434a-bf77-978e6a1916ca");
  }

  private void setOpTypesTypeGroupEager(
      org.tura.model.designer.repository.serialized.type.TypeGroup opTypesTypeGroup) {
    if (opTypesTypeGroup != null) {
      opTypesTypeGroup.getTypes().add(this);
    }
  }

  private LazySingleObject<TypeGroup> opTypesTypeGroupLazySingleObject;

  private TypeGroup getOpTypesTypeGroupLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTypesTypeGroupLazySingleObject == null) {
      opTypesTypeGroupLazySingleObject =
          new LazySingleObject<TypeGroup>(
              org.tura.model.designer.repository.serialized.type.TypeGroup.class,
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
                      getTransientRefTypesTypeGroup(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opTypesTypeGroupLazySingleObject.get(
        this.getCpaPath(), "7eaca994-bb25-434a-bf77-978e6a1916ca");
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
