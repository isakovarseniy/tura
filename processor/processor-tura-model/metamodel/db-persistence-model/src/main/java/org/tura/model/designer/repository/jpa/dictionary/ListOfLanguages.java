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

package org.tura.model.designer.repository.jpa.dictionary;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity(name = "ListOfLanguages")
@javax.persistence.Table(name = "LISTOFLANGUAGES")
public class ListOfLanguages implements Serializable, TypeAware {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.dictionary.ListOfLanguages.class;
  }

  @Id
  @javax.persistence.Column(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @javax.persistence.Column(name = "LANGUAGE")
  private String language;

  public void setLanguage(java.lang.String language) {
    this.language = language;
  }

  public String getLanguage() {
    return language;
  }

  @javax.persistence.Column(name = "CODE")
  private String code;

  public void setCode(java.lang.String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  @javax.persistence.Column(name = "DESCRIPTION")
  private String description;

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_LISTOFLANGUAGES")
  private int vListOfLanguages;

  public int getVlistOfLanguages() {
    return vListOfLanguages;
  }

  public void setVlistOfLanguages(int vListOfLanguages) {
    this.vListOfLanguages = vListOfLanguages;
  }
}
