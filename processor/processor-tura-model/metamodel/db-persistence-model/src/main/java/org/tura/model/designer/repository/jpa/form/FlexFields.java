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

@Entity(name = "FlexFields")
@javax.persistence.Table(name = "FLEXFIELDS")
public class FlexFields implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.FlexFields.class;
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
  @javax.persistence.Column(name = "V_FLEXFIELDS")
  private int vFlexFields;

  public int getVflexFields() {
    return vFlexFields;
  }

  public void setVflexFields(int vFlexFields) {
    this.vFlexFields = vFlexFields;
  }

  @OneToMany(mappedBy = "opFieldsFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private Collection<FlexField> fields;

  public Collection<FlexField> getFields() {
    return fields;
  }

  public void setFields(java.util.Collection<FlexField> fields) {
    this.fields = fields;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private PopupCanvas clPopupCanvas;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private OverlayCanvas clOverlayCanvas;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private Canvas clCanvas;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private Window clWindow;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private TabCanvas clTabCanvas;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private TabPage clTabPage;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private ViewPort clViewPort;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private ViewArea clViewArea;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private Uielement clUielement;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private Column clColumn;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private WindowRef clWindowRef;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private MenuElement clMenuElement;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private MenuFolder clMenuFolder;

  @OneToOne(mappedBy = "inhFlexFields", fetch = javax.persistence.FetchType.LAZY)
  private SubMenu clSubMenu;

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
    if (clTabCanvas != null) {
      return clTabCanvas.getObject();
    }
    if (clTabPage != null) {
      return clTabPage.getObject();
    }
    if (clViewPort != null) {
      return clViewPort.getObject();
    }
    if (clViewArea != null) {
      return clViewArea.getObject();
    }
    if (clUielement != null) {
      return clUielement.getObject();
    }
    if (clColumn != null) {
      return clColumn.getObject();
    }
    if (clWindowRef != null) {
      return clWindowRef.getObject();
    }
    if (clMenuElement != null) {
      return clMenuElement.getObject();
    }
    if (clMenuFolder != null) {
      return clMenuFolder.getObject();
    }
    if (clSubMenu != null) {
      return clSubMenu.getObject();
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
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabCanvas")) {
        clTabCanvas = (TabCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabPage")) {
        clTabPage = (TabPage) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewPort")) {
        clViewPort = (ViewPort) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewArea")) {
        clViewArea = (ViewArea) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Uielement")) {
        clUielement = (Uielement) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Column")) {
        clColumn = (Column) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.WindowRef")) {
        clWindowRef = (WindowRef) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuElement")) {
        clMenuElement = (MenuElement) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuFolder")) {
        clMenuFolder = (MenuFolder) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.SubMenu")) {
        clSubMenu = (SubMenu) obj;
      }
    }
  }
}
