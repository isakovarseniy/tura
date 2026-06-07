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

package org.tura.model.designer.repository.serialized.common;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewPortHolder.class,
      name = "ViewPortHolder"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.LayerHolder.class,
      name = "LayerHolder"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Column.class, name = "Column"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Table.class, name = "Table"),
  @Type(value = org.tura.model.designer.repository.serialized.form.BlockUI.class, name = "BlockUI"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DataScroller.class,
      name = "DataScroller"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.TimeLine.class,
      name = "TimeLine"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      name = "MenuFolder"),
  @Type(value = org.tura.model.designer.repository.serialized.recipe.Recipe.class, name = "Recipe"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.Ingredient.class,
      name = "Ingredient"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.Component.class,
      name = "Component")
})
public interface HTMLLayerHolder {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public Integer getColumns();

  public void setColumns(java.lang.Integer columns);

  public String getSuidHTMLLayerHolder();

  public void setSuidHTMLLayerHolder(java.lang.String suidHTMLLayerHolder);
}
