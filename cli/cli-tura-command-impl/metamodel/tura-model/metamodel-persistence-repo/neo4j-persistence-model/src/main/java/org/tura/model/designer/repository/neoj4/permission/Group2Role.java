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
public class Group2Role implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.permission.Group2Role.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_GROUP2ROLE")
  private long vGroup2Role;

  public long getVgroup2Role() {
    return vGroup2Role;
  }

  public void setVgroup2Role(long vGroup2Role) {
    this.vGroup2Role = vGroup2Role;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_GROUP2_ROLES_ROLES")
  private String refGroup2RolesRoles;

  public void setRefGroup2RolesRoles(java.lang.String refGroup2RolesRoles) {
    this.refGroup2RolesRoles = refGroup2RolesRoles;
  }

  public String getRefGroup2RolesRoles() {
    return refGroup2RolesRoles;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_GROUP2_ROLE_GROUP")
  private String refOpSourceGroup2RoleGroup;

  public void setRefOpSourceGroup2RoleGroup(java.lang.String refOpSourceGroup2RoleGroup) {
    this.refOpSourceGroup2RoleGroup = refOpSourceGroup2RoleGroup;
  }

  public String getRefOpSourceGroup2RoleGroup() {
    return refOpSourceGroup2RoleGroup;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TARGET_GROUP2_ROLE_ROLE")
  private String refOpTargetGroup2RoleRole;

  public void setRefOpTargetGroup2RoleRole(java.lang.String refOpTargetGroup2RoleRole) {
    this.refOpTargetGroup2RoleRole = refOpTargetGroup2RoleRole;
  }

  public String getRefOpTargetGroup2RoleRole() {
    return refOpTargetGroup2RoleRole;
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
