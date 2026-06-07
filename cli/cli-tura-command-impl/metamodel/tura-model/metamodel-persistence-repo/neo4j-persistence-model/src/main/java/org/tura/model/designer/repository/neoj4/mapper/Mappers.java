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
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.tura.model.designer.repository.neoj4.recipe.UsingMappers;
import java.util.Collection;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Mappers implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.mapper.Mappers.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_MAPPERS")
  private long vMappers;

  public long getVmappers() {
    return vMappers;
  }

  public void setVmappers(long vMappers) {
    this.vMappers = vMappers;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_MAPPER_APPLICATION_MAPPER")
  private String refMapperApplicationMapper;

  public void setRefMapperApplicationMapper(java.lang.String refMapperApplicationMapper) {
    this.refMapperApplicationMapper = refMapperApplicationMapper;
  }

  public String getRefMapperApplicationMapper() {
    return refMapperApplicationMapper;
  }

  @org.neo4j.ogm.annotation.Relationship(
      type = "Mappers_UsingMappers_opMappersUsingMappers",
      direction = org.neo4j.ogm.annotation.Relationship.Direction.OUTGOING)
  private Collection<UsingMappers> opMappersUsingMappers;

  public Collection<UsingMappers> getOpMappersUsingMappers() {
    return opMappersUsingMappers;
  }

  public void setOpMappersUsingMappers(java.util.Collection<UsingMappers> opMappersUsingMappers) {
    this.opMappersUsingMappers = opMappersUsingMappers;
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
