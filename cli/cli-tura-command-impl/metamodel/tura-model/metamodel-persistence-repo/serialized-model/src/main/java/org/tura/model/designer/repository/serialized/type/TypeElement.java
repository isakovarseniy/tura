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

package org.tura.model.designer.repository.serialized.type;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import org.tura.model.designer.repository.serialized.objectmapper.OmRelation;
import org.tura.model.designer.repository.serialized.form.RelationMapper;
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
      value = org.tura.model.designer.repository.serialized.type.Primitive.class,
      name = "Primitive"),
  @Type(value = org.tura.model.designer.repository.serialized.type.Type.class, name = "Type"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.TypeReference.class,
      name = "TypeReference"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Enumerator.class,
      name = "Enumerator")
})
public class TypeElement implements Serializable {

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
  public TypeElement inMemory() {
    throw new UnsupportedOperationException();
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private String keyId;

  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(java.lang.String keyId) {
    this.keyId = keyId;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private String transientrefTypesTypeGroup;

  public String getTransientrefTypesTypeGroup() {
    return transientrefTypesTypeGroup;
  }

  public void setTransientrefTypesTypeGroup(java.lang.String transientrefTypesTypeGroup) {
    this.transientrefTypesTypeGroup = transientrefTypesTypeGroup;
  }

  private List<Relationship> opSourceRelationship = new ArrayList<>();

  @Association(
      id = "20b77333-64e4-4ec0-937f-c0e93eaa5873",
      from = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Relationship.class,
      property = "source",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpSourceRelationshipTypeElement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<Relationship> getOpSourceRelationship() {
    return opSourceRelationship;
  }

  public void setOpSourceRelationship(java.util.List<Relationship> opSourceRelationship) {
    this.opSourceRelationship = opSourceRelationship;
  }

  private List<Relationship> opTargetRelationship = new ArrayList<>();

  @Association(
      id = "01f9192e-2bc6-40ea-9c1f-e4133f3b2a3a",
      from = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Relationship.class,
      property = "target",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpTargetRelationshipTypeElement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<Relationship> getOpTargetRelationship() {
    return opTargetRelationship;
  }

  public void setOpTargetRelationship(java.util.List<Relationship> opTargetRelationship) {
    this.opTargetRelationship = opTargetRelationship;
  }

  private List<TypePointer> opTypeRefTypePointer = new ArrayList<>();

  @Association(
      id = "0711687a-6c21-4561-b355-b6c2b5a7cfe8",
      from = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypePointer.class,
      property = "typeRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpTypeRefTypePointerTypeElement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<TypePointer> getOpTypeRefTypePointer() {
    return opTypeRefTypePointer;
  }

  public void setOpTypeRefTypePointer(java.util.List<TypePointer> opTypeRefTypePointer) {
    this.opTypeRefTypePointer = opTypeRefTypePointer;
  }

  private List<OmRelation> opTypeRefOmRelation = new ArrayList<>();

  @Association(
      id = "ad93eed2-c565-462f-aecb-7cc697e2308a",
      from = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.objectmapper.OmRelation.class,
      property = "typeRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpTypeRefOmRelationTypeElement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<OmRelation> getOpTypeRefOmRelation() {
    return opTypeRefOmRelation;
  }

  public void setOpTypeRefOmRelation(java.util.List<OmRelation> opTypeRefOmRelation) {
    this.opTypeRefOmRelation = opTypeRefOmRelation;
  }

  private List<RelationMapper> opTypeRefRelationMapper = new ArrayList<>();

  @Association(
      id = "0e03d1a7-f0cc-49df-99ef-6098330fb388",
      from = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.RelationMapper.class,
      property = "typeRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpTypeRefRelationMapperTypeElement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<RelationMapper> getOpTypeRefRelationMapper() {
    return opTypeRefRelationMapper;
  }

  public void setOpTypeRefRelationMapper(java.util.List<RelationMapper> opTypeRefRelationMapper) {
    this.opTypeRefRelationMapper = opTypeRefRelationMapper;
  }

  private TypeGroup opTypesTypeGroup;

  @Association(
      id = "7eaca994-bb25-434a-bf77-978e6a1916ca",
      from = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypeGroup.class,
      property = "types",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refTypesTypeGroup",
            field1Suffix = "",
            field2Suffix = "")
      })
  public TypeGroup getOpTypesTypeGroup() {
    return opTypesTypeGroup;
  }

  public void setOpTypesTypeGroup(
      org.tura.model.designer.repository.serialized.type.TypeGroup opTypesTypeGroup) {
    this.opTypesTypeGroup = opTypesTypeGroup;
  }
}
