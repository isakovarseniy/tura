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

package org.tura.model.designer.repository.neoj4.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class RelationMapper implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.RelationMapper.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_RELATIONMAPPER")
  private long vRelationMapper;

  public long getVrelationMapper() {
    return vRelationMapper;
  }

  public void setVrelationMapper(long vRelationMapper) {
    this.vRelationMapper = vRelationMapper;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TYPE_REF_RELATION_MAPPER_TYPE_ELEMENT")
  private String refOpTypeRefRelationMapperTypeElement;

  public void setRefOpTypeRefRelationMapperTypeElement(
      java.lang.String refOpTypeRefRelationMapperTypeElement) {
    this.refOpTypeRefRelationMapperTypeElement = refOpTypeRefRelationMapperTypeElement;
  }

  public String getRefOpTypeRefRelationMapperTypeElement() {
    return refOpTypeRefRelationMapperTypeElement;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_ASSOSIATION_REF_RELATION_MAPPER_ASSOSIATION")
  private String refOpAssosiationRefRelationMapperAssosiation;

  public void setRefOpAssosiationRefRelationMapperAssosiation(
      java.lang.String refOpAssosiationRefRelationMapperAssosiation) {
    this.refOpAssosiationRefRelationMapperAssosiation =
        refOpAssosiationRefRelationMapperAssosiation;
  }

  public String getRefOpAssosiationRefRelationMapperAssosiation() {
    return refOpAssosiationRefRelationMapperAssosiation;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_RELATION_MAPPERS_DATA_CONTROL")
  private String refRelationMappersDataControl;

  public void setRefRelationMappersDataControl(java.lang.String refRelationMappersDataControl) {
    this.refRelationMappersDataControl = refRelationMappersDataControl;
  }

  public String getRefRelationMappersDataControl() {
    return refRelationMappersDataControl;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_DATA_CONTROL_REF_RELATION_MAPPER_DATA_CONTROL")
  private String refOpDataControlRefRelationMapperDataControl;

  public void setRefOpDataControlRefRelationMapperDataControl(
      java.lang.String refOpDataControlRefRelationMapperDataControl) {
    this.refOpDataControlRefRelationMapperDataControl =
        refOpDataControlRefRelationMapperDataControl;
  }

  public String getRefOpDataControlRefRelationMapperDataControl() {
    return refOpDataControlRefRelationMapperDataControl;
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
