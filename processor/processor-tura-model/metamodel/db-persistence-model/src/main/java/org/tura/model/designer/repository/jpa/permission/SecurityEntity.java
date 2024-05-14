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
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "SecurityEntity")
@javax.persistence.Table(name = "SECURITYENTITY")
public class SecurityEntity implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.permission.SecurityEntity.class;
  }

  @javax.persistence.Column(name = "NAME")
  private String name;

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getName() {
    return name;
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
  @javax.persistence.Column(name = "V_SECURITYENTITY")
  private int vSecurityEntity;

  public int getVsecurityEntity() {
    return vSecurityEntity;
  }

  public void setVsecurityEntity(int vSecurityEntity) {
    this.vSecurityEntity = vSecurityEntity;
  }

  @OneToMany(mappedBy = "securityEntity", fetch = javax.persistence.FetchType.LAZY)
  private Collection<SecurityEntityPointer> opSecurityEntitySecurityEntityPointer;

  public Collection<SecurityEntityPointer> getOpSecurityEntitySecurityEntityPointer() {
    return opSecurityEntitySecurityEntityPointer;
  }

  public void setOpSecurityEntitySecurityEntityPointer(
      java.util.Collection<SecurityEntityPointer> opSecurityEntitySecurityEntityPointer) {
    this.opSecurityEntitySecurityEntityPointer = opSecurityEntitySecurityEntityPointer;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhSecurityEntity", fetch = javax.persistence.FetchType.LAZY)
  private Role clRole;

  @OneToOne(mappedBy = "inhSecurityEntity", fetch = javax.persistence.FetchType.LAZY)
  private Group clGroup;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clRole != null) {
      return clRole.getObject();
    }
    if (clGroup != null) {
      return clGroup.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.permission.Role")) {
        clRole = (Role) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.permission.Group")) {
        clGroup = (Group) obj;
      }
    }
  }
}
