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
import org.tura.model.designer.repository.serialized.form.Context;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.model.designer.repository.serialized.form.MultiLangLabel;
import org.tura.model.designer.repository.serialized.form.StyleElement;
import org.tura.model.designer.repository.serialized.form.EnabledUIItem;
import org.tura.model.designer.repository.serialized.form.Uielement;
import org.tura.model.designer.repository.serialized.form.ItemIcon;
import org.tura.model.designer.repository.serialized.form.OptionSelection;
import org.tura.model.designer.repository.serialized.form.MenuItem;
import org.tura.model.designer.repository.serialized.form.Tree;
import org.tura.model.designer.repository.serialized.form.ExpressionPart;
import java.util.Collection;
import org.tura.model.designer.repository.serialized.form.ContextParameter;
import java.util.List;
import java.util.ArrayList;

public class ContextProxyMapper extends CpaMapperHelper
    implements CpaMapper, CopyFrom, PersistanceMapper, AdapterLoaderAware {

  private static final long serialVersionUID = 1L;

  private AdapterLoader loader;

  private ProxyFactory proxyFactory;

  public ContextProxyMapper() {}

  public ContextProxyMapper(org.tura.platform.repository.core.Registry registry) {
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
    Context obj = (Context) repositoryObject;
    if (loadedObjects.contains(obj)) {
      return;
    }
    loadedObjects.add(obj);
  }

  public Object unwrap(Object persistenceObject) {
    return persistenceObject;
  }

  public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
    Context obj = (Context) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.Context");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public RepoObjectKey getCpaPrimaryKey(
      org.tura.model.designer.repository.serialized.form.Context spa) throws RepositoryException {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.Context");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), spa.getCpaid());
    key.addValue(value);
    return key;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    Context obj = (Context) object;
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
    Context spa = (Context) persistenceObject;
    String pk = spa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {}

  public String getCpaId(Object persistenceObject) {
    Context spa = (Context) persistenceObject;
    return spa.getCpaid();
  }

  public Boolean getAttached(Object persistenceObject) {
    Context spa = (Context) persistenceObject;
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
    Context obj = (Context) repositoryObject;
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
    Context spa = (Context) persistenceObject;
    RepoKeyPath mypath = topCpaPath.clone();
    mypath.addRepoObjectKey(relation, getCpaPrimaryKey(spa));
    keyMap.put(spa.getCpaid(), mypath);
    register.add(spa.getCpaid());
  }

  public void collectCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    Context spa = (Context) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    keyMap.put(pk, spa.getCpaid());
  }

  public void replaceCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    Context spa = (Context) persistenceObject;
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
    Context jpa = (Context) persistenceObject;
    Context obj = (Context) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
    obj.setSuidContextParameters(jpa.getSuidContextParameters());
  }

  public Object copyFromPersistence2Repository(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    Context spa = (Context) persistenceObject;
    Context obj = (Context) repositoryObject;
    if (spa != null) {
      StringBuffer key = new StringBuffer();
      key.append(spa.getUid());
      key.append("org.tura.model.designer.repository.serialized.form.Context");
      obj.setAttached(true);
      obj.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.Context.class.getName());
      obj.setUid(spa.getUid());
      obj.setConstant(spa.getConstant());
      obj.setValue(spa.getValue());
      obj.setSuidContextParameters(spa.getSuidContextParameters());
      obj.setTransientrefMultiLangLabelMultiLangLabel(
          spa.getTransientrefMultiLangLabelMultiLangLabel());
      obj.setTransientrefStyleStyleElement(spa.getTransientrefStyleStyleElement());
      obj.setTransientrefEnabledEnabledUIItem(spa.getTransientrefEnabledEnabledUIItem());
      obj.setTransientrefRequiredUielement(spa.getTransientrefRequiredUielement());
      obj.setTransientrefReadOnlyUielement(spa.getTransientrefReadOnlyUielement());
      obj.setTransientrefIconItemIcon(spa.getTransientrefIconItemIcon());
      obj.setTransientrefInitialOptionMessageOptionSelection(
          spa.getTransientrefInitialOptionMessageOptionSelection());
      obj.setTransientrefTransitionMenuItem(spa.getTransientrefTransitionMenuItem());
      obj.setTransientrefImageTree(spa.getTransientrefImageTree());
      obj.setTransientrefValueContextParameter(spa.getTransientrefValueContextParameter());
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
    Context obj = (Context) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (Context) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      Context spa = (Context) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.Context.class.getName());
      spa.setUid(obj.getUid());
      spa.setConstant(obj.getConstant());
      spa.setValue(obj.getValue());
      spa.setSuidContextParameters(obj.getSuidContextParameters());
      spa.setTransientrefMultiLangLabelMultiLangLabel(
          obj.getTransientrefMultiLangLabelMultiLangLabel());
      spa.setTransientrefStyleStyleElement(obj.getTransientrefStyleStyleElement());
      spa.setTransientrefEnabledEnabledUIItem(obj.getTransientrefEnabledEnabledUIItem());
      spa.setTransientrefRequiredUielement(obj.getTransientrefRequiredUielement());
      spa.setTransientrefReadOnlyUielement(obj.getTransientrefReadOnlyUielement());
      spa.setTransientrefIconItemIcon(obj.getTransientrefIconItemIcon());
      spa.setTransientrefInitialOptionMessageOptionSelection(
          obj.getTransientrefInitialOptionMessageOptionSelection());
      spa.setTransientrefTransitionMenuItem(obj.getTransientrefTransitionMenuItem());
      spa.setTransientrefImageTree(obj.getTransientrefImageTree());
      spa.setTransientrefValueContextParameter(obj.getTransientrefValueContextParameter());
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
    Context obj = (Context) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (Context) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      Context spa = (Context) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.Context.class.getName());
      spa.setUid(obj.getUid());
      spa.setConstant(obj.getConstant());
      spa.setValue(obj.getValue());
      spa.setSuidContextParameters(obj.getSuidContextParameters());
      spa.setTransientrefMultiLangLabelMultiLangLabel(
          obj.getTransientrefMultiLangLabelMultiLangLabel());
      spa.setTransientrefStyleStyleElement(obj.getTransientrefStyleStyleElement());
      spa.setTransientrefEnabledEnabledUIItem(obj.getTransientrefEnabledEnabledUIItem());
      spa.setTransientrefRequiredUielement(obj.getTransientrefRequiredUielement());
      spa.setTransientrefReadOnlyUielement(obj.getTransientrefReadOnlyUielement());
      spa.setTransientrefIconItemIcon(obj.getTransientrefIconItemIcon());
      spa.setTransientrefInitialOptionMessageOptionSelection(
          obj.getTransientrefInitialOptionMessageOptionSelection());
      spa.setTransientrefTransitionMenuItem(obj.getTransientrefTransitionMenuItem());
      spa.setTransientrefImageTree(obj.getTransientrefImageTree());
      spa.setTransientrefValueContextParameter(obj.getTransientrefValueContextParameter());
      MultiLangLabel objOpMultiLangLabelMultiLangLabel = obj.getOpMultiLangLabelMultiLangLabel();
      if (objOpMultiLangLabelMultiLangLabel != null) {
        CopyFrom mapperOpMultiLangLabelMultiLangLabel =
            findCopyFromByRepoObject(objOpMultiLangLabelMultiLangLabel);
        Object pkOpMultiLangLabelMultiLangLabel =
            mapperOpMultiLangLabelMultiLangLabel.getPrimaryKeyFromRepositoryObject(
                objOpMultiLangLabelMultiLangLabel);
        if (get(context, pkOpMultiLangLabelMultiLangLabel, objOpMultiLangLabelMultiLangLabel)
            == null) {
          put(context, pkOpMultiLangLabelMultiLangLabel, objOpMultiLangLabelMultiLangLabel);
          MultiLangLabel spaOpMultiLangLabelMultiLangLabel =
              (MultiLangLabel)
                  mapperOpMultiLangLabelMultiLangLabel.deepCopyFromRepository2Persistence(
                      objOpMultiLangLabelMultiLangLabel, context);
          spa.setOpMultiLangLabelMultiLangLabel(spaOpMultiLangLabelMultiLangLabel);
          spaOpMultiLangLabelMultiLangLabel.setMultiLangLabel(spa);
        }
      }
      StyleElement objOpStyleStyleElement = obj.getOpStyleStyleElement();
      if (objOpStyleStyleElement != null) {
        CopyFrom mapperOpStyleStyleElement = findCopyFromByRepoObject(objOpStyleStyleElement);
        Object pkOpStyleStyleElement =
            mapperOpStyleStyleElement.getPrimaryKeyFromRepositoryObject(objOpStyleStyleElement);
        if (get(context, pkOpStyleStyleElement, objOpStyleStyleElement) == null) {
          put(context, pkOpStyleStyleElement, objOpStyleStyleElement);
          StyleElement spaOpStyleStyleElement =
              (StyleElement)
                  mapperOpStyleStyleElement.deepCopyFromRepository2Persistence(
                      objOpStyleStyleElement, context);
          spa.setOpStyleStyleElement(spaOpStyleStyleElement);
          spaOpStyleStyleElement.setStyle(spa);
        }
      }
      EnabledUIItem objOpEnabledEnabledUIItem = obj.getOpEnabledEnabledUIItem();
      if (objOpEnabledEnabledUIItem != null) {
        CopyFrom mapperOpEnabledEnabledUIItem = findCopyFromByRepoObject(objOpEnabledEnabledUIItem);
        Object pkOpEnabledEnabledUIItem =
            mapperOpEnabledEnabledUIItem.getPrimaryKeyFromRepositoryObject(
                objOpEnabledEnabledUIItem);
        if (get(context, pkOpEnabledEnabledUIItem, objOpEnabledEnabledUIItem) == null) {
          put(context, pkOpEnabledEnabledUIItem, objOpEnabledEnabledUIItem);
          EnabledUIItem spaOpEnabledEnabledUIItem =
              (EnabledUIItem)
                  mapperOpEnabledEnabledUIItem.deepCopyFromRepository2Persistence(
                      objOpEnabledEnabledUIItem, context);
          spa.setOpEnabledEnabledUIItem(spaOpEnabledEnabledUIItem);
          spaOpEnabledEnabledUIItem.setEnabled(spa);
        }
      }
      Uielement objOpRequiredUielement = obj.getOpRequiredUielement();
      if (objOpRequiredUielement != null) {
        CopyFrom mapperOpRequiredUielement = findCopyFromByRepoObject(objOpRequiredUielement);
        Object pkOpRequiredUielement =
            mapperOpRequiredUielement.getPrimaryKeyFromRepositoryObject(objOpRequiredUielement);
        if (get(context, pkOpRequiredUielement, objOpRequiredUielement) == null) {
          put(context, pkOpRequiredUielement, objOpRequiredUielement);
          Uielement spaOpRequiredUielement =
              (Uielement)
                  mapperOpRequiredUielement.deepCopyFromRepository2Persistence(
                      objOpRequiredUielement, context);
          spa.setOpRequiredUielement(spaOpRequiredUielement);
          spaOpRequiredUielement.setRequired(spa);
        }
      }
      Uielement objOpReadOnlyUielement = obj.getOpReadOnlyUielement();
      if (objOpReadOnlyUielement != null) {
        CopyFrom mapperOpReadOnlyUielement = findCopyFromByRepoObject(objOpReadOnlyUielement);
        Object pkOpReadOnlyUielement =
            mapperOpReadOnlyUielement.getPrimaryKeyFromRepositoryObject(objOpReadOnlyUielement);
        if (get(context, pkOpReadOnlyUielement, objOpReadOnlyUielement) == null) {
          put(context, pkOpReadOnlyUielement, objOpReadOnlyUielement);
          Uielement spaOpReadOnlyUielement =
              (Uielement)
                  mapperOpReadOnlyUielement.deepCopyFromRepository2Persistence(
                      objOpReadOnlyUielement, context);
          spa.setOpReadOnlyUielement(spaOpReadOnlyUielement);
          spaOpReadOnlyUielement.setReadOnly(spa);
        }
      }
      ItemIcon objOpIconItemIcon = obj.getOpIconItemIcon();
      if (objOpIconItemIcon != null) {
        CopyFrom mapperOpIconItemIcon = findCopyFromByRepoObject(objOpIconItemIcon);
        Object pkOpIconItemIcon =
            mapperOpIconItemIcon.getPrimaryKeyFromRepositoryObject(objOpIconItemIcon);
        if (get(context, pkOpIconItemIcon, objOpIconItemIcon) == null) {
          put(context, pkOpIconItemIcon, objOpIconItemIcon);
          ItemIcon spaOpIconItemIcon =
              (ItemIcon)
                  mapperOpIconItemIcon.deepCopyFromRepository2Persistence(
                      objOpIconItemIcon, context);
          spa.setOpIconItemIcon(spaOpIconItemIcon);
          spaOpIconItemIcon.setIcon(spa);
        }
      }
      OptionSelection objOpInitialOptionMessageOptionSelection =
          obj.getOpInitialOptionMessageOptionSelection();
      if (objOpInitialOptionMessageOptionSelection != null) {
        CopyFrom mapperOpInitialOptionMessageOptionSelection =
            findCopyFromByRepoObject(objOpInitialOptionMessageOptionSelection);
        Object pkOpInitialOptionMessageOptionSelection =
            mapperOpInitialOptionMessageOptionSelection.getPrimaryKeyFromRepositoryObject(
                objOpInitialOptionMessageOptionSelection);
        if (get(
                context,
                pkOpInitialOptionMessageOptionSelection,
                objOpInitialOptionMessageOptionSelection)
            == null) {
          put(
              context,
              pkOpInitialOptionMessageOptionSelection,
              objOpInitialOptionMessageOptionSelection);
          OptionSelection spaOpInitialOptionMessageOptionSelection =
              (OptionSelection)
                  mapperOpInitialOptionMessageOptionSelection.deepCopyFromRepository2Persistence(
                      objOpInitialOptionMessageOptionSelection, context);
          spa.setOpInitialOptionMessageOptionSelection(spaOpInitialOptionMessageOptionSelection);
          spaOpInitialOptionMessageOptionSelection.setInitialOptionMessage(spa);
        }
      }
      MenuItem objOpTransitionMenuItem = obj.getOpTransitionMenuItem();
      if (objOpTransitionMenuItem != null) {
        CopyFrom mapperOpTransitionMenuItem = findCopyFromByRepoObject(objOpTransitionMenuItem);
        Object pkOpTransitionMenuItem =
            mapperOpTransitionMenuItem.getPrimaryKeyFromRepositoryObject(objOpTransitionMenuItem);
        if (get(context, pkOpTransitionMenuItem, objOpTransitionMenuItem) == null) {
          put(context, pkOpTransitionMenuItem, objOpTransitionMenuItem);
          MenuItem spaOpTransitionMenuItem =
              (MenuItem)
                  mapperOpTransitionMenuItem.deepCopyFromRepository2Persistence(
                      objOpTransitionMenuItem, context);
          spa.setOpTransitionMenuItem(spaOpTransitionMenuItem);
          spaOpTransitionMenuItem.setTransition(spa);
        }
      }
      Tree objOpImageTree = obj.getOpImageTree();
      if (objOpImageTree != null) {
        CopyFrom mapperOpImageTree = findCopyFromByRepoObject(objOpImageTree);
        Object pkOpImageTree = mapperOpImageTree.getPrimaryKeyFromRepositoryObject(objOpImageTree);
        if (get(context, pkOpImageTree, objOpImageTree) == null) {
          put(context, pkOpImageTree, objOpImageTree);
          Tree spaOpImageTree =
              (Tree) mapperOpImageTree.deepCopyFromRepository2Persistence(objOpImageTree, context);
          spa.setOpImageTree(spaOpImageTree);
          spaOpImageTree.setImage(spa);
        }
      }
      Collection<ExpressionPart> objExpressionList = obj.getExpression();
      if (objExpressionList != null) {
        for (ExpressionPart objExpression : objExpressionList) {
          CopyFrom mapperExpression = findCopyFromByRepoObject(objExpression);
          Object pkExpression = mapperExpression.getPrimaryKeyFromRepositoryObject(objExpression);
          if (get(context, pkExpression, objExpression) == null) {
            put(context, pkExpression, objExpression);
            ExpressionPart spaExpression =
                (ExpressionPart)
                    mapperExpression.deepCopyFromRepository2Persistence(objExpression, context);
            spa.getExpression().add(spaExpression);
            spaExpression.setOpExpressionContextValue(spa);
          }
        }
      }
      ContextParameter objOpValueContextParameter = obj.getOpValueContextParameter();
      if (objOpValueContextParameter != null) {
        CopyFrom mapperOpValueContextParameter =
            findCopyFromByRepoObject(objOpValueContextParameter);
        Object pkOpValueContextParameter =
            mapperOpValueContextParameter.getPrimaryKeyFromRepositoryObject(
                objOpValueContextParameter);
        if (get(context, pkOpValueContextParameter, objOpValueContextParameter) == null) {
          put(context, pkOpValueContextParameter, objOpValueContextParameter);
          ContextParameter spaOpValueContextParameter =
              (ContextParameter)
                  mapperOpValueContextParameter.deepCopyFromRepository2Persistence(
                      objOpValueContextParameter, context);
          spa.setOpValueContextParameter(spaOpValueContextParameter);
          spaOpValueContextParameter.setValue(spa);
        }
      }
      Collection<ContextParameter> objParametersList = obj.getParameters();
      if (objParametersList != null) {
        for (ContextParameter objParameters : objParametersList) {
          CopyFrom mapperParameters = findCopyFromByRepoObject(objParameters);
          Object pkParameters = mapperParameters.getPrimaryKeyFromRepositoryObject(objParameters);
          if (get(context, pkParameters, objParameters) == null) {
            put(context, pkParameters, objParameters);
            ContextParameter spaParameters =
                (ContextParameter)
                    mapperParameters.deepCopyFromRepository2Persistence(objParameters, context);
            spa.getParameters().add(spaParameters);
            spaParameters.setOpParametersContextParameters(spa);
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
