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
public class HashProperty implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.HashProperty.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_HASHPROPERTY")
  private long vHashProperty;

  public long getVhashProperty() {
    return vHashProperty;
  }

  public void setVhashProperty(long vHashProperty) {
    this.vHashProperty = vHashProperty;
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

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_CONF_HASH_REF_HASH_PROPERTY_CONFIG_HASH")
  private String refOpConfHashRefHashPropertyConfigHash;

  public void setRefOpConfHashRefHashPropertyConfigHash(
      java.lang.String refOpConfHashRefHashPropertyConfigHash) {
    this.refOpConfHashRefHashPropertyConfigHash = refOpConfHashRefHashPropertyConfigHash;
  }

  public String getRefOpConfHashRefHashPropertyConfigHash() {
    return refOpConfHashRefHashPropertyConfigHash;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_HASH_PROPERTIES_CONFIGURATION")
  private String refHashPropertiesConfiguration;

  public void setRefHashPropertiesConfiguration(java.lang.String refHashPropertiesConfiguration) {
    this.refHashPropertiesConfiguration = refHashPropertiesConfiguration;
  }

  public String getRefHashPropertiesConfiguration() {
    return refHashPropertiesConfiguration;
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
