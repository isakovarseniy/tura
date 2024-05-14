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

package org.tura.model.designer.repository.jpa.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.object.JpaDomainInterfaceSetter;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "ChildrenHolder")
@javax.persistence.Table(name = "CHILDRENHOLDER")
public class ChildrenHolder implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.ChildrenHolder.class;
  }

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.tura.jpa.id.UUIDGenerator")
  @javax.persistence.Column(name = "SUID")
  private String suid;

  public void setSuid(java.lang.String suid) {
    this.suid = suid;
  }

  public String getSuid() {
    return suid;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_CHILDRENHOLDER")
  private int vChildrenHolder;

  public int getVchildrenHolder() {
    return vChildrenHolder;
  }

  public void setVchildrenHolder(int vChildrenHolder) {
    this.vChildrenHolder = vChildrenHolder;
  }

  @OneToMany(mappedBy = "opChildrenChildrenHolder", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Uielement> children;

  public Collection<Uielement> getChildren() {
    return children;
  }

  public void setChildren(java.util.Collection<Uielement> children) {
    this.children = children;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhChildrenHolder", fetch = javax.persistence.FetchType.LAZY)
  private LayerHolder clLayerHolder;

  @OneToOne(mappedBy = "inhChildrenHolder", fetch = javax.persistence.FetchType.LAZY)
  private BlockUI clBlockUI;

  @OneToOne(mappedBy = "inhChildrenHolder", fetch = javax.persistence.FetchType.LAZY)
  private DataScroller clDataScroller;

  @OneToOne(mappedBy = "inhChildrenHolder", fetch = javax.persistence.FetchType.LAZY)
  private TimeLine clTimeLine;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clLayerHolder != null) {
      return clLayerHolder.getObject();
    }
    if (clBlockUI != null) {
      return clBlockUI.getObject();
    }
    if (clDataScroller != null) {
      return clDataScroller.getObject();
    }
    if (clTimeLine != null) {
      return clTimeLine.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.LayerHolder")) {
        clLayerHolder = (LayerHolder) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.BlockUI")) {
        clBlockUI = (BlockUI) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.DataScroller")) {
        clDataScroller = (DataScroller) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TimeLine")) {
        clTimeLine = (TimeLine) obj;
      }
    }
  }
}
