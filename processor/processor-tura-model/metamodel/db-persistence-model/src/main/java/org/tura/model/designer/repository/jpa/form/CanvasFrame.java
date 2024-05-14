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
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "CanvasFrame")
@javax.persistence.Table(name = "CANVASFRAME")
public class CanvasFrame implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.CanvasFrame.class;
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
  @javax.persistence.Column(name = "V_CANVASFRAME")
  private int vCanvasFrame;

  public int getVcanvasFrame() {
    return vCanvasFrame;
  }

  public void setVcanvasFrame(int vCanvasFrame) {
    this.vCanvasFrame = vCanvasFrame;
  }

  @OneToMany(mappedBy = "target", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ViewInheritance> opTargetViewInheritance;

  public Collection<ViewInheritance> getOpTargetViewInheritance() {
    return opTargetViewInheritance;
  }

  public void setOpTargetViewInheritance(
      java.util.Collection<ViewInheritance> opTargetViewInheritance) {
    this.opTargetViewInheritance = opTargetViewInheritance;
  }

  @JoinColumns({@JoinColumn(name = "REF_CANVASES_VIEWS", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Views opCanvasesViews;

  public Views getOpCanvasesViews() {
    return opCanvasesViews;
  }

  public void setOpCanvasesViews(
      org.tura.model.designer.repository.jpa.form.Views opCanvasesViews) {
    this.opCanvasesViews = opCanvasesViews;
  }

  public void setSuidStyleElement(java.lang.String suid) {}

  public String getSuidStyleElement() {
    return this.getInhStyleElement().getSuid();
  }

  public Context getStyle() {
    return this.getInhStyleElement().getStyle();
  }

  public void setStyle(org.tura.model.designer.repository.jpa.form.Context style) {
    this.getInhStyleElement().setStyle(style);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_styleElement", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private StyleElement inhStyleElement;

  public StyleElement getInhStyleElement() {
    return inhStyleElement;
  }

  public void setInhStyleElement(
      org.tura.model.designer.repository.jpa.form.StyleElement inhStyleElement) {
    this.inhStyleElement = inhStyleElement;
  }

  public CanvasFrame() {
    StyleElement styleElement = new StyleElement();
    this.inhStyleElement = styleElement;
    styleElement.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.CanvasFrame.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.StyleElement.class.getName())) {
      return (T) this.inhStyleElement;
    }
    throw new RepositoryException("Cast exception to  " + clazz.getName());
  }

  public Object getObject() {
    return this;
  }
}
