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
import org.tura.platform.repository.core.annotation.Association;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import org.tura.model.designer.repository.serialized.type.Type;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
      value = org.tura.model.designer.repository.serialized.form.InputElement.class,
      name = "InputElement"),
  @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
      value = org.tura.model.designer.repository.serialized.form.Table.class,
      name = "Table"),
  @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
      value = org.tura.model.designer.repository.serialized.form.DataScroller.class,
      name = "DataScroller"),
  @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
      value = org.tura.model.designer.repository.serialized.form.TimeLine.class,
      name = "TimeLine"),
  @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
      value = org.tura.model.designer.repository.serialized.form.FullCalendar.class,
      name = "FullCalendar"),
  @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
      value = org.tura.model.designer.repository.serialized.form.Tree.class,
      name = "Tree")
})
public class SourcesPointer extends Uielement implements Serializable, ControlPointer {

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

  private String suidControlPointer;

  public String getSuidControlPointer() {
    return suidControlPointer;
  }

  public void setSuidControlPointer(java.lang.String suidControlPointer) {
    this.suidControlPointer = suidControlPointer;
  }

  private String transientrefOpValuePointerControlPointerMetaObject;

  public String getTransientrefOpValuePointerControlPointerMetaObject() {
    return transientrefOpValuePointerControlPointerMetaObject;
  }

  public void setTransientrefOpValuePointerControlPointerMetaObject(
      java.lang.String transientrefOpValuePointerControlPointerMetaObject) {
    this.transientrefOpValuePointerControlPointerMetaObject =
        transientrefOpValuePointerControlPointerMetaObject;
  }

  private String transientrefOpSourceCastControlPointerType;

  public String getTransientrefOpSourceCastControlPointerType() {
    return transientrefOpSourceCastControlPointerType;
  }

  public void setTransientrefOpSourceCastControlPointerType(
      java.lang.String transientrefOpSourceCastControlPointerType) {
    this.transientrefOpSourceCastControlPointerType = transientrefOpSourceCastControlPointerType;
  }

  private String transientrefOpSourcePointerControlPointerDataControl;

  public String getTransientrefOpSourcePointerControlPointerDataControl() {
    return transientrefOpSourcePointerControlPointerDataControl;
  }

  public void setTransientrefOpSourcePointerControlPointerDataControl(
      java.lang.String transientrefOpSourcePointerControlPointerDataControl) {
    this.transientrefOpSourcePointerControlPointerDataControl =
        transientrefOpSourcePointerControlPointerDataControl;
  }

  private String transientrefOpSourceCastDataControlControlPointerDataControl;

  public String getTransientrefOpSourceCastDataControlControlPointerDataControl() {
    return transientrefOpSourceCastDataControlControlPointerDataControl;
  }

  public void setTransientrefOpSourceCastDataControlControlPointerDataControl(
      java.lang.String transientrefOpSourceCastDataControlControlPointerDataControl) {
    this.transientrefOpSourceCastDataControlControlPointerDataControl =
        transientrefOpSourceCastDataControlControlPointerDataControl;
  }

  private DataControl sourcePointer;

  @Association(
      id = "4602eb8d-c89b-4a6c-97ca-541586b81ddf",
      from = org.tura.model.designer.repository.serialized.form.ControlPointer.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.DataControl.class,
      property = "opSourcePointerControlPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public DataControl getSourcePointer() {
    return sourcePointer;
  }

  public void setSourcePointer(
      org.tura.model.designer.repository.serialized.form.DataControl sourcePointer) {
    this.sourcePointer = sourcePointer;
  }

  private MetaObject valuePointer;

  @Association(
      id = "f7c17e78-ca29-4283-8b59-58a4b320d35a",
      from = org.tura.model.designer.repository.serialized.form.ControlPointer.class,
      mappedBy = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      property = "opValuePointerControlPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public MetaObject getValuePointer() {
    return valuePointer;
  }

  public void setValuePointer(
      org.tura.model.designer.repository.serialized.metabase.MetaObject valuePointer) {
    this.valuePointer = valuePointer;
  }

  private Type sourceCast;

  @Association(
      id = "4f0f8d47-4698-45c8-8a9d-9c8264a3a0ad",
      from = org.tura.model.designer.repository.serialized.form.ControlPointer.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Type.class,
      property = "opSourceCastControlPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Type getSourceCast() {
    return sourceCast;
  }

  public void setSourceCast(org.tura.model.designer.repository.serialized.type.Type sourceCast) {
    this.sourceCast = sourceCast;
  }

  private DataControl sourceCastDataControl;

  @Association(
      id = "b77b09c0-4bb1-4eca-861d-7260caaa15f0",
      from = org.tura.model.designer.repository.serialized.form.ControlPointer.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.DataControl.class,
      property = "opSourceCastDataControlControlPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public DataControl getSourceCastDataControl() {
    return sourceCastDataControl;
  }

  public void setSourceCastDataControl(
      org.tura.model.designer.repository.serialized.form.DataControl sourceCastDataControl) {
    this.sourceCastDataControl = sourceCastDataControl;
  }
}
