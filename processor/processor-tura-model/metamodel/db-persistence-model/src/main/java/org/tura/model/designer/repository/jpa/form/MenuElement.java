/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.model.designer.repository.jpa.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import java.util.Collection;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import org.tura.model.designer.repository.jpa.common.Orderable;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "MenuElement")
@javax.persistence.Table(name = "MENUELEMENT")
public class MenuElement implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.MenuElement.class;
  }

  @Id
  @javax.persistence.Column(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @javax.persistence.Column(name = "NAME")
  private String name;

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_MENUELEMENT")
  private int vMenuElement;

  public int getVmenuElement() {
    return vMenuElement;
  }

  public void setVmenuElement(int vMenuElement) {
    this.vMenuElement = vMenuElement;
  }

  @JoinColumns({@JoinColumn(name = "REF_MENU_ELEMENTS_MENU_FOLDER", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private MenuFolder opMenuElementsMenuFolder;

  public MenuFolder getOpMenuElementsMenuFolder() {
    return opMenuElementsMenuFolder;
  }

  public void setOpMenuElementsMenuFolder(
      org.tura.model.designer.repository.jpa.form.MenuFolder opMenuElementsMenuFolder) {
    this.opMenuElementsMenuFolder = opMenuElementsMenuFolder;
  }

  public void setSuidMultiLangLabel(java.lang.String suid) {}

  public String getSuidMultiLangLabel() {
    return this.getInhMultiLangLabel().getSuid();
  }

  public Context getMultiLangLabel() {
    return this.getInhMultiLangLabel().getMultiLangLabel();
  }

  public void setMultiLangLabel(
      org.tura.model.designer.repository.jpa.form.Context multiLangLabel) {
    this.getInhMultiLangLabel().setMultiLangLabel(multiLangLabel);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_multiLangLabel", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private MultiLangLabel inhMultiLangLabel;

  public MultiLangLabel getInhMultiLangLabel() {
    return inhMultiLangLabel;
  }

  public void setInhMultiLangLabel(
      org.tura.model.designer.repository.jpa.form.MultiLangLabel inhMultiLangLabel) {
    this.inhMultiLangLabel = inhMultiLangLabel;
  }

  public void setSuidStyleElement(java.lang.String suid) {}

  public String getSuidStyleElement() {
    return this.getInhStyleElement().getSuid();
  }

  public Context getStyle() {
    return this.getInhStyleElement().getStyle();
  }

  public void setStyle(org.tura.model.designer.repository.jpa.form.Context style) {
    this.getInhStyleElement().setStyle(style);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_styleElement", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private StyleElement inhStyleElement;

  public StyleElement getInhStyleElement() {
    return inhStyleElement;
  }

  public void setInhStyleElement(
      org.tura.model.designer.repository.jpa.form.StyleElement inhStyleElement) {
    this.inhStyleElement = inhStyleElement;
  }

  public void setSuidCategorized(java.lang.String suid) {}

  public String getSuidCategorized() {
    return this.getInhCategorized().getSuid();
  }

  public Collection<Classifier> getClassifiers() {
    return this.getInhCategorized().getClassifiers();
  }

  public void setClassifiers(java.util.Collection<Classifier> classifiers) {
    this.getInhCategorized().setClassifiers(classifiers);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_categorized", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private Categorized inhCategorized;

  public Categorized getInhCategorized() {
    return inhCategorized;
  }

  public void setInhCategorized(
      org.tura.model.designer.repository.jpa.artifact.Categorized inhCategorized) {
    this.inhCategorized = inhCategorized;
  }

  public void setSuidEnabledUIItem(java.lang.String suid) {}

  public String getSuidEnabledUIItem() {
    return this.getInhEnabledUIItem().getSuid();
  }

  public Context getEnabled() {
    return this.getInhEnabledUIItem().getEnabled();
  }

  public void setEnabled(org.tura.model.designer.repository.jpa.form.Context enabled) {
    this.getInhEnabledUIItem().setEnabled(enabled);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_enabledUIItem", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private EnabledUIItem inhEnabledUIItem;

  public EnabledUIItem getInhEnabledUIItem() {
    return inhEnabledUIItem;
  }

  public void setInhEnabledUIItem(
      org.tura.model.designer.repository.jpa.form.EnabledUIItem inhEnabledUIItem) {
    this.inhEnabledUIItem = inhEnabledUIItem;
  }

  public void setOrder(java.lang.Integer order) {
    this.getInhOrderable().setOrder(order);
  }

  public Integer getOrder() {
    return this.getInhOrderable().getOrder();
  }

  public void setSuidOrderable(java.lang.String suid) {}

  public String getSuidOrderable() {
    return this.getInhOrderable().getSuid();
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_orderable", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private Orderable inhOrderable;

  public Orderable getInhOrderable() {
    return inhOrderable;
  }

  public void setInhOrderable(
      org.tura.model.designer.repository.jpa.common.Orderable inhOrderable) {
    this.inhOrderable = inhOrderable;
  }

  public void setSuidFlexFields(java.lang.String suid) {}

  public String getSuidFlexFields() {
    return this.getInhFlexFields().getSuid();
  }

  public Collection<FlexField> getFields() {
    return this.getInhFlexFields().getFields();
  }

  public void setFields(java.util.Collection<FlexField> fields) {
    this.getInhFlexFields().setFields(fields);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_flexFields", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private FlexFields inhFlexFields;

  public FlexFields getInhFlexFields() {
    return inhFlexFields;
  }

  public void setInhFlexFields(
      org.tura.model.designer.repository.jpa.form.FlexFields inhFlexFields) {
    this.inhFlexFields = inhFlexFields;
  }

  public MenuElement() {
    MultiLangLabel multiLangLabel = new MultiLangLabel();
    this.inhMultiLangLabel = multiLangLabel;
    multiLangLabel.setObject(this);
    StyleElement styleElement = new StyleElement();
    this.inhStyleElement = styleElement;
    styleElement.setObject(this);
    Categorized categorized = new Categorized();
    this.inhCategorized = categorized;
    categorized.setObject(this);
    EnabledUIItem enabledUIItem = new EnabledUIItem();
    this.inhEnabledUIItem = enabledUIItem;
    enabledUIItem.setObject(this);
    Orderable orderable = new Orderable();
    this.inhOrderable = orderable;
    orderable.setObject(this);
    FlexFields flexFields = new FlexFields();
    this.inhFlexFields = flexFields;
    flexFields.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.MenuElement.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.MultiLangLabel.class.getName())) {
      return (T) this.inhMultiLangLabel;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.StyleElement.class.getName())) {
      return (T) this.inhStyleElement;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.artifact.Categorized.class.getName())) {
      return (T) this.inhCategorized;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.EnabledUIItem.class.getName())) {
      return (T) this.inhEnabledUIItem;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.common.Orderable.class.getName())) {
      return (T) this.inhOrderable;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.FlexFields.class.getName())) {
      return (T) this.inhFlexFields;
    }
    throw new RepositoryException("Cast exception to  " + clazz.getName());
  }

  public Object getObject() {
    return this;
  }
}
