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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.mapper.RoleMapper;
import javax.persistence.Entity;

@Entity(name = "SecurityEntityPointer")
@javax.persistence.Table(name = "SECURITYENTITYPOINTER")
public class SecurityEntityPointer
    implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.permission.SecurityEntityPointer.class;
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
  @javax.persistence.Column(name = "V_SECURITYENTITYPOINTER")
  private int vSecurityEntityPointer;

  public int getVsecurityEntityPointer() {
    return vSecurityEntityPointer;
  }

  public void setVsecurityEntityPointer(int vSecurityEntityPointer) {
    this.vSecurityEntityPointer = vSecurityEntityPointer;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_SECURITY_ENTITY_SECURITY_ENTITY_POINTER_SECURITY_ENTITY",
        referencedColumnName = "SUID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private SecurityEntity securityEntity;

  public SecurityEntity getSecurityEntity() {
    return securityEntity;
  }

  public void setSecurityEntity(
      org.tura.model.designer.repository.jpa.permission.SecurityEntity securityEntity) {
    this.securityEntity = securityEntity;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhSecurityEntityPointer", fetch = javax.persistence.FetchType.LAZY)
  private GrantAccess clGrantAccess;

  @OneToOne(mappedBy = "inhSecurityEntityPointer", fetch = javax.persistence.FetchType.LAZY)
  private RoleMapper clRoleMapper;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clGrantAccess != null) {
      return clGrantAccess.getObject();
    }
    if (clRoleMapper != null) {
      return clRoleMapper.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.permission.GrantAccess")) {
        clGrantAccess = (GrantAccess) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.RoleMapper")) {
        clRoleMapper = (RoleMapper) obj;
      }
    }
  }
}
