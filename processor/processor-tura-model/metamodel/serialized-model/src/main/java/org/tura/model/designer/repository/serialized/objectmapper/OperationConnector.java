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

package org.tura.model.designer.repository.serialized.objectmapper;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.model.designer.repository.serialized.form.ContextParametersObj;
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
public class OperationConnector implements Serializable, OperationConnectorRef, MetaObject {

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

  private OperationType operationType;

  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(
      org.tura.model.designer.repository.serialized.objectmapper.OperationType operationType) {
    this.operationType = operationType;
  }

  private String transientrefOperationsConnectorObjectMapperGroup;

  public String getTransientrefOperationsConnectorObjectMapperGroup() {
    return transientrefOperationsConnectorObjectMapperGroup;
  }

  public void setTransientrefOperationsConnectorObjectMapperGroup(
      java.lang.String transientrefOperationsConnectorObjectMapperGroup) {
    this.transientrefOperationsConnectorObjectMapperGroup =
        transientrefOperationsConnectorObjectMapperGroup;
  }

  private String transientrefOpSourceOperationConnectorObjectMapper;

  public String getTransientrefOpSourceOperationConnectorObjectMapper() {
    return transientrefOpSourceOperationConnectorObjectMapper;
  }

  public void setTransientrefOpSourceOperationConnectorObjectMapper(
      java.lang.String transientrefOpSourceOperationConnectorObjectMapper) {
    this.transientrefOpSourceOperationConnectorObjectMapper =
        transientrefOpSourceOperationConnectorObjectMapper;
  }

  private String transientrefOpTargetOperationConnectorObjectMapper;

  public String getTransientrefOpTargetOperationConnectorObjectMapper() {
    return transientrefOpTargetOperationConnectorObjectMapper;
  }

  public void setTransientrefOpTargetOperationConnectorObjectMapper(
      java.lang.String transientrefOpTargetOperationConnectorObjectMapper) {
    this.transientrefOpTargetOperationConnectorObjectMapper =
        transientrefOpTargetOperationConnectorObjectMapper;
  }

  private List<OperationConnectorRef> opOperationRefOperationConnectorRef = new ArrayList<>();

  @Association(
      id = "46210667-da67-4a97-b0ca-ce7fee7a43b0",
      from = org.tura.model.designer.repository.serialized.objectmapper.OperationConnector.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.OperationConnectorRef.class,
      property = "operationRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<OperationConnectorRef> getOpOperationRefOperationConnectorRef() {
    return opOperationRefOperationConnectorRef;
  }

  public void setOpOperationRefOperationConnectorRef(
      java.util.List<OperationConnectorRef> opOperationRefOperationConnectorRef) {
    this.opOperationRefOperationConnectorRef = opOperationRefOperationConnectorRef;
  }

  private ContextParametersObj defaultSearch;

  @Association(
      id = "a0df232d-d468-4d77-a6e7-f875ffa6e18c",
      from = org.tura.model.designer.repository.serialized.objectmapper.OperationConnector.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ContextParametersObj.class,
      property = "opDefaultSearchOperationConnector",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public ContextParametersObj getDefaultSearch() {
    return defaultSearch;
  }

  public void setDefaultSearch(
      org.tura.model.designer.repository.serialized.form.ContextParametersObj defaultSearch) {
    this.defaultSearch = defaultSearch;
  }

  private ObjectMapperGroup opOperationsConnectorObjectMapperGroup;

  @Association(
      id = "4ce15b83-5a04-43a6-a1fd-37b8d5f10a48",
      from = org.tura.model.designer.repository.serialized.objectmapper.OperationConnector.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup.class,
      property = "operationsConnector",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public ObjectMapperGroup getOpOperationsConnectorObjectMapperGroup() {
    return opOperationsConnectorObjectMapperGroup;
  }

  public void setOpOperationsConnectorObjectMapperGroup(
      org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup
          opOperationsConnectorObjectMapperGroup) {
    this.opOperationsConnectorObjectMapperGroup = opOperationsConnectorObjectMapperGroup;
  }

  private ObjectMapper source;

  @Association(
      id = "34edb4a9-9fb0-4c14-9433-57bb08a98668",
      from = org.tura.model.designer.repository.serialized.objectmapper.OperationConnector.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      property = "opSourceOperationConnector",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public ObjectMapper getSource() {
    return source;
  }

  public void setSource(
      org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper source) {
    this.source = source;
  }

  private ObjectMapper target;

  @Association(
      id = "7aecb0da-c897-4c4e-b70d-94231b8c8100",
      from = org.tura.model.designer.repository.serialized.objectmapper.OperationConnector.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      property = "opTargetOperationConnector",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public ObjectMapper getTarget() {
    return target;
  }

  public void setTarget(
      org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper target) {
    this.target = target;
  }

  private String suidOperationConnectorRef;

  public String getSuidOperationConnectorRef() {
    return suidOperationConnectorRef;
  }

  public void setSuidOperationConnectorRef(java.lang.String suidOperationConnectorRef) {
    this.suidOperationConnectorRef = suidOperationConnectorRef;
  }

  private String transientrefOpOperationRefOperationConnectorRefOperationConnector;

  public String getTransientrefOpOperationRefOperationConnectorRefOperationConnector() {
    return transientrefOpOperationRefOperationConnectorRefOperationConnector;
  }

  public void setTransientrefOpOperationRefOperationConnectorRefOperationConnector(
      java.lang.String transientrefOpOperationRefOperationConnectorRefOperationConnector) {
    this.transientrefOpOperationRefOperationConnectorRefOperationConnector =
        transientrefOpOperationRefOperationConnectorRefOperationConnector;
  }

  private OperationConnector operationRef;

  @Association(
      id = "46210667-da67-4a97-b0ca-ce7fee7a43b0",
      from = org.tura.model.designer.repository.serialized.objectmapper.OperationConnectorRef.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.OperationConnector.class,
      property = "opOperationRefOperationConnectorRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public OperationConnector getOperationRef() {
    return operationRef;
  }

  public void setOperationRef(
      org.tura.model.designer.repository.serialized.objectmapper.OperationConnector operationRef) {
    this.operationRef = operationRef;
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
