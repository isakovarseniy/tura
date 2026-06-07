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

package org.tura.model.designer.repository.serialized.dictionary;

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
import org.tura.model.designer.repository.serialized.dictionary.mapper.OptionsSetProxyMapper;
import org.tura.platform.repository.cpa.EClass;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.operation.UpdateObjectOperation;
import java.util.List;
import org.tura.platform.repository.core.RegistryProvider;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class OptionsSetProxy extends OptionsSet
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

  public OptionsSetProxy(
      org.tura.model.designer.repository.serialized.dictionary.OptionsSet object,
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

  public OptionsSetProxy(OptionsSetProxy proxy) {
    this.repository = proxy.repository;
    this.setCpaid(proxy.getCpaid());
    this.storageProvider = proxy.storageProvider;
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
  public void clean(String name) throws IOException {}

  public void setViewModelId1(Integer viewModelId1) {
    this.viewModelId1 = viewModelId1;
  }

  public Integer getViewModelId1() {
    return viewModelId1;
  }

  public OptionsSetProxy inMemory() {
    OptionsSetProxy inMProxy = new OptionsSetProxy(this);
    inMProxy.inMemory = true;
    return inMProxy;
  }

  public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
    listeners.add(listener);
  }

  public Class<?> getProxyClazz() {
    return org.tura.model.designer.repository.serialized.dictionary.OptionsSet.class;
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

  public OptionsSet clone() {
    try {
      return (OptionsSet)
          new OptionsSetProxyMapper(repository.getRegistry()).copyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public OptionsSet deepClone() {
    try {
      return (OptionsSet)
          new OptionsSetProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public OptionsSet deepClone(java.util.Map<Object, Object> context) {
    try {
      return (OptionsSet)
          new OptionsSetProxyMapper(repository.getRegistry())
              .deepCopyFromRepository2Persistence(this, context);
    } catch (RepositoryException e) {
      throw new RuntimeException(e);
    }
  }

  public void add2Boundaries(java.util.Map<Object, Object> context) {
    OptionsSetProxyMapper mapper = new OptionsSetProxyMapper(repository.getRegistry());
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
    return new EClass("OptionsSet");
  }

  public Object eContainer() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof OptionsSetProxy) {
      return this.getKey().equals(((OptionsSetProxy) o).getKey());
    } else {
      if (o instanceof OptionsSet) {
        OptionsSet obj = (OptionsSet) o;
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

  private OptionsSet getObject() {
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
      org.tura.model.designer.repository.serialized.dictionary.OptionsSet object) {
    StringBuffer key = new StringBuffer();
    key.append(object.getUid());
    key.append("org.tura.model.designer.repository.serialized.dictionary.OptionsSet");
    return key.toString();
  }

  public RepoObjectKey getPrimaryKey() throws Exception {
    return new OptionsSetProxyMapper(repository.getRegistry()).getRepoObjectKey(this.getObject());
  }

  public RepoObjectKey getCpaPrimaryKey() throws Exception {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.dictionary.OptionsSet");
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
    return new OptionsSetProxyMapper(repository.getRegistry()).getPath(this.getObject());
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
    str = str + " keyName = " + getObject().getKeyName();
    str = str + " strValue = " + getObject().getStrValue();
    str = str + " optionset = " + getObject().getOptionset();
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
  public String getKeyName() {
    return this.getObject().getKeyName();
  }

  @Override
  public void setKeyName(java.lang.String keyName) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "KeyName",
              this.getObject().getKeyName(),
              keyName,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "keyName");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getStrValue() {
    return this.getObject().getStrValue();
  }

  @Override
  public void setStrValue(java.lang.String strValue) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "StrValue",
              this.getObject().getStrValue(),
              strValue,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "strValue");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
  }

  @Override
  public String getOptionset() {
    return this.getObject().getOptionset();
  }

  @Override
  public void setOptionset(java.lang.String optionset) {
    String session = UUID.randomUUID().toString();
    try {
      ProxyCommadStackProvider localStackProvider = getLocalStackProvider(session);
      UpdateObjectOperation command =
          upd(
              this,
              localStackProvider,
              "Optionset",
              this.getObject().getOptionset(),
              optionset,
              java.lang.String.class);
      if (command.prepare()) {
        List<Object> changes = localStackProvider.get().getListOfCommand();
        localStackProvider.get().commit();
        if (this.getObject().getAttached() != null && this.getObject().getAttached()) {
          repository.getStackProvider().get().addCommands(changes);
        }
        notifyListner(this, "optionset");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      removeLocalStackProvider(session);
    }
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
