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
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "Formatable")
@javax.persistence.Table(name = "FORMATABLE")
public class Formatable implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.Formatable.class;
  }

  @javax.persistence.Column(name = "FORMAT")
  private String format;

  public void setFormat(java.lang.String format) {
    this.format = format;
  }

  public String getFormat() {
    return format;
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
  @javax.persistence.Column(name = "V_FORMATABLE")
  private int vFormatable;

  public int getVformatable() {
    return vFormatable;
  }

  public void setVformatable(int vFormatable) {
    this.vFormatable = vFormatable;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhFormatable", fetch = javax.persistence.FetchType.LAZY)
  private InputText clInputText;

  @OneToOne(mappedBy = "inhFormatable", fetch = javax.persistence.FetchType.LAZY)
  private Password clPassword;

  @OneToOne(mappedBy = "inhFormatable", fetch = javax.persistence.FetchType.LAZY)
  private OutputText clOutputText;

  @OneToOne(mappedBy = "inhFormatable", fetch = javax.persistence.FetchType.LAZY)
  private Date clDate;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clInputText != null) {
      return clInputText.getObject();
    }
    if (clPassword != null) {
      return clPassword.getObject();
    }
    if (clOutputText != null) {
      return clOutputText.getObject();
    }
    if (clDate != null) {
      return clDate.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.InputText")) {
        clInputText = (InputText) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Password")) {
        clPassword = (Password) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.OutputText")) {
        clOutputText = (OutputText) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Date")) {
        clDate = (Date) obj;
      }
    }
  }
}
