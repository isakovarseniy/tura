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

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.form.CanvasFrame.class,
      name = "CanvasFrame"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewElement.class,
      name = "ViewElement"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuDefinition.class,
      name = "MenuDefinition"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.Uielement.class,
      name = "Uielement"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.Selection.class,
      name = "Selection"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Column.class, name = "Column"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuElement.class,
      name = "MenuElement"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      name = "MenuFolder")
})
public interface StyleElement {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidStyleElement();

  public void setSuidStyleElement(java.lang.String suidStyleElement);

  public Context getStyle();

  public void setStyle(org.tura.model.designer.repository.serialized.form.Context style);
}
