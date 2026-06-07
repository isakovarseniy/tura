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

package org.tura.model.designer.repository.serialized.type;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.permission.Secured;
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import org.tura.model.designer.repository.serialized.permission.GrantAccess;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
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
public class Operation implements Serializable, Secured, Categorized, MetaObject {

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
  public Operation inMemory() {
    throw new UnsupportedOperationException();
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

  private String transientrefOperationsType;

  public String getTransientrefOperationsType() {
    return transientrefOperationsType;
  }

  public void setTransientrefOperationsType(java.lang.String transientrefOperationsType) {
    this.transientrefOperationsType = transientrefOperationsType;
  }

  private List<Parameter> parameters = new ArrayList<>();

  @Association(
      id = "2ab52eb5-f3cd-43a2-8916-e7dae5878413",
      from = org.tura.model.designer.repository.serialized.type.Operation.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Parameter.class,
      property = "opParametersOperation",
      containment = true,
      type = "One2Many",
      lazy = false,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refParametersOperation",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(java.util.List<Parameter> parameters) {
    this.parameters = parameters;
  }

  private ReturnValue returnValue;

  @Association(
      id = "f696fd8d-ed58-4851-acd8-7f2807dfdd71",
      from = org.tura.model.designer.repository.serialized.type.Operation.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.ReturnValue.class,
      property = "opReturnValueOperation",
      containment = true,
      type = "One2One",
      lazy = false,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refReturnValueOperation",
            field1Suffix = "",
            field2Suffix = "")
      })
  public ReturnValue getReturnValue() {
    return returnValue;
  }

  public void setReturnValue(
      org.tura.model.designer.repository.serialized.type.ReturnValue returnValue) {
    this.returnValue = returnValue;
  }

  private List<MethodPointer> opMethodRefMethodPointer = new ArrayList<>();

  @Association(
      id = "624d47cc-372a-41d3-a22c-7e9a9fe99d5c",
      from = org.tura.model.designer.repository.serialized.type.Operation.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.MethodPointer.class,
      property = "methodRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpMethodRefMethodPointerOperation",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<MethodPointer> getOpMethodRefMethodPointer() {
    return opMethodRefMethodPointer;
  }

  public void setOpMethodRefMethodPointer(java.util.List<MethodPointer> opMethodRefMethodPointer) {
    this.opMethodRefMethodPointer = opMethodRefMethodPointer;
  }

  private Type opOperationsType;

  @Association(
      id = "b35ab9e6-65bb-4955-8209-f0bed907be35",
      from = org.tura.model.designer.repository.serialized.type.Operation.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Type.class,
      property = "operations",
      containment = false,
      type = "One2Many",
      lazy = false,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOperationsType",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Type getOpOperationsType() {
    return opOperationsType;
  }

  public void setOpOperationsType(
      org.tura.model.designer.repository.serialized.type.Type opOperationsType) {
    this.opOperationsType = opOperationsType;
  }

  private String suidSecured;

  public String getSuidSecured() {
    return suidSecured;
  }

  public void setSuidSecured(java.lang.String suidSecured) {
    this.suidSecured = suidSecured;
  }

  private List<GrantAccess> grants = new ArrayList<>();

  @Association(
      id = "d4e788c9-93ae-486e-b245-aa9a409900cf",
      from = org.tura.model.designer.repository.serialized.permission.Secured.class,
      mappedBy = org.tura.model.designer.repository.serialized.permission.GrantAccess.class,
      property = "opGrantsSecured",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refGrantsSecured",
            field1Suffix = "Secured",
            field2Suffix = "")
      })
  public List<GrantAccess> getGrants() {
    return grants;
  }

  public void setGrants(java.util.List<GrantAccess> grants) {
    this.grants = grants;
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
