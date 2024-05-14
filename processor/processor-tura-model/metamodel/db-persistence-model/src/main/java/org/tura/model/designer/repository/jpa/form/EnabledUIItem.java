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

@Entity(name = "EnabledUIItem")
@javax.persistence.Table(name = "ENABLEDUIITEM")
public class EnabledUIItem implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.EnabledUIItem.class;
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
  @javax.persistence.Column(name = "V_ENABLEDUIITEM")
  private int vEnabledUIItem;

  public int getVenabledUIItem() {
    return vEnabledUIItem;
  }

  public void setVenabledUIItem(int vEnabledUIItem) {
    this.vEnabledUIItem = vEnabledUIItem;
  }

  @OneToOne(mappedBy = "opEnabledEnabledUIItem", fetch = javax.persistence.FetchType.LAZY)
  private Context enabled;

  public Context getEnabled() {
    return enabled;
  }

  public void setEnabled(org.tura.model.designer.repository.jpa.form.Context enabled) {
    this.enabled = enabled;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhEnabledUIItem", fetch = javax.persistence.FetchType.LAZY)
  private Uielement clUielement;

  @OneToOne(mappedBy = "inhEnabledUIItem", fetch = javax.persistence.FetchType.LAZY)
  private MenuElement clMenuElement;

  @OneToOne(mappedBy = "inhEnabledUIItem", fetch = javax.persistence.FetchType.LAZY)
  private MenuFolder clMenuFolder;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clUielement != null) {
      return clUielement.getObject();
    }
    if (clMenuElement != null) {
      return clMenuElement.getObject();
    }
    if (clMenuFolder != null) {
      return clMenuFolder.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Uielement")) {
        clUielement = (Uielement) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuElement")) {
        clMenuElement = (MenuElement) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuFolder")) {
        clMenuFolder = (MenuFolder) obj;
      }
    }
  }
}
