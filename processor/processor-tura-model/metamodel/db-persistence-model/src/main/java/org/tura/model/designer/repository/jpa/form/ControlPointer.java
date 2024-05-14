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
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.model.designer.repository.jpa.type.Type;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "ControlPointer")
@javax.persistence.Table(name = "CONTROLPOINTER")
public class ControlPointer implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.ControlPointer.class;
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
  @javax.persistence.Column(name = "V_CONTROLPOINTER")
  private int vControlPointer;

  public int getVcontrolPointer() {
    return vControlPointer;
  }

  public void setVcontrolPointer(int vControlPointer) {
    this.vControlPointer = vControlPointer;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_SOURCE_POINTER_CONTROL_POINTER_DATA_CONTROL",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private DataControl sourcePointer;

  public DataControl getSourcePointer() {
    return sourcePointer;
  }

  public void setSourcePointer(
      org.tura.model.designer.repository.jpa.form.DataControl sourcePointer) {
    this.sourcePointer = sourcePointer;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_VALUE_POINTER_CONTROL_POINTER_META_OBJECT",
        referencedColumnName = "SUID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private MetaObject valuePointer;

  public MetaObject getValuePointer() {
    return valuePointer;
  }

  public void setValuePointer(
      org.tura.model.designer.repository.jpa.metabase.MetaObject valuePointer) {
    this.valuePointer = valuePointer;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_SOURCE_CAST_CONTROL_POINTER_TYPE", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Type sourceCast;

  public Type getSourceCast() {
    return sourceCast;
  }

  public void setSourceCast(org.tura.model.designer.repository.jpa.type.Type sourceCast) {
    this.sourceCast = sourceCast;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_SOURCE_CAST_DATA_CONTROL_CONTROL_POINTER_DATA_CONTROL",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private DataControl sourceCastDataControl;

  public DataControl getSourceCastDataControl() {
    return sourceCastDataControl;
  }

  public void setSourceCastDataControl(
      org.tura.model.designer.repository.jpa.form.DataControl sourceCastDataControl) {
    this.sourceCastDataControl = sourceCastDataControl;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhControlPointer", fetch = javax.persistence.FetchType.LAZY)
  private SourcesPointer clSourcesPointer;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clSourcesPointer != null) {
      return clSourcesPointer.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.SourcesPointer")) {
        clSourcesPointer = (SourcesPointer) obj;
      }
    }
  }
}
