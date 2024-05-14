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

package org.tura.model.designer.repository.jpa.style;

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
import org.tura.model.designer.repository.jpa.mapper.CSSMapper;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "StylePointer")
@javax.persistence.Table(name = "STYLEPOINTER")
public class StylePointer implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.style.StylePointer.class;
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
  @javax.persistence.Column(name = "V_STYLEPOINTER")
  private int vStylePointer;

  public int getVstylePointer() {
    return vStylePointer;
  }

  public void setVstylePointer(int vStylePointer) {
    this.vStylePointer = vStylePointer;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_STYLE_LIBRARY_STYLE_POINTER_STYLE_LIBRARY",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private StyleLibrary styleLibrary;

  public StyleLibrary getStyleLibrary() {
    return styleLibrary;
  }

  public void setStyleLibrary(
      org.tura.model.designer.repository.jpa.style.StyleLibrary styleLibrary) {
    this.styleLibrary = styleLibrary;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhStylePointer", fetch = javax.persistence.FetchType.LAZY)
  private CSSMapper clCSSMapper;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clCSSMapper != null) {
      return clCSSMapper.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.CSSMapper")) {
        clCSSMapper = (CSSMapper) obj;
      }
    }
  }
}
