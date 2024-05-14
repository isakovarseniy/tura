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
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "PackageMapper")
@javax.persistence.Table(name = "PACKAGEMAPPER")
public class PackageMapper implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.mapper.PackageMapper.class;
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
  @javax.persistence.Column(name = "V_PACKAGEMAPPER")
  private int vPackageMapper;

  public int getVpackageMapper() {
    return vPackageMapper;
  }

  public void setVpackageMapper(int vPackageMapper) {
    this.vPackageMapper = vPackageMapper;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhPackageMapper", fetch = javax.persistence.FetchType.LAZY)
  private JavaPackageMapper clJavaPackageMapper;

  @OneToOne(mappedBy = "inhPackageMapper", fetch = javax.persistence.FetchType.LAZY)
  private XMLPackageMapper clXMLPackageMapper;

  @OneToOne(mappedBy = "inhPackageMapper", fetch = javax.persistence.FetchType.LAZY)
  private MetamodelPackageMapper clMetamodelPackageMapper;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clJavaPackageMapper != null) {
      return clJavaPackageMapper.getObject();
    }
    if (clXMLPackageMapper != null) {
      return clXMLPackageMapper.getObject();
    }
    if (clMetamodelPackageMapper != null) {
      return clMetamodelPackageMapper.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaPackageMapper")) {
        clJavaPackageMapper = (JavaPackageMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.XMLPackageMapper")) {
        clXMLPackageMapper = (XMLPackageMapper) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.mapper.MetamodelPackageMapper")) {
        clMetamodelPackageMapper = (MetamodelPackageMapper) obj;
      }
    }
  }
}
