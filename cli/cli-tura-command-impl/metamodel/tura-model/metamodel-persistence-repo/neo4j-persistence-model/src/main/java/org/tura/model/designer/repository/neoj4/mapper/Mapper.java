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

package org.tura.model.designer.repository.neoj4.mapper;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import java.util.Collection;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public interface Mapper extends Serializable, TypeAware {

  public void setSuid(java.lang.String suid);

  public String getSuid();

  public void setRefMappersMappers(java.lang.String refMappersMappers);

  public String getRefMappersMappers();

  public Collection<MappingLayer> getLayers();

  public void setLayers(java.util.Collection<MappingLayer> layers);
}
