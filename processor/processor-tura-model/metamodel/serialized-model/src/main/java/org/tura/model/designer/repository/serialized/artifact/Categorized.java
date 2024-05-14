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

package org.tura.model.designer.repository.serialized.artifact;

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
      value = org.tura.model.designer.repository.serialized.type.TypeGroup.class,
      name = "TypeGroup"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Relationship.class,
      name = "Relationship"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Attribute.class,
      name = "Attribute"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Operation.class,
      name = "Operation"),
  @Type(value = org.tura.model.designer.repository.serialized.type.Type.class, name = "Type"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Enumerator.class,
      name = "Enumerator"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.EnumAttribute.class,
      name = "EnumAttribute"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      name = "ObjectMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.message.MessageLibrary.class,
      name = "MessageLibrary"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewElement.class,
      name = "ViewElement"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.PopupCanvas.class,
      name = "PopupCanvas"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.OverlayCanvas.class,
      name = "OverlayCanvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Canvas.class, name = "Canvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Window.class, name = "Window"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuDefinition.class,
      name = "MenuDefinition"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.TabCanvas.class,
      name = "TabCanvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.TabPage.class, name = "TabPage"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FlexField.class,
      name = "FlexField"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.Uielement.class,
      name = "Uielement"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Column.class, name = "Column"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuElement.class,
      name = "MenuElement"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      name = "MenuFolder"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DataControl.class,
      name = "DataControl"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.ModelMapper.class,
      name = "ModelMapper")
})
public interface Categorized {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidCategorized();

  public void setSuidCategorized(java.lang.String suidCategorized);

  public List<Classifier> getClassifiers();

  public void setClassifiers(java.util.List<Classifier> classifiers);
}
