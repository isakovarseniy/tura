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
import org.tura.model.designer.repository.serialized.type.TypeElement;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.model.designer.repository.serialized.type.Relationship;
import java.util.Collection;
import org.tura.model.designer.repository.serialized.type.TypePointer;
import org.tura.model.designer.repository.serialized.objectmapper.OmRelation;
import org.tura.model.designer.repository.serialized.form.RelationMapper;
import org.tura.model.designer.repository.serialized.type.TypeGroup;
import java.util.List;
import java.util.ArrayList;

public class TypeElementProxyMapper extends CpaMapperHelper
    implements CpaMapper, CopyFrom, PersistanceMapper, AdapterLoaderAware {

  private static final long serialVersionUID = 1L;

  private AdapterLoader loader;

  private ProxyFactory proxyFactory;

  public TypeElementProxyMapper() {}

  public TypeElementProxyMapper(org.tura.platform.repository.core.Registry registry) {
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
    TypeElement obj = (TypeElement) repositoryObject;
    if (loadedObjects.contains(obj)) {
      return;
    }
    loadedObjects.add(obj);
  }

  public Object unwrap(Object persistenceObject) {
    return persistenceObject;
  }

  public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
    TypeElement obj = (TypeElement) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.type.TypeElement");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public RepoObjectKey getCpaPrimaryKey(
      org.tura.model.designer.repository.serialized.type.TypeElement spa)
      throws RepositoryException {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.type.TypeElement");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), spa.getCpaid());
    key.addValue(value);
    return key;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    TypeElement obj = (TypeElement) object;
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
    TypeElement spa = (TypeElement) persistenceObject;
    String pk = spa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {}

  public String getCpaId(Object persistenceObject) {
    TypeElement spa = (TypeElement) persistenceObject;
    return spa.getCpaid();
  }

  public Boolean getAttached(Object persistenceObject) {
    TypeElement spa = (TypeElement) persistenceObject;
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
    TypeElement obj = (TypeElement) repositoryObject;
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
    TypeElement spa = (TypeElement) persistenceObject;
    RepoKeyPath mypath = topCpaPath.clone();
    mypath.addRepoObjectKey(relation, getCpaPrimaryKey(spa));
    keyMap.put(spa.getCpaid(), mypath);
    register.add(spa.getCpaid());
  }

  public void collectCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    TypeElement spa = (TypeElement) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    keyMap.put(pk, spa.getCpaid());
  }

  public void replaceCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    TypeElement spa = (TypeElement) persistenceObject;
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
    TypeElement jpa = (TypeElement) persistenceObject;
    TypeElement obj = (TypeElement) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
  }

  public Object copyFromPersistence2Repository(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    TypeElement spa = (TypeElement) persistenceObject;
    TypeElement obj = (TypeElement) repositoryObject;
    if (spa != null) {
      StringBuffer key = new StringBuffer();
      key.append(spa.getUid());
      key.append("org.tura.model.designer.repository.serialized.type.TypeElement");
      obj.setAttached(true);
      obj.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.type.TypeElement.class.getName());
      obj.setUid(spa.getUid());
      obj.setKeyId(spa.getKeyId());
      obj.setName(spa.getName());
      obj.setTransientrefTypesTypeGroup(spa.getTransientrefTypesTypeGroup());
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
    TypeElement obj = (TypeElement) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (TypeElement) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      TypeElement spa = (TypeElement) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.type.TypeElement.class.getName());
      spa.setUid(obj.getUid());
      spa.setKeyId(obj.getKeyId());
      spa.setName(obj.getName());
      spa.setTransientrefTypesTypeGroup(obj.getTransientrefTypesTypeGroup());
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
    TypeElement obj = (TypeElement) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (TypeElement) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      TypeElement spa = (TypeElement) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.type.TypeElement.class.getName());
      spa.setUid(obj.getUid());
      spa.setKeyId(obj.getKeyId());
      spa.setName(obj.getName());
      spa.setTransientrefTypesTypeGroup(obj.getTransientrefTypesTypeGroup());
      Collection<Relationship> objOpSourceRelationshipList = obj.getOpSourceRelationship();
      if (objOpSourceRelationshipList != null) {
        for (Relationship objOpSourceRelationship : objOpSourceRelationshipList) {
          CopyFrom mapperOpSourceRelationship = findCopyFromByRepoObject(objOpSourceRelationship);
          Object pkOpSourceRelationship =
              mapperOpSourceRelationship.getPrimaryKeyFromRepositoryObject(objOpSourceRelationship);
          if (get(context, pkOpSourceRelationship, objOpSourceRelationship) == null) {
            put(context, pkOpSourceRelationship, objOpSourceRelationship);
            Relationship spaOpSourceRelationship =
                (Relationship)
                    mapperOpSourceRelationship.deepCopyFromRepository2Persistence(
                        objOpSourceRelationship, context);
            spa.getOpSourceRelationship().add(spaOpSourceRelationship);
            spaOpSourceRelationship.setSource(spa);
          }
        }
      }
      Collection<Relationship> objOpTargetRelationshipList = obj.getOpTargetRelationship();
      if (objOpTargetRelationshipList != null) {
        for (Relationship objOpTargetRelationship : objOpTargetRelationshipList) {
          CopyFrom mapperOpTargetRelationship = findCopyFromByRepoObject(objOpTargetRelationship);
          Object pkOpTargetRelationship =
              mapperOpTargetRelationship.getPrimaryKeyFromRepositoryObject(objOpTargetRelationship);
          if (get(context, pkOpTargetRelationship, objOpTargetRelationship) == null) {
            put(context, pkOpTargetRelationship, objOpTargetRelationship);
            Relationship spaOpTargetRelationship =
                (Relationship)
                    mapperOpTargetRelationship.deepCopyFromRepository2Persistence(
                        objOpTargetRelationship, context);
            spa.getOpTargetRelationship().add(spaOpTargetRelationship);
            spaOpTargetRelationship.setTarget(spa);
          }
        }
      }
      Collection<TypePointer> objOpTypeRefTypePointerList = obj.getOpTypeRefTypePointer();
      if (objOpTypeRefTypePointerList != null) {
        for (TypePointer objOpTypeRefTypePointer : objOpTypeRefTypePointerList) {
          CopyFrom mapperOpTypeRefTypePointer = findCopyFromByRepoObject(objOpTypeRefTypePointer);
          Object pkOpTypeRefTypePointer =
              mapperOpTypeRefTypePointer.getPrimaryKeyFromRepositoryObject(objOpTypeRefTypePointer);
          if (get(context, pkOpTypeRefTypePointer, objOpTypeRefTypePointer) == null) {
            put(context, pkOpTypeRefTypePointer, objOpTypeRefTypePointer);
            TypePointer spaOpTypeRefTypePointer =
                (TypePointer)
                    mapperOpTypeRefTypePointer.deepCopyFromRepository2Persistence(
                        objOpTypeRefTypePointer, context);
            spa.getOpTypeRefTypePointer().add(spaOpTypeRefTypePointer);
            spaOpTypeRefTypePointer.setTypeRef(spa);
          }
        }
      }
      Collection<OmRelation> objOpTypeRefOmRelationList = obj.getOpTypeRefOmRelation();
      if (objOpTypeRefOmRelationList != null) {
        for (OmRelation objOpTypeRefOmRelation : objOpTypeRefOmRelationList) {
          CopyFrom mapperOpTypeRefOmRelation = findCopyFromByRepoObject(objOpTypeRefOmRelation);
          Object pkOpTypeRefOmRelation =
              mapperOpTypeRefOmRelation.getPrimaryKeyFromRepositoryObject(objOpTypeRefOmRelation);
          if (get(context, pkOpTypeRefOmRelation, objOpTypeRefOmRelation) == null) {
            put(context, pkOpTypeRefOmRelation, objOpTypeRefOmRelation);
            OmRelation spaOpTypeRefOmRelation =
                (OmRelation)
                    mapperOpTypeRefOmRelation.deepCopyFromRepository2Persistence(
                        objOpTypeRefOmRelation, context);
            spa.getOpTypeRefOmRelation().add(spaOpTypeRefOmRelation);
            spaOpTypeRefOmRelation.setTypeRef(spa);
          }
        }
      }
      Collection<RelationMapper> objOpTypeRefRelationMapperList = obj.getOpTypeRefRelationMapper();
      if (objOpTypeRefRelationMapperList != null) {
        for (RelationMapper objOpTypeRefRelationMapper : objOpTypeRefRelationMapperList) {
          CopyFrom mapperOpTypeRefRelationMapper =
              findCopyFromByRepoObject(objOpTypeRefRelationMapper);
          Object pkOpTypeRefRelationMapper =
              mapperOpTypeRefRelationMapper.getPrimaryKeyFromRepositoryObject(
                  objOpTypeRefRelationMapper);
          if (get(context, pkOpTypeRefRelationMapper, objOpTypeRefRelationMapper) == null) {
            put(context, pkOpTypeRefRelationMapper, objOpTypeRefRelationMapper);
            RelationMapper spaOpTypeRefRelationMapper =
                (RelationMapper)
                    mapperOpTypeRefRelationMapper.deepCopyFromRepository2Persistence(
                        objOpTypeRefRelationMapper, context);
            spa.getOpTypeRefRelationMapper().add(spaOpTypeRefRelationMapper);
            spaOpTypeRefRelationMapper.setTypeRef(spa);
          }
        }
      }
      TypeGroup objOpTypesTypeGroup = obj.getOpTypesTypeGroup();
      if (objOpTypesTypeGroup != null) {
        CopyFrom mapperOpTypesTypeGroup = findCopyFromByRepoObject(objOpTypesTypeGroup);
        Object pkOpTypesTypeGroup =
            mapperOpTypesTypeGroup.getPrimaryKeyFromRepositoryObject(objOpTypesTypeGroup);
        if (get(context, pkOpTypesTypeGroup, objOpTypesTypeGroup) == null) {
          put(context, pkOpTypesTypeGroup, objOpTypesTypeGroup);
          TypeGroup spaOpTypesTypeGroup =
              (TypeGroup)
                  mapperOpTypesTypeGroup.deepCopyFromRepository2Persistence(
                      objOpTypesTypeGroup, context);
          spa.setOpTypesTypeGroup(spaOpTypesTypeGroup);
          spaOpTypesTypeGroup.getTypes().add(spa);
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
