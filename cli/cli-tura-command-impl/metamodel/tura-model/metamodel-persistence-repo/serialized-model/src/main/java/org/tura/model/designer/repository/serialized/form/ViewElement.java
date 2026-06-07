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

import org.tura.model.designer.repository.serialized.artifact.Categorized;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewPort.class,
      name = "ViewPort"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ViewArea.class,
      name = "ViewArea")
})
public interface ViewElement extends StyleElement, Categorized, NickNamed {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidViewElement();

  public void setSuidViewElement(java.lang.String suidViewElement);

  public String getTransientrefViewElementViewPortHolder();

  public void setTransientrefViewElementViewPortHolder(
      java.lang.String transientrefViewElementViewPortHolder);

  public ViewPortHolder getOpViewElementViewPortHolder();

  public void setOpViewElementViewPortHolder(
      org.tura.model.designer.repository.serialized.form.ViewPortHolder
          opViewElementViewPortHolder);
}
