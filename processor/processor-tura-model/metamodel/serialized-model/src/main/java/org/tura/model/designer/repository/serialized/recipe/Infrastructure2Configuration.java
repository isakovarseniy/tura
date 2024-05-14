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
public class Infrastructure2Configuration implements Serializable, MetaObject {

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

  private String configBranch;

  public String getConfigBranch() {
    return configBranch;
  }

  public void setConfigBranch(java.lang.String configBranch) {
    this.configBranch = configBranch;
  }

  private String transientrefInfrastructure2ConfigurationsRecipes;

  public String getTransientrefInfrastructure2ConfigurationsRecipes() {
    return transientrefInfrastructure2ConfigurationsRecipes;
  }

  public void setTransientrefInfrastructure2ConfigurationsRecipes(
      java.lang.String transientrefInfrastructure2ConfigurationsRecipes) {
    this.transientrefInfrastructure2ConfigurationsRecipes =
        transientrefInfrastructure2ConfigurationsRecipes;
  }

  private String transientrefOpSourceInfrastructure2ConfigurationInfrastructure;

  public String getTransientrefOpSourceInfrastructure2ConfigurationInfrastructure() {
    return transientrefOpSourceInfrastructure2ConfigurationInfrastructure;
  }

  public void setTransientrefOpSourceInfrastructure2ConfigurationInfrastructure(
      java.lang.String transientrefOpSourceInfrastructure2ConfigurationInfrastructure) {
    this.transientrefOpSourceInfrastructure2ConfigurationInfrastructure =
        transientrefOpSourceInfrastructure2ConfigurationInfrastructure;
  }

  private String transientrefOpTargetInfrastructure2ConfigurationConfiguration;

  public String getTransientrefOpTargetInfrastructure2ConfigurationConfiguration() {
    return transientrefOpTargetInfrastructure2ConfigurationConfiguration;
  }

  public void setTransientrefOpTargetInfrastructure2ConfigurationConfiguration(
      java.lang.String transientrefOpTargetInfrastructure2ConfigurationConfiguration) {
    this.transientrefOpTargetInfrastructure2ConfigurationConfiguration =
        transientrefOpTargetInfrastructure2ConfigurationConfiguration;
  }

  private Recipes opInfrastructure2ConfigurationsRecipes;

  @Association(
      id = "8dd6b7d1-e6a5-4bcf-bc62-dad89e2a92e6",
      from =
          org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.Recipes.class,
      property = "infrastructure2Configurations",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Recipes getOpInfrastructure2ConfigurationsRecipes() {
    return opInfrastructure2ConfigurationsRecipes;
  }

  public void setOpInfrastructure2ConfigurationsRecipes(
      org.tura.model.designer.repository.serialized.recipe.Recipes
          opInfrastructure2ConfigurationsRecipes) {
    this.opInfrastructure2ConfigurationsRecipes = opInfrastructure2ConfigurationsRecipes;
  }

  private Infrastructure source;

  @Association(
      id = "c0ca8344-484a-41be-9d7e-dbfa0759ed58",
      from =
          org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.Infrastructure.class,
      property = "opSourceInfrastructure2Configuration",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Infrastructure getSource() {
    return source;
  }

  public void setSource(
      org.tura.model.designer.repository.serialized.recipe.Infrastructure source) {
    this.source = source;
  }

  private Configuration target;

  @Association(
      id = "625e509b-e18d-4641-b37d-9ded0683c657",
      from =
          org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.Configuration.class,
      property = "opTargetInfrastructure2Configuration",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Configuration getTarget() {
    return target;
  }

  public void setTarget(org.tura.model.designer.repository.serialized.recipe.Configuration target) {
    this.target = target;
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
