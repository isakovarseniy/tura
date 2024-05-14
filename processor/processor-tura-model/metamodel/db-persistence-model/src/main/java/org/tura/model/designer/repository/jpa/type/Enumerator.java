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

package org.tura.model.designer.repository.jpa.type;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Enumerator")
@javax.persistence.Table(name = "ENUMERATOR")
public class Enumerator extends TypeElement implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.type.Enumerator.class;
  }

  @OneToMany(mappedBy = "opValuesEnumerator", fetch = javax.persistence.FetchType.LAZY)
  private Collection<EnumAttribute> values;

  public Collection<EnumAttribute> getValues() {
    return values;
  }

  public void setValues(java.util.Collection<EnumAttribute> values) {
    this.values = values;
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

  public Enumerator() {
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
        .equals(org.tura.model.designer.repository.jpa.type.Enumerator.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.type.TypeElement.class.getName())) {
      return (T) this;
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
