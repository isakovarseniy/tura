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

package org.tura.model.designer.repository.serialized.recipe;

public class IngredientMany2ManyRelation {

  private String opmodellayeringredient_uid;

  public String getopmodellayeringredient_uid() {
    return opmodellayeringredient_uid;
  }

  public void setopmodellayeringredient_uid(java.lang.String opmodellayeringredient_uid) {
    this.opmodellayeringredient_uid = opmodellayeringredient_uid;
  }

  private String modellayer_uid;

  public String getmodellayer_uid() {
    return modellayer_uid;
  }

  public void setmodellayer_uid(java.lang.String modellayer_uid) {
    this.modellayer_uid = modellayer_uid;
  }
}
