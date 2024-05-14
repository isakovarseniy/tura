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

package org.tura.model.designer.repository.serialized.type.mapper;

import org.tura.platform.repository.cpa.CpaMapperHelper;
import org.tura.platform.repository.cpa.storage.CpaMapper;
import org.tura.platform.repository.core.CopyFrom;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.core.AdapterLoaderAware;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.serialized.type.Relationship;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.model.designer.repository.serialized.type.TypeGroup;
import org.tura.model.designer.repository.serialized.type.TypeElement;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class RelationshipProxyMapper extends CpaMapperHelper
    implements CpaMapper, CopyFrom, PersistanceMapper, AdapterLoaderAware {

  private static final long serialVersionUID = 1L;

  private AdapterLoader loader;

  private ProxyFactory proxyFactory;

  public RelationshipProxyMapper() {}

  public RelationshipProxyMapper(org.tura.platform.repository.core.Registry registry) {
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
    Relationship obj = (Relationship) repositoryObject;
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
    Relationship obj = (Relationship) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.type.Relationship");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public RepoObjectKey getCpaPrimaryKey(
      org.tura.model.designer.repository.serialized.type.Relationship spa)
      throws RepositoryException {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.type.Relationship");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), spa.getCpaid());
    key.addValue(value);
    return key;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    Relationship obj = (Relationship) object;
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
    Relationship spa = (Relationship) persistenceObject;
    String pk = spa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {}

  public String getCpaId(Object persistenceObject) {
    Relationship spa = (Relationship) persistenceObject;
    return spa.getCpaid();
  }

  public Boolean getAttached(Object persistenceObject) {
    Relationship spa = (Relationship) persistenceObject;
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
    Relationship obj = (Relationship) repositoryObject;
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
    Relationship spa = (Relationship) persistenceObject;
    RepoKeyPath mypath = topCpaPath.clone();
    mypath.addRepoObjectKey(relation, getCpaPrimaryKey(spa));
    keyMap.put(spa.getCpaid(), mypath);
    register.add(spa.getCpaid());
  }

  public void collectCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    Relationship spa = (Relationship) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    keyMap.put(pk, spa.getCpaid());
  }

  public void replaceCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    Relationship spa = (Relationship) persistenceObject;
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
    Relationship jpa = (Relationship) persistenceObject;
    Relationship obj = (Relationship) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
    obj.setSuidCategorized(jpa.getSuidCategorized());
  }

  public Object copyFromPersistence2Repository(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    Relationship spa = (Relationship) persistenceObject;
    Relationship obj = (Relationship) repositoryObject;
    if (spa != null) {
      StringBuffer key = new StringBuffer();
      key.append(spa.getUid());
      key.append("org.tura.model.designer.repository.serialized.type.Relationship");
      obj.setAttached(true);
      obj.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.type.Relationship.class.getName());
      obj.setUid(spa.getUid());
      obj.setKeyId(spa.getKeyId());
      obj.setSuidCategorized(spa.getSuidCategorized());
      obj.setTransientrefRelationshipsTypeGroup(spa.getTransientrefRelationshipsTypeGroup());
      obj.setTransientrefOpSourceRelationshipTypeElement(
          spa.getTransientrefOpSourceRelationshipTypeElement());
      obj.setTransientrefOpTargetRelationshipTypeElement(
          spa.getTransientrefOpTargetRelationshipTypeElement());
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
    Relationship obj = (Relationship) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (Relationship) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      Relationship spa = (Relationship) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.type.Relationship.class.getName());
      spa.setUid(obj.getUid());
      spa.setKeyId(obj.getKeyId());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setTransientrefRelationshipsTypeGroup(obj.getTransientrefRelationshipsTypeGroup());
      spa.setTransientrefOpSourceRelationshipTypeElement(
          obj.getTransientrefOpSourceRelationshipTypeElement());
      spa.setTransientrefOpTargetRelationshipTypeElement(
          obj.getTransientrefOpTargetRelationshipTypeElement());
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
    Relationship obj = (Relationship) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (Relationship) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      Relationship spa = (Relationship) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.type.Relationship.class.getName());
      spa.setUid(obj.getUid());
      spa.setKeyId(obj.getKeyId());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setTransientrefRelationshipsTypeGroup(obj.getTransientrefRelationshipsTypeGroup());
      spa.setTransientrefOpSourceRelationshipTypeElement(
          obj.getTransientrefOpSourceRelationshipTypeElement());
      spa.setTransientrefOpTargetRelationshipTypeElement(
          obj.getTransientrefOpTargetRelationshipTypeElement());
      TypeGroup objOpRelationshipsTypeGroup = obj.getOpRelationshipsTypeGroup();
      if (objOpRelationshipsTypeGroup != null) {
        CopyFrom mapperOpRelationshipsTypeGroup =
            findCopyFromByRepoObject(objOpRelationshipsTypeGroup);
        Object pkOpRelationshipsTypeGroup =
            mapperOpRelationshipsTypeGroup.getPrimaryKeyFromRepositoryObject(
                objOpRelationshipsTypeGroup);
        if (get(context, pkOpRelationshipsTypeGroup, objOpRelationshipsTypeGroup) == null) {
          put(context, pkOpRelationshipsTypeGroup, objOpRelationshipsTypeGroup);
          TypeGroup spaOpRelationshipsTypeGroup =
              (TypeGroup)
                  mapperOpRelationshipsTypeGroup.deepCopyFromRepository2Persistence(
                      objOpRelationshipsTypeGroup, context);
          spa.setOpRelationshipsTypeGroup(spaOpRelationshipsTypeGroup);
          spaOpRelationshipsTypeGroup.getRelationships().add(spa);
        }
      }
      TypeElement objSource = obj.getSource();
      if (objSource != null) {
        CopyFrom mapperSource = findCopyFromByRepoObject(objSource);
        Object pkSource = mapperSource.getPrimaryKeyFromRepositoryObject(objSource);
        if (get(context, pkSource, objSource) == null) {
          put(context, pkSource, objSource);
          TypeElement spaSource =
              (TypeElement) mapperSource.deepCopyFromRepository2Persistence(objSource, context);
          spa.setSource(spaSource);
          spaSource.getOpSourceRelationship().add(spa);
        }
      }
      TypeElement objTarget = obj.getTarget();
      if (objTarget != null) {
        CopyFrom mapperTarget = findCopyFromByRepoObject(objTarget);
        Object pkTarget = mapperTarget.getPrimaryKeyFromRepositoryObject(objTarget);
        if (get(context, pkTarget, objTarget) == null) {
          put(context, pkTarget, objTarget);
          TypeElement spaTarget =
              (TypeElement) mapperTarget.deepCopyFromRepository2Persistence(objTarget, context);
          spa.setTarget(spaTarget);
          spaTarget.getOpTargetRelationship().add(spa);
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
