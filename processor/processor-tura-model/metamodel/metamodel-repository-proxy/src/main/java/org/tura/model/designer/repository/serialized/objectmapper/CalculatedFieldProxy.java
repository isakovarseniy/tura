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

package org.tura.model.designer.repository.serialized.objectmapper;

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
import org.tura.model.designer.repository.serialized.objectmapper.mapper.CalculatedFieldProxyMapper;
import org.tura.platform.repository.cpa.EClass;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.operation.UpdateObjectOperation;
import java.util.List;
import org.tura.platform.repository.proxy.access.EagerSingleObject;
import org.tura.platform.repository.proxy.access.LazySingleObject;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.model.designer.repository.serialized.type.TypeElement;
import org.tura.model.designer.repository.serialized.type.Assosiation;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class CalculatedFieldProxy extends CalculatedField
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

  public CalculatedFieldProxy(
      org.tura.model.designer.repository.serialized.objectmapper.CalculatedField object,
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

  public CalculatedFieldProxy(CalculatedFieldProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.opCalculationsObjectMapperLazySingleObject =
        proxy.opCalculationsObjectMapperLazySingleObject;
    this.opCalculationsObjectMapperEagerSingleObject =
        proxy.opCalculationsObjectMapperEagerSingleObject;
    this.typeRefLazySingleObject = proxy.typeRefLazySingleObject;
    this.typeRefEagerSingleObject = proxy.typeRefEagerSingleObject;
    this.opMany2manyHelperAssosiationLazySingleObject =
        proxy.opMany2manyHelperAssosiationLazySingleObject;
    this.opMany2manyHelperAssosiationEagerSingleObject =
        proxy.opMany2manyHelperAssosiationEagerSingleObject;
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
    if ("opCalculationsObjectMapper".equals(name)) {
      cleanOpCalculationsObjectMapper();
    }
    if ("typeRef".equals(name)) {
      cleanTypeRef();
    }
    if ("opMany2manyHelperAssosiation".equals(name)) {
      cleanOpMany2manyHelperAssosiation();
    }
  }

  public void setViewModelId1(Integer viewModelId1) {
    this.viewModelId1 = viewModelId1;
  }

  public Integer getViewModelId1() {
    return viewModelId1;
  }

  public CalculatedFieldProxy inMemory() {
    CalculatedFieldProxy inMProxy = new CalculatedFieldProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.objectmapper.CalculatedField.class;
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

  public CalculatedField clone() {
    try {
      return (CalculatedField)
          new CalculatedFieldProxyMapper(repository.getRegistry())
              .copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public CalculatedField deepClone() {
    try {
      return (CalculatedField)
          new CalculatedFieldProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public CalculatedField deepClone(java.util.Map<Object, Object> context) {
    try {
      return (CalculatedField)
          new CalculatedFieldProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    CalculatedFieldProxyMapper mapper = new CalculatedFieldProxyMapper(repository.getRegistry());
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
    return new EClass("CalculatedField");
  }

  public Object eContainer() {
    CalculatedFieldProxy memPrx = new CalculatedFieldProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpCalculationsObjectMapper();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpMany2manyHelperAssosiation();
    if (container != null) {
      return container;
    }
    container = this.getOpCalculationsObjectMapper();
    if (container != null) {
      return container;
    }
    container = this.getOpMany2manyHelperAssosiation();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof CalculatedFieldProxy) {
      return this.getKey().equals(((CalculatedFieldProxy) o).getKey());
    } else {
      if (o instanceof CalculatedField) {
        CalculatedField obj = (CalculatedField) o;
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

  private CalculatedField getObject() {
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
      org.tura.model.designer.repository.serialized.objectmapper.CalculatedField object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.objectmapper.CalculatedField");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new CalculatedFieldProxyMapper(repository.getRegistry())
        .getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.objectmapper.CalculatedField");
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
    return new CalculatedFieldProxyMapper(repository.getRegistry()).getPath(this.getObject());
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
    str = str + " suid = " + getObject().getSuidTypePointer();
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

  private String getTransientRefCalculationsObjectMapper() {
    return this.getObject().getTransientrefCalculationsObjectMapper();
  }

  @Override
  public void setTransientrefCalculationsObjectMapper(
      java.lang.String refCalculationsObjectMapper) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefCalculationsObjectMapper",
              this.getObject().getTransientrefCalculationsObjectMapper(),
              refCalculationsObjectMapper,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefCalculationsObjectMapper");
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

  @Override
  public void setOpCalculationsObjectMapper(
      org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper
          opCalculationsObjectMapper) {
    this.setOpCalculationsObjectMapperEager(opCalculationsObjectMapper);
  }

  @Override
  public ObjectMapper getOpCalculationsObjectMapper() {
    if (inMemory) {
      return this.getOpCalculationsObjectMapperEager();
    } else {
      return this.getOpCalculationsObjectMapperLazy();
    }
  }

  public void cleanOpCalculationsObjectMapper() throws IOException {
    if (opCalculationsObjectMapperEagerSingleObject != null) {
      opCalculationsObjectMapperEagerSingleObject.close();
      opCalculationsObjectMapperEagerSingleObject = null;
    }
    if (opCalculationsObjectMapperLazySingleObject != null) {
      opCalculationsObjectMapperLazySingleObject.close();
      opCalculationsObjectMapperLazySingleObject = null;
    }
  }

  private EagerSingleObject<ObjectMapper> opCalculationsObjectMapperEagerSingleObject;

  public ObjectMapper getOpCalculationsObjectMapperEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opCalculationsObjectMapperEagerSingleObject == null) {
      opCalculationsObjectMapperEagerSingleObject =
          new EagerSingleObject<ObjectMapper>(
              org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opCalculationsObjectMapperEagerSingleObject.get(
        this.getCpaPath(), "c955955c-33e5-4640-a645-14f57accf99e");
  }

  private void setOpCalculationsObjectMapperEager(
      org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper
          opCalculationsObjectMapper) {
    if (opCalculationsObjectMapper != null) {
      opCalculationsObjectMapper.getCalculations().add(this);
    }
  }

  private LazySingleObject<ObjectMapper> opCalculationsObjectMapperLazySingleObject;

  private ObjectMapper getOpCalculationsObjectMapperLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opCalculationsObjectMapperLazySingleObject == null) {
      opCalculationsObjectMapperLazySingleObject =
          new LazySingleObject<ObjectMapper>(
              org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
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
                      getTransientRefCalculationsObjectMapper(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opCalculationsObjectMapperLazySingleObject.get(
        this.getCpaPath(), "c955955c-33e5-4640-a645-14f57accf99e");
  }

  private String getTransientRefOpTypeRefTypePointerTypeElement() {
    return this.getObject().getTransientrefOpTypeRefTypePointerTypeElement();
  }

  @Override
  public void setTransientrefOpTypeRefTypePointerTypeElement(
      java.lang.String refOpTypeRefTypePointerTypeElement) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefOpTypeRefTypePointerTypeElement",
              this.getObject().getTransientrefOpTypeRefTypePointerTypeElement(),
              refOpTypeRefTypePointerTypeElement,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefOpTypeRefTypePointerTypeElement");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefMany2manyHelperAssosiation() {
    return this.getObject().getTransientrefMany2manyHelperAssosiation();
  }

  @Override
  public void setTransientrefMany2manyHelperAssosiation(
      java.lang.String refMany2manyHelperAssosiation) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefMany2manyHelperAssosiation",
              this.getObject().getTransientrefMany2manyHelperAssosiation(),
              refMany2manyHelperAssosiation,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefMany2manyHelperAssosiation");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getSuidTypePointer() {
    return this.getObject().getSuidTypePointer();
  }

  @Override
  public void setTypeRef(org.tura.model.designer.repository.serialized.type.TypeElement typeRef) {
    this.setTypeRefEager(typeRef);
  }

  @Override
  public TypeElement getTypeRef() {
    if (inMemory) {
      return this.getTypeRefEager();
    } else {
      return this.getTypeRefLazy();
    }
  }

  public void cleanTypeRef() throws IOException {
    if (typeRefEagerSingleObject != null) {
      typeRefEagerSingleObject.close();
      typeRefEagerSingleObject = null;
    }
    if (typeRefLazySingleObject != null) {
      typeRefLazySingleObject.close();
      typeRefLazySingleObject = null;
    }
  }

  private EagerSingleObject<TypeElement> typeRefEagerSingleObject;

  public TypeElement getTypeRefEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (typeRefEagerSingleObject == null) {
      typeRefEagerSingleObject =
          new EagerSingleObject<TypeElement>(
              org.tura.model.designer.repository.serialized.type.TypeElement.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return typeRefEagerSingleObject.get(this.getCpaPath(), "0711687a-6c21-4561-b355-b6c2b5a7cfe8");
  }

  private void setTypeRefEager(
      org.tura.model.designer.repository.serialized.type.TypeElement typeRef) {
    if (typeRef != null) {
      typeRef.getOpTypeRefTypePointer().add(this);
    }
  }

  private LazySingleObject<TypeElement> typeRefLazySingleObject;

  private TypeElement getTypeRefLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (typeRefLazySingleObject == null) {
      typeRefLazySingleObject =
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
                      getTransientRefOpTypeRefTypePointerTypeElement(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return typeRefLazySingleObject.get(this.getCpaPath(), "0711687a-6c21-4561-b355-b6c2b5a7cfe8");
  }

  @Override
  public void setOpMany2manyHelperAssosiation(
      org.tura.model.designer.repository.serialized.type.Assosiation opMany2manyHelperAssosiation) {
    this.setOpMany2manyHelperAssosiationEager(opMany2manyHelperAssosiation);
  }

  @Override
  public Assosiation getOpMany2manyHelperAssosiation() {
    if (inMemory) {
      return this.getOpMany2manyHelperAssosiationEager();
    } else {
      return this.getOpMany2manyHelperAssosiationLazy();
    }
  }

  public void cleanOpMany2manyHelperAssosiation() throws IOException {
    if (opMany2manyHelperAssosiationEagerSingleObject != null) {
      opMany2manyHelperAssosiationEagerSingleObject.close();
      opMany2manyHelperAssosiationEagerSingleObject = null;
    }
    if (opMany2manyHelperAssosiationLazySingleObject != null) {
      opMany2manyHelperAssosiationLazySingleObject.close();
      opMany2manyHelperAssosiationLazySingleObject = null;
    }
  }

  private EagerSingleObject<Assosiation> opMany2manyHelperAssosiationEagerSingleObject;

  public Assosiation getOpMany2manyHelperAssosiationEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMany2manyHelperAssosiationEagerSingleObject == null) {
      opMany2manyHelperAssosiationEagerSingleObject =
          new EagerSingleObject<Assosiation>(
              org.tura.model.designer.repository.serialized.type.Assosiation.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opMany2manyHelperAssosiationEagerSingleObject.get(
        this.getCpaPath(), "4ca9264d-a781-449a-b214-8a8b48b996fe");
  }

  private void setOpMany2manyHelperAssosiationEager(
      org.tura.model.designer.repository.serialized.type.Assosiation opMany2manyHelperAssosiation) {
    if (opMany2manyHelperAssosiation != null) {
      opMany2manyHelperAssosiation.setMany2manyHelper(this);
    }
  }

  private LazySingleObject<Assosiation> opMany2manyHelperAssosiationLazySingleObject;

  private Assosiation getOpMany2manyHelperAssosiationLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMany2manyHelperAssosiationLazySingleObject == null) {
      opMany2manyHelperAssosiationLazySingleObject =
          new LazySingleObject<Assosiation>(
              org.tura.model.designer.repository.serialized.type.Assosiation.class,
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
                      getTransientRefMany2manyHelperAssosiation(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opMany2manyHelperAssosiationLazySingleObject.get(
        this.getCpaPath(), "4ca9264d-a781-449a-b214-8a8b48b996fe");
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
