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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import java.util.ArrayList;
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
      value = org.tura.model.designer.repository.serialized.form.FlexField.class,
      name = "FlexField")
})
public class Context extends ContextValue implements Serializable, ContextParameters {

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
  public Context inMemory() {
    throw new UnsupportedOperationException();
  }

  private String transientrefMultiLangLabelMultiLangLabel;

  public String getTransientrefMultiLangLabelMultiLangLabel() {
    return transientrefMultiLangLabelMultiLangLabel;
  }

  public void setTransientrefMultiLangLabelMultiLangLabel(
      java.lang.String transientrefMultiLangLabelMultiLangLabel) {
    this.transientrefMultiLangLabelMultiLangLabel = transientrefMultiLangLabelMultiLangLabel;
  }

  private String transientrefStyleStyleElement;

  public String getTransientrefStyleStyleElement() {
    return transientrefStyleStyleElement;
  }

  public void setTransientrefStyleStyleElement(java.lang.String transientrefStyleStyleElement) {
    this.transientrefStyleStyleElement = transientrefStyleStyleElement;
  }

  private String transientrefEnabledEnabledUIItem;

  public String getTransientrefEnabledEnabledUIItem() {
    return transientrefEnabledEnabledUIItem;
  }

  public void setTransientrefEnabledEnabledUIItem(
      java.lang.String transientrefEnabledEnabledUIItem) {
    this.transientrefEnabledEnabledUIItem = transientrefEnabledEnabledUIItem;
  }

  private String transientrefRequiredUielement;

  public String getTransientrefRequiredUielement() {
    return transientrefRequiredUielement;
  }

  public void setTransientrefRequiredUielement(java.lang.String transientrefRequiredUielement) {
    this.transientrefRequiredUielement = transientrefRequiredUielement;
  }

  private String transientrefReadOnlyUielement;

  public String getTransientrefReadOnlyUielement() {
    return transientrefReadOnlyUielement;
  }

  public void setTransientrefReadOnlyUielement(java.lang.String transientrefReadOnlyUielement) {
    this.transientrefReadOnlyUielement = transientrefReadOnlyUielement;
  }

  private String transientrefIconItemIcon;

  public String getTransientrefIconItemIcon() {
    return transientrefIconItemIcon;
  }

  public void setTransientrefIconItemIcon(java.lang.String transientrefIconItemIcon) {
    this.transientrefIconItemIcon = transientrefIconItemIcon;
  }

  private String transientrefInitialOptionMessageOptionSelection;

  public String getTransientrefInitialOptionMessageOptionSelection() {
    return transientrefInitialOptionMessageOptionSelection;
  }

  public void setTransientrefInitialOptionMessageOptionSelection(
      java.lang.String transientrefInitialOptionMessageOptionSelection) {
    this.transientrefInitialOptionMessageOptionSelection =
        transientrefInitialOptionMessageOptionSelection;
  }

  private String transientrefTransitionMenuItem;

  public String getTransientrefTransitionMenuItem() {
    return transientrefTransitionMenuItem;
  }

  public void setTransientrefTransitionMenuItem(java.lang.String transientrefTransitionMenuItem) {
    this.transientrefTransitionMenuItem = transientrefTransitionMenuItem;
  }

  private String transientrefImageTree;

  public String getTransientrefImageTree() {
    return transientrefImageTree;
  }

  public void setTransientrefImageTree(java.lang.String transientrefImageTree) {
    this.transientrefImageTree = transientrefImageTree;
  }

  private MultiLangLabel opMultiLangLabelMultiLangLabel;

