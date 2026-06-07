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
import org.tura.model.designer.repository.neoj4.form.ContextParameterPK;
import org.tura.model.designer.repository.serialized.form.ContextParameter;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import org.tura.platform.repository.core.ObjectControl;

public class ContextParameterMapper extends MapperHelper
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
      ContextParameterPK pk = new ContextParameterPK();
      pk.setUid((String) find("Uid", objKey.getKey()));
      return pk;
    } catch (Exception e) {
      throw new RepositoryException(e);
    }
  }

  public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
    ContextParameter obj = (ContextParameter) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.ContextParameter");
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
    ContextParameter obj = (ContextParameter) object;
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
    org.tura.model.designer.repository.neoj4.form.ContextParameter jpa =
        (org.tura.model.designer.repository.neoj4.form.ContextParameter) persistenceObject;
    ContextParameterPK pk = new ContextParameterPK();
    pk.setUid(jpa.getUid());
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.ContextParameter jpa =
        (org.tura.model.designer.repository.neoj4.form.ContextParameter) persistenceObject;
  }

  public void initObject(
      Object persistenceObject,
      org.tura.platform.repository.neo4j.operation.SequenceProvider sequenceProvider) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.ContextParameter jpa =
        (org.tura.model.designer.repository.neoj4.form.ContextParameter) persistenceObject;
  }

  public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) {
    ContextParameter obj = (ContextParameter) repositoryObject;
    ContextParameterPK pk = new ContextParameterPK();
    pk.setUid(obj.getUid());
    return pk;
  }

  public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.ContextParameter jpa =
        (org.tura.model.designer.repository.neoj4.form.ContextParameter) persistenceObject;
    ContextParameter obj = (ContextParameter) repositoryObject;
    StringBuffer key = new StringBuffer();
    key.append(jpa.getUid());
    key.append("org.tura.model.designer.repository.neoj4.form.ContextParameter");
    obj.setAttached(true);
    obj.setSerializationid(
        java.util.UUID.randomUUID().toString()
            + "||"
            + org.tura.model.designer.repository.serialized.form.ContextParameter.class.getName());
    obj.setUid(jpa.getUid());
    obj.setOperation(
        org.tura.model.designer.repository.serialized.form.converter.ComparatorConverter.convert(
            jpa.getOperation()));
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
    obj.setTransientrefOpRefObjContextParameterMetaObject(
        jpa.getRefOpRefObjContextParameterMetaObject());
    obj.setTransientrefParametersContextParameters(jpa.getRefParametersContextParameters());
    return obj;
  }

  public void differentiator(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.ContextParameter jpa =
        (org.tura.model.designer.repository.neoj4.form.ContextParameter) persistenceObject;
    ContextParameter obj = (ContextParameter) repositoryObject;
    obj.setUid(jpa.getUid());
    obj.setOperation(
        org.tura.model.designer.repository.serialized.form.converter.ComparatorConverter.convert(
            jpa.getOperation()));
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
    obj.setTransientrefOpRefObjContextParameterMetaObject(
        jpa.getRefOpRefObjContextParameterMetaObject());
    obj.setTransientrefParametersContextParameters(jpa.getRefParametersContextParameters());
  }

  public void copyPKFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.ContextParameter jpa =
        (org.tura.model.designer.repository.neoj4.form.ContextParameter) persistenceObject;
    ContextParameter obj = (ContextParameter) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
  }

  public Object copyFromRepository2Persistence(Object repositoryObject) {
    org.tura.model.designer.repository.neoj4.form.ContextParameter jpa =
        new org.tura.model.designer.repository.neoj4.form.ContextParameter();
    ContextParameter obj = (ContextParameter) repositoryObject;
    jpa.setUid(obj.getUid());
    jpa.setOperation(
        org.tura.model.designer.repository.serialized.form.converter.ComparatorConverter.convert(
            obj.getOperation()));
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
