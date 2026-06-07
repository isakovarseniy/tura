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
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ToSubmenu implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.ToSubmenu.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_TOSUBMENU")
  private long vToSubmenu;

  public long getVtoSubmenu() {
    return vToSubmenu;
  }

  public void setVtoSubmenu(long vToSubmenu) {
    this.vToSubmenu = vToSubmenu;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_TO_SUB_MENU_MENU_DEFINITION")
  private String refToSubMenuMenuDefinition;

  public void setRefToSubMenuMenuDefinition(java.lang.String refToSubMenuMenuDefinition) {
    this.refToSubMenuMenuDefinition = refToSubMenuMenuDefinition;
  }

  public String getRefToSubMenuMenuDefinition() {
    return refToSubMenuMenuDefinition;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_TO_SUBMENU_SUB_MENU")
  private String refOpSourceToSubmenuSubMenu;

  public void setRefOpSourceToSubmenuSubMenu(java.lang.String refOpSourceToSubmenuSubMenu) {
    this.refOpSourceToSubmenuSubMenu = refOpSourceToSubmenuSubMenu;
  }

  public String getRefOpSourceToSubmenuSubMenu() {
    return refOpSourceToSubmenuSubMenu;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TARGET_TO_SUBMENU_MENU_FOLDER")
  private String refOpTargetToSubmenuMenuFolder;

  public void setRefOpTargetToSubmenuMenuFolder(java.lang.String refOpTargetToSubmenuMenuFolder) {
    this.refOpTargetToSubmenuMenuFolder = refOpTargetToSubmenuMenuFolder;
  }

  public String getRefOpTargetToSubmenuMenuFolder() {
    return refOpTargetToSubmenuMenuFolder;
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
