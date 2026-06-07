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
public class ConfigExtension implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.ConfigExtension.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_CONFIGEXTENSION")
  private long vConfigExtension;

  public long getVconfigExtension() {
    return vConfigExtension;
  }

  public void setVconfigExtension(long vConfigExtension) {
    this.vConfigExtension = vConfigExtension;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_CONFIG_EXTENSIONS_RECIPES")
  private String refConfigExtensionsRecipes;

  public void setRefConfigExtensionsRecipes(java.lang.String refConfigExtensionsRecipes) {
    this.refConfigExtensionsRecipes = refConfigExtensionsRecipes;
  }

  public String getRefConfigExtensionsRecipes() {
    return refConfigExtensionsRecipes;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_CONFIG_EXTENSION_CONFIGURATION")
  private String refOpSourceConfigExtensionConfiguration;

  public void setRefOpSourceConfigExtensionConfiguration(
      java.lang.String refOpSourceConfigExtensionConfiguration) {
    this.refOpSourceConfigExtensionConfiguration = refOpSourceConfigExtensionConfiguration;
  }

  public String getRefOpSourceConfigExtensionConfiguration() {
    return refOpSourceConfigExtensionConfiguration;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TARGET_CONFIG_EXTENSION_CONFIGURATION")
  private String refOpTargetConfigExtensionConfiguration;

  public void setRefOpTargetConfigExtensionConfiguration(
      java.lang.String refOpTargetConfigExtensionConfiguration) {
    this.refOpTargetConfigExtensionConfiguration = refOpTargetConfigExtensionConfiguration;
  }

  public String getRefOpTargetConfigExtensionConfiguration() {
    return refOpTargetConfigExtensionConfiguration;
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
