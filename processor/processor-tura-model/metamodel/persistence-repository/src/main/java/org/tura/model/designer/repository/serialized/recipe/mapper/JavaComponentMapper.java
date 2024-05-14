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

package org.tura.model.designer.repository.serialized.recipe.mapper;

import org.tura.platform.repository.core.MapperHelper;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import org.tura.platform.repository.core.ObjectControl;

public class JavaComponentMapper extends MapperHelper implements Mapper, PersistanceMapper {

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
      String pk = (String) find("Uid", objKey.getKey());
      return pk;
    } catch (Exception e) {
      throw new RepositoryException(e);
    }
  }

  public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
    JavaComponent obj = (JavaComponent) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.recipe.JavaComponent");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public Object unwrap(Object persistenceObject) {
    return org.hibernate.Hibernate.unproxy(persistenceObject);
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    JavaComponent obj = (JavaComponent) object;
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
    org.tura.model.designer.repository.jpa.recipe.JavaComponent jpa =
        (org.tura.model.designer.repository.jpa.recipe.JavaComponent) persistenceObject;
    String pk = jpa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.jpa.recipe.JavaComponent jpa =
        (org.tura.model.designer.repository.jpa.recipe.JavaComponent) persistenceObject;
  }

  public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) {
    JavaComponent obj = (JavaComponent) repositoryObject;
    String pk = obj.getUid();
    return pk;
  }

  public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.jpa.recipe.JavaComponent jpa =
        (org.tura.model.designer.repository.jpa.recipe.JavaComponent) persistenceObject;
    JavaComponent obj = (JavaComponent) repositoryObject;
    StringBuffer key = new StringBuffer();
    key.append(jpa.getUid());
    key.append("org.tura.model.designer.repository.jpa.recipe.JavaComponent");
    obj.setAttached(true);
    obj.setSerializationid(
        java.util.UUID.randomUUID().toString()
            + "||"
            + org.tura.model.designer.repository.serialized.recipe.JavaComponent.class.getName());
    obj.setArtifactId(jpa.getArtifactId());
    obj.setGroupId(jpa.getGroupId());
    obj.setBasePackage(jpa.getBasePackage());
    obj.setUid(jpa.getUid());
    obj.setName(jpa.getName());
    obj.setSkip(jpa.getSkip());
    obj.setComponentRoot(jpa.getComponentRoot());
    obj.setColumns(jpa.getColumns());
    obj.setSuidHTMLLayerHolder(jpa.getSuidHTMLLayerHolder());
    obj.setOrder(jpa.getOrder());
    obj.setSuidOrderable(jpa.getSuidOrderable());
    obj.setSuidVersionRef(jpa.getSuidVersionRef());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
    if (jpa.getMapperRef() != null) {
      obj.setTransientrefOpMapperRefJavaComponentMapper(jpa.getMapperRef().getSuid());
    }
    if (jpa.getOpComponentsIngredient() != null) {
      obj.setTransientrefComponentsIngredient(jpa.getOpComponentsIngredient().getUid());
    }
    if (jpa.getVersionRef() != null) {
      obj.setTransientrefOpVersionRefVersionRefVersion(jpa.getVersionRef().getUid());
    }
    return obj;
  }

  public void differentiator(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.jpa.recipe.JavaComponent jpa =
        (org.tura.model.designer.repository.jpa.recipe.JavaComponent) persistenceObject;
    JavaComponent obj = (JavaComponent) repositoryObject;
    obj.setArtifactId(jpa.getArtifactId());
    obj.setGroupId(jpa.getGroupId());
    obj.setBasePackage(jpa.getBasePackage());
    obj.setUid(jpa.getUid());
    obj.setName(jpa.getName());
    obj.setSkip(jpa.getSkip());
    obj.setComponentRoot(jpa.getComponentRoot());
    obj.setColumns(jpa.getColumns());
    obj.setSuidHTMLLayerHolder(jpa.getSuidHTMLLayerHolder());
    obj.setOrder(jpa.getOrder());
    obj.setSuidOrderable(jpa.getSuidOrderable());
    obj.setSuidVersionRef(jpa.getSuidVersionRef());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
    if (jpa.getMapperRef() != null) {
      obj.setTransientrefOpMapperRefJavaComponentMapper(jpa.getMapperRef().getSuid());
    }
    if (jpa.getOpComponentsIngredient() != null) {
      obj.setTransientrefComponentsIngredient(jpa.getOpComponentsIngredient().getUid());
    }
    if (jpa.getVersionRef() != null) {
      obj.setTransientrefOpVersionRefVersionRefVersion(jpa.getVersionRef().getUid());
    }
  }

  public void copyPKFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.jpa.recipe.JavaComponent jpa =
        (org.tura.model.designer.repository.jpa.recipe.JavaComponent) persistenceObject;
    JavaComponent obj = (JavaComponent) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
    obj.setSuidHTMLLayerHolder(jpa.getSuidHTMLLayerHolder());
    obj.setSuidOrderable(jpa.getSuidOrderable());
    obj.setSuidVersionRef(jpa.getSuidVersionRef());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
  }

  public Object copyFromRepository2Persistence(Object repositoryObject) {
    org.tura.model.designer.repository.jpa.recipe.JavaComponent jpa =
        new org.tura.model.designer.repository.jpa.recipe.JavaComponent();
    JavaComponent obj = (JavaComponent) repositoryObject;
    jpa.setArtifactId(obj.getArtifactId());
    jpa.setGroupId(obj.getGroupId());
    jpa.setBasePackage(obj.getBasePackage());
    jpa.setUid(obj.getUid());
    jpa.setName(obj.getName());
    jpa.setSkip(obj.getSkip());
    jpa.setComponentRoot(obj.getComponentRoot());
    jpa.setColumns(obj.getColumns());
    jpa.setSuidHTMLLayerHolder(obj.getSuidHTMLLayerHolder());
    jpa.setOrder(obj.getOrder());
    jpa.setSuidOrderable(obj.getSuidOrderable());
    jpa.setSuidVersionRef(obj.getSuidVersionRef());
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
