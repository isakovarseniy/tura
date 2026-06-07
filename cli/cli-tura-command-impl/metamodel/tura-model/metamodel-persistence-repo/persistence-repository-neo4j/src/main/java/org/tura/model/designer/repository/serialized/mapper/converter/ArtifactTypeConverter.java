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

package org.tura.model.designer.repository.serialized.mapper.converter;

import org.tura.model.designer.repository.serialized.mapper.ArtifactType;

public class ArtifactTypeConverter {

  public static ArtifactType convert(
      org.tura.model.designer.repository.neoj4.mapper.ArtifactType obj) {
    if (obj == null) {
      return null;
    }
    return org.tura.model.designer.repository.serialized.mapper.ArtifactType.valueOf(obj.name());
  }

  public static org.tura.model.designer.repository.neoj4.mapper.ArtifactType convert(
      org.tura.model.designer.repository.serialized.mapper.ArtifactType obj) {
    if (obj == null) {
      return null;
    }
    return org.tura.model.designer.repository.neoj4.mapper.ArtifactType.valueOf(obj.name());
  }
}
