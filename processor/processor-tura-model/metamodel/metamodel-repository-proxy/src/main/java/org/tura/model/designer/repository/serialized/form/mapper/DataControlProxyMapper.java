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
import org.tura.model.designer.repository.serialized.form.DataControl;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.model.designer.repository.serialized.form.ControlPointer;
import java.util.Collection;
import org.tura.model.designer.repository.serialized.form.OptionSelection;
import org.tura.model.designer.repository.serialized.type.TypePointerObj;
import org.tura.model.designer.repository.serialized.form.PREQueryTrigger;
import org.tura.model.designer.repository.serialized.form.POSTQueryTrigger;
import org.tura.model.designer.repository.serialized.form.PREInsertTrigger;
import org.tura.model.designer.repository.serialized.form.PREDeleteTrigger;
import org.tura.model.designer.repository.serialized.form.POSTCreateTrigger;
import org.tura.model.designer.repository.serialized.form.PREUpdateTrigger;
import org.tura.model.designer.repository.serialized.form.CreateTrigger;
import org.tura.model.designer.repository.serialized.form.SearchTrigger;
import org.tura.model.designer.repository.serialized.form.ArtificialField;
import org.tura.model.designer.repository.serialized.form.ContextParametersObj;
import org.tura.model.designer.repository.serialized.form.Orders;
import org.tura.model.designer.repository.serialized.form.RelationMapper;
import org.tura.model.designer.repository.serialized.form.Relation;
import org.tura.model.designer.repository.serialized.form.Dependency;
import org.tura.model.designer.repository.serialized.form.Controls;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.serialized.form.ContextParameter;
import org.tura.model.designer.repository.serialized.form.ExpressionPart;
import org.tura.model.designer.repository.serialized.form.Selection;
import org.tura.model.designer.repository.serialized.form.OrderBy;
import java.util.List;
import java.util.ArrayList;

