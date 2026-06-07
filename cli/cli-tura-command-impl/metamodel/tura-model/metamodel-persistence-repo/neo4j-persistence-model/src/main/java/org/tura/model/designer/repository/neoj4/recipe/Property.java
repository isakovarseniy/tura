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
public class Property implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.Property.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_PROPERTY")
  private long vProperty;

  public long getVproperty() {
    return vProperty;
  }

  public void setVproperty(long vProperty) {
    this.vProperty = vProperty;
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

  @org.neo4j.ogm.annotation.Property(name = "VALUE")
  private String value;

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_CONF_VAR_REF_PROPERTY_CONFIG_VARIABLE")
  private String refOpConfVarRefPropertyConfigVariable;

  public void setRefOpConfVarRefPropertyConfigVariable(
      java.lang.String refOpConfVarRefPropertyConfigVariable) {
    this.refOpConfVarRefPropertyConfigVariable = refOpConfVarRefPropertyConfigVariable;
  }

  public String getRefOpConfVarRefPropertyConfigVariable() {
    return refOpConfVarRefPropertyConfigVariable;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_PROPERTIES_CONFIGURATION")
  private String refPropertiesConfiguration;

  public void setRefPropertiesConfiguration(java.lang.String refPropertiesConfiguration) {
    this.refPropertiesConfiguration = refPropertiesConfiguration;
  }

  public String getRefPropertiesConfiguration() {
    return refPropertiesConfiguration;
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
