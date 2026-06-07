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

package org.tura.model.designer.repository.neoj4.recipe;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.common.HTMLLayerHolder;
import org.tura.model.designer.repository.neoj4.common.Orderable;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.tura.model.designer.repository.neoj4.mapper.MappingLayer;
import java.util.Collection;
import org.tura.model.designer.repository.neoj4.mapper.Mappers;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Ingredient
    implements Serializable, TypeAware, UsingMappers, HTMLLayerHolder, Orderable, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.Ingredient.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_INGREDIENT")
  private long vIngredient;

  public long getVingredient() {
    return vIngredient;
  }

  public void setVingredient(long vIngredient) {
    this.vIngredient = vIngredient;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @org.neo4j.ogm.annotation.Property(name = "NAME")
  private String name;

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @org.neo4j.ogm.annotation.Property(name = "SKIP")
  private Boolean skip;

  public void setSkip(java.lang.Boolean skip) {
    this.skip = skip;
  }

  public Boolean getSkip() {
    return skip;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_INGREDIENTS_RECIPE")
  private String refIngredientsRecipe;

  public void setRefIngredientsRecipe(java.lang.String refIngredientsRecipe) {
    this.refIngredientsRecipe = refIngredientsRecipe;
  }

  public String getRefIngredientsRecipe() {
    return refIngredientsRecipe;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_CONTROLLER_LAYER_INGREDIENT_MAPPING_LAYER")
  private String refOpControllerLayerIngredientMappingLayer;

  public void setRefOpControllerLayerIngredientMappingLayer(
      java.lang.String refOpControllerLayerIngredientMappingLayer) {
    this.refOpControllerLayerIngredientMappingLayer = refOpControllerLayerIngredientMappingLayer;
  }

  public String getRefOpControllerLayerIngredientMappingLayer() {
    return refOpControllerLayerIngredientMappingLayer;
  }

  @org.neo4j.ogm.annotation.Relationship(
      type = "Ingredient_MappingLayer_vewLayer",
      direction = org.neo4j.ogm.annotation.Relationship.Direction.OUTGOING)
  private Collection<MappingLayer> vewLayer;

  public Collection<MappingLayer> getVewLayer() {
    return vewLayer;
  }

  public void setVewLayer(java.util.Collection<MappingLayer> vewLayer) {
    this.vewLayer = vewLayer;
  }

  @org.neo4j.ogm.annotation.Relationship(
      type = "Ingredient_MappingLayer_modelLayer",
      direction = org.neo4j.ogm.annotation.Relationship.Direction.OUTGOING)
  private Collection<MappingLayer> modelLayer;

  public Collection<MappingLayer> getModelLayer() {
    return modelLayer;
  }

  public void setModelLayer(java.util.Collection<MappingLayer> modelLayer) {
    this.modelLayer = modelLayer;
  }

  public void setSuidUsingMappers(java.lang.String suid) {}

  public String getSuidUsingMappers() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  @org.neo4j.ogm.annotation.Relationship(
      type = "UsingMappers_Mappers_mappers",
      direction = org.neo4j.ogm.annotation.Relationship.Direction.OUTGOING)
  private Collection<Mappers> mappers;

  public Collection<Mappers> getMappers() {
    return mappers;
  }

  public void setMappers(java.util.Collection<Mappers> mappers) {
    this.mappers = mappers;
  }

  @org.neo4j.ogm.annotation.Property(name = "COLUMNS")
  private Integer columns;

  public void setColumns(java.lang.Integer columns) {
    this.columns = columns;
  }

  public Integer getColumns() {
    return columns;
  }

  public void setSuidHTMLLayerHolder(java.lang.String suid) {}

  public String getSuidHTMLLayerHolder() {
    return this.suid;
  }

  @org.neo4j.ogm.annotation.Property(name = "ORDER_")
  private Integer order;

  public void setOrder(java.lang.Integer order) {
    this.order = order;
  }

  public Integer getOrder() {
    return order;
  }

  public void setSuidOrderable(java.lang.String suid) {}

  public String getSuidOrderable() {
    return this.suid;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
