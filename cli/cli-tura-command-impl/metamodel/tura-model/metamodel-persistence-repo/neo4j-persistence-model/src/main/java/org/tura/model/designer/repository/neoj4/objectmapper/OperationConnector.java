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
public class OperationConnector
    implements Serializable, TypeAware, OperationConnectorRef, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.objectmapper.OperationConnector.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_OPERATIONCONNECTOR")
  private long vOperationConnector;

  public long getVoperationConnector() {
    return vOperationConnector;
  }

  public void setVoperationConnector(long vOperationConnector) {
    this.vOperationConnector = vOperationConnector;
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

  @org.neo4j.ogm.annotation.Property(name = "OPERATION_TYPE")
  private OperationType operationType;

  public void setOperationType(
      org.tura.model.designer.repository.neoj4.objectmapper.OperationType operationType) {
    this.operationType = operationType;
  }

  public OperationType getOperationType() {
    return operationType;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OPERATIONS_CONNECTOR_OBJECT_MAPPER_GROUP")
  private String refOperationsConnectorObjectMapperGroup;

  public void setRefOperationsConnectorObjectMapperGroup(
      java.lang.String refOperationsConnectorObjectMapperGroup) {
    this.refOperationsConnectorObjectMapperGroup = refOperationsConnectorObjectMapperGroup;
  }

  public String getRefOperationsConnectorObjectMapperGroup() {
    return refOperationsConnectorObjectMapperGroup;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_OPERATION_CONNECTOR_OBJECT_MAPPER")
  private String refOpSourceOperationConnectorObjectMapper;

  public void setRefOpSourceOperationConnectorObjectMapper(
      java.lang.String refOpSourceOperationConnectorObjectMapper) {
    this.refOpSourceOperationConnectorObjectMapper = refOpSourceOperationConnectorObjectMapper;
  }

  public String getRefOpSourceOperationConnectorObjectMapper() {
    return refOpSourceOperationConnectorObjectMapper;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TARGET_OPERATION_CONNECTOR_OBJECT_MAPPER")
  private String refOpTargetOperationConnectorObjectMapper;

  public void setRefOpTargetOperationConnectorObjectMapper(
      java.lang.String refOpTargetOperationConnectorObjectMapper) {
    this.refOpTargetOperationConnectorObjectMapper = refOpTargetOperationConnectorObjectMapper;
  }

  public String getRefOpTargetOperationConnectorObjectMapper() {
    return refOpTargetOperationConnectorObjectMapper;
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
