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
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ExpressionPart implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.ExpressionPart.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_EXPRESSIONPART")
  private long vExpressionPart;

  public long getVexpressionPart() {
    return vExpressionPart;
  }

  public void setVexpressionPart(long vExpressionPart) {
    this.vExpressionPart = vExpressionPart;
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

  @org.neo4j.ogm.annotation.Property(name = "ORDER_")
  private Integer order;

  public void setOrder(java.lang.Integer order) {
    this.order = order;
  }

  public Integer getOrder() {
    return order;
  }

  @org.neo4j.ogm.annotation.Property(name = "EXPRESSION_TYPE")
  private String expressionType;

  public void setExpressionType(java.lang.String expressionType) {
    this.expressionType = expressionType;
  }

  public String getExpressionType() {
    return expressionType;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_OBJ_REF_EXPRESSION_PART_META_OBJECT")
  private String refOpObjRefExpressionPartMetaObject;

  public void setRefOpObjRefExpressionPartMetaObject(
      java.lang.String refOpObjRefExpressionPartMetaObject) {
    this.refOpObjRefExpressionPartMetaObject = refOpObjRefExpressionPartMetaObject;
  }

  public String getRefOpObjRefExpressionPartMetaObject() {
    return refOpObjRefExpressionPartMetaObject;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_EXPRESSION_CONTEXT_VALUE")
  private String refExpressionContextValue;

  public void setRefExpressionContextValue(java.lang.String refExpressionContextValue) {
    this.refExpressionContextValue = refExpressionContextValue;
  }

  public String getRefExpressionContextValue() {
    return refExpressionContextValue;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }
}
