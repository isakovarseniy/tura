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

package org.tura.model.designer.repository.neoj4.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public interface OptionSelection extends Serializable, TypeAware {

  public void setInitialOptionValue(java.lang.String initialOptionValue);

  public String getInitialOptionValue();

  public void setSuid(java.lang.String suid);

  public String getSuid();

  public void setRefOpOptionCastOptionSelectionType(
      java.lang.String refOpOptionCastOptionSelectionType);

  public String getRefOpOptionCastOptionSelectionType();

  public void setRefOpOptionPointerOptionSelectionDataControl(
      java.lang.String refOpOptionPointerOptionSelectionDataControl);

  public String getRefOpOptionPointerOptionSelectionDataControl();

  public void setRefOpOptionCastDataControlOptionSelectionDataControl(
      java.lang.String refOpOptionCastDataControlOptionSelectionDataControl);

  public String getRefOpOptionCastDataControlOptionSelectionDataControl();
}
