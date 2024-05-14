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

import org.tura.model.designer.repository.serialized.type.MethodPointer;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewPortTrigger.class,
      name = "ViewPortTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PREFormTrigger.class,
      name = "PREFormTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PREQueryTrigger.class,
      name = "PREQueryTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.POSTQueryTrigger.class,
      name = "POSTQueryTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PREInsertTrigger.class,
      name = "PREInsertTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PREDeleteTrigger.class,
      name = "PREDeleteTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.POSTCreateTrigger.class,
      name = "POSTCreateTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PREUpdateTrigger.class,
      name = "PREUpdateTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.CreateTrigger.class,
      name = "CreateTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.InsertTrigger.class,
      name = "InsertTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.UpdateTrigger.class,
      name = "UpdateTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DeleteTrigger.class,
      name = "DeleteTrigger"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.SearchTrigger.class,
      name = "SearchTrigger")
})
public interface Trigger extends MethodPointer, ContextParameters {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidTrigger();

  public void setSuidTrigger(java.lang.String suidTrigger);
}
