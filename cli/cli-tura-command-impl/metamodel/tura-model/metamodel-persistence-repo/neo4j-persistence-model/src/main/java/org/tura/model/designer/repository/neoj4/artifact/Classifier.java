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

package org.tura.model.designer.repository.neoj4.artifact;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Classifier implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.artifact.Classifier.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_CLASSIFIER")
  private long vClassifier;

  public long getVclassifier() {
    return vClassifier;
  }

  public void setVclassifier(long vClassifier) {
    this.vClassifier = vClassifier;
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

  @org.neo4j.ogm.annotation.Property(name = "KEY_ID")
  private String keyId;

  public void setKeyId(java.lang.String keyId) {
    this.keyId = keyId;
  }

  public String getKeyId() {
    return keyId;
  }

  @org.neo4j.ogm.annotation.Property(name = "DETAILS")
  private String details;

  public void setDetails(java.lang.String details) {
    this.details = details;
  }

  public String getDetails() {
    return details;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_CLASSIFIERS_CATEGORIZED")
  private String refClassifiersCategorized;

  public void setRefClassifiersCategorized(java.lang.String refClassifiersCategorized) {
    this.refClassifiersCategorized = refClassifiersCategorized;
  }

  public String getRefClassifiersCategorized() {
    return refClassifiersCategorized;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_HINT_CLASSIFIER_GENERATION_HINT")
  private String refOpHintClassifierGenerationHint;

  public void setRefOpHintClassifierGenerationHint(
      java.lang.String refOpHintClassifierGenerationHint) {
    this.refOpHintClassifierGenerationHint = refOpHintClassifierGenerationHint;
  }

  public String getRefOpHintClassifierGenerationHint() {
    return refOpHintClassifierGenerationHint;
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
