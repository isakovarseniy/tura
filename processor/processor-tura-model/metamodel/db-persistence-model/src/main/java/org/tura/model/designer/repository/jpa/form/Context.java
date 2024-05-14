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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import java.util.Collection;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Context")
@javax.persistence.Table(name = "CONTEXT")
public class Context extends ContextValue implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.Context.class;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_MULTI_LANG_LABEL_MULTI_LANG_LABEL", referencedColumnName = "SUID")
  })
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private MultiLangLabel opMultiLangLabelMultiLangLabel;

  public MultiLangLabel getOpMultiLangLabelMultiLangLabel() {
    return opMultiLangLabelMultiLangLabel;
  }

  public void setOpMultiLangLabelMultiLangLabel(
      org.tura.model.designer.repository.jpa.form.MultiLangLabel opMultiLangLabelMultiLangLabel) {
    this.opMultiLangLabelMultiLangLabel = opMultiLangLabelMultiLangLabel;
  }

  @JoinColumns({@JoinColumn(name = "REF_STYLE_STYLE_ELEMENT", referencedColumnName = "SUID")})
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private StyleElement opStyleStyleElement;

  public StyleElement getOpStyleStyleElement() {
    return opStyleStyleElement;
  }

  public void setOpStyleStyleElement(
      org.tura.model.designer.repository.jpa.form.StyleElement opStyleStyleElement) {
    this.opStyleStyleElement = opStyleStyleElement;
  }

  @JoinColumns({@JoinColumn(name = "REF_ENABLED_ENABLED_U_I_ITEM", referencedColumnName = "SUID")})
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private EnabledUIItem opEnabledEnabledUIItem;

  public EnabledUIItem getOpEnabledEnabledUIItem() {
    return opEnabledEnabledUIItem;
  }

  public void setOpEnabledEnabledUIItem(
      org.tura.model.designer.repository.jpa.form.EnabledUIItem opEnabledEnabledUIItem) {
    this.opEnabledEnabledUIItem = opEnabledEnabledUIItem;
  }

  @JoinColumns({@JoinColumn(name = "REF_REQUIRED_UIELEMENT", referencedColumnName = "UID")})
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private Uielement opRequiredUielement;

  public Uielement getOpRequiredUielement() {
    return opRequiredUielement;
  }

  public void setOpRequiredUielement(
      org.tura.model.designer.repository.jpa.form.Uielement opRequiredUielement) {
    this.opRequiredUielement = opRequiredUielement;
  }

  @JoinColumns({@JoinColumn(name = "REF_READ_ONLY_UIELEMENT", referencedColumnName = "UID")})
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private Uielement opReadOnlyUielement;

  public Uielement getOpReadOnlyUielement() {
    return opReadOnlyUielement;
  }

  public void setOpReadOnlyUielement(
      org.tura.model.designer.repository.jpa.form.Uielement opReadOnlyUielement) {
    this.opReadOnlyUielement = opReadOnlyUielement;
  }

  @JoinColumns({@JoinColumn(name = "REF_ICON_ITEM_ICON", referencedColumnName = "SUID")})
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private ItemIcon opIconItemIcon;

  public ItemIcon getOpIconItemIcon() {
    return opIconItemIcon;
  }

  public void setOpIconItemIcon(
      org.tura.model.designer.repository.jpa.form.ItemIcon opIconItemIcon) {
    this.opIconItemIcon = opIconItemIcon;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_INITIAL_OPTION_MESSAGE_OPTION_SELECTION", referencedColumnName = "SUID")
  })
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private OptionSelection opInitialOptionMessageOptionSelection;

  public OptionSelection getOpInitialOptionMessageOptionSelection() {
    return opInitialOptionMessageOptionSelection;
  }

  public void setOpInitialOptionMessageOptionSelection(
      org.tura.model.designer.repository.jpa.form.OptionSelection
          opInitialOptionMessageOptionSelection) {
    this.opInitialOptionMessageOptionSelection = opInitialOptionMessageOptionSelection;
  }

  @JoinColumns({@JoinColumn(name = "REF_TRANSITION_MENU_ITEM", referencedColumnName = "UID")})
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private MenuItem opTransitionMenuItem;

  public MenuItem getOpTransitionMenuItem() {
    return opTransitionMenuItem;
  }

  public void setOpTransitionMenuItem(
      org.tura.model.designer.repository.jpa.form.MenuItem opTransitionMenuItem) {
    this.opTransitionMenuItem = opTransitionMenuItem;
  }

  @JoinColumns({@JoinColumn(name = "REF_IMAGE_TREE", referencedColumnName = "UID")})
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private Tree opImageTree;

  public Tree getOpImageTree() {
    return opImageTree;
  }

  public void setOpImageTree(org.tura.model.designer.repository.jpa.form.Tree opImageTree) {
    this.opImageTree = opImageTree;
  }

  public void setSuidContextParameters(java.lang.String suid) {}

  public String getSuidContextParameters() {
    return this.getInhContextParameters().getSuid();
  }

  public Collection<ContextParameter> getParameters() {
    return this.getInhContextParameters().getParameters();
  }

  public void setParameters(java.util.Collection<ContextParameter> parameters) {
    this.getInhContextParameters().setParameters(parameters);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_contextParameters", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private ContextParameters inhContextParameters;

  public ContextParameters getInhContextParameters() {
    return inhContextParameters;
  }

  public void setInhContextParameters(
      org.tura.model.designer.repository.jpa.form.ContextParameters inhContextParameters) {
    this.inhContextParameters = inhContextParameters;
  }

  public Context() {
    ContextParameters contextParameters = new ContextParameters();
    this.inhContextParameters = contextParameters;
    contextParameters.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.Context.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.ContextValue.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.ContextParameters.class.getName())) {
      return (T) this.inhContextParameters;
    }
    throw new RepositoryException("Cast exception to  " + clazz.getName());
  }

  public Object getObject() {
    return this;
  }
}
