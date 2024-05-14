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
import org.tura.model.designer.repository.jpa.common.HTMLLayerHolder;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "MenuFolder")
@javax.persistence.Table(name = "MENUFOLDER")
public class MenuFolder implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.MenuFolder.class;
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

  @javax.persistence.Column(name = "EXTENSION_POINT")
  private Boolean extensionPoint;

  public void setExtensionPoint(java.lang.Boolean extensionPoint) {
    this.extensionPoint = extensionPoint;
  }

  public Boolean getExtensionPoint() {
    return extensionPoint;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_MENUFOLDER")
  private int vMenuFolder;

  public int getVmenuFolder() {
    return vMenuFolder;
  }

  public void setVmenuFolder(int vMenuFolder) {
    this.vMenuFolder = vMenuFolder;
  }

  @OneToMany(mappedBy = "menu", fetch = javax.persistence.FetchType.LAZY)
  private Collection<MenuHolder> opMenuMenuHolder;

  public Collection<MenuHolder> getOpMenuMenuHolder() {
    return opMenuMenuHolder;
  }

  public void setOpMenuMenuHolder(java.util.Collection<MenuHolder> opMenuMenuHolder) {
    this.opMenuMenuHolder = opMenuMenuHolder;
  }

  @OneToMany(mappedBy = "extensionRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<MenuExtensionRef> opExtensionRefMenuExtensionRef;

  public Collection<MenuExtensionRef> getOpExtensionRefMenuExtensionRef() {
    return opExtensionRefMenuExtensionRef;
  }

  public void setOpExtensionRefMenuExtensionRef(
      java.util.Collection<MenuExtensionRef> opExtensionRefMenuExtensionRef) {
    this.opExtensionRefMenuExtensionRef = opExtensionRefMenuExtensionRef;
  }

  @OneToMany(mappedBy = "opMenuElementsMenuFolder", fetch = javax.persistence.FetchType.LAZY)
  private Collection<MenuElement> menuElements;

  public Collection<MenuElement> getMenuElements() {
    return menuElements;
  }

  public void setMenuElements(java.util.Collection<MenuElement> menuElements) {
    this.menuElements = menuElements;
  }

  @OneToMany(mappedBy = "target", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ToSubmenu> opTargetToSubmenu;

  public Collection<ToSubmenu> getOpTargetToSubmenu() {
    return opTargetToSubmenu;
  }

  public void setOpTargetToSubmenu(java.util.Collection<ToSubmenu> opTargetToSubmenu) {
    this.opTargetToSubmenu = opTargetToSubmenu;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_MENU_FOLDERS_MENU_DEFINITION", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private MenuDefinition opMenuFoldersMenuDefinition;

  public MenuDefinition getOpMenuFoldersMenuDefinition() {
    return opMenuFoldersMenuDefinition;
  }

  public void setOpMenuFoldersMenuDefinition(
      org.tura.model.designer.repository.jpa.form.MenuDefinition opMenuFoldersMenuDefinition) {
    this.opMenuFoldersMenuDefinition = opMenuFoldersMenuDefinition;
  }

  public void setColumns(java.lang.Integer columns) {
    this.getInhHTMLLayerHolder().setColumns(columns);
  }

  public Integer getColumns() {
    return this.getInhHTMLLayerHolder().getColumns();
  }

  public void setSuidHTMLLayerHolder(java.lang.String suid) {}

  public String getSuidHTMLLayerHolder() {
    return this.getInhHTMLLayerHolder().getSuid();
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_hTMLLayerHolder", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private HTMLLayerHolder inhHTMLLayerHolder;

  public HTMLLayerHolder getInhHTMLLayerHolder() {
    return inhHTMLLayerHolder;
  }

  public void setInhHTMLLayerHolder(
      org.tura.model.designer.repository.jpa.common.HTMLLayerHolder inhHTMLLayerHolder) {
    this.inhHTMLLayerHolder = inhHTMLLayerHolder;
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

  public void setSuidItemIcon(java.lang.String suid) {}

  public String getSuidItemIcon() {
    return this.getInhItemIcon().getSuid();
  }

  public Context getIcon() {
    return this.getInhItemIcon().getIcon();
  }

  public void setIcon(org.tura.model.designer.repository.jpa.form.Context icon) {
    this.getInhItemIcon().setIcon(icon);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_itemIcon", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private ItemIcon inhItemIcon;

  public ItemIcon getInhItemIcon() {
    return inhItemIcon;
  }

  public void setInhItemIcon(org.tura.model.designer.repository.jpa.form.ItemIcon inhItemIcon) {
    this.inhItemIcon = inhItemIcon;
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

  public MenuFolder() {
    HTMLLayerHolder hTMLLayerHolder = new HTMLLayerHolder();
    this.inhHTMLLayerHolder = hTMLLayerHolder;
    hTMLLayerHolder.setObject(this);
    EnabledUIItem enabledUIItem = new EnabledUIItem();
    this.inhEnabledUIItem = enabledUIItem;
    enabledUIItem.setObject(this);
    Categorized categorized = new Categorized();
    this.inhCategorized = categorized;
    categorized.setObject(this);
    StyleElement styleElement = new StyleElement();
    this.inhStyleElement = styleElement;
    styleElement.setObject(this);
    MultiLangLabel multiLangLabel = new MultiLangLabel();
    this.inhMultiLangLabel = multiLangLabel;
    multiLangLabel.setObject(this);
    ItemIcon itemIcon = new ItemIcon();
    this.inhItemIcon = itemIcon;
    itemIcon.setObject(this);
    FlexFields flexFields = new FlexFields();
    this.inhFlexFields = flexFields;
    flexFields.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.MenuFolder.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.common.HTMLLayerHolder.class.getName())) {
      return (T) this.inhHTMLLayerHolder;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.EnabledUIItem.class.getName())) {
      return (T) this.inhEnabledUIItem;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.artifact.Categorized.class.getName())) {
      return (T) this.inhCategorized;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.StyleElement.class.getName())) {
      return (T) this.inhStyleElement;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.MultiLangLabel.class.getName())) {
      return (T) this.inhMultiLangLabel;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.ItemIcon.class.getName())) {
      return (T) this.inhItemIcon;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.FlexFields.class.getName())) {
      return (T) this.inhFlexFields;
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
