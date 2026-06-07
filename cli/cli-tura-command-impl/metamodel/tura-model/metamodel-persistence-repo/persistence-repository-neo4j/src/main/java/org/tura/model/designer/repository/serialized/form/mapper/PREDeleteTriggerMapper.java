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

import org.tura.platform.repository.core.MapperHelper;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.neo4j.operation.Neo4jObjectInit;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.neoj4.form.PREDeleteTriggerPK;
import org.tura.model.designer.repository.serialized.form.PREDeleteTrigger;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import org.tura.platform.repository.core.ObjectControl;

public class PREDeleteTriggerMapper extends MapperHelper
    implements Mapper, PersistanceMapper, Neo4jObjectInit {

  private static final long serialVersionUID = 1L;

  private ProxyFactory proxyFactory;

  public ProxyFactory getProxyFactory() {
    return proxyFactory;
  }

  public void setProxyFactory(org.tura.platform.repository.core.ProxyFactory proxyFactory) {
    this.proxyFactory = proxyFactory;
  }

  public Object getPKey(org.tura.platform.repository.core.RepoObjectKey objKey)
      throws RepositoryException {
    try {
      PREDeleteTriggerPK pk = new PREDeleteTriggerPK();
      pk.setUid((String) find("Uid", objKey.getKey()));
      return pk;
    } catch (Exception e) {
      throw new RepositoryException(e);
    }
  }

  public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
    PREDeleteTrigger obj = (PREDeleteTrigger) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.PREDeleteTrigger");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public Object unwrap(Object persistenceObject) {
    return persistenceObject;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    PREDeleteTrigger obj = (PREDeleteTrigger) object;
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

  @Override
  public String getCpaId(Object persistenceObject) {
    return null;
  }

  public Object getPrimaryKey(Object persistenceObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger jpa =
        (org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger) persistenceObject;
    PREDeleteTriggerPK pk = new PREDeleteTriggerPK();
    pk.setUid(jpa.getUid());
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger jpa =
        (org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger) persistenceObject;
  }

  public void initObject(
      Object persistenceObject,
      org.tura.platform.repository.neo4j.operation.SequenceProvider sequenceProvider) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger jpa =
        (org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger) persistenceObject;
  }

  public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) {
    PREDeleteTrigger obj = (PREDeleteTrigger) repositoryObject;
    PREDeleteTriggerPK pk = new PREDeleteTriggerPK();
    pk.setUid(obj.getUid());
    return pk;
  }

  public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger jpa =
        (org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger) persistenceObject;
    PREDeleteTrigger obj = (PREDeleteTrigger) repositoryObject;
    StringBuffer key = new StringBuffer();
    key.append(jpa.getUid());
    key.append("org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger");
    obj.setAttached(true);
    obj.setSerializationid(
        java.util.UUID.randomUUID().toString()
            + "||"
            + org.tura.model.designer.repository.serialized.form.PREDeleteTrigger.class.getName());
    obj.setUid(jpa.getUid());
    obj.setSuidTrigger(jpa.getSuidTrigger());
    obj.setSuidMethodPointer(jpa.getSuidMethodPointer());
    obj.setSuidContextParameters(jpa.getSuidContextParameters());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
    obj.setTransientrefPreDeleteTriggerDataControl(jpa.getRefPreDeleteTriggerDataControl());
    obj.setTransientrefOpMethodRefMethodPointerOperation(
        jpa.getRefOpMethodRefMethodPointerOperation());
    return obj;
  }

  public void differentiator(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger jpa =
        (org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger) persistenceObject;
    PREDeleteTrigger obj = (PREDeleteTrigger) repositoryObject;
    obj.setUid(jpa.getUid());
    obj.setSuidTrigger(jpa.getSuidTrigger());
    obj.setSuidMethodPointer(jpa.getSuidMethodPointer());
    obj.setSuidContextParameters(jpa.getSuidContextParameters());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
    obj.setTransientrefPreDeleteTriggerDataControl(jpa.getRefPreDeleteTriggerDataControl());
    obj.setTransientrefOpMethodRefMethodPointerOperation(
        jpa.getRefOpMethodRefMethodPointerOperation());
  }

  public void copyPKFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger jpa =
        (org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger) persistenceObject;
    PREDeleteTrigger obj = (PREDeleteTrigger) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
    obj.setSuidTrigger(jpa.getSuidTrigger());
    obj.setSuidMethodPointer(jpa.getSuidMethodPointer());
    obj.setSuidContextParameters(jpa.getSuidContextParameters());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
  }

  public Object copyFromRepository2Persistence(Object repositoryObject) {
    org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger jpa =
        new org.tura.model.designer.repository.neoj4.form.PREDeleteTrigger();
    PREDeleteTrigger obj = (PREDeleteTrigger) repositoryObject;
    jpa.setUid(obj.getUid());
    jpa.setSuidTrigger(obj.getSuidTrigger());
    jpa.setSuidMethodPointer(obj.getSuidMethodPointer());
    jpa.setSuidContextParameters(obj.getSuidContextParameters());
    jpa.setSuidMetaObject(obj.getSuidMetaObject());
    return jpa;
  }

  @Override
  public Object copyFromRepository2Persistence(
      Object repositoryObject, java.util.Map<Object, Object> context) throws RepositoryException {
    return null;
  }

  @Override
  public Object copyFromPersistence2Repository(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    return null;
  }

  public void put(java.util.Map<Object, Object> context, Object pk, Object type) {}

  public Object get(java.util.Map<Object, Object> context, Object pk, Object type) {
    return null;
  }
}
