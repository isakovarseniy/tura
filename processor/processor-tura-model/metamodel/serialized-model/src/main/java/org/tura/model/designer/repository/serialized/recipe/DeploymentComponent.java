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

package org.tura.model.designer.repository.serialized.recipe;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import org.tura.platform.repository.core.annotation.Association;
import java.util.ArrayList;
import java.util.List;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.serialized.form.ContextParameter;
import org.tura.model.designer.repository.serialized.form.ExpressionPart;
import org.tura.model.designer.repository.serialized.form.ControlPointer;
import org.tura.model.designer.repository.serialized.form.Selection;
import org.tura.model.designer.repository.serialized.form.OrderBy;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
public class DeploymentComponent implements Serializable, MetaObject {

  private static final long serialVersionUID = 1L;

  private Boolean attached;

  public Boolean getAttached() {
    return attached;
  }

  public void setAttached(Boolean value) {
    this.attached = value;
  }

  private String serializationid;

  public String getSerializationid() {
    return serializationid;
  }

  public void setSerializationid(String value) {
    this.serializationid = value;
  }

  private String cpaid;

  public String getCpaid() {
    return cpaid;
  }

  public void setCpaid(String value) {
    this.cpaid = value;
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private Boolean skip;

  public Boolean getSkip() {
    return skip;
  }

  public void setSkip(java.lang.Boolean skip) {
    this.skip = skip;
  }

  private String transientrefDeplymentStepRecipe;

  public String getTransientrefDeplymentStepRecipe() {
    return transientrefDeplymentStepRecipe;
  }

  public void setTransientrefDeplymentStepRecipe(java.lang.String transientrefDeplymentStepRecipe) {
    this.transientrefDeplymentStepRecipe = transientrefDeplymentStepRecipe;
  }

  private String transientrefOpMapperDeploymentComponentModelMapper;

  public String getTransientrefOpMapperDeploymentComponentModelMapper() {
    return transientrefOpMapperDeploymentComponentModelMapper;
  }

  public void setTransientrefOpMapperDeploymentComponentModelMapper(
      java.lang.String transientrefOpMapperDeploymentComponentModelMapper) {
    this.transientrefOpMapperDeploymentComponentModelMapper =
        transientrefOpMapperDeploymentComponentModelMapper;
  }

  private String transientrefDeploymentComponentLinkDeploymentComponent;

  public String getTransientrefDeploymentComponentLinkDeploymentComponent() {
    return transientrefDeploymentComponentLinkDeploymentComponent;
  }

  public void setTransientrefDeploymentComponentLinkDeploymentComponent(
      java.lang.String transientrefDeploymentComponentLinkDeploymentComponent) {
    this.transientrefDeploymentComponentLinkDeploymentComponent =
        transientrefDeploymentComponentLinkDeploymentComponent;
  }

  private DeploymentComponent deploymentComponentLink;

  @Association(
      id = "3b7d72a5-3a3f-4dfe-958d-5e05e0c6ca68",
      from = org.tura.model.designer.repository.serialized.recipe.DeploymentComponent.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.DeploymentComponent.class,
      property = "deploymentComponentLinkMaster",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public DeploymentComponent getDeploymentComponentLink() {
    return deploymentComponentLink;
  }

  public void setDeploymentComponentLink(
      org.tura.model.designer.repository.serialized.recipe.DeploymentComponent
          deploymentComponentLink) {
    this.deploymentComponentLink = deploymentComponentLink;
  }

  private List<DeploymentStarStep> opFirstStepDeploymentStarStep = new ArrayList<>();

  @Association(
      id = "fd13a732-6379-45ae-ab30-c3ab5dc00cd4",
      from = org.tura.model.designer.repository.serialized.recipe.DeploymentComponent.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.DeploymentStarStep.class,
      property = "firstStep",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<DeploymentStarStep> getOpFirstStepDeploymentStarStep() {
    return opFirstStepDeploymentStarStep;
  }

  public void setOpFirstStepDeploymentStarStep(
      java.util.List<DeploymentStarStep> opFirstStepDeploymentStarStep) {
    this.opFirstStepDeploymentStarStep = opFirstStepDeploymentStarStep;
  }

  private Recipe opDeplymentStepRecipe;

  @Association(
      id = "2f91fe9a-bce1-43e5-a805-a9a363173d33",
      from = org.tura.model.designer.repository.serialized.recipe.DeploymentComponent.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.Recipe.class,
      property = "deplymentStep",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Recipe getOpDeplymentStepRecipe() {
    return opDeplymentStepRecipe;
  }

  public void setOpDeplymentStepRecipe(
      org.tura.model.designer.repository.serialized.recipe.Recipe opDeplymentStepRecipe) {
    this.opDeplymentStepRecipe = opDeplymentStepRecipe;
  }

  private ModelMapper mapper;

  @Association(
      id = "d8e911da-8b12-4804-978f-540ab407f1a3",
      from = org.tura.model.designer.repository.serialized.recipe.DeploymentComponent.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.ModelMapper.class,
      property = "opMapperDeploymentComponent",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public ModelMapper getMapper() {
    return mapper;
  }

  public void setMapper(org.tura.model.designer.repository.serialized.recipe.ModelMapper mapper) {
    this.mapper = mapper;
  }

  private DeploymentComponent deploymentComponentLinkMaster;

  @Association(
      id = "3b7d72a5-3a3f-4dfe-958d-5e05e0c6ca68",
      from = org.tura.model.designer.repository.serialized.recipe.DeploymentComponent.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.DeploymentComponent.class,
      property = "deploymentComponentLink",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public DeploymentComponent getDeploymentComponentLinkMaster() {
    return deploymentComponentLinkMaster;
  }

  public void setDeploymentComponentLinkMaster(
      org.tura.model.designer.repository.serialized.recipe.DeploymentComponent
          deploymentComponentLinkMaster) {
    this.deploymentComponentLinkMaster = deploymentComponentLinkMaster;
  }

  private String suidMetaObject;

  public String getSuidMetaObject() {
    return suidMetaObject;
  }

  public void setSuidMetaObject(java.lang.String suidMetaObject) {
    this.suidMetaObject = suidMetaObject;
  }

  private List<AttributeConnector> opSourceAttributeConnector = new ArrayList<>();

  @Association(
      id = "ee8133a7-72b3-48b1-9807-e554f5a27019",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
      property = "source",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<AttributeConnector> getOpSourceAttributeConnector() {
    return opSourceAttributeConnector;
  }

  public void setOpSourceAttributeConnector(
      java.util.List<AttributeConnector> opSourceAttributeConnector) {
    this.opSourceAttributeConnector = opSourceAttributeConnector;
  }

  private List<AttributeConnector> opTargetAttributeConnector = new ArrayList<>();

  @Association(
      id = "1b246eaf-a5bc-4e1a-960f-6fcc29adf71a",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
      property = "target",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<AttributeConnector> getOpTargetAttributeConnector() {
    return opTargetAttributeConnector;
  }

  public void setOpTargetAttributeConnector(
      java.util.List<AttributeConnector> opTargetAttributeConnector) {
    this.opTargetAttributeConnector = opTargetAttributeConnector;
  }

  private List<ContextParameter> opRefObjContextParameter = new ArrayList<>();

  @Association(
      id = "ef46af04-c245-46b5-9b3b-24f475002cd1",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ContextParameter.class,
      property = "refObj",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ContextParameter> getOpRefObjContextParameter() {
    return opRefObjContextParameter;
  }

  public void setOpRefObjContextParameter(
      java.util.List<ContextParameter> opRefObjContextParameter) {
    this.opRefObjContextParameter = opRefObjContextParameter;
  }

  private List<ExpressionPart> opObjRefExpressionPart = new ArrayList<>();

  @Association(
      id = "c7db89bb-57ce-41f4-915f-31af456f91e6",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ExpressionPart.class,
      property = "objRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ExpressionPart> getOpObjRefExpressionPart() {
    return opObjRefExpressionPart;
  }

  public void setOpObjRefExpressionPart(java.util.List<ExpressionPart> opObjRefExpressionPart) {
    this.opObjRefExpressionPart = opObjRefExpressionPart;
  }

  private List<ControlPointer> opValuePointerControlPointer = new ArrayList<>();

  @Association(
      id = "f7c17e78-ca29-4283-8b59-58a4b320d35a",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ControlPointer.class,
      property = "valuePointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ControlPointer> getOpValuePointerControlPointer() {
    return opValuePointerControlPointer;
  }

  public void setOpValuePointerControlPointer(
      java.util.List<ControlPointer> opValuePointerControlPointer) {
    this.opValuePointerControlPointer = opValuePointerControlPointer;
  }

  private List<Selection> opDisplayOptionPointerSelection = new ArrayList<>();

  @Association(
      id = "54a67340-af4b-4c9a-9c65-322903fd3278",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Selection.class,
      property = "displayOptionPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Selection> getOpDisplayOptionPointerSelection() {
    return opDisplayOptionPointerSelection;
  }

  public void setOpDisplayOptionPointerSelection(
      java.util.List<Selection> opDisplayOptionPointerSelection) {
    this.opDisplayOptionPointerSelection = opDisplayOptionPointerSelection;
  }

  private List<Selection> opValueOptionPointerSelection = new ArrayList<>();

  @Association(
      id = "93bb8f22-1ce5-4cf3-a754-e32db046108a",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Selection.class,
      property = "valueOptionPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Selection> getOpValueOptionPointerSelection() {
    return opValueOptionPointerSelection;
  }

  public void setOpValueOptionPointerSelection(
      java.util.List<Selection> opValueOptionPointerSelection) {
    this.opValueOptionPointerSelection = opValueOptionPointerSelection;
  }

  private List<OrderBy> opRefObjOrderBy = new ArrayList<>();

  @Association(
      id = "9aad0734-a04c-48ba-b372-2885482154f1",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.OrderBy.class,
      property = "refObj",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<OrderBy> getOpRefObjOrderBy() {
    return opRefObjOrderBy;
  }

  public void setOpRefObjOrderBy(java.util.List<OrderBy> opRefObjOrderBy) {
    this.opRefObjOrderBy = opRefObjOrderBy;
  }
}
