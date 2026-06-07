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

package org.tura.model.designer.repository.neoj4.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.artifact.Categorized;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Relation implements Serializable, TypeAware, Categorized {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.Relation.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_RELATION")
  private long vRelation;

  public long getVrelation() {
    return vRelation;
  }

  public void setVrelation(long vRelation) {
    this.vRelation = vRelation;
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

  @org.neo4j.ogm.annotation.Property(name = "NAME")
  private String name;

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @org.neo4j.ogm.annotation.Property(name = "IS_TREE")
  private Boolean isTree;

  public void setIsTree(java.lang.Boolean isTree) {
    this.isTree = isTree;
  }

  public Boolean getIsTree() {
    return isTree;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_RELATIONS_CONTROLS")
  private String refRelationsControls;

  public void setRefRelationsControls(java.lang.String refRelationsControls) {
    this.refRelationsControls = refRelationsControls;
  }

  public String getRefRelationsControls() {
    return refRelationsControls;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_MASTER_RELATION_DATA_CONTROL")
  private String refOpMasterRelationDataControl;

  public void setRefOpMasterRelationDataControl(java.lang.String refOpMasterRelationDataControl) {
    this.refOpMasterRelationDataControl = refOpMasterRelationDataControl;
  }

  public String getRefOpMasterRelationDataControl() {
    return refOpMasterRelationDataControl;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_DETAIL_RELATION_DATA_CONTROL")
  private String refOpDetailRelationDataControl;

  public void setRefOpDetailRelationDataControl(java.lang.String refOpDetailRelationDataControl) {
    this.refOpDetailRelationDataControl = refOpDetailRelationDataControl;
  }

  public String getRefOpDetailRelationDataControl() {
    return refOpDetailRelationDataControl;
  }

  public void setSuidCategorized(java.lang.String suid) {}

  public String getSuidCategorized() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }
}
