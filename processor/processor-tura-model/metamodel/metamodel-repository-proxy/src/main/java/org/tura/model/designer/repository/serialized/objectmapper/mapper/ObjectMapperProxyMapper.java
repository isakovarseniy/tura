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
import org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.model.designer.repository.serialized.type.TypePointerObj;
import org.tura.model.designer.repository.serialized.objectmapper.OmRelation;
import java.util.Collection;
import org.tura.model.designer.repository.serialized.objectmapper.CalculatedField;
import org.tura.model.designer.repository.serialized.objectmapper.Aggregation;
import org.tura.model.designer.repository.serialized.type.AttributePointer;
import org.tura.model.designer.repository.serialized.objectmapper.OperationConnector;
import org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup;
import org.tura.model.designer.repository.serialized.objectmapper.ProcessingStage;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.serialized.form.ContextParameter;
import org.tura.model.designer.repository.serialized.form.ExpressionPart;
import org.tura.model.designer.repository.serialized.form.ControlPointer;
import org.tura.model.designer.repository.serialized.form.Selection;
import org.tura.model.designer.repository.serialized.form.OrderBy;
import java.util.List;
import java.util.ArrayList;

public class ObjectMapperProxyMapper extends CpaMapperHelper
    implements CpaMapper, CopyFrom, PersistanceMapper, AdapterLoaderAware {

  private static final long serialVersionUID = 1L;

  private AdapterLoader loader;

  private ProxyFactory proxyFactory;

  public ObjectMapperProxyMapper() {}

  public ObjectMapperProxyMapper(org.tura.platform.repository.core.Registry registry) {
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
    ObjectMapper obj = (ObjectMapper) repositoryObject;
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
    ObjectMapper obj = (ObjectMapper) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public RepoObjectKey getCpaPrimaryKey(
      org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper spa)
      throws RepositoryException {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), spa.getCpaid());
    key.addValue(value);
    return key;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    ObjectMapper obj = (ObjectMapper) object;
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
    ObjectMapper spa = (ObjectMapper) persistenceObject;
    String pk = spa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {}

  public String getCpaId(Object persistenceObject) {
    ObjectMapper spa = (ObjectMapper) persistenceObject;
    return spa.getCpaid();
  }

  public Boolean getAttached(Object persistenceObject) {
    ObjectMapper spa = (ObjectMapper) persistenceObject;
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
    ObjectMapper obj = (ObjectMapper) repositoryObject;
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
    ObjectMapper spa = (ObjectMapper) persistenceObject;
    RepoKeyPath mypath = topCpaPath.clone();
    mypath.addRepoObjectKey(relation, getCpaPrimaryKey(spa));
    keyMap.put(spa.getCpaid(), mypath);
    register.add(spa.getCpaid());
  }

  public void collectCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    ObjectMapper spa = (ObjectMapper) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    keyMap.put(pk, spa.getCpaid());
  }

  public void replaceCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    ObjectMapper spa = (ObjectMapper) persistenceObject;
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
    ObjectMapper jpa = (ObjectMapper) persistenceObject;
    ObjectMapper obj = (ObjectMapper) repositoryObject;
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
    ObjectMapper spa = (ObjectMapper) persistenceObject;
    ObjectMapper obj = (ObjectMapper) repositoryObject;
    if (spa != null) {
      StringBuffer key = new StringBuffer();
      key.append(spa.getUid());
      key.append("org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper");
      obj.setAttached(true);
      obj.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class
                  .getName());
      obj.setUid(spa.getUid());
      obj.setName(spa.getName());
      obj.setSuidCategorized(spa.getSuidCategorized());
      obj.setSuidMetaObject(spa.getSuidMetaObject());
      obj.setTransientrefObjectMappersObjectMapperGroup(
          spa.getTransientrefObjectMappersObjectMapperGroup());
      obj.setTransientrefOpStageObjectMapperProcessingStage(
          spa.getTransientrefOpStageObjectMapperProcessingStage());
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
    ObjectMapper obj = (ObjectMapper) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (ObjectMapper) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      ObjectMapper spa = (ObjectMapper) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class
                  .getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setSuidMetaObject(obj.getSuidMetaObject());
      spa.setTransientrefObjectMappersObjectMapperGroup(
          obj.getTransientrefObjectMappersObjectMapperGroup());
      spa.setTransientrefOpStageObjectMapperProcessingStage(
          obj.getTransientrefOpStageObjectMapperProcessingStage());
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
    ObjectMapper obj = (ObjectMapper) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (ObjectMapper) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      ObjectMapper spa = (ObjectMapper) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class
                  .getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setSuidMetaObject(obj.getSuidMetaObject());
      spa.setTransientrefObjectMappersObjectMapperGroup(
          obj.getTransientrefObjectMappersObjectMapperGroup());
      spa.setTransientrefOpStageObjectMapperProcessingStage(
          obj.getTransientrefOpStageObjectMapperProcessingStage());
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
          spaBaseType.setOpBaseTypeObjectMapper(spa);
        }
      }
      Collection<OmRelation> objRelationsList = obj.getRelations();
      if (objRelationsList != null) {
        for (OmRelation objRelations : objRelationsList) {
          CopyFrom mapperRelations = findCopyFromByRepoObject(objRelations);
          Object pkRelations = mapperRelations.getPrimaryKeyFromRepositoryObject(objRelations);
          if (get(context, pkRelations, objRelations) == null) {
            put(context, pkRelations, objRelations);
            OmRelation spaRelations =
                (OmRelation)
                    mapperRelations.deepCopyFromRepository2Persistence(objRelations, context);
            spa.getRelations().add(spaRelations);
            spaRelations.setOpRelationsObjectMapper(spa);
          }
        }
      }
      Collection<CalculatedField> objCalculationsList = obj.getCalculations();
      if (objCalculationsList != null) {
        for (CalculatedField objCalculations : objCalculationsList) {
          CopyFrom mapperCalculations = findCopyFromByRepoObject(objCalculations);
          Object pkCalculations =
              mapperCalculations.getPrimaryKeyFromRepositoryObject(objCalculations);
          if (get(context, pkCalculations, objCalculations) == null) {
            put(context, pkCalculations, objCalculations);
            CalculatedField spaCalculations =
                (CalculatedField)
                    mapperCalculations.deepCopyFromRepository2Persistence(objCalculations, context);
            spa.getCalculations().add(spaCalculations);
            spaCalculations.setOpCalculationsObjectMapper(spa);
          }
        }
      }
      Collection<Aggregation> objAggrigationsList = obj.getAggrigations();
      if (objAggrigationsList != null) {
        for (Aggregation objAggrigations : objAggrigationsList) {
          CopyFrom mapperAggrigations = findCopyFromByRepoObject(objAggrigations);
          Object pkAggrigations =
              mapperAggrigations.getPrimaryKeyFromRepositoryObject(objAggrigations);
          if (get(context, pkAggrigations, objAggrigations) == null) {
            put(context, pkAggrigations, objAggrigations);
            Aggregation spaAggrigations =
                (Aggregation)
                    mapperAggrigations.deepCopyFromRepository2Persistence(objAggrigations, context);
            spa.getAggrigations().add(spaAggrigations);
            spaAggrigations.setOpAggrigationsObjectMapper(spa);
          }
        }
      }
      Collection<AttributePointer> objAttributesList = obj.getAttributes();
      if (objAttributesList != null) {
        for (AttributePointer objAttributes : objAttributesList) {
          CopyFrom mapperAttributes = findCopyFromByRepoObject(objAttributes);
          Object pkAttributes = mapperAttributes.getPrimaryKeyFromRepositoryObject(objAttributes);
          if (get(context, pkAttributes, objAttributes) == null) {
            put(context, pkAttributes, objAttributes);
            AttributePointer spaAttributes =
                (AttributePointer)
                    mapperAttributes.deepCopyFromRepository2Persistence(objAttributes, context);
            spa.getAttributes().add(spaAttributes);
            spaAttributes.setOpAttributesObjectMapper(spa);
          }
        }
      }
      Collection<OmRelation> objOpObjectMapperRefOmRelationList =
          obj.getOpObjectMapperRefOmRelation();
      if (objOpObjectMapperRefOmRelationList != null) {
        for (OmRelation objOpObjectMapperRefOmRelation : objOpObjectMapperRefOmRelationList) {
          CopyFrom mapperOpObjectMapperRefOmRelation =
              findCopyFromByRepoObject(objOpObjectMapperRefOmRelation);
          Object pkOpObjectMapperRefOmRelation =
              mapperOpObjectMapperRefOmRelation.getPrimaryKeyFromRepositoryObject(
                  objOpObjectMapperRefOmRelation);
          if (get(context, pkOpObjectMapperRefOmRelation, objOpObjectMapperRefOmRelation) == null) {
            put(context, pkOpObjectMapperRefOmRelation, objOpObjectMapperRefOmRelation);
            OmRelation spaOpObjectMapperRefOmRelation =
                (OmRelation)
                    mapperOpObjectMapperRefOmRelation.deepCopyFromRepository2Persistence(
                        objOpObjectMapperRefOmRelation, context);
            spa.getOpObjectMapperRefOmRelation().add(spaOpObjectMapperRefOmRelation);
            spaOpObjectMapperRefOmRelation.setObjectMapperRef(spa);
          }
        }
      }
      Collection<OperationConnector> objOpSourceOperationConnectorList =
          obj.getOpSourceOperationConnector();
      if (objOpSourceOperationConnectorList != null) {
        for (OperationConnector objOpSourceOperationConnector : objOpSourceOperationConnectorList) {
          CopyFrom mapperOpSourceOperationConnector =
              findCopyFromByRepoObject(objOpSourceOperationConnector);
          Object pkOpSourceOperationConnector =
              mapperOpSourceOperationConnector.getPrimaryKeyFromRepositoryObject(
                  objOpSourceOperationConnector);
          if (get(context, pkOpSourceOperationConnector, objOpSourceOperationConnector) == null) {
            put(context, pkOpSourceOperationConnector, objOpSourceOperationConnector);
            OperationConnector spaOpSourceOperationConnector =
                (OperationConnector)
                    mapperOpSourceOperationConnector.deepCopyFromRepository2Persistence(
                        objOpSourceOperationConnector, context);
            spa.getOpSourceOperationConnector().add(spaOpSourceOperationConnector);
            spaOpSourceOperationConnector.setSource(spa);
          }
        }
      }
      Collection<OperationConnector> objOpTargetOperationConnectorList =
          obj.getOpTargetOperationConnector();
      if (objOpTargetOperationConnectorList != null) {
        for (OperationConnector objOpTargetOperationConnector : objOpTargetOperationConnectorList) {
          CopyFrom mapperOpTargetOperationConnector =
              findCopyFromByRepoObject(objOpTargetOperationConnector);
          Object pkOpTargetOperationConnector =
              mapperOpTargetOperationConnector.getPrimaryKeyFromRepositoryObject(
                  objOpTargetOperationConnector);
          if (get(context, pkOpTargetOperationConnector, objOpTargetOperationConnector) == null) {
            put(context, pkOpTargetOperationConnector, objOpTargetOperationConnector);
            OperationConnector spaOpTargetOperationConnector =
                (OperationConnector)
                    mapperOpTargetOperationConnector.deepCopyFromRepository2Persistence(
                        objOpTargetOperationConnector, context);
            spa.getOpTargetOperationConnector().add(spaOpTargetOperationConnector);
            spaOpTargetOperationConnector.setTarget(spa);
          }
        }
      }
      ObjectMapperGroup objOpObjectMappersObjectMapperGroup =
          obj.getOpObjectMappersObjectMapperGroup();
      if (objOpObjectMappersObjectMapperGroup != null) {
        CopyFrom mapperOpObjectMappersObjectMapperGroup =
            findCopyFromByRepoObject(objOpObjectMappersObjectMapperGroup);
        Object pkOpObjectMappersObjectMapperGroup =
            mapperOpObjectMappersObjectMapperGroup.getPrimaryKeyFromRepositoryObject(
                objOpObjectMappersObjectMapperGroup);
        if (get(context, pkOpObjectMappersObjectMapperGroup, objOpObjectMappersObjectMapperGroup)
            == null) {
          put(context, pkOpObjectMappersObjectMapperGroup, objOpObjectMappersObjectMapperGroup);
          ObjectMapperGroup spaOpObjectMappersObjectMapperGroup =
              (ObjectMapperGroup)
                  mapperOpObjectMappersObjectMapperGroup.deepCopyFromRepository2Persistence(
                      objOpObjectMappersObjectMapperGroup, context);
          spa.setOpObjectMappersObjectMapperGroup(spaOpObjectMappersObjectMapperGroup);
          spaOpObjectMappersObjectMapperGroup.getObjectMappers().add(spa);
        }
      }
      ProcessingStage objStage = obj.getStage();
      if (objStage != null) {
        CopyFrom mapperStage = findCopyFromByRepoObject(objStage);
        Object pkStage = mapperStage.getPrimaryKeyFromRepositoryObject(objStage);
        if (get(context, pkStage, objStage) == null) {
          put(context, pkStage, objStage);
          ProcessingStage spaStage =
              (ProcessingStage) mapperStage.deepCopyFromRepository2Persistence(objStage, context);
          spa.setStage(spaStage);
          spaStage.getOpStageObjectMapper().add(spa);
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
