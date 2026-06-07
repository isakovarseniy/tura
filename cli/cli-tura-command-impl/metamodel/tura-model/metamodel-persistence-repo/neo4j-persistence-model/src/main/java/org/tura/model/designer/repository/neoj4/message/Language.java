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
public class Language implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.message.Language.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_LANGUAGE")
  private long vLanguage;

  public long getVlanguage() {
    return vLanguage;
  }

  public void setVlanguage(long vLanguage) {
    this.vLanguage = vLanguage;
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

  @org.neo4j.ogm.annotation.Property(name = "LANG")
  private String lang;

  public void setLang(java.lang.String lang) {
    this.lang = lang;
  }

  public String getLang() {
    return lang;
  }

  @org.neo4j.ogm.annotation.Property(name = "CODE")
  private String code;

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  @org.neo4j.ogm.annotation.Property(name = "DEFAULT_LANG")
  private Boolean defaultLang;

  public void setDefaultLang(java.lang.Boolean defaultLang) {
    this.defaultLang = defaultLang;
  }

  public Boolean getDefaultLang() {
    return defaultLang;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_LANGUAGES_APPLICATION_LANGUAGES")
  private String refLanguagesApplicationLanguages;

  public void setRefLanguagesApplicationLanguages(
      java.lang.String refLanguagesApplicationLanguages) {
    this.refLanguagesApplicationLanguages = refLanguagesApplicationLanguages;
  }

  public String getRefLanguagesApplicationLanguages() {
    return refLanguagesApplicationLanguages;
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
