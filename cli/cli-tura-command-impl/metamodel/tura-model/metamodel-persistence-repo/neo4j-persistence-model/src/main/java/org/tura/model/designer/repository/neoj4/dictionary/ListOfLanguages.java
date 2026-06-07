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

package org.tura.model.designer.repository.neoj4.dictionary;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ListOfLanguages implements Serializable, TypeAware {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.dictionary.ListOfLanguages.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_LISTOFLANGUAGES")
  private long vListOfLanguages;

  public long getVlistOfLanguages() {
    return vListOfLanguages;
  }

  public void setVlistOfLanguages(long vListOfLanguages) {
    this.vListOfLanguages = vListOfLanguages;
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

  @org.neo4j.ogm.annotation.Property(name = "LANGUAGE")
  private String language;

  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  public String getLanguage() {
    return language;
  }

  @org.neo4j.ogm.annotation.Property(name = "CODE")
  private String code;

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  @org.neo4j.ogm.annotation.Property(name = "DESCRIPTION")
  private String description;

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
