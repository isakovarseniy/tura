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

package org.tura.model.designer.repository.neoj4.type;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class AttributePointer implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.type.AttributePointer.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_ATTRIBUTEPOINTER")
  private long vAttributePointer;

  public long getVattributePointer() {
    return vAttributePointer;
  }

  public void setVattributePointer(long vAttributePointer) {
    this.vAttributePointer = vAttributePointer;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_ATTRIBUTE_REF_ATTRIBUTE_POINTER_ATTRIBUTE")
  private String refOpAttributeRefAttributePointerAttribute;

  public void setRefOpAttributeRefAttributePointerAttribute(
      java.lang.String refOpAttributeRefAttributePointerAttribute) {
    this.refOpAttributeRefAttributePointerAttribute = refOpAttributeRefAttributePointerAttribute;
  }

  public String getRefOpAttributeRefAttributePointerAttribute() {
    return refOpAttributeRefAttributePointerAttribute;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_ATTRIBUTES_OBJECT_MAPPER")
  private String refAttributesObjectMapper;

  public void setRefAttributesObjectMapper(java.lang.String refAttributesObjectMapper) {
    this.refAttributesObjectMapper = refAttributesObjectMapper;
  }

  public String getRefAttributesObjectMapper() {
    return refAttributesObjectMapper;
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
