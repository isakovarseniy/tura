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

package org.tura.model.designer.repository.serialized.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(value = org.tura.model.designer.repository.serialized.form.Context.class, name = "Context")
})
public class ContextValue implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean attached;

  public Boolean getAttached() {
    return attached;
  }

  public void setAttached(Boolean value) {
    this.attached = value;
  }

  private String serializationid;

  public String getSerializationid() {
    return serializationid;
  }

  public void setSerializationid(String value) {
    this.serializationid = value;
  }

  private String cpaid;

  public String getCpaid() {
    return cpaid;
  }

  public void setCpaid(String value) {
    this.cpaid = value;
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private Boolean constant;

  public Boolean getConstant() {
    return constant;
  }

  public void setConstant(java.lang.Boolean constant) {
    this.constant = constant;
  }

  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  private String transientrefValueContextParameter;

  public String getTransientrefValueContextParameter() {
    return transientrefValueContextParameter;
  }

  public void setTransientrefValueContextParameter(
      java.lang.String transientrefValueContextParameter) {
    this.transientrefValueContextParameter = transientrefValueContextParameter;
  }

  private List<ExpressionPart> expression = new ArrayList<>();

  @Association(
      id = "629b2dc8-44ce-448f-9567-8353e8b2a794",
      from = org.tura.model.designer.repository.serialized.form.ContextValue.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ExpressionPart.class,
      property = "opExpressionContextValue",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ExpressionPart> getExpression() {
    return expression;
  }

  public void setExpression(java.util.List<ExpressionPart> expression) {
    this.expression = expression;
  }

  private ContextParameter opValueContextParameter;

  @Association(
      id = "88770f3e-b6aa-4f87-bd77-c42153663e12",
      from = org.tura.model.designer.repository.serialized.form.ContextValue.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ContextParameter.class,
      property = "value",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public ContextParameter getOpValueContextParameter() {
    return opValueContextParameter;
  }

  public void setOpValueContextParameter(
      org.tura.model.designer.repository.serialized.form.ContextParameter opValueContextParameter) {
    this.opValueContextParameter = opValueContextParameter;
  }
}
