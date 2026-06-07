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
public class ContextParameter implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.ContextParameter.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_CONTEXTPARAMETER")
  private long vContextParameter;

  public long getVcontextParameter() {
    return vContextParameter;
  }

  public void setVcontextParameter(long vContextParameter) {
    this.vContextParameter = vContextParameter;
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

  @org.neo4j.ogm.annotation.Property(name = "OPERATION")
  private Comparator operation;

  public void setOperation(org.tura.model.designer.repository.neoj4.form.Comparator operation) {
    this.operation = operation;
  }

  public Comparator getOperation() {
    return operation;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_REF_OBJ_CONTEXT_PARAMETER_META_OBJECT")
  private String refOpRefObjContextParameterMetaObject;

  public void setRefOpRefObjContextParameterMetaObject(
      java.lang.String refOpRefObjContextParameterMetaObject) {
    this.refOpRefObjContextParameterMetaObject = refOpRefObjContextParameterMetaObject;
  }

  public String getRefOpRefObjContextParameterMetaObject() {
    return refOpRefObjContextParameterMetaObject;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_PARAMETERS_CONTEXT_PARAMETERS")
  private String refParametersContextParameters;

  public void setRefParametersContextParameters(java.lang.String refParametersContextParameters) {
    this.refParametersContextParameters = refParametersContextParameters;
  }

  public String getRefParametersContextParameters() {
    return refParametersContextParameters;
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
