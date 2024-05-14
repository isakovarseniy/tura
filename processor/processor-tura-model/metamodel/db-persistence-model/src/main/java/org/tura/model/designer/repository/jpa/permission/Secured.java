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

package org.tura.model.designer.repository.jpa.permission;

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
import org.tura.model.designer.repository.jpa.type.Operation;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.form.Window;
import javax.persistence.Entity;

@Entity(name = "Secured")
@javax.persistence.Table(name = "SECURED")
public class Secured implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.permission.Secured.class;
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
  @javax.persistence.Column(name = "V_SECURED")
  private int vSecured;

  public int getVsecured() {
    return vSecured;
  }

  public void setVsecured(int vSecured) {
    this.vSecured = vSecured;
  }

  @OneToMany(mappedBy = "opGrantsSecured", fetch = javax.persistence.FetchType.LAZY)
  private Collection<GrantAccess> grants;

  public Collection<GrantAccess> getGrants() {
    return grants;
  }

  public void setGrants(java.util.Collection<GrantAccess> grants) {
    this.grants = grants;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhSecured", fetch = javax.persistence.FetchType.LAZY)
  private Operation clOperation;

  @OneToOne(mappedBy = "inhSecured", fetch = javax.persistence.FetchType.LAZY)
  private Window clWindow;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clOperation != null) {
      return clOperation.getObject();
    }
    if (clWindow != null) {
      return clWindow.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Operation")) {
        clOperation = (Operation) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Window")) {
        clWindow = (Window) obj;
      }
    }
  }
}
