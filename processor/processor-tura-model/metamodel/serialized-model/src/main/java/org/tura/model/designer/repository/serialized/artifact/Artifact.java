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

package org.tura.model.designer.repository.serialized.artifact;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.model.designer.repository.serialized.recipe.ArtifactRef;
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
public class Artifact implements Serializable, MetaObject {

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

  private String keyId;

  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(java.lang.String keyId) {
    this.keyId = keyId;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  private String template;

  public String getTemplate() {
    return template;
  }

  public void setTemplate(java.lang.String template) {
    this.template = template;
  }

  private String transientrefArtifactsArtifactGroup;

  public String getTransientrefArtifactsArtifactGroup() {
    return transientrefArtifactsArtifactGroup;
  }

  public void setTransientrefArtifactsArtifactGroup(
      java.lang.String transientrefArtifactsArtifactGroup) {
    this.transientrefArtifactsArtifactGroup = transientrefArtifactsArtifactGroup;
  }

  private List<ConfigVariableWithNickName> configVariables = new ArrayList<>();

  @Association(
      id = "3c42d043-a057-40d7-b8cf-639f7f9af32d",
      from = org.tura.model.designer.repository.serialized.artifact.Artifact.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.artifact.ConfigVariableWithNickName.class,
      property = "opConfigVariablesArtifact",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ConfigVariableWithNickName> getConfigVariables() {
    return configVariables;
  }

  public void setConfigVariables(java.util.List<ConfigVariableWithNickName> configVariables) {
    this.configVariables = configVariables;
  }

  private List<ConfigHashWithNickName> configHashes = new ArrayList<>();

  @Association(
      id = "cbbe448f-72e3-48dc-8c95-82d38b59eb69",
      from = org.tura.model.designer.repository.serialized.artifact.Artifact.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.artifact.ConfigHashWithNickName.class,
      property = "opConfigHashesArtifact",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ConfigHashWithNickName> getConfigHashes() {
    return configHashes;
  }

  public void setConfigHashes(java.util.List<ConfigHashWithNickName> configHashes) {
    this.configHashes = configHashes;
  }

  private List<ModelQuery> modelQuery = new ArrayList<>();

  @Association(
      id = "fc663abb-355e-4f9c-b173-841ec3951335",
      from = org.tura.model.designer.repository.serialized.artifact.Artifact.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.ModelQuery.class,
      property = "opModelQueryArtifact",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ModelQuery> getModelQuery() {
    return modelQuery;
  }

  public void setModelQuery(java.util.List<ModelQuery> modelQuery) {
    this.modelQuery = modelQuery;
  }

  private List<Technology> technologies = new ArrayList<>();

  @Association(
      id = "bca2e0b6-d721-494a-b5fc-ab7ff239d695",
      from = org.tura.model.designer.repository.serialized.artifact.Artifact.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.Technology.class,
      property = "opTechnologiesArtifact",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Technology> getTechnologies() {
    return technologies;
  }

  public void setTechnologies(java.util.List<Technology> technologies) {
    this.technologies = technologies;
  }

  private List<GenerationHintWithNickName> hints = new ArrayList<>();

  @Association(
      id = "25c6f650-d338-48c4-9c9b-4b71d31c1533",
      from = org.tura.model.designer.repository.serialized.artifact.Artifact.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.artifact.GenerationHintWithNickName.class,
      property = "opHintsArtifact",
      containment = true,
      type = "One2Many",
      lazy = false,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<GenerationHintWithNickName> getHints() {
    return hints;
  }

  public void setHints(java.util.List<GenerationHintWithNickName> hints) {
    this.hints = hints;
  }

  private List<ArtifactRef> opArtifactRefArtifactRef = new ArrayList<>();

  @Association(
      id = "605566a2-c090-46b5-b789-b29bcbc677e0",
      from = org.tura.model.designer.repository.serialized.artifact.Artifact.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.ArtifactRef.class,
      property = "artifactRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ArtifactRef> getOpArtifactRefArtifactRef() {
    return opArtifactRefArtifactRef;
  }

  public void setOpArtifactRefArtifactRef(java.util.List<ArtifactRef> opArtifactRefArtifactRef) {
    this.opArtifactRefArtifactRef = opArtifactRefArtifactRef;
  }

  private ArtifactGroup opArtifactsArtifactGroup;

  @Association(
      id = "e9d20d38-d38e-475f-a735-f23ba34244e4",
      from = org.tura.model.designer.repository.serialized.artifact.Artifact.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.ArtifactGroup.class,
      property = "artifacts",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public ArtifactGroup getOpArtifactsArtifactGroup() {
    return opArtifactsArtifactGroup;
  }

  public void setOpArtifactsArtifactGroup(
      org.tura.model.designer.repository.serialized.artifact.ArtifactGroup
          opArtifactsArtifactGroup) {
    this.opArtifactsArtifactGroup = opArtifactsArtifactGroup;
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
