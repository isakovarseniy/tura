/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.model.designer.repository.neoj4.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.type.TypePointer;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class FormParameter implements Serializable, TypeAware, TypePointer, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.FormParameter.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_FORMPARAMETER")
  private long vFormParameter;

  public long getVformParameter() {
    return vFormParameter;
  }

  public void setVformParameter(long vFormParameter) {
    this.vFormParameter = vFormParameter;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @org.neo4j.ogm.annotation.Property(name = "NAME")
  private String name;

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_PARAMETERS_FORM")
  private String refParametersForm;

  public void setRefParametersForm(java.lang.String refParametersForm) {
    this.refParametersForm = refParametersForm;
  }

  public String getRefParametersForm() {
    return refParametersForm;
  }

  public void setSuidTypePointer(java.lang.String suid) {}

  public String getSuidTypePointer() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TYPE_REF_TYPE_POINTER_TYPE_ELEMENT")
  private String refOpTypeRefTypePointerTypeElement;

  public void setRefOpTypeRefTypePointerTypeElement(
      java.lang.String refOpTypeRefTypePointerTypeElement) {
    this.refOpTypeRefTypePointerTypeElement = refOpTypeRefTypePointerTypeElement;
  }

  public String getRefOpTypeRefTypePointerTypeElement() {
    return refOpTypeRefTypePointerTypeElement;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_MANY2MANY_HELPER_ASSOSIATION")
  private String refMany2manyHelperAssosiation;

  public void setRefMany2manyHelperAssosiation(java.lang.String refMany2manyHelperAssosiation) {
    this.refMany2manyHelperAssosiation = refMany2manyHelperAssosiation;
  }

  public String getRefMany2manyHelperAssosiation() {
    return refMany2manyHelperAssosiation;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
