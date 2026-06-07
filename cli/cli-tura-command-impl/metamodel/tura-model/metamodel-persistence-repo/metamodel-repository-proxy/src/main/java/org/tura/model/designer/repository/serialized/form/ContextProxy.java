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
import org.tura.model.designer.repository.serialized.form.mapper.ContextProxyMapper;
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
import org.tura.platform.repository.operation.AddContainmentObjectOperation;
import org.tura.platform.repository.operation.RemoveContainmentObjectOperation;
import org.tura.platform.repository.proxy.access.EagerList;
import org.tura.platform.repository.proxy.access.DelStruc;
import org.tura.platform.repository.proxy.access.LazyList;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class ContextProxy extends Context
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

  public ContextProxy(
      org.tura.model.designer.repository.serialized.form.Context object,
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

  public ContextProxy(ContextProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.opMultiLangLabelMultiLangLabelLazySingleObject =
        proxy.opMultiLangLabelMultiLangLabelLazySingleObject;
    this.opMultiLangLabelMultiLangLabelEagerSingleObject =
        proxy.opMultiLangLabelMultiLangLabelEagerSingleObject;
    this.opStyleStyleElementLazySingleObject = proxy.opStyleStyleElementLazySingleObject;
    this.opStyleStyleElementEagerSingleObject = proxy.opStyleStyleElementEagerSingleObject;
    this.opEnabledEnabledUIItemLazySingleObject = proxy.opEnabledEnabledUIItemLazySingleObject;
    this.opEnabledEnabledUIItemEagerSingleObject = proxy.opEnabledEnabledUIItemEagerSingleObject;
    this.opRequiredUielementLazySingleObject = proxy.opRequiredUielementLazySingleObject;
    this.opRequiredUielementEagerSingleObject = proxy.opRequiredUielementEagerSingleObject;
    this.opReadOnlyUielementLazySingleObject = proxy.opReadOnlyUielementLazySingleObject;
    this.opReadOnlyUielementEagerSingleObject = proxy.opReadOnlyUielementEagerSingleObject;
    this.opIconItemIconLazySingleObject = proxy.opIconItemIconLazySingleObject;
    this.opIconItemIconEagerSingleObject = proxy.opIconItemIconEagerSingleObject;
    this.opInitialOptionMessageOptionSelectionLazySingleObject =
        proxy.opInitialOptionMessageOptionSelectionLazySingleObject;
    this.opInitialOptionMessageOptionSelectionEagerSingleObject =
        proxy.opInitialOptionMessageOptionSelectionEagerSingleObject;
    this.opTransitionMenuItemLazySingleObject = proxy.opTransitionMenuItemLazySingleObject;
    this.opTransitionMenuItemEagerSingleObject = proxy.opTransitionMenuItemEagerSingleObject;
    this.opImageTreeLazySingleObject = proxy.opImageTreeLazySingleObject;
    this.opImageTreeEagerSingleObject = proxy.opImageTreeEagerSingleObject;
    this.expressionLazy = proxy.expressionLazy;
    this.expressionEager = proxy.expressionEager;
    this.opValueContextParameterLazySingleObject = proxy.opValueContextParameterLazySingleObject;
    this.opValueContextParameterEagerSingleObject = proxy.opValueContextParameterEagerSingleObject;
    this.parametersLazy = proxy.parametersLazy;
    this.parametersEager = proxy.parametersEager;
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
    if ("opMultiLangLabelMultiLangLabel".equals(name)) {
      cleanOpMultiLangLabelMultiLangLabel();
    }
    if ("opStyleStyleElement".equals(name)) {
      cleanOpStyleStyleElement();
    }
    if ("opEnabledEnabledUIItem".equals(name)) {
      cleanOpEnabledEnabledUIItem();
    }
    if ("opRequiredUielement".equals(name)) {
      cleanOpRequiredUielement();
    }
    if ("opReadOnlyUielement".equals(name)) {
      cleanOpReadOnlyUielement();
    }
    if ("opIconItemIcon".equals(name)) {
      cleanOpIconItemIcon();
    }
    if ("opInitialOptionMessageOptionSelection".equals(name)) {
      cleanOpInitialOptionMessageOptionSelection();
    }
    if ("opTransitionMenuItem".equals(name)) {
      cleanOpTransitionMenuItem();
    }
    if ("opImageTree".equals(name)) {
      cleanOpImageTree();
    }
    if ("expression".equals(name)) {
      cleanExpression();
    }
    if ("opValueContextParameter".equals(name)) {
      cleanOpValueContextParameter();
    }
    if ("parameters".equals(name)) {
      cleanParameters();
    }
  }

  public void setViewModelId1(Integer viewModelId1) {
    this.viewModelId1 = viewModelId1;
  }

  public Integer getViewModelId1() {
    return viewModelId1;
  }

  public ContextProxy inMemory() {
    ContextProxy inMProxy = new ContextProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.form.Context.class;
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

  public Context clone() {
    try {
      return (Context)
          new ContextProxyMapper(repository.getRegistry()).copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public Context deepClone() {
    try {
      return (Context)
          new ContextProxyMapper(repository.getRegistry()).deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public Context deepClone(java.util.Map<Object, Object> context) {
    try {
      return (Context)
          new ContextProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    ContextProxyMapper mapper = new ContextProxyMapper(repository.getRegistry());
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
    return new EClass("Context");
  }

  public Object eContainer() {
    ContextProxy memPrx = new ContextProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpMultiLangLabelMultiLangLabel();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpStyleStyleElement();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpEnabledEnabledUIItem();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpRequiredUielement();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpReadOnlyUielement();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpIconItemIcon();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpInitialOptionMessageOptionSelection();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpTransitionMenuItem();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpImageTree();
    if (container != null) {
      return container;
    }
    container = memPrx.getOpValueContextParameter();
    if (container != null) {
      return container;
    }
    container = this.getOpMultiLangLabelMultiLangLabel();
    if (container != null) {
      return container;
    }
    container = this.getOpStyleStyleElement();
    if (container != null) {
      return container;
    }
    container = this.getOpEnabledEnabledUIItem();
    if (container != null) {
      return container;
    }
    container = this.getOpRequiredUielement();
    if (container != null) {
      return container;
    }
    container = this.getOpReadOnlyUielement();
    if (container != null) {
      return container;
    }
    container = this.getOpIconItemIcon();
    if (container != null) {
      return container;
    }
    container = this.getOpInitialOptionMessageOptionSelection();
    if (container != null) {
      return container;
    }
    container = this.getOpTransitionMenuItem();
    if (container != null) {
      return container;
    }
    container = this.getOpImageTree();
    if (container != null) {
      return container;
    }
    container = this.getOpValueContextParameter();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof ContextProxy) {
      return this.getKey().equals(((ContextProxy) o).getKey());
    } else {
      if (o instanceof Context) {
        Context obj = (Context) o;
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

  private Context getObject() {
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

  private String getKey(org.tura.model.designer.repository.serialized.form.Context object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.form.Context");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new ContextProxyMapper(repository.getRegistry()).getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.Context");
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
    return new ContextProxyMapper(repository.getRegistry()).getPath(this.getObject());
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
    str = str + " constant = " + getObject().getConstant();
    str = str + " value = " + getObject().getValue();
    str = str + " suid = " + getObject().getSuidContextParameters();
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
      for (ExpressionPart t : this.getExpressionEager()) {
        ((ObjectControl) t).setAttached(true);
      }
      for (ContextParameter t : this.getParametersEager()) {
        ((ObjectControl) t).setAttached(true);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefMultiLangLabelMultiLangLabel() {
    return this.getObject().getTransientrefMultiLangLabelMultiLangLabel();
  }

  @Override
  public void setTransientrefMultiLangLabelMultiLangLabel(
      java.lang.String refMultiLangLabelMultiLangLabel) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefMultiLangLabelMultiLangLabel",
              this.getObject().getTransientrefMultiLangLabelMultiLangLabel(),
              refMultiLangLabelMultiLangLabel,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefMultiLangLabelMultiLangLabel");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefStyleStyleElement() {
    return this.getObject().getTransientrefStyleStyleElement();
  }

  @Override
  public void setTransientrefStyleStyleElement(java.lang.String refStyleStyleElement) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefStyleStyleElement",
              this.getObject().getTransientrefStyleStyleElement(),
              refStyleStyleElement,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefStyleStyleElement");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefEnabledEnabledUIItem() {
    return this.getObject().getTransientrefEnabledEnabledUIItem();
  }

  @Override
  public void setTransientrefEnabledEnabledUIItem(java.lang.String refEnabledEnabledUIItem) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefEnabledEnabledUIItem",
              this.getObject().getTransientrefEnabledEnabledUIItem(),
              refEnabledEnabledUIItem,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefEnabledEnabledUIItem");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefRequiredUielement() {
    return this.getObject().getTransientrefRequiredUielement();
  }

  @Override
  public void setTransientrefRequiredUielement(java.lang.String refRequiredUielement) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefRequiredUielement",
              this.getObject().getTransientrefRequiredUielement(),
              refRequiredUielement,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefRequiredUielement");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefReadOnlyUielement() {
    return this.getObject().getTransientrefReadOnlyUielement();
  }

  @Override
  public void setTransientrefReadOnlyUielement(java.lang.String refReadOnlyUielement) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefReadOnlyUielement",
              this.getObject().getTransientrefReadOnlyUielement(),
              refReadOnlyUielement,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefReadOnlyUielement");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefIconItemIcon() {
    return this.getObject().getTransientrefIconItemIcon();
  }

  @Override
  public void setTransientrefIconItemIcon(java.lang.String refIconItemIcon) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefIconItemIcon",
              this.getObject().getTransientrefIconItemIcon(),
              refIconItemIcon,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefIconItemIcon");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefInitialOptionMessageOptionSelection() {
    return this.getObject().getTransientrefInitialOptionMessageOptionSelection();
  }

  @Override
  public void setTransientrefInitialOptionMessageOptionSelection(
      java.lang.String refInitialOptionMessageOptionSelection) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefInitialOptionMessageOptionSelection",
              this.getObject().getTransientrefInitialOptionMessageOptionSelection(),
              refInitialOptionMessageOptionSelection,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefInitialOptionMessageOptionSelection");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefTransitionMenuItem() {
    return this.getObject().getTransientrefTransitionMenuItem();
  }

  @Override
  public void setTransientrefTransitionMenuItem(java.lang.String refTransitionMenuItem) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefTransitionMenuItem",
              this.getObject().getTransientrefTransitionMenuItem(),
              refTransitionMenuItem,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefTransitionMenuItem");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private String getTransientRefImageTree() {
    return this.getObject().getTransientrefImageTree();
  }

  @Override
  public void setTransientrefImageTree(java.lang.String refImageTree) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefImageTree",
              this.getObject().getTransientrefImageTree(),
              refImageTree,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefImageTree");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public void setOpMultiLangLabelMultiLangLabel(
      org.tura.model.designer.repository.serialized.form.MultiLangLabel
          opMultiLangLabelMultiLangLabel) {
    this.setOpMultiLangLabelMultiLangLabelEager(opMultiLangLabelMultiLangLabel);
  }

  @Override
  public MultiLangLabel getOpMultiLangLabelMultiLangLabel() {
    if (inMemory) {
      return this.getOpMultiLangLabelMultiLangLabelEager();
    } else {
      return this.getOpMultiLangLabelMultiLangLabelLazy();
    }
  }

  public void cleanOpMultiLangLabelMultiLangLabel() throws IOException {
    if (opMultiLangLabelMultiLangLabelEagerSingleObject != null) {
      opMultiLangLabelMultiLangLabelEagerSingleObject.close();
      opMultiLangLabelMultiLangLabelEagerSingleObject = null;
    }
    if (opMultiLangLabelMultiLangLabelLazySingleObject != null) {
      opMultiLangLabelMultiLangLabelLazySingleObject.close();
      opMultiLangLabelMultiLangLabelLazySingleObject = null;
    }
  }

  private EagerSingleObject<MultiLangLabel> opMultiLangLabelMultiLangLabelEagerSingleObject;

  public MultiLangLabel getOpMultiLangLabelMultiLangLabelEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMultiLangLabelMultiLangLabelEagerSingleObject == null) {
      opMultiLangLabelMultiLangLabelEagerSingleObject =
          new EagerSingleObject<MultiLangLabel>(
              org.tura.model.designer.repository.serialized.form.MultiLangLabel.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opMultiLangLabelMultiLangLabelEagerSingleObject.get(
        this.getCpaPath(), "dd98c7c0-aba5-4b30-a668-000006aa415f");
  }

  private void setOpMultiLangLabelMultiLangLabelEager(
      org.tura.model.designer.repository.serialized.form.MultiLangLabel
          opMultiLangLabelMultiLangLabel) {
    if (opMultiLangLabelMultiLangLabel != null) {
      opMultiLangLabelMultiLangLabel.setMultiLangLabel(this);
    }
  }

  private LazySingleObject<MultiLangLabel> opMultiLangLabelMultiLangLabelLazySingleObject;

  private MultiLangLabel getOpMultiLangLabelMultiLangLabelLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMultiLangLabelMultiLangLabelLazySingleObject == null) {
      opMultiLangLabelMultiLangLabelLazySingleObject =
          new LazySingleObject<MultiLangLabel>(
              org.tura.model.designer.repository.serialized.form.MultiLangLabel.class,
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
                      getTransientRefMultiLangLabelMultiLangLabel(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opMultiLangLabelMultiLangLabelLazySingleObject.get(
        this.getCpaPath(), "dd98c7c0-aba5-4b30-a668-000006aa415f");
  }

  @Override
  public void setOpStyleStyleElement(
      org.tura.model.designer.repository.serialized.form.StyleElement opStyleStyleElement) {
    this.setOpStyleStyleElementEager(opStyleStyleElement);
  }

  @Override
  public StyleElement getOpStyleStyleElement() {
    if (inMemory) {
      return this.getOpStyleStyleElementEager();
    } else {
      return this.getOpStyleStyleElementLazy();
    }
  }

  public void cleanOpStyleStyleElement() throws IOException {
    if (opStyleStyleElementEagerSingleObject != null) {
      opStyleStyleElementEagerSingleObject.close();
      opStyleStyleElementEagerSingleObject = null;
    }
    if (opStyleStyleElementLazySingleObject != null) {
      opStyleStyleElementLazySingleObject.close();
      opStyleStyleElementLazySingleObject = null;
    }
  }

  private EagerSingleObject<StyleElement> opStyleStyleElementEagerSingleObject;

  public StyleElement getOpStyleStyleElementEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opStyleStyleElementEagerSingleObject == null) {
      opStyleStyleElementEagerSingleObject =
          new EagerSingleObject<StyleElement>(
              org.tura.model.designer.repository.serialized.form.StyleElement.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opStyleStyleElementEagerSingleObject.get(
        this.getCpaPath(), "b04e4269-0ab9-4463-bc8b-9717bae47ec6");
  }

  private void setOpStyleStyleElementEager(
      org.tura.model.designer.repository.serialized.form.StyleElement opStyleStyleElement) {
    if (opStyleStyleElement != null) {
      opStyleStyleElement.setStyle(this);
    }
  }

  private LazySingleObject<StyleElement> opStyleStyleElementLazySingleObject;

  private StyleElement getOpStyleStyleElementLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opStyleStyleElementLazySingleObject == null) {
      opStyleStyleElementLazySingleObject =
          new LazySingleObject<StyleElement>(
              org.tura.model.designer.repository.serialized.form.StyleElement.class,
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
                      getTransientRefStyleStyleElement(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opStyleStyleElementLazySingleObject.get(
        this.getCpaPath(), "b04e4269-0ab9-4463-bc8b-9717bae47ec6");
  }

  @Override
  public void setOpEnabledEnabledUIItem(
      org.tura.model.designer.repository.serialized.form.EnabledUIItem opEnabledEnabledUIItem) {
    this.setOpEnabledEnabledUIItemEager(opEnabledEnabledUIItem);
  }

  @Override
  public EnabledUIItem getOpEnabledEnabledUIItem() {
    if (inMemory) {
      return this.getOpEnabledEnabledUIItemEager();
    } else {
      return this.getOpEnabledEnabledUIItemLazy();
    }
  }

  public void cleanOpEnabledEnabledUIItem() throws IOException {
    if (opEnabledEnabledUIItemEagerSingleObject != null) {
      opEnabledEnabledUIItemEagerSingleObject.close();
      opEnabledEnabledUIItemEagerSingleObject = null;
    }
    if (opEnabledEnabledUIItemLazySingleObject != null) {
      opEnabledEnabledUIItemLazySingleObject.close();
      opEnabledEnabledUIItemLazySingleObject = null;
    }
  }

  private EagerSingleObject<EnabledUIItem> opEnabledEnabledUIItemEagerSingleObject;

  public EnabledUIItem getOpEnabledEnabledUIItemEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opEnabledEnabledUIItemEagerSingleObject == null) {
      opEnabledEnabledUIItemEagerSingleObject =
          new EagerSingleObject<EnabledUIItem>(
              org.tura.model.designer.repository.serialized.form.EnabledUIItem.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opEnabledEnabledUIItemEagerSingleObject.get(
        this.getCpaPath(), "40f34656-da59-4211-b0d8-3fcf0f2a64b4");
  }

  private void setOpEnabledEnabledUIItemEager(
      org.tura.model.designer.repository.serialized.form.EnabledUIItem opEnabledEnabledUIItem) {
    if (opEnabledEnabledUIItem != null) {
      opEnabledEnabledUIItem.setEnabled(this);
    }
  }

  private LazySingleObject<EnabledUIItem> opEnabledEnabledUIItemLazySingleObject;

  private EnabledUIItem getOpEnabledEnabledUIItemLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opEnabledEnabledUIItemLazySingleObject == null) {
      opEnabledEnabledUIItemLazySingleObject =
          new LazySingleObject<EnabledUIItem>(
              org.tura.model.designer.repository.serialized.form.EnabledUIItem.class,
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
                      getTransientRefEnabledEnabledUIItem(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opEnabledEnabledUIItemLazySingleObject.get(
        this.getCpaPath(), "40f34656-da59-4211-b0d8-3fcf0f2a64b4");
  }

  @Override
  public void setOpRequiredUielement(
      org.tura.model.designer.repository.serialized.form.Uielement opRequiredUielement) {
    this.setOpRequiredUielementEager(opRequiredUielement);
  }

  @Override
  public Uielement getOpRequiredUielement() {
    if (inMemory) {
      return this.getOpRequiredUielementEager();
    } else {
      return this.getOpRequiredUielementLazy();
    }
  }

  public void cleanOpRequiredUielement() throws IOException {
    if (opRequiredUielementEagerSingleObject != null) {
      opRequiredUielementEagerSingleObject.close();
      opRequiredUielementEagerSingleObject = null;
    }
    if (opRequiredUielementLazySingleObject != null) {
      opRequiredUielementLazySingleObject.close();
      opRequiredUielementLazySingleObject = null;
    }
  }

  private EagerSingleObject<Uielement> opRequiredUielementEagerSingleObject;

  public Uielement getOpRequiredUielementEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opRequiredUielementEagerSingleObject == null) {
      opRequiredUielementEagerSingleObject =
          new EagerSingleObject<Uielement>(
              org.tura.model.designer.repository.serialized.form.Uielement.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opRequiredUielementEagerSingleObject.get(
        this.getCpaPath(), "ebceb22a-59c3-4bbc-b01a-634a49148e7f");
  }

  private void setOpRequiredUielementEager(
      org.tura.model.designer.repository.serialized.form.Uielement opRequiredUielement) {
    if (opRequiredUielement != null) {
      opRequiredUielement.setRequired(this);
    }
  }

  private LazySingleObject<Uielement> opRequiredUielementLazySingleObject;

  private Uielement getOpRequiredUielementLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opRequiredUielementLazySingleObject == null) {
      opRequiredUielementLazySingleObject =
          new LazySingleObject<Uielement>(
              org.tura.model.designer.repository.serialized.form.Uielement.class,
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
                      getTransientRefRequiredUielement(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opRequiredUielementLazySingleObject.get(
        this.getCpaPath(), "ebceb22a-59c3-4bbc-b01a-634a49148e7f");
  }

  @Override
  public void setOpReadOnlyUielement(
      org.tura.model.designer.repository.serialized.form.Uielement opReadOnlyUielement) {
    this.setOpReadOnlyUielementEager(opReadOnlyUielement);
  }

  @Override
  public Uielement getOpReadOnlyUielement() {
    if (inMemory) {
      return this.getOpReadOnlyUielementEager();
    } else {
      return this.getOpReadOnlyUielementLazy();
    }
  }

  public void cleanOpReadOnlyUielement() throws IOException {
    if (opReadOnlyUielementEagerSingleObject != null) {
      opReadOnlyUielementEagerSingleObject.close();
      opReadOnlyUielementEagerSingleObject = null;
    }
    if (opReadOnlyUielementLazySingleObject != null) {
      opReadOnlyUielementLazySingleObject.close();
      opReadOnlyUielementLazySingleObject = null;
    }
  }

  private EagerSingleObject<Uielement> opReadOnlyUielementEagerSingleObject;

  public Uielement getOpReadOnlyUielementEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opReadOnlyUielementEagerSingleObject == null) {
      opReadOnlyUielementEagerSingleObject =
          new EagerSingleObject<Uielement>(
              org.tura.model.designer.repository.serialized.form.Uielement.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opReadOnlyUielementEagerSingleObject.get(
        this.getCpaPath(), "c5eba772-31e7-407b-a6a7-d4d40a0e778c");
  }

  private void setOpReadOnlyUielementEager(
      org.tura.model.designer.repository.serialized.form.Uielement opReadOnlyUielement) {
    if (opReadOnlyUielement != null) {
      opReadOnlyUielement.setReadOnly(this);
    }
  }

  private LazySingleObject<Uielement> opReadOnlyUielementLazySingleObject;

  private Uielement getOpReadOnlyUielementLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opReadOnlyUielementLazySingleObject == null) {
      opReadOnlyUielementLazySingleObject =
          new LazySingleObject<Uielement>(
              org.tura.model.designer.repository.serialized.form.Uielement.class,
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
                      getTransientRefReadOnlyUielement(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opReadOnlyUielementLazySingleObject.get(
        this.getCpaPath(), "c5eba772-31e7-407b-a6a7-d4d40a0e778c");
  }

  @Override
  public void setOpIconItemIcon(
      org.tura.model.designer.repository.serialized.form.ItemIcon opIconItemIcon) {
    this.setOpIconItemIconEager(opIconItemIcon);
  }

  @Override
  public ItemIcon getOpIconItemIcon() {
    if (inMemory) {
      return this.getOpIconItemIconEager();
    } else {
      return this.getOpIconItemIconLazy();
    }
  }

  public void cleanOpIconItemIcon() throws IOException {
    if (opIconItemIconEagerSingleObject != null) {
      opIconItemIconEagerSingleObject.close();
      opIconItemIconEagerSingleObject = null;
    }
    if (opIconItemIconLazySingleObject != null) {
      opIconItemIconLazySingleObject.close();
      opIconItemIconLazySingleObject = null;
    }
  }

  private EagerSingleObject<ItemIcon> opIconItemIconEagerSingleObject;

  public ItemIcon getOpIconItemIconEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opIconItemIconEagerSingleObject == null) {
      opIconItemIconEagerSingleObject =
          new EagerSingleObject<ItemIcon>(
              org.tura.model.designer.repository.serialized.form.ItemIcon.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opIconItemIconEagerSingleObject.get(
        this.getCpaPath(), "4cc45ff4-c1ff-4524-9be0-f900e3b9a32e");
  }

  private void setOpIconItemIconEager(
      org.tura.model.designer.repository.serialized.form.ItemIcon opIconItemIcon) {
    if (opIconItemIcon != null) {
      opIconItemIcon.setIcon(this);
    }
  }

  private LazySingleObject<ItemIcon> opIconItemIconLazySingleObject;

  private ItemIcon getOpIconItemIconLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opIconItemIconLazySingleObject == null) {
      opIconItemIconLazySingleObject =
          new LazySingleObject<ItemIcon>(
              org.tura.model.designer.repository.serialized.form.ItemIcon.class,
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
                      getTransientRefIconItemIcon(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opIconItemIconLazySingleObject.get(
        this.getCpaPath(), "4cc45ff4-c1ff-4524-9be0-f900e3b9a32e");
  }

  @Override
  public void setOpInitialOptionMessageOptionSelection(
      org.tura.model.designer.repository.serialized.form.OptionSelection
          opInitialOptionMessageOptionSelection) {
    this.setOpInitialOptionMessageOptionSelectionEager(opInitialOptionMessageOptionSelection);
  }

  @Override
  public OptionSelection getOpInitialOptionMessageOptionSelection() {
    if (inMemory) {
      return this.getOpInitialOptionMessageOptionSelectionEager();
    } else {
      return this.getOpInitialOptionMessageOptionSelectionLazy();
    }
  }

  public void cleanOpInitialOptionMessageOptionSelection() throws IOException {
    if (opInitialOptionMessageOptionSelectionEagerSingleObject != null) {
      opInitialOptionMessageOptionSelectionEagerSingleObject.close();
      opInitialOptionMessageOptionSelectionEagerSingleObject = null;
    }
    if (opInitialOptionMessageOptionSelectionLazySingleObject != null) {
      opInitialOptionMessageOptionSelectionLazySingleObject.close();
      opInitialOptionMessageOptionSelectionLazySingleObject = null;
    }
  }

  private EagerSingleObject<OptionSelection> opInitialOptionMessageOptionSelectionEagerSingleObject;

  public OptionSelection getOpInitialOptionMessageOptionSelectionEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opInitialOptionMessageOptionSelectionEagerSingleObject == null) {
      opInitialOptionMessageOptionSelectionEagerSingleObject =
          new EagerSingleObject<OptionSelection>(
              org.tura.model.designer.repository.serialized.form.OptionSelection.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opInitialOptionMessageOptionSelectionEagerSingleObject.get(
        this.getCpaPath(), "e7ebc82b-c029-4bf9-ae70-61a209b61c64");
  }

  private void setOpInitialOptionMessageOptionSelectionEager(
      org.tura.model.designer.repository.serialized.form.OptionSelection
          opInitialOptionMessageOptionSelection) {
    if (opInitialOptionMessageOptionSelection != null) {
      opInitialOptionMessageOptionSelection.setInitialOptionMessage(this);
    }
  }

  private LazySingleObject<OptionSelection> opInitialOptionMessageOptionSelectionLazySingleObject;

  private OptionSelection getOpInitialOptionMessageOptionSelectionLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opInitialOptionMessageOptionSelectionLazySingleObject == null) {
      opInitialOptionMessageOptionSelectionLazySingleObject =
          new LazySingleObject<OptionSelection>(
              org.tura.model.designer.repository.serialized.form.OptionSelection.class,
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
                      getTransientRefInitialOptionMessageOptionSelection(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opInitialOptionMessageOptionSelectionLazySingleObject.get(
        this.getCpaPath(), "e7ebc82b-c029-4bf9-ae70-61a209b61c64");
  }

  @Override
  public void setOpTransitionMenuItem(
      org.tura.model.designer.repository.serialized.form.MenuItem opTransitionMenuItem) {
    this.setOpTransitionMenuItemEager(opTransitionMenuItem);
  }

  @Override
  public MenuItem getOpTransitionMenuItem() {
    if (inMemory) {
      return this.getOpTransitionMenuItemEager();
    } else {
      return this.getOpTransitionMenuItemLazy();
    }
  }

  public void cleanOpTransitionMenuItem() throws IOException {
    if (opTransitionMenuItemEagerSingleObject != null) {
      opTransitionMenuItemEagerSingleObject.close();
      opTransitionMenuItemEagerSingleObject = null;
    }
    if (opTransitionMenuItemLazySingleObject != null) {
      opTransitionMenuItemLazySingleObject.close();
      opTransitionMenuItemLazySingleObject = null;
    }
  }

  private EagerSingleObject<MenuItem> opTransitionMenuItemEagerSingleObject;

  public MenuItem getOpTransitionMenuItemEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTransitionMenuItemEagerSingleObject == null) {
      opTransitionMenuItemEagerSingleObject =
          new EagerSingleObject<MenuItem>(
              org.tura.model.designer.repository.serialized.form.MenuItem.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opTransitionMenuItemEagerSingleObject.get(
        this.getCpaPath(), "619bbb66-40ee-45a8-9168-6a8c4e51add5");
  }

  private void setOpTransitionMenuItemEager(
      org.tura.model.designer.repository.serialized.form.MenuItem opTransitionMenuItem) {
    if (opTransitionMenuItem != null) {
      opTransitionMenuItem.setTransition(this);
    }
  }

  private LazySingleObject<MenuItem> opTransitionMenuItemLazySingleObject;

  private MenuItem getOpTransitionMenuItemLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opTransitionMenuItemLazySingleObject == null) {
      opTransitionMenuItemLazySingleObject =
          new LazySingleObject<MenuItem>(
              org.tura.model.designer.repository.serialized.form.MenuItem.class,
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
                      getTransientRefTransitionMenuItem(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opTransitionMenuItemLazySingleObject.get(
        this.getCpaPath(), "619bbb66-40ee-45a8-9168-6a8c4e51add5");
  }

  @Override
  public void setOpImageTree(org.tura.model.designer.repository.serialized.form.Tree opImageTree) {
    this.setOpImageTreeEager(opImageTree);
  }

  @Override
  public Tree getOpImageTree() {
    if (inMemory) {
      return this.getOpImageTreeEager();
    } else {
      return this.getOpImageTreeLazy();
    }
  }

  public void cleanOpImageTree() throws IOException {
    if (opImageTreeEagerSingleObject != null) {
      opImageTreeEagerSingleObject.close();
      opImageTreeEagerSingleObject = null;
    }
    if (opImageTreeLazySingleObject != null) {
      opImageTreeLazySingleObject.close();
      opImageTreeLazySingleObject = null;
    }
  }

  private EagerSingleObject<Tree> opImageTreeEagerSingleObject;

  public Tree getOpImageTreeEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opImageTreeEagerSingleObject == null) {
      opImageTreeEagerSingleObject =
          new EagerSingleObject<Tree>(
              org.tura.model.designer.repository.serialized.form.Tree.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opImageTreeEagerSingleObject.get(
        this.getCpaPath(), "8a48c958-d7e6-4521-a35d-1833329bb3e7");
  }

  private void setOpImageTreeEager(
      org.tura.model.designer.repository.serialized.form.Tree opImageTree) {
    if (opImageTree != null) {
      opImageTree.setImage(this);
    }
  }

  private LazySingleObject<Tree> opImageTreeLazySingleObject;

  private Tree getOpImageTreeLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opImageTreeLazySingleObject == null) {
      opImageTreeLazySingleObject =
          new LazySingleObject<Tree>(
              org.tura.model.designer.repository.serialized.form.Tree.class,
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
                      getTransientRefImageTree(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opImageTreeLazySingleObject.get(
        this.getCpaPath(), "8a48c958-d7e6-4521-a35d-1833329bb3e7");
  }

  private String getTransientRefValueContextParameter() {
    return this.getObject().getTransientrefValueContextParameter();
  }

  @Override
  public void setTransientrefValueContextParameter(java.lang.String refValueContextParameter) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefValueContextParameter",
              this.getObject().getTransientrefValueContextParameter(),
              refValueContextParameter,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefValueContextParameter");
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
  public Boolean getConstant() {
    return this.getObject().getConstant();
  }

  @Override
  public void setConstant(java.lang.Boolean constant) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "Constant",
              this.getObject().getConstant(),
              constant,
              java.lang.Boolean.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "constant");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getValue() {
    return this.getObject().getValue();
  }

  @Override
  public void setValue(java.lang.String value) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "Value",
              this.getObject().getValue(),
              value,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "value");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  public List<ExpressionPart> getExpression() {
    if (inMemory) {
      return getExpressionEager();
    } else {
      return getExpressionLazy();
    }
  }

  public void cleanExpression() throws IOException {
    if (expressionEager != null) {
      expressionEager.close();
      expressionEager = null;
    }
    if (expressionLazy != null) {
      expressionLazy.close();
      expressionLazy = null;
    }
  }

  public static AddContainmentObjectOperation addExpression(
      org.tura.model.designer.repository.serialized.form.ContextValue master,
      org.tura.model.designer.repository.serialized.form.ExpressionPart detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("Expression");
    command.setDetailProperty("OpExpressionContextValue");
    return command;
  }

  public static RemoveContainmentObjectOperation rmExpression(
      org.tura.model.designer.repository.serialized.form.ContextValue master,
      org.tura.model.designer.repository.serialized.form.ExpressionPart detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("Expression");
    command.setDetailProperty("OpExpressionContextValue");
    return command;
  }

  private EagerList<ExpressionPart> expressionEager;

  public List<ExpressionPart> getExpressionEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (expressionEager == null) {
      expressionEager =
          new EagerList<ExpressionPart>(
              org.tura.model.designer.repository.serialized.form.ExpressionPart.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ExpressionPart expression) {
              if (expression == null) {
                return;
              }
              Boolean saveAttached = false;
              if (expression != null) {
                saveAttached = ((ObjectControl) expression).getAttached();
                ((ObjectControl) expression).setAttached(getAttached());
                ;
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddContainmentObjectOperation command =
                    addExpression(ContextProxy.this, expression);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, expression);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                if (expression != null) {
                  ((ObjectControl) expression).setAttached(saveAttached);
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
              ExpressionPart expression = (ExpressionPart) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(expression);
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
                      rmExpression(ContextProxy.this, expression);
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
                RemoveContainmentObjectOperation command =
                    rmExpression(ContextProxy.this, get(index));
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
              return ContextProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "629b2dc8-44ce-448f-9567-8353e8b2a794";
            }
          };
    }
    return expressionEager;
  }

  private LazyList<ExpressionPart> expressionLazy;

  public List<ExpressionPart> getExpressionLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (expressionLazy == null) {
      expressionLazy =
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
                      "refExpressionContextValue",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getUid(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ExpressionPart expression) {
              if (expression == null) {
                return;
              }
              getExpressionEager().add(i, expression);
              super.add(i, expression);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ExpressionPart expression = (ExpressionPart) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(expression);
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
                      rmExpression(ContextProxy.this, expression);
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
              return getExpressionEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return ContextProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "629b2dc8-44ce-448f-9567-8353e8b2a794";
            }
          };
    }
    return expressionLazy;
  }

  @Override
  public void setOpValueContextParameter(
      org.tura.model.designer.repository.serialized.form.ContextParameter opValueContextParameter) {
    this.setOpValueContextParameterEager(opValueContextParameter);
  }

  @Override
  public ContextParameter getOpValueContextParameter() {
    if (inMemory) {
      return this.getOpValueContextParameterEager();
    } else {
      return this.getOpValueContextParameterLazy();
    }
  }

  public void cleanOpValueContextParameter() throws IOException {
    if (opValueContextParameterEagerSingleObject != null) {
      opValueContextParameterEagerSingleObject.close();
      opValueContextParameterEagerSingleObject = null;
    }
    if (opValueContextParameterLazySingleObject != null) {
      opValueContextParameterLazySingleObject.close();
      opValueContextParameterLazySingleObject = null;
    }
  }

  private EagerSingleObject<ContextParameter> opValueContextParameterEagerSingleObject;

  public ContextParameter getOpValueContextParameterEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opValueContextParameterEagerSingleObject == null) {
      opValueContextParameterEagerSingleObject =
          new EagerSingleObject<ContextParameter>(
              org.tura.model.designer.repository.serialized.form.ContextParameter.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opValueContextParameterEagerSingleObject.get(
        this.getCpaPath(), "88770f3e-b6aa-4f87-bd77-c42153663e12");
  }

  private void setOpValueContextParameterEager(
      org.tura.model.designer.repository.serialized.form.ContextParameter opValueContextParameter) {
    if (opValueContextParameter != null) {
      opValueContextParameter.setValue(this);
    }
  }

  private LazySingleObject<ContextParameter> opValueContextParameterLazySingleObject;

  private ContextParameter getOpValueContextParameterLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opValueContextParameterLazySingleObject == null) {
      opValueContextParameterLazySingleObject =
          new LazySingleObject<ContextParameter>(
              org.tura.model.designer.repository.serialized.form.ContextParameter.class,
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
                      getTransientRefValueContextParameter(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opValueContextParameterLazySingleObject.get(
        this.getCpaPath(), "88770f3e-b6aa-4f87-bd77-c42153663e12");
  }

  @Override
  public String getSuidContextParameters() {
    return this.getObject().getSuidContextParameters();
  }

  public List<ContextParameter> getParameters() {
    if (inMemory) {
      return getParametersEager();
    } else {
      return getParametersLazy();
    }
  }

  public void cleanParameters() throws IOException {
    if (parametersEager != null) {
      parametersEager.close();
      parametersEager = null;
    }
    if (parametersLazy != null) {
      parametersLazy.close();
      parametersLazy = null;
    }
  }

  public static AddContainmentObjectOperation addParameters(
      org.tura.model.designer.repository.serialized.form.ContextParameters master,
      org.tura.model.designer.repository.serialized.form.ContextParameter detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("Parameters");
    command.setDetailProperty("OpParametersContextParameters");
    return command;
  }

  public static RemoveContainmentObjectOperation rmParameters(
      org.tura.model.designer.repository.serialized.form.ContextParameters master,
      org.tura.model.designer.repository.serialized.form.ContextParameter detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("Parameters");
    command.setDetailProperty("OpParametersContextParameters");
    return command;
  }

  private EagerList<ContextParameter> parametersEager;

  public List<ContextParameter> getParametersEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (parametersEager == null) {
      parametersEager =
          new EagerList<ContextParameter>(
              org.tura.model.designer.repository.serialized.form.ContextParameter.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ContextParameter parameters) {
              if (parameters == null) {
                return;
              }
              Boolean saveAttached = false;
              if (parameters != null) {
                saveAttached = ((ObjectControl) parameters).getAttached();
                ((ObjectControl) parameters).setAttached(getAttached());
                ;
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddContainmentObjectOperation command =
                    addParameters(ContextProxy.this, parameters);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, parameters);
                  if (getAttached() != null && getAttached()) {
                    repository.getStackProvider().get().addCommands(changes);
                  }
                }
              } catch (Exception e) {
                if (parameters != null) {
                  ((ObjectControl) parameters).setAttached(saveAttached);
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
              ContextParameter parameters = (ContextParameter) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(parameters);
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
                      rmParameters(ContextProxy.this, parameters);
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
                RemoveContainmentObjectOperation command =
                    rmParameters(ContextProxy.this, get(index));
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
              return ContextProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "3d70575c-c330-4449-b302-46098147fdd7";
            }
          };
    }
    return parametersEager;
  }

  private LazyList<ContextParameter> parametersLazy;

  public List<ContextParameter> getParametersLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (parametersLazy == null) {
      parametersLazy =
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
                      "refParametersContextParameters",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidContextParameters(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.form.ContextParameter parameters) {
              if (parameters == null) {
                return;
              }
              getParametersEager().add(i, parameters);
              super.add(i, parameters);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              ContextParameter parameters = (ContextParameter) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(parameters);
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
                      rmParameters(ContextProxy.this, parameters);
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
              return getParametersEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return ContextProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "3d70575c-c330-4449-b302-46098147fdd7";
            }
          };
    }
    return parametersLazy;
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
