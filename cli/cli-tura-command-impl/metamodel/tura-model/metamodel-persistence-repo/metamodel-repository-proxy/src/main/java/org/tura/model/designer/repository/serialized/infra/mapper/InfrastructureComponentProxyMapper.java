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

package org.tura.model.designer.repository.serialized.infra.mapper;

import org.tura.platform.repository.cpa.CpaMapperHelper;
import org.tura.platform.repository.cpa.storage.CpaMapper;
import org.tura.platform.repository.core.CopyFrom;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.core.AdapterLoaderAware;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.serialized.infra.InfrastructureComponent;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.model.designer.repository.serialized.infra.InfrastructureConnection;
import java.util.Collection;
import org.tura.model.designer.repository.serialized.infra.InfrastructureLayer;
import java.util.List;
import java.util.ArrayList;

public class InfrastructureComponentProxyMapper extends CpaMapperHelper
    implements CpaMapper, CopyFrom, PersistanceMapper, AdapterLoaderAware {

  private static final long serialVersionUID = 1L;

  private AdapterLoader loader;

  private ProxyFactory proxyFactory;

  public InfrastructureComponentProxyMapper() {}

  public InfrastructureComponentProxyMapper(org.tura.platform.repository.core.Registry registry) {
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
    InfrastructureComponent obj = (InfrastructureComponent) repositoryObject;
    if (loadedObjects.contains(obj)) {
      return;
    }
    loadedObjects.add(obj);
  }

  public Object unwrap(Object persistenceObject) {
    return persistenceObject;
  }

  public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
    InfrastructureComponent obj = (InfrastructureComponent) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.infra.InfrastructureComponent");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public RepoObjectKey getCpaPrimaryKey(
      org.tura.model.designer.repository.serialized.infra.InfrastructureComponent spa)
      throws RepositoryException {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.infra.InfrastructureComponent");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), spa.getCpaid());
    key.addValue(value);
    return key;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    InfrastructureComponent obj = (InfrastructureComponent) object;
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
    InfrastructureComponent spa = (InfrastructureComponent) persistenceObject;
    String pk = spa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {}

  public String getCpaId(Object persistenceObject) {
    InfrastructureComponent spa = (InfrastructureComponent) persistenceObject;
    return spa.getCpaid();
  }

  public Boolean getAttached(Object persistenceObject) {
    InfrastructureComponent spa = (InfrastructureComponent) persistenceObject;
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
    InfrastructureComponent obj = (InfrastructureComponent) repositoryObject;
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
    InfrastructureComponent spa = (InfrastructureComponent) persistenceObject;
    RepoKeyPath mypath = topCpaPath.clone();
    mypath.addRepoObjectKey(relation, getCpaPrimaryKey(spa));
    keyMap.put(spa.getCpaid(), mypath);
    register.add(spa.getCpaid());
  }

  public void collectCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    InfrastructureComponent spa = (InfrastructureComponent) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    keyMap.put(pk, spa.getCpaid());
  }

  public void replaceCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    InfrastructureComponent spa = (InfrastructureComponent) persistenceObject;
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
    InfrastructureComponent jpa = (InfrastructureComponent) persistenceObject;
    InfrastructureComponent obj = (InfrastructureComponent) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
  }

  public Object copyFromPersistence2Repository(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    InfrastructureComponent spa = (InfrastructureComponent) persistenceObject;
    InfrastructureComponent obj = (InfrastructureComponent) repositoryObject;
    if (spa != null) {
      StringBuffer key = new StringBuffer();
      key.append(spa.getUid());
      key.append("org.tura.model.designer.repository.serialized.infra.InfrastructureComponent");
      obj.setAttached(true);
      obj.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.infra.InfrastructureComponent.class
                  .getName());
      obj.setUid(spa.getUid());
      obj.setName(spa.getName());
      obj.setTransientrefInfrastructureComponentInfrastructureLayer(
          spa.getTransientrefInfrastructureComponentInfrastructureLayer());
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
    InfrastructureComponent obj = (InfrastructureComponent) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (InfrastructureComponent) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      InfrastructureComponent spa = (InfrastructureComponent) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.infra.InfrastructureComponent.class
                  .getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setTransientrefInfrastructureComponentInfrastructureLayer(
          obj.getTransientrefInfrastructureComponentInfrastructureLayer());
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
    InfrastructureComponent obj = (InfrastructureComponent) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (InfrastructureComponent) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      InfrastructureComponent spa = (InfrastructureComponent) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.infra.InfrastructureComponent.class
                  .getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setTransientrefInfrastructureComponentInfrastructureLayer(
          obj.getTransientrefInfrastructureComponentInfrastructureLayer());
      Collection<InfrastructureConnection> objOpSourceInfrastructureConnectionList =
          obj.getOpSourceInfrastructureConnection();
      if (objOpSourceInfrastructureConnectionList != null) {
        for (InfrastructureConnection objOpSourceInfrastructureConnection :
            objOpSourceInfrastructureConnectionList) {
          CopyFrom mapperOpSourceInfrastructureConnection =
              findCopyFromByRepoObject(objOpSourceInfrastructureConnection);
          Object pkOpSourceInfrastructureConnection =
              mapperOpSourceInfrastructureConnection.getPrimaryKeyFromRepositoryObject(
                  objOpSourceInfrastructureConnection);
          if (get(context, pkOpSourceInfrastructureConnection, objOpSourceInfrastructureConnection)
              == null) {
            put(context, pkOpSourceInfrastructureConnection, objOpSourceInfrastructureConnection);
            InfrastructureConnection spaOpSourceInfrastructureConnection =
                (InfrastructureConnection)
                    mapperOpSourceInfrastructureConnection.deepCopyFromRepository2Persistence(
                        objOpSourceInfrastructureConnection, context);
            spa.getOpSourceInfrastructureConnection().add(spaOpSourceInfrastructureConnection);
            spaOpSourceInfrastructureConnection.setSource(spa);
          }
        }
      }
      Collection<InfrastructureConnection> objOpTargetInfrastructureConnectionList =
          obj.getOpTargetInfrastructureConnection();
      if (objOpTargetInfrastructureConnectionList != null) {
        for (InfrastructureConnection objOpTargetInfrastructureConnection :
            objOpTargetInfrastructureConnectionList) {
          CopyFrom mapperOpTargetInfrastructureConnection =
              findCopyFromByRepoObject(objOpTargetInfrastructureConnection);
          Object pkOpTargetInfrastructureConnection =
              mapperOpTargetInfrastructureConnection.getPrimaryKeyFromRepositoryObject(
                  objOpTargetInfrastructureConnection);
          if (get(context, pkOpTargetInfrastructureConnection, objOpTargetInfrastructureConnection)
              == null) {
            put(context, pkOpTargetInfrastructureConnection, objOpTargetInfrastructureConnection);
            InfrastructureConnection spaOpTargetInfrastructureConnection =
                (InfrastructureConnection)
                    mapperOpTargetInfrastructureConnection.deepCopyFromRepository2Persistence(
                        objOpTargetInfrastructureConnection, context);
            spa.getOpTargetInfrastructureConnection().add(spaOpTargetInfrastructureConnection);
            spaOpTargetInfrastructureConnection.setTarget(spa);
          }
        }
      }
      InfrastructureLayer objOpInfrastructureComponentInfrastructureLayer =
          obj.getOpInfrastructureComponentInfrastructureLayer();
      if (objOpInfrastructureComponentInfrastructureLayer != null) {
        CopyFrom mapperOpInfrastructureComponentInfrastructureLayer =
            findCopyFromByRepoObject(objOpInfrastructureComponentInfrastructureLayer);
        Object pkOpInfrastructureComponentInfrastructureLayer =
            mapperOpInfrastructureComponentInfrastructureLayer.getPrimaryKeyFromRepositoryObject(
                objOpInfrastructureComponentInfrastructureLayer);
        if (get(
                context,
                pkOpInfrastructureComponentInfrastructureLayer,
                objOpInfrastructureComponentInfrastructureLayer)
            == null) {
          put(
              context,
              pkOpInfrastructureComponentInfrastructureLayer,
              objOpInfrastructureComponentInfrastructureLayer);
          InfrastructureLayer spaOpInfrastructureComponentInfrastructureLayer =
              (InfrastructureLayer)
                  mapperOpInfrastructureComponentInfrastructureLayer
                      .deepCopyFromRepository2Persistence(
                          objOpInfrastructureComponentInfrastructureLayer, context);
          spa.setOpInfrastructureComponentInfrastructureLayer(
              spaOpInfrastructureComponentInfrastructureLayer);
          spaOpInfrastructureComponentInfrastructureLayer.getInfrastructureComponent().add(spa);
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
