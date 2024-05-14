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

package org.tura.model.designer.repository.serialized.form;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.model.designer.repository.serialized.objectmapper.OperationConnector;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
public class ContextParametersObj implements Serializable, ContextParameters, MetaObject {

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

  private String transientrefDefaultSearchAttributeConnector;

  public String getTransientrefDefaultSearchAttributeConnector() {
    return transientrefDefaultSearchAttributeConnector;
  }

  public void setTransientrefDefaultSearchAttributeConnector(
      java.lang.String transientrefDefaultSearchAttributeConnector) {
    this.transientrefDefaultSearchAttributeConnector = transientrefDefaultSearchAttributeConnector;
  }

  private String transientrefDefaultSearchOperationConnector;

  public String getTransientrefDefaultSearchOperationConnector() {
    return transientrefDefaultSearchOperationConnector;
  }

  public void setTransientrefDefaultSearchOperationConnector(
      java.lang.String transientrefDefaultSearchOperationConnector) {
    this.transientrefDefaultSearchOperationConnector = transientrefDefaultSearchOperationConnector;
  }

  private String transientrefDefaultSearchDataControl;

  public String getTransientrefDefaultSearchDataControl() {
    return transientrefDefaultSearchDataControl;
  }

  public void setTransientrefDefaultSearchDataControl(
      java.lang.String transientrefDefaultSearchDataControl) {
    this.transientrefDefaultSearchDataControl = transientrefDefaultSearchDataControl;
  }

  private AttributeConnector opDefaultSearchAttributeConnector;

  @Association(
      id = "8737cf34-9b6f-4dfb-a315-eb7d3eee7fbb",
      from = org.tura.model.designer.repository.serialized.form.ContextParametersObj.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
      property = "defaultSearch",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public AttributeConnector getOpDefaultSearchAttributeConnector() {
    return opDefaultSearchAttributeConnector;
  }

  public void setOpDefaultSearchAttributeConnector(
      org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector
          opDefaultSearchAttributeConnector) {
    this.opDefaultSearchAttributeConnector = opDefaultSearchAttributeConnector;
  }

  private OperationConnector opDefaultSearchOperationConnector;

  @Association(
      id = "a0df232d-d468-4d77-a6e7-f875ffa6e18c",
      from = org.tura.model.designer.repository.serialized.form.ContextParametersObj.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.OperationConnector.class,
      property = "defaultSearch",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public OperationConnector getOpDefaultSearchOperationConnector() {
    return opDefaultSearchOperationConnector;
  }

  public void setOpDefaultSearchOperationConnector(
      org.tura.model.designer.repository.serialized.objectmapper.OperationConnector
          opDefaultSearchOperationConnector) {
    this.opDefaultSearchOperationConnector = opDefaultSearchOperationConnector;
  }

  private DataControl opDefaultSearchDataControl;

  @Association(
      id = "72df119b-33cc-401d-9d82-9ce7410e804a",
      from = org.tura.model.designer.repository.serialized.form.ContextParametersObj.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.DataControl.class,
      property = "defaultSearch",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public DataControl getOpDefaultSearchDataControl() {
    return opDefaultSearchDataControl;
  }

  public void setOpDefaultSearchDataControl(
      org.tura.model.designer.repository.serialized.form.DataControl opDefaultSearchDataControl) {
    this.opDefaultSearchDataControl = opDefaultSearchDataControl;
  }

  private String suidContextParameters;

  public String getSuidContextParameters() {
    return suidContextParameters;
  }

  public void setSuidContextParameters(java.lang.String suidContextParameters) {
    this.suidContextParameters = suidContextParameters;
  }

  private List<ContextParameter> parameters = new ArrayList<>();

  @Association(
      id = "3d70575c-c330-4449-b302-46098147fdd7",
      from = org.tura.model.designer.repository.serialized.form.ContextParameters.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ContextParameter.class,
      property = "opParametersContextParameters",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ContextParameter> getParameters() {
    return parameters;
  }

  public void setParameters(java.util.List<ContextParameter> parameters) {
    this.parameters = parameters;
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
