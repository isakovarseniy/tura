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

package org.tura.model.designer.repository.jpa.dictionary;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity(name = "OptionsSet")
@javax.persistence.Table(name = "OPTIONSSET")
public class OptionsSet implements Serializable, TypeAware {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.dictionary.OptionsSet.class;
  }

  @Id
  @javax.persistence.Column(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @javax.persistence.Column(name = "KEY_NAME")
  private String keyName;

  public void setKeyName(java.lang.String keyName) {
    this.keyName = keyName;
  }

  public String getKeyName() {
    return keyName;
  }

  @javax.persistence.Column(name = "STR_VALUE")
  private String strValue;

  public void setStrValue(java.lang.String strValue) {
    this.strValue = strValue;
  }

  public String getStrValue() {
    return strValue;
  }

  @javax.persistence.Column(name = "OPTIONSET")
  private String optionset;

  public void setOptionset(java.lang.String optionset) {
    this.optionset = optionset;
  }

  public String getOptionset() {
    return optionset;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_OPTIONSSET")
  private int vOptionsSet;

  public int getVoptionsSet() {
    return vOptionsSet;
  }

  public void setVoptionsSet(int vOptionsSet) {
    this.vOptionsSet = vOptionsSet;
  }
}
