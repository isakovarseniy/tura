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
import javax.persistence.Enumerated;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "TabCanvas")
@javax.persistence.Table(name = "TABCANVAS")
public class TabCanvas extends CanvasFrame implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.TabCanvas.class;
  }

  @Enumerated(javax.persistence.EnumType.STRING)
  @javax.persistence.Column(name = "ORIENTATION")
  private Orientation orientation;

  public void setOrientation(org.tura.model.designer.repository.jpa.form.Orientation orientation) {
    this.orientation = orientation;
  }

  public Orientation getOrientation() {
    return orientation;
  }

  @OneToMany(mappedBy = "source", fetch = javax.persistence.FetchType.LAZY)
  private Collection<TabPagesInheritance> opSourceTabPagesInheritance;

  public Collection<TabPagesInheritance> getOpSourceTabPagesInheritance() {
    return opSourceTabPagesInheritance;
  }

  public void setOpSourceTabPagesInheritance(
      java.util.Collection<TabPagesInheritance> opSourceTabPagesInheritance) {
    this.opSourceTabPagesInheritance = opSourceTabPagesInheritance;
  }

  public void setDefaultCanvas(java.lang.Boolean defaultCanvas) {
    this.getInhDefaultCavas().setDefaultCanvas(defaultCanvas);
  }

  public Boolean getDefaultCanvas() {
    return this.getInhDefaultCavas().getDefaultCanvas();
  }

  public void setSuidDefaultCavas(java.lang.String suid) {}

  public String getSuidDefaultCavas() {
    return this.getInhDefaultCavas().getSuid();
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_defaultCavas", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private DefaultCavas inhDefaultCavas;

  public DefaultCavas getInhDefaultCavas() {
    return inhDefaultCavas;
  }

  public void setInhDefaultCavas(
      org.tura.model.designer.repository.jpa.form.DefaultCavas inhDefaultCavas) {
    this.inhDefaultCavas = inhDefaultCavas;
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

  public TabCanvas() {
    DefaultCavas defaultCavas = new DefaultCavas();
    this.inhDefaultCavas = defaultCavas;
    defaultCavas.setObject(this);
    MultiLangLabel multiLangLabel = new MultiLangLabel();
    this.inhMultiLangLabel = multiLangLabel;
    multiLangLabel.setObject(this);
    Categorized categorized = new Categorized();
    this.inhCategorized = categorized;
    categorized.setObject(this);
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
        .equals(org.tura.model.designer.repository.jpa.form.TabCanvas.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.CanvasFrame.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.DefaultCavas.class.getName())) {
      return (T) this.inhDefaultCavas;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.MultiLangLabel.class.getName())) {
      return (T) this.inhMultiLangLabel;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.artifact.Categorized.class.getName())) {
      return (T) this.inhCategorized;
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
    return super.castTo(clazz);
  }

  public Object getObject() {
    return this;
  }
}
