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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PopupCanvas.class,
      name = "PopupCanvas"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.OverlayCanvas.class,
      name = "OverlayCanvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Canvas.class, name = "Canvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Window.class, name = "Window"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.TabCanvas.class,
      name = "TabCanvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.TabPage.class, name = "TabPage"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewPort.class,
      name = "ViewPort"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewArea.class,
      name = "ViewArea"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.Uielement.class,
      name = "Uielement"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Column.class, name = "Column"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.WindowRef.class,
      name = "WindowRef"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuElement.class,
      name = "MenuElement"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      name = "MenuFolder"),
  @Type(value = org.tura.model.designer.repository.serialized.form.SubMenu.class, name = "SubMenu")
})
public interface FlexFields {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidFlexFields();

  public void setSuidFlexFields(java.lang.String suidFlexFields);

  public List<FlexField> getFields();

  public void setFields(java.util.List<FlexField> fields);
}
