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
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Link implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.type.Link.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_LINK")
  private long vLink;

  public long getVlink() {
    return vLink;
  }

  public void setVlink(long vLink) {
    this.vLink = vLink;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_LINKS_ASSOSIATION")
  private String refLinksAssosiation;

  public void setRefLinksAssosiation(java.lang.String refLinksAssosiation) {
    this.refLinksAssosiation = refLinksAssosiation;
  }

  public String getRefLinksAssosiation() {
    return refLinksAssosiation;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_MASTER_FIELD_LINK_ATTRIBUTE")
  private String refOpMasterFieldLinkAttribute;

  public void setRefOpMasterFieldLinkAttribute(java.lang.String refOpMasterFieldLinkAttribute) {
    this.refOpMasterFieldLinkAttribute = refOpMasterFieldLinkAttribute;
  }

  public String getRefOpMasterFieldLinkAttribute() {
    return refOpMasterFieldLinkAttribute;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_DETAIL_FIELD_LINK_ATTRIBUTE")
  private String refOpDetailFieldLinkAttribute;

  public void setRefOpDetailFieldLinkAttribute(java.lang.String refOpDetailFieldLinkAttribute) {
    this.refOpDetailFieldLinkAttribute = refOpDetailFieldLinkAttribute;
  }

  public String getRefOpDetailFieldLinkAttribute() {
    return refOpDetailFieldLinkAttribute;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_LINKS_RELATION")
  private String refLinksRelation;

  public void setRefLinksRelation(java.lang.String refLinksRelation) {
    this.refLinksRelation = refLinksRelation;
  }

  public String getRefLinksRelation() {
    return refLinksRelation;
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
