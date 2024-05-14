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

package org.tura.model.designer.repository.serialized.form.converter;

import org.tura.model.designer.repository.serialized.form.RadioLayout;

public class RadioLayoutConverter {

  public static RadioLayout convert(org.tura.model.designer.repository.jpa.form.RadioLayout obj) {
    if (obj == null) {
      return null;
    }
    return org.tura.model.designer.repository.serialized.form.RadioLayout.valueOf(obj.name());
  }

  public static org.tura.model.designer.repository.jpa.form.RadioLayout convert(
      org.tura.model.designer.repository.serialized.form.RadioLayout obj) {
    if (obj == null) {
      return null;
    }
    return org.tura.model.designer.repository.jpa.form.RadioLayout.valueOf(obj.name());
  }
}
