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
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class InputText extends InputElement
    implements Serializable, TypeAware, Formatable, MetaObject {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.InputText.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Property(name = "ROWS")
  private Integer rows;

  public void setRows(java.lang.Integer rows) {
    this.rows = rows;
  }

  public Integer getRows() {
    return rows;
  }

  @org.neo4j.ogm.annotation.Property(name = "COLUMNS")
  private Integer columns;

  public void setColumns(java.lang.Integer columns) {
    this.columns = columns;
  }

  public Integer getColumns() {
    return columns;
  }

  @org.neo4j.ogm.annotation.Property(name = "MASK")
  private String mask;

  public void setMask(java.lang.String mask) {
    this.mask = mask;
  }

  public String getMask() {
    return mask;
  }

  @org.neo4j.ogm.annotation.Property(name = "FORMAT")
  private String format;

  public void setFormat(java.lang.String format) {
    this.format = format;
  }

  public String getFormat() {
    return format;
  }

  public void setSuidFormatable(java.lang.String suid) {}

  public String getSuidFormatable() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
