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

@Entity(name = "ViewPortHolder")
@javax.persistence.Table(name = "VIEWPORTHOLDER")
public class ViewPortHolder implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.ViewPortHolder.class;
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
  @javax.persistence.Column(name = "V_VIEWPORTHOLDER")
  private int vViewPortHolder;

  public int getVviewPortHolder() {
    return vViewPortHolder;
  }

  public void setVviewPortHolder(int vViewPortHolder) {
    this.vViewPortHolder = vViewPortHolder;
  }

  @OneToMany(mappedBy = "opViewElementViewPortHolder", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ViewElement> viewElement;

  public Collection<ViewElement> getViewElement() {
    return viewElement;
  }

  public void setViewElement(java.util.Collection<ViewElement> viewElement) {
    this.viewElement = viewElement;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhViewPortHolder", fetch = javax.persistence.FetchType.LAZY)
  private PopupCanvas clPopupCanvas;

  @OneToOne(mappedBy = "inhViewPortHolder", fetch = javax.persistence.FetchType.LAZY)
  private OverlayCanvas clOverlayCanvas;

  @OneToOne(mappedBy = "inhViewPortHolder", fetch = javax.persistence.FetchType.LAZY)
  private Canvas clCanvas;

  @OneToOne(mappedBy = "inhViewPortHolder", fetch = javax.persistence.FetchType.LAZY)
  private Window clWindow;

  @OneToOne(mappedBy = "inhViewPortHolder", fetch = javax.persistence.FetchType.LAZY)
  private TabPage clTabPage;

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
    if (clWindow != null) {
      return clWindow.getObject();
    }
    if (clTabPage != null) {
      return clTabPage.getObject();
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
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Window")) {
        clWindow = (Window) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabPage")) {
        clTabPage = (TabPage) obj;
      }
    }
  }
}
