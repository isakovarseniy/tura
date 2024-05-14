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
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "ItemIcon")
@javax.persistence.Table(name = "ITEMICON")
public class ItemIcon implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.ItemIcon.class;
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
  @javax.persistence.Column(name = "V_ITEMICON")
  private int vItemIcon;

  public int getVitemIcon() {
    return vItemIcon;
  }

  public void setVitemIcon(int vItemIcon) {
    this.vItemIcon = vItemIcon;
  }

  @OneToOne(mappedBy = "opIconItemIcon", fetch = javax.persistence.FetchType.LAZY)
  private Context icon;

  public Context getIcon() {
    return icon;
  }

  public void setIcon(org.tura.model.designer.repository.jpa.form.Context icon) {
    this.icon = icon;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhItemIcon", fetch = javax.persistence.FetchType.LAZY)
  private Button clButton;

  @OneToOne(mappedBy = "inhItemIcon", fetch = javax.persistence.FetchType.LAZY)
  private MenuFolder clMenuFolder;

  @OneToOne(mappedBy = "inhItemIcon", fetch = javax.persistence.FetchType.LAZY)
  private MenuItem clMenuItem;

  @OneToOne(mappedBy = "inhItemIcon", fetch = javax.persistence.FetchType.LAZY)
  private SubMenu clSubMenu;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clButton != null) {
      return clButton.getObject();
    }
    if (clMenuFolder != null) {
      return clMenuFolder.getObject();
    }
    if (clMenuItem != null) {
      return clMenuItem.getObject();
    }
    if (clSubMenu != null) {
      return clSubMenu.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Button")) {
        clButton = (Button) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuFolder")) {
        clMenuFolder = (MenuFolder) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuItem")) {
        clMenuItem = (MenuItem) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.SubMenu")) {
        clSubMenu = (SubMenu) obj;
      }
    }
  }
}
