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

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.JavaComponent.class,
      name = "JavaComponent"),
  @Type(
      value = org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent.class,
      name = "JavaScriptComponent"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.JavaMapper.class,
      name = "JavaMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper.class,
      name = "JavaPackageMapper"),
  @Type(
      value = org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper.class,
      name = "JavaScriptMapper")
})
public interface VersionRef {

  public Boolean getAttached();

  public void setAttached(Boolean value);

  public String getSuidVersionRef();

  public void setSuidVersionRef(java.lang.String suidVersionRef);

  public String getTransientrefOpVersionRefVersionRefVersion();

  public void setTransientrefOpVersionRefVersionRefVersion(
      java.lang.String transientrefOpVersionRefVersionRefVersion);

  public Version getVersionRef();

  public void setVersionRef(
      org.tura.model.designer.repository.serialized.mapper.Version versionRef);
}
