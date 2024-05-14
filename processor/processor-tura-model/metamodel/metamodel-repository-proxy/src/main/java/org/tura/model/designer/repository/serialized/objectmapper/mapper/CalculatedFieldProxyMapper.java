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

package org.tura.model.designer.repository.serialized.objectmapper.mapper;

import org.tura.platform.repository.cpa.CpaMapperHelper;
import org.tura.platform.repository.cpa.storage.CpaMapper;
import org.tura.platform.repository.core.CopyFrom;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.core.AdapterLoaderAware;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.serialized.objectmapper.CalculatedField;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper;
import org.tura.model.designer.repository.serialized.type.TypeElement;
import org.tura.model.designer.repository.serialized.type.Assosiation;
import java.util.List;
import java.util.ArrayList;

public class CalculatedFieldProxyMapper extends CpaMapperHelper
    implements CpaMapper, CopyFrom, PersistanceMapper, AdapterLoaderAware {

  private static final long serialVersionUID = 1L;

  private AdapterLoader loader;

  private ProxyFactory proxyFactory;

  public CalculatedFieldProxyMapper() {}

  public CalculatedFieldProxyMapper(org.tura.platform.repository.core.Registry registry) {
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
    CalculatedField obj = (CalculatedField) repositoryObject;
    if (loadedObjects.contains(obj)) {
      return;
    }
    loadedObjects.add(obj);
  }

  public Object unwrap(Object persistenceObject) {
    return persistenceObject;
  }

  public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
    CalculatedField obj = (CalculatedField) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.objectmapper.CalculatedField");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public RepoObjectKey getCpaPrimaryKey(
      org.tura.model.designer.repository.serialized.objectmapper.CalculatedField spa)
      throws RepositoryException {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.objectmapper.CalculatedField");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), spa.getCpaid());
    key.addValue(value);
    return key;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    CalculatedField obj = (CalculatedField) object;
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
    CalculatedField spa = (CalculatedField) persistenceObject;
    String pk = spa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {}

  public String getCpaId(Object persistenceObject) {
    CalculatedField spa = (CalculatedField) persistenceObject;
    return spa.getCpaid();
  }

  public Boolean getAttached(Object persistenceObject) {
    CalculatedField spa = (CalculatedField) persistenceObject;
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
    CalculatedField obj = (CalculatedField) repositoryObject;
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
    CalculatedField spa = (CalculatedField) persistenceObject;
    RepoKeyPath mypath = topCpaPath.clone();
    mypath.addRepoObjectKey(relation, getCpaPrimaryKey(spa));
    keyMap.put(spa.getCpaid(), mypath);
    register.add(spa.getCpaid());
  }

  public void collectCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    CalculatedField spa = (CalculatedField) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    keyMap.put(pk, spa.getCpaid());
  }

  public void replaceCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    CalculatedField spa = (CalculatedField) persistenceObject;
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
    CalculatedField jpa = (CalculatedField) persistenceObject;
    CalculatedField obj = (CalculatedField) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
    obj.setSuidTypePointer(jpa.getSuidTypePointer());
  }

  public Object copyFromPersistence2Repository(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    CalculatedField spa = (CalculatedField) persistenceObject;
    CalculatedField obj = (CalculatedField) repositoryObject;
    if (spa != null) {
      StringBuffer key = new StringBuffer();
      key.append(spa.getUid());
      key.append("org.tura.model.designer.repository.serialized.objectmapper.CalculatedField");
      obj.setAttached(true);
      obj.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.objectmapper.CalculatedField.class
                  .getName());
      obj.setUid(spa.getUid());
      obj.setName(spa.getName());
      obj.setSuidTypePointer(spa.getSuidTypePointer());
      obj.setTransientrefCalculationsObjectMapper(spa.getTransientrefCalculationsObjectMapper());
      obj.setTransientrefOpTypeRefTypePointerTypeElement(
          spa.getTransientrefOpTypeRefTypePointerTypeElement());
      obj.setTransientrefMany2manyHelperAssosiation(
          spa.getTransientrefMany2manyHelperAssosiation());
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
    CalculatedField obj = (CalculatedField) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (CalculatedField) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      CalculatedField spa = (CalculatedField) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.objectmapper.CalculatedField.class
                  .getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setSuidTypePointer(obj.getSuidTypePointer());
      spa.setTransientrefCalculationsObjectMapper(obj.getTransientrefCalculationsObjectMapper());
      spa.setTransientrefOpTypeRefTypePointerTypeElement(
          obj.getTransientrefOpTypeRefTypePointerTypeElement());
      spa.setTransientrefMany2manyHelperAssosiation(
          obj.getTransientrefMany2manyHelperAssosiation());
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
    CalculatedField obj = (CalculatedField) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (CalculatedField) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      CalculatedField spa = (CalculatedField) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.objectmapper.CalculatedField.class
                  .getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setSuidTypePointer(obj.getSuidTypePointer());
      spa.setTransientrefCalculationsObjectMapper(obj.getTransientrefCalculationsObjectMapper());
      spa.setTransientrefOpTypeRefTypePointerTypeElement(
          obj.getTransientrefOpTypeRefTypePointerTypeElement());
      spa.setTransientrefMany2manyHelperAssosiation(
          obj.getTransientrefMany2manyHelperAssosiation());
      ObjectMapper objOpCalculationsObjectMapper = obj.getOpCalculationsObjectMapper();
      if (objOpCalculationsObjectMapper != null) {
        CopyFrom mapperOpCalculationsObjectMapper =
            findCopyFromByRepoObject(objOpCalculationsObjectMapper);
        Object pkOpCalculationsObjectMapper =
            mapperOpCalculationsObjectMapper.getPrimaryKeyFromRepositoryObject(
                objOpCalculationsObjectMapper);
        if (get(context, pkOpCalculationsObjectMapper, objOpCalculationsObjectMapper) == null) {
          put(context, pkOpCalculationsObjectMapper, objOpCalculationsObjectMapper);
          ObjectMapper spaOpCalculationsObjectMapper =
              (ObjectMapper)
                  mapperOpCalculationsObjectMapper.deepCopyFromRepository2Persistence(
                      objOpCalculationsObjectMapper, context);
          spa.setOpCalculationsObjectMapper(spaOpCalculationsObjectMapper);
          spaOpCalculationsObjectMapper.getCalculations().add(spa);
        }
      }
      TypeElement objTypeRef = obj.getTypeRef();
      if (objTypeRef != null) {
        CopyFrom mapperTypeRef = findCopyFromByRepoObject(objTypeRef);
        Object pkTypeRef = mapperTypeRef.getPrimaryKeyFromRepositoryObject(objTypeRef);
        if (get(context, pkTypeRef, objTypeRef) == null) {
          put(context, pkTypeRef, objTypeRef);
          TypeElement spaTypeRef =
              (TypeElement) mapperTypeRef.deepCopyFromRepository2Persistence(objTypeRef, context);
          spa.setTypeRef(spaTypeRef);
          spaTypeRef.getOpTypeRefTypePointer().add(spa);
        }
      }
      Assosiation objOpMany2manyHelperAssosiation = obj.getOpMany2manyHelperAssosiation();
      if (objOpMany2manyHelperAssosiation != null) {
        CopyFrom mapperOpMany2manyHelperAssosiation =
            findCopyFromByRepoObject(objOpMany2manyHelperAssosiation);
        Object pkOpMany2manyHelperAssosiation =
            mapperOpMany2manyHelperAssosiation.getPrimaryKeyFromRepositoryObject(
                objOpMany2manyHelperAssosiation);
        if (get(context, pkOpMany2manyHelperAssosiation, objOpMany2manyHelperAssosiation) == null) {
          put(context, pkOpMany2manyHelperAssosiation, objOpMany2manyHelperAssosiation);
          Assosiation spaOpMany2manyHelperAssosiation =
              (Assosiation)
                  mapperOpMany2manyHelperAssosiation.deepCopyFromRepository2Persistence(
                      objOpMany2manyHelperAssosiation, context);
          spa.setOpMany2manyHelperAssosiation(spaOpMany2manyHelperAssosiation);
          spaOpMany2manyHelperAssosiation.setMany2manyHelper(spa);
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
