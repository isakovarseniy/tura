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
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import java.util.ArrayList;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import java.util.List;
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
      value = org.tura.model.designer.repository.serialized.type.References.class,
      name = "References"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Generalization.class,
      name = "Generalization"),
  @Type(
      value = org.tura.model.designer.repository.serialized.type.Assosiation.class,
      name = "Assosiation")
})
public class Relationship implements Serializable, Categorized {

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
  public Relationship inMemory() {
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

  private String transientrefRelationshipsTypeGroup;

  public String getTransientrefRelationshipsTypeGroup() {
    return transientrefRelationshipsTypeGroup;
  }

  public void setTransientrefRelationshipsTypeGroup(
      java.lang.String transientrefRelationshipsTypeGroup) {
    this.transientrefRelationshipsTypeGroup = transientrefRelationshipsTypeGroup;
  }

  private String transientrefOpSourceRelationshipTypeElement;

  public String getTransientrefOpSourceRelationshipTypeElement() {
    return transientrefOpSourceRelationshipTypeElement;
  }

  public void setTransientrefOpSourceRelationshipTypeElement(
      java.lang.String transientrefOpSourceRelationshipTypeElement) {
    this.transientrefOpSourceRelationshipTypeElement = transientrefOpSourceRelationshipTypeElement;
  }

  private String transientrefOpTargetRelationshipTypeElement;

  public String getTransientrefOpTargetRelationshipTypeElement() {
    return transientrefOpTargetRelationshipTypeElement;
  }

  public void setTransientrefOpTargetRelationshipTypeElement(
      java.lang.String transientrefOpTargetRelationshipTypeElement) {
    this.transientrefOpTargetRelationshipTypeElement = transientrefOpTargetRelationshipTypeElement;
  }

  private TypeGroup opRelationshipsTypeGroup;

  @Association(
      id = "e8e6d8ba-6e1e-4cc5-b95d-f55bf1376730",
      from = org.tura.model.designer.repository.serialized.type.Relationship.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypeGroup.class,
      property = "relationships",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refRelationshipsTypeGroup",
            field1Suffix = "",
            field2Suffix = "")
      })
  public TypeGroup getOpRelationshipsTypeGroup() {
    return opRelationshipsTypeGroup;
  }

  public void setOpRelationshipsTypeGroup(
      org.tura.model.designer.repository.serialized.type.TypeGroup opRelationshipsTypeGroup) {
    this.opRelationshipsTypeGroup = opRelationshipsTypeGroup;
  }

  private TypeElement source;

  @Association(
      id = "20b77333-64e4-4ec0-937f-c0e93eaa5873",
      from = org.tura.model.designer.repository.serialized.type.Relationship.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      property = "opSourceRelationship",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpSourceRelationshipTypeElement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public TypeElement getSource() {
    return source;
  }

  public void setSource(org.tura.model.designer.repository.serialized.type.TypeElement source) {
    this.source = source;
  }

  private TypeElement target;

  @Association(
      id = "01f9192e-2bc6-40ea-9c1f-e4133f3b2a3a",
      from = org.tura.model.designer.repository.serialized.type.Relationship.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      property = "opTargetRelationship",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpTargetRelationshipTypeElement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public TypeElement getTarget() {
    return target;
  }

  public void setTarget(org.tura.model.designer.repository.serialized.type.TypeElement target) {
    this.target = target;
  }

  private String suidCategorized;

  public String getSuidCategorized() {
    return suidCategorized;
  }

  public void setSuidCategorized(java.lang.String suidCategorized) {
    this.suidCategorized = suidCategorized;
  }

  private List<Classifier> classifiers = new ArrayList<>();

  @Association(
      id = "1bb1f934-5eba-4f36-932f-0f3c7ef54731",
      from = org.tura.model.designer.repository.serialized.artifact.Categorized.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.Classifier.class,
      property = "opClassifiersCategorized",
      containment = true,
      type = "One2Many",
      lazy = false,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refClassifiersCategorized",
            field1Suffix = "Categorized",
            field2Suffix = "")
      })
  public List<Classifier> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(java.util.List<Classifier> classifiers) {
    this.classifiers = classifiers;
  }
}
