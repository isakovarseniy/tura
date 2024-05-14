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
import org.tura.model.designer.repository.serialized.common.Orderable;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import org.tura.platform.repository.core.annotation.Association;
import java.util.ArrayList;
import java.util.List;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
public class ViewPort implements Serializable, ViewElement, Orderable, FlexFields, MetaObject {

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

  private ViewPortTrigger viewPortTrigger;

  @Association(
      id = "41378fe3-00cc-4bab-9db0-9f4c791946f8",
      from = org.tura.model.designer.repository.serialized.form.ViewPort.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ViewPortTrigger.class,
      property = "opViewPortTriggerViewPort",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public ViewPortTrigger getViewPortTrigger() {
    return viewPortTrigger;
  }

  public void setViewPortTrigger(
      org.tura.model.designer.repository.serialized.form.ViewPortTrigger viewPortTrigger) {
    this.viewPortTrigger = viewPortTrigger;
  }

  private List<ViewInheritance> opSourceViewInheritance = new ArrayList<>();

  @Association(
      id = "94a8a386-a27d-4fb8-ac0d-224f52d331a4",
      from = org.tura.model.designer.repository.serialized.form.ViewPort.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ViewInheritance.class,
      property = "source",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ViewInheritance> getOpSourceViewInheritance() {
    return opSourceViewInheritance;
  }

  public void setOpSourceViewInheritance(java.util.List<ViewInheritance> opSourceViewInheritance) {
    this.opSourceViewInheritance = opSourceViewInheritance;
  }

  private String suidViewElement;

  public String getSuidViewElement() {
    return suidViewElement;
  }

  public void setSuidViewElement(java.lang.String suidViewElement) {
    this.suidViewElement = suidViewElement;
  }

  private String transientrefViewElementViewPortHolder;

  public String getTransientrefViewElementViewPortHolder() {
    return transientrefViewElementViewPortHolder;
  }

  public void setTransientrefViewElementViewPortHolder(
      java.lang.String transientrefViewElementViewPortHolder) {
    this.transientrefViewElementViewPortHolder = transientrefViewElementViewPortHolder;
  }

  private ViewPortHolder opViewElementViewPortHolder;

  @Association(
      id = "41c985e7-b6c1-45be-8eef-854756a65834",
      from = org.tura.model.designer.repository.serialized.form.ViewElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ViewPortHolder.class,
      property = "viewElement",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public ViewPortHolder getOpViewElementViewPortHolder() {
    return opViewElementViewPortHolder;
  }

  public void setOpViewElementViewPortHolder(
      org.tura.model.designer.repository.serialized.form.ViewPortHolder
          opViewElementViewPortHolder) {
    this.opViewElementViewPortHolder = opViewElementViewPortHolder;
  }

  private String suidStyleElement;

  public String getSuidStyleElement() {
    return suidStyleElement;
  }

  public void setSuidStyleElement(java.lang.String suidStyleElement) {
    this.suidStyleElement = suidStyleElement;
  }

  private Context style;

  @Association(
      id = "b04e4269-0ab9-4463-bc8b-9717bae47ec6",
      from = org.tura.model.designer.repository.serialized.form.StyleElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Context.class,
      property = "opStyleStyleElement",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public Context getStyle() {
    return style;
  }

  public void setStyle(org.tura.model.designer.repository.serialized.form.Context style) {
    this.style = style;
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

  private String nickname;

  public String getNickname() {
    return nickname;
  }

  public void setNickname(java.lang.String nickname) {
    this.nickname = nickname;
  }

  private String suidNickNamed;

  public String getSuidNickNamed() {
    return suidNickNamed;
  }

  public void setSuidNickNamed(java.lang.String suidNickNamed) {
    this.suidNickNamed = suidNickNamed;
  }

  private List<AreaRef> opAreaAreaRef = new ArrayList<>();

  @Association(
      id = "47ccbb30-42b9-45c5-bdbe-b4a840bb9021",
      from = org.tura.model.designer.repository.serialized.form.NickNamed.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.AreaRef.class,
      property = "area",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<AreaRef> getOpAreaAreaRef() {
    return opAreaAreaRef;
  }

  public void setOpAreaAreaRef(java.util.List<AreaRef> opAreaAreaRef) {
    this.opAreaAreaRef = opAreaAreaRef;
  }

  private Integer order;

  public Integer getOrder() {
    return order;
  }

  public void setOrder(java.lang.Integer order) {
    this.order = order;
  }

  private String suidOrderable;

  public String getSuidOrderable() {
    return suidOrderable;
  }

  public void setSuidOrderable(java.lang.String suidOrderable) {
    this.suidOrderable = suidOrderable;
  }

  private String suidFlexFields;

  public String getSuidFlexFields() {
    return suidFlexFields;
  }

  public void setSuidFlexFields(java.lang.String suidFlexFields) {
    this.suidFlexFields = suidFlexFields;
  }

  private List<FlexField> fields = new ArrayList<>();

  @Association(
      id = "6ed5ba2a-8b06-4f91-aef9-83c9c9117dfa",
      from = org.tura.model.designer.repository.serialized.form.FlexFields.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.FlexField.class,
      property = "opFieldsFlexFields",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<FlexField> getFields() {
    return fields;
  }

  public void setFields(java.util.List<FlexField> fields) {
    this.fields = fields;
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
