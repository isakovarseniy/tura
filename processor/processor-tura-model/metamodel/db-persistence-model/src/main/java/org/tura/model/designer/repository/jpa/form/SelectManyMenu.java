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
import org.tura.model.designer.repository.jpa.type.Type;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import java.util.Collection;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "SelectManyMenu")
@javax.persistence.Table(name = "SELECTMANYMENU")
public class SelectManyMenu extends Uielement implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.SelectManyMenu.class;
  }

  public void setInitialOptionValue(java.lang.String initialOptionValue) {
    this.getInhOptionSelection().setInitialOptionValue(initialOptionValue);
  }

  public String getInitialOptionValue() {
    return this.getInhOptionSelection().getInitialOptionValue();
  }

  public void setSuidOptionSelection(java.lang.String suid) {}

  public String getSuidOptionSelection() {
    return this.getInhOptionSelection().getSuid();
  }

  public Selection getSelection() {
    return this.getInhOptionSelection().getSelection();
  }

  public void setSelection(org.tura.model.designer.repository.jpa.form.Selection selection) {
    this.getInhOptionSelection().setSelection(selection);
  }

  public Context getInitialOptionMessage() {
    return this.getInhOptionSelection().getInitialOptionMessage();
  }

  public void setInitialOptionMessage(
      org.tura.model.designer.repository.jpa.form.Context initialOptionMessage) {
    this.getInhOptionSelection().setInitialOptionMessage(initialOptionMessage);
  }

  public DataControl getOptionPointer() {
    return this.getInhOptionSelection().getOptionPointer();
  }

  public void setOptionPointer(
      org.tura.model.designer.repository.jpa.form.DataControl optionPointer) {
    this.getInhOptionSelection().setOptionPointer(optionPointer);
  }

  public Type getOptionCast() {
    return this.getInhOptionSelection().getOptionCast();
  }

  public void setOptionCast(org.tura.model.designer.repository.jpa.type.Type optionCast) {
    this.getInhOptionSelection().setOptionCast(optionCast);
  }

  public DataControl getOptionCastDataControl() {
    return this.getInhOptionSelection().getOptionCastDataControl();
  }

  public void setOptionCastDataControl(
      org.tura.model.designer.repository.jpa.form.DataControl optionCastDataControl) {
    this.getInhOptionSelection().setOptionCastDataControl(optionCastDataControl);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_optionSelection", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private OptionSelection inhOptionSelection;

  public OptionSelection getInhOptionSelection() {
    return inhOptionSelection;
  }

  public void setInhOptionSelection(
      org.tura.model.designer.repository.jpa.form.OptionSelection inhOptionSelection) {
    this.inhOptionSelection = inhOptionSelection;
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

  public SelectManyMenu() {
    OptionSelection optionSelection = new OptionSelection();
    this.inhOptionSelection = optionSelection;
    optionSelection.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.SelectManyMenu.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.OptionSelection.class.getName())) {
      return (T) this.inhOptionSelection;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.Uielement.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.metabase.MetaObject.class.getName())) {
      return (T) this.inhMetaObject;
    }
    return super.castTo(clazz);
  }

  public Object getObject() {
    return this;
  }
}
