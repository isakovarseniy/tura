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

package org.tura.model.designer.repository.serialized.form.mapper;

import org.tura.platform.repository.cpa.CpaMapperHelper;
import org.tura.platform.repository.cpa.storage.CpaMapper;
import org.tura.platform.repository.core.CopyFrom;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.core.AdapterLoaderAware;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.serialized.form.Uielement;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.model.designer.repository.serialized.form.Context;
import org.tura.model.designer.repository.serialized.form.AreaRef;
import java.util.Collection;
import org.tura.model.designer.repository.serialized.form.ChildrenHolder;
import org.tura.model.designer.repository.serialized.form.Column;
import org.tura.model.designer.repository.serialized.form.FlexField;
import org.tura.model.designer.repository.serialized.form.MenuFolder;
import java.util.List;
import java.util.ArrayList;

public class UielementProxyMapper extends CpaMapperHelper
    implements CpaMapper, CopyFrom, PersistanceMapper, AdapterLoaderAware {

  private static final long serialVersionUID = 1L;

  private AdapterLoader loader;

  private ProxyFactory proxyFactory;

  public UielementProxyMapper() {}

  public UielementProxyMapper(org.tura.platform.repository.core.Registry registry) {
    this.setRegistry(registry);
  }

  public ProxyFactory getProxyFactory() {
    return proxyFactory;
  }

  public void setProxyFactory(org.tura.platform.repository.core.ProxyFactory proxyFactory) {
    this.proxyFactory = proxyFactory;
  }

  public void setAdapterLoader(org.tura.platform.repository.core.AdapterLoader loader) {
    this.loader = loader;
  }

  public AdapterLoader getAdapterLoader() {
    return this.loader;
  }

  public Object getPKey(org.tura.platform.repository.core.RepoObjectKey objKey)
      throws RepositoryException {
    try {
      String pk = (String) find("Uid", objKey.getKey());
      return pk;
    } catch (Exception e) {
      throw new RepositoryException(e);
    }
  }

  public void flattenObject(Object repositoryObject, List<Object> loadedObjects)
      throws RepositoryException {
    Uielement obj = (Uielement) repositoryObject;
    if (loadedObjects.contains(obj)) {
      return;
    }
    loadedObjects.add(obj);
    for (Classifier t : obj.getClassifiers()) {
      CpaMapper mapperClassifiers = findCpaMapperByRepoObject(t);
      mapperClassifiers.flattenObject(t, loadedObjects);
    }
  }

  public Object unwrap(Object persistenceObject) {
    return persistenceObject;
  }

  public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
    Uielement obj = (Uielement) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.Uielement");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public RepoObjectKey getCpaPrimaryKey(
      org.tura.model.designer.repository.serialized.form.Uielement spa) throws RepositoryException {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.Uielement");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), spa.getCpaid());
    key.addValue(value);
    return key;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    Uielement obj = (Uielement) object;
    RepoKeyPath path = new RepoKeyPath();
    path.addRepoObjectKey(null, getRepoObjectKey(obj));
    return path;
  }

  private Object find(String field, java.util.List<FieldValue> list) throws Exception {
    for (FieldValue f : list) {
      if (f.getName().equals(field)) {
        Class<?> clazz = Class.forName(f.getType());
        try {
          Constructor<?> c = clazz.getConstructor(String.class);
          return c.newInstance(f.getValue());
        } catch (NoSuchMethodException e) {
          return org.tura.platform.datacontrol.commons.Parser.parse(f.getValue(), clazz);
        }
      }
    }
    throw new RepositoryException("Could not find a field " + field);
  }

  public Object getPrimaryKey(Object persistenceObject) {
    Uielement spa = (Uielement) persistenceObject;
    String pk = spa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {}

  public String getCpaId(Object persistenceObject) {
    Uielement spa = (Uielement) persistenceObject;
    return spa.getCpaid();
  }

  public Boolean getAttached(Object persistenceObject) {
    Uielement spa = (Uielement) persistenceObject;
    return spa.getAttached();
  }

  @Override
  public void differentiator(
      Object persistenceObject, Object repositoryObject, Map<Object, Object> context)
      throws RepositoryException {}

  @Override
  public boolean isComplex() {
    return false;
  }

  public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) {
    Uielement obj = (Uielement) repositoryObject;
    String pk = obj.getUid();
    return pk;
  }

  public void buildRepPathTree(
      org.tura.platform.repository.core.RepoKeyPath topCpaPath,
      Object persistenceObject,
      java.util.Map<String, RepoKeyPath> keyMap,
      String relation,
      List<String> register)
      throws RepositoryException {
    Uielement spa = (Uielement) persistenceObject;
    RepoKeyPath mypath = topCpaPath.clone();
    mypath.addRepoObjectKey(relation, getCpaPrimaryKey(spa));
    keyMap.put(spa.getCpaid(), mypath);
    register.add(spa.getCpaid());
  }

  public void collectCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    Uielement spa = (Uielement) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    keyMap.put(pk, spa.getCpaid());
  }

  public void replaceCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    Uielement spa = (Uielement) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    String cpaId = keyMap.get(pk);
    if (cpaId != null) {
      spa.setCpaid(cpaId);
    }
  }

  public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject)
      throws RepositoryException {
    Map<Object, Object> context = new HashMap<Object, Object>();
    put(context, this.getPrimaryKey(persistenceObject), persistenceObject);
    return copyFromPersistence2Repository(persistenceObject, repositoryObject, context);
  }

  public void copyPKFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
    Uielement jpa = (Uielement) persistenceObject;
    Uielement obj = (Uielement) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
    obj.setSuidStyleElement(jpa.getSuidStyleElement());
    obj.setSuidNickNamed(jpa.getSuidNickNamed());
    obj.setSuidCategorized(jpa.getSuidCategorized());
    obj.setSuidOrderable(jpa.getSuidOrderable());
    obj.setSuidEnabledUIItem(jpa.getSuidEnabledUIItem());
    obj.setSuidFlexFields(jpa.getSuidFlexFields());
    obj.setSuidMenuHolder(jpa.getSuidMenuHolder());
  }

  public Object copyFromPersistence2Repository(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    Uielement spa = (Uielement) persistenceObject;
    Uielement obj = (Uielement) repositoryObject;
    if (spa != null) {
      StringBuffer key = new StringBuffer();
      key.append(spa.getUid());
      key.append("org.tura.model.designer.repository.serialized.form.Uielement");
      obj.setAttached(true);
      obj.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.Uielement.class.getName());
      obj.setUid(spa.getUid());
      obj.setSuidStyleElement(spa.getSuidStyleElement());
      obj.setNickname(spa.getNickname());
      obj.setSuidNickNamed(spa.getSuidNickNamed());
      obj.setSuidCategorized(spa.getSuidCategorized());
      obj.setOrder(spa.getOrder());
      obj.setSuidOrderable(spa.getSuidOrderable());
      obj.setSuidEnabledUIItem(spa.getSuidEnabledUIItem());
      obj.setSuidFlexFields(spa.getSuidFlexFields());
      obj.setSuidMenuHolder(spa.getSuidMenuHolder());
      obj.setTransientrefChildrenChildrenHolder(spa.getTransientrefChildrenChildrenHolder());
      obj.setTransientrefElementColumn(spa.getTransientrefElementColumn());
      obj.setTransientrefOpMenuMenuHolderMenuFolder(
          spa.getTransientrefOpMenuMenuHolderMenuFolder());
      return obj;
    } else {
      return null;
    }
  }

  public Object copyFromRepository2Persistence(Object repositoryObject) throws RepositoryException {
    Map<Object, Object> context = new HashMap<Object, Object>();
    put(context, this.getPrimaryKeyFromRepositoryObject(repositoryObject), repositoryObject);
    return copyFromRepository2Persistence(repositoryObject, context);
  }

  public Object copyFromRepository2Persistence(
      Object repositoryObject, java.util.Map<Object, Object> context) throws RepositoryException {
    Uielement obj = (Uielement) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (Uielement) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      Uielement spa = (Uielement) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.Uielement.class.getName());
      spa.setUid(obj.getUid());
      spa.setSuidStyleElement(obj.getSuidStyleElement());
      spa.setNickname(obj.getNickname());
      spa.setSuidNickNamed(obj.getSuidNickNamed());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setOrder(obj.getOrder());
      spa.setSuidOrderable(obj.getSuidOrderable());
      spa.setSuidEnabledUIItem(obj.getSuidEnabledUIItem());
      spa.setSuidFlexFields(obj.getSuidFlexFields());
      spa.setSuidMenuHolder(obj.getSuidMenuHolder());
      spa.setTransientrefChildrenChildrenHolder(obj.getTransientrefChildrenChildrenHolder());
      spa.setTransientrefElementColumn(obj.getTransientrefElementColumn());
      spa.setTransientrefOpMenuMenuHolderMenuFolder(
          obj.getTransientrefOpMenuMenuHolderMenuFolder());
      return spa;
    } else {
      return null;
    }
  }

  public Object deepCopyFromRepository2Persistence(Object repositoryObject)
      throws RepositoryException {
    Map<Object, Object> context = new HashMap<Object, Object>();
    put(context, this.getPrimaryKeyFromRepositoryObject(repositoryObject), repositoryObject);
    return deepCopyFromRepository2Persistence(repositoryObject, context);
  }

  public Object deepCopyFromRepository2Persistence(
      Object repositoryObject, java.util.Map<Object, Object> context) throws RepositoryException {
    Uielement obj = (Uielement) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (Uielement) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      Uielement spa = (Uielement) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.Uielement.class.getName());
      spa.setUid(obj.getUid());
      spa.setSuidStyleElement(obj.getSuidStyleElement());
      spa.setNickname(obj.getNickname());
      spa.setSuidNickNamed(obj.getSuidNickNamed());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setOrder(obj.getOrder());
      spa.setSuidOrderable(obj.getSuidOrderable());
      spa.setSuidEnabledUIItem(obj.getSuidEnabledUIItem());
      spa.setSuidFlexFields(obj.getSuidFlexFields());
      spa.setSuidMenuHolder(obj.getSuidMenuHolder());
      spa.setTransientrefChildrenChildrenHolder(obj.getTransientrefChildrenChildrenHolder());
      spa.setTransientrefElementColumn(obj.getTransientrefElementColumn());
      spa.setTransientrefOpMenuMenuHolderMenuFolder(
          obj.getTransientrefOpMenuMenuHolderMenuFolder());
      Context objRequired = obj.getRequired();
      if (objRequired != null) {
        CopyFrom mapperRequired = findCopyFromByRepoObject(objRequired);
        Object pkRequired = mapperRequired.getPrimaryKeyFromRepositoryObject(objRequired);
        if (get(context, pkRequired, objRequired) == null) {
          put(context, pkRequired, objRequired);
          Context spaRequired =
              (Context) mapperRequired.deepCopyFromRepository2Persistence(objRequired, context);
          spa.setRequired(spaRequired);
          spaRequired.setOpRequiredUielement(spa);
        }
      }
      Context objReadOnly = obj.getReadOnly();
      if (objReadOnly != null) {
        CopyFrom mapperReadOnly = findCopyFromByRepoObject(objReadOnly);
        Object pkReadOnly = mapperReadOnly.getPrimaryKeyFromRepositoryObject(objReadOnly);
        if (get(context, pkReadOnly, objReadOnly) == null) {
          put(context, pkReadOnly, objReadOnly);
          Context spaReadOnly =
              (Context) mapperReadOnly.deepCopyFromRepository2Persistence(objReadOnly, context);
          spa.setReadOnly(spaReadOnly);
          spaReadOnly.setOpReadOnlyUielement(spa);
        }
      }
      Collection<AreaRef> objRefreshAreasList = obj.getRefreshAreas();
      if (objRefreshAreasList != null) {
        for (AreaRef objRefreshAreas : objRefreshAreasList) {
          CopyFrom mapperRefreshAreas = findCopyFromByRepoObject(objRefreshAreas);
          Object pkRefreshAreas =
              mapperRefreshAreas.getPrimaryKeyFromRepositoryObject(objRefreshAreas);
          if (get(context, pkRefreshAreas, objRefreshAreas) == null) {
            put(context, pkRefreshAreas, objRefreshAreas);
            AreaRef spaRefreshAreas =
                (AreaRef)
                    mapperRefreshAreas.deepCopyFromRepository2Persistence(objRefreshAreas, context);
            spa.getRefreshAreas().add(spaRefreshAreas);
            spaRefreshAreas.setOpRefreshAreasUielement(spa);
          }
        }
      }
      ChildrenHolder objOpChildrenChildrenHolder = obj.getOpChildrenChildrenHolder();
      if (objOpChildrenChildrenHolder != null) {
        CopyFrom mapperOpChildrenChildrenHolder =
            findCopyFromByRepoObject(objOpChildrenChildrenHolder);
        Object pkOpChildrenChildrenHolder =
            mapperOpChildrenChildrenHolder.getPrimaryKeyFromRepositoryObject(
                objOpChildrenChildrenHolder);
        if (get(context, pkOpChildrenChildrenHolder, objOpChildrenChildrenHolder) == null) {
          put(context, pkOpChildrenChildrenHolder, objOpChildrenChildrenHolder);
          ChildrenHolder spaOpChildrenChildrenHolder =
              (ChildrenHolder)
                  mapperOpChildrenChildrenHolder.deepCopyFromRepository2Persistence(
                      objOpChildrenChildrenHolder, context);
          spa.setOpChildrenChildrenHolder(spaOpChildrenChildrenHolder);
          spaOpChildrenChildrenHolder.getChildren().add(spa);
        }
      }
      Column objOpElementColumn = obj.getOpElementColumn();
      if (objOpElementColumn != null) {
        CopyFrom mapperOpElementColumn = findCopyFromByRepoObject(objOpElementColumn);
        Object pkOpElementColumn =
            mapperOpElementColumn.getPrimaryKeyFromRepositoryObject(objOpElementColumn);
        if (get(context, pkOpElementColumn, objOpElementColumn) == null) {
          put(context, pkOpElementColumn, objOpElementColumn);
          Column spaOpElementColumn =
              (Column)
                  mapperOpElementColumn.deepCopyFromRepository2Persistence(
                      objOpElementColumn, context);
          spa.setOpElementColumn(spaOpElementColumn);
          spaOpElementColumn.setElement(spa);
        }
      }
      Context objStyle = obj.getStyle();
      if (objStyle != null) {
        CopyFrom mapperStyle = findCopyFromByRepoObject(objStyle);
        Object pkStyle = mapperStyle.getPrimaryKeyFromRepositoryObject(objStyle);
        if (get(context, pkStyle, objStyle) == null) {
          put(context, pkStyle, objStyle);
          Context spaStyle =
              (Context) mapperStyle.deepCopyFromRepository2Persistence(objStyle, context);
          spa.setStyle(spaStyle);
          spaStyle.setOpStyleStyleElement(spa);
        }
      }
      Collection<AreaRef> objOpAreaAreaRefList = obj.getOpAreaAreaRef();
      if (objOpAreaAreaRefList != null) {
        for (AreaRef objOpAreaAreaRef : objOpAreaAreaRefList) {
          CopyFrom mapperOpAreaAreaRef = findCopyFromByRepoObject(objOpAreaAreaRef);
          Object pkOpAreaAreaRef =
              mapperOpAreaAreaRef.getPrimaryKeyFromRepositoryObject(objOpAreaAreaRef);
          if (get(context, pkOpAreaAreaRef, objOpAreaAreaRef) == null) {
            put(context, pkOpAreaAreaRef, objOpAreaAreaRef);
            AreaRef spaOpAreaAreaRef =
                (AreaRef)
                    mapperOpAreaAreaRef.deepCopyFromRepository2Persistence(
                        objOpAreaAreaRef, context);
            spa.getOpAreaAreaRef().add(spaOpAreaAreaRef);
            spaOpAreaAreaRef.setArea(spa);
          }
        }
      }
      Collection<Classifier> objClassifiersList = obj.getClassifiers();
      if (objClassifiersList != null) {
        for (Classifier objClassifiers : objClassifiersList) {
          CopyFrom mapperClassifiers = findCopyFromByRepoObject(objClassifiers);
          Object pkClassifiers =
              mapperClassifiers.getPrimaryKeyFromRepositoryObject(objClassifiers);
          if (get(context, pkClassifiers, objClassifiers) == null) {
            put(context, pkClassifiers, objClassifiers);
            Classifier spaClassifiers =
                (Classifier)
                    mapperClassifiers.deepCopyFromRepository2Persistence(objClassifiers, context);
            spa.getClassifiers().add(spaClassifiers);
            spaClassifiers.setOpClassifiersCategorized(spa);
          }
        }
      }
      Context objEnabled = obj.getEnabled();
      if (objEnabled != null) {
        CopyFrom mapperEnabled = findCopyFromByRepoObject(objEnabled);
        Object pkEnabled = mapperEnabled.getPrimaryKeyFromRepositoryObject(objEnabled);
        if (get(context, pkEnabled, objEnabled) == null) {
          put(context, pkEnabled, objEnabled);
          Context spaEnabled =
              (Context) mapperEnabled.deepCopyFromRepository2Persistence(objEnabled, context);
          spa.setEnabled(spaEnabled);
          spaEnabled.setOpEnabledEnabledUIItem(spa);
        }
      }
      Collection<FlexField> objFieldsList = obj.getFields();
      if (objFieldsList != null) {
        for (FlexField objFields : objFieldsList) {
          CopyFrom mapperFields = findCopyFromByRepoObject(objFields);
          Object pkFields = mapperFields.getPrimaryKeyFromRepositoryObject(objFields);
          if (get(context, pkFields, objFields) == null) {
            put(context, pkFields, objFields);
            FlexField spaFields =
                (FlexField) mapperFields.deepCopyFromRepository2Persistence(objFields, context);
            spa.getFields().add(spaFields);
            spaFields.setOpFieldsFlexFields(spa);
          }
        }
      }
      MenuFolder objMenu = obj.getMenu();
      if (objMenu != null) {
        CopyFrom mapperMenu = findCopyFromByRepoObject(objMenu);
        Object pkMenu = mapperMenu.getPrimaryKeyFromRepositoryObject(objMenu);
        if (get(context, pkMenu, objMenu) == null) {
          put(context, pkMenu, objMenu);
          MenuFolder spaMenu =
              (MenuFolder) mapperMenu.deepCopyFromRepository2Persistence(objMenu, context);
          spa.setMenu(spaMenu);
          spaMenu.getOpMenuMenuHolder().add(spa);
        }
      }
      return spa;
    } else {
      return null;
    }
  }

  @SuppressWarnings("unchecked")
  public void put(java.util.Map<Object, Object> context, Object pk, Object type) {
    String key = type.getClass().getName();
    List<Object> loadedObjects = (List<Object>) context.get(key);
    if (loadedObjects == null) {
      loadedObjects = new ArrayList<Object>();
      context.put(key, loadedObjects);
    }
    if (loadedObjects.contains(pk)) {
      return;
    } else {
      loadedObjects.add(pk);
      return;
    }
  }

  @SuppressWarnings("unchecked")
  public Object get(java.util.Map<Object, Object> context, Object pk, Object type) {
    String key = type.getClass().getName();
    List<Object> loadedObjects = (List<Object>) context.get(key);
    if (loadedObjects == null) {
      return null;
    } else {
      if (loadedObjects.contains(pk)) {
        return pk;
      } else {
        return null;
      }
    }
  }
}
