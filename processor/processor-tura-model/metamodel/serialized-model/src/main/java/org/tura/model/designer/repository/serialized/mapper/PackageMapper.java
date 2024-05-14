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

package org.tura.model.designer.repository.serialized.mapper;

import org.tura.model.designer.repository.serialized.type.PackagePointer;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper.class,
      name = "JavaPackageMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.XMLPackageMapper.class,
      name = "XMLPackageMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper.class,
      name = "MetamodelPackageMapper")
})
public interface PackageMapper extends Mapper, PackagePointer {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidPackageMapper();

  public void setSuidPackageMapper(java.lang.String suidPackageMapper);
}
