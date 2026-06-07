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

package org.tura.model.designer.repository.neoj4.dictionary;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class OptionsSet implements Serializable, TypeAware {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.dictionary.OptionsSet.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_OPTIONSSET")
  private long vOptionsSet;

  public long getVoptionsSet() {
    return vOptionsSet;
  }

  public void setVoptionsSet(long vOptionsSet) {
    this.vOptionsSet = vOptionsSet;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @org.neo4j.ogm.annotation.Property(name = "KEY_NAME")
  private String keyName;

  public void setKeyName(java.lang.String keyName) {
    this.keyName = keyName;
  }

  public String getKeyName() {
    return keyName;
  }

  @org.neo4j.ogm.annotation.Property(name = "STR_VALUE")
  private String strValue;

  public void setStrValue(java.lang.String strValue) {
    this.strValue = strValue;
  }

  public String getStrValue() {
    return strValue;
  }

  @org.neo4j.ogm.annotation.Property(name = "OPTIONSET")
  private String optionset;

  public void setOptionset(java.lang.String optionset) {
    this.optionset = optionset;
  }

  public String getOptionset() {
    return optionset;
  }
}
