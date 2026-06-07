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
import org.tura.model.designer.repository.neoj4.form.TreePK;
import org.tura.model.designer.repository.serialized.form.Tree;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import org.tura.platform.repository.core.ObjectControl;

public class TreeMapper extends MapperHelper implements Mapper, PersistanceMapper, Neo4jObjectInit {

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
      TreePK pk = new TreePK();
      pk.setUid((String) find("Uid", objKey.getKey()));
      return pk;
    } catch (Exception e) {
      throw new RepositoryException(e);
    }
  }

  public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
    Tree obj = (Tree) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.Tree");
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
    Tree obj = (Tree) object;
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
    org.tura.model.designer.repository.neoj4.form.Tree jpa =
        (org.tura.model.designer.repository.neoj4.form.Tree) persistenceObject;
    TreePK pk = new TreePK();
    pk.setUid(jpa.getUid());
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.Tree jpa =
        (org.tura.model.designer.repository.neoj4.form.Tree) persistenceObject;
  }

  public void initObject(
      Object persistenceObject,
      org.tura.platform.repository.neo4j.operation.SequenceProvider sequenceProvider) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.Tree jpa =
        (org.tura.model.designer.repository.neoj4.form.Tree) persistenceObject;
  }

  public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) {
    Tree obj = (Tree) repositoryObject;
    TreePK pk = new TreePK();
    pk.setUid(obj.getUid());
    return pk;
  }

  public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.Tree jpa =
        (org.tura.model.designer.repository.neoj4.form.Tree) persistenceObject;
    Tree obj = (Tree) repositoryObject;
    StringBuffer key = new StringBuffer();
    key.append(jpa.getUid());
    key.append("org.tura.model.designer.repository.neoj4.form.Tree");
    obj.setAttached(true);
    obj.setSerializationid(
        java.util.UUID.randomUUID().toString()
            + "||"
            + org.tura.model.designer.repository.serialized.form.Tree.class.getName());
    obj.setLabel(jpa.getLabel());
    obj.setSelectionMode(
        org.tura.model.designer.repository.serialized.form.converter.SelectionModeConverter.convert(
            jpa.getSelectionMode()));
    obj.setUid(jpa.getUid());
    obj.setSuidStyleElement(jpa.getSuidStyleElement());
    obj.setNickname(jpa.getNickname());
    obj.setSuidNickNamed(jpa.getSuidNickNamed());
    obj.setSuidCategorized(jpa.getSuidCategorized());
    obj.setOrder(jpa.getOrder());
    obj.setSuidOrderable(jpa.getSuidOrderable());
    obj.setSuidEnabledUIItem(jpa.getSuidEnabledUIItem());
    obj.setSuidFlexFields(jpa.getSuidFlexFields());
    obj.setSuidMenuHolder(jpa.getSuidMenuHolder());
    obj.setSuidControlPointer(jpa.getSuidControlPointer());
    obj.setSuidMultiLangLabel(jpa.getSuidMultiLangLabel());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
    obj.setTransientrefChildrenChildrenHolder(jpa.getRefChildrenChildrenHolder());
    obj.setTransientrefElementColumn(jpa.getRefElementColumn());
    obj.setTransientrefOpMenuMenuHolderMenuFolder(jpa.getRefOpMenuMenuHolderMenuFolder());
    obj.setTransientrefOpSourcePointerControlPointerDataControl(
        jpa.getRefOpSourcePointerControlPointerDataControl());
    obj.setTransientrefOpValuePointerControlPointerMetaObject(
        jpa.getRefOpValuePointerControlPointerMetaObject());
    obj.setTransientrefOpSourceCastControlPointerType(jpa.getRefOpSourceCastControlPointerType());
    obj.setTransientrefOpSourceCastDataControlControlPointerDataControl(
        jpa.getRefOpSourceCastDataControlControlPointerDataControl());
    return obj;
  }

  public void differentiator(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.Tree jpa =
        (org.tura.model.designer.repository.neoj4.form.Tree) persistenceObject;
    Tree obj = (Tree) repositoryObject;
    obj.setLabel(jpa.getLabel());
    obj.setSelectionMode(
        org.tura.model.designer.repository.serialized.form.converter.SelectionModeConverter.convert(
            jpa.getSelectionMode()));
    obj.setUid(jpa.getUid());
    obj.setSuidStyleElement(jpa.getSuidStyleElement());
    obj.setNickname(jpa.getNickname());
    obj.setSuidNickNamed(jpa.getSuidNickNamed());
    obj.setSuidCategorized(jpa.getSuidCategorized());
    obj.setOrder(jpa.getOrder());
    obj.setSuidOrderable(jpa.getSuidOrderable());
    obj.setSuidEnabledUIItem(jpa.getSuidEnabledUIItem());
    obj.setSuidFlexFields(jpa.getSuidFlexFields());
    obj.setSuidMenuHolder(jpa.getSuidMenuHolder());
    obj.setSuidControlPointer(jpa.getSuidControlPointer());
    obj.setSuidMultiLangLabel(jpa.getSuidMultiLangLabel());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
    obj.setTransientrefChildrenChildrenHolder(jpa.getRefChildrenChildrenHolder());
    obj.setTransientrefElementColumn(jpa.getRefElementColumn());
    obj.setTransientrefOpMenuMenuHolderMenuFolder(jpa.getRefOpMenuMenuHolderMenuFolder());
    obj.setTransientrefOpSourcePointerControlPointerDataControl(
        jpa.getRefOpSourcePointerControlPointerDataControl());
    obj.setTransientrefOpValuePointerControlPointerMetaObject(
        jpa.getRefOpValuePointerControlPointerMetaObject());
    obj.setTransientrefOpSourceCastControlPointerType(jpa.getRefOpSourceCastControlPointerType());
    obj.setTransientrefOpSourceCastDataControlControlPointerDataControl(
        jpa.getRefOpSourceCastDataControlControlPointerDataControl());
  }

  public void copyPKFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
    persistenceObject = unwrap(persistenceObject);
    org.tura.model.designer.repository.neoj4.form.Tree jpa =
        (org.tura.model.designer.repository.neoj4.form.Tree) persistenceObject;
    Tree obj = (Tree) repositoryObject;
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
    obj.setSuidControlPointer(jpa.getSuidControlPointer());
    obj.setSuidMultiLangLabel(jpa.getSuidMultiLangLabel());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
  }

  public Object copyFromRepository2Persistence(Object repositoryObject) {
    org.tura.model.designer.repository.neoj4.form.Tree jpa =
        new org.tura.model.designer.repository.neoj4.form.Tree();
    Tree obj = (Tree) repositoryObject;
    jpa.setLabel(obj.getLabel());
    jpa.setSelectionMode(
        org.tura.model.designer.repository.serialized.form.converter.SelectionModeConverter.convert(
            obj.getSelectionMode()));
    jpa.setUid(obj.getUid());
    jpa.setSuidStyleElement(obj.getSuidStyleElement());
    jpa.setNickname(obj.getNickname());
    jpa.setSuidNickNamed(obj.getSuidNickNamed());
    jpa.setSuidCategorized(obj.getSuidCategorized());
    jpa.setOrder(obj.getOrder());
    jpa.setSuidOrderable(obj.getSuidOrderable());
    jpa.setSuidEnabledUIItem(obj.getSuidEnabledUIItem());
    jpa.setSuidFlexFields(obj.getSuidFlexFields());
    jpa.setSuidMenuHolder(obj.getSuidMenuHolder());
    jpa.setSuidControlPointer(obj.getSuidControlPointer());
    jpa.setSuidMultiLangLabel(obj.getSuidMultiLangLabel());
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
