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
import org.tura.model.designer.repository.serialized.form.mapper.ViewAreaProxyMapper;
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
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class ViewAreaProxy extends ViewArea
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

  public ViewAreaProxy(
      org.tura.model.designer.repository.serialized.form.ViewArea object,
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

  public ViewAreaProxy(ViewAreaProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.baseCanvasLazySingleObject = proxy.baseCanvasLazySingleObject;
    this.baseCanvasEagerSingleObject = proxy.baseCanvasEagerSingleObject;
    this.linkToLabelsLazy = proxy.linkToLabelsLazy;
    this.linkToLabelsEager = proxy.linkToLabelsEager;
    this.linkToMessagesLazy = proxy.linkToMessagesLazy;
    this.linkToMessagesEager = proxy.linkToMessagesEager;
    this.opViewElementViewPortHolderLazySingleObject =
        proxy.opViewElementViewPortHolderLazySingleObject;
    this.opViewElementViewPortHolderEagerSingleObject =
        proxy.opViewElementViewPortHolderEagerSingleObject;
    this.styleLazySingleObject = proxy.styleLazySingleObject;
    this.styleEagerSingleObject = proxy.styleEagerSingleObject;
    this.classifiersEager = proxy.classifiersEager;
    this.opAreaAreaRefLazy = proxy.opAreaAreaRefLazy;
    this.opAreaAreaRefEager = proxy.opAreaAreaRefEager;
    this.fieldsLazy = proxy.fieldsLazy;
    this.fieldsEager = proxy.fieldsEager;
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
    if ("baseCanvas".equals(name)) {
      cleanBaseCanvas();
    }
    if ("linkToLabels".equals(name)) {
      cleanLinkToLabels();
    }
    if ("linkToMessages".equals(name)) {
      cleanLinkToMessages();
    }
    if ("opViewElementViewPortHolder".equals(name)) {
      cleanOpViewElementViewPortHolder();
    }
    if ("style".equals(name)) {
      cleanStyle();
    }
    if ("classifiers".equals(name)) {
      cleanClassifiers();
    }
    if ("opAreaAreaRef".equals(name)) {
      cleanOpAreaAreaRef();
    }
    if ("fields".equals(name)) {
      cleanFields();
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

  public ViewAreaProxy inMemory() {
    ViewAreaProxy inMProxy = new ViewAreaProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.form.ViewArea.class;
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

  public ViewArea clone() {
    try {
      return (ViewArea)
          new ViewAreaProxyMapper(repository.getRegistry()).copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public ViewArea deepClone() {
    try {
      return (ViewArea)
          new ViewAreaProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public ViewArea deepClone(java.util.Map<Object, Object> context) {
    try {
      return (ViewArea)
          new ViewAreaProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    ViewAreaProxyMapper mapper = new ViewAreaProxyMapper(repository.getRegistry());
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
    return new EClass("ViewArea");
  }

  public Object eContainer() {
    ViewAreaProxy memPrx = new ViewAreaProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpViewElementViewPortHolder();
    if (container != null) {
      return container;
    }
    container = this.getOpViewElementViewPortHolder();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof ViewAreaProxy) {
      return this.getKey().equals(((ViewAreaProxy) o).getKey());
    } else {
      if (o instanceof ViewArea) {
        ViewArea obj = (ViewArea) o;
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

  private ViewArea getObject() {
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

  private String getKey(org.tura.model.designer.repository.serialized.form.ViewArea object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.form.ViewArea");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new ViewAreaProxyMapper(repository.getRegistry()).getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.ViewArea");
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
    return new ViewAreaProxyMapper(repository.getRegistry()).getPath(this.getObject());
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
    str = str + " suid = " + getObject().getSuidViewElement();
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
      if (((ObjectControl) this.getBaseCanvasEager()) != null) {
        ((ObjectControl) this.getBaseCanvasEager()).setAttached(true);
      }
      for (LinkToLabel t : this.getLinkToLabelsEager()) {
        ((ObjectControl) t).setAttached(true);
      }
      for (LinkToMessage t : this.getLinkToMessagesEager()) {
        ((ObjectControl) t).setAttached(true);
      }
      if (((ObjectControl) this.getStyleEager()) != null) {
        ((ObjectControl) this.getStyleEager()).setAttached(true);
      }
      for (Classifier t : this.getClassifiersEager()) {
        ((ObjectControl) t).setAttached(true);
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

  public void setBaseCanvas(
      org.tura.model.designer.repository.serialized.form.LayerHolder baseCanvas) {
    this.setBaseCanvasEager(baseCanvas);
  }

  public LayerHolder getBaseCanvas() {
    if (inMemory) {
      return this.getBaseCanvasEager();
    } else {
      return this.getBaseCanvasLazy();
    }
  }

  public void cleanBaseCanvas() throws IOException {
    if (baseCanvasLazySingleObject != null) {
      baseCanvasLazySingleObject.close();
      baseCanvasLazySingleObject = null;
    }
    if (baseCanvasEagerSingleObject != null) {
      baseCanvasEagerSingleObject.close();
      baseCanvasEagerSingleObject = null;
    }
  }

  private EagerSingleObject<LayerHolder> baseCanvasEagerSingleObject;

  public static RemoveContainmentObjectOperation rmBaseCanvas(
      org.tura.model.designer.repository.serialized.form.ViewArea master,
      org.tura.model.designer.repository.serialized.form.LayerHolder detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("BaseCanvas");
    command.setDetailProperty("OpBaseCanvasViewArea");
    return command;
  }

  public static AddContainmentObjectOperation addBaseCanvas(
      org.tura.model.designer.repository.serialized.form.ViewArea master,
      org.tura.model.designer.repository.serialized.form.LayerHolder detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("BaseCanvas");
    command.setDetailProperty("OpBaseCanvasViewArea");
    return command;
  }

  public LayerHolder getBaseCanvasEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (baseCanvasEagerSingleObject == null) {
      baseCanvasEagerSingleObject =
          new EagerSingleObject<LayerHolder>(
              org.tura.model.designer.repository.serialized.form.LayerHolder.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return baseCanvasEagerSingleObject.get(
        this.getCpaPath(), "572f1e54-f633-4202-be02-bdf4671224e1");
  }

  private void setBaseCanvasEager(
      org.tura.model.designer.repository.serialized.form.LayerHolder baseCanvas) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (baseCanvas != null) {
        saveAttached = ((ObjectControl) baseCanvas).getAttached();
        ((ObjectControl) baseCanvas).setAttached(this.getAttached());
      }
      if (this.getBaseCanvasEager() != null) {
        RemoveContainmentObjectOperation command = rmBaseCanvas(this, this.getBaseCanvasEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (baseCanvas != null) {
        AddContainmentObjectOperation command2 = addBaseCanvas(this, baseCanvas);
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
      if (baseCanvas != null) {
        ((ObjectControl) baseCanvas).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<LayerHolder> baseCanvasLazySingleObject;

  private LayerHolder getBaseCanvasLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (baseCanvasLazySingleObject == null) {
      baseCanvasLazySingleObject =
          new LazySingleObject<LayerHolder>(
              org.tura.model.designer.repository.serialized.form.LayerHolder.class,
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
                      "refBaseCanvasViewArea",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return baseCanvasLazySingleObject.get(
        this.getCpaPath(), "572f1e54-f633-4202-be02-bdf4671224e1");
  }

  public List<LinkToLabel> getLinkToLabels() {
    if (inMemory) {
      return getLinkToLabelsEager();
    } else {
      return getLinkToLabelsLazy();
    }
  }

  public void cleanLinkToLabels() throws IOException {
    if (linkToLabelsEager != null) {
      linkToLabelsEager.close();
      linkToLabelsEager = null;
    }
    if (linkToLabelsLazy != null) {
      linkToLabelsLazy.close();
      linkToLabelsLazy = null;
    }
  }

  public static AddContainmentObjectOperation addLinkToLabels(
      org.tura.model.designer.repository.serialized.form.ViewArea master,
      org.tura.model.designer.repository.serialized.form.LinkToLabel detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("LinkToLabels");
    command.setDetailProperty("OpLinkToLabelsViewArea");
    return command;
  }

  public static RemoveContainmentObjectOperation rmLinkToLabels(
      org.tura.model.designer.repository.serialized.form.ViewArea master,
      org.tura.model.designer.repository.serialized.form.LinkToLabel detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("LinkToLabels");
    command.setDetailProperty("OpLinkToLabelsViewArea");
    return command;
  }

  private EagerList<LinkToLabel> linkToLabelsEager;

  public List<LinkToLabel> getLinkToLabelsEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (linkToLabelsEager == null) {
      linkToLabelsEager =
          new EagerList<LinkToLabel>(
              org.tura.model.designer.repository.serialized.form.LinkToLabel.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.LinkToLabel linkToLabels) {
              if (linkToLabels == null) {
                return;
              }
              Boolean saveAttached = false;
              if (linkToLabels != null) {
                saveAttached = ((ObjectControl) linkToLabels).getAttached();
                ((ObjectControl) linkToLabels).setAttached(getAttached());
                ;
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddContainmentObjectOperation command =
                    addLinkToLabels(ViewAreaProxy.this, linkToLabels);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, linkToLabels);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                if (linkToLabels != null) {
                  ((ObjectControl) linkToLabels).setAttached(saveAttached);
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
              LinkToLabel linkToLabels = (LinkToLabel) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(linkToLabels);
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
                      rmLinkToLabels(ViewAreaProxy.this, linkToLabels);
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
            public LinkToLabel remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveContainmentObjectOperation command =
                    rmLinkToLabels(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "742ce214-1065-41ae-b688-bc28ed3313a9";
            }
          };
    }
    return linkToLabelsEager;
  }

  private LazyList<LinkToLabel> linkToLabelsLazy;

  public List<LinkToLabel> getLinkToLabelsLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (linkToLabelsLazy == null) {
      linkToLabelsLazy =
          new LazyList<LinkToLabel>(
              org.tura.model.designer.repository.serialized.form.LinkToLabel.class,
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
                      "refLinkToLabelsViewArea",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.LinkToLabel linkToLabels) {
              if (linkToLabels == null) {
                return;
              }
              getLinkToLabelsEager().add(i, linkToLabels);
              super.add(i, linkToLabels);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              LinkToLabel linkToLabels = (LinkToLabel) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(linkToLabels);
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
                      rmLinkToLabels(ViewAreaProxy.this, linkToLabels);
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
            public LinkToLabel remove(int index) {
              super.remove(index);
              return getLinkToLabelsEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return ViewAreaProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "742ce214-1065-41ae-b688-bc28ed3313a9";
            }
          };
    }
    return linkToLabelsLazy;
  }

  public List<LinkToMessage> getLinkToMessages() {
    if (inMemory) {
      return getLinkToMessagesEager();
    } else {
      return getLinkToMessagesLazy();
    }
  }

  public void cleanLinkToMessages() throws IOException {
    if (linkToMessagesEager != null) {
      linkToMessagesEager.close();
      linkToMessagesEager = null;
    }
    if (linkToMessagesLazy != null) {
      linkToMessagesLazy.close();
      linkToMessagesLazy = null;
    }
  }

  public static AddContainmentObjectOperation addLinkToMessages(
      org.tura.model.designer.repository.serialized.form.ViewArea master,
      org.tura.model.designer.repository.serialized.form.LinkToMessage detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("LinkToMessages");
    command.setDetailProperty("OpLinkToMessagesViewArea");
    return command;
  }

  public static RemoveContainmentObjectOperation rmLinkToMessages(
      org.tura.model.designer.repository.serialized.form.ViewArea master,
      org.tura.model.designer.repository.serialized.form.LinkToMessage detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("LinkToMessages");
    command.setDetailProperty("OpLinkToMessagesViewArea");
    return command;
  }

  private EagerList<LinkToMessage> linkToMessagesEager;

  public List<LinkToMessage> getLinkToMessagesEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (linkToMessagesEager == null) {
      linkToMessagesEager =
          new EagerList<LinkToMessage>(
              org.tura.model.designer.repository.serialized.form.LinkToMessage.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.LinkToMessage linkToMessages) {
              if (linkToMessages == null) {
                return;
              }
              Boolean saveAttached = false;
              if (linkToMessages != null) {
                saveAttached = ((ObjectControl) linkToMessages).getAttached();
                ((ObjectControl) linkToMessages).setAttached(getAttached());
                ;
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddContainmentObjectOperation command =
                    addLinkToMessages(ViewAreaProxy.this, linkToMessages);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, linkToMessages);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                if (linkToMessages != null) {
                  ((ObjectControl) linkToMessages).setAttached(saveAttached);
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
              LinkToMessage linkToMessages = (LinkToMessage) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(linkToMessages);
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
                      rmLinkToMessages(ViewAreaProxy.this, linkToMessages);
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
            public LinkToMessage remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveContainmentObjectOperation command =
                    rmLinkToMessages(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "42b2b786-48be-4951-8b61-ce0fcc9f7c79";
            }
          };
    }
    return linkToMessagesEager;
  }

  private LazyList<LinkToMessage> linkToMessagesLazy;

  public List<LinkToMessage> getLinkToMessagesLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (linkToMessagesLazy == null) {
      linkToMessagesLazy =
          new LazyList<LinkToMessage>(
              org.tura.model.designer.repository.serialized.form.LinkToMessage.class,
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
                      "refLinkToMessagesViewArea",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.LinkToMessage linkToMessages) {
              if (linkToMessages == null) {
                return;
              }
              getLinkToMessagesEager().add(i, linkToMessages);
              super.add(i, linkToMessages);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              LinkToMessage linkToMessages = (LinkToMessage) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(linkToMessages);
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
                      rmLinkToMessages(ViewAreaProxy.this, linkToMessages);
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
            public LinkToMessage remove(int index) {
              super.remove(index);
              return getLinkToMessagesEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return ViewAreaProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "42b2b786-48be-4951-8b61-ce0fcc9f7c79";
            }
          };
    }
    return linkToMessagesLazy;
  }

  private String getTransientRefViewElementViewPortHolder() {
    return this.getObject().getTransientrefViewElementViewPortHolder();
  }

  @Override
  public void setTransientrefViewElementViewPortHolder(
      java.lang.String refViewElementViewPortHolder) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefViewElementViewPortHolder",
              this.getObject().getTransientrefViewElementViewPortHolder(),
              refViewElementViewPortHolder,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefViewElementViewPortHolder");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getSuidViewElement() {
    return this.getObject().getSuidViewElement();
  }

  @Override
  public void setOpViewElementViewPortHolder(
      org.tura.model.designer.repository.serialized.form.ViewPortHolder
          opViewElementViewPortHolder) {
    this.setOpViewElementViewPortHolderEager(opViewElementViewPortHolder);
  }

  @Override
  public ViewPortHolder getOpViewElementViewPortHolder() {
    if (inMemory) {
      return this.getOpViewElementViewPortHolderEager();
    } else {
      return this.getOpViewElementViewPortHolderLazy();
    }
  }

  public void cleanOpViewElementViewPortHolder() throws IOException {
    if (opViewElementViewPortHolderEagerSingleObject != null) {
      opViewElementViewPortHolderEagerSingleObject.close();
      opViewElementViewPortHolderEagerSingleObject = null;
    }
    if (opViewElementViewPortHolderLazySingleObject != null) {
      opViewElementViewPortHolderLazySingleObject.close();
      opViewElementViewPortHolderLazySingleObject = null;
    }
  }

  private EagerSingleObject<ViewPortHolder> opViewElementViewPortHolderEagerSingleObject;

  public ViewPortHolder getOpViewElementViewPortHolderEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opViewElementViewPortHolderEagerSingleObject == null) {
      opViewElementViewPortHolderEagerSingleObject =
          new EagerSingleObject<ViewPortHolder>(
              org.tura.model.designer.repository.serialized.form.ViewPortHolder.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opViewElementViewPortHolderEagerSingleObject.get(
        this.getCpaPath(), "41c985e7-b6c1-45be-8eef-854756a65834");
  }

  private void setOpViewElementViewPortHolderEager(
      org.tura.model.designer.repository.serialized.form.ViewPortHolder
          opViewElementViewPortHolder) {
    if (opViewElementViewPortHolder != null) {
      opViewElementViewPortHolder.getViewElement().add(this);
    }
  }

  private LazySingleObject<ViewPortHolder> opViewElementViewPortHolderLazySingleObject;

  private ViewPortHolder getOpViewElementViewPortHolderLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opViewElementViewPortHolderLazySingleObject == null) {
      opViewElementViewPortHolderLazySingleObject =
          new LazySingleObject<ViewPortHolder>(
              org.tura.model.designer.repository.serialized.form.ViewPortHolder.class,
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
                      getTransientRefViewElementViewPortHolder(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opViewElementViewPortHolderLazySingleObject.get(
        this.getCpaPath(), "41c985e7-b6c1-45be-8eef-854756a65834");
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
                    addClassifiers(ViewAreaProxy.this, classifiers);
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
                      rmClassifiers(ViewAreaProxy.this, classifiers);
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
                    rmClassifiers(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ViewAreaProxy.this,
                      org.tura.model.designer.repository.serialized.form.NickNamed.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command = addOpAreaAreaRef(ViewAreaProxy.this, opAreaAreaRef);
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
                      rmOpAreaAreaRef(ViewAreaProxy.this, opAreaAreaRef);
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
                RemoveObjectOperation command = rmOpAreaAreaRef(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                      rmOpAreaAreaRef(ViewAreaProxy.this, opAreaAreaRef);
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
              return ViewAreaProxy.this.getCpaPath();
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
                AddContainmentObjectOperation command = addFields(ViewAreaProxy.this, fields);
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
                  RemoveContainmentObjectOperation command = rmFields(ViewAreaProxy.this, fields);
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
                RemoveContainmentObjectOperation command = rmFields(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                  RemoveContainmentObjectOperation command = rmFields(ViewAreaProxy.this, fields);
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
              return ViewAreaProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "6ed5ba2a-8b06-4f91-aef9-83c9c9117dfa";
            }
          };
    }
    return fieldsLazy;
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
                      org.tura.model.designer.repository.serialized.form.ViewAreaProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpSourceAttributeConnector(ViewAreaProxy.this, opSourceAttributeConnector);
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
                      rmOpSourceAttributeConnector(ViewAreaProxy.this, opSourceAttributeConnector);
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
                    rmOpSourceAttributeConnector(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                      rmOpSourceAttributeConnector(ViewAreaProxy.this, opSourceAttributeConnector);
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
              return ViewAreaProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ViewAreaProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpTargetAttributeConnector(ViewAreaProxy.this, opTargetAttributeConnector);
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
                      rmOpTargetAttributeConnector(ViewAreaProxy.this, opTargetAttributeConnector);
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
                    rmOpTargetAttributeConnector(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                      rmOpTargetAttributeConnector(ViewAreaProxy.this, opTargetAttributeConnector);
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
              return ViewAreaProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ViewAreaProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpRefObjContextParameter(ViewAreaProxy.this, opRefObjContextParameter);
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
                      rmOpRefObjContextParameter(ViewAreaProxy.this, opRefObjContextParameter);
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
                    rmOpRefObjContextParameter(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                      rmOpRefObjContextParameter(ViewAreaProxy.this, opRefObjContextParameter);
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
              return ViewAreaProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ViewAreaProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpObjRefExpressionPart(ViewAreaProxy.this, opObjRefExpressionPart);
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
                      rmOpObjRefExpressionPart(ViewAreaProxy.this, opObjRefExpressionPart);
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
                    rmOpObjRefExpressionPart(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                      rmOpObjRefExpressionPart(ViewAreaProxy.this, opObjRefExpressionPart);
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
              return ViewAreaProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ViewAreaProxy.this,
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
                        ViewAreaProxy.this, opValuePointerControlPointer);
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
                          ViewAreaProxy.this, opValuePointerControlPointer);
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
                    rmOpValuePointerControlPointer(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                          ViewAreaProxy.this, opValuePointerControlPointer);
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
              return ViewAreaProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ViewAreaProxy.this,
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
                        ViewAreaProxy.this, opDisplayOptionPointerSelection);
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
                          ViewAreaProxy.this, opDisplayOptionPointerSelection);
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
                    rmOpDisplayOptionPointerSelection(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                          ViewAreaProxy.this, opDisplayOptionPointerSelection);
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
              return ViewAreaProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ViewAreaProxy.this,
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
                        ViewAreaProxy.this, opValueOptionPointerSelection);
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
                          ViewAreaProxy.this, opValueOptionPointerSelection);
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
                    rmOpValueOptionPointerSelection(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                          ViewAreaProxy.this, opValueOptionPointerSelection);
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
              return ViewAreaProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.form.ViewAreaProxy.this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpRefObjOrderBy(ViewAreaProxy.this, opRefObjOrderBy);
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
                      rmOpRefObjOrderBy(ViewAreaProxy.this, opRefObjOrderBy);
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
                RemoveObjectOperation command = rmOpRefObjOrderBy(ViewAreaProxy.this, get(index));
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
              return ViewAreaProxy.this.getCpaPath();
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
                      rmOpRefObjOrderBy(ViewAreaProxy.this, opRefObjOrderBy);
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
              return ViewAreaProxy.this.getCpaPath();
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
