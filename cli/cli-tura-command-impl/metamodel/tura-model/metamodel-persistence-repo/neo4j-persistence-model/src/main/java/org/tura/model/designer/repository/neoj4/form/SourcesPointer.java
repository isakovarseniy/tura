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
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class SourcesPointer extends Uielement implements Serializable, TypeAware, ControlPointer {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.SourcesPointer.class;
  }

  @Id @GeneratedValue Long __id;

  public void setSuidControlPointer(java.lang.String suid) {}

  public String getSuidControlPointer() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_VALUE_POINTER_CONTROL_POINTER_META_OBJECT")
  private String refOpValuePointerControlPointerMetaObject;

  public void setRefOpValuePointerControlPointerMetaObject(
      java.lang.String refOpValuePointerControlPointerMetaObject) {
    this.refOpValuePointerControlPointerMetaObject = refOpValuePointerControlPointerMetaObject;
  }

  public String getRefOpValuePointerControlPointerMetaObject() {
    return refOpValuePointerControlPointerMetaObject;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_CAST_CONTROL_POINTER_TYPE")
  private String refOpSourceCastControlPointerType;

  public void setRefOpSourceCastControlPointerType(
      java.lang.String refOpSourceCastControlPointerType) {
    this.refOpSourceCastControlPointerType = refOpSourceCastControlPointerType;
  }

  public String getRefOpSourceCastControlPointerType() {
    return refOpSourceCastControlPointerType;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_POINTER_CONTROL_POINTER_DATA_CONTROL")
  private String refOpSourcePointerControlPointerDataControl;

  public void setRefOpSourcePointerControlPointerDataControl(
      java.lang.String refOpSourcePointerControlPointerDataControl) {
    this.refOpSourcePointerControlPointerDataControl = refOpSourcePointerControlPointerDataControl;
  }

  public String getRefOpSourcePointerControlPointerDataControl() {
    return refOpSourcePointerControlPointerDataControl;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(
      name = "REF_OP_SOURCE_CAST_DATA_CONTROL_CONTROL_POINTER_DATA_CONTROL")
  private String refOpSourceCastDataControlControlPointerDataControl;

  public void setRefOpSourceCastDataControlControlPointerDataControl(
      java.lang.String refOpSourceCastDataControlControlPointerDataControl) {
    this.refOpSourceCastDataControlControlPointerDataControl =
        refOpSourceCastDataControlControlPointerDataControl;
  }

  public String getRefOpSourceCastDataControlControlPointerDataControl() {
    return refOpSourceCastDataControlControlPointerDataControl;
  }
}
