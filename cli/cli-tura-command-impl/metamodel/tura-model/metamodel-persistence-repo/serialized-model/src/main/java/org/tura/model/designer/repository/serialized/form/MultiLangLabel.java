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
  @Type(value = org.tura.model.designer.repository.serialized.form.Label.class, name = "Label"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MessageElement.class,
      name = "MessageElement"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Button.class, name = "Button"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Column.class, name = "Column"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Table.class, name = "Table"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Menu.class, name = "Menu"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FileDownload.class,
      name = "FileDownload"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DataScroller.class,
      name = "DataScroller"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.TimeLine.class,
      name = "TimeLine"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuElement.class,
      name = "MenuElement"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      name = "MenuFolder"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Tree.class, name = "Tree")
})
public interface MultiLangLabel {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidMultiLangLabel();

  public void setSuidMultiLangLabel(java.lang.String suidMultiLangLabel);

  public Context getMultiLangLabel();

  public void setMultiLangLabel(
      org.tura.model.designer.repository.serialized.form.Context multiLangLabel);
}
