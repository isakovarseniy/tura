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

package org.tura.model.designer.repository.serialized.form.mapper;

import org.tura.platform.repository.cpa.CpaMapperHelper;
import org.tura.platform.repository.cpa.storage.CpaMapper;
import org.tura.platform.repository.core.CopyFrom;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.core.AdapterLoaderAware;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.serialized.form.MenuElement;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.model.designer.repository.serialized.form.MenuFolder;
import org.tura.model.designer.repository.serialized.form.Context;
import java.util.Collection;
import org.tura.model.designer.repository.serialized.form.FlexField;
import java.util.List;
import java.util.ArrayList;

public class MenuElementProxyMapper extends CpaMapperHelper
    implements CpaMapper, CopyFrom, PersistanceMapper, AdapterLoaderAware {

  private static final long serialVersionUID = 1L;

  private AdapterLoader loader;

  private ProxyFactory proxyFactory;

  public MenuElementProxyMapper() {}

  public MenuElementProxyMapper(org.tura.platform.repository.core.Registry registry) {
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
    MenuElement obj = (MenuElement) repositoryObject;
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
    MenuElement obj = (MenuElement) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.MenuElement");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public RepoObjectKey getCpaPrimaryKey(
      org.tura.model.designer.repository.serialized.form.MenuElement spa)
      throws RepositoryException {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.MenuElement");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), spa.getCpaid());
    key.addValue(value);
    return key;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    MenuElement obj = (MenuElement) object;
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
    MenuElement spa = (MenuElement) persistenceObject;
    String pk = spa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {}

  public String getCpaId(Object persistenceObject) {
    MenuElement spa = (MenuElement) persistenceObject;
    return spa.getCpaid();
  }

  public Boolean getAttached(Object persistenceObject) {
    MenuElement spa = (MenuElement) persistenceObject;
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
    MenuElement obj = (MenuElement) repositoryObject;
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
    MenuElement spa = (MenuElement) persistenceObject;
    RepoKeyPath mypath = topCpaPath.clone();
    mypath.addRepoObjectKey(relation, getCpaPrimaryKey(spa));
    keyMap.put(spa.getCpaid(), mypath);
    register.add(spa.getCpaid());
  }

  public void collectCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    MenuElement spa = (MenuElement) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    keyMap.put(pk, spa.getCpaid());
  }

  public void replaceCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    MenuElement spa = (MenuElement) persistenceObject;
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
    MenuElement jpa = (MenuElement) persistenceObject;
    MenuElement obj = (MenuElement) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
    obj.setSuidMultiLangLabel(jpa.getSuidMultiLangLabel());
    obj.setSuidStyleElement(jpa.getSuidStyleElement());
    obj.setSuidCategorized(jpa.getSuidCategorized());
    obj.setSuidEnabledUIItem(jpa.getSuidEnabledUIItem());
    obj.setSuidOrderable(jpa.getSuidOrderable());
    obj.setSuidFlexFields(jpa.getSuidFlexFields());
  }

  public Object copyFromPersistence2Repository(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    MenuElement spa = (MenuElement) persistenceObject;
    MenuElement obj = (MenuElement) repositoryObject;
    if (spa != null) {
      StringBuffer key = new StringBuffer();
      key.append(spa.getUid());
      key.append("org.tura.model.designer.repository.serialized.form.MenuElement");
      obj.setAttached(true);
      obj.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.MenuElement.class.getName());
      obj.setUid(spa.getUid());
      obj.setName(spa.getName());
      obj.setSuidMultiLangLabel(spa.getSuidMultiLangLabel());
      obj.setSuidStyleElement(spa.getSuidStyleElement());
      obj.setSuidCategorized(spa.getSuidCategorized());
      obj.setSuidEnabledUIItem(spa.getSuidEnabledUIItem());
      obj.setOrder(spa.getOrder());
      obj.setSuidOrderable(spa.getSuidOrderable());
      obj.setSuidFlexFields(spa.getSuidFlexFields());
      obj.setTransientrefMenuElementsMenuFolder(spa.getTransientrefMenuElementsMenuFolder());
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
    MenuElement obj = (MenuElement) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (MenuElement) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      MenuElement spa = (MenuElement) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.MenuElement.class.getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setSuidMultiLangLabel(obj.getSuidMultiLangLabel());
      spa.setSuidStyleElement(obj.getSuidStyleElement());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setSuidEnabledUIItem(obj.getSuidEnabledUIItem());
      spa.setOrder(obj.getOrder());
      spa.setSuidOrderable(obj.getSuidOrderable());
      spa.setSuidFlexFields(obj.getSuidFlexFields());
      spa.setTransientrefMenuElementsMenuFolder(obj.getTransientrefMenuElementsMenuFolder());
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
    MenuElement obj = (MenuElement) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (MenuElement) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      MenuElement spa = (MenuElement) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.MenuElement.class.getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setSuidMultiLangLabel(obj.getSuidMultiLangLabel());
      spa.setSuidStyleElement(obj.getSuidStyleElement());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setSuidEnabledUIItem(obj.getSuidEnabledUIItem());
      spa.setOrder(obj.getOrder());
      spa.setSuidOrderable(obj.getSuidOrderable());
      spa.setSuidFlexFields(obj.getSuidFlexFields());
      spa.setTransientrefMenuElementsMenuFolder(obj.getTransientrefMenuElementsMenuFolder());
      MenuFolder objOpMenuElementsMenuFolder = obj.getOpMenuElementsMenuFolder();
      if (objOpMenuElementsMenuFolder != null) {
        CopyFrom mapperOpMenuElementsMenuFolder =
            findCopyFromByRepoObject(objOpMenuElementsMenuFolder);
        Object pkOpMenuElementsMenuFolder =
            mapperOpMenuElementsMenuFolder.getPrimaryKeyFromRepositoryObject(
                objOpMenuElementsMenuFolder);
        if (get(context, pkOpMenuElementsMenuFolder, objOpMenuElementsMenuFolder) == null) {
          put(context, pkOpMenuElementsMenuFolder, objOpMenuElementsMenuFolder);
          MenuFolder spaOpMenuElementsMenuFolder =
              (MenuFolder)
                  mapperOpMenuElementsMenuFolder.deepCopyFromRepository2Persistence(
                      objOpMenuElementsMenuFolder, context);
          spa.setOpMenuElementsMenuFolder(spaOpMenuElementsMenuFolder);
          spaOpMenuElementsMenuFolder.getMenuElements().add(spa);
        }
      }
      Context objMultiLangLabel = obj.getMultiLangLabel();
      if (objMultiLangLabel != null) {
        CopyFrom mapperMultiLangLabel = findCopyFromByRepoObject(objMultiLangLabel);
        Object pkMultiLangLabel =
            mapperMultiLangLabel.getPrimaryKeyFromRepositoryObject(objMultiLangLabel);
        if (get(context, pkMultiLangLabel, objMultiLangLabel) == null) {
          put(context, pkMultiLangLabel, objMultiLangLabel);
          Context spaMultiLangLabel =
              (Context)
                  mapperMultiLangLabel.deepCopyFromRepository2Persistence(
                      objMultiLangLabel, context);
          spa.setMultiLangLabel(spaMultiLangLabel);
          spaMultiLangLabel.setOpMultiLangLabelMultiLangLabel(spa);
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