  @Association(
      id = "dd98c7c0-aba5-4b30-a668-000006aa415f",
      from = org.tura.model.designer.repository.serialized.form.Context.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.MultiLangLabel.class,
      property = "multiLangLabel",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refMultiLangLabelMultiLangLabel",
            field1Suffix = "MultiLangLabel",
            field2Suffix = "")
      })
  public MultiLangLabel getOpMultiLangLabelMultiLangLabel() {
    return opMultiLangLabelMultiLangLabel;
  }

  public void setOpMultiLangLabelMultiLangLabel(
      org.tura.model.designer.repository.serialized.form.MultiLangLabel
          opMultiLangLabelMultiLangLabel) {
    this.opMultiLangLabelMultiLangLabel = opMultiLangLabelMultiLangLabel;
  }

  private StyleElement opStyleStyleElement;

  @Association(
      id = "b04e4269-0ab9-4463-bc8b-9717bae47ec6",
      from = org.tura.model.designer.repository.serialized.form.Context.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.StyleElement.class,
      property = "style",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refStyleStyleElement",
            field1Suffix = "StyleElement",
            field2Suffix = "")
      })
  public StyleElement getOpStyleStyleElement() {
    return opStyleStyleElement;
  }

  public void setOpStyleStyleElement(
      org.tura.model.designer.repository.serialized.form.StyleElement opStyleStyleElement) {
    this.opStyleStyleElement = opStyleStyleElement;
  }

  private EnabledUIItem opEnabledEnabledUIItem;

  @Association(
      id = "40f34656-da59-4211-b0d8-3fcf0f2a64b4",
      from = org.tura.model.designer.repository.serialized.form.Context.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.EnabledUIItem.class,
      property = "enabled",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refEnabledEnabledUIItem",
            field1Suffix = "EnabledUIItem",
            field2Suffix = "")
      })
  public EnabledUIItem getOpEnabledEnabledUIItem() {
    return opEnabledEnabledUIItem;
  }

  public void setOpEnabledEnabledUIItem(
      org.tura.model.designer.repository.serialized.form.EnabledUIItem opEnabledEnabledUIItem) {
    this.opEnabledEnabledUIItem = opEnabledEnabledUIItem;
  }

  private Uielement opRequiredUielement;

  @Association(
      id = "ebceb22a-59c3-4bbc-b01a-634a49148e7f",
      from = org.tura.model.designer.repository.serialized.form.Context.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Uielement.class,
      property = "required",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refRequiredUielement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Uielement getOpRequiredUielement() {
    return opRequiredUielement;
  }

  public void setOpRequiredUielement(
      org.tura.model.designer.repository.serialized.form.Uielement opRequiredUielement) {
    this.opRequiredUielement = opRequiredUielement;
  }

  private Uielement opReadOnlyUielement;

  @Association(
      id = "c5eba772-31e7-407b-a6a7-d4d40a0e778c",
      from = org.tura.model.designer.repository.serialized.form.Context.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Uielement.class,
      property = "readOnly",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refReadOnlyUielement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Uielement getOpReadOnlyUielement() {
    return opReadOnlyUielement;
  }

  public void setOpReadOnlyUielement(
      org.tura.model.designer.repository.serialized.form.Uielement opReadOnlyUielement) {
    this.opReadOnlyUielement = opReadOnlyUielement;
  }

  private ItemIcon opIconItemIcon;

  @Association(
      id = "4cc45ff4-c1ff-4524-9be0-f900e3b9a32e",
      from = org.tura.model.designer.repository.serialized.form.Context.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ItemIcon.class,
      property = "icon",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refIconItemIcon",
            field1Suffix = "ItemIcon",
            field2Suffix = "")
      })
  public ItemIcon getOpIconItemIcon() {
    return opIconItemIcon;
  }

  public void setOpIconItemIcon(
      org.tura.model.designer.repository.serialized.form.ItemIcon opIconItemIcon) {
    this.opIconItemIcon = opIconItemIcon;
  }

  private OptionSelection opInitialOptionMessageOptionSelection;

  @Association(
      id = "e7ebc82b-c029-4bf9-ae70-61a209b61c64",
      from = org.tura.model.designer.repository.serialized.form.Context.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.OptionSelection.class,
      property = "initialOptionMessage",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refInitialOptionMessageOptionSelection",
            field1Suffix = "OptionSelection",
            field2Suffix = "")
      })
  public OptionSelection getOpInitialOptionMessageOptionSelection() {
    return opInitialOptionMessageOptionSelection;
  }

  public void setOpInitialOptionMessageOptionSelection(
      org.tura.model.designer.repository.serialized.form.OptionSelection
          opInitialOptionMessageOptionSelection) {
    this.opInitialOptionMessageOptionSelection = opInitialOptionMessageOptionSelection;
  }

  private MenuItem opTransitionMenuItem;

  @Association(
      id = "619bbb66-40ee-45a8-9168-6a8c4e51add5",
      from = org.tura.model.designer.repository.serialized.form.Context.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.MenuItem.class,
      property = "transition",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refTransitionMenuItem",
            field1Suffix = "",
            field2Suffix = "")
      })
  public MenuItem getOpTransitionMenuItem() {
    return opTransitionMenuItem;
  }

  public void setOpTransitionMenuItem(
      org.tura.model.designer.repository.serialized.form.MenuItem opTransitionMenuItem) {
    this.opTransitionMenuItem = opTransitionMenuItem;
  }

  private Tree opImageTree;

  @Association(
      id = "8a48c958-d7e6-4521-a35d-1833329bb3e7",
      from = org.tura.model.designer.repository.serialized.form.Context.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Tree.class,
      property = "image",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refImageTree",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Tree getOpImageTree() {
    return opImageTree;
  }

  public void setOpImageTree(org.tura.model.designer.repository.serialized.form.Tree opImageTree) {
    this.opImageTree = opImageTree;
  }

  private String suidContextParameters;

  public String getSuidContextParameters() {
    return suidContextParameters;
  }

  public void setSuidContextParameters(java.lang.String suidContextParameters) {
    this.suidContextParameters = suidContextParameters;
  }

  private List<ContextParameter> parameters = new ArrayList<>();

  @Association(
      id = "3d70575c-c330-4449-b302-46098147fdd7",
      from = org.tura.model.designer.repository.serialized.form.ContextParameters.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ContextParameter.class,
      property = "opParametersContextParameters",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refParametersContextParameters",
            field1Suffix = "ContextParameters",
            field2Suffix = "")
      })
  public List<ContextParameter> getParameters() {
    return parameters;
  }

  public void setParameters(java.util.List<ContextParameter> parameters) {
    this.parameters = parameters;
  }
}
