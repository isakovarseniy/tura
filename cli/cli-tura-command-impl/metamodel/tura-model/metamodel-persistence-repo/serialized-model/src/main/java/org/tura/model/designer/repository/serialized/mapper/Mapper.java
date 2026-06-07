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

package org.tura.model.designer.repository.serialized.mapper;

import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import java.util.List;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.TypeMapper.class,
      name = "TypeMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.PackageMapper.class,
      name = "PackageMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.CSSMapper.class,
      name = "CSSMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.RoleMapper.class,
      name = "RoleMapper")
})
public interface Mapper {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidMapper();

  public void setSuidMapper(java.lang.String suidMapper);

  public String getTransientrefMappersMappers();

  public void setTransientrefMappersMappers(java.lang.String transientrefMappersMappers);

  public List<JavaComponent> getOpMapperRefJavaComponent();

  public void setOpMapperRefJavaComponent(java.util.List<JavaComponent> opMapperRefJavaComponent);

  public List<JavaScriptComponent> getOpMapperRefJavaScriptComponent();

  public void setOpMapperRefJavaScriptComponent(
      java.util.List<JavaScriptComponent> opMapperRefJavaScriptComponent);

  public List<MappingLayer> getLayers();

  public void setLayers(java.util.List<MappingLayer> layers);

  public Mappers getOpMappersMappers();

  public void setOpMappersMappers(
      org.tura.model.designer.repository.serialized.mapper.Mappers opMappersMappers);
}
