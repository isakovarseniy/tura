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

package org.tura.model.designer.repository.neoj4.mapper;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.tura.model.designer.repository.neoj4.recipe.Ingredient;
import java.util.Collection;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class MappingLayer implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.mapper.MappingLayer.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_MAPPINGLAYER")
  private long vMappingLayer;

  public long getVmappingLayer() {
    return vMappingLayer;
  }

  public void setVmappingLayer(long vMappingLayer) {
    this.vMappingLayer = vMappingLayer;
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

  @org.neo4j.ogm.annotation.Property(name = "ORDER_")
  private Integer order;

  public void setOrder(java.lang.Integer order) {
    this.order = order;
  }

  public Integer getOrder() {
    return order;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_APP_LAYERS_APPLICATION_MAPPERS")
  private String refAppLayersApplicationMappers;

  public void setRefAppLayersApplicationMappers(java.lang.String refAppLayersApplicationMappers) {
    this.refAppLayersApplicationMappers = refAppLayersApplicationMappers;
  }

  public String getRefAppLayersApplicationMappers() {
    return refAppLayersApplicationMappers;
  }

  @org.neo4j.ogm.annotation.Relationship(
      type = "MappingLayer_Ingredient_opVewLayerIngredient",
      direction = org.neo4j.ogm.annotation.Relationship.Direction.OUTGOING)
  private Collection<Ingredient> opVewLayerIngredient;

  public Collection<Ingredient> getOpVewLayerIngredient() {
    return opVewLayerIngredient;
  }

  public void setOpVewLayerIngredient(java.util.Collection<Ingredient> opVewLayerIngredient) {
    this.opVewLayerIngredient = opVewLayerIngredient;
  }

  @org.neo4j.ogm.annotation.Relationship(
      type = "MappingLayer_Ingredient_opModelLayerIngredient",
      direction = org.neo4j.ogm.annotation.Relationship.Direction.OUTGOING)
  private Collection<Ingredient> opModelLayerIngredient;

  public Collection<Ingredient> getOpModelLayerIngredient() {
    return opModelLayerIngredient;
  }

  public void setOpModelLayerIngredient(java.util.Collection<Ingredient> opModelLayerIngredient) {
    this.opModelLayerIngredient = opModelLayerIngredient;
  }

  @org.neo4j.ogm.annotation.Relationship(
      type = "MappingLayer_Mapper_opLayersMapper",
      direction = org.neo4j.ogm.annotation.Relationship.Direction.OUTGOING)
  private Collection<Mapper> opLayersMapper;

  public Collection<Mapper> getOpLayersMapper() {
    return opLayersMapper;
  }

  public void setOpLayersMapper(java.util.Collection<Mapper> opLayersMapper) {
    this.opLayersMapper = opLayersMapper;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }
}
