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
public class Infrastructure2Configuration implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.Infrastructure2Configuration.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_INFRASTRUCTURE2CONFIGURATION")
  private long vInfrastructure2Configuration;

  public long getVinfrastructure2Configuration() {
    return vInfrastructure2Configuration;
  }

  public void setVinfrastructure2Configuration(long vInfrastructure2Configuration) {
    this.vInfrastructure2Configuration = vInfrastructure2Configuration;
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

  @org.neo4j.ogm.annotation.Property(name = "CONFIG_BRANCH")
  private String configBranch;

  public void setConfigBranch(java.lang.String configBranch) {
    this.configBranch = configBranch;
  }

  public String getConfigBranch() {
    return configBranch;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_INFRASTRUCTURE2_CONFIGURATIONS_RECIPES")
  private String refInfrastructure2ConfigurationsRecipes;

  public void setRefInfrastructure2ConfigurationsRecipes(
      java.lang.String refInfrastructure2ConfigurationsRecipes) {
    this.refInfrastructure2ConfigurationsRecipes = refInfrastructure2ConfigurationsRecipes;
  }

  public String getRefInfrastructure2ConfigurationsRecipes() {
    return refInfrastructure2ConfigurationsRecipes;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(
      name = "REF_OP_SOURCE_INFRASTRUCTURE2_CONFIGURATION_INFRASTRUCTURE")
  private String refOpSourceInfrastructure2ConfigurationInfrastructure;

  public void setRefOpSourceInfrastructure2ConfigurationInfrastructure(
      java.lang.String refOpSourceInfrastructure2ConfigurationInfrastructure) {
    this.refOpSourceInfrastructure2ConfigurationInfrastructure =
        refOpSourceInfrastructure2ConfigurationInfrastructure;
  }

  public String getRefOpSourceInfrastructure2ConfigurationInfrastructure() {
    return refOpSourceInfrastructure2ConfigurationInfrastructure;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(
      name = "REF_OP_TARGET_INFRASTRUCTURE2_CONFIGURATION_CONFIGURATION")
  private String refOpTargetInfrastructure2ConfigurationConfiguration;

  public void setRefOpTargetInfrastructure2ConfigurationConfiguration(
      java.lang.String refOpTargetInfrastructure2ConfigurationConfiguration) {
    this.refOpTargetInfrastructure2ConfigurationConfiguration =
        refOpTargetInfrastructure2ConfigurationConfiguration;
  }

  public String getRefOpTargetInfrastructure2ConfigurationConfiguration() {
    return refOpTargetInfrastructure2ConfigurationConfiguration;
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
