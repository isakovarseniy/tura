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
import org.tura.model.designer.repository.serialized.domain.DomainArtifacts;
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
public class TechLeaf implements Serializable, MetaObject {

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

  private String transientrefTechLeafsDomainArtifacts;

  public String getTransientrefTechLeafsDomainArtifacts() {
    return transientrefTechLeafsDomainArtifacts;
  }

  public void setTransientrefTechLeafsDomainArtifacts(
      java.lang.String transientrefTechLeafsDomainArtifacts) {
    this.transientrefTechLeafsDomainArtifacts = transientrefTechLeafsDomainArtifacts;
  }

  private String transientrefTechLeafsTechLeaf;

  public String getTransientrefTechLeafsTechLeaf() {
    return transientrefTechLeafsTechLeaf;
  }

  public void setTransientrefTechLeafsTechLeaf(java.lang.String transientrefTechLeafsTechLeaf) {
    this.transientrefTechLeafsTechLeaf = transientrefTechLeafsTechLeaf;
  }

  private List<GenerationHint> hints = new ArrayList<>();

  @Association(
      id = "f6bcd5bb-9e4d-4fc2-915f-88ce8e2cff38",
      from = org.tura.model.designer.repository.serialized.artifact.TechLeaf.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.GenerationHint.class,
      property = "opHintsTechLeaf",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<GenerationHint> getHints() {
    return hints;
  }

  public void setHints(java.util.List<GenerationHint> hints) {
    this.hints = hints;
  }

  private List<ConfigVariable> configVariables = new ArrayList<>();

  @Association(
      id = "4fc1222b-e6fe-4274-a949-e8b401bfad4b",
      from = org.tura.model.designer.repository.serialized.artifact.TechLeaf.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.ConfigVariable.class,
      property = "opConfigVariablesTechLeaf",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ConfigVariable> getConfigVariables() {
    return configVariables;
  }

  public void setConfigVariables(java.util.List<ConfigVariable> configVariables) {
    this.configVariables = configVariables;
  }

  private List<ConfigHash> configHashes = new ArrayList<>();

  @Association(
      id = "9808ef07-7444-40b5-bcc9-e3ca4cbe0da6",
      from = org.tura.model.designer.repository.serialized.artifact.TechLeaf.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.ConfigHash.class,
      property = "opConfigHashesTechLeaf",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ConfigHash> getConfigHashes() {
    return configHashes;
  }

  public void setConfigHashes(java.util.List<ConfigHash> configHashes) {
    this.configHashes = configHashes;
  }

  private List<TechLeaf> techLeafs = new ArrayList<>();

  @Association(
      id = "43150abf-be03-418f-979e-14223997b645",
      from = org.tura.model.designer.repository.serialized.artifact.TechLeaf.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.TechLeaf.class,
      property = "opTechLeafsTechLeaf",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<TechLeaf> getTechLeafs() {
    return techLeafs;
  }

  public void setTechLeafs(java.util.List<TechLeaf> techLeafs) {
    this.techLeafs = techLeafs;
  }

  private List<Option> opValueOption = new ArrayList<>();

  @Association(
      id = "0dd36b9d-6d4c-4684-b878-8bac0a029ffa",
      from = org.tura.model.designer.repository.serialized.artifact.TechLeaf.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.Option.class,
      property = "value",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Option> getOpValueOption() {
    return opValueOption;
  }

  public void setOpValueOption(java.util.List<Option> opValueOption) {
    this.opValueOption = opValueOption;
  }

  private DomainArtifacts opTechLeafsDomainArtifacts;

  @Association(
      id = "af6d0384-1065-45ba-85d9-ce6063cd757b",
      from = org.tura.model.designer.repository.serialized.artifact.TechLeaf.class,
      mappedBy = org.tura.model.designer.repository.serialized.domain.DomainArtifacts.class,
      property = "techLeafs",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public DomainArtifacts getOpTechLeafsDomainArtifacts() {
    return opTechLeafsDomainArtifacts;
  }

  public void setOpTechLeafsDomainArtifacts(
      org.tura.model.designer.repository.serialized.domain.DomainArtifacts
          opTechLeafsDomainArtifacts) {
    this.opTechLeafsDomainArtifacts = opTechLeafsDomainArtifacts;
  }

  private TechLeaf opTechLeafsTechLeaf;

  @Association(
      id = "43150abf-be03-418f-979e-14223997b645",
      from = org.tura.model.designer.repository.serialized.artifact.TechLeaf.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.TechLeaf.class,
      property = "techLeafs",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public TechLeaf getOpTechLeafsTechLeaf() {
    return opTechLeafsTechLeaf;
  }

  public void setOpTechLeafsTechLeaf(
      org.tura.model.designer.repository.serialized.artifact.TechLeaf opTechLeafsTechLeaf) {
    this.opTechLeafsTechLeaf = opTechLeafsTechLeaf;
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
