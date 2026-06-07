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

package org.tura.model.designer.repository.serialized.form;

import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import org.tura.model.designer.repository.serialized.type.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
      value = org.tura.model.designer.repository.serialized.form.SourcesPointer.class,
      name = "SourcesPointer")
})
public interface ControlPointer {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidControlPointer();

  public void setSuidControlPointer(java.lang.String suidControlPointer);

  public String getTransientrefOpValuePointerControlPointerMetaObject();

  public void setTransientrefOpValuePointerControlPointerMetaObject(
      java.lang.String transientrefOpValuePointerControlPointerMetaObject);

  public String getTransientrefOpSourceCastControlPointerType();

  public void setTransientrefOpSourceCastControlPointerType(
      java.lang.String transientrefOpSourceCastControlPointerType);

  public String getTransientrefOpSourcePointerControlPointerDataControl();

  public void setTransientrefOpSourcePointerControlPointerDataControl(
      java.lang.String transientrefOpSourcePointerControlPointerDataControl);

  public String getTransientrefOpSourceCastDataControlControlPointerDataControl();

  public void setTransientrefOpSourceCastDataControlControlPointerDataControl(
      java.lang.String transientrefOpSourceCastDataControlControlPointerDataControl);

  public DataControl getSourcePointer();

  public void setSourcePointer(
      org.tura.model.designer.repository.serialized.form.DataControl sourcePointer);

  public MetaObject getValuePointer();

  public void setValuePointer(
      org.tura.model.designer.repository.serialized.metabase.MetaObject valuePointer);

  public Type getSourceCast();

  public void setSourceCast(org.tura.model.designer.repository.serialized.type.Type sourceCast);

  public DataControl getSourceCastDataControl();

  public void setSourceCastDataControl(
      org.tura.model.designer.repository.serialized.form.DataControl sourceCastDataControl);
}
