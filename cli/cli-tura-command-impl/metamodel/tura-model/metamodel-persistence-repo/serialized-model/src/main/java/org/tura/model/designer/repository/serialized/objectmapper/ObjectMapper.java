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

package org.tura.model.designer.repository.serialized.objectmapper;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.tura.model.designer.repository.serialized.type.TypePointerObj;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import java.util.ArrayList;
import java.util.List;
import org.tura.model.designer.repository.serialized.type.AttributePointer;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
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
public class ObjectMapper implements Serializable, Categorized, MetaObject {

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

  @JsonIgnore
  public boolean isInMemory() {
    throw new UnsupportedOperationException();
  }

  @JsonIgnore
  public ObjectMapper inMemory() {
    throw new UnsupportedOperationException();
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

  private String transientrefObjectMappersObjectMapperGroup;

  public String getTransientrefObjectMappersObjectMapperGroup() {
    return transientrefObjectMappersObjectMapperGroup;
  }

  public void setTransientrefObjectMappersObjectMapperGroup(
      java.lang.String transientrefObjectMappersObjectMapperGroup) {
    this.transientrefObjectMappersObjectMapperGroup = transientrefObjectMappersObjectMapperGroup;
  }

  private String transientrefOpStageObjectMapperProcessingStage;

  public String getTransientrefOpStageObjectMapperProcessingStage() {
    return transientrefOpStageObjectMapperProcessingStage;
  }

  public void setTransientrefOpStageObjectMapperProcessingStage(
      java.lang.String transientrefOpStageObjectMapperProcessingStage) {
    this.transientrefOpStageObjectMapperProcessingStage =
        transientrefOpStageObjectMapperProcessingStage;
  }

  private TypePointerObj baseType;

  @Association(
      id = "8b1dc298-0197-47f2-99d5-2f4082949702",
      from = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypePointerObj.class,
      property = "opBaseTypeObjectMapper",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refBaseTypeObjectMapper",
            field1Suffix = "",
            field2Suffix = "")
      })
  public TypePointerObj getBaseType() {
    return baseType;
  }

  public void setBaseType(
      org.tura.model.designer.repository.serialized.type.TypePointerObj baseType) {
    this.baseType = baseType;
  }

  private List<OmRelation> relations = new ArrayList<>();

  @Association(
      id = "95866ae5-9ff2-462c-8695-20356aba869e",
      from = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.OmRelation.class,
      property = "opRelationsObjectMapper",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refRelationsObjectMapper",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<OmRelation> getRelations() {
    return relations;
  }

  public void setRelations(java.util.List<OmRelation> relations) {
    this.relations = relations;
  }

  private List<CalculatedField> calculations = new ArrayList<>();

  @Association(
      id = "c955955c-33e5-4640-a645-14f57accf99e",
      from = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.CalculatedField.class,
      property = "opCalculationsObjectMapper",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refCalculationsObjectMapper",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<CalculatedField> getCalculations() {
    return calculations;
  }

  public void setCalculations(java.util.List<CalculatedField> calculations) {
    this.calculations = calculations;
  }

  private List<Aggregation> aggrigations = new ArrayList<>();

  @Association(
      id = "4446378f-eecc-4966-8ea4-c68ba4f30b20",
      from = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.Aggregation.class,
      property = "opAggrigationsObjectMapper",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refAggrigationsObjectMapper",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<Aggregation> getAggrigations() {
    return aggrigations;
  }

  public void setAggrigations(java.util.List<Aggregation> aggrigations) {
    this.aggrigations = aggrigations;
  }

  private List<AttributePointer> attributes = new ArrayList<>();

  @Association(
      id = "8c43636e-7a8b-4f8b-9f41-8b006fcfa4bc",
      from = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.AttributePointer.class,
      property = "opAttributesObjectMapper",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refAttributesObjectMapper",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<AttributePointer> getAttributes() {
    return attributes;
  }

  public void setAttributes(java.util.List<AttributePointer> attributes) {
    this.attributes = attributes;
  }

  private List<OmRelation> opObjectMapperRefOmRelation = new ArrayList<>();

  @Association(
      id = "e7aa5777-2d89-42eb-8031-6d1d808b2935",
      from = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.OmRelation.class,
      property = "objectMapperRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpObjectMapperRefOmRelationObjectMapper",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<OmRelation> getOpObjectMapperRefOmRelation() {
    return opObjectMapperRefOmRelation;
  }

  public void setOpObjectMapperRefOmRelation(
      java.util.List<OmRelation> opObjectMapperRefOmRelation) {
    this.opObjectMapperRefOmRelation = opObjectMapperRefOmRelation;
  }

  private List<OperationConnector> opSourceOperationConnector = new ArrayList<>();

  @Association(
      id = "34edb4a9-9fb0-4c14-9433-57bb08a98668",
      from = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.OperationConnector.class,
      property = "source",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpSourceOperationConnectorObjectMapper",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<OperationConnector> getOpSourceOperationConnector() {
    return opSourceOperationConnector;
  }

  public void setOpSourceOperationConnector(
      java.util.List<OperationConnector> opSourceOperationConnector) {
    this.opSourceOperationConnector = opSourceOperationConnector;
  }

  private List<OperationConnector> opTargetOperationConnector = new ArrayList<>();

  @Association(
      id = "7aecb0da-c897-4c4e-b70d-94231b8c8100",
      from = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.OperationConnector.class,
      property = "target",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpTargetOperationConnectorObjectMapper",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<OperationConnector> getOpTargetOperationConnector() {
    return opTargetOperationConnector;
  }

  public void setOpTargetOperationConnector(
      java.util.List<OperationConnector> opTargetOperationConnector) {
    this.opTargetOperationConnector = opTargetOperationConnector;
  }

  private ObjectMapperGroup opObjectMappersObjectMapperGroup;

  @Association(
      id = "ad23d28b-f52b-42e9-a331-00fef17320e4",
      from = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup.class,
      property = "objectMappers",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refObjectMappersObjectMapperGroup",
            field1Suffix = "",
            field2Suffix = "")
      })
  public ObjectMapperGroup getOpObjectMappersObjectMapperGroup() {
    return opObjectMappersObjectMapperGroup;
  }

  public void setOpObjectMappersObjectMapperGroup(
      org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup
          opObjectMappersObjectMapperGroup) {
    this.opObjectMappersObjectMapperGroup = opObjectMappersObjectMapperGroup;
  }

  private ProcessingStage stage;

  @Association(
      id = "bce953d1-1ff5-4ad5-a131-79fd13720550",
      from = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.ProcessingStage.class,
      property = "opStageObjectMapper",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpStageObjectMapperProcessingStage",
            field1Suffix = "",
            field2Suffix = "")
      })
  public ProcessingStage getStage() {
    return stage;
  }

  public void setStage(
      org.tura.model.designer.repository.serialized.objectmapper.ProcessingStage stage) {
    this.stage = stage;
  }

  private String suidCategorized;

  public String getSuidCategorized() {
    return suidCategorized;
  }

  public void setSuidCategorized(java.lang.String suidCategorized) {
    this.suidCategorized = suidCategorized;
  }

  private List<Classifier> classifiers = new ArrayList<>();

  @Association(
      id = "1bb1f934-5eba-4f36-932f-0f3c7ef54731",
      from = org.tura.model.designer.repository.serialized.artifact.Categorized.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.Classifier.class,
      property = "opClassifiersCategorized",
      containment = true,
      type = "One2Many",
      lazy = false,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refClassifiersCategorized",
            field1Suffix = "Categorized",
            field2Suffix = "")
      })
  public List<Classifier> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(java.util.List<Classifier> classifiers) {
    this.classifiers = classifiers;
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpSourceAttributeConnectorMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpTargetAttributeConnectorMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpRefObjContextParameterMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpObjRefExpressionPartMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpValuePointerControlPointerMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpDisplayOptionPointerSelectionMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpValueOptionPointerSelectionMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpRefObjOrderByMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
  public List<OrderBy> getOpRefObjOrderBy() {
    return opRefObjOrderBy;
  }

  public void setOpRefObjOrderBy(java.util.List<OrderBy> opRefObjOrderBy) {
    this.opRefObjOrderBy = opRefObjOrderBy;
  }
}
