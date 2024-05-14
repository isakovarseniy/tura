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
import org.tura.model.designer.repository.serialized.common.HTMLLayerHolder;
import org.tura.model.designer.repository.serialized.common.Orderable;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.JavaComponent.class,
      name = "JavaComponent"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent.class,
      name = "JavaScriptComponent")
})
public class Component implements Serializable, HTMLLayerHolder, Orderable {

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

  private Boolean skip;

  public Boolean getSkip() {
    return skip;
  }

  public void setSkip(java.lang.Boolean skip) {
    this.skip = skip;
  }

  private String componentRoot;

  public String getComponentRoot() {
    return componentRoot;
  }

  public void setComponentRoot(java.lang.String componentRoot) {
    this.componentRoot = componentRoot;
  }

  private String transientrefComponentsIngredient;

  public String getTransientrefComponentsIngredient() {
    return transientrefComponentsIngredient;
  }

  public void setTransientrefComponentsIngredient(
      java.lang.String transientrefComponentsIngredient) {
    this.transientrefComponentsIngredient = transientrefComponentsIngredient;
  }

  private List<ModelMapper> mappers = new ArrayList<>();

  @Association(
      id = "987b78ff-dc9a-4550-9450-a880c3e1fb54",
      from = org.tura.model.designer.repository.serialized.recipe.Component.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.ModelMapper.class,
      property = "opMappersComponent",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ModelMapper> getMappers() {
    return mappers;
  }

  public void setMappers(java.util.List<ModelMapper> mappers) {
    this.mappers = mappers;
  }

  private Ingredient opComponentsIngredient;

  @Association(
      id = "5f13554a-0d83-468a-9081-e85ad586322c",
      from = org.tura.model.designer.repository.serialized.recipe.Component.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.Ingredient.class,
      property = "components",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Ingredient getOpComponentsIngredient() {
    return opComponentsIngredient;
  }

  public void setOpComponentsIngredient(
      org.tura.model.designer.repository.serialized.recipe.Ingredient opComponentsIngredient) {
    this.opComponentsIngredient = opComponentsIngredient;
  }

  private Integer columns;

  public Integer getColumns() {
    return columns;
  }

  public void setColumns(java.lang.Integer columns) {
    this.columns = columns;
  }

  private String suidHTMLLayerHolder;

  public String getSuidHTMLLayerHolder() {
    return suidHTMLLayerHolder;
  }

  public void setSuidHTMLLayerHolder(java.lang.String suidHTMLLayerHolder) {
    this.suidHTMLLayerHolder = suidHTMLLayerHolder;
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
}
