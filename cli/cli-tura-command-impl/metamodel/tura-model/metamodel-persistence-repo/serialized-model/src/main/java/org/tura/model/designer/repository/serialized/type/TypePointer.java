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

package org.tura.model.designer.repository.serialized.type;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.type.TypePointerObj.class,
      name = "TypePointerObj"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Attribute.class,
      name = "Attribute"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.TypeReference.class,
      name = "TypeReference"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Parameter.class,
      name = "Parameter"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.ReturnValue.class,
      name = "ReturnValue"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.CalculatedField.class,
      name = "CalculatedField"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FormParameter.class,
      name = "FormParameter"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FormVariable.class,
      name = "FormVariable"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.ArtificialField.class,
      name = "ArtificialField"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.TypeMapper.class,
      name = "TypeMapper")
})
public interface TypePointer {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidTypePointer();

  public void setSuidTypePointer(java.lang.String suidTypePointer);

  public String getTransientrefOpTypeRefTypePointerTypeElement();

  public void setTransientrefOpTypeRefTypePointerTypeElement(
      java.lang.String transientrefOpTypeRefTypePointerTypeElement);

  public String getTransientrefMany2manyHelperAssosiation();

  public void setTransientrefMany2manyHelperAssosiation(
      java.lang.String transientrefMany2manyHelperAssosiation);

  public TypeElement getTypeRef();

  public void setTypeRef(org.tura.model.designer.repository.serialized.type.TypeElement typeRef);

  public Assosiation getOpMany2manyHelperAssosiation();

  public void setOpMany2manyHelperAssosiation(
      org.tura.model.designer.repository.serialized.type.Assosiation opMany2manyHelperAssosiation);
}
