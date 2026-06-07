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
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class RadioSelection extends InputElement
    implements Serializable, TypeAware, OptionSelection, MetaObject {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.RadioSelection.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Property(name = "LAYOUT")
  private RadioLayout layout;

  public void setLayout(org.tura.model.designer.repository.neoj4.form.RadioLayout layout) {
    this.layout = layout;
  }

  public RadioLayout getLayout() {
    return layout;
  }

  @org.neo4j.ogm.annotation.Property(name = "COLUMNS")
  private Integer columns;

  public void setColumns(java.lang.Integer columns) {
    this.columns = columns;
  }

  public Integer getColumns() {
    return columns;
  }

  @org.neo4j.ogm.annotation.Property(name = "INITIAL_OPTION_VALUE")
  private String initialOptionValue;

  public void setInitialOptionValue(java.lang.String initialOptionValue) {
    this.initialOptionValue = initialOptionValue;
  }

  public String getInitialOptionValue() {
    return initialOptionValue;
  }

  public void setSuidOptionSelection(java.lang.String suid) {}

  public String getSuidOptionSelection() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_OPTION_CAST_OPTION_SELECTION_TYPE")
  private String refOpOptionCastOptionSelectionType;

  public void setRefOpOptionCastOptionSelectionType(
      java.lang.String refOpOptionCastOptionSelectionType) {
    this.refOpOptionCastOptionSelectionType = refOpOptionCastOptionSelectionType;
  }

  public String getRefOpOptionCastOptionSelectionType() {
    return refOpOptionCastOptionSelectionType;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_OPTION_POINTER_OPTION_SELECTION_DATA_CONTROL")
  private String refOpOptionPointerOptionSelectionDataControl;

  public void setRefOpOptionPointerOptionSelectionDataControl(
      java.lang.String refOpOptionPointerOptionSelectionDataControl) {
    this.refOpOptionPointerOptionSelectionDataControl =
        refOpOptionPointerOptionSelectionDataControl;
  }

  public String getRefOpOptionPointerOptionSelectionDataControl() {
    return refOpOptionPointerOptionSelectionDataControl;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(
      name = "REF_OP_OPTION_CAST_DATA_CONTROL_OPTION_SELECTION_DATA_CONTROL")
  private String refOpOptionCastDataControlOptionSelectionDataControl;

  public void setRefOpOptionCastDataControlOptionSelectionDataControl(
      java.lang.String refOpOptionCastDataControlOptionSelectionDataControl) {
    this.refOpOptionCastDataControlOptionSelectionDataControl =
        refOpOptionCastDataControlOptionSelectionDataControl;
  }

  public String getRefOpOptionCastDataControlOptionSelectionDataControl() {
    return refOpOptionCastDataControlOptionSelectionDataControl;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
