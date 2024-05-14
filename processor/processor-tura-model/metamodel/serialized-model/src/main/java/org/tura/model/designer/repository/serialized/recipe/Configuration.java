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
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
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
public class Configuration implements Serializable, MetaObject {

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

  private String transientrefConfigurationsRecipes;

  public String getTransientrefConfigurationsRecipes() {
    return transientrefConfigurationsRecipes;
  }

  public void setTransientrefConfigurationsRecipes(
      java.lang.String transientrefConfigurationsRecipes) {
    this.transientrefConfigurationsRecipes = transientrefConfigurationsRecipes;
  }

  private List<ConfigExtension> opSourceConfigExtension = new ArrayList<>();

  @Association(
      id = "854ac002-634d-4043-aedb-4f6b0f534462",
      from = org.tura.model.designer.repository.serialized.recipe.Configuration.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.ConfigExtension.class,
      property = "source",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ConfigExtension> getOpSourceConfigExtension() {
    return opSourceConfigExtension;
  }

  public void setOpSourceConfigExtension(java.util.List<ConfigExtension> opSourceConfigExtension) {
    this.opSourceConfigExtension = opSourceConfigExtension;
  }

  private List<ConfigExtension> opTargetConfigExtension = new ArrayList<>();

  @Association(
      id = "09d7e93c-8296-4a1a-9f44-c1835ded4c8b",
      from = org.tura.model.designer.repository.serialized.recipe.Configuration.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.ConfigExtension.class,
      property = "target",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ConfigExtension> getOpTargetConfigExtension() {
    return opTargetConfigExtension;
  }

  public void setOpTargetConfigExtension(java.util.List<ConfigExtension> opTargetConfigExtension) {
    this.opTargetConfigExtension = opTargetConfigExtension;
  }

  private List<Infrastructure2Configuration> opTargetInfrastructure2Configuration =
      new ArrayList<>();

  @Association(
      id = "625e509b-e18d-4641-b37d-9ded0683c657",
      from = org.tura.model.designer.repository.serialized.recipe.Configuration.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration.class,
      property = "target",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Infrastructure2Configuration> getOpTargetInfrastructure2Configuration() {
    return opTargetInfrastructure2Configuration;
  }

  public void setOpTargetInfrastructure2Configuration(
      java.util.List<Infrastructure2Configuration> opTargetInfrastructure2Configuration) {
    this.opTargetInfrastructure2Configuration = opTargetInfrastructure2Configuration;
  }

  private List<Property> properties = new ArrayList<>();

  @Association(
      id = "0de8e383-c2a8-4a70-9161-5d968c3ac72c",
      from = org.tura.model.designer.repository.serialized.recipe.Configuration.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.Property.class,
      property = "opPropertiesConfiguration",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(java.util.List<Property> properties) {
    this.properties = properties;
  }

  private List<HashProperty> hashProperties = new ArrayList<>();

  @Association(
      id = "a914668f-7037-4682-8ac7-81cb0b657ac6",
      from = org.tura.model.designer.repository.serialized.recipe.Configuration.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.HashProperty.class,
      property = "opHashPropertiesConfiguration",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<HashProperty> getHashProperties() {
    return hashProperties;
  }

  public void setHashProperties(java.util.List<HashProperty> hashProperties) {
    this.hashProperties = hashProperties;
  }

  private Recipes opConfigurationsRecipes;

  @Association(
      id = "ccb8274c-950e-4eca-9048-6f12e4476746",
      from = org.tura.model.designer.repository.serialized.recipe.Configuration.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.Recipes.class,
      property = "configurations",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Recipes getOpConfigurationsRecipes() {
    return opConfigurationsRecipes;
  }

  public void setOpConfigurationsRecipes(
      org.tura.model.designer.repository.serialized.recipe.Recipes opConfigurationsRecipes) {
    this.opConfigurationsRecipes = opConfigurationsRecipes;
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
