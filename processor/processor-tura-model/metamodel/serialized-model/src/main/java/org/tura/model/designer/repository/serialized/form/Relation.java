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

package org.tura.model.designer.repository.serialized.form;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import java.util.ArrayList;
import org.tura.model.designer.repository.serialized.type.Link;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
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
      value = org.tura.model.designer.repository.serialized.form.InternalRelation.class,
      name = "InternalRelation")
})
public class Relation implements Serializable, Categorized {

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

  private Boolean isTree;

  public Boolean getIsTree() {
    return isTree;
  }

  public void setIsTree(java.lang.Boolean isTree) {
    this.isTree = isTree;
  }

  private String transientrefRelationsControls;

  public String getTransientrefRelationsControls() {
    return transientrefRelationsControls;
  }

  public void setTransientrefRelationsControls(java.lang.String transientrefRelationsControls) {
    this.transientrefRelationsControls = transientrefRelationsControls;
  }

  private String transientrefOpMasterRelationDataControl;

  public String getTransientrefOpMasterRelationDataControl() {
    return transientrefOpMasterRelationDataControl;
  }

  public void setTransientrefOpMasterRelationDataControl(
      java.lang.String transientrefOpMasterRelationDataControl) {
    this.transientrefOpMasterRelationDataControl = transientrefOpMasterRelationDataControl;
  }

  private String transientrefOpDetailRelationDataControl;

  public String getTransientrefOpDetailRelationDataControl() {
    return transientrefOpDetailRelationDataControl;
  }

  public void setTransientrefOpDetailRelationDataControl(
      java.lang.String transientrefOpDetailRelationDataControl) {
    this.transientrefOpDetailRelationDataControl = transientrefOpDetailRelationDataControl;
  }

  private List<Link> links = new ArrayList<>();

  @Association(
      id = "e555cfb6-d754-4d82-adfc-1bff9089799e",
      from = org.tura.model.designer.repository.serialized.form.Relation.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Link.class,
      property = "opLinksRelation",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(java.util.List<Link> links) {
    this.links = links;
  }

  private Controls opRelationsControls;

  @Association(
      id = "15252d78-c88f-4590-bea6-306c697845fd",
      from = org.tura.model.designer.repository.serialized.form.Relation.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Controls.class,
      property = "relations",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Controls getOpRelationsControls() {
    return opRelationsControls;
  }

  public void setOpRelationsControls(
      org.tura.model.designer.repository.serialized.form.Controls opRelationsControls) {
    this.opRelationsControls = opRelationsControls;
  }

  private DataControl master;

  @Association(
      id = "ed91a404-8bac-467d-9622-8e01f9db69ec",
      from = org.tura.model.designer.repository.serialized.form.Relation.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.DataControl.class,
      property = "opMasterRelation",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public DataControl getMaster() {
    return master;
  }

  public void setMaster(org.tura.model.designer.repository.serialized.form.DataControl master) {
    this.master = master;
  }

  private DataControl detail;

  @Association(
      id = "59c1f6f5-21c9-446a-8ae4-697258994ac7",
      from = org.tura.model.designer.repository.serialized.form.Relation.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.DataControl.class,
      property = "opDetailRelation",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public DataControl getDetail() {
    return detail;
  }

  public void setDetail(org.tura.model.designer.repository.serialized.form.DataControl detail) {
    this.detail = detail;
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
  public List<Classifier> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(java.util.List<Classifier> classifiers) {
    this.classifiers = classifiers;
  }
}
