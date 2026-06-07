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

package org.tura.model.designer.repository.neoj4.artifact;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Artifact implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.artifact.Artifact.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_ARTIFACT")
  private long vArtifact;

  public long getVartifact() {
    return vArtifact;
  }

  public void setVartifact(long vArtifact) {
    this.vArtifact = vArtifact;
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

  @org.neo4j.ogm.annotation.Property(name = "KEY_ID")
  private String keyId;

  public void setKeyId(java.lang.String keyId) {
    this.keyId = keyId;
  }

  public String getKeyId() {
    return keyId;
  }

  @org.neo4j.ogm.annotation.Property(name = "NAME")
  private String name;

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @org.neo4j.ogm.annotation.Property(name = "DESCRIPTION")
  private String description;

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  @org.neo4j.ogm.annotation.Property(name = "TEMPLATE")
  private String template;

  public void setTemplate(java.lang.String template) {
    this.template = template;
  }

  public String getTemplate() {
    return template;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_ARTIFACTS_ARTIFACT_GROUP")
  private String refArtifactsArtifactGroup;

  public void setRefArtifactsArtifactGroup(java.lang.String refArtifactsArtifactGroup) {
    this.refArtifactsArtifactGroup = refArtifactsArtifactGroup;
  }

  public String getRefArtifactsArtifactGroup() {
    return refArtifactsArtifactGroup;
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
