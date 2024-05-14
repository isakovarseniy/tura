/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.model.designer.repository.jpa.infra;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;

@Entity(name = "InfrastructureComponent")
@javax.persistence.Table(name = "INFRASTRUCTURECOMPONENT")
public class InfrastructureComponent implements Serializable, TypeAware {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.infra.InfrastructureComponent.class;
  }

  @Id
  @javax.persistence.Column(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @javax.persistence.Column(name = "NAME")
  private String name;

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_INFRASTRUCTURECOMPONENT")
  private int vInfrastructureComponent;

  public int getVinfrastructureComponent() {
    return vInfrastructureComponent;
  }

  public void setVinfrastructureComponent(int vInfrastructureComponent) {
    this.vInfrastructureComponent = vInfrastructureComponent;
  }

  @OneToMany(mappedBy = "source", fetch = javax.persistence.FetchType.LAZY)
  private Collection<InfrastructureConnection> opSourceInfrastructureConnection;

  public Collection<InfrastructureConnection> getOpSourceInfrastructureConnection() {
    return opSourceInfrastructureConnection;
  }

  public void setOpSourceInfrastructureConnection(
      java.util.Collection<InfrastructureConnection> opSourceInfrastructureConnection) {
    this.opSourceInfrastructureConnection = opSourceInfrastructureConnection;
  }

  @OneToMany(mappedBy = "target", fetch = javax.persistence.FetchType.LAZY)
  private Collection<InfrastructureConnection> opTargetInfrastructureConnection;

  public Collection<InfrastructureConnection> getOpTargetInfrastructureConnection() {
    return opTargetInfrastructureConnection;
  }

  public void setOpTargetInfrastructureConnection(
      java.util.Collection<InfrastructureConnection> opTargetInfrastructureConnection) {
    this.opTargetInfrastructureConnection = opTargetInfrastructureConnection;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_INFRASTRUCTURE_COMPONENT_INFRASTRUCTURE_LAYER",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private InfrastructureLayer opInfrastructureComponentInfrastructureLayer;

  public InfrastructureLayer getOpInfrastructureComponentInfrastructureLayer() {
    return opInfrastructureComponentInfrastructureLayer;
  }

  public void setOpInfrastructureComponentInfrastructureLayer(
      org.tura.model.designer.repository.jpa.infra.InfrastructureLayer
          opInfrastructureComponentInfrastructureLayer) {
    this.opInfrastructureComponentInfrastructureLayer =
        opInfrastructureComponentInfrastructureLayer;
  }
}
