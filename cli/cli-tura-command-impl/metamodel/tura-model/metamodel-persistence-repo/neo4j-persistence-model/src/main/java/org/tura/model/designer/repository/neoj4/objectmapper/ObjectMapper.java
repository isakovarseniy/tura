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

package org.tura.model.designer.repository.neoj4.objectmapper;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.artifact.Categorized;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ObjectMapper implements Serializable, TypeAware, Categorized, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.objectmapper.ObjectMapper.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_OBJECTMAPPER")
  private long vObjectMapper;

  public long getVobjectMapper() {
    return vObjectMapper;
  }

  public void setVobjectMapper(long vObjectMapper) {
    this.vObjectMapper = vObjectMapper;
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

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OBJECT_MAPPERS_OBJECT_MAPPER_GROUP")
  private String refObjectMappersObjectMapperGroup;

  public void setRefObjectMappersObjectMapperGroup(
      java.lang.String refObjectMappersObjectMapperGroup) {
    this.refObjectMappersObjectMapperGroup = refObjectMappersObjectMapperGroup;
  }

  public String getRefObjectMappersObjectMapperGroup() {
    return refObjectMappersObjectMapperGroup;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_STAGE_OBJECT_MAPPER_PROCESSING_STAGE")
  private String refOpStageObjectMapperProcessingStage;

  public void setRefOpStageObjectMapperProcessingStage(
      java.lang.String refOpStageObjectMapperProcessingStage) {
    this.refOpStageObjectMapperProcessingStage = refOpStageObjectMapperProcessingStage;
  }

  public String getRefOpStageObjectMapperProcessingStage() {
    return refOpStageObjectMapperProcessingStage;
  }

  public void setSuidCategorized(java.lang.String suid) {}

  public String getSuidCategorized() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
