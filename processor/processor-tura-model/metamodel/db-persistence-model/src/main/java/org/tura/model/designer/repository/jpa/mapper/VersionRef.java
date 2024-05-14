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

package org.tura.model.designer.repository.jpa.mapper;

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
import org.tura.model.designer.repository.jpa.recipe.JavaComponent;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.recipe.JavaScriptComponent;
import javax.persistence.Entity;

@Entity(name = "VersionRef")
@javax.persistence.Table(name = "VERSIONREF")
public class VersionRef implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.mapper.VersionRef.class;
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
  @javax.persistence.Column(name = "V_VERSIONREF")
  private int vVersionRef;

  public int getVversionRef() {
    return vVersionRef;
  }

  public void setVversionRef(int vVersionRef) {
    this.vVersionRef = vVersionRef;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_VERSION_REF_VERSION_REF_VERSION", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Version versionRef;

  public Version getVersionRef() {
    return versionRef;
  }

  public void setVersionRef(org.tura.model.designer.repository.jpa.mapper.Version versionRef) {
    this.versionRef = versionRef;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhVersionRef", fetch = javax.persistence.FetchType.LAZY)
  private JavaComponent clJavaComponent;

  @OneToOne(mappedBy = "inhVersionRef", fetch = javax.persistence.FetchType.LAZY)
  private JavaScriptComponent clJavaScriptComponent;

  @OneToOne(mappedBy = "inhVersionRef", fetch = javax.persistence.FetchType.LAZY)
  private JavaMapper clJavaMapper;

  @OneToOne(mappedBy = "inhVersionRef", fetch = javax.persistence.FetchType.LAZY)
  private JavaPackageMapper clJavaPackageMapper;

  @OneToOne(mappedBy = "inhVersionRef", fetch = javax.persistence.FetchType.LAZY)
  private JavaScriptMapper clJavaScriptMapper;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clJavaComponent != null) {
      return clJavaComponent.getObject();
    }
    if (clJavaScriptComponent != null) {
      return clJavaScriptComponent.getObject();
    }
    if (clJavaMapper != null) {
      return clJavaMapper.getObject();
    }
    if (clJavaPackageMapper != null) {
      return clJavaPackageMapper.getObject();
    }
    if (clJavaScriptMapper != null) {
      return clJavaScriptMapper.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.JavaComponent")) {
        clJavaComponent = (JavaComponent) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.JavaScriptComponent")) {
        clJavaScriptComponent = (JavaScriptComponent) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaMapper")) {
        clJavaMapper = (JavaMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaPackageMapper")) {
        clJavaPackageMapper = (JavaPackageMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaScriptMapper")) {
        clJavaScriptMapper = (JavaScriptMapper) obj;
      }
    }
  }
}
