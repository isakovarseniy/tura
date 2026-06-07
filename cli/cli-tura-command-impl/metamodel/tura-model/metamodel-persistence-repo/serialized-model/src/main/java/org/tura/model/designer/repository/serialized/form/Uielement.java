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

package org.tura.model.designer.repository.serialized.form;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import org.tura.model.designer.repository.serialized.common.Orderable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import java.util.ArrayList;
import java.util.List;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
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
      value = org.tura.model.designer.repository.serialized.form.SourcesPointer.class,
      name = "SourcesPointer"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.LayerHolder.class,
      name = "LayerHolder"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Label.class, name = "Label"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.MessageElement.class,
      name = "MessageElement"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.SelectManyMenu.class,
      name = "SelectManyMenu"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Button.class, name = "Button"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Menu.class, name = "Menu"),
  @Type(value = org.tura.model.designer.repository.serialized.form.BlockUI.class, name = "BlockUI"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FileUpload.class,
      name = "FileUpload"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.FileDownload.class,
      name = "FileDownload"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Poll.class, name = "Poll"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.WindowRef.class,
      name = "WindowRef")
})
public class Uielement
    implements Serializable,
        StyleElement,
        NickNamed,
        Categorized,
        Orderable,
        EnabledUIItem,
        FlexFields,
        MenuHolder {

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

  @JsonIgnore
  public boolean isInMemory() {
    throw new UnsupportedOperationException();
  }

  @JsonIgnore
  public Uielement inMemory() {
    throw new UnsupportedOperationException();
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private String transientrefChildrenChildrenHolder;

  public String getTransientrefChildrenChildrenHolder() {
    return transientrefChildrenChildrenHolder;
  }

  public void setTransientrefChildrenChildrenHolder(
      java.lang.String transientrefChildrenChildrenHolder) {
    this.transientrefChildrenChildrenHolder = transientrefChildrenChildrenHolder;
  }

  private String transientrefElementColumn;

  public String getTransientrefElementColumn() {
    return transientrefElementColumn;
  }

  public void setTransientrefElementColumn(java.lang.String transientrefElementColumn) {
    this.transientrefElementColumn = transientrefElementColumn;
  }

  private Context required;

  @Association(
      id = "ebceb22a-59c3-4bbc-b01a-634a49148e7f",
      from = org.tura.model.designer.repository.serialized.form.Uielement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Context.class,
      property = "opRequiredUielement",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refRequiredUielement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Context getRequired() {
    return required;
  }

  public void setRequired(org.tura.model.designer.repository.serialized.form.Context required) {
    this.required = required;
  }

  private Context readOnly;

  @Association(
      id = "c5eba772-31e7-407b-a6a7-d4d40a0e778c",
      from = org.tura.model.designer.repository.serialized.form.Uielement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Context.class,
      property = "opReadOnlyUielement",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refReadOnlyUielement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Context getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(org.tura.model.designer.repository.serialized.form.Context readOnly) {
    this.readOnly = readOnly;
  }

  private List<AreaRef> refreshAreas = new ArrayList<>();

  @Association(
      id = "daf24c37-836a-4380-815b-6028e086439c",
      from = org.tura.model.designer.repository.serialized.form.Uielement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.AreaRef.class,
      property = "opRefreshAreasUielement",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refRefreshAreasUielement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<AreaRef> getRefreshAreas() {
    return refreshAreas;
  }

  public void setRefreshAreas(java.util.List<AreaRef> refreshAreas) {
    this.refreshAreas = refreshAreas;
  }

  private ChildrenHolder opChildrenChildrenHolder;

  @Association(
      id = "cc436a8b-cbdd-4570-bd03-20f502e2f563",
      from = org.tura.model.designer.repository.serialized.form.Uielement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ChildrenHolder.class,
      property = "children",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refChildrenChildrenHolder",
            field1Suffix = "ChildrenHolder",
            field2Suffix = "")
      })
  public ChildrenHolder getOpChildrenChildrenHolder() {
    return opChildrenChildrenHolder;
  }

  public void setOpChildrenChildrenHolder(
      org.tura.model.designer.repository.serialized.form.ChildrenHolder opChildrenChildrenHolder) {
    this.opChildrenChildrenHolder = opChildrenChildrenHolder;
  }

  private Column opElementColumn;

  @Association(
      id = "93e08144-a5d7-43bd-a30d-95f3e659f639",
      from = org.tura.model.designer.repository.serialized.form.Uielement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Column.class,
      property = "element",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refElementColumn",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Column getOpElementColumn() {
    return opElementColumn;
  }

  public void setOpElementColumn(
      org.tura.model.designer.repository.serialized.form.Column opElementColumn) {
    this.opElementColumn = opElementColumn;
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refStyleStyleElement",
            field1Suffix = "StyleElement",
            field2Suffix = "")
      })
  public Context getStyle() {
    return style;
  }

  public void setStyle(org.tura.model.designer.repository.serialized.form.Context style) {
    this.style = style;
  }

  private String nickname;

  public String getNickname() {
    return nickname;
  }

  public void setNickname(java.lang.String nickname) {
    this.nickname = nickname;
  }

  private String suidNickNamed;

  public String getSuidNickNamed() {
    return suidNickNamed;
  }

  public void setSuidNickNamed(java.lang.String suidNickNamed) {
    this.suidNickNamed = suidNickNamed;
  }

  private List<AreaRef> opAreaAreaRef = new ArrayList<>();

  @Association(
      id = "47ccbb30-42b9-45c5-bdbe-b4a840bb9021",
      from = org.tura.model.designer.repository.serialized.form.NickNamed.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.AreaRef.class,
      property = "area",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpAreaAreaRefNickNamed",
            field1Suffix = "NickNamed",
            field2Suffix = "")
      })
  public List<AreaRef> getOpAreaAreaRef() {
    return opAreaAreaRef;
  }

  public void setOpAreaAreaRef(java.util.List<AreaRef> opAreaAreaRef) {
    this.opAreaAreaRef = opAreaAreaRef;
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refClassifiersCategorized",
            field1Suffix = "Categorized",
            field2Suffix = "")
      })
  public List<Classifier> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(java.util.List<Classifier> classifiers) {
    this.classifiers = classifiers;
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refEnabledEnabledUIItem",
            field1Suffix = "EnabledUIItem",
            field2Suffix = "")
      })
  public Context getEnabled() {
    return enabled;
  }

  public void setEnabled(org.tura.model.designer.repository.serialized.form.Context enabled) {
    this.enabled = enabled;
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refFieldsFlexFields",
            field1Suffix = "FlexFields",
            field2Suffix = "")
      })
  public List<FlexField> getFields() {
    return fields;
  }

  public void setFields(java.util.List<FlexField> fields) {
    this.fields = fields;
  }

  private String suidMenuHolder;

  public String getSuidMenuHolder() {
    return suidMenuHolder;
  }

  public void setSuidMenuHolder(java.lang.String suidMenuHolder) {
    this.suidMenuHolder = suidMenuHolder;
  }

  private String transientrefOpMenuMenuHolderMenuFolder;

  public String getTransientrefOpMenuMenuHolderMenuFolder() {
    return transientrefOpMenuMenuHolderMenuFolder;
  }

  public void setTransientrefOpMenuMenuHolderMenuFolder(
      java.lang.String transientrefOpMenuMenuHolderMenuFolder) {
    this.transientrefOpMenuMenuHolderMenuFolder = transientrefOpMenuMenuHolderMenuFolder;
  }

  private MenuFolder menu;

  @Association(
      id = "1b4e48c8-e605-4186-94e8-c834f732c46f",
      from = org.tura.model.designer.repository.serialized.form.MenuHolder.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.MenuFolder.class,
      property = "opMenuMenuHolder",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpMenuMenuHolderMenuFolder",
            field1Suffix = "",
            field2Suffix = "")
      })
  public MenuFolder getMenu() {
    return menu;
  }

  public void setMenu(org.tura.model.designer.repository.serialized.form.MenuFolder menu) {
    this.menu = menu;
  }
}
