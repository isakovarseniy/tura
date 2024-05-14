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

package org.tura.model.designer.repository.serialized.common;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
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
      value = org.tura.model.designer.repository.serialized.form.MenuElement.class,
      name = "MenuElement"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.Ingredient.class,
      name = "Ingredient"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.Component.class,
      name = "Component"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.ModelMapper.class,
      name = "ModelMapper")
})
public interface Orderable {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public Integer getOrder();

  public void setOrder(java.lang.Integer order);

  public String getSuidOrderable();

  public void setSuidOrderable(java.lang.String suidOrderable);
}
