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

package org.tura.model.designer.repository.neoj4.permission;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class GrantAccess implements Serializable, TypeAware, SecurityEntityPointer, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.permission.GrantAccess.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_GRANTACCESS")
  private long vGrantAccess;

  public long getVgrantAccess() {
    return vGrantAccess;
  }

  public void setVgrantAccess(long vGrantAccess) {
    this.vGrantAccess = vGrantAccess;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_GRANTS_SECURED")
  private String refGrantsSecured;

  public void setRefGrantsSecured(java.lang.String refGrantsSecured) {
    this.refGrantsSecured = refGrantsSecured;
  }

  public String getRefGrantsSecured() {
    return refGrantsSecured;
  }

  public void setSuidSecurityEntityPointer(java.lang.String suid) {}

  public String getSuidSecurityEntityPointer() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(
      name = "REF_OP_SECURITY_ENTITY_SECURITY_ENTITY_POINTER_SECURITY_ENTITY")
  private String refOpSecurityEntitySecurityEntityPointerSecurityEntity;

  public void setRefOpSecurityEntitySecurityEntityPointerSecurityEntity(
      java.lang.String refOpSecurityEntitySecurityEntityPointerSecurityEntity) {
    this.refOpSecurityEntitySecurityEntityPointerSecurityEntity =
        refOpSecurityEntitySecurityEntityPointerSecurityEntity;
  }

  public String getRefOpSecurityEntitySecurityEntityPointerSecurityEntity() {
    return refOpSecurityEntitySecurityEntityPointerSecurityEntity;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
