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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "ViewElement")
@javax.persistence.Table(name = "VIEWELEMENT")
public class ViewElement implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.ViewElement.class;
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
  @javax.persistence.Column(name = "V_VIEWELEMENT")
  private int vViewElement;

  public int getVviewElement() {
    return vViewElement;
  }

  public void setVviewElement(int vViewElement) {
    this.vViewElement = vViewElement;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_VIEW_ELEMENT_VIEW_PORT_HOLDER", referencedColumnName = "SUID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private ViewPortHolder opViewElementViewPortHolder;

  public ViewPortHolder getOpViewElementViewPortHolder() {
    return opViewElementViewPortHolder;
  }

  public void setOpViewElementViewPortHolder(
      org.tura.model.designer.repository.jpa.form.ViewPortHolder opViewElementViewPortHolder) {
    this.opViewElementViewPortHolder = opViewElementViewPortHolder;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhViewElement", fetch = javax.persistence.FetchType.LAZY)
  private ViewPort clViewPort;

  @OneToOne(mappedBy = "inhViewElement", fetch = javax.persistence.FetchType.LAZY)
  private ViewArea clViewArea;

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
    }
  }
}
