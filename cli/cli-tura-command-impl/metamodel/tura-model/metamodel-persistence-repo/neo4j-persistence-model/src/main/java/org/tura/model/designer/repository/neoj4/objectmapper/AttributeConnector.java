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
public class AttributeConnector
    implements Serializable, TypeAware, OperationConnectorRef, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.objectmapper.AttributeConnector.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_ATTRIBUTECONNECTOR")
  private long vAttributeConnector;

  public long getVattributeConnector() {
    return vAttributeConnector;
  }

  public void setVattributeConnector(long vAttributeConnector) {
    this.vAttributeConnector = vAttributeConnector;
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

  @org.neo4j.ogm.annotation.Property(name = "MERGE_ATTR")
  private Boolean mergeAttr;

  public void setMergeAttr(java.lang.Boolean mergeAttr) {
    this.mergeAttr = mergeAttr;
  }

  public Boolean getMergeAttr() {
    return mergeAttr;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_ATTRIBUTE_CONNECTOR_META_OBJECT")
  private String refOpSourceAttributeConnectorMetaObject;

  public void setRefOpSourceAttributeConnectorMetaObject(
      java.lang.String refOpSourceAttributeConnectorMetaObject) {
    this.refOpSourceAttributeConnectorMetaObject = refOpSourceAttributeConnectorMetaObject;
  }

  public String getRefOpSourceAttributeConnectorMetaObject() {
    return refOpSourceAttributeConnectorMetaObject;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TARGET_ATTRIBUTE_CONNECTOR_META_OBJECT")
  private String refOpTargetAttributeConnectorMetaObject;

  public void setRefOpTargetAttributeConnectorMetaObject(
      java.lang.String refOpTargetAttributeConnectorMetaObject) {
    this.refOpTargetAttributeConnectorMetaObject = refOpTargetAttributeConnectorMetaObject;
  }

  public String getRefOpTargetAttributeConnectorMetaObject() {
    return refOpTargetAttributeConnectorMetaObject;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_ATTRIBUTES_CONNECTOR_OBJECT_MAPPER_GROUP")
  private String refAttributesConnectorObjectMapperGroup;

  public void setRefAttributesConnectorObjectMapperGroup(
      java.lang.String refAttributesConnectorObjectMapperGroup) {
    this.refAttributesConnectorObjectMapperGroup = refAttributesConnectorObjectMapperGroup;
  }

  public String getRefAttributesConnectorObjectMapperGroup() {
    return refAttributesConnectorObjectMapperGroup;
  }

  public void setSuidOperationConnectorRef(java.lang.String suid) {}

  public String getSuidOperationConnectorRef() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(
      name = "REF_OP_OPERATION_REF_OPERATION_CONNECTOR_REF_OPERATION_CONNECTOR")
  private String refOpOperationRefOperationConnectorRefOperationConnector;

  public void setRefOpOperationRefOperationConnectorRefOperationConnector(
      java.lang.String refOpOperationRefOperationConnectorRefOperationConnector) {
    this.refOpOperationRefOperationConnectorRefOperationConnector =
        refOpOperationRefOperationConnectorRefOperationConnector;
  }

  public String getRefOpOperationRefOperationConnectorRefOperationConnector() {
    return refOpOperationRefOperationConnectorRefOperationConnector;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
