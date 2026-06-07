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
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ContextValue implements Serializable, TypeAware {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.ContextValue.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_CONTEXTVALUE")
  private long vContextValue;

  public long getVcontextValue() {
    return vContextValue;
  }

  public void setVcontextValue(long vContextValue) {
    this.vContextValue = vContextValue;
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

  @org.neo4j.ogm.annotation.Property(name = "CONSTANT")
  private Boolean constant;

  public void setConstant(java.lang.Boolean constant) {
    this.constant = constant;
  }

  public Boolean getConstant() {
    return constant;
  }

  @org.neo4j.ogm.annotation.Property(name = "VALUE")
  private String value;

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_VALUE_CONTEXT_PARAMETER")
  private String refValueContextParameter;

  public void setRefValueContextParameter(java.lang.String refValueContextParameter) {
    this.refValueContextParameter = refValueContextParameter;
  }

  public String getRefValueContextParameter() {
    return refValueContextParameter;
  }
}
