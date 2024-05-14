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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.common.HTMLLayerHolder;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "TimeLine")
@javax.persistence.Table(name = "TIMELINE")
public class TimeLine extends SourcesPointer implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.TimeLine.class;
  }

  @Enumerated(javax.persistence.EnumType.STRING)
  @javax.persistence.Column(name = "LAYOUT")
  private TimeLineLayout layout;

  public void setLayout(org.tura.model.designer.repository.jpa.form.TimeLineLayout layout) {
    this.layout = layout;
  }

  public TimeLineLayout getLayout() {
    return layout;
  }

  @Enumerated(javax.persistence.EnumType.STRING)
  @javax.persistence.Column(name = "ALIGN")
  private TimeLineAlign align;

  public void setAlign(org.tura.model.designer.repository.jpa.form.TimeLineAlign align) {
    this.align = align;
  }

  public TimeLineAlign getAlign() {
    return align;
  }

  public void setSuidChildrenHolder(java.lang.String suid) {}

  public String getSuidChildrenHolder() {
    return this.getInhChildrenHolder().getSuid();
  }

  public Collection<Uielement> getChildren() {
    return this.getInhChildrenHolder().getChildren();
  }

  public void setChildren(java.util.Collection<Uielement> children) {
    this.getInhChildrenHolder().setChildren(children);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_childrenHolder", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private ChildrenHolder inhChildrenHolder;

  public ChildrenHolder getInhChildrenHolder() {
    return inhChildrenHolder;
  }

  public void setInhChildrenHolder(
      org.tura.model.designer.repository.jpa.form.ChildrenHolder inhChildrenHolder) {
    this.inhChildrenHolder = inhChildrenHolder;
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

  public TimeLine() {
    ChildrenHolder childrenHolder = new ChildrenHolder();
    this.inhChildrenHolder = childrenHolder;
    childrenHolder.setObject(this);
    MultiLangLabel multiLangLabel = new MultiLangLabel();
    this.inhMultiLangLabel = multiLangLabel;
    multiLangLabel.setObject(this);
    HTMLLayerHolder hTMLLayerHolder = new HTMLLayerHolder();
    this.inhHTMLLayerHolder = hTMLLayerHolder;
    hTMLLayerHolder.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.TimeLine.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.SourcesPointer.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.Uielement.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.ChildrenHolder.class.getName())) {
      return (T) this.inhChildrenHolder;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.MultiLangLabel.class.getName())) {
      return (T) this.inhMultiLangLabel;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.common.HTMLLayerHolder.class.getName())) {
      return (T) this.inhHTMLLayerHolder;
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
