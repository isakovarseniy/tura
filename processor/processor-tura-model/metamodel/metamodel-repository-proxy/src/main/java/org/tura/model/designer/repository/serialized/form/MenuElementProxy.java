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
import org.tura.model.designer.repository.serialized.form.mapper.MenuElementProxyMapper;
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
import org.tura.platform.repository.operation.RemoveContainmentObjectOperation;
import org.tura.platform.repository.operation.AddContainmentObjectOperation;
import org.tura.platform.repository.proxy.access.EagerList;
import org.tura.platform.repository.proxy.access.DelStruc;
import org.tura.platform.repository.proxy.access.LazyList;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class MenuElementProxy extends MenuElement
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

  public MenuElementProxy(
      org.tura.model.designer.repository.serialized.form.MenuElement object,
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

  public MenuElementProxy(MenuElementProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.opMenuElementsMenuFolderLazySingleObject = proxy.opMenuElementsMenuFolderLazySingleObject;
    this.opMenuElementsMenuFolderEagerSingleObject =
        proxy.opMenuElementsMenuFolderEagerSingleObject;
    this.multiLangLabelLazySingleObject = proxy.multiLangLabelLazySingleObject;
    this.multiLangLabelEagerSingleObject = proxy.multiLangLabelEagerSingleObject;
    this.styleLazySingleObject = proxy.styleLazySingleObject;
    this.styleEagerSingleObject = proxy.styleEagerSingleObject;
    this.classifiersEager = proxy.classifiersEager;
    this.enabledLazySingleObject = proxy.enabledLazySingleObject;
    this.enabledEagerSingleObject = proxy.enabledEagerSingleObject;
    this.fieldsLazy = proxy.fieldsLazy;
    this.fieldsEager = proxy.fieldsEager;
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
    if ("opMenuElementsMenuFolder".equals(name)) {
      cleanOpMenuElementsMenuFolder();
    }
    if ("multiLangLabel".equals(name)) {
      cleanMultiLangLabel();
    }
    if ("style".equals(name)) {
      cleanStyle();
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
  }

  public void setViewModelId1(Integer viewModelId1) {
    this.viewModelId1 = viewModelId1;
  }

  public Integer getViewModelId1() {
    return viewModelId1;
  }

  public MenuElementProxy inMemory() {
    MenuElementProxy inMProxy = new MenuElementProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.form.MenuElement.class;
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

  public MenuElement clone() {
    try {
      return (MenuElement)
          new MenuElementProxyMapper(repository.getRegistry()).copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public MenuElement deepClone() {
    try {
      return (MenuElement)
          new MenuElementProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public MenuElement deepClone(java.util.Map<Object, Object> context) {
    try {
      return (MenuElement)
          new MenuElementProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    MenuElementProxyMapper mapper = new MenuElementProxyMapper(repository.getRegistry());
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
    return new EClass("MenuElement");
  }

  public Object eContainer() {
    MenuElementProxy memPrx = new MenuElementProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpMenuElementsMenuFolder();
    if (container != null) {
      return container;
    }
    container = this.getOpMenuElementsMenuFolder();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof MenuElementProxy) {
      return this.getKey().equals(((MenuElementProxy) o).getKey());
    } else {
      if (o instanceof MenuElement) {
        MenuElement obj = (MenuElement) o;
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

  private MenuElement getObject() {
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

  private String getKey(org.tura.model.designer.repository.serialized.form.MenuElement object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.form.MenuElement");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new MenuElementProxyMapper(repository.getRegistry()).getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.MenuElement");
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
    return new MenuElementProxyMapper(repository.getRegistry()).getPath(this.getObject());
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
    str = str + " suid = " + getObject().getSuidMultiLangLabel();
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
      if (((ObjectControl) this.getMultiLangLabelEager()) != null) {
        ((ObjectControl) this.getMultiLangLabelEager()).setAttached(true);
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

  private String getTransientRefMenuElementsMenuFolder() {
    return this.getObject().getTransientrefMenuElementsMenuFolder();
  }

  @Override
  public void setTransientrefMenuElementsMenuFolder(java.lang.String refMenuElementsMenuFolder) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefMenuElementsMenuFolder",
              this.getObject().getTransientrefMenuElementsMenuFolder(),
              refMenuElementsMenuFolder,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefMenuElementsMenuFolder");
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
  public void setOpMenuElementsMenuFolder(
      org.tura.model.designer.repository.serialized.form.MenuFolder opMenuElementsMenuFolder) {
    this.setOpMenuElementsMenuFolderEager(opMenuElementsMenuFolder);
  }

  @Override
  public MenuFolder getOpMenuElementsMenuFolder() {
    if (inMemory) {
      return this.getOpMenuElementsMenuFolderEager();
    } else {
      return this.getOpMenuElementsMenuFolderLazy();
    }
  }

  public void cleanOpMenuElementsMenuFolder() throws IOException {
    if (opMenuElementsMenuFolderEagerSingleObject != null) {
      opMenuElementsMenuFolderEagerSingleObject.close();
      opMenuElementsMenuFolderEagerSingleObject = null;
    }
    if (opMenuElementsMenuFolderLazySingleObject != null) {
      opMenuElementsMenuFolderLazySingleObject.close();
      opMenuElementsMenuFolderLazySingleObject = null;
    }
  }

  private EagerSingleObject<MenuFolder> opMenuElementsMenuFolderEagerSingleObject;

  public MenuFolder getOpMenuElementsMenuFolderEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMenuElementsMenuFolderEagerSingleObject == null) {
      opMenuElementsMenuFolderEagerSingleObject =
          new EagerSingleObject<MenuFolder>(
              org.tura.model.designer.repository.serialized.form.MenuFolder.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opMenuElementsMenuFolderEagerSingleObject.get(
        this.getCpaPath(), "b8a4cdc1-cdf8-47ea-ba4e-096e2bd71305");
  }

  private void setOpMenuElementsMenuFolderEager(
      org.tura.model.designer.repository.serialized.form.MenuFolder opMenuElementsMenuFolder) {
    if (opMenuElementsMenuFolder != null) {
      opMenuElementsMenuFolder.getMenuElements().add(this);
    }
  }

  private LazySingleObject<MenuFolder> opMenuElementsMenuFolderLazySingleObject;

  private MenuFolder getOpMenuElementsMenuFolderLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMenuElementsMenuFolderLazySingleObject == null) {
      opMenuElementsMenuFolderLazySingleObject =
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
                      getTransientRefMenuElementsMenuFolder(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opMenuElementsMenuFolderLazySingleObject.get(
        this.getCpaPath(), "b8a4cdc1-cdf8-47ea-ba4e-096e2bd71305");
  }

  @Override
  public String getSuidMultiLangLabel() {
    return this.getObject().getSuidMultiLangLabel();
  }

  public void setMultiLangLabel(
      org.tura.model.designer.repository.serialized.form.Context multiLangLabel) {
    this.setMultiLangLabelEager(multiLangLabel);
  }

  public Context getMultiLangLabel() {
    if (inMemory) {
      return this.getMultiLangLabelEager();
    } else {
      return this.getMultiLangLabelLazy();
    }
  }

  public void cleanMultiLangLabel() throws IOException {
    if (multiLangLabelLazySingleObject != null) {
      multiLangLabelLazySingleObject.close();
      multiLangLabelLazySingleObject = null;
    }
    if (multiLangLabelEagerSingleObject != null) {
      multiLangLabelEagerSingleObject.close();
      multiLangLabelEagerSingleObject = null;
    }
  }

  private EagerSingleObject<Context> multiLangLabelEagerSingleObject;

  public static RemoveContainmentObjectOperation rmMultiLangLabel(
      org.tura.model.designer.repository.serialized.form.MultiLangLabel master,
      org.tura.model.designer.repository.serialized.form.Context detail) {
    RemoveContainmentObjectOperation command = new RemoveContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setMasterProperty("MultiLangLabel");
    command.setDetailProperty("OpMultiLangLabelMultiLangLabel");
    return command;
  }

  public static AddContainmentObjectOperation addMultiLangLabel(
      org.tura.model.designer.repository.serialized.form.MultiLangLabel master,
      org.tura.model.designer.repository.serialized.form.Context detail) {
    AddContainmentObjectOperation command = new AddContainmentObjectOperation();
    command.setRelationType("One2One");
    command.setMaster((ObjectControl) master);
    command.setDetail(((ObjectControl) detail));
    command.setMasterProperty("MultiLangLabel");
    command.setDetailProperty("OpMultiLangLabelMultiLangLabel");
    return command;
  }

  public Context getMultiLangLabelEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (multiLangLabelEagerSingleObject == null) {
      multiLangLabelEagerSingleObject =
          new EagerSingleObject<Context>(
              org.tura.model.designer.repository.serialized.form.Context.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct);
    }
    return multiLangLabelEagerSingleObject.get(
        this.getCpaPath(), "dd98c7c0-aba5-4b30-a668-000006aa415f");
  }

  private void setMultiLangLabelEager(
      org.tura.model.designer.repository.serialized.form.Context multiLangLabel) {
    String session = UUID.randomUUID().toString();
    Boolean saveAttached = false;
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      if (multiLangLabel != null) {
        saveAttached = ((ObjectControl) multiLangLabel).getAttached();
        ((ObjectControl) multiLangLabel).setAttached(this.getAttached());
      }
      if (this.getMultiLangLabelEager() != null) {
        RemoveContainmentObjectOperation command =
            rmMultiLangLabel(this, this.getMultiLangLabelEager());
        command.setStackProvider(localStackProvider);
        command.prepare();
      }
      if (multiLangLabel != null) {
        AddContainmentObjectOperation command2 = addMultiLangLabel(this, multiLangLabel);
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
      if (multiLangLabel != null) {
        ((ObjectControl) multiLangLabel).setAttached(saveAttached);
      }
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  private LazySingleObject<Context> multiLangLabelLazySingleObject;

  private Context getMultiLangLabelLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (multiLangLabelLazySingleObject == null) {
      multiLangLabelLazySingleObject =
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
                      "refMultiLangLabelMultiLangLabel",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMultiLangLabel(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return multiLangLabelLazySingleObject.get(
        this.getCpaPath(), "dd98c7c0-aba5-4b30-a668-000006aa415f");
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
                    addClassifiers(MenuElementProxy.this, classifiers);
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
                      rmClassifiers(MenuElementProxy.this, classifiers);
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
                    rmClassifiers(MenuElementProxy.this, get(index));
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
              return MenuElementProxy.this.getCpaPath();
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
                AddContainmentObjectOperation command = addFields(MenuElementProxy.this, fields);
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
                  RemoveContainmentObjectOperation command =
                      rmFields(MenuElementProxy.this, fields);
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
                    rmFields(MenuElementProxy.this, get(index));
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
              return MenuElementProxy.this.getCpaPath();
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
                  RemoveContainmentObjectOperation command =
                      rmFields(MenuElementProxy.this, fields);
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
              return MenuElementProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "6ed5ba2a-8b06-4f91-aef9-83c9c9117dfa";
            }
          };
    }
    return fieldsLazy;
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
