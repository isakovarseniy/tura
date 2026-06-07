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
import org.tura.model.designer.repository.neoj4.common.Orderable;
import org.tura.model.designer.repository.neoj4.artifact.Categorized;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ModelMapper
    implements Serializable, TypeAware, ArtifactRef, Orderable, Categorized, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.ModelMapper.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_MODELMAPPER")
  private long vModelMapper;

  public long getVmodelMapper() {
    return vModelMapper;
  }

  public void setVmodelMapper(long vModelMapper) {
    this.vModelMapper = vModelMapper;
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

  @org.neo4j.ogm.annotation.Property(name = "ARTIFACT_ROOT")
  private String artifactRoot;

  public void setArtifactRoot(java.lang.String artifactRoot) {
    this.artifactRoot = artifactRoot;
  }

  public String getArtifactRoot() {
    return artifactRoot;
  }

  @org.neo4j.ogm.annotation.Property(name = "SKIP")
  private Boolean skip;

  public void setSkip(java.lang.Boolean skip) {
    this.skip = skip;
  }

  public Boolean getSkip() {
    return skip;
  }

  @org.neo4j.ogm.annotation.Property(name = "ARTIFACT_EXTENSION")
  private String artifactExtension;

  public void setArtifactExtension(java.lang.String artifactExtension) {
    this.artifactExtension = artifactExtension;
  }

  public String getArtifactExtension() {
    return artifactExtension;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_MAPPERS_COMPONENT")
  private String refMappersComponent;

  public void setRefMappersComponent(java.lang.String refMappersComponent) {
    this.refMappersComponent = refMappersComponent;
  }

  public String getRefMappersComponent() {
    return refMappersComponent;
  }

  public void setSuidArtifactRef(java.lang.String suid) {}

  public String getSuidArtifactRef() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_ARTIFACT_REF_ARTIFACT_REF_ARTIFACT")
  private String refOpArtifactRefArtifactRefArtifact;

  public void setRefOpArtifactRefArtifactRefArtifact(
      java.lang.String refOpArtifactRefArtifactRefArtifact) {
    this.refOpArtifactRefArtifactRefArtifact = refOpArtifactRefArtifactRefArtifact;
  }

  public String getRefOpArtifactRefArtifactRefArtifact() {
    return refOpArtifactRefArtifactRefArtifact;
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

  public void setSuidCategorized(java.lang.String suid) {}

  public String getSuidCategorized() {
    return this.suid;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
