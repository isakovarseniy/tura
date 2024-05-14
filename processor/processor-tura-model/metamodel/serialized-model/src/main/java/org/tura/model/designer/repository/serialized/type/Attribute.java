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

package org.tura.model.designer.repository.serialized.type;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
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
public class Attribute implements Serializable, TypePointer, Categorized, MetaObject {

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

  private Boolean pk;

  public Boolean getPk() {
    return pk;
  }

  public void setPk(java.lang.Boolean pk) {
    this.pk = pk;
  }

  private Boolean uk;

  public Boolean getUk() {
    return uk;
  }

  public void setUk(java.lang.Boolean uk) {
    this.uk = uk;
  }

  private String transientrefAttributesType;

  public String getTransientrefAttributesType() {
    return transientrefAttributesType;
  }

  public void setTransientrefAttributesType(java.lang.String transientrefAttributesType) {
    this.transientrefAttributesType = transientrefAttributesType;
  }

  private List<Link> opMasterFieldLink = new ArrayList<>();

  @Association(
      id = "a1e738a6-acda-4a3c-97a4-1a56da7877ee",
      from = org.tura.model.designer.repository.serialized.type.Attribute.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Link.class,
      property = "masterField",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Link> getOpMasterFieldLink() {
    return opMasterFieldLink;
  }

  public void setOpMasterFieldLink(java.util.List<Link> opMasterFieldLink) {
    this.opMasterFieldLink = opMasterFieldLink;
  }

  private List<Link> opDetailFieldLink = new ArrayList<>();

  @Association(
      id = "8d488d12-a4de-4146-821c-4dc0a89e9cd8",
      from = org.tura.model.designer.repository.serialized.type.Attribute.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Link.class,
      property = "detailField",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Link> getOpDetailFieldLink() {
    return opDetailFieldLink;
  }

  public void setOpDetailFieldLink(java.util.List<Link> opDetailFieldLink) {
    this.opDetailFieldLink = opDetailFieldLink;
  }

  private List<AttributePointer> opAttributeRefAttributePointer = new ArrayList<>();

  @Association(
      id = "d9bb2cc9-9a2f-4e2d-9279-8e65e96e7936",
      from = org.tura.model.designer.repository.serialized.type.Attribute.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.AttributePointer.class,
      property = "attributeRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<AttributePointer> getOpAttributeRefAttributePointer() {
    return opAttributeRefAttributePointer;
  }

  public void setOpAttributeRefAttributePointer(
      java.util.List<AttributePointer> opAttributeRefAttributePointer) {
    this.opAttributeRefAttributePointer = opAttributeRefAttributePointer;
  }

  private Type opAttributesType;

  @Association(
      id = "a9eabfb6-a70b-4bb4-a5fd-49e7ddd51991",
      from = org.tura.model.designer.repository.serialized.type.Attribute.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Type.class,
      property = "attributes",
      containment = false,
      type = "One2Many",
      lazy = false,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Type getOpAttributesType() {
    return opAttributesType;
  }

  public void setOpAttributesType(
      org.tura.model.designer.repository.serialized.type.Type opAttributesType) {
    this.opAttributesType = opAttributesType;
  }

  private String suidTypePointer;

  public String getSuidTypePointer() {
    return suidTypePointer;
  }

  public void setSuidTypePointer(java.lang.String suidTypePointer) {
    this.suidTypePointer = suidTypePointer;
  }

  private String transientrefOpTypeRefTypePointerTypeElement;

  public String getTransientrefOpTypeRefTypePointerTypeElement() {
    return transientrefOpTypeRefTypePointerTypeElement;
  }

  public void setTransientrefOpTypeRefTypePointerTypeElement(
      java.lang.String transientrefOpTypeRefTypePointerTypeElement) {
    this.transientrefOpTypeRefTypePointerTypeElement = transientrefOpTypeRefTypePointerTypeElement;
  }

  private String transientrefMany2manyHelperAssosiation;

  public String getTransientrefMany2manyHelperAssosiation() {
    return transientrefMany2manyHelperAssosiation;
  }

  public void setTransientrefMany2manyHelperAssosiation(
      java.lang.String transientrefMany2manyHelperAssosiation) {
    this.transientrefMany2manyHelperAssosiation = transientrefMany2manyHelperAssosiation;
  }

  private TypeElement typeRef;

  @Association(
      id = "0711687a-6c21-4561-b355-b6c2b5a7cfe8",
      from = org.tura.model.designer.repository.serialized.type.TypePointer.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      property = "opTypeRefTypePointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public TypeElement getTypeRef() {
    return typeRef;
  }

  public void setTypeRef(org.tura.model.designer.repository.serialized.type.TypeElement typeRef) {
    this.typeRef = typeRef;
  }

  private Assosiation opMany2manyHelperAssosiation;

  @Association(
      id = "4ca9264d-a781-449a-b214-8a8b48b996fe",
      from = org.tura.model.designer.repository.serialized.type.TypePointer.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Assosiation.class,
      property = "many2manyHelper",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Assosiation getOpMany2manyHelperAssosiation() {
    return opMany2manyHelperAssosiation;
  }

  public void setOpMany2manyHelperAssosiation(
      org.tura.model.designer.repository.serialized.type.Assosiation opMany2manyHelperAssosiation) {
    this.opMany2manyHelperAssosiation = opMany2manyHelperAssosiation;
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
