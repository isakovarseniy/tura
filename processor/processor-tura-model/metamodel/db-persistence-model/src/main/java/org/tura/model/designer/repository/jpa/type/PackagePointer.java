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

package org.tura.model.designer.repository.jpa.type;

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
import org.tura.model.designer.repository.jpa.mapper.JavaPackageMapper;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.mapper.XMLPackageMapper;
import org.tura.model.designer.repository.jpa.mapper.MetamodelPackageMapper;
import javax.persistence.Entity;

@Entity(name = "PackagePointer")
@javax.persistence.Table(name = "PACKAGEPOINTER")
public class PackagePointer implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.type.PackagePointer.class;
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
  @javax.persistence.Column(name = "V_PACKAGEPOINTER")
  private int vPackagePointer;

  public int getVpackagePointer() {
    return vPackagePointer;
  }

  public void setVpackagePointer(int vPackagePointer) {
    this.vPackagePointer = vPackagePointer;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_PACKAGE_REF_PACKAGE_POINTER_TYPE_GROUP",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private TypeGroup packageRef;

  public TypeGroup getPackageRef() {
    return packageRef;
  }

  public void setPackageRef(org.tura.model.designer.repository.jpa.type.TypeGroup packageRef) {
    this.packageRef = packageRef;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhPackagePointer", fetch = javax.persistence.FetchType.LAZY)
  private JavaPackageMapper clJavaPackageMapper;

  @OneToOne(mappedBy = "inhPackagePointer", fetch = javax.persistence.FetchType.LAZY)
  private XMLPackageMapper clXMLPackageMapper;

  @OneToOne(mappedBy = "inhPackagePointer", fetch = javax.persistence.FetchType.LAZY)
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
