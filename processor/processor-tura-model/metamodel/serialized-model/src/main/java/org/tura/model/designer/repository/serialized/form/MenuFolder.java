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

package org.tura.model.designer.repository.serialized.form;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.common.HTMLLayerHolder;
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
public class MenuFolder
    implements Serializable,
        HTMLLayerHolder,
        EnabledUIItem,
        Categorized,
        StyleElement,
        MultiLangLabel,
        ItemIcon,
        FlexFields,
        MetaObject {

  private static final long serialVersionUID = 1L;

  private Boolean attached;

  public Boolean getAttached() {
    return attached;
  }

  public void setAttached(Boolean value) {
    this.attached = value;
  }

  private String serializationid;

  public String getSerializationid() {
    return serializationid;
  }

  public void setSerializationid(String value) {
    this.serializationid = value;
  }

  private String cpaid;

  public String getCpaid() {
    return cpaid;
  }

  public void setCpaid(String value) {
    this.cpaid = value;
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private Boolean extensionPoint;

  public Boolean getExtensionPoint() {
    return extensionPoint;
  }

  public void setExtensionPoint(java.lang.Boolean extensionPoint) {
    this.extensionPoint = extensionPoint;
  }

  private String transientrefMenuFoldersMenuDefinition;

  public String getTransientrefMenuFoldersMenuDefinition() {
    return transientrefMenuFoldersMenuDefinition;
  }

  public void setTransientrefMenuFoldersMenuDefinition(
      java.lang.String transientrefMenuFoldersMenuDefinition) {
    this.transientrefMenuFoldersMenuDefinition = transientrefMenuFoldersMenuDefinition;
  }

  private List<MenuHolder> opMenuMenuHolder = new ArrayList<>();

  @Association(
      id = "1b4e48c8-e605-4186-94e8-c834f732c46f",
      from = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.MenuHolder.class,
      property = "menu",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<MenuHolder> getOpMenuMenuHolder() {
    return opMenuMenuHolder;
  }

  public void setOpMenuMenuHolder(java.util.List<MenuHolder> opMenuMenuHolder) {
    this.opMenuMenuHolder = opMenuMenuHolder;
  }

  private List<MenuExtensionRef> opExtensionRefMenuExtensionRef = new ArrayList<>();

  @Association(
      id = "5bd80cc8-adee-4bdd-a00b-f2322578d166",
      from = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.MenuExtensionRef.class,
      property = "extensionRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<MenuExtensionRef> getOpExtensionRefMenuExtensionRef() {
    return opExtensionRefMenuExtensionRef;
  }

  public void setOpExtensionRefMenuExtensionRef(
      java.util.List<MenuExtensionRef> opExtensionRefMenuExtensionRef) {
    this.opExtensionRefMenuExtensionRef = opExtensionRefMenuExtensionRef;
  }

  private List<MenuElement> menuElements = new ArrayList<>();

  @Association(
      id = "b8a4cdc1-cdf8-47ea-ba4e-096e2bd71305",
      from = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.MenuElement.class,
      property = "opMenuElementsMenuFolder",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<MenuElement> getMenuElements() {
    return menuElements;
  }

  public void setMenuElements(java.util.List<MenuElement> menuElements) {
    this.menuElements = menuElements;
  }

  private List<ToSubmenu> opTargetToSubmenu = new ArrayList<>();

  @Association(
      id = "6b042c8f-82b1-4c9d-a0de-a0e2e00325ca",
      from = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ToSubmenu.class,
      property = "target",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ToSubmenu> getOpTargetToSubmenu() {
    return opTargetToSubmenu;
  }

  public void setOpTargetToSubmenu(java.util.List<ToSubmenu> opTargetToSubmenu) {
    this.opTargetToSubmenu = opTargetToSubmenu;
  }

  private MenuDefinition opMenuFoldersMenuDefinition;

  @Association(
      id = "227ab68b-09e4-4865-ac19-f650276dc33e",
      from = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.MenuDefinition.class,
      property = "menuFolders",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public MenuDefinition getOpMenuFoldersMenuDefinition() {
    return opMenuFoldersMenuDefinition;
  }

  public void setOpMenuFoldersMenuDefinition(
      org.tura.model.designer.repository.serialized.form.MenuDefinition
          opMenuFoldersMenuDefinition) {
    this.opMenuFoldersMenuDefinition = opMenuFoldersMenuDefinition;
  }

  private Integer columns;

  public Integer getColumns() {
    return columns;
  }

  public void setColumns(java.lang.Integer columns) {
    this.columns = columns;
  }

  private String suidHTMLLayerHolder;

  public String getSuidHTMLLayerHolder() {
    return suidHTMLLayerHolder;
  }

  public void setSuidHTMLLayerHolder(java.lang.String suidHTMLLayerHolder) {
    this.suidHTMLLayerHolder = suidHTMLLayerHolder;
  }

  private String suidEnabledUIItem;

  public String getSuidEnabledUIItem() {
    return suidEnabledUIItem;
  }

  public void setSuidEnabledUIItem(java.lang.String suidEnabledUIItem) {
    this.suidEnabledUIItem = suidEnabledUIItem;
  }

  private Context enabled;

  @Association(
      id = "40f34656-da59-4211-b0d8-3fcf0f2a64b4",
      from = org.tura.model.designer.repository.serialized.form.EnabledUIItem.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Context.class,
      property = "opEnabledEnabledUIItem",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public Context getEnabled() {
    return enabled;
  }

  public void setEnabled(org.tura.model.designer.repository.serialized.form.Context enabled) {
    this.enabled = enabled;
  }

  private String suidCategorized;

  public String getSuidCategorized() {
    return suidCategorized;
  }

  public void setSuidCategorized(java.lang.String suidCategorized) {
    this.suidCategorized = suidCategorized;
  }

  private List<Classifier> classifiers = new ArrayList<>();

  @Association(
      id = "1bb1f934-5eba-4f36-932f-0f3c7ef54731",
      from = org.tura.model.designer.repository.serialized.artifact.Categorized.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.Classifier.class,
      property = "opClassifiersCategorized",
      containment = true,
      type = "One2Many",
      lazy = false,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Classifier> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(java.util.List<Classifier> classifiers) {
    this.classifiers = classifiers;
  }

  private String suidStyleElement;

  public String getSuidStyleElement() {
    return suidStyleElement;
  }

  public void setSuidStyleElement(java.lang.String suidStyleElement) {
    this.suidStyleElement = suidStyleElement;
  }

  private Context style;

  @Association(
      id = "b04e4269-0ab9-4463-bc8b-9717bae47ec6",
      from = org.tura.model.designer.repository.serialized.form.StyleElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Context.class,
      property = "opStyleStyleElement",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public Context getStyle() {
    return style;
  }

  public void setStyle(org.tura.model.designer.repository.serialized.form.Context style) {
    this.style = style;
  }

  private String suidMultiLangLabel;

  public String getSuidMultiLangLabel() {
    return suidMultiLangLabel;
  }

  public void setSuidMultiLangLabel(java.lang.String suidMultiLangLabel) {
    this.suidMultiLangLabel = suidMultiLangLabel;
  }

  private Context multiLangLabel;

  @Association(
      id = "dd98c7c0-aba5-4b30-a668-000006aa415f",
      from = org.tura.model.designer.repository.serialized.form.MultiLangLabel.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Context.class,
      property = "opMultiLangLabelMultiLangLabel",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public Context getMultiLangLabel() {
    return multiLangLabel;
  }

  public void setMultiLangLabel(
      org.tura.model.designer.repository.serialized.form.Context multiLangLabel) {
    this.multiLangLabel = multiLangLabel;
  }

  private String suidItemIcon;

  public String getSuidItemIcon() {
    return suidItemIcon;
  }

  public void setSuidItemIcon(java.lang.String suidItemIcon) {
    this.suidItemIcon = suidItemIcon;
  }

  private Context icon;

  @Association(
      id = "4cc45ff4-c1ff-4524-9be0-f900e3b9a32e",
      from = org.tura.model.designer.repository.serialized.form.ItemIcon.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Context.class,
      property = "opIconItemIcon",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public Context getIcon() {
    return icon;
  }

  public void setIcon(org.tura.model.designer.repository.serialized.form.Context icon) {
    this.icon = icon;
  }

  private String suidFlexFields;

  public String getSuidFlexFields() {
    return suidFlexFields;
  }

  public void setSuidFlexFields(java.lang.String suidFlexFields) {
    this.suidFlexFields = suidFlexFields;
  }

  private List<FlexField> fields = new ArrayList<>();

  @Association(
      id = "6ed5ba2a-8b06-4f91-aef9-83c9c9117dfa",
      from = org.tura.model.designer.repository.serialized.form.FlexFields.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.FlexField.class,
      property = "opFieldsFlexFields",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<FlexField> getFields() {
    return fields;
  }

  public void setFields(java.util.List<FlexField> fields) {
    this.fields = fields;
  }

  private String suidMetaObject;

  public String getSuidMetaObject() {
    return suidMetaObject;
  }

  public void setSuidMetaObject(java.lang.String suidMetaObject) {
    this.suidMetaObject = suidMetaObject;
  }

  private List<AttributeConnector> opSourceAttributeConnector = new ArrayList<>();

  @Association(
      id = "ee8133a7-72b3-48b1-9807-e554f5a27019",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
      property = "source",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<AttributeConnector> getOpSourceAttributeConnector() {
    return opSourceAttributeConnector;
  }

  public void setOpSourceAttributeConnector(
      java.util.List<AttributeConnector> opSourceAttributeConnector) {
    this.opSourceAttributeConnector = opSourceAttributeConnector;
  }

  private List<AttributeConnector> opTargetAttributeConnector = new ArrayList<>();

  @Association(
      id = "1b246eaf-a5bc-4e1a-960f-6fcc29adf71a",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
      property = "target",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<AttributeConnector> getOpTargetAttributeConnector() {
    return opTargetAttributeConnector;
  }

  public void setOpTargetAttributeConnector(
      java.util.List<AttributeConnector> opTargetAttributeConnector) {
    this.opTargetAttributeConnector = opTargetAttributeConnector;
  }

  private List<ContextParameter> opRefObjContextParameter = new ArrayList<>();

  @Association(
      id = "ef46af04-c245-46b5-9b3b-24f475002cd1",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ContextParameter.class,
      property = "refObj",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ContextParameter> getOpRefObjContextParameter() {
    return opRefObjContextParameter;
  }

  public void setOpRefObjContextParameter(
      java.util.List<ContextParameter> opRefObjContextParameter) {
    this.opRefObjContextParameter = opRefObjContextParameter;
  }

  private List<ExpressionPart> opObjRefExpressionPart = new ArrayList<>();

  @Association(
      id = "c7db89bb-57ce-41f4-915f-31af456f91e6",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ExpressionPart.class,
      property = "objRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ExpressionPart> getOpObjRefExpressionPart() {
    return opObjRefExpressionPart;
  }

  public void setOpObjRefExpressionPart(java.util.List<ExpressionPart> opObjRefExpressionPart) {
    this.opObjRefExpressionPart = opObjRefExpressionPart;
  }

  private List<ControlPointer> opValuePointerControlPointer = new ArrayList<>();

  @Association(
      id = "f7c17e78-ca29-4283-8b59-58a4b320d35a",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ControlPointer.class,
      property = "valuePointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ControlPointer> getOpValuePointerControlPointer() {
    return opValuePointerControlPointer;
  }

  public void setOpValuePointerControlPointer(
      java.util.List<ControlPointer> opValuePointerControlPointer) {
    this.opValuePointerControlPointer = opValuePointerControlPointer;
  }

  private List<Selection> opDisplayOptionPointerSelection = new ArrayList<>();

  @Association(
      id = "54a67340-af4b-4c9a-9c65-322903fd3278",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Selection.class,
      property = "displayOptionPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Selection> getOpDisplayOptionPointerSelection() {
    return opDisplayOptionPointerSelection;
  }

  public void setOpDisplayOptionPointerSelection(
      java.util.List<Selection> opDisplayOptionPointerSelection) {
    this.opDisplayOptionPointerSelection = opDisplayOptionPointerSelection;
  }

  private List<Selection> opValueOptionPointerSelection = new ArrayList<>();

  @Association(
      id = "93bb8f22-1ce5-4cf3-a754-e32db046108a",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Selection.class,
      property = "valueOptionPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Selection> getOpValueOptionPointerSelection() {
    return opValueOptionPointerSelection;
  }

  public void setOpValueOptionPointerSelection(
      java.util.List<Selection> opValueOptionPointerSelection) {
    this.opValueOptionPointerSelection = opValueOptionPointerSelection;
  }

  private List<OrderBy> opRefObjOrderBy = new ArrayList<>();

  @Association(
      id = "9aad0734-a04c-48ba-b372-2885482154f1",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.OrderBy.class,
      property = "refObj",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<OrderBy> getOpRefObjOrderBy() {
    return opRefObjOrderBy;
  }

  public void setOpRefObjOrderBy(java.util.List<OrderBy> opRefObjOrderBy) {
    this.opRefObjOrderBy = opRefObjOrderBy;
  }
}
