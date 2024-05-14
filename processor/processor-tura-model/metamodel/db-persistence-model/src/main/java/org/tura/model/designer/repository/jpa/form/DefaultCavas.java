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
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "DefaultCavas")
@javax.persistence.Table(name = "DEFAULTCAVAS")
public class DefaultCavas implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.DefaultCavas.class;
  }

  @javax.persistence.Column(name = "DEFAULT_CANVAS")
  private Boolean defaultCanvas;

  public void setDefaultCanvas(java.lang.Boolean defaultCanvas) {
    this.defaultCanvas = defaultCanvas;
  }

  public Boolean getDefaultCanvas() {
    return defaultCanvas;
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
  @javax.persistence.Column(name = "V_DEFAULTCAVAS")
  private int vDefaultCavas;

  public int getVdefaultCavas() {
    return vDefaultCavas;
  }

  public void setVdefaultCavas(int vDefaultCavas) {
    this.vDefaultCavas = vDefaultCavas;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhDefaultCavas", fetch = javax.persistence.FetchType.LAZY)
  private PopupCanvas clPopupCanvas;

  @OneToOne(mappedBy = "inhDefaultCavas", fetch = javax.persistence.FetchType.LAZY)
  private OverlayCanvas clOverlayCanvas;

  @OneToOne(mappedBy = "inhDefaultCavas", fetch = javax.persistence.FetchType.LAZY)
  private Canvas clCanvas;

  @OneToOne(mappedBy = "inhDefaultCavas", fetch = javax.persistence.FetchType.LAZY)
  private TabCanvas clTabCanvas;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clPopupCanvas != null) {
      return clPopupCanvas.getObject();
    }
    if (clOverlayCanvas != null) {
      return clOverlayCanvas.getObject();
    }
    if (clCanvas != null) {
      return clCanvas.getObject();
    }
    if (clTabCanvas != null) {
      return clTabCanvas.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PopupCanvas")) {
        clPopupCanvas = (PopupCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.OverlayCanvas")) {
        clOverlayCanvas = (OverlayCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Canvas")) {
        clCanvas = (Canvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabCanvas")) {
        clTabCanvas = (TabCanvas) obj;
      }
    }
  }
}
