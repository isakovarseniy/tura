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
import org.tura.model.designer.repository.neoj4.artifact.Categorized;
import org.tura.model.designer.repository.neoj4.common.Orderable;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class TabPage extends CanvasFrame
    implements Serializable,
        TypeAware,
        ViewPortHolder,
        HTMLLayerHolder,
        MultiLangLabel,
        Categorized,
        Orderable,
        FlexFields,
        MetaObject {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.TabPage.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Property(name = "TAB_SEQUENCE")
  private Integer tabSequence;

  public void setTabSequence(java.lang.Integer tabSequence) {
    this.tabSequence = tabSequence;
  }

  public Integer getTabSequence() {
    return tabSequence;
  }

  public void setSuidViewPortHolder(java.lang.String suid) {}

  public String getSuidViewPortHolder() {
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

  public void setSuidMultiLangLabel(java.lang.String suid) {}

  public String getSuidMultiLangLabel() {
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

  public void setSuidFlexFields(java.lang.String suid) {}

  public String getSuidFlexFields() {
    return this.suid;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
