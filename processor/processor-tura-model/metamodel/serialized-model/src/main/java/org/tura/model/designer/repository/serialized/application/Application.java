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

package org.tura.model.designer.repository.serialized.application;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import org.tura.platform.repository.core.annotation.Association;
import java.util.ArrayList;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import java.util.List;
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
public class Application implements Serializable, MetaObject {

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

  private String transientrefApplicationsApplicationGroup;

  public String getTransientrefApplicationsApplicationGroup() {
    return transientrefApplicationsApplicationGroup;
  }

  public void setTransientrefApplicationsApplicationGroup(
      java.lang.String transientrefApplicationsApplicationGroup) {
    this.transientrefApplicationsApplicationGroup = transientrefApplicationsApplicationGroup;
  }

  private ApplicationRecipes applicationRecipes;

  @Association(
      id = "c1e6b3d4-ac0e-4c52-b53f-bbe96847dfb2",
      from = org.tura.model.designer.repository.serialized.application.Application.class,
      mappedBy = org.tura.model.designer.repository.serialized.application.ApplicationRecipes.class,
      property = "opApplicationRecipesApplication",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public ApplicationRecipes getApplicationRecipes() {
    return applicationRecipes;
  }

  public void setApplicationRecipes(
      org.tura.model.designer.repository.serialized.application.ApplicationRecipes
          applicationRecipes) {
    this.applicationRecipes = applicationRecipes;
  }

  private ApplicationMappers applicationMappers;

  @Association(
      id = "6bbce106-d5ed-494b-b88e-73849b45b754",
      from = org.tura.model.designer.repository.serialized.application.Application.class,
      mappedBy = org.tura.model.designer.repository.serialized.application.ApplicationMappers.class,
      property = "opApplicationMappersApplication",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public ApplicationMappers getApplicationMappers() {
    return applicationMappers;
  }

  public void setApplicationMappers(
      org.tura.model.designer.repository.serialized.application.ApplicationMappers
          applicationMappers) {
    this.applicationMappers = applicationMappers;
  }

  private ApplicationUILayer applicationUILayer;

  @Association(
      id = "8e71e79d-299c-4fbf-86eb-d5a190caa7e0",
      from = org.tura.model.designer.repository.serialized.application.Application.class,
      mappedBy = org.tura.model.designer.repository.serialized.application.ApplicationUILayer.class,
      property = "opApplicationUILayerApplication",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public ApplicationUILayer getApplicationUILayer() {
    return applicationUILayer;
  }

  public void setApplicationUILayer(
      org.tura.model.designer.repository.serialized.application.ApplicationUILayer
          applicationUILayer) {
    this.applicationUILayer = applicationUILayer;
  }

  private ApplicationInfrastructureLayers applicationInfrastructureLayer;

  @Association(
      id = "33879856-0809-43fa-905f-c3ec8a1cc9bd",
      from = org.tura.model.designer.repository.serialized.application.Application.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayers
              .class,
      property = "opApplicationInfrastructureLayerApplication",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public ApplicationInfrastructureLayers getApplicationInfrastructureLayer() {
    return applicationInfrastructureLayer;
  }

  public void setApplicationInfrastructureLayer(
      org.tura.model.designer.repository.serialized.application.ApplicationInfrastructureLayers
          applicationInfrastructureLayer) {
    this.applicationInfrastructureLayer = applicationInfrastructureLayer;
  }

  private ApplicationStyleLibraries applicationStyle;

  @Association(
      id = "14d5d068-3baf-42d4-b68e-5a5111f21350",
      from = org.tura.model.designer.repository.serialized.application.Application.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.application.ApplicationStyleLibraries.class,
      property = "opApplicationStyleApplication",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public ApplicationStyleLibraries getApplicationStyle() {
    return applicationStyle;
  }

  public void setApplicationStyle(
      org.tura.model.designer.repository.serialized.application.ApplicationStyleLibraries
          applicationStyle) {
    this.applicationStyle = applicationStyle;
  }

  private ApplicationRealms applicationRole;

  @Association(
      id = "016675f7-d41e-4e5e-97b9-4376b3ed3bbf",
      from = org.tura.model.designer.repository.serialized.application.Application.class,
      mappedBy = org.tura.model.designer.repository.serialized.application.ApplicationRealms.class,
      property = "opApplicationRoleApplication",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public ApplicationRealms getApplicationRole() {
    return applicationRole;
  }

  public void setApplicationRole(
      org.tura.model.designer.repository.serialized.application.ApplicationRealms applicationRole) {
    this.applicationRole = applicationRole;
  }

  private ApplicationMessageLibraries applicationMessages;

  @Association(
      id = "c1fe3b01-0cf1-40ae-bc5e-de5b4e299e16",
      from = org.tura.model.designer.repository.serialized.application.Application.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.application.ApplicationMessageLibraries
              .class,
      property = "opApplicationMessagesApplication",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public ApplicationMessageLibraries getApplicationMessages() {
    return applicationMessages;
  }

  public void setApplicationMessages(
      org.tura.model.designer.repository.serialized.application.ApplicationMessageLibraries
          applicationMessages) {
    this.applicationMessages = applicationMessages;
  }

  private ApplicationGroup opApplicationsApplicationGroup;

  @Association(
      id = "cff20bcc-1e72-4fac-b037-3d96d73ca2cc",
      from = org.tura.model.designer.repository.serialized.application.Application.class,
      mappedBy = org.tura.model.designer.repository.serialized.application.ApplicationGroup.class,
      property = "applications",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public ApplicationGroup getOpApplicationsApplicationGroup() {
    return opApplicationsApplicationGroup;
  }

  public void setOpApplicationsApplicationGroup(
      org.tura.model.designer.repository.serialized.application.ApplicationGroup
          opApplicationsApplicationGroup) {
    this.opApplicationsApplicationGroup = opApplicationsApplicationGroup;
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
