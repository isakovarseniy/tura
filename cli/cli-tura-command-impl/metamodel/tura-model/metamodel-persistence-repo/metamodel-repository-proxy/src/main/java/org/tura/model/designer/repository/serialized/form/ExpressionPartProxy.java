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
import org.tura.model.designer.repository.serialized.form.mapper.ExpressionPartProxyMapper;
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
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.platform.repository.operation.AddObjectOperation;
import org.tura.platform.repository.operation.RemoveObjectOperation;
import org.tura.platform.repository.proxy.access.EagerList;
import org.tura.platform.repository.proxy.access.DelStruc;
import org.tura.platform.repository.proxy.access.LazyList;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class ExpressionPartProxy extends ExpressionPart
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

  public ExpressionPartProxy(
      org.tura.model.designer.repository.serialized.form.ExpressionPart object,
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

  public ExpressionPartProxy(ExpressionPartProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.opExpressionContextValueLazySingleObject = proxy.opExpressionContextValueLazySingleObject;
    this.opExpressionContextValueEagerSingleObject =
        proxy.opExpressionContextValueEagerSingleObject;
    this.objRefLazySingleObject = proxy.objRefLazySingleObject;
    this.objRefEagerSingleObject = proxy.objRefEagerSingleObject;
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
    if ("opExpressionContextValue".equals(name)) {
      cleanOpExpressionContextValue();
    }
    if ("objRef".equals(name)) {
      cleanObjRef();
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

  public ExpressionPartProxy inMemory() {
    ExpressionPartProxy inMProxy = new ExpressionPartProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.form.ExpressionPart.class;
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

  public ExpressionPart clone() {
    try {
      return (ExpressionPart)
          new ExpressionPartProxyMapper(repository.getRegistry())
              .copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public ExpressionPart deepClone() {
    try {
      return (ExpressionPart)
          new ExpressionPartProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public ExpressionPart deepClone(java.util.Map<Object, Object> context) {
    try {
      return (ExpressionPart)
          new ExpressionPartProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    ExpressionPartProxyMapper mapper = new ExpressionPartProxyMapper(repository.getRegistry());
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
    return new EClass("ExpressionPart");
  }

  public Object eContainer() {
    ExpressionPartProxy memPrx = new ExpressionPartProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpExpressionContextValue();
    if (container != null) {
      return container;
    }
    container = this.getOpExpressionContextValue();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof ExpressionPartProxy) {
      return this.getKey().equals(((ExpressionPartProxy) o).getKey());
    } else {
      if (o instanceof ExpressionPart) {
        ExpressionPart obj = (ExpressionPart) o;
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

  private ExpressionPart getObject() {
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

  private String getKey(org.tura.model.designer.repository.serialized.form.ExpressionPart object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.form.ExpressionPart");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new ExpressionPartProxyMapper(repository.getRegistry())
        .getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.ExpressionPart");
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
    return new ExpressionPartProxyMapper(repository.getRegistry()).getPath(this.getObject());
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
    str = str + " order = " + getObject().getOrder();
    str = str + " expressionType = " + getObject().getExpressionType();
    str = str + " suid = " + getObject().getSuidMetaObject();
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

  private String getTransientRefOpObjRefExpressionPartMetaObject() {
    return this.getObject().getTransientrefOpObjRefExpressionPartMetaObject();
  }

  @Override
  public void setTransientrefOpObjRefExpressionPartMetaObject(
      java.lang.String refOpObjRefExpressionPartMetaObject) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefOpObjRefExpressionPartMetaObject",
              this.getObject().getTransientrefOpObjRefExpressionPartMetaObject(),
              refOpObjRefExpressionPartMetaObject,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefOpObjRefExpressionPartMetaObject");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefExpressionContextValue() {
    return this.getObject().getTransientrefExpressionContextValue();
  }

  @Override
  public void setTransientrefExpressionContextValue(java.lang.String refExpressionContextValue) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefExpressionContextValue",
              this.getObject().getTransientrefExpressionContextValue(),
              refExpressionContextValue,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefExpressionContextValue");
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
  public String getExpressionType() {
    return this.getObject().getExpressionType();
  }

  @Override
  public void setExpressionType(java.lang.String expressionType) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "ExpressionType",
              this.getObject().getExpressionType(),
              expressionType,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "expressionType");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public void setOpExpressionContextValue(
      org.tura.model.designer.repository.serialized.form.ContextValue opExpressionContextValue) {
    this.setOpExpressionContextValueEager(opExpressionContextValue);
  }

  @Override
  public ContextValue getOpExpressionContextValue() {
    if (inMemory) {
      return this.getOpExpressionContextValueEager();
    } else {
      return this.getOpExpressionContextValueLazy();
    }
  }

  public void cleanOpExpressionContextValue() throws IOException {
    if (opExpressionContextValueEagerSingleObject != null) {
      opExpressionContextValueEagerSingleObject.close();
      opExpressionContextValueEagerSingleObject = null;
    }
    if (opExpressionContextValueLazySingleObject != null) {
      opExpressionContextValueLazySingleObject.close();
      opExpressionContextValueLazySingleObject = null;
    }
  }

  private EagerSingleObject<ContextValue> opExpressionContextValueEagerSingleObject;

  public ContextValue getOpExpressionContextValueEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opExpressionContextValueEagerSingleObject == null) {
      opExpressionContextValueEagerSingleObject =
          new EagerSingleObject<ContextValue>(
              org.tura.model.designer.repository.serialized.form.ContextValue.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opExpressionContextValueEagerSingleObject.get(
        this.getCpaPath(), "629b2dc8-44ce-448f-9567-8353e8b2a794");
  }

  private void setOpExpressionContextValueEager(
      org.tura.model.designer.repository.serialized.form.ContextValue opExpressionContextValue) {
    if (opExpressionContextValue != null) {
      opExpressionContextValue.getExpression().add(this);
    }
  }

  private LazySingleObject<ContextValue> opExpressionContextValueLazySingleObject;

  private ContextValue getOpExpressionContextValueLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opExpressionContextValueLazySingleObject == null) {
      opExpressionContextValueLazySingleObject =
          new LazySingleObject<ContextValue>(
              org.tura.model.designer.repository.serialized.form.ContextValue.class,
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
                      getTransientRefExpressionContextValue(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opExpressionContextValueLazySingleObject.get(
        this.getCpaPath(), "629b2dc8-44ce-448f-9567-8353e8b2a794");
  }

  @Override
  public void setObjRef(org.tura.model.designer.repository.serialized.metabase.MetaObject objRef) {
    this.setObjRefEager(objRef);
  }

  @Override
  public MetaObject getObjRef() {
    if (inMemory) {
      return this.getObjRefEager();
    } else {
      return this.getObjRefLazy();
    }
  }

  public void cleanObjRef() throws IOException {
    if (objRefEagerSingleObject != null) {
      objRefEagerSingleObject.close();
      objRefEagerSingleObject = null;
    }
    if (objRefLazySingleObject != null) {
      objRefLazySingleObject.close();
      objRefLazySingleObject = null;
    }
  }

  private EagerSingleObject<MetaObject> objRefEagerSingleObject;

  public MetaObject getObjRefEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (objRefEagerSingleObject == null) {
      objRefEagerSingleObject =
          new EagerSingleObject<MetaObject>(
              org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return objRefEagerSingleObject.get(this.getCpaPath(), "c7db89bb-57ce-41f4-915f-31af456f91e6");
  }

  private void setObjRefEager(
      org.tura.model.designer.repository.serialized.metabase.MetaObject objRef) {
    if (objRef != null) {
      objRef.getOpObjRefExpressionPart().add(this);
    }
  }

  private LazySingleObject<MetaObject> objRefLazySingleObject;

  private MetaObject getObjRefLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (objRefLazySingleObject == null) {
      objRefLazySingleObject =
          new LazySingleObject<MetaObject>(
              org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
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
                      getTransientRefOpObjRefExpressionPartMetaObject(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return objRefLazySingleObject.get(this.getCpaPath(), "c7db89bb-57ce-41f4-915f-31af456f91e6");
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
                      org.tura.model.designer.repository.serialized.form.ExpressionPartProxy.this,
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
                        ExpressionPartProxy.this, opSourceAttributeConnector);
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
                          ExpressionPartProxy.this, opSourceAttributeConnector);
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
                    rmOpSourceAttributeConnector(ExpressionPartProxy.this, get(index));
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
              return ExpressionPartProxy.this.getCpaPath();
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
                          ExpressionPartProxy.this, opSourceAttributeConnector);
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
              return ExpressionPartProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ExpressionPartProxy.this,
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
                        ExpressionPartProxy.this, opTargetAttributeConnector);
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
                          ExpressionPartProxy.this, opTargetAttributeConnector);
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
                    rmOpTargetAttributeConnector(ExpressionPartProxy.this, get(index));
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
              return ExpressionPartProxy.this.getCpaPath();
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
                          ExpressionPartProxy.this, opTargetAttributeConnector);
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
              return ExpressionPartProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ExpressionPartProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpRefObjContextParameter(ExpressionPartProxy.this, opRefObjContextParameter);
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
                      rmOpRefObjContextParameter(
                          ExpressionPartProxy.this, opRefObjContextParameter);
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
                    rmOpRefObjContextParameter(ExpressionPartProxy.this, get(index));
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
              return ExpressionPartProxy.this.getCpaPath();
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
                      rmOpRefObjContextParameter(
                          ExpressionPartProxy.this, opRefObjContextParameter);
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
              return ExpressionPartProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ExpressionPartProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpObjRefExpressionPart(ExpressionPartProxy.this, opObjRefExpressionPart);
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
                      rmOpObjRefExpressionPart(ExpressionPartProxy.this, opObjRefExpressionPart);
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
                    rmOpObjRefExpressionPart(ExpressionPartProxy.this, get(index));
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
              return ExpressionPartProxy.this.getCpaPath();
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
                      rmOpObjRefExpressionPart(ExpressionPartProxy.this, opObjRefExpressionPart);
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
              return ExpressionPartProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ExpressionPartProxy.this,
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
                        ExpressionPartProxy.this, opValuePointerControlPointer);
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
                          ExpressionPartProxy.this, opValuePointerControlPointer);
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
                    rmOpValuePointerControlPointer(ExpressionPartProxy.this, get(index));
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
              return ExpressionPartProxy.this.getCpaPath();
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
                          ExpressionPartProxy.this, opValuePointerControlPointer);
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
              return ExpressionPartProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ExpressionPartProxy.this,
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
                        ExpressionPartProxy.this, opDisplayOptionPointerSelection);
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
                          ExpressionPartProxy.this, opDisplayOptionPointerSelection);
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
                    rmOpDisplayOptionPointerSelection(ExpressionPartProxy.this, get(index));
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
              return ExpressionPartProxy.this.getCpaPath();
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
                          ExpressionPartProxy.this, opDisplayOptionPointerSelection);
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
              return ExpressionPartProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ExpressionPartProxy.this,
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
                        ExpressionPartProxy.this, opValueOptionPointerSelection);
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
                          ExpressionPartProxy.this, opValueOptionPointerSelection);
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
                    rmOpValueOptionPointerSelection(ExpressionPartProxy.this, get(index));
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
              return ExpressionPartProxy.this.getCpaPath();
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
                          ExpressionPartProxy.this, opValueOptionPointerSelection);
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
              return ExpressionPartProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ExpressionPartProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpRefObjOrderBy(ExpressionPartProxy.this, opRefObjOrderBy);
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
                      rmOpRefObjOrderBy(ExpressionPartProxy.this, opRefObjOrderBy);
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
                    rmOpRefObjOrderBy(ExpressionPartProxy.this, get(index));
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
              return ExpressionPartProxy.this.getCpaPath();
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
                      rmOpRefObjOrderBy(ExpressionPartProxy.this, opRefObjOrderBy);
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
              return ExpressionPartProxy.this.getCpaPath();
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
