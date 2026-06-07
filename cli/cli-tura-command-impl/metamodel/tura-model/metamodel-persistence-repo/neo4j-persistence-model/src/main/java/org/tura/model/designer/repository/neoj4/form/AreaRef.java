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
public class AreaRef implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.AreaRef.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_AREAREF")
  private long vAreaRef;

  public long getVareaRef() {
    return vAreaRef;
  }

  public void setVareaRef(long vAreaRef) {
    this.vAreaRef = vAreaRef;
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

  @org.neo4j.ogm.annotation.Property(name = "GROUP_")
  private Integer group;

  public void setGroup(java.lang.Integer group) {
    this.group = group;
  }

  public Integer getGroup() {
    return group;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_SOURCE_TARGET_OVERLAY_CANVAS")
  private String refSourceTargetOverlayCanvas;

  public void setRefSourceTargetOverlayCanvas(java.lang.String refSourceTargetOverlayCanvas) {
    this.refSourceTargetOverlayCanvas = refSourceTargetOverlayCanvas;
  }

  public String getRefSourceTargetOverlayCanvas() {
    return refSourceTargetOverlayCanvas;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_REFRESH_AREAS_UIELEMENT")
  private String refRefreshAreasUielement;

  public void setRefRefreshAreasUielement(java.lang.String refRefreshAreasUielement) {
    this.refRefreshAreasUielement = refRefreshAreasUielement;
  }

  public String getRefRefreshAreasUielement() {
    return refRefreshAreasUielement;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_AREA_AREA_REF_NICK_NAMED")
  private String refOpAreaAreaRefNickNamed;

  public void setRefOpAreaAreaRefNickNamed(java.lang.String refOpAreaAreaRefNickNamed) {
    this.refOpAreaAreaRefNickNamed = refOpAreaAreaRefNickNamed;
  }

  public String getRefOpAreaAreaRefNickNamed() {
    return refOpAreaAreaRefNickNamed;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_BLOCK_BLOCKABLE")
  private String refBlockBlockable;

  public void setRefBlockBlockable(java.lang.String refBlockBlockable) {
    this.refBlockBlockable = refBlockBlockable;
  }

  public String getRefBlockBlockable() {
    return refBlockBlockable;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_SOURCE_TARGET_DATA_EXPORTER")
  private String refSourceTargetDataExporter;

  public void setRefSourceTargetDataExporter(java.lang.String refSourceTargetDataExporter) {
    this.refSourceTargetDataExporter = refSourceTargetDataExporter;
  }

  public String getRefSourceTargetDataExporter() {
    return refSourceTargetDataExporter;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_REFRESH_AREAS_MENU_ITEM")
  private String refRefreshAreasMenuItem;

  public void setRefRefreshAreasMenuItem(java.lang.String refRefreshAreasMenuItem) {
    this.refRefreshAreasMenuItem = refRefreshAreasMenuItem;
  }

  public String getRefRefreshAreasMenuItem() {
    return refRefreshAreasMenuItem;
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
