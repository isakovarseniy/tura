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
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Recipe2Infrastructure implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.Recipe2Infrastructure.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_RECIPE2INFRASTRUCTURE")
  private long vRecipe2Infrastructure;

  public long getVrecipe2Infrastructure() {
    return vRecipe2Infrastructure;
  }

  public void setVrecipe2Infrastructure(long vRecipe2Infrastructure) {
    this.vRecipe2Infrastructure = vRecipe2Infrastructure;
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

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_RECIPE2_INFRASTRUCTURES_RECIPES")
  private String refRecipe2InfrastructuresRecipes;

  public void setRefRecipe2InfrastructuresRecipes(
      java.lang.String refRecipe2InfrastructuresRecipes) {
    this.refRecipe2InfrastructuresRecipes = refRecipe2InfrastructuresRecipes;
  }

  public String getRefRecipe2InfrastructuresRecipes() {
    return refRecipe2InfrastructuresRecipes;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_RECIPE2_INFRASTRUCTURE_RECIPE")
  private String refOpSourceRecipe2InfrastructureRecipe;

  public void setRefOpSourceRecipe2InfrastructureRecipe(
      java.lang.String refOpSourceRecipe2InfrastructureRecipe) {
    this.refOpSourceRecipe2InfrastructureRecipe = refOpSourceRecipe2InfrastructureRecipe;
  }

  public String getRefOpSourceRecipe2InfrastructureRecipe() {
    return refOpSourceRecipe2InfrastructureRecipe;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TARGET_RECIPE2_INFRASTRUCTURE_INFRASTRUCTURE")
  private String refOpTargetRecipe2InfrastructureInfrastructure;

  public void setRefOpTargetRecipe2InfrastructureInfrastructure(
      java.lang.String refOpTargetRecipe2InfrastructureInfrastructure) {
    this.refOpTargetRecipe2InfrastructureInfrastructure =
        refOpTargetRecipe2InfrastructureInfrastructure;
  }

  public String getRefOpTargetRecipe2InfrastructureInfrastructure() {
    return refOpTargetRecipe2InfrastructureInfrastructure;
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
