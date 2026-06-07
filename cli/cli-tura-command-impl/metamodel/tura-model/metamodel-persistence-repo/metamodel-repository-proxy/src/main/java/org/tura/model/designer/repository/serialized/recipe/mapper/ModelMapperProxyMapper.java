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

package org.tura.model.designer.repository.serialized.recipe.mapper;

import org.tura.platform.repository.cpa.CpaMapperHelper;
import org.tura.platform.repository.cpa.storage.CpaMapper;
import org.tura.platform.repository.core.CopyFrom;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.core.AdapterLoaderAware;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.model.designer.repository.serialized.recipe.DeploymentComponent;
import java.util.Collection;
import org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy;
import org.tura.model.designer.repository.serialized.recipe.Query;
import org.tura.model.designer.repository.serialized.recipe.Component;
import org.tura.model.designer.repository.serialized.artifact.Artifact;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.serialized.form.ContextParameter;
import org.tura.model.designer.repository.serialized.form.ExpressionPart;
import org.tura.model.designer.repository.serialized.form.ControlPointer;
import org.tura.model.designer.repository.serialized.form.Selection;
import org.tura.model.designer.repository.serialized.form.OrderBy;
import java.util.List;
import java.util.ArrayList;

public class ModelMapperProxyMapper extends CpaMapperHelper
    implements CpaMapper, CopyFrom, PersistanceMapper, AdapterLoaderAware {

  private static final long serialVersionUID = 1L;

  private AdapterLoader loader;

  private ProxyFactory proxyFactory;

  public ModelMapperProxyMapper() {}

  public ModelMapperProxyMapper(org.tura.platform.repository.core.Registry registry) {
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
    ModelMapper obj = (ModelMapper) repositoryObject;
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
    ModelMapper obj = (ModelMapper) object;
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.recipe.ModelMapper");
    if (obj.getUid() == null) {
      throw new Exception("Object primary key uid  is null");
    } else {
      FieldValue value = new FieldValue("Uid", "java.lang.String", obj.getUid().toString());
      key.addValue(value);
    }
    return key;
  }

  public RepoObjectKey getCpaPrimaryKey(
      org.tura.model.designer.repository.serialized.recipe.ModelMapper spa)
      throws RepositoryException {
    RepoObjectKey key = new RepoObjectKey();
    key.setType("org.tura.model.designer.repository.serialized.recipe.ModelMapper");
    FieldValue value = new FieldValue("cpaid", String.class.getName(), spa.getCpaid());
    key.addValue(value);
    return key;
  }

  public RepoKeyPath getPath(Object object) throws Exception {
    ModelMapper obj = (ModelMapper) object;
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
    ModelMapper spa = (ModelMapper) persistenceObject;
    String pk = spa.getUid();
    return pk;
  }

  public void nillPrimaryKey(Object persistenceObject) {}

  public String getCpaId(Object persistenceObject) {
    ModelMapper spa = (ModelMapper) persistenceObject;
    return spa.getCpaid();
  }

  public Boolean getAttached(Object persistenceObject) {
    ModelMapper spa = (ModelMapper) persistenceObject;
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
    ModelMapper obj = (ModelMapper) repositoryObject;
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
    ModelMapper spa = (ModelMapper) persistenceObject;
    RepoKeyPath mypath = topCpaPath.clone();
    mypath.addRepoObjectKey(relation, getCpaPrimaryKey(spa));
    keyMap.put(spa.getCpaid(), mypath);
    register.add(spa.getCpaid());
  }

  public void collectCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    ModelMapper spa = (ModelMapper) persistenceObject;
    Object pk = this.getPrimaryKey(spa);
    keyMap.put(pk, spa.getCpaid());
  }

  public void replaceCpaIds(Object persistenceObject, Map<Object, String> keyMap)
      throws RepositoryException {
    ModelMapper spa = (ModelMapper) persistenceObject;
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
    ModelMapper jpa = (ModelMapper) persistenceObject;
    ModelMapper obj = (ModelMapper) repositoryObject;
    if (obj instanceof ObjectControl) {
      ((ObjectControl) obj).setForcePKupdate(true);
    }
    obj.setUid(jpa.getUid());
    obj.setSuidArtifactRef(jpa.getSuidArtifactRef());
    obj.setSuidOrderable(jpa.getSuidOrderable());
    obj.setSuidCategorized(jpa.getSuidCategorized());
    obj.setSuidMetaObject(jpa.getSuidMetaObject());
  }

  public Object copyFromPersistence2Repository(
      Object persistenceObject, Object repositoryObject, java.util.Map<Object, Object> context)
      throws RepositoryException {
    ModelMapper spa = (ModelMapper) persistenceObject;
    ModelMapper obj = (ModelMapper) repositoryObject;
    if (spa != null) {
      StringBuffer key = new StringBuffer();
      key.append(spa.getUid());
      key.append("org.tura.model.designer.repository.serialized.recipe.ModelMapper");
      obj.setAttached(true);
      obj.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.recipe.ModelMapper.class.getName());
      obj.setUid(spa.getUid());
      obj.setName(spa.getName());
      obj.setArtifactRoot(spa.getArtifactRoot());
      obj.setSkip(spa.getSkip());
      obj.setArtifactExtension(spa.getArtifactExtension());
      obj.setConfigBranch(spa.getConfigBranch());
      obj.setSuidArtifactRef(spa.getSuidArtifactRef());
      obj.setOrder(spa.getOrder());
      obj.setSuidOrderable(spa.getSuidOrderable());
      obj.setSuidCategorized(spa.getSuidCategorized());
      obj.setSuidMetaObject(spa.getSuidMetaObject());
      obj.setTransientrefMappersComponent(spa.getTransientrefMappersComponent());
      obj.setTransientrefOpArtifactRefArtifactRefArtifact(
          spa.getTransientrefOpArtifactRefArtifactRefArtifact());
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
    ModelMapper obj = (ModelMapper) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (ModelMapper) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      ModelMapper spa = (ModelMapper) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.recipe.ModelMapper.class.getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setArtifactRoot(obj.getArtifactRoot());
      spa.setSkip(obj.getSkip());
      spa.setArtifactExtension(obj.getArtifactExtension());
      spa.setConfigBranch(obj.getConfigBranch());
      spa.setSuidArtifactRef(obj.getSuidArtifactRef());
      spa.setOrder(obj.getOrder());
      spa.setSuidOrderable(obj.getSuidOrderable());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setSuidMetaObject(obj.getSuidMetaObject());
      spa.setTransientrefMappersComponent(obj.getTransientrefMappersComponent());
      spa.setTransientrefOpArtifactRefArtifactRefArtifact(
          obj.getTransientrefOpArtifactRefArtifactRefArtifact());
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
    ModelMapper obj = (ModelMapper) repositoryObject;
    if (obj instanceof ObjectControl) {
      obj = (ModelMapper) ((ObjectControl) obj).inMemory();
    }
    if (obj != null) {
      ModelMapper spa = (ModelMapper) newPersistenceObject(obj);
      String cpaid = obj.getCpaid();
      if (cpaid == null) {
        cpaid = java.util.UUID.randomUUID().toString();
      }
      spa.setCpaid(cpaid);
      spa.setAttached(obj.getAttached());
      spa.setSerializationid(
          java.util.UUID.randomUUID().toString()
              + "||"
              + org.tura.model.designer.repository.serialized.recipe.ModelMapper.class.getName());
      spa.setUid(obj.getUid());
      spa.setName(obj.getName());
      spa.setArtifactRoot(obj.getArtifactRoot());
      spa.setSkip(obj.getSkip());
      spa.setArtifactExtension(obj.getArtifactExtension());
      spa.setConfigBranch(obj.getConfigBranch());
      spa.setSuidArtifactRef(obj.getSuidArtifactRef());
      spa.setOrder(obj.getOrder());
      spa.setSuidOrderable(obj.getSuidOrderable());
      spa.setSuidCategorized(obj.getSuidCategorized());
      spa.setSuidMetaObject(obj.getSuidMetaObject());
      spa.setTransientrefMappersComponent(obj.getTransientrefMappersComponent());
      spa.setTransientrefOpArtifactRefArtifactRefArtifact(
          obj.getTransientrefOpArtifactRefArtifactRefArtifact());
      Collection<DeploymentComponent> objOpMapperDeploymentComponentList =
          obj.getOpMapperDeploymentComponent();
      if (objOpMapperDeploymentComponentList != null) {
        for (DeploymentComponent objOpMapperDeploymentComponent :
            objOpMapperDeploymentComponentList) {
          CopyFrom mapperOpMapperDeploymentComponent =
              findCopyFromByRepoObject(objOpMapperDeploymentComponent);
          Object pkOpMapperDeploymentComponent =
              mapperOpMapperDeploymentComponent.getPrimaryKeyFromRepositoryObject(
                  objOpMapperDeploymentComponent);
          if (get(context, pkOpMapperDeploymentComponent, objOpMapperDeploymentComponent) == null) {
            put(context, pkOpMapperDeploymentComponent, objOpMapperDeploymentComponent);
            DeploymentComponent spaOpMapperDeploymentComponent =
                (DeploymentComponent)
                    mapperOpMapperDeploymentComponent.deepCopyFromRepository2Persistence(
                        objOpMapperDeploymentComponent, context);
            spa.getOpMapperDeploymentComponent().add(spaOpMapperDeploymentComponent);
            spaOpMapperDeploymentComponent.setMapper(spa);
          }
        }
      }
      Collection<MappingTecnologiy> objTechnologiesList = obj.getTechnologies();
      if (objTechnologiesList != null) {
        for (MappingTecnologiy objTechnologies : objTechnologiesList) {
          CopyFrom mapperTechnologies = findCopyFromByRepoObject(objTechnologies);
          Object pkTechnologies =
              mapperTechnologies.getPrimaryKeyFromRepositoryObject(objTechnologies);
          if (get(context, pkTechnologies, objTechnologies) == null) {
            put(context, pkTechnologies, objTechnologies);
            MappingTecnologiy spaTechnologies =
                (MappingTecnologiy)
                    mapperTechnologies.deepCopyFromRepository2Persistence(objTechnologies, context);
            spa.getTechnologies().add(spaTechnologies);
            spaTechnologies.setOpTechnologiesModelMapper(spa);
          }
        }
      }
      Collection<Query> objQueriesList = obj.getQueries();
      if (objQueriesList != null) {
        for (Query objQueries : objQueriesList) {
          CopyFrom mapperQueries = findCopyFromByRepoObject(objQueries);
          Object pkQueries = mapperQueries.getPrimaryKeyFromRepositoryObject(objQueries);
          if (get(context, pkQueries, objQueries) == null) {
            put(context, pkQueries, objQueries);
            Query spaQueries =
                (Query) mapperQueries.deepCopyFromRepository2Persistence(objQueries, context);
            spa.getQueries().add(spaQueries);
            spaQueries.setOpQueriesModelMapper(spa);
          }
        }
      }
      Component objOpMappersComponent = obj.getOpMappersComponent();
      if (objOpMappersComponent != null) {
        CopyFrom mapperOpMappersComponent = findCopyFromByRepoObject(objOpMappersComponent);
        Object pkOpMappersComponent =
            mapperOpMappersComponent.getPrimaryKeyFromRepositoryObject(objOpMappersComponent);
        if (get(context, pkOpMappersComponent, objOpMappersComponent) == null) {
          put(context, pkOpMappersComponent, objOpMappersComponent);
          Component spaOpMappersComponent =
              (Component)
                  mapperOpMappersComponent.deepCopyFromRepository2Persistence(
                      objOpMappersComponent, context);
          spa.setOpMappersComponent(spaOpMappersComponent);
          spaOpMappersComponent.getMappers().add(spa);
        }
      }
      Artifact objArtifactRef = obj.getArtifactRef();
      if (objArtifactRef != null) {
        CopyFrom mapperArtifactRef = findCopyFromByRepoObject(objArtifactRef);
        Object pkArtifactRef = mapperArtifactRef.getPrimaryKeyFromRepositoryObject(objArtifactRef);
        if (get(context, pkArtifactRef, objArtifactRef) == null) {
          put(context, pkArtifactRef, objArtifactRef);
          Artifact spaArtifactRef =
              (Artifact)
                  mapperArtifactRef.deepCopyFromRepository2Persistence(objArtifactRef, context);
          spa.setArtifactRef(spaArtifactRef);
          spaArtifactRef.getOpArtifactRefArtifactRef().add(spa);
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
