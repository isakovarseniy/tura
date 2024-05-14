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

@Entity(name = "NickNamed")
@javax.persistence.Table(name = "NICKNAMED")
public class NickNamed implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.NickNamed.class;
  }

  @javax.persistence.Column(name = "NICKNAME")
  private String nickname;

  public void setNickname(java.lang.String nickname) {
    this.nickname = nickname;
  }

  public String getNickname() {
    return nickname;
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
  @javax.persistence.Column(name = "V_NICKNAMED")
  private int vNickNamed;

  public int getVnickNamed() {
    return vNickNamed;
  }

  public void setVnickNamed(int vNickNamed) {
    this.vNickNamed = vNickNamed;
  }

  @OneToMany(mappedBy = "area", fetch = javax.persistence.FetchType.LAZY)
  private Collection<AreaRef> opAreaAreaRef;

  public Collection<AreaRef> getOpAreaAreaRef() {
    return opAreaAreaRef;
  }

  public void setOpAreaAreaRef(java.util.Collection<AreaRef> opAreaAreaRef) {
    this.opAreaAreaRef = opAreaAreaRef;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhNickNamed", fetch = javax.persistence.FetchType.LAZY)
  private ViewPort clViewPort;

  @OneToOne(mappedBy = "inhNickNamed", fetch = javax.persistence.FetchType.LAZY)
  private ViewArea clViewArea;

  @OneToOne(mappedBy = "inhNickNamed", fetch = javax.persistence.FetchType.LAZY)
  private OverlayCanvas clOverlayCanvas;

  @OneToOne(mappedBy = "inhNickNamed", fetch = javax.persistence.FetchType.LAZY)
  private Uielement clUielement;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clViewPort != null) {
      return clViewPort.getObject();
    }
    if (clViewArea != null) {
      return clViewArea.getObject();
    }
    if (clOverlayCanvas != null) {
      return clOverlayCanvas.getObject();
    }
    if (clUielement != null) {
      return clUielement.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewPort")) {
        clViewPort = (ViewPort) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewArea")) {
        clViewArea = (ViewArea) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.OverlayCanvas")) {
        clOverlayCanvas = (OverlayCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Uielement")) {
        clUielement = (Uielement) obj;
      }
    }
  }
}
