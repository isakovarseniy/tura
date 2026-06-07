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

package org.tura.model.designer.repository.neoj4.mapper;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.permission.SecurityEntityPointer;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import java.util.Collection;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class RoleMapper
    implements Serializable, TypeAware, Mapper, SecurityEntityPointer, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.mapper.RoleMapper.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_ROLEMAPPER")
  private long vRoleMapper;

  public long getVroleMapper() {
    return vRoleMapper;
  }

  public void setVroleMapper(long vRoleMapper) {
    this.vRoleMapper = vRoleMapper;
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

  @org.neo4j.ogm.annotation.Property(name = "LOCAL_ROLE_NAME")
  private String localRoleName;

  public void setLocalRoleName(java.lang.String localRoleName) {
    this.localRoleName = localRoleName;
  }

  public String getLocalRoleName() {
    return localRoleName;
  }

  @org.neo4j.ogm.annotation.Property(name = "GLOBAL_ROLE_NAME")
  private String globalRoleName;

  public void setGlobalRoleName(java.lang.String globalRoleName) {
    this.globalRoleName = globalRoleName;
  }

  public String getGlobalRoleName() {
    return globalRoleName;
  }

  public void setSuidMapper(java.lang.String suid) {}

  public String getSuidMapper() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_MAPPERS_MAPPERS")
  private String refMappersMappers;

  public void setRefMappersMappers(java.lang.String refMappersMappers) {
    this.refMappersMappers = refMappersMappers;
  }

  public String getRefMappersMappers() {
    return refMappersMappers;
  }

  @org.neo4j.ogm.annotation.Relationship(
      type = "Mapper_MappingLayer_layers",
      direction = org.neo4j.ogm.annotation.Relationship.Direction.OUTGOING)
  private Collection<MappingLayer> layers;

  public Collection<MappingLayer> getLayers() {
    return layers;
  }

  public void setLayers(java.util.Collection<MappingLayer> layers) {
    this.layers = layers;
  }

  public void setSuidSecurityEntityPointer(java.lang.String suid) {}

  public String getSuidSecurityEntityPointer() {
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
