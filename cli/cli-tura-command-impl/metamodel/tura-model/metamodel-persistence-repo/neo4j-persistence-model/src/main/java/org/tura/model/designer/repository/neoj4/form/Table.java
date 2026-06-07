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
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Table extends SourcesPointer
    implements Serializable, TypeAware, MultiLangLabel, HTMLLayerHolder, MetaObject {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.Table.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Property(name = "LABEL")
  private String label;

  public void setLabel(java.lang.String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  @org.neo4j.ogm.annotation.Property(name = "ROW_NUMBER")
  private Integer rowNumber;

  public void setRowNumber(java.lang.Integer rowNumber) {
    this.rowNumber = rowNumber;
  }

  public Integer getRowNumber() {
    return rowNumber;
  }

  @org.neo4j.ogm.annotation.Property(name = "SELECTION_MODE")
  private SelectionMode selectionMode;

  public void setSelectionMode(
      org.tura.model.designer.repository.neoj4.form.SelectionMode selectionMode) {
    this.selectionMode = selectionMode;
  }

  public SelectionMode getSelectionMode() {
    return selectionMode;
  }

  @org.neo4j.ogm.annotation.Property(name = "SCROLLABLE")
  private Boolean scrollable;

  public void setScrollable(java.lang.Boolean scrollable) {
    this.scrollable = scrollable;
  }

  public Boolean getScrollable() {
    return scrollable;
  }

  @org.neo4j.ogm.annotation.Property(name = "SCROLL_HEIGHT")
  private Integer scrollHeight;

  public void setScrollHeight(java.lang.Integer scrollHeight) {
    this.scrollHeight = scrollHeight;
  }

  public Integer getScrollHeight() {
    return scrollHeight;
  }

  public void setSuidMultiLangLabel(java.lang.String suid) {}

  public String getSuidMultiLangLabel() {
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

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