public class DataControlProxyMapper extends CpaMapperHelper
    implements CpaMapper, CopyFrom, PersistanceMapper, AdapterLoaderAware {

  private static final long serialVersionUID = 1L;

  private AdapterLoader loader;

  private ProxyFactory proxyFactory;

  public DataControlProxyMapper() {}

  public DataControlProxyMapper(org.tura.platform.repository.core.Registry registry) {
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
    DataControl obj = (DataControl) repositoryObject;
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
    DataControl obj = (DataControl) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.DataControl");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public RepoObjectKey getCpaPrimaryKey(
      org.tura.model.designer.repository.serialized.form.DataControl spa)
      throws RepositoryException {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.form.DataControl");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), spa.getCpaid());
    key.addValue(value);
    return key;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    DataControl obj = (DataControl) object;
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
    DataControl spa = (DataControl) persistenceObject;
    String pk = spa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {}

  public String getCpaId(Object persistenceObject) {
    DataControl spa = (DataControl) persistenceObject;
    return spa.getCpaid();
  }

  public Boolean getAttached(Object persistenceObject) {
    DataControl spa = (DataControl) persistenceObject;
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
    DataControl obj = (DataControl) repositoryObject;
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
    DataControl spa = (DataControl) persistenceObject;
    RepoKeyPath mypath = topCpaPath.clone();
    mypath.addRepoObjectKey(relation, getCpaPrimaryKey(spa));
    keyMap.put(spa.getCpaid(), mypath);
    register.add(spa.getCpaid());
  }

  public void collectCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    DataControl spa = (DataControl) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    keyMap.put(pk, spa.getCpaid());
  }

  public void replaceCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    DataControl spa = (DataControl) persistenceObject;
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
    DataControl jpa = (DataControl) persistenceObject;
    DataControl obj = (DataControl) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
    obj.setSuidCategorized(jpa.getSuidCategorized());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
  }

  public Object copyFromPersistence2Repository(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    DataControl spa = (DataControl) persistenceObject;
    DataControl obj = (DataControl) repositoryObject;
    if (spa != null) {
      StringBuffer key = new StringBuffer();
      key.append(spa.getUid());
      key.append("org.tura.model.designer.repository.serialized.form.DataControl");
      obj.setAttached(true);
      obj.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.DataControl.class.getName());
      obj.setUid(spa.getUid());
      obj.setName(spa.getName());
      obj.setSuidCategorized(spa.getSuidCategorized());
      obj.setSuidMetaObject(spa.getSuidMetaObject());
      obj.setTransientrefControlsControls(spa.getTransientrefControlsControls());
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
    DataControl obj = (DataControl) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (DataControl) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      DataControl spa = (DataControl) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.DataControl.class.getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setSuidMetaObject(obj.getSuidMetaObject());
      spa.setTransientrefControlsControls(obj.getTransientrefControlsControls());
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
    DataControl obj = (DataControl) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (DataControl) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      DataControl spa = (DataControl) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.form.DataControl.class.getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setSuidMetaObject(obj.getSuidMetaObject());
      spa.setTransientrefControlsControls(obj.getTransientrefControlsControls());
      Collection<ControlPointer> objOpSourcePointerControlPointerList =
          obj.getOpSourcePointerControlPointer();
      if (objOpSourcePointerControlPointerList != null) {
        for (ControlPointer objOpSourcePointerControlPointer :
            objOpSourcePointerControlPointerList) {
          CopyFrom mapperOpSourcePointerControlPointer =
              findCopyFromByRepoObject(objOpSourcePointerControlPointer);
          Object pkOpSourcePointerControlPointer =
              mapperOpSourcePointerControlPointer.getPrimaryKeyFromRepositoryObject(
                  objOpSourcePointerControlPointer);
          if (get(context, pkOpSourcePointerControlPointer, objOpSourcePointerControlPointer)
              == null) {
            put(context, pkOpSourcePointerControlPointer, objOpSourcePointerControlPointer);
            ControlPointer spaOpSourcePointerControlPointer =
                (ControlPointer)
                    mapperOpSourcePointerControlPointer.deepCopyFromRepository2Persistence(
                        objOpSourcePointerControlPointer, context);
            spa.getOpSourcePointerControlPointer().add(spaOpSourcePointerControlPointer);
            spaOpSourcePointerControlPointer.setSourcePointer(spa);
          }
        }
      }
      Collection<ControlPointer> objOpSourceCastDataControlControlPointerList =
          obj.getOpSourceCastDataControlControlPointer();
      if (objOpSourceCastDataControlControlPointerList != null) {
        for (ControlPointer objOpSourceCastDataControlControlPointer :
            objOpSourceCastDataControlControlPointerList) {
          CopyFrom mapperOpSourceCastDataControlControlPointer =
              findCopyFromByRepoObject(objOpSourceCastDataControlControlPointer);
          Object pkOpSourceCastDataControlControlPointer =
              mapperOpSourceCastDataControlControlPointer.getPrimaryKeyFromRepositoryObject(
                  objOpSourceCastDataControlControlPointer);
          if (get(
                  context,
                  pkOpSourceCastDataControlControlPointer,
                  objOpSourceCastDataControlControlPointer)
              == null) {
            put(
                context,
                pkOpSourceCastDataControlControlPointer,
                objOpSourceCastDataControlControlPointer);
            ControlPointer spaOpSourceCastDataControlControlPointer =
                (ControlPointer)
                    mapperOpSourceCastDataControlControlPointer.deepCopyFromRepository2Persistence(
                        objOpSourceCastDataControlControlPointer, context);
            spa.getOpSourceCastDataControlControlPointer()
                .add(spaOpSourceCastDataControlControlPointer);
            spaOpSourceCastDataControlControlPointer.setSourceCastDataControl(spa);
          }
        }
      }
      Collection<OptionSelection> objOpOptionPointerOptionSelectionList =
          obj.getOpOptionPointerOptionSelection();
      if (objOpOptionPointerOptionSelectionList != null) {
        for (OptionSelection objOpOptionPointerOptionSelection :
            objOpOptionPointerOptionSelectionList) {
          CopyFrom mapperOpOptionPointerOptionSelection =
              findCopyFromByRepoObject(objOpOptionPointerOptionSelection);
          Object pkOpOptionPointerOptionSelection =
              mapperOpOptionPointerOptionSelection.getPrimaryKeyFromRepositoryObject(
                  objOpOptionPointerOptionSelection);
          if (get(context, pkOpOptionPointerOptionSelection, objOpOptionPointerOptionSelection)
              == null) {
            put(context, pkOpOptionPointerOptionSelection, objOpOptionPointerOptionSelection);
            OptionSelection spaOpOptionPointerOptionSelection =
                (OptionSelection)
                    mapperOpOptionPointerOptionSelection.deepCopyFromRepository2Persistence(
                        objOpOptionPointerOptionSelection, context);
            spa.getOpOptionPointerOptionSelection().add(spaOpOptionPointerOptionSelection);
            spaOpOptionPointerOptionSelection.setOptionPointer(spa);
          }
        }
      }
      Collection<OptionSelection> objOpOptionCastDataControlOptionSelectionList =
          obj.getOpOptionCastDataControlOptionSelection();
      if (objOpOptionCastDataControlOptionSelectionList != null) {
        for (OptionSelection objOpOptionCastDataControlOptionSelection :
            objOpOptionCastDataControlOptionSelectionList) {
          CopyFrom mapperOpOptionCastDataControlOptionSelection =
              findCopyFromByRepoObject(objOpOptionCastDataControlOptionSelection);
          Object pkOpOptionCastDataControlOptionSelection =
              mapperOpOptionCastDataControlOptionSelection.getPrimaryKeyFromRepositoryObject(
                  objOpOptionCastDataControlOptionSelection);
          if (get(
                  context,
                  pkOpOptionCastDataControlOptionSelection,
                  objOpOptionCastDataControlOptionSelection)
              == null) {
            put(
                context,
                pkOpOptionCastDataControlOptionSelection,
                objOpOptionCastDataControlOptionSelection);
            OptionSelection spaOpOptionCastDataControlOptionSelection =
                (OptionSelection)
                    mapperOpOptionCastDataControlOptionSelection.deepCopyFromRepository2Persistence(
                        objOpOptionCastDataControlOptionSelection, context);
            spa.getOpOptionCastDataControlOptionSelection()
                .add(spaOpOptionCastDataControlOptionSelection);
            spaOpOptionCastDataControlOptionSelection.setOptionCastDataControl(spa);
          }
        }
      }
      TypePointerObj objBaseType = obj.getBaseType();
      if (objBaseType != null) {
        CopyFrom mapperBaseType = findCopyFromByRepoObject(objBaseType);
        Object pkBaseType = mapperBaseType.getPrimaryKeyFromRepositoryObject(objBaseType);
        if (get(context, pkBaseType, objBaseType) == null) {
          put(context, pkBaseType, objBaseType);
          TypePointerObj spaBaseType =
              (TypePointerObj)
                  mapperBaseType.deepCopyFromRepository2Persistence(objBaseType, context);
          spa.setBaseType(spaBaseType);
          spaBaseType.setOpBaseTypeDataControl(spa);
        }
      }
      PREQueryTrigger objPreQueryTrigger = obj.getPreQueryTrigger();
      if (objPreQueryTrigger != null) {
        CopyFrom mapperPreQueryTrigger = findCopyFromByRepoObject(objPreQueryTrigger);
        Object pkPreQueryTrigger =
            mapperPreQueryTrigger.getPrimaryKeyFromRepositoryObject(objPreQueryTrigger);
        if (get(context, pkPreQueryTrigger, objPreQueryTrigger) == null) {
          put(context, pkPreQueryTrigger, objPreQueryTrigger);
          PREQueryTrigger spaPreQueryTrigger =
              (PREQueryTrigger)
                  mapperPreQueryTrigger.deepCopyFromRepository2Persistence(
                      objPreQueryTrigger, context);
          spa.setPreQueryTrigger(spaPreQueryTrigger);
          spaPreQueryTrigger.setOpPreQueryTriggerDataControl(spa);
        }
      }
      POSTQueryTrigger objPostQueryTrigger = obj.getPostQueryTrigger();
      if (objPostQueryTrigger != null) {
        CopyFrom mapperPostQueryTrigger = findCopyFromByRepoObject(objPostQueryTrigger);
        Object pkPostQueryTrigger =
            mapperPostQueryTrigger.getPrimaryKeyFromRepositoryObject(objPostQueryTrigger);
        if (get(context, pkPostQueryTrigger, objPostQueryTrigger) == null) {
          put(context, pkPostQueryTrigger, objPostQueryTrigger);
          POSTQueryTrigger spaPostQueryTrigger =
              (POSTQueryTrigger)
                  mapperPostQueryTrigger.deepCopyFromRepository2Persistence(
                      objPostQueryTrigger, context);
          spa.setPostQueryTrigger(spaPostQueryTrigger);
          spaPostQueryTrigger.setOpPostQueryTriggerDataControl(spa);
        }
      }
      PREInsertTrigger objPreInsertTrigger = obj.getPreInsertTrigger();
      if (objPreInsertTrigger != null) {
        CopyFrom mapperPreInsertTrigger = findCopyFromByRepoObject(objPreInsertTrigger);
        Object pkPreInsertTrigger =
            mapperPreInsertTrigger.getPrimaryKeyFromRepositoryObject(objPreInsertTrigger);
        if (get(context, pkPreInsertTrigger, objPreInsertTrigger) == null) {
          put(context, pkPreInsertTrigger, objPreInsertTrigger);
          PREInsertTrigger spaPreInsertTrigger =
              (PREInsertTrigger)
                  mapperPreInsertTrigger.deepCopyFromRepository2Persistence(
                      objPreInsertTrigger, context);
          spa.setPreInsertTrigger(spaPreInsertTrigger);
          spaPreInsertTrigger.setOpPreInsertTriggerDataControl(spa);
        }
      }
      PREDeleteTrigger objPreDeleteTrigger = obj.getPreDeleteTrigger();
      if (objPreDeleteTrigger != null) {
        CopyFrom mapperPreDeleteTrigger = findCopyFromByRepoObject(objPreDeleteTrigger);
        Object pkPreDeleteTrigger =
            mapperPreDeleteTrigger.getPrimaryKeyFromRepositoryObject(objPreDeleteTrigger);
        if (get(context, pkPreDeleteTrigger, objPreDeleteTrigger) == null) {
          put(context, pkPreDeleteTrigger, objPreDeleteTrigger);
          PREDeleteTrigger spaPreDeleteTrigger =
              (PREDeleteTrigger)
                  mapperPreDeleteTrigger.deepCopyFromRepository2Persistence(
                      objPreDeleteTrigger, context);
          spa.setPreDeleteTrigger(spaPreDeleteTrigger);
          spaPreDeleteTrigger.setOpPreDeleteTriggerDataControl(spa);
        }
      }
      POSTCreateTrigger objPostCreateTrigger = obj.getPostCreateTrigger();
      if (objPostCreateTrigger != null) {
        CopyFrom mapperPostCreateTrigger = findCopyFromByRepoObject(objPostCreateTrigger);
        Object pkPostCreateTrigger =
            mapperPostCreateTrigger.getPrimaryKeyFromRepositoryObject(objPostCreateTrigger);
        if (get(context, pkPostCreateTrigger, objPostCreateTrigger) == null) {
          put(context, pkPostCreateTrigger, objPostCreateTrigger);
          POSTCreateTrigger spaPostCreateTrigger =
              (POSTCreateTrigger)
                  mapperPostCreateTrigger.deepCopyFromRepository2Persistence(
                      objPostCreateTrigger, context);
          spa.setPostCreateTrigger(spaPostCreateTrigger);
          spaPostCreateTrigger.setOpPostCreateTriggerDataControl(spa);
        }
      }
      PREUpdateTrigger objPreUpdateTrigger = obj.getPreUpdateTrigger();
      if (objPreUpdateTrigger != null) {
        CopyFrom mapperPreUpdateTrigger = findCopyFromByRepoObject(objPreUpdateTrigger);
        Object pkPreUpdateTrigger =
            mapperPreUpdateTrigger.getPrimaryKeyFromRepositoryObject(objPreUpdateTrigger);
        if (get(context, pkPreUpdateTrigger, objPreUpdateTrigger) == null) {
          put(context, pkPreUpdateTrigger, objPreUpdateTrigger);
          PREUpdateTrigger spaPreUpdateTrigger =
              (PREUpdateTrigger)
                  mapperPreUpdateTrigger.deepCopyFromRepository2Persistence(
                      objPreUpdateTrigger, context);
          spa.setPreUpdateTrigger(spaPreUpdateTrigger);
          spaPreUpdateTrigger.setOpPreUpdateTriggerDataControl(spa);
        }
      }
      CreateTrigger objCreate = obj.getCreate();
      if (objCreate != null) {
        CopyFrom mapperCreate = findCopyFromByRepoObject(objCreate);
        Object pkCreate = mapperCreate.getPrimaryKeyFromRepositoryObject(objCreate);
        if (get(context, pkCreate, objCreate) == null) {
          put(context, pkCreate, objCreate);
          CreateTrigger spaCreate =
              (CreateTrigger) mapperCreate.deepCopyFromRepository2Persistence(objCreate, context);
          spa.setCreate(spaCreate);
          spaCreate.setOpCreateDataControl(spa);
        }
      }
      SearchTrigger objSearch = obj.getSearch();
      if (objSearch != null) {
        CopyFrom mapperSearch = findCopyFromByRepoObject(objSearch);
        Object pkSearch = mapperSearch.getPrimaryKeyFromRepositoryObject(objSearch);
        if (get(context, pkSearch, objSearch) == null) {
          put(context, pkSearch, objSearch);
          SearchTrigger spaSearch =
              (SearchTrigger) mapperSearch.deepCopyFromRepository2Persistence(objSearch, context);
          spa.setSearch(spaSearch);
          spaSearch.setOpSearchDataControl(spa);
        }
      }
      Collection<ArtificialField> objArtificialFieldsList = obj.getArtificialFields();
      if (objArtificialFieldsList != null) {
        for (ArtificialField objArtificialFields : objArtificialFieldsList) {
          CopyFrom mapperArtificialFields = findCopyFromByRepoObject(objArtificialFields);
          Object pkArtificialFields =
              mapperArtificialFields.getPrimaryKeyFromRepositoryObject(objArtificialFields);
          if (get(context, pkArtificialFields, objArtificialFields) == null) {
            put(context, pkArtificialFields, objArtificialFields);
            ArtificialField spaArtificialFields =
                (ArtificialField)
                    mapperArtificialFields.deepCopyFromRepository2Persistence(
                        objArtificialFields, context);
            spa.getArtificialFields().add(spaArtificialFields);
            spaArtificialFields.setOpArtificialFieldsDataControl(spa);
          }
        }
      }
      ContextParametersObj objDefaultSearch = obj.getDefaultSearch();
      if (objDefaultSearch != null) {
        CopyFrom mapperDefaultSearch = findCopyFromByRepoObject(objDefaultSearch);
        Object pkDefaultSearch =
            mapperDefaultSearch.getPrimaryKeyFromRepositoryObject(objDefaultSearch);
        if (get(context, pkDefaultSearch, objDefaultSearch) == null) {
          put(context, pkDefaultSearch, objDefaultSearch);
          ContextParametersObj spaDefaultSearch =
              (ContextParametersObj)
                  mapperDefaultSearch.deepCopyFromRepository2Persistence(objDefaultSearch, context);
          spa.setDefaultSearch(spaDefaultSearch);
          spaDefaultSearch.setOpDefaultSearchDataControl(spa);
        }
      }
      Orders objDefaultOrderBy = obj.getDefaultOrderBy();
      if (objDefaultOrderBy != null) {
        CopyFrom mapperDefaultOrderBy = findCopyFromByRepoObject(objDefaultOrderBy);
        Object pkDefaultOrderBy =
            mapperDefaultOrderBy.getPrimaryKeyFromRepositoryObject(objDefaultOrderBy);
        if (get(context, pkDefaultOrderBy, objDefaultOrderBy) == null) {
          put(context, pkDefaultOrderBy, objDefaultOrderBy);
          Orders spaDefaultOrderBy =
              (Orders)
                  mapperDefaultOrderBy.deepCopyFromRepository2Persistence(
                      objDefaultOrderBy, context);
          spa.setDefaultOrderBy(spaDefaultOrderBy);
          spaDefaultOrderBy.setOpDefaultOrderByDataControl(spa);
        }
      }
      Collection<RelationMapper> objRelationMappersList = obj.getRelationMappers();
      if (objRelationMappersList != null) {
        for (RelationMapper objRelationMappers : objRelationMappersList) {
          CopyFrom mapperRelationMappers = findCopyFromByRepoObject(objRelationMappers);
          Object pkRelationMappers =
              mapperRelationMappers.getPrimaryKeyFromRepositoryObject(objRelationMappers);
          if (get(context, pkRelationMappers, objRelationMappers) == null) {
            put(context, pkRelationMappers, objRelationMappers);
            RelationMapper spaRelationMappers =
                (RelationMapper)
                    mapperRelationMappers.deepCopyFromRepository2Persistence(
                        objRelationMappers, context);
            spa.getRelationMappers().add(spaRelationMappers);
            spaRelationMappers.setOpRelationMappersDataControl(spa);
          }
        }
      }
      Collection<RelationMapper> objOpDataControlRefRelationMapperList =
          obj.getOpDataControlRefRelationMapper();
      if (objOpDataControlRefRelationMapperList != null) {
        for (RelationMapper objOpDataControlRefRelationMapper :
            objOpDataControlRefRelationMapperList) {
          CopyFrom mapperOpDataControlRefRelationMapper =
              findCopyFromByRepoObject(objOpDataControlRefRelationMapper);
          Object pkOpDataControlRefRelationMapper =
              mapperOpDataControlRefRelationMapper.getPrimaryKeyFromRepositoryObject(
                  objOpDataControlRefRelationMapper);
          if (get(context, pkOpDataControlRefRelationMapper, objOpDataControlRefRelationMapper)
              == null) {
            put(context, pkOpDataControlRefRelationMapper, objOpDataControlRefRelationMapper);
            RelationMapper spaOpDataControlRefRelationMapper =
                (RelationMapper)
                    mapperOpDataControlRefRelationMapper.deepCopyFromRepository2Persistence(
                        objOpDataControlRefRelationMapper, context);
            spa.getOpDataControlRefRelationMapper().add(spaOpDataControlRefRelationMapper);
            spaOpDataControlRefRelationMapper.setDataControlRef(spa);
          }
        }
      }
      Collection<Relation> objOpMasterRelationList = obj.getOpMasterRelation();
      if (objOpMasterRelationList != null) {
        for (Relation objOpMasterRelation : objOpMasterRelationList) {
          CopyFrom mapperOpMasterRelation = findCopyFromByRepoObject(objOpMasterRelation);
          Object pkOpMasterRelation =
              mapperOpMasterRelation.getPrimaryKeyFromRepositoryObject(objOpMasterRelation);
          if (get(context, pkOpMasterRelation, objOpMasterRelation) == null) {
            put(context, pkOpMasterRelation, objOpMasterRelation);
            Relation spaOpMasterRelation =
                (Relation)
                    mapperOpMasterRelation.deepCopyFromRepository2Persistence(
                        objOpMasterRelation, context);
            spa.getOpMasterRelation().add(spaOpMasterRelation);
            spaOpMasterRelation.setMaster(spa);
          }
        }
      }
      Collection<Relation> objOpDetailRelationList = obj.getOpDetailRelation();
      if (objOpDetailRelationList != null) {
        for (Relation objOpDetailRelation : objOpDetailRelationList) {
          CopyFrom mapperOpDetailRelation = findCopyFromByRepoObject(objOpDetailRelation);
          Object pkOpDetailRelation =
              mapperOpDetailRelation.getPrimaryKeyFromRepositoryObject(objOpDetailRelation);
          if (get(context, pkOpDetailRelation, objOpDetailRelation) == null) {
            put(context, pkOpDetailRelation, objOpDetailRelation);
            Relation spaOpDetailRelation =
                (Relation)
                    mapperOpDetailRelation.deepCopyFromRepository2Persistence(
                        objOpDetailRelation, context);
            spa.getOpDetailRelation().add(spaOpDetailRelation);
            spaOpDetailRelation.setDetail(spa);
          }
        }
      }
      Collection<Dependency> objOpMasterDependencyList = obj.getOpMasterDependency();
      if (objOpMasterDependencyList != null) {
        for (Dependency objOpMasterDependency : objOpMasterDependencyList) {
          CopyFrom mapperOpMasterDependency = findCopyFromByRepoObject(objOpMasterDependency);
          Object pkOpMasterDependency =
              mapperOpMasterDependency.getPrimaryKeyFromRepositoryObject(objOpMasterDependency);
          if (get(context, pkOpMasterDependency, objOpMasterDependency) == null) {
            put(context, pkOpMasterDependency, objOpMasterDependency);
            Dependency spaOpMasterDependency =
                (Dependency)
                    mapperOpMasterDependency.deepCopyFromRepository2Persistence(
                        objOpMasterDependency, context);
            spa.getOpMasterDependency().add(spaOpMasterDependency);
            spaOpMasterDependency.setMaster(spa);
          }
        }
      }
      Collection<Dependency> objOpDetailDependencyList = obj.getOpDetailDependency();
      if (objOpDetailDependencyList != null) {
        for (Dependency objOpDetailDependency : objOpDetailDependencyList) {
          CopyFrom mapperOpDetailDependency = findCopyFromByRepoObject(objOpDetailDependency);
          Object pkOpDetailDependency =
              mapperOpDetailDependency.getPrimaryKeyFromRepositoryObject(objOpDetailDependency);
          if (get(context, pkOpDetailDependency, objOpDetailDependency) == null) {
            put(context, pkOpDetailDependency, objOpDetailDependency);
            Dependency spaOpDetailDependency =
                (Dependency)
                    mapperOpDetailDependency.deepCopyFromRepository2Persistence(
                        objOpDetailDependency, context);
            spa.getOpDetailDependency().add(spaOpDetailDependency);
            spaOpDetailDependency.setDetail(spa);
          }
        }
      }
      Controls objOpControlsControls = obj.getOpControlsControls();
      if (objOpControlsControls != null) {
        CopyFrom mapperOpControlsControls = findCopyFromByRepoObject(objOpControlsControls);
        Object pkOpControlsControls =
            mapperOpControlsControls.getPrimaryKeyFromRepositoryObject(objOpControlsControls);
        if (get(context, pkOpControlsControls, objOpControlsControls) == null) {
          put(context, pkOpControlsControls, objOpControlsControls);
          Controls spaOpControlsControls =
              (Controls)
                  mapperOpControlsControls.deepCopyFromRepository2Persistence(
                      objOpControlsControls, context);
          spa.setOpControlsControls(spaOpControlsControls);
          spaOpControlsControls.getControls().add(spa);
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
      Collection<AttributeConnector> objOpSourceAttributeConnectorList =
          obj.getOpSourceAttributeConnector();
      if (objOpSourceAttributeConnectorList != null) {
        for (AttributeConnector objOpSourceAttributeConnector : objOpSourceAttributeConnectorList) {
          CopyFrom mapperOpSourceAttributeConnector =
              findCopyFromByRepoObject(objOpSourceAttributeConnector);
          Object pkOpSourceAttributeConnector =
              mapperOpSourceAttributeConnector.getPrimaryKeyFromRepositoryObject(
                  objOpSourceAttributeConnector);
          if (get(context, pkOpSourceAttributeConnector, objOpSourceAttributeConnector) == null) {
            put(context, pkOpSourceAttributeConnector, objOpSourceAttributeConnector);
            AttributeConnector spaOpSourceAttributeConnector =
                (AttributeConnector)
                    mapperOpSourceAttributeConnector.deepCopyFromRepository2Persistence(
                        objOpSourceAttributeConnector, context);
            spa.getOpSourceAttributeConnector().add(spaOpSourceAttributeConnector);
            spaOpSourceAttributeConnector.setSource(spa);
          }
        }
      }
      Collection<AttributeConnector> objOpTargetAttributeConnectorList =
          obj.getOpTargetAttributeConnector();
      if (objOpTargetAttributeConnectorList != null) {
        for (AttributeConnector objOpTargetAttributeConnector : objOpTargetAttributeConnectorList) {
          CopyFrom mapperOpTargetAttributeConnector =
              findCopyFromByRepoObject(objOpTargetAttributeConnector);
          Object pkOpTargetAttributeConnector =
              mapperOpTargetAttributeConnector.getPrimaryKeyFromRepositoryObject(
                  objOpTargetAttributeConnector);
          if (get(context, pkOpTargetAttributeConnector, objOpTargetAttributeConnector) == null) {
            put(context, pkOpTargetAttributeConnector, objOpTargetAttributeConnector);
            AttributeConnector spaOpTargetAttributeConnector =
                (AttributeConnector)
                    mapperOpTargetAttributeConnector.deepCopyFromRepository2Persistence(
                        objOpTargetAttributeConnector, context);
            spa.getOpTargetAttributeConnector().add(spaOpTargetAttributeConnector);
            spaOpTargetAttributeConnector.setTarget(spa);
          }
        }
      }
      Collection<ContextParameter> objOpRefObjContextParameterList =
          obj.getOpRefObjContextParameter();
      if (objOpRefObjContextParameterList != null) {
        for (ContextParameter objOpRefObjContextParameter : objOpRefObjContextParameterList) {
          CopyFrom mapperOpRefObjContextParameter =
              findCopyFromByRepoObject(objOpRefObjContextParameter);
          Object pkOpRefObjContextParameter =
              mapperOpRefObjContextParameter.getPrimaryKeyFromRepositoryObject(
                  objOpRefObjContextParameter);
          if (get(context, pkOpRefObjContextParameter, objOpRefObjContextParameter) == null) {
            put(context, pkOpRefObjContextParameter, objOpRefObjContextParameter);
            ContextParameter spaOpRefObjContextParameter =
                (ContextParameter)
                    mapperOpRefObjContextParameter.deepCopyFromRepository2Persistence(
                        objOpRefObjContextParameter, context);
            spa.getOpRefObjContextParameter().add(spaOpRefObjContextParameter);
            spaOpRefObjContextParameter.setRefObj(spa);
          }
        }
      }
      Collection<ExpressionPart> objOpObjRefExpressionPartList = obj.getOpObjRefExpressionPart();
      if (objOpObjRefExpressionPartList != null) {
        for (ExpressionPart objOpObjRefExpressionPart : objOpObjRefExpressionPartList) {
          CopyFrom mapperOpObjRefExpressionPart =
              findCopyFromByRepoObject(objOpObjRefExpressionPart);
          Object pkOpObjRefExpressionPart =
              mapperOpObjRefExpressionPart.getPrimaryKeyFromRepositoryObject(
                  objOpObjRefExpressionPart);
          if (get(context, pkOpObjRefExpressionPart, objOpObjRefExpressionPart) == null) {
            put(context, pkOpObjRefExpressionPart, objOpObjRefExpressionPart);
            ExpressionPart spaOpObjRefExpressionPart =
                (ExpressionPart)
                    mapperOpObjRefExpressionPart.deepCopyFromRepository2Persistence(
                        objOpObjRefExpressionPart, context);
            spa.getOpObjRefExpressionPart().add(spaOpObjRefExpressionPart);
            spaOpObjRefExpressionPart.setObjRef(spa);
          }
        }
      }
      Collection<ControlPointer> objOpValuePointerControlPointerList =
          obj.getOpValuePointerControlPointer();
      if (objOpValuePointerControlPointerList != null) {
        for (ControlPointer objOpValuePointerControlPointer : objOpValuePointerControlPointerList) {
          CopyFrom mapperOpValuePointerControlPointer =
              findCopyFromByRepoObject(objOpValuePointerControlPointer);
          Object pkOpValuePointerControlPointer =
              mapperOpValuePointerControlPointer.getPrimaryKeyFromRepositoryObject(
                  objOpValuePointerControlPointer);
          if (get(context, pkOpValuePointerControlPointer, objOpValuePointerControlPointer)
              == null) {
            put(context, pkOpValuePointerControlPointer, objOpValuePointerControlPointer);
            ControlPointer spaOpValuePointerControlPointer =
                (ControlPointer)
                    mapperOpValuePointerControlPointer.deepCopyFromRepository2Persistence(
                        objOpValuePointerControlPointer, context);
            spa.getOpValuePointerControlPointer().add(spaOpValuePointerControlPointer);
            spaOpValuePointerControlPointer.setValuePointer(spa);
          }
        }
      }
      Collection<Selection> objOpDisplayOptionPointerSelectionList =
          obj.getOpDisplayOptionPointerSelection();
      if (objOpDisplayOptionPointerSelectionList != null) {
        for (Selection objOpDisplayOptionPointerSelection :
            objOpDisplayOptionPointerSelectionList) {
          CopyFrom mapperOpDisplayOptionPointerSelection =
              findCopyFromByRepoObject(objOpDisplayOptionPointerSelection);
          Object pkOpDisplayOptionPointerSelection =
              mapperOpDisplayOptionPointerSelection.getPrimaryKeyFromRepositoryObject(
                  objOpDisplayOptionPointerSelection);
          if (get(context, pkOpDisplayOptionPointerSelection, objOpDisplayOptionPointerSelection)
              == null) {
            put(context, pkOpDisplayOptionPointerSelection, objOpDisplayOptionPointerSelection);
            Selection spaOpDisplayOptionPointerSelection =
                (Selection)
                    mapperOpDisplayOptionPointerSelection.deepCopyFromRepository2Persistence(
                        objOpDisplayOptionPointerSelection, context);
            spa.getOpDisplayOptionPointerSelection().add(spaOpDisplayOptionPointerSelection);
            spaOpDisplayOptionPointerSelection.setDisplayOptionPointer(spa);
          }
        }
      }
      Collection<Selection> objOpValueOptionPointerSelectionList =
          obj.getOpValueOptionPointerSelection();
      if (objOpValueOptionPointerSelectionList != null) {
        for (Selection objOpValueOptionPointerSelection : objOpValueOptionPointerSelectionList) {
          CopyFrom mapperOpValueOptionPointerSelection =
              findCopyFromByRepoObject(objOpValueOptionPointerSelection);
          Object pkOpValueOptionPointerSelection =
              mapperOpValueOptionPointerSelection.getPrimaryKeyFromRepositoryObject(
                  objOpValueOptionPointerSelection);
          if (get(context, pkOpValueOptionPointerSelection, objOpValueOptionPointerSelection)
              == null) {
            put(context, pkOpValueOptionPointerSelection, objOpValueOptionPointerSelection);
            Selection spaOpValueOptionPointerSelection =
                (Selection)
                    mapperOpValueOptionPointerSelection.deepCopyFromRepository2Persistence(
                        objOpValueOptionPointerSelection, context);
            spa.getOpValueOptionPointerSelection().add(spaOpValueOptionPointerSelection);
            spaOpValueOptionPointerSelection.setValueOptionPointer(spa);
          }
        }
      }
      Collection<OrderBy> objOpRefObjOrderByList = obj.getOpRefObjOrderBy();
      if (objOpRefObjOrderByList != null) {
        for (OrderBy objOpRefObjOrderBy : objOpRefObjOrderByList) {
          CopyFrom mapperOpRefObjOrderBy = findCopyFromByRepoObject(objOpRefObjOrderBy);
          Object pkOpRefObjOrderBy =
              mapperOpRefObjOrderBy.getPrimaryKeyFromRepositoryObject(objOpRefObjOrderBy);
          if (get(context, pkOpRefObjOrderBy, objOpRefObjOrderBy) == null) {
            put(context, pkOpRefObjOrderBy, objOpRefObjOrderBy);
            OrderBy spaOpRefObjOrderBy =
                (OrderBy)
                    mapperOpRefObjOrderBy.deepCopyFromRepository2Persistence(
                        objOpRefObjOrderBy, context);
            spa.getOpRefObjOrderBy().add(spaOpRefObjOrderBy);
            spaOpRefObjOrderBy.setRefObj(spa);
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
