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

package org.tura.model.designer.repository.neoj4.recipe;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class KeyValuePair implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.KeyValuePair.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_KEYVALUEPAIR")
  private long vKeyValuePair;

  public long getVkeyValuePair() {
    return vKeyValuePair;
  }

  public void setVkeyValuePair(long vKeyValuePair) {
    this.vKeyValuePair = vKeyValuePair;
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

  @org.neo4j.ogm.annotation.Property(name = "KEY_CODE")
  private String keyCode;

  public void setKeyCode(java.lang.String keyCode) {
    this.keyCode = keyCode;
  }

  public String getKeyCode() {
    return keyCode;
  }

  @org.neo4j.ogm.annotation.Property(name = "VALUE")
  private String value;

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_HASH_HASH_PROPERTY")
  private String refHashHashProperty;

  public void setRefHashHashProperty(java.lang.String refHashHashProperty) {
    this.refHashHashProperty = refHashHashProperty;
  }

  public String getRefHashHashProperty() {
    return refHashHashProperty;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }
}
