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
public class TechLeaf implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.artifact.TechLeaf.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_TECHLEAF")
  private long vTechLeaf;

  public long getVtechLeaf() {
    return vTechLeaf;
  }

  public void setVtechLeaf(long vTechLeaf) {
    this.vTechLeaf = vTechLeaf;
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

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_TECH_LEAFS_DOMAIN_ARTIFACTS")
  private String refTechLeafsDomainArtifacts;

  public void setRefTechLeafsDomainArtifacts(java.lang.String refTechLeafsDomainArtifacts) {
    this.refTechLeafsDomainArtifacts = refTechLeafsDomainArtifacts;
  }

  public String getRefTechLeafsDomainArtifacts() {
    return refTechLeafsDomainArtifacts;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_TECH_LEAFS_TECH_LEAF")
  private String refTechLeafsTechLeaf;

  public void setRefTechLeafsTechLeaf(java.lang.String refTechLeafsTechLeaf) {
    this.refTechLeafsTechLeaf = refTechLeafsTechLeaf;
  }

  public String getRefTechLeafsTechLeaf() {
    return refTechLeafsTechLeaf;
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
