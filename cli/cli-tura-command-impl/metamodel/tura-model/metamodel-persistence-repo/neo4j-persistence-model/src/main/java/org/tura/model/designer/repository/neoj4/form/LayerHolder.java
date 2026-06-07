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
import org.tura.model.designer.repository.neoj4.common.HTMLLayerHolder;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class LayerHolder extends Uielement
    implements Serializable, TypeAware, ChildrenHolder, HTMLLayerHolder, Blockable, MetaObject {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.LayerHolder.class;
  }

  @Id @GeneratedValue Long __id;

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_BASE_CANVAS_VIEW_AREA")
  private String refBaseCanvasViewArea;

  public void setRefBaseCanvasViewArea(java.lang.String refBaseCanvasViewArea) {
    this.refBaseCanvasViewArea = refBaseCanvasViewArea;
  }

  public String getRefBaseCanvasViewArea() {
    return refBaseCanvasViewArea;
  }

  public void setSuidChildrenHolder(java.lang.String suid) {}

  public String getSuidChildrenHolder() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  @org.neo4j.ogm.annotation.Property(name = "COLUMNS")
  private Integer columns;

  public void setColumns(java.lang.Integer columns) {
    this.columns = columns;
  }

  public Integer getColumns() {
    return columns;
  }

  public void setSuidHTMLLayerHolder(java.lang.String suid) {}

  public String getSuidHTMLLayerHolder() {
    return this.suid;
  }

  public void setSuidBlockable(java.lang.String suid) {}

  public String getSuidBlockable() {
    return this.suid;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
