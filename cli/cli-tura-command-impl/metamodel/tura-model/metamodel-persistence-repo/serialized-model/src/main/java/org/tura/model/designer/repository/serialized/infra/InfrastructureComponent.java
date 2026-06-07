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

package org.tura.model.designer.repository.serialized.infra;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(value = org.tura.model.designer.repository.serialized.infra.Server.class, name = "Server"),
  @Type(value = org.tura.model.designer.repository.serialized.infra.Router.class, name = "Router"),
  @Type(value = org.tura.model.designer.repository.serialized.infra.Hub.class, name = "Hub"),
  @Type(
      value = org.tura.model.designer.repository.serialized.infra.Storage.class,
      name = "Storage"),
  @Type(
      value = org.tura.model.designer.repository.serialized.infra.ServerClaster.class,
      name = "ServerClaster")
})
public class InfrastructureComponent implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean attached;

  public Boolean getAttached() {
    return attached;
  }

  public void setAttached(Boolean value) {
    this.attached = value;
  }

  private String serializationid;

  public String getSerializationid() {
    return serializationid;
  }

  public void setSerializationid(String value) {
    this.serializationid = value;
  }

  private String cpaid;

  public String getCpaid() {
    return cpaid;
  }

  public void setCpaid(String value) {
    this.cpaid = value;
  }

  @JsonIgnore
  public boolean isInMemory() {
    throw new UnsupportedOperationException();
  }

  @JsonIgnore
  public InfrastructureComponent inMemory() {
    throw new UnsupportedOperationException();
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private String transientrefInfrastructureComponentInfrastructureLayer;

  public String getTransientrefInfrastructureComponentInfrastructureLayer() {
    return transientrefInfrastructureComponentInfrastructureLayer;
  }

  public void setTransientrefInfrastructureComponentInfrastructureLayer(
      java.lang.String transientrefInfrastructureComponentInfrastructureLayer) {
    this.transientrefInfrastructureComponentInfrastructureLayer =
        transientrefInfrastructureComponentInfrastructureLayer;
  }

  private List<InfrastructureConnection> opSourceInfrastructureConnection = new ArrayList<>();

  @Association(
      id = "d75c995f-192d-4369-93e5-3df81466c280",
      from = org.tura.model.designer.repository.serialized.infra.InfrastructureComponent.class,
      mappedBy = org.tura.model.designer.repository.serialized.infra.InfrastructureConnection.class,
      property = "source",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpSourceInfrastructureConnectionInfrastructureComponent",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<InfrastructureConnection> getOpSourceInfrastructureConnection() {
    return opSourceInfrastructureConnection;
  }

  public void setOpSourceInfrastructureConnection(
      java.util.List<InfrastructureConnection> opSourceInfrastructureConnection) {
    this.opSourceInfrastructureConnection = opSourceInfrastructureConnection;
  }

  private List<InfrastructureConnection> opTargetInfrastructureConnection = new ArrayList<>();

  @Association(
      id = "f779f9a3-8c67-4a35-85c7-5072d3694afb",
      from = org.tura.model.designer.repository.serialized.infra.InfrastructureComponent.class,
      mappedBy = org.tura.model.designer.repository.serialized.infra.InfrastructureConnection.class,
      property = "target",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpTargetInfrastructureConnectionInfrastructureComponent",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<InfrastructureConnection> getOpTargetInfrastructureConnection() {
    return opTargetInfrastructureConnection;
  }

  public void setOpTargetInfrastructureConnection(
      java.util.List<InfrastructureConnection> opTargetInfrastructureConnection) {
    this.opTargetInfrastructureConnection = opTargetInfrastructureConnection;
  }

  private InfrastructureLayer opInfrastructureComponentInfrastructureLayer;

  @Association(
      id = "906fed5b-6922-428f-a0ae-e5408add96d3",
      from = org.tura.model.designer.repository.serialized.infra.InfrastructureComponent.class,
      mappedBy = org.tura.model.designer.repository.serialized.infra.InfrastructureLayer.class,
      property = "infrastructureComponent",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refInfrastructureComponentInfrastructureLayer",
            field1Suffix = "",
            field2Suffix = "")
      })
  public InfrastructureLayer getOpInfrastructureComponentInfrastructureLayer() {
    return opInfrastructureComponentInfrastructureLayer;
  }

  public void setOpInfrastructureComponentInfrastructureLayer(
      org.tura.model.designer.repository.serialized.infra.InfrastructureLayer
          opInfrastructureComponentInfrastructureLayer) {
    this.opInfrastructureComponentInfrastructureLayer =
        opInfrastructureComponentInfrastructureLayer;
  }
}
