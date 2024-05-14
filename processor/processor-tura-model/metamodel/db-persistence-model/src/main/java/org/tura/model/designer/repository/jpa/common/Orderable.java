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
import org.tura.model.designer.repository.jpa.form.TabPage;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.form.ViewPort;
import org.tura.model.designer.repository.jpa.form.ViewArea;
import org.tura.model.designer.repository.jpa.form.Uielement;
import org.tura.model.designer.repository.jpa.form.Column;
import org.tura.model.designer.repository.jpa.form.MenuElement;
import org.tura.model.designer.repository.jpa.recipe.Ingredient;
import org.tura.model.designer.repository.jpa.recipe.Component;
import org.tura.model.designer.repository.jpa.recipe.ModelMapper;
import javax.persistence.Entity;

@Entity(name = "Orderable")
@javax.persistence.Table(name = "ORDERABLE")
public class Orderable implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.common.Orderable.class;
  }

  @javax.persistence.Column(name = "ORDER_")
  private Integer order;

  public void setOrder(java.lang.Integer order) {
    this.order = order;
  }

  public Integer getOrder() {
    return order;
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
  @javax.persistence.Column(name = "V_ORDERABLE")
  private int vOrderable;

  public int getVorderable() {
    return vOrderable;
  }

  public void setVorderable(int vOrderable) {
    this.vOrderable = vOrderable;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhOrderable", fetch = javax.persistence.FetchType.LAZY)
  private TabPage clTabPage;

  @OneToOne(mappedBy = "inhOrderable", fetch = javax.persistence.FetchType.LAZY)
  private ViewPort clViewPort;

  @OneToOne(mappedBy = "inhOrderable", fetch = javax.persistence.FetchType.LAZY)
  private ViewArea clViewArea;

  @OneToOne(mappedBy = "inhOrderable", fetch = javax.persistence.FetchType.LAZY)
  private Uielement clUielement;

  @OneToOne(mappedBy = "inhOrderable", fetch = javax.persistence.FetchType.LAZY)
  private Column clColumn;

  @OneToOne(mappedBy = "inhOrderable", fetch = javax.persistence.FetchType.LAZY)
  private MenuElement clMenuElement;

  @OneToOne(mappedBy = "inhOrderable", fetch = javax.persistence.FetchType.LAZY)
  private Ingredient clIngredient;

  @OneToOne(mappedBy = "inhOrderable", fetch = javax.persistence.FetchType.LAZY)
  private Component clComponent;

  @OneToOne(mappedBy = "inhOrderable", fetch = javax.persistence.FetchType.LAZY)
  private ModelMapper clModelMapper;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
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
    if (clMenuElement != null) {
      return clMenuElement.getObject();
    }
    if (clIngredient != null) {
      return clIngredient.getObject();
    }
    if (clComponent != null) {
      return clComponent.getObject();
    }
    if (clModelMapper != null) {
      return clModelMapper.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
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
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuElement")) {
        clMenuElement = (MenuElement) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Ingredient")) {
        clIngredient = (Ingredient) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Component")) {
        clComponent = (Component) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.ModelMapper")) {
        clModelMapper = (ModelMapper) obj;
      }
    }
  }
}
