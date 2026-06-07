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

package org.tura.model.designer.repository.serialized.objectmapper;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.type.TypePointer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import org.tura.model.designer.repository.serialized.type.TypeElement;
import org.tura.model.designer.repository.serialized.type.Assosiation;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.Variable.class,
      name = "Variable"),
  @Type(
      value = org.tura.model.designer.repository.serialized.objectmapper.Aggregation.class,
      name = "Aggregation")
})
public class CalculatedField implements Serializable, TypePointer {

  private static final long serialVersionUID = 1L;

  private Boolean attached;

  public Boolean getAttached() {
    return attached;
  }

  public void setAttached(Boolean value) {
    this.attached = value;
  }

  private String serializationid;

  public String getSerializationid() {
    return serializationid;
  }

  public void setSerializationid(String value) {
    this.serializationid = value;
  }

  private String cpaid;

  public String getCpaid() {
    return cpaid;
  }

  public void setCpaid(String value) {
    this.cpaid = value;
  }

  @JsonIgnore
  public boolean isInMemory() {
    throw new UnsupportedOperationException();
  }

  @JsonIgnore
  public CalculatedField inMemory() {
    throw new UnsupportedOperationException();
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private String transientrefCalculationsObjectMapper;

  public String getTransientrefCalculationsObjectMapper() {
    return transientrefCalculationsObjectMapper;
  }

  public void setTransientrefCalculationsObjectMapper(
      java.lang.String transientrefCalculationsObjectMapper) {
    this.transientrefCalculationsObjectMapper = transientrefCalculationsObjectMapper;
  }

  private ObjectMapper opCalculationsObjectMapper;

  @Association(
      id = "c955955c-33e5-4640-a645-14f57accf99e",
      from = org.tura.model.designer.repository.serialized.objectmapper.CalculatedField.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper.class,
      property = "calculations",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refCalculationsObjectMapper",
            field1Suffix = "",
            field2Suffix = "")
      })
  public ObjectMapper getOpCalculationsObjectMapper() {
    return opCalculationsObjectMapper;
  }

  public void setOpCalculationsObjectMapper(
      org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper
          opCalculationsObjectMapper) {
    this.opCalculationsObjectMapper = opCalculationsObjectMapper;
  }

  private String suidTypePointer;

  public String getSuidTypePointer() {
    return suidTypePointer;
  }

  public void setSuidTypePointer(java.lang.String suidTypePointer) {
    this.suidTypePointer = suidTypePointer;
  }

  private String transientrefOpTypeRefTypePointerTypeElement;

  public String getTransientrefOpTypeRefTypePointerTypeElement() {
    return transientrefOpTypeRefTypePointerTypeElement;
  }

  public void setTransientrefOpTypeRefTypePointerTypeElement(
      java.lang.String transientrefOpTypeRefTypePointerTypeElement) {
    this.transientrefOpTypeRefTypePointerTypeElement = transientrefOpTypeRefTypePointerTypeElement;
  }

  private String transientrefMany2manyHelperAssosiation;

  public String getTransientrefMany2manyHelperAssosiation() {
    return transientrefMany2manyHelperAssosiation;
  }

  public void setTransientrefMany2manyHelperAssosiation(
      java.lang.String transientrefMany2manyHelperAssosiation) {
    this.transientrefMany2manyHelperAssosiation = transientrefMany2manyHelperAssosiation;
  }

  private TypeElement typeRef;

  @Association(
      id = "0711687a-6c21-4561-b355-b6c2b5a7cfe8",
      from = org.tura.model.designer.repository.serialized.type.TypePointer.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      property = "opTypeRefTypePointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpTypeRefTypePointerTypeElement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public TypeElement getTypeRef() {
    return typeRef;
  }

  public void setTypeRef(org.tura.model.designer.repository.serialized.type.TypeElement typeRef) {
    this.typeRef = typeRef;
  }

  private Assosiation opMany2manyHelperAssosiation;

  @Association(
      id = "4ca9264d-a781-449a-b214-8a8b48b996fe",
      from = org.tura.model.designer.repository.serialized.type.TypePointer.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Assosiation.class,
      property = "many2manyHelper",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refMany2manyHelperAssosiation",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Assosiation getOpMany2manyHelperAssosiation() {
    return opMany2manyHelperAssosiation;
  }

  public void setOpMany2manyHelperAssosiation(
      org.tura.model.designer.repository.serialized.type.Assosiation opMany2manyHelperAssosiation) {
    this.opMany2manyHelperAssosiation = opMany2manyHelperAssosiation;
  }
}
