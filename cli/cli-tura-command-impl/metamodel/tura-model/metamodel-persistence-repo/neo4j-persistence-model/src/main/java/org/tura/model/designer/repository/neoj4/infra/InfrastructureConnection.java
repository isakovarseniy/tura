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

package org.tura.model.designer.repository.neoj4.infra;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class InfrastructureConnection implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.infra.InfrastructureConnection.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_INFRASTRUCTURECONNECTION")
  private long vInfrastructureConnection;

  public long getVinfrastructureConnection() {
    return vInfrastructureConnection;
  }

  public void setVinfrastructureConnection(long vInfrastructureConnection) {
    this.vInfrastructureConnection = vInfrastructureConnection;
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
  @org.neo4j.ogm.annotation.Property(
      name = "REF_INFRASTRUCTURE_CONNECTIONS_ENTERPRISE_INFRASTRUCTURE")
  private String refInfrastructureConnectionsEnterpriseInfrastructure;

  public void setRefInfrastructureConnectionsEnterpriseInfrastructure(
      java.lang.String refInfrastructureConnectionsEnterpriseInfrastructure) {
    this.refInfrastructureConnectionsEnterpriseInfrastructure =
        refInfrastructureConnectionsEnterpriseInfrastructure;
  }

  public String getRefInfrastructureConnectionsEnterpriseInfrastructure() {
    return refInfrastructureConnectionsEnterpriseInfrastructure;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(
      name = "REF_OP_SOURCE_INFRASTRUCTURE_CONNECTION_INFRASTRUCTURE_COMPONENT")
  private String refOpSourceInfrastructureConnectionInfrastructureComponent;

  public void setRefOpSourceInfrastructureConnectionInfrastructureComponent(
      java.lang.String refOpSourceInfrastructureConnectionInfrastructureComponent) {
    this.refOpSourceInfrastructureConnectionInfrastructureComponent =
        refOpSourceInfrastructureConnectionInfrastructureComponent;
  }

  public String getRefOpSourceInfrastructureConnectionInfrastructureComponent() {
    return refOpSourceInfrastructureConnectionInfrastructureComponent;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(
      name = "REF_OP_TARGET_INFRASTRUCTURE_CONNECTION_INFRASTRUCTURE_COMPONENT")
  private String refOpTargetInfrastructureConnectionInfrastructureComponent;

  public void setRefOpTargetInfrastructureConnectionInfrastructureComponent(
      java.lang.String refOpTargetInfrastructureConnectionInfrastructureComponent) {
    this.refOpTargetInfrastructureConnectionInfrastructureComponent =
        refOpTargetInfrastructureConnectionInfrastructureComponent;
  }

  public String getRefOpTargetInfrastructureConnectionInfrastructureComponent() {
    return refOpTargetInfrastructureConnectionInfrastructureComponent;
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
