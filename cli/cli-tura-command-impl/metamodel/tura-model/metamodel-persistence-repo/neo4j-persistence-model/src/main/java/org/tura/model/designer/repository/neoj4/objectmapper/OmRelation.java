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
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class OmRelation implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.objectmapper.OmRelation.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_OMRELATION")
  private long vOmRelation;

  public long getVomRelation() {
    return vOmRelation;
  }

  public void setVomRelation(long vOmRelation) {
    this.vOmRelation = vOmRelation;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TYPE_REF_OM_RELATION_TYPE_ELEMENT")
  private String refOpTypeRefOmRelationTypeElement;

  public void setRefOpTypeRefOmRelationTypeElement(
      java.lang.String refOpTypeRefOmRelationTypeElement) {
    this.refOpTypeRefOmRelationTypeElement = refOpTypeRefOmRelationTypeElement;
  }

  public String getRefOpTypeRefOmRelationTypeElement() {
    return refOpTypeRefOmRelationTypeElement;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_ASSOSIATION_REF_OM_RELATION_ASSOSIATION")
  private String refOpAssosiationRefOmRelationAssosiation;

  public void setRefOpAssosiationRefOmRelationAssosiation(
      java.lang.String refOpAssosiationRefOmRelationAssosiation) {
    this.refOpAssosiationRefOmRelationAssosiation = refOpAssosiationRefOmRelationAssosiation;
  }

  public String getRefOpAssosiationRefOmRelationAssosiation() {
    return refOpAssosiationRefOmRelationAssosiation;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_RELATIONS_OBJECT_MAPPER")
  private String refRelationsObjectMapper;

  public void setRefRelationsObjectMapper(java.lang.String refRelationsObjectMapper) {
    this.refRelationsObjectMapper = refRelationsObjectMapper;
  }

  public String getRefRelationsObjectMapper() {
    return refRelationsObjectMapper;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_OBJECT_MAPPER_REF_OM_RELATION_OBJECT_MAPPER")
  private String refOpObjectMapperRefOmRelationObjectMapper;

  public void setRefOpObjectMapperRefOmRelationObjectMapper(
      java.lang.String refOpObjectMapperRefOmRelationObjectMapper) {
    this.refOpObjectMapperRefOmRelationObjectMapper = refOpObjectMapperRefOmRelationObjectMapper;
  }

  public String getRefOpObjectMapperRefOmRelationObjectMapper() {
    return refOpObjectMapperRefOmRelationObjectMapper;
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
