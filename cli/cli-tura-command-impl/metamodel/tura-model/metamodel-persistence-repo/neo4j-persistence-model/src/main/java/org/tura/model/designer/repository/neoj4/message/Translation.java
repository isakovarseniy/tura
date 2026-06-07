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

package org.tura.model.designer.repository.neoj4.message;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Translation implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.message.Translation.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_TRANSLATION")
  private long vTranslation;

  public long getVtranslation() {
    return vTranslation;
  }

  public void setVtranslation(long vTranslation) {
    this.vTranslation = vTranslation;
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

  @org.neo4j.ogm.annotation.Property(name = "TRANSLATION")
  private String translation;

  public void setTranslation(java.lang.String translation) {
    this.translation = translation;
  }

  public String getTranslation() {
    return translation;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_TRANSLATIOINS_MESSAGE")
  private String refTranslatioinsMessage;

  public void setRefTranslatioinsMessage(java.lang.String refTranslatioinsMessage) {
    this.refTranslatioinsMessage = refTranslatioinsMessage;
  }

  public String getRefTranslatioinsMessage() {
    return refTranslatioinsMessage;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_LANG_TRANSLATION_LANGUAGE")
  private String refOpLangTranslationLanguage;

  public void setRefOpLangTranslationLanguage(java.lang.String refOpLangTranslationLanguage) {
    this.refOpLangTranslationLanguage = refOpLangTranslationLanguage;
  }

  public String getRefOpLangTranslationLanguage() {
    return refOpLangTranslationLanguage;
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
