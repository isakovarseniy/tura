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
import org.tura.platform.repository.persistence.CastTo;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.model.designer.repository.jpa.type.Type;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "SourcesPointer")
@javax.persistence.Table(name = "SOURCESPOINTER")
public class SourcesPointer extends Uielement implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.SourcesPointer.class;
  }

  public void setSuidControlPointer(java.lang.String suid) {}

  public String getSuidControlPointer() {
    return this.getInhControlPointer().getSuid();
  }

  public DataControl getSourcePointer() {
    return this.getInhControlPointer().getSourcePointer();
  }

  public void setSourcePointer(
      org.tura.model.designer.repository.jpa.form.DataControl sourcePointer) {
    this.getInhControlPointer().setSourcePointer(sourcePointer);
  }

  public MetaObject getValuePointer() {
    return this.getInhControlPointer().getValuePointer();
  }

  public void setValuePointer(
      org.tura.model.designer.repository.jpa.metabase.MetaObject valuePointer) {
    this.getInhControlPointer().setValuePointer(valuePointer);
  }

  public Type getSourceCast() {
    return this.getInhControlPointer().getSourceCast();
  }

  public void setSourceCast(org.tura.model.designer.repository.jpa.type.Type sourceCast) {
    this.getInhControlPointer().setSourceCast(sourceCast);
  }

  public DataControl getSourceCastDataControl() {
    return this.getInhControlPointer().getSourceCastDataControl();
  }

  public void setSourceCastDataControl(
      org.tura.model.designer.repository.jpa.form.DataControl sourceCastDataControl) {
    this.getInhControlPointer().setSourceCastDataControl(sourceCastDataControl);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_controlPointer", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private ControlPointer inhControlPointer;

  public ControlPointer getInhControlPointer() {
    return inhControlPointer;
  }

  public void setInhControlPointer(
      org.tura.model.designer.repository.jpa.form.ControlPointer inhControlPointer) {
    this.inhControlPointer = inhControlPointer;
  }

  public SourcesPointer() {
    ControlPointer controlPointer = new ControlPointer();
    this.inhControlPointer = controlPointer;
    controlPointer.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.SourcesPointer.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.Uielement.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.ControlPointer.class.getName())) {
      return (T) this.inhControlPointer;
    }
    return super.castTo(clazz);
  }

  public Object getObject() {
    return this;
  }
}
