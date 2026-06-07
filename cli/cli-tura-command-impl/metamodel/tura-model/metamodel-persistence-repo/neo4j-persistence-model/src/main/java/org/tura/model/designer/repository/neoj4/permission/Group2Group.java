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
public class Group2Group implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.permission.Group2Group.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_GROUP2GROUP")
  private long vGroup2Group;

  public long getVgroup2Group() {
    return vGroup2Group;
  }

  public void setVgroup2Group(long vGroup2Group) {
    this.vGroup2Group = vGroup2Group;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_GROUP2_GROUPS_ROLES")
  private String refGroup2GroupsRoles;

  public void setRefGroup2GroupsRoles(java.lang.String refGroup2GroupsRoles) {
    this.refGroup2GroupsRoles = refGroup2GroupsRoles;
  }

  public String getRefGroup2GroupsRoles() {
    return refGroup2GroupsRoles;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_GROUP2_GROUP_GROUP")
  private String refOpSourceGroup2GroupGroup;

  public void setRefOpSourceGroup2GroupGroup(java.lang.String refOpSourceGroup2GroupGroup) {
    this.refOpSourceGroup2GroupGroup = refOpSourceGroup2GroupGroup;
  }

  public String getRefOpSourceGroup2GroupGroup() {
    return refOpSourceGroup2GroupGroup;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TARGET_GROUP2_GROUP_GROUP")
  private String refOpTargetGroup2GroupGroup;

  public void setRefOpTargetGroup2GroupGroup(java.lang.String refOpTargetGroup2GroupGroup) {
    this.refOpTargetGroup2GroupGroup = refOpTargetGroup2GroupGroup;
  }

  public String getRefOpTargetGroup2GroupGroup() {
    return refOpTargetGroup2GroupGroup;
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
