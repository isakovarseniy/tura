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

import org.tura.model.designer.repository.serialized.type.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
      value = org.tura.model.designer.repository.serialized.form.DropDownSelection.class,
      name = "DropDownSelection"),
  @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
      value = org.tura.model.designer.repository.serialized.form.SelectManyMenu.class,
      name = "SelectManyMenu"),
  @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
      value = org.tura.model.designer.repository.serialized.form.RadioSelection.class,
      name = "RadioSelection")
})
public interface OptionSelection {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getInitialOptionValue();

  public void setInitialOptionValue(java.lang.String initialOptionValue);

  public String getSuidOptionSelection();

  public void setSuidOptionSelection(java.lang.String suidOptionSelection);

  public String getTransientrefOpOptionCastOptionSelectionType();

  public void setTransientrefOpOptionCastOptionSelectionType(
      java.lang.String transientrefOpOptionCastOptionSelectionType);

  public String getTransientrefOpOptionPointerOptionSelectionDataControl();

  public void setTransientrefOpOptionPointerOptionSelectionDataControl(
      java.lang.String transientrefOpOptionPointerOptionSelectionDataControl);

  public String getTransientrefOpOptionCastDataControlOptionSelectionDataControl();

  public void setTransientrefOpOptionCastDataControlOptionSelectionDataControl(
      java.lang.String transientrefOpOptionCastDataControlOptionSelectionDataControl);

  public Selection getSelection();

  public void setSelection(org.tura.model.designer.repository.serialized.form.Selection selection);

  public Context getInitialOptionMessage();

  public void setInitialOptionMessage(
      org.tura.model.designer.repository.serialized.form.Context initialOptionMessage);

  public DataControl getOptionPointer();

  public void setOptionPointer(
      org.tura.model.designer.repository.serialized.form.DataControl optionPointer);

  public Type getOptionCast();

  public void setOptionCast(org.tura.model.designer.repository.serialized.type.Type optionCast);

  public DataControl getOptionCastDataControl();

  public void setOptionCastDataControl(
      org.tura.model.designer.repository.serialized.form.DataControl optionCastDataControl);
}
