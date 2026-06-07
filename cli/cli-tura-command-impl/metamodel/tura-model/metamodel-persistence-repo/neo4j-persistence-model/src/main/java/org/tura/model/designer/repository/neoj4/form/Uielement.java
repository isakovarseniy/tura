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
import org.tura.model.designer.repository.neoj4.common.Orderable;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Uielement
    implements Serializable,
        TypeAware,
        StyleElement,
        NickNamed,
        Categorized,
        Orderable,
        EnabledUIItem,
        FlexFields,
        MenuHolder {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.Uielement.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_UIELEMENT")
  private long vUielement;

  public long getVuielement() {
    return vUielement;
  }

  public void setVuielement(long vUielement) {
    this.vUielement = vUielement;
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

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_CHILDREN_CHILDREN_HOLDER")
  private String refChildrenChildrenHolder;

  public void setRefChildrenChildrenHolder(java.lang.String refChildrenChildrenHolder) {
    this.refChildrenChildrenHolder = refChildrenChildrenHolder;
  }

  public String getRefChildrenChildrenHolder() {
    return refChildrenChildrenHolder;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_ELEMENT_COLUMN")
  private String refElementColumn;

  public void setRefElementColumn(java.lang.String refElementColumn) {
    this.refElementColumn = refElementColumn;
  }

  public String getRefElementColumn() {
    return refElementColumn;
  }

  public void setSuidStyleElement(java.lang.String suid) {}

  public String getSuidStyleElement() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  @org.neo4j.ogm.annotation.Property(name = "NICKNAME")
  private String nickname;

  public void setNickname(java.lang.String nickname) {
    this.nickname = nickname;
  }

  public String getNickname() {
    return nickname;
  }

  public void setSuidNickNamed(java.lang.String suid) {}

  public String getSuidNickNamed() {
    return this.suid;
  }

  public void setSuidCategorized(java.lang.String suid) {}

  public String getSuidCategorized() {
    return this.suid;
  }

  @org.neo4j.ogm.annotation.Property(name = "ORDER_")
  private Integer order;

  public void setOrder(java.lang.Integer order) {
    this.order = order;
  }

  public Integer getOrder() {
    return order;
  }

  public void setSuidOrderable(java.lang.String suid) {}

  public String getSuidOrderable() {
    return this.suid;
  }

  public void setSuidEnabledUIItem(java.lang.String suid) {}

  public String getSuidEnabledUIItem() {
    return this.suid;
  }

  public void setSuidFlexFields(java.lang.String suid) {}

  public String getSuidFlexFields() {
    return this.suid;
  }

  public void setSuidMenuHolder(java.lang.String suid) {}

  public String getSuidMenuHolder() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_MENU_MENU_HOLDER_MENU_FOLDER")
  private String refOpMenuMenuHolderMenuFolder;

  public void setRefOpMenuMenuHolderMenuFolder(java.lang.String refOpMenuMenuHolderMenuFolder) {
    this.refOpMenuMenuHolderMenuFolder = refOpMenuMenuHolderMenuFolder;
  }

  public String getRefOpMenuMenuHolderMenuFolder() {
    return refOpMenuMenuHolderMenuFolder;
  }
}
