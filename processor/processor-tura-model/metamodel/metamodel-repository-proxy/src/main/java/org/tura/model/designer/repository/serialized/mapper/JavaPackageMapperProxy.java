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

package org.tura.model.designer.repository.serialized.mapper;

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
import org.tura.model.designer.repository.serialized.mapper.mapper.JavaPackageMapperProxyMapper;
import org.tura.platform.repository.cpa.EClass;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.operation.UpdateObjectOperation;
import java.util.List;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.platform.repository.operation.AddObjectOperation;
import org.tura.platform.repository.operation.RemoveObjectOperation;
import org.tura.platform.repository.proxy.access.EagerList;
import org.tura.platform.repository.proxy.access.DelStruc;
import org.tura.platform.repository.proxy.access.LazyList;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.platform.repository.proxy.access.EagerSingleObject;
import org.tura.platform.repository.proxy.access.LazySingleObject;
import org.tura.model.designer.repository.serialized.type.TypeGroup;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.serialized.form.ContextParameter;
import org.tura.model.designer.repository.serialized.form.ExpressionPart;
import org.tura.model.designer.repository.serialized.form.ControlPointer;
import org.tura.model.designer.repository.serialized.form.Selection;
import org.tura.model.designer.repository.serialized.form.OrderBy;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class JavaPackageMapperProxy extends JavaPackageMapper
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

  public JavaPackageMapperProxy(
      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper object,
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

  public JavaPackageMapperProxy(JavaPackageMapperProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
    this.opMapperRefJavaComponentLazy = proxy.opMapperRefJavaComponentLazy;
    this.opMapperRefJavaComponentEager = proxy.opMapperRefJavaComponentEager;
    this.opMapperRefJavaScriptComponentLazy = proxy.opMapperRefJavaScriptComponentLazy;
    this.opMapperRefJavaScriptComponentEager = proxy.opMapperRefJavaScriptComponentEager;
    this.layersLazy = proxy.layersLazy;
    this.layersEager = proxy.layersEager;
    this.opMappersMappersLazySingleObject = proxy.opMappersMappersLazySingleObject;
    this.opMappersMappersEagerSingleObject = proxy.opMappersMappersEagerSingleObject;
    this.packageRefLazySingleObject = proxy.packageRefLazySingleObject;
    this.packageRefEagerSingleObject = proxy.packageRefEagerSingleObject;
    this.versionRefLazySingleObject = proxy.versionRefLazySingleObject;
    this.versionRefEagerSingleObject = proxy.versionRefEagerSingleObject;
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
    if ("opMapperRefJavaComponent".equals(name)) {
      cleanOpMapperRefJavaComponent();
    }
    if ("opMapperRefJavaScriptComponent".equals(name)) {
      cleanOpMapperRefJavaScriptComponent();
    }
    if ("layers".equals(name)) {
      cleanLayers();
    }
    if ("opMappersMappers".equals(name)) {
      cleanOpMappersMappers();
    }
    if ("packageRef".equals(name)) {
      cleanPackageRef();
    }
    if ("versionRef".equals(name)) {
      cleanVersionRef();
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

  public JavaPackageMapperProxy inMemory() {
    JavaPackageMapperProxy inMProxy = new JavaPackageMapperProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper.class;
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

  public JavaPackageMapper clone() {
    try {
      return (JavaPackageMapper)
          new JavaPackageMapperProxyMapper(repository.getRegistry())
              .copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public JavaPackageMapper deepClone() {
    try {
      return (JavaPackageMapper)
          new JavaPackageMapperProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public JavaPackageMapper deepClone(java.util.Map<Object, Object> context) {
    try {
      return (JavaPackageMapper)
          new JavaPackageMapperProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    JavaPackageMapperProxyMapper mapper =
        new JavaPackageMapperProxyMapper(repository.getRegistry());
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
    return new EClass("JavaPackageMapper");
  }

  public Object eContainer() {
    JavaPackageMapperProxy memPrx = new JavaPackageMapperProxy(this);
    memPrx.inMemory = true;
    Object container = null;
    container = memPrx.getOpMappersMappers();
    if (container != null) {
      return container;
    }
    container = this.getOpMappersMappers();
    if (container != null) {
      return container;
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof JavaPackageMapperProxy) {
      return this.getKey().equals(((JavaPackageMapperProxy) o).getKey());
    } else {
      if (o instanceof JavaPackageMapper) {
        JavaPackageMapper obj = (JavaPackageMapper) o;
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

  private JavaPackageMapper getObject() {
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
      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new JavaPackageMapperProxyMapper(repository.getRegistry())
        .getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper");
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
    return new JavaPackageMapperProxyMapper(repository.getRegistry()).getPath(this.getObject());
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
    str = str + " mappedToPackageName = " + getObject().getMappedToPackageName();
    str = str + " artifactId = " + getObject().getArtifactId();
    str = str + " groupId = " + getObject().getGroupId();
    str = str + " scope = " + getObject().getScope();
    str = str + " libraryName = " + getObject().getLibraryName();
    str = str + " artifactType = " + getObject().getArtifactType();
    str = str + " suid = " + getObject().getSuidPackageMapper();
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
  public String getMappedToPackageName() {
    return this.getObject().getMappedToPackageName();
  }

  @Override
  public void setMappedToPackageName(java.lang.String mappedToPackageName) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "MappedToPackageName",
              this.getObject().getMappedToPackageName(),
              mappedToPackageName,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "mappedToPackageName");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getArtifactId() {
    return this.getObject().getArtifactId();
  }

  @Override
  public void setArtifactId(java.lang.String artifactId) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "ArtifactId",
              this.getObject().getArtifactId(),
              artifactId,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "artifactId");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getGroupId() {
    return this.getObject().getGroupId();
  }

  @Override
  public void setGroupId(java.lang.String groupId) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "GroupId",
              this.getObject().getGroupId(),
              groupId,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "groupId");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public JavaLibScope getScope() {
    return this.getObject().getScope();
  }

  @Override
  public void setScope(org.tura.model.designer.repository.serialized.mapper.JavaLibScope scope) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "Scope",
              this.getObject().getScope(),
              scope,
              org.tura.model.designer.repository.serialized.mapper.JavaLibScope.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "scope");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getLibraryName() {
    return this.getObject().getLibraryName();
  }

  @Override
  public void setLibraryName(java.lang.String libraryName) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "LibraryName",
              this.getObject().getLibraryName(),
              libraryName,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "libraryName");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public ArtifactType getArtifactType() {
    return this.getObject().getArtifactType();
  }

  @Override
  public void setArtifactType(
      org.tura.model.designer.repository.serialized.mapper.ArtifactType artifactType) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "ArtifactType",
              this.getObject().getArtifactType(),
              artifactType,
              org.tura.model.designer.repository.serialized.mapper.ArtifactType.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "artifactType");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getSuidPackageMapper() {
    return this.getObject().getSuidPackageMapper();
  }

  private String getTransientRefMappersMappers() {
    return this.getObject().getTransientrefMappersMappers();
  }

  @Override
  public void setTransientrefMappersMappers(java.lang.String refMappersMappers) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefMappersMappers",
              this.getObject().getTransientrefMappersMappers(),
              refMappersMappers,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefMappersMappers");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getSuidMapper() {
    return this.getObject().getSuidMapper();
  }

  public List<JavaComponent> getOpMapperRefJavaComponent() {
    if (inMemory) {
      return getOpMapperRefJavaComponentEager();
    } else {
      return getOpMapperRefJavaComponentLazy();
    }
  }

  public void cleanOpMapperRefJavaComponent() throws IOException {
    if (opMapperRefJavaComponentEager != null) {
      opMapperRefJavaComponentEager.close();
      opMapperRefJavaComponentEager = null;
    }
    if (opMapperRefJavaComponentLazy != null) {
      opMapperRefJavaComponentLazy.close();
      opMapperRefJavaComponentLazy = null;
    }
  }

  public static AddObjectOperation addOpMapperRefJavaComponent(
      org.tura.model.designer.repository.serialized.mapper.Mapper master,
      org.tura.model.designer.repository.serialized.recipe.JavaComponent detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpMapperRefJavaComponent");
    command.setDetailProperty("MapperRef");
    return command;
  }

  public static RemoveObjectOperation rmOpMapperRefJavaComponent(
      org.tura.model.designer.repository.serialized.mapper.Mapper master,
      org.tura.model.designer.repository.serialized.recipe.JavaComponent detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpMapperRefJavaComponent");
    command.setDetailProperty("MapperRef");
    return command;
  }

  private EagerList<JavaComponent> opMapperRefJavaComponentEager;

  public List<JavaComponent> getOpMapperRefJavaComponentEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMapperRefJavaComponentEager == null) {
      opMapperRefJavaComponentEager =
          new EagerList<JavaComponent>(
              org.tura.model.designer.repository.serialized.recipe.JavaComponent.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.recipe.JavaComponent
                    opMapperRefJavaComponent) {
              if (opMapperRefJavaComponent == null) {
                return;
              }
              if (opMapperRefJavaComponent != null
                  && (opMapperRefJavaComponent.getAttached() == null
                      || !opMapperRefJavaComponent.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opMapperRefJavaComponent);
                  repository.insert(opMapperRefJavaComponent, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                          .this,
                      org.tura.model.designer.repository.serialized.mapper.Mapper.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpMapperRefJavaComponent(
                        JavaPackageMapperProxy.this, opMapperRefJavaComponent);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opMapperRefJavaComponent);
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
              JavaComponent opMapperRefJavaComponent = (JavaComponent) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opMapperRefJavaComponent);
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
                      rmOpMapperRefJavaComponent(
                          JavaPackageMapperProxy.this, opMapperRefJavaComponent);
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
            public JavaComponent remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpMapperRefJavaComponent(JavaPackageMapperProxy.this, get(index));
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
              return JavaPackageMapperProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "41df904d-8e41-4893-9a37-76dbf4421308";
            }
          };
    }
    return opMapperRefJavaComponentEager;
  }

  private LazyList<JavaComponent> opMapperRefJavaComponentLazy;

  public List<JavaComponent> getOpMapperRefJavaComponentLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMapperRefJavaComponentLazy == null) {
      opMapperRefJavaComponentLazy =
          new LazyList<JavaComponent>(
              org.tura.model.designer.repository.serialized.recipe.JavaComponent.class,
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
                      "refOpMapperRefJavaComponentMapper",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMapper(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.recipe.JavaComponent
                    opMapperRefJavaComponent) {
              if (opMapperRefJavaComponent == null) {
                return;
              }
              getOpMapperRefJavaComponentEager().add(i, opMapperRefJavaComponent);
              super.add(i, opMapperRefJavaComponent);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              JavaComponent opMapperRefJavaComponent = (JavaComponent) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opMapperRefJavaComponent);
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
                      rmOpMapperRefJavaComponent(
                          JavaPackageMapperProxy.this, opMapperRefJavaComponent);
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
            public JavaComponent remove(int index) {
              super.remove(index);
              return getOpMapperRefJavaComponentEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return JavaPackageMapperProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "41df904d-8e41-4893-9a37-76dbf4421308";
            }
          };
    }
    return opMapperRefJavaComponentLazy;
  }

  public List<JavaScriptComponent> getOpMapperRefJavaScriptComponent() {
    if (inMemory) {
      return getOpMapperRefJavaScriptComponentEager();
    } else {
      return getOpMapperRefJavaScriptComponentLazy();
    }
  }

  public void cleanOpMapperRefJavaScriptComponent() throws IOException {
    if (opMapperRefJavaScriptComponentEager != null) {
      opMapperRefJavaScriptComponentEager.close();
      opMapperRefJavaScriptComponentEager = null;
    }
    if (opMapperRefJavaScriptComponentLazy != null) {
      opMapperRefJavaScriptComponentLazy.close();
      opMapperRefJavaScriptComponentLazy = null;
    }
  }

  public static AddObjectOperation addOpMapperRefJavaScriptComponent(
      org.tura.model.designer.repository.serialized.mapper.Mapper master,
      org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpMapperRefJavaScriptComponent");
    command.setDetailProperty("MapperRef");
    return command;
  }

  public static RemoveObjectOperation rmOpMapperRefJavaScriptComponent(
      org.tura.model.designer.repository.serialized.mapper.Mapper master,
      org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("One2Many");
    command.setMasterProperty("OpMapperRefJavaScriptComponent");
    command.setDetailProperty("MapperRef");
    return command;
  }

  private EagerList<JavaScriptComponent> opMapperRefJavaScriptComponentEager;

  public List<JavaScriptComponent> getOpMapperRefJavaScriptComponentEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMapperRefJavaScriptComponentEager == null) {
      opMapperRefJavaScriptComponentEager =
          new EagerList<JavaScriptComponent>(
              org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent
                    opMapperRefJavaScriptComponent) {
              if (opMapperRefJavaScriptComponent == null) {
                return;
              }
              if (opMapperRefJavaScriptComponent != null
                  && (opMapperRefJavaScriptComponent.getAttached() == null
                      || !opMapperRefJavaScriptComponent.getAttached())) {
                try {
                  ObjectControl oc = (ObjectControl) (opMapperRefJavaScriptComponent);
                  repository.insert(opMapperRefJavaScriptComponent, oc.getProxyClazz());
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              if (getAttached() == null || !getAttached()) {
                try {
                  repository.insert(
                      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                          .this,
                      org.tura.model.designer.repository.serialized.mapper.Mapper.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpMapperRefJavaScriptComponent(
                        JavaPackageMapperProxy.this, opMapperRefJavaScriptComponent);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, opMapperRefJavaScriptComponent);
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
              JavaScriptComponent opMapperRefJavaScriptComponent = (JavaScriptComponent) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opMapperRefJavaScriptComponent);
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
                      rmOpMapperRefJavaScriptComponent(
                          JavaPackageMapperProxy.this, opMapperRefJavaScriptComponent);
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
            public JavaScriptComponent remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmOpMapperRefJavaScriptComponent(JavaPackageMapperProxy.this, get(index));
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
              return JavaPackageMapperProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "42df3928-fc6d-47f9-bd74-25ae5083d0c0";
            }
          };
    }
    return opMapperRefJavaScriptComponentEager;
  }

  private LazyList<JavaScriptComponent> opMapperRefJavaScriptComponentLazy;

  public List<JavaScriptComponent> getOpMapperRefJavaScriptComponentLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMapperRefJavaScriptComponentLazy == null) {
      opMapperRefJavaScriptComponentLazy =
          new LazyList<JavaScriptComponent>(
              org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent.class,
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
                      "refOpMapperRefJavaScriptComponentMapper",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMapper(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i,
                org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent
                    opMapperRefJavaScriptComponent) {
              if (opMapperRefJavaScriptComponent == null) {
                return;
              }
              getOpMapperRefJavaScriptComponentEager().add(i, opMapperRefJavaScriptComponent);
              super.add(i, opMapperRefJavaScriptComponent);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              JavaScriptComponent opMapperRefJavaScriptComponent = (JavaScriptComponent) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(opMapperRefJavaScriptComponent);
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
                      rmOpMapperRefJavaScriptComponent(
                          JavaPackageMapperProxy.this, opMapperRefJavaScriptComponent);
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
            public JavaScriptComponent remove(int index) {
              super.remove(index);
              return getOpMapperRefJavaScriptComponentEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return JavaPackageMapperProxy.this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "42df3928-fc6d-47f9-bd74-25ae5083d0c0";
            }
          };
    }
    return opMapperRefJavaScriptComponentLazy;
  }

  public List<MappingLayer> getLayers() {
    if (inMemory) {
      return getLayersEager();
    } else {
      return getLayersLazy();
    }
  }

  public void cleanLayers() throws IOException {
    if (layersEager != null) {
      layersEager.close();
      layersEager = null;
    }
    if (layersLazy != null) {
      layersLazy.close();
      layersLazy = null;
    }
  }

  public static AddObjectOperation addLayers(
      org.tura.model.designer.repository.serialized.mapper.Mapper master,
      org.tura.model.designer.repository.serialized.mapper.MappingLayer detail) {
    AddObjectOperation command = new AddObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("Many2Many");
    command.setMasterProperty("Layers");
    command.setDetailProperty("OpLayersMapper");
    return command;
  }

  public static RemoveObjectOperation rmLayers(
      org.tura.model.designer.repository.serialized.mapper.Mapper master,
      org.tura.model.designer.repository.serialized.mapper.MappingLayer detail) {
    RemoveObjectOperation command = new RemoveObjectOperation();
    command.setMaster((ObjectControl) master);
    command.setDetail((ObjectControl) detail);
    command.setRelationType("Many2Many");
    command.setMasterProperty("Layers");
    command.setDetailProperty("OpLayersMapper");
    return command;
  }

  private EagerList<MappingLayer> layersEager;

  public List<MappingLayer> getLayersEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (layersEager == null) {
      layersEager =
          new EagerList<MappingLayer>(
              org.tura.model.designer.repository.serialized.mapper.MappingLayer.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Direct) {

            private static final long serialVersionUID = 1L;

            @Override
            public void add(
                int i, org.tura.model.designer.repository.serialized.mapper.MappingLayer layers) {
              if (layers == null) {
                return;
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                if (layers != null && (layers.getAttached() == null || !layers.getAttached())) {
                  try {
                    ObjectControl oc = (ObjectControl) (layers);
                    repository.insert(layers, oc.getProxyClazz());
                  } catch (RepositoryException e) {
                    throw new RuntimeException(e);
                  }
                }
                if (getAttached() == null || !getAttached()) {
                  try {
                    repository.insert(
                        org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                            .this,
                        org.tura.model.designer.repository.serialized.mapper.Mapper.class);
                  } catch (RepositoryException e) {
                    throw new RuntimeException(e);
                  }
                }
                AddObjectOperation command =
                    addLayers(
                        org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                            .this,
                        layers);
                command.setStackProvider(localStackProvider);
                if (command.prepare()) {
                  List<Object> changes = localStackProvider.get().getListOfCommand();
                  localStackProvider.get().commit();
                  super.add(i, layers);
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
              MappingLayer layers = (MappingLayer) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(layers);
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
                      rmLayers(
                          org.tura.model.designer.repository.serialized.mapper
                              .JavaPackageMapperProxy.this,
                          layers);
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
            public MappingLayer remove(int index) {
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                RemoveObjectOperation command =
                    rmLayers(
                        org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                            .this,
                        get(index));
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
              return org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                  .this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "c3e336d9-4075-4d1d-a67e-593d070462d0";
            }
          };
    }
    return layersEager;
  }

  private LazyList<MappingLayer> layersLazy;

  public List<MappingLayer> getLayersLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (layersLazy == null) {
      layersLazy =
          new LazyList<MappingLayer>(
              org.tura.model.designer.repository.serialized.mapper.MappingLayer.class,
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
                      org.tura.platform.datacontrol.commons.Constants.JPA_QUERY,
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      org.tura.platform.datacontrol.commons.Constants.MANY2MANY_QUERY,
                      String.class.getName()));
              search.add(
                  new SearchCriteria(
                      org.tura.platform.datacontrol.commons.Constants.JPA_QUERY_MANY2MANY_TYPE,
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      "org.tura.model.designer.repository.serialized.mapper.Mapper",
                      String.class.getName()));
              search.add(
                  new SearchCriteria(
                      org.tura.platform.datacontrol.commons.Constants.JPA_QUERY_MANY2MANY_METHOD,
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      "Layers",
                      String.class.getName()));
              search.add(
                  new SearchCriteria(
                      "suid",
                      com.octo.java.sql.exp.Operator.EQ.name(),
                      getSuidMapper(),
                      java.lang.String.class.getName()));
              return search;
            }

            @Override
            public void add(
                int i, org.tura.model.designer.repository.serialized.mapper.MappingLayer layers) {
              if (layers == null) {
                return;
              }
              getLayersEager().add(i, layers);
              super.add(i, layers);
            }

            @Override
            public boolean remove(Object obj) {
              if (obj == null) {
                return false;
              }
              MappingLayer layers = (MappingLayer) obj;
              DelStruc valid = null;
              try {
                valid = super.isRemovable(layers);
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
                      rmLayers(
                          org.tura.model.designer.repository.serialized.mapper
                              .JavaPackageMapperProxy.this,
                          layers);
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
            public MappingLayer remove(int index) {
              super.remove(index);
              return getLayersEager().remove(index);
            }

            @Override
            public RepoKeyPath getParentKeyPath() {
              return org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                  .this.getCpaPath();
            }

            @Override
            public String getProperty() {
              return "c3e336d9-4075-4d1d-a67e-593d070462d0";
            }
          };
    }
    return layersLazy;
  }

  @Override
  public void setOpMappersMappers(
      org.tura.model.designer.repository.serialized.mapper.Mappers opMappersMappers) {
    this.setOpMappersMappersEager(opMappersMappers);
  }

  @Override
  public Mappers getOpMappersMappers() {
    if (inMemory) {
      return this.getOpMappersMappersEager();
    } else {
      return this.getOpMappersMappersLazy();
    }
  }

  public void cleanOpMappersMappers() throws IOException {
    if (opMappersMappersEagerSingleObject != null) {
      opMappersMappersEagerSingleObject.close();
      opMappersMappersEagerSingleObject = null;
    }
    if (opMappersMappersLazySingleObject != null) {
      opMappersMappersLazySingleObject.close();
      opMappersMappersLazySingleObject = null;
    }
  }

  private EagerSingleObject<Mappers> opMappersMappersEagerSingleObject;

  public Mappers getOpMappersMappersEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMappersMappersEagerSingleObject == null) {
      opMappersMappersEagerSingleObject =
          new EagerSingleObject<Mappers>(
              org.tura.model.designer.repository.serialized.mapper.Mappers.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return opMappersMappersEagerSingleObject.get(
        this.getCpaPath(), "054765d4-bee9-452f-90aa-8488fda6db3a");
  }

  private void setOpMappersMappersEager(
      org.tura.model.designer.repository.serialized.mapper.Mappers opMappersMappers) {
    if (opMappersMappers != null) {
      opMappersMappers.getMappers().add(this);
    }
  }

  private LazySingleObject<Mappers> opMappersMappersLazySingleObject;

  private Mappers getOpMappersMappersLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (opMappersMappersLazySingleObject == null) {
      opMappersMappersLazySingleObject =
          new LazySingleObject<Mappers>(
              org.tura.model.designer.repository.serialized.mapper.Mappers.class,
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
                      getTransientRefMappersMappers(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return opMappersMappersLazySingleObject.get(
        this.getCpaPath(), "054765d4-bee9-452f-90aa-8488fda6db3a");
  }

  private String getTransientRefOpPackageRefPackagePointerTypeGroup() {
    return this.getObject().getTransientrefOpPackageRefPackagePointerTypeGroup();
  }

  @Override
  public void setTransientrefOpPackageRefPackagePointerTypeGroup(
      java.lang.String refOpPackageRefPackagePointerTypeGroup) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefOpPackageRefPackagePointerTypeGroup",
              this.getObject().getTransientrefOpPackageRefPackagePointerTypeGroup(),
              refOpPackageRefPackagePointerTypeGroup,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefOpPackageRefPackagePointerTypeGroup");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getSuidPackagePointer() {
    return this.getObject().getSuidPackagePointer();
  }

  @Override
  public void setPackageRef(
      org.tura.model.designer.repository.serialized.type.TypeGroup packageRef) {
    this.setPackageRefEager(packageRef);
  }

  @Override
  public TypeGroup getPackageRef() {
    if (inMemory) {
      return this.getPackageRefEager();
    } else {
      return this.getPackageRefLazy();
    }
  }

  public void cleanPackageRef() throws IOException {
    if (packageRefEagerSingleObject != null) {
      packageRefEagerSingleObject.close();
      packageRefEagerSingleObject = null;
    }
    if (packageRefLazySingleObject != null) {
      packageRefLazySingleObject.close();
      packageRefLazySingleObject = null;
    }
  }

  private EagerSingleObject<TypeGroup> packageRefEagerSingleObject;

  public TypeGroup getPackageRefEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (packageRefEagerSingleObject == null) {
      packageRefEagerSingleObject =
          new EagerSingleObject<TypeGroup>(
              org.tura.model.designer.repository.serialized.type.TypeGroup.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return packageRefEagerSingleObject.get(
        this.getCpaPath(), "c215fe43-45b8-4ac2-b572-354329c62558");
  }

  private void setPackageRefEager(
      org.tura.model.designer.repository.serialized.type.TypeGroup packageRef) {
    if (packageRef != null) {
      packageRef.getOpPackageRefPackagePointer().add(this);
    }
  }

  private LazySingleObject<TypeGroup> packageRefLazySingleObject;

  private TypeGroup getPackageRefLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (packageRefLazySingleObject == null) {
      packageRefLazySingleObject =
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
                      getTransientRefOpPackageRefPackagePointerTypeGroup(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return packageRefLazySingleObject.get(
        this.getCpaPath(), "c215fe43-45b8-4ac2-b572-354329c62558");
  }

  private String getTransientRefOpVersionRefVersionRefVersion() {
    return this.getObject().getTransientrefOpVersionRefVersionRefVersion();
  }

  @Override
  public void setTransientrefOpVersionRefVersionRefVersion(
      java.lang.String refOpVersionRefVersionRefVersion) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "transientrefOpVersionRefVersionRefVersion",
              this.getObject().getTransientrefOpVersionRefVersionRefVersion(),
              refOpVersionRefVersionRefVersion,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "transientrefOpVersionRefVersionRefVersion");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getSuidVersionRef() {
    return this.getObject().getSuidVersionRef();
  }

  @Override
  public void setVersionRef(
      org.tura.model.designer.repository.serialized.mapper.Version versionRef) {
    this.setVersionRefEager(versionRef);
  }

  @Override
  public Version getVersionRef() {
    if (inMemory) {
      return this.getVersionRefEager();
    } else {
      return this.getVersionRefLazy();
    }
  }

  public void cleanVersionRef() throws IOException {
    if (versionRefEagerSingleObject != null) {
      versionRefEagerSingleObject.close();
      versionRefEagerSingleObject = null;
    }
    if (versionRefLazySingleObject != null) {
      versionRefLazySingleObject.close();
      versionRefLazySingleObject = null;
    }
  }

  private EagerSingleObject<Version> versionRefEagerSingleObject;

  public Version getVersionRefEager() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (versionRefEagerSingleObject == null) {
      versionRefEagerSingleObject =
          new EagerSingleObject<Version>(
              org.tura.model.designer.repository.serialized.mapper.Version.class,
              storageProvider,
              repository,
              org.tura.platform.repository.core.RelationType.Opposite);
    }
    return versionRefEagerSingleObject.get(
        this.getCpaPath(), "9a269e3f-0868-4818-ab6d-f8ffed36e01c");
  }

  private void setVersionRefEager(
      org.tura.model.designer.repository.serialized.mapper.Version versionRef) {
    if (versionRef != null) {
      versionRef.getOpVersionRefVersionRef().add(this);
    }
  }

  private LazySingleObject<Version> versionRefLazySingleObject;

  private Version getVersionRefLazy() {
    if (this.getObject() == null) {
      throw new RuntimeException("No object found");
    }
    if (versionRefLazySingleObject == null) {
      versionRefLazySingleObject =
          new LazySingleObject<Version>(
              org.tura.model.designer.repository.serialized.mapper.Version.class,
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
                      getTransientRefOpVersionRefVersionRefVersion(),
                      java.lang.String.class.getName()));
              return search;
            }
          };
    }
    return versionRefLazySingleObject.get(
        this.getCpaPath(), "9a269e3f-0868-4818-ab6d-f8ffed36e01c");
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
                      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                          .this,
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
                        JavaPackageMapperProxy.this, opSourceAttributeConnector);
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
                          JavaPackageMapperProxy.this, opSourceAttributeConnector);
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
                    rmOpSourceAttributeConnector(JavaPackageMapperProxy.this, get(index));
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                          JavaPackageMapperProxy.this, opSourceAttributeConnector);
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                          .this,
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
                        JavaPackageMapperProxy.this, opTargetAttributeConnector);
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
                          JavaPackageMapperProxy.this, opTargetAttributeConnector);
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
                    rmOpTargetAttributeConnector(JavaPackageMapperProxy.this, get(index));
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                          JavaPackageMapperProxy.this, opTargetAttributeConnector);
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                          .this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpRefObjContextParameter(
                        JavaPackageMapperProxy.this, opRefObjContextParameter);
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
                          JavaPackageMapperProxy.this, opRefObjContextParameter);
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
                    rmOpRefObjContextParameter(JavaPackageMapperProxy.this, get(index));
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                          JavaPackageMapperProxy.this, opRefObjContextParameter);
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                          .this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpObjRefExpressionPart(JavaPackageMapperProxy.this, opObjRefExpressionPart);
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
                      rmOpObjRefExpressionPart(JavaPackageMapperProxy.this, opObjRefExpressionPart);
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
                    rmOpObjRefExpressionPart(JavaPackageMapperProxy.this, get(index));
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                      rmOpObjRefExpressionPart(JavaPackageMapperProxy.this, opObjRefExpressionPart);
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                          .this,
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
                        JavaPackageMapperProxy.this, opValuePointerControlPointer);
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
                          JavaPackageMapperProxy.this, opValuePointerControlPointer);
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
                    rmOpValuePointerControlPointer(JavaPackageMapperProxy.this, get(index));
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                          JavaPackageMapperProxy.this, opValuePointerControlPointer);
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                          .this,
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
                        JavaPackageMapperProxy.this, opDisplayOptionPointerSelection);
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
                          JavaPackageMapperProxy.this, opDisplayOptionPointerSelection);
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
                    rmOpDisplayOptionPointerSelection(JavaPackageMapperProxy.this, get(index));
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                          JavaPackageMapperProxy.this, opDisplayOptionPointerSelection);
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                          .this,
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
                        JavaPackageMapperProxy.this, opValueOptionPointerSelection);
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
                          JavaPackageMapperProxy.this, opValueOptionPointerSelection);
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
                    rmOpValueOptionPointerSelection(JavaPackageMapperProxy.this, get(index));
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                          JavaPackageMapperProxy.this, opValueOptionPointerSelection);
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                      org.tura.model.designer.repository.serialized.mapper.JavaPackageMapperProxy
                          .this,
                      org.tura.model.designer.repository.serialized.metabase.MetaObject.class);
                } catch (RepositoryException e) {
                  throw new RuntimeException(e);
                }
              }
              String session = UUID.randomUUID().toString();
              try {
                ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
                AddObjectOperation command =
                    addOpRefObjOrderBy(JavaPackageMapperProxy.this, opRefObjOrderBy);
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
                      rmOpRefObjOrderBy(JavaPackageMapperProxy.this, opRefObjOrderBy);
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
                    rmOpRefObjOrderBy(JavaPackageMapperProxy.this, get(index));
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
                      rmOpRefObjOrderBy(JavaPackageMapperProxy.this, opRefObjOrderBy);
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
              return JavaPackageMapperProxy.this.getCpaPath();
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
