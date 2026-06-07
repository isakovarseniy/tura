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
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Component implements Serializable, TypeAware, HTMLLayerHolder, Orderable {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.Component.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_COMPONENT")
  private long vComponent;

  public long getVcomponent() {
    return vComponent;
  }

  public void setVcomponent(long vComponent) {
    this.vComponent = vComponent;
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

  @org.neo4j.ogm.annotation.Property(name = "COMPONENT_ROOT")
  private String componentRoot;

  public void setComponentRoot(java.lang.String componentRoot) {
    this.componentRoot = componentRoot;
  }

  public String getComponentRoot() {
    return componentRoot;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_COMPONENTS_INGREDIENT")
  private String refComponentsIngredient;

  public void setRefComponentsIngredient(java.lang.String refComponentsIngredient) {
    this.refComponentsIngredient = refComponentsIngredient;
  }

  public String getRefComponentsIngredient() {
    return refComponentsIngredient;
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

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
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
}
