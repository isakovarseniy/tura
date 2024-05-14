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
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "ContextValue")
@javax.persistence.Table(name = "CONTEXTVALUE")
public class ContextValue implements Serializable, TypeAware {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.ContextValue.class;
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

  @javax.persistence.Column(name = "CONSTANT")
  private Boolean constant;

  public void setConstant(java.lang.Boolean constant) {
    this.constant = constant;
  }

  public Boolean getConstant() {
    return constant;
  }

  @javax.persistence.Column(name = "VALUE")
  private String value;

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_CONTEXTVALUE")
  private int vContextValue;

  public int getVcontextValue() {
    return vContextValue;
  }

  public void setVcontextValue(int vContextValue) {
    this.vContextValue = vContextValue;
  }

  @OneToMany(mappedBy = "opExpressionContextValue", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ExpressionPart> expression;

  public Collection<ExpressionPart> getExpression() {
    return expression;
  }

  public void setExpression(java.util.Collection<ExpressionPart> expression) {
    this.expression = expression;
  }

  @JoinColumns({@JoinColumn(name = "REF_VALUE_CONTEXT_PARAMETER", referencedColumnName = "UID")})
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private ContextParameter opValueContextParameter;

  public ContextParameter getOpValueContextParameter() {
    return opValueContextParameter;
  }

  public void setOpValueContextParameter(
      org.tura.model.designer.repository.jpa.form.ContextParameter opValueContextParameter) {
    this.opValueContextParameter = opValueContextParameter;
  }
}
