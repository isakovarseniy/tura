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

@Entity(name = "MenuExtensionRef")
@javax.persistence.Table(name = "MENUEXTENSIONREF")
public class MenuExtensionRef implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.MenuExtensionRef.class;
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
  @javax.persistence.Column(name = "V_MENUEXTENSIONREF")
  private int vMenuExtensionRef;

  public int getVmenuExtensionRef() {
    return vMenuExtensionRef;
  }

  public void setVmenuExtensionRef(int vMenuExtensionRef) {
    this.vMenuExtensionRef = vMenuExtensionRef;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_EXTENSION_REF_MENU_EXTENSION_REF_MENU_FOLDER",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private MenuFolder extensionRef;

  public MenuFolder getExtensionRef() {
    return extensionRef;
  }

  public void setExtensionRef(org.tura.model.designer.repository.jpa.form.MenuFolder extensionRef) {
    this.extensionRef = extensionRef;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhMenuExtensionRef", fetch = javax.persistence.FetchType.LAZY)
  private MenuExtensionPoint clMenuExtensionPoint;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clMenuExtensionPoint != null) {
      return clMenuExtensionPoint.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuExtensionPoint")) {
        clMenuExtensionPoint = (MenuExtensionPoint) obj;
      }
    }
  }
}
