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

@Entity(name = "TypeMapper")
@javax.persistence.Table(name = "TYPEMAPPER")
public class TypeMapper implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.mapper.TypeMapper.class;
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
  @javax.persistence.Column(name = "V_TYPEMAPPER")
  private int vTypeMapper;

  public int getVtypeMapper() {
    return vTypeMapper;
  }

  public void setVtypeMapper(int vTypeMapper) {
    this.vTypeMapper = vTypeMapper;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhTypeMapper", fetch = javax.persistence.FetchType.LAZY)
  private JavaMapper clJavaMapper;

  @OneToOne(mappedBy = "inhTypeMapper", fetch = javax.persistence.FetchType.LAZY)
  private JavaScriptMapper clJavaScriptMapper;

  @OneToOne(mappedBy = "inhTypeMapper", fetch = javax.persistence.FetchType.LAZY)
  private XMLTypeMapper clXMLTypeMapper;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clJavaMapper != null) {
      return clJavaMapper.getObject();
    }
    if (clJavaScriptMapper != null) {
      return clJavaScriptMapper.getObject();
    }
    if (clXMLTypeMapper != null) {
      return clXMLTypeMapper.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaMapper")) {
        clJavaMapper = (JavaMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaScriptMapper")) {
        clJavaScriptMapper = (JavaScriptMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.XMLTypeMapper")) {
        clXMLTypeMapper = (XMLTypeMapper) obj;
      }
    }
  }
}
