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

package org.tura.model.designer.repository.jpa.objectmapper;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.type.TypeElement;
import org.tura.model.designer.repository.jpa.type.Assosiation;
import org.tura.model.designer.repository.jpa.type.TypePointer;
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "CalculatedField")
@javax.persistence.Table(name = "CALCULATEDFIELD")
public class CalculatedField implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.objectmapper.CalculatedField.class;
  }

  @Id
  @javax.persistence.Column(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @javax.persistence.Column(name = "NAME")
  private String name;

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_CALCULATEDFIELD")
  private int vCalculatedField;

  public int getVcalculatedField() {
    return vCalculatedField;
  }

  public void setVcalculatedField(int vCalculatedField) {
    this.vCalculatedField = vCalculatedField;
  }

  @JoinColumns({@JoinColumn(name = "REF_CALCULATIONS_OBJECT_MAPPER", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private ObjectMapper opCalculationsObjectMapper;

  public ObjectMapper getOpCalculationsObjectMapper() {
    return opCalculationsObjectMapper;
  }

  public void setOpCalculationsObjectMapper(
      org.tura.model.designer.repository.jpa.objectmapper.ObjectMapper opCalculationsObjectMapper) {
    this.opCalculationsObjectMapper = opCalculationsObjectMapper;
  }

  public void setSuidTypePointer(java.lang.String suid) {}

  public String getSuidTypePointer() {
    return this.getInhTypePointer().getSuid();
  }

  public TypeElement getTypeRef() {
    return this.getInhTypePointer().getTypeRef();
  }

  public void setTypeRef(org.tura.model.designer.repository.jpa.type.TypeElement typeRef) {
    this.getInhTypePointer().setTypeRef(typeRef);
  }

  public Assosiation getOpMany2manyHelperAssosiation() {
    return this.getInhTypePointer().getOpMany2manyHelperAssosiation();
  }

  public void setOpMany2manyHelperAssosiation(
      org.tura.model.designer.repository.jpa.type.Assosiation opMany2manyHelperAssosiation) {
    this.getInhTypePointer().setOpMany2manyHelperAssosiation(opMany2manyHelperAssosiation);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_typePointer", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private TypePointer inhTypePointer;

  public TypePointer getInhTypePointer() {
    return inhTypePointer;
  }

  public void setInhTypePointer(
      org.tura.model.designer.repository.jpa.type.TypePointer inhTypePointer) {
    this.inhTypePointer = inhTypePointer;
  }

  public CalculatedField() {
    TypePointer typePointer = new TypePointer();
    this.inhTypePointer = typePointer;
    typePointer.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(
            org.tura.model.designer.repository.jpa.objectmapper.CalculatedField.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.type.TypePointer.class.getName())) {
      return (T) this.inhTypePointer;
    }
    throw new RepositoryException("Cast exception to  " + clazz.getName());
  }

  public Object getObject() {
    return this;
  }
}
