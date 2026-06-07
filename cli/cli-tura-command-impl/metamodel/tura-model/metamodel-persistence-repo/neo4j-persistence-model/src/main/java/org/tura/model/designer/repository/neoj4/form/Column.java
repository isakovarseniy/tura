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
import org.tura.model.designer.repository.neoj4.common.HTMLLayerHolder;
import org.tura.model.designer.repository.neoj4.common.Orderable;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Column
    implements Serializable,
        TypeAware,
        StyleElement,
        MultiLangLabel,
        Categorized,
        HTMLLayerHolder,
        Orderable,
        FlexFields,
        MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.Column.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_COLUMN")
  private long vColumn;

  public long getVcolumn() {
    return vColumn;
  }

  public void setVcolumn(long vColumn) {
    this.vColumn = vColumn;
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

  @org.neo4j.ogm.annotation.Property(name = "LABEL")
  private String label;

  public void setLabel(java.lang.String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  @org.neo4j.ogm.annotation.Property(name = "SORTABLE")
  private Sortable sortable;

  public void setSortable(org.tura.model.designer.repository.neoj4.form.Sortable sortable) {
    this.sortable = sortable;
  }

  public Sortable getSortable() {
    return sortable;
  }

  @org.neo4j.ogm.annotation.Property(name = "PRIORITY")
  private Integer priority;

  public void setPriority(java.lang.Integer priority) {
    this.priority = priority;
  }

  public Integer getPriority() {
    return priority;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_COLS_TABLE")
  private String refColsTable;

  public void setRefColsTable(java.lang.String refColsTable) {
    this.refColsTable = refColsTable;
  }

  public String getRefColsTable() {
    return refColsTable;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_COLS_TREE")
  private String refColsTree;

  public void setRefColsTree(java.lang.String refColsTree) {
    this.refColsTree = refColsTree;
  }

  public String getRefColsTree() {
    return refColsTree;
  }

  public void setSuidStyleElement(java.lang.String suid) {}

  public String getSuidStyleElement() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  public void setSuidMultiLangLabel(java.lang.String suid) {}

  public String getSuidMultiLangLabel() {
    return this.suid;
  }

  public void setSuidCategorized(java.lang.String suid) {}

  public String getSuidCategorized() {
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

  public void setSuidFlexFields(java.lang.String suid) {}

  public String getSuidFlexFields() {
    return this.suid;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
