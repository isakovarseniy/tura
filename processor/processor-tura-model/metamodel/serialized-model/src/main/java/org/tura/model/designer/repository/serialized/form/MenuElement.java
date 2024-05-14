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
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import org.tura.model.designer.repository.serialized.common.Orderable;
import org.tura.platform.repository.core.annotation.Association;
import java.util.ArrayList;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuItem.class,
      name = "MenuItem"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuExtensionPoint.class,
      name = "MenuExtensionPoint"),
  @Type(value = org.tura.model.designer.repository.serialized.form.SubMenu.class, name = "SubMenu"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MenuSeparator.class,
      name = "MenuSeparator")
})
public class MenuElement
    implements Serializable,
        MultiLangLabel,
        StyleElement,
        Categorized,
        EnabledUIItem,
        Orderable,
        FlexFields {

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

  private String transientrefMenuElementsMenuFolder;

  public String getTransientrefMenuElementsMenuFolder() {
    return transientrefMenuElementsMenuFolder;
  }

  public void setTransientrefMenuElementsMenuFolder(
      java.lang.String transientrefMenuElementsMenuFolder) {
    this.transientrefMenuElementsMenuFolder = transientrefMenuElementsMenuFolder;
  }

  private MenuFolder opMenuElementsMenuFolder;

  @Association(
      id = "b8a4cdc1-cdf8-47ea-ba4e-096e2bd71305",
      from = org.tura.model.designer.repository.serialized.form.MenuElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      property = "menuElements",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public MenuFolder getOpMenuElementsMenuFolder() {
    return opMenuElementsMenuFolder;
  }

  public void setOpMenuElementsMenuFolder(
      org.tura.model.designer.repository.serialized.form.MenuFolder opMenuElementsMenuFolder) {
    this.opMenuElementsMenuFolder = opMenuElementsMenuFolder;
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

  private Integer order;

  public Integer getOrder() {
    return order;
  }

  public void setOrder(java.lang.Integer order) {
    this.order = order;
  }

  private String suidOrderable;

  public String getSuidOrderable() {
    return suidOrderable;
  }

  public void setSuidOrderable(java.lang.String suidOrderable) {
    this.suidOrderable = suidOrderable;
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
}
