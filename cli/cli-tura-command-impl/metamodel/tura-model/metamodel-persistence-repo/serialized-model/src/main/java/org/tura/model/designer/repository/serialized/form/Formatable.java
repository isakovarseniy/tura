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
      value = org.tura.model.designer.repository.serialized.form.InputText.class,
      name = "InputText"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.Password.class,
      name = "Password"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.OutputText.class,
      name = "OutputText"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Date.class, name = "Date")
})
public interface Formatable {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getFormat();

  public void setFormat(java.lang.String format);

  public String getSuidFormatable();

  public void setSuidFormatable(java.lang.String suidFormatable);
}
