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
import javax.persistence.OneToOne;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import org.tura.model.designer.repository.jpa.common.Orderable;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Uielement")
@javax.persistence.Table(name = "UIELEMENT")
public class Uielement implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.Uielement.class;
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

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_UIELEMENT")
  private int vUielement;

  public int getVuielement() {
    return vUielement;
  }

  public void setVuielement(int vUielement) {
    this.vUielement = vUielement;
  }

  @OneToOne(mappedBy = "opRequiredUielement", fetch = javax.persistence.FetchType.LAZY)
  private Context required;

  public Context getRequired() {
    return required;
  }

  public void setRequired(org.tura.model.designer.repository.jpa.form.Context required) {
    this.required = required;
  }

  @OneToOne(mappedBy = "opReadOnlyUielement", fetch = javax.persistence.FetchType.LAZY)
  private Context readOnly;

  public Context getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(org.tura.model.designer.repository.jpa.form.Context readOnly) {
    this.readOnly = readOnly;
  }

  @OneToMany(mappedBy = "opRefreshAreasUielement", fetch = javax.persistence.FetchType.LAZY)
  private Collection<AreaRef> refreshAreas;

  public Collection<AreaRef> getRefreshAreas() {
    return refreshAreas;
  }

  public void setRefreshAreas(java.util.Collection<AreaRef> refreshAreas) {
    this.refreshAreas = refreshAreas;
  }

  @JoinColumns({@JoinColumn(name = "REF_CHILDREN_CHILDREN_HOLDER", referencedColumnName = "SUID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private ChildrenHolder opChildrenChildrenHolder;

  public ChildrenHolder getOpChildrenChildrenHolder() {
    return opChildrenChildrenHolder;
  }

  public void setOpChildrenChildrenHolder(
      org.tura.model.designer.repository.jpa.form.ChildrenHolder opChildrenChildrenHolder) {
    this.opChildrenChildrenHolder = opChildrenChildrenHolder;
  }

  @JoinColumns({@JoinColumn(name = "REF_ELEMENT_COLUMN", referencedColumnName = "UID")})
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private Column opElementColumn;

  public Column getOpElementColumn() {
    return opElementColumn;
  }

  public void setOpElementColumn(
      org.tura.model.designer.repository.jpa.form.Column opElementColumn) {
    this.opElementColumn = opElementColumn;
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

  public void setNickname(java.lang.String nickname) {
    this.getInhNickNamed().setNickname(nickname);
  }

  public String getNickname() {
    return this.getInhNickNamed().getNickname();
  }

  public void setSuidNickNamed(java.lang.String suid) {}

  public String getSuidNickNamed() {
    return this.getInhNickNamed().getSuid();
  }

  public Collection<AreaRef> getOpAreaAreaRef() {
    return this.getInhNickNamed().getOpAreaAreaRef();
  }

  public void setOpAreaAreaRef(java.util.Collection<AreaRef> opAreaAreaRef) {
    this.getInhNickNamed().setOpAreaAreaRef(opAreaAreaRef);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_nickNamed", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private NickNamed inhNickNamed;

  public NickNamed getInhNickNamed() {
    return inhNickNamed;
  }

  public void setInhNickNamed(org.tura.model.designer.repository.jpa.form.NickNamed inhNickNamed) {
    this.inhNickNamed = inhNickNamed;
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

  public void setSuidMenuHolder(java.lang.String suid) {}

  public String getSuidMenuHolder() {
    return this.getInhMenuHolder().getSuid();
  }

  public MenuFolder getMenu() {
    return this.getInhMenuHolder().getMenu();
  }

  public void setMenu(org.tura.model.designer.repository.jpa.form.MenuFolder menu) {
    this.getInhMenuHolder().setMenu(menu);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_menuHolder", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private MenuHolder inhMenuHolder;

  public MenuHolder getInhMenuHolder() {
    return inhMenuHolder;
  }

  public void setInhMenuHolder(
      org.tura.model.designer.repository.jpa.form.MenuHolder inhMenuHolder) {
    this.inhMenuHolder = inhMenuHolder;
  }

  public Uielement() {
    StyleElement styleElement = new StyleElement();
    this.inhStyleElement = styleElement;
    styleElement.setObject(this);
    NickNamed nickNamed = new NickNamed();
    this.inhNickNamed = nickNamed;
    nickNamed.setObject(this);
    Categorized categorized = new Categorized();
    this.inhCategorized = categorized;
    categorized.setObject(this);
    Orderable orderable = new Orderable();
    this.inhOrderable = orderable;
    orderable.setObject(this);
    EnabledUIItem enabledUIItem = new EnabledUIItem();
    this.inhEnabledUIItem = enabledUIItem;
    enabledUIItem.setObject(this);
    FlexFields flexFields = new FlexFields();
    this.inhFlexFields = flexFields;
    flexFields.setObject(this);
    MenuHolder menuHolder = new MenuHolder();
    this.inhMenuHolder = menuHolder;
    menuHolder.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.Uielement.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.StyleElement.class.getName())) {
      return (T) this.inhStyleElement;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.NickNamed.class.getName())) {
      return (T) this.inhNickNamed;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.artifact.Categorized.class.getName())) {
      return (T) this.inhCategorized;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.common.Orderable.class.getName())) {
      return (T) this.inhOrderable;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.EnabledUIItem.class.getName())) {
      return (T) this.inhEnabledUIItem;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.FlexFields.class.getName())) {
      return (T) this.inhFlexFields;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.MenuHolder.class.getName())) {
      return (T) this.inhMenuHolder;
    }
    throw new RepositoryException("Cast exception to  " + clazz.getName());
  }

  public Object getObject() {
    return this;
  }
}
