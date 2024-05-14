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

package org.tura.model.designer.repository.jpa.common;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.object.JpaDomainInterfaceSetter;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.jpa.form.PopupCanvas;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.form.OverlayCanvas;
import org.tura.model.designer.repository.jpa.form.Canvas;
import org.tura.model.designer.repository.jpa.form.Window;
import org.tura.model.designer.repository.jpa.form.TabPage;
import org.tura.model.designer.repository.jpa.form.LayerHolder;
import org.tura.model.designer.repository.jpa.form.Column;
import org.tura.model.designer.repository.jpa.form.Table;
import org.tura.model.designer.repository.jpa.form.BlockUI;
import org.tura.model.designer.repository.jpa.form.DataScroller;
import org.tura.model.designer.repository.jpa.form.TimeLine;
import org.tura.model.designer.repository.jpa.form.MenuFolder;
import org.tura.model.designer.repository.jpa.recipe.Recipe;
import org.tura.model.designer.repository.jpa.recipe.Ingredient;
import org.tura.model.designer.repository.jpa.recipe.Component;
import javax.persistence.Entity;

@Entity(name = "HTMLLayerHolder")
@javax.persistence.Table(name = "HTMLLAYERHOLDER")
public class HTMLLayerHolder implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.common.HTMLLayerHolder.class;
  }

  @javax.persistence.Column(name = "COLUMNS")
  private Integer columns;

  public void setColumns(java.lang.Integer columns) {
    this.columns = columns;
  }

  public Integer getColumns() {
    return columns;
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
  @javax.persistence.Column(name = "V_HTMLLAYERHOLDER")
  private int vHTMLLayerHolder;

  public int getVhTMLLayerHolder() {
    return vHTMLLayerHolder;
  }

  public void setVhTMLLayerHolder(int vHTMLLayerHolder) {
    this.vHTMLLayerHolder = vHTMLLayerHolder;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private PopupCanvas clPopupCanvas;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private OverlayCanvas clOverlayCanvas;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private Canvas clCanvas;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private Window clWindow;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private TabPage clTabPage;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private LayerHolder clLayerHolder;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private Column clColumn;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private Table clTable;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private BlockUI clBlockUI;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private DataScroller clDataScroller;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private TimeLine clTimeLine;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private MenuFolder clMenuFolder;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private Recipe clRecipe;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private Ingredient clIngredient;

  @OneToOne(mappedBy = "inhHTMLLayerHolder", fetch = javax.persistence.FetchType.LAZY)
  private Component clComponent;

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
    if (clLayerHolder != null) {
      return clLayerHolder.getObject();
    }
    if (clColumn != null) {
      return clColumn.getObject();
    }
    if (clTable != null) {
      return clTable.getObject();
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
    if (clMenuFolder != null) {
      return clMenuFolder.getObject();
    }
    if (clRecipe != null) {
      return clRecipe.getObject();
    }
    if (clIngredient != null) {
      return clIngredient.getObject();
    }
    if (clComponent != null) {
      return clComponent.getObject();
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
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.LayerHolder")) {
        clLayerHolder = (LayerHolder) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Column")) {
        clColumn = (Column) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Table")) {
        clTable = (Table) obj;
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
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuFolder")) {
        clMenuFolder = (MenuFolder) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Recipe")) {
        clRecipe = (Recipe) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Ingredient")) {
        clIngredient = (Ingredient) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Component")) {
        clComponent = (Component) obj;
      }
    }
  }
}
