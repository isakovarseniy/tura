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
import org.tura.model.designer.repository.serialized.type.mapper.RelationshipProxyMapper;
import org.tura.platform.repository.cpa.EClass;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.operation.UpdateObjectOperation;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import java.util.List;
import org.tura.platform.repository.proxy.access.EagerSingleObject;
import org.tura.platform.repository.proxy.access.LazySingleObject;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.operation.AddContainmentObjectOperation;
import org.tura.platform.repository.operation.RemoveContainmentObjectOperation;
import org.tura.platform.repository.proxy.access.EagerList;
import org.tura.platform.repository.proxy.access.DelStruc;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class RelationshipProxy extends Relationship
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

  public RelationshipProxy(
      org.tura.model.designer.repository.serialized.type.Relationship object,
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

  public RelationshipProxy(RelationshipProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.opRelationshipsTypeGroupLazySingleObject = proxy.opRelationshipsTypeGroupLazySingleObject;
    this.opRelationshipsTypeGroupEagerSingleObject =
        proxy.opRelationshipsTypeGroupEagerSingleObject;
    this.sourceLazySingleObject = proxy.sourceLazySingleObject;
    this.sourceEagerSingleObject = proxy.sourceEagerSingleObject;
    this.targetLazySingleObject = proxy.targetLazySingleObject;
    this.targetEagerSingleObject = proxy.targetEagerSingleObject;
    this.classifiersEager = proxy.classifiersEager;
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
    if ("opRelationshipsTypeGroup".equals(name)) {
      cleanOpRelationshipsTypeGroup();
    }
    if ("source".equals(name)) {
      cleanSource();
    }
    if ("target".equals(name)) {
      cleanTarget();
    }
    if ("classifiers".equals(name)) {
      cleanClassifiers();
    }
  }

  public void setViewModelId1(Integer viewModelId1) {
    this.viewModelId1 = viewModelId1;
  }

  public Integer getViewModelId1() {
    return viewModelId1;
  }

  public RelationshipProxy inMemory() {
    RelationshipProxy inMProxy = new RelationshipProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.type.Relationship.class;
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

  public Relationship clone() {
    try {
      return (Relationship)
          new RelationshipProxyMapper(repository.getRegistry())
              .copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public Relationship deepClone() {
    try {
      return (Relationship)
          new RelationshipProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public Relationship deepClone(java.util.Map<Object, Object> context) {
    try {
      return (Relationship)
          new RelationshipProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    RelationshipProxyMapper mapper = new RelationshipProxyMapper(repository.getRegistry());
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
    return new EClass("Relationship");
  }

  public Object eContainer() {
    RelationshipProxy memPrx = new RelationshipProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpRelationshipsTypeGroup();
    if (container != null) {
      return container;
    }
    container = this.getOpRelationshipsTypeGroup();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof RelationshipProxy) {
      return this.getKey().equals(((RelationshipProxy) o).getKey());
    } else {
      if (o instanceof Relationship) {
        Relationship obj = (Relationship) o;
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

  private Relationship getObject() {
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

  private String getKey(org.tura.model.designer.repository.serialized.type.Relationship object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.type.Relationship");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new RelationshipProxyMapper(repository.getRegistry()).getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.type.Relationship");
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
    return new RelationshipProxyMapper(repository.getRegistry()).getPath(this.getObject());
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
      for (Classifier t : this.getClassifiersEager()) {
        ((ObjectControl) t).setAttached(true);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefRelationshipsTypeGroup() {
    return this.getObject().getTransientrefRelationshipsTypeGroup();
  }

  @Override
  public void setTransientrefRelationshipsTypeGroup(java.lang.String refRelationshipsTypeGroup) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefRelationshipsTypeGroup",
              this.getObject().getTransientrefRelationshipsTypeGroup(),
              refRelationshipsTypeGroup,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefRelationshipsTypeGroup");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefOpSourceRelationshipTypeElement() {
    return this.getObject().getTransientrefOpSourceRelationshipTypeElement();
  }

  @Override
  public void setTransientrefOpSourceRelationshipTypeElement(
      java.lang.String refOpSourceRelationshipTypeElement) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefOpSourceRelationshipTypeElement",
              this.getObject().getTransientrefOpSourceRelationshipTypeElement(),
              refOpSourceRelationshipTypeElement,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefOpSourceRelationshipTypeElement");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefOpTargetRelationshipTypeElement() {
    return this.getObject().getTransientrefOpTargetRelationshipTypeElement();
  }

  @Override
  public void setTransientrefOpTargetRelationshipTypeElement(
      java.lang.String refOpTargetRelationshipTypeElement) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefOpTargetRelationshipTypeElement",
              this.getObject().getTransientrefOpTargetRelationshipTypeElement(),
              refOpTargetRelationshipTypeElement,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefOpTargetRelationshipTypeElement");
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
  public void setOpRelationshipsTypeGroup(
      org.tura.model.designer.repository.serialized.type.TypeGroup opRelationshipsTypeGroup) {
    this.setOpRelationshipsTypeGroupEager(opRelationshipsTypeGroup);
  }

  @Override
  public TypeGroup getOpRelationshipsTypeGroup() {
    if (inMemory) {
      return this.getOpRelationshipsTypeGroupEager();
    } else {
      return this.getOpRelationshipsTypeGroupLazy();
    }
  }

  public void cleanOpRelationshipsTypeGroup() throws IOException {
    if (opRelationshipsTypeGroupEagerSingleObject != null) {
      opRelationshipsTypeGroupEagerSingleObject.close();
      opRelationshipsTypeGroupEagerSingleObject = null;
    }
    if (opRelationshipsTypeGroupLazySingleObject != null) {
      opRelationshipsTypeGroupLazySingleObject.close();
      opRelationshipsTypeGroupLazySingleObject = null;
    }
  }

  private EagerSingleObject<TypeGroup> opRelationshipsTypeGroupEagerSingleObject;

  public TypeGroup getOpRelationshipsTypeGroupEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opRelationshipsTypeGroupEagerSingleObject == null) {
      opRelationshipsTypeGroupEagerSingleObject =
          new EagerSingleObject<TypeGroup>(
              org.tura.model.designer.repository.serialized.type.TypeGroup.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opRelationshipsTypeGroupEagerSingleObject.get(
        this.getCpaPath(), "e8e6d8ba-6e1e-4cc5-b95d-f55bf1376730");
  }

  private void setOpRelationshipsTypeGroupEager(
      org.tura.model.designer.repository.serialized.type.TypeGroup opRelationshipsTypeGroup) {
    if (opRelationshipsTypeGroup != null) {
      opRelationshipsTypeGroup.getRelationships().add(this);
    }
  }

  private LazySingleObject<TypeGroup> opRelationshipsTypeGroupLazySingleObject;

  private TypeGroup getOpRelationshipsTypeGroupLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opRelationshipsTypeGroupLazySingleObject == null) {
      opRelationshipsTypeGroupLazySingleObject =
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
                      getTransientRefRelationshipsTypeGroup(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opRelationshipsTypeGroupLazySingleObject.get(
        this.getCpaPath(), "e8e6d8ba-6e1e-4cc5-b95d-f55bf1376730");
  }

  @Override
  public void setSource(org.tura.model.designer.repository.serialized.type.TypeElement source) {
    this.setSourceEager(source);
  }

  @Override
  public TypeElement getSource() {
    if (inMemory) {
      return this.getSourceEager();
    } else {
      return this.getSourceLazy();
    }
  }

  public void cleanSource() throws IOException {
    if (sourceEagerSingleObject != null) {
      sourceEagerSingleObject.close();
      sourceEagerSingleObject = null;
    }
    if (sourceLazySingleObject != null) {
      sourceLazySingleObject.close();
      sourceLazySingleObject = null;
    }
  }

  private EagerSingleObject<TypeElement> sourceEagerSingleObject;

  public TypeElement getSourceEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (sourceEagerSingleObject == null) {
      sourceEagerSingleObject =
          new EagerSingleObject<TypeElement>(
              org.tura.model.designer.repository.serialized.type.TypeElement.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return sourceEagerSingleObject.get(this.getCpaPath(), "20b77333-64e4-4ec0-937f-c0e93eaa5873");
  }

  private void setSourceEager(
      org.tura.model.designer.repository.serialized.type.TypeElement source) {
    if (source != null) {
      source.getOpSourceRelationship().add(this);
    }
  }

  private LazySingleObject<TypeElement> sourceLazySingleObject;

  private TypeElement getSourceLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (sourceLazySingleObject == null) {
      sourceLazySingleObject =
          new LazySingleObject<TypeElement>(
              org.tura.model.designer.repository.serialized.type.TypeElement.class,
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
                      getTransientRefOpSourceRelationshipTypeElement(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return sourceLazySingleObject.get(this.getCpaPath(), "20b77333-64e4-4ec0-937f-c0e93eaa5873");
  }

  @Override
  public void setTarget(org.tura.model.designer.repository.serialized.type.TypeElement target) {
    this.setTargetEager(target);
  }

  @Override
  public TypeElement getTarget() {
    if (inMemory) {
      return this.getTargetEager();
    } else {
      return this.getTargetLazy();
    }
  }

  public void cleanTarget() throws IOException {
    if (targetEagerSingleObject != null) {
      targetEagerSingleObject.close();
      targetEagerSingleObject = null;
    }
    if (targetLazySingleObject != null) {
      targetLazySingleObject.close();
      targetLazySingleObject = null;
    }
  }

  private EagerSingleObject<TypeElement> targetEagerSingleObject;

  public TypeElement getTargetEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (targetEagerSingleObject == null) {
      targetEagerSingleObject =
          new EagerSingleObject<TypeElement>(
              org.tura.model.designer.repository.serialized.type.TypeElement.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return targetEagerSingleObject.get(this.getCpaPath(), "01f9192e-2bc6-40ea-9c1f-e4133f3b2a3a");
  }

  private void setTargetEager(
      org.tura.model.designer.repository.serialized.type.TypeElement target) {
    if (target != null) {
      target.getOpTargetRelationship().add(this);
    }
  }

  private LazySingleObject<TypeElement> targetLazySingleObject;

  private TypeElement getTargetLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (targetLazySingleObject == null) {
      targetLazySingleObject =
          new LazySingleObject<TypeElement>(
              org.tura.model.designer.repository.serialized.type.TypeElement.class,
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
                      getTransientRefOpTargetRelationshipTypeElement(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return targetLazySingleObject.get(this.getCpaPath(), "01f9192e-2bc6-40ea-9c1f-e4133f3b2a3a");
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
                    addClassifiers(RelationshipProxy.this, classifiers);
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
                      rmClassifiers(RelationshipProxy.this, classifiers);
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
                    rmClassifiers(RelationshipProxy.this, get(index));
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
              return RelationshipProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "1bb1f934-5eba-4f36-932f-0f3c7ef54731";
            }
          };
    }
    return classifiersEager;
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
