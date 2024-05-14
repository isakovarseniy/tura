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
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "MenuDefinition")
@javax.persistence.Table(name = "MENUDEFINITION")
public class MenuDefinition implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.MenuDefinition.class;
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
  @javax.persistence.Column(name = "V_MENUDEFINITION")
  private int vMenuDefinition;

  public int getVmenuDefinition() {
    return vMenuDefinition;
  }

  public void setVmenuDefinition(int vMenuDefinition) {
    this.vMenuDefinition = vMenuDefinition;
  }

  @OneToMany(mappedBy = "opMenuFoldersMenuDefinition", fetch = javax.persistence.FetchType.LAZY)
  private Collection<MenuFolder> menuFolders;

  public Collection<MenuFolder> getMenuFolders() {
    return menuFolders;
  }

  public void setMenuFolders(java.util.Collection<MenuFolder> menuFolders) {
    this.menuFolders = menuFolders;
  }

  @OneToMany(mappedBy = "opToSubMenuMenuDefinition", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ToSubmenu> toSubMenu;

  public Collection<ToSubmenu> getToSubMenu() {
    return toSubMenu;
  }

  public void setToSubMenu(java.util.Collection<ToSubmenu> toSubMenu) {
    this.toSubMenu = toSubMenu;
  }

  @JoinColumns({@JoinColumn(name = "REF_MENUS_VIEWS", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Views opMenusViews;

  public Views getOpMenusViews() {
    return opMenusViews;
  }

  public void setOpMenusViews(org.tura.model.designer.repository.jpa.form.Views opMenusViews) {
    this.opMenusViews = opMenusViews;
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

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.getInhMetaObject().getSuid();
  }

  public Collection<AttributeConnector> getOpSourceAttributeConnector() {
    return this.getInhMetaObject().getOpSourceAttributeConnector();
  }

  public void setOpSourceAttributeConnector(
      java.util.Collection<AttributeConnector> opSourceAttributeConnector) {
    this.getInhMetaObject().setOpSourceAttributeConnector(opSourceAttributeConnector);
  }

  public Collection<AttributeConnector> getOpTargetAttributeConnector() {
    return this.getInhMetaObject().getOpTargetAttributeConnector();
  }

  public void setOpTargetAttributeConnector(
      java.util.Collection<AttributeConnector> opTargetAttributeConnector) {
    this.getInhMetaObject().setOpTargetAttributeConnector(opTargetAttributeConnector);
  }

  public Collection<ContextParameter> getOpRefObjContextParameter() {
    return this.getInhMetaObject().getOpRefObjContextParameter();
  }

  public void setOpRefObjContextParameter(
      java.util.Collection<ContextParameter> opRefObjContextParameter) {
    this.getInhMetaObject().setOpRefObjContextParameter(opRefObjContextParameter);
  }

  public Collection<ExpressionPart> getOpObjRefExpressionPart() {
    return this.getInhMetaObject().getOpObjRefExpressionPart();
  }

  public void setOpObjRefExpressionPart(
      java.util.Collection<ExpressionPart> opObjRefExpressionPart) {
    this.getInhMetaObject().setOpObjRefExpressionPart(opObjRefExpressionPart);
  }

  public Collection<ControlPointer> getOpValuePointerControlPointer() {
    return this.getInhMetaObject().getOpValuePointerControlPointer();
  }

  public void setOpValuePointerControlPointer(
      java.util.Collection<ControlPointer> opValuePointerControlPointer) {
    this.getInhMetaObject().setOpValuePointerControlPointer(opValuePointerControlPointer);
  }

  public Collection<Selection> getOpDisplayOptionPointerSelection() {
    return this.getInhMetaObject().getOpDisplayOptionPointerSelection();
  }

  public void setOpDisplayOptionPointerSelection(
      java.util.Collection<Selection> opDisplayOptionPointerSelection) {
    this.getInhMetaObject().setOpDisplayOptionPointerSelection(opDisplayOptionPointerSelection);
  }

  public Collection<Selection> getOpValueOptionPointerSelection() {
    return this.getInhMetaObject().getOpValueOptionPointerSelection();
  }

  public void setOpValueOptionPointerSelection(
      java.util.Collection<Selection> opValueOptionPointerSelection) {
    this.getInhMetaObject().setOpValueOptionPointerSelection(opValueOptionPointerSelection);
  }

  public Collection<OrderBy> getOpRefObjOrderBy() {
    return this.getInhMetaObject().getOpRefObjOrderBy();
  }

  public void setOpRefObjOrderBy(java.util.Collection<OrderBy> opRefObjOrderBy) {
    this.getInhMetaObject().setOpRefObjOrderBy(opRefObjOrderBy);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_metaObject", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private MetaObject inhMetaObject;

  public MetaObject getInhMetaObject() {
    return inhMetaObject;
  }

  public void setInhMetaObject(
      org.tura.model.designer.repository.jpa.metabase.MetaObject inhMetaObject) {
    this.inhMetaObject = inhMetaObject;
  }

  public MenuDefinition() {
    StyleElement styleElement = new StyleElement();
    this.inhStyleElement = styleElement;
    styleElement.setObject(this);
    Categorized categorized = new Categorized();
    this.inhCategorized = categorized;
    categorized.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.MenuDefinition.class.getName())) {
      return (T) this;
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
        .equals(org.tura.model.designer.repository.jpa.metabase.MetaObject.class.getName())) {
      return (T) this.inhMetaObject;
    }
    throw new RepositoryException("Cast exception to  " + clazz.getName());
  }

  public Object getObject() {
    return this;
  }
}
