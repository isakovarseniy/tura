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
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Context extends ContextValue implements Serializable, TypeAware, ContextParameters {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.Context.class;
  }

  @Id @GeneratedValue Long __id;

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_MULTI_LANG_LABEL_MULTI_LANG_LABEL")
  private String refMultiLangLabelMultiLangLabel;

  public void setRefMultiLangLabelMultiLangLabel(java.lang.String refMultiLangLabelMultiLangLabel) {
    this.refMultiLangLabelMultiLangLabel = refMultiLangLabelMultiLangLabel;
  }

  public String getRefMultiLangLabelMultiLangLabel() {
    return refMultiLangLabelMultiLangLabel;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_STYLE_STYLE_ELEMENT")
  private String refStyleStyleElement;

  public void setRefStyleStyleElement(java.lang.String refStyleStyleElement) {
    this.refStyleStyleElement = refStyleStyleElement;
  }

  public String getRefStyleStyleElement() {
    return refStyleStyleElement;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_ENABLED_ENABLED_U_I_ITEM")
  private String refEnabledEnabledUIItem;

  public void setRefEnabledEnabledUIItem(java.lang.String refEnabledEnabledUIItem) {
    this.refEnabledEnabledUIItem = refEnabledEnabledUIItem;
  }

  public String getRefEnabledEnabledUIItem() {
    return refEnabledEnabledUIItem;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_REQUIRED_UIELEMENT")
  private String refRequiredUielement;

  public void setRefRequiredUielement(java.lang.String refRequiredUielement) {
    this.refRequiredUielement = refRequiredUielement;
  }

  public String getRefRequiredUielement() {
    return refRequiredUielement;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_READ_ONLY_UIELEMENT")
  private String refReadOnlyUielement;

  public void setRefReadOnlyUielement(java.lang.String refReadOnlyUielement) {
    this.refReadOnlyUielement = refReadOnlyUielement;
  }

  public String getRefReadOnlyUielement() {
    return refReadOnlyUielement;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_ICON_ITEM_ICON")
  private String refIconItemIcon;

  public void setRefIconItemIcon(java.lang.String refIconItemIcon) {
    this.refIconItemIcon = refIconItemIcon;
  }

  public String getRefIconItemIcon() {
    return refIconItemIcon;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_INITIAL_OPTION_MESSAGE_OPTION_SELECTION")
  private String refInitialOptionMessageOptionSelection;

  public void setRefInitialOptionMessageOptionSelection(
      java.lang.String refInitialOptionMessageOptionSelection) {
    this.refInitialOptionMessageOptionSelection = refInitialOptionMessageOptionSelection;
  }

  public String getRefInitialOptionMessageOptionSelection() {
    return refInitialOptionMessageOptionSelection;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_TRANSITION_MENU_ITEM")
  private String refTransitionMenuItem;

  public void setRefTransitionMenuItem(java.lang.String refTransitionMenuItem) {
    this.refTransitionMenuItem = refTransitionMenuItem;
  }

  public String getRefTransitionMenuItem() {
    return refTransitionMenuItem;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_IMAGE_TREE")
  private String refImageTree;

  public void setRefImageTree(java.lang.String refImageTree) {
    this.refImageTree = refImageTree;
  }

  public String getRefImageTree() {
    return refImageTree;
  }

  public void setSuidContextParameters(java.lang.String suid) {}

  public String getSuidContextParameters() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }
}
