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

package org.tura.model.designer.repository.neoj4.type;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.artifact.Categorized;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Relationship implements Serializable, TypeAware, Categorized {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.type.Relationship.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_RELATIONSHIP")
  private long vRelationship;

  public long getVrelationship() {
    return vRelationship;
  }

  public void setVrelationship(long vRelationship) {
    this.vRelationship = vRelationship;
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

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_RELATIONSHIPS_TYPE_GROUP")
  private String refRelationshipsTypeGroup;

  public void setRefRelationshipsTypeGroup(java.lang.String refRelationshipsTypeGroup) {
    this.refRelationshipsTypeGroup = refRelationshipsTypeGroup;
  }

  public String getRefRelationshipsTypeGroup() {
    return refRelationshipsTypeGroup;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_RELATIONSHIP_TYPE_ELEMENT")
  private String refOpSourceRelationshipTypeElement;

  public void setRefOpSourceRelationshipTypeElement(
      java.lang.String refOpSourceRelationshipTypeElement) {
    this.refOpSourceRelationshipTypeElement = refOpSourceRelationshipTypeElement;
  }

  public String getRefOpSourceRelationshipTypeElement() {
    return refOpSourceRelationshipTypeElement;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TARGET_RELATIONSHIP_TYPE_ELEMENT")
  private String refOpTargetRelationshipTypeElement;

  public void setRefOpTargetRelationshipTypeElement(
      java.lang.String refOpTargetRelationshipTypeElement) {
    this.refOpTargetRelationshipTypeElement = refOpTargetRelationshipTypeElement;
  }

  public String getRefOpTargetRelationshipTypeElement() {
    return refOpTargetRelationshipTypeElement;
  }

  public void setSuidCategorized(java.lang.String suid) {}

  public String getSuidCategorized() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }
}
