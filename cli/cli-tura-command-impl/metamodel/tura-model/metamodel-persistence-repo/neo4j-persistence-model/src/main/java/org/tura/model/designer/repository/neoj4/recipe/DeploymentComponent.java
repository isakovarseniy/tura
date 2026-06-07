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
public class DeploymentComponent implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.DeploymentComponent.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_DEPLOYMENTCOMPONENT")
  private long vDeploymentComponent;

  public long getVdeploymentComponent() {
    return vDeploymentComponent;
  }

  public void setVdeploymentComponent(long vDeploymentComponent) {
    this.vDeploymentComponent = vDeploymentComponent;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_DEPLYMENT_STEP_RECIPE")
  private String refDeplymentStepRecipe;

  public void setRefDeplymentStepRecipe(java.lang.String refDeplymentStepRecipe) {
    this.refDeplymentStepRecipe = refDeplymentStepRecipe;
  }

  public String getRefDeplymentStepRecipe() {
    return refDeplymentStepRecipe;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_MAPPER_DEPLOYMENT_COMPONENT_MODEL_MAPPER")
  private String refOpMapperDeploymentComponentModelMapper;

  public void setRefOpMapperDeploymentComponentModelMapper(
      java.lang.String refOpMapperDeploymentComponentModelMapper) {
    this.refOpMapperDeploymentComponentModelMapper = refOpMapperDeploymentComponentModelMapper;
  }

  public String getRefOpMapperDeploymentComponentModelMapper() {
    return refOpMapperDeploymentComponentModelMapper;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_DEPLOYMENT_COMPONENT_LINK_DEPLOYMENT_COMPONENT")
  private String refDeploymentComponentLinkDeploymentComponent;

  public void setRefDeploymentComponentLinkDeploymentComponent(
      java.lang.String refDeploymentComponentLinkDeploymentComponent) {
    this.refDeploymentComponentLinkDeploymentComponent =
        refDeploymentComponentLinkDeploymentComponent;
  }

  public String getRefDeploymentComponentLinkDeploymentComponent() {
    return refDeploymentComponentLinkDeploymentComponent;
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
