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
import javax.persistence.Enumerated;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.objectmapper.OmRelation;
import org.tura.model.designer.repository.jpa.form.RelationMapper;
import org.tura.model.designer.repository.jpa.form.InternalRelation;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Assosiation")
@javax.persistence.Table(name = "ASSOSIATION")
public class Assosiation extends Relationship implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.type.Assosiation.class;
  }

  @Enumerated(javax.persistence.EnumType.STRING)
  @javax.persistence.Column(name = "TYPE")
  private RelationType type;

  public void setType(org.tura.model.designer.repository.jpa.type.RelationType type) {
    this.type = type;
  }

  public RelationType getType() {
    return type;
  }

  @Enumerated(javax.persistence.EnumType.STRING)
  @javax.persistence.Column(name = "CONTAINMENT")
  private Containment containment;

  public void setContainment(org.tura.model.designer.repository.jpa.type.Containment containment) {
    this.containment = containment;
  }

  public Containment getContainment() {
    return containment;
  }

  @javax.persistence.Column(name = "INTERNAL")
  private Boolean internal;

  public void setInternal(java.lang.Boolean internal) {
    this.internal = internal;
  }

  public Boolean getInternal() {
    return internal;
  }

  @javax.persistence.Column(name = "LAZY")
  private Boolean lazy;

  public void setLazy(java.lang.Boolean lazy) {
    this.lazy = lazy;
  }

  public Boolean getLazy() {
    return lazy;
  }

  @javax.persistence.Column(name = "SOURCE_OPERATION")
  private String sourceOperation;

  public void setSourceOperation(java.lang.String sourceOperation) {
    this.sourceOperation = sourceOperation;
  }

  public String getSourceOperation() {
    return sourceOperation;
  }

  @javax.persistence.Column(name = "TARGET_OPERATION")
  private String targetOperation;

  public void setTargetOperation(java.lang.String targetOperation) {
    this.targetOperation = targetOperation;
  }

  public String getTargetOperation() {
    return targetOperation;
  }

  @OneToMany(mappedBy = "opLinksAssosiation", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Link> links;

  public Collection<Link> getLinks() {
    return links;
  }

  public void setLinks(java.util.Collection<Link> links) {
    this.links = links;
  }

  @OneToOne(mappedBy = "opMany2manyHelperAssosiation", fetch = javax.persistence.FetchType.LAZY)
  private TypePointer many2manyHelper;

  public TypePointer getMany2manyHelper() {
    return many2manyHelper;
  }

  public void setMany2manyHelper(
      org.tura.model.designer.repository.jpa.type.TypePointer many2manyHelper) {
    this.many2manyHelper = many2manyHelper;
  }

  @OneToMany(mappedBy = "assosiationRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<OmRelation> opAssosiationRefOmRelation;

  public Collection<OmRelation> getOpAssosiationRefOmRelation() {
    return opAssosiationRefOmRelation;
  }

  public void setOpAssosiationRefOmRelation(
      java.util.Collection<OmRelation> opAssosiationRefOmRelation) {
    this.opAssosiationRefOmRelation = opAssosiationRefOmRelation;
  }

  @OneToMany(mappedBy = "assosiationRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<RelationMapper> opAssosiationRefRelationMapper;

  public Collection<RelationMapper> getOpAssosiationRefRelationMapper() {
    return opAssosiationRefRelationMapper;
  }

  public void setOpAssosiationRefRelationMapper(
      java.util.Collection<RelationMapper> opAssosiationRefRelationMapper) {
    this.opAssosiationRefRelationMapper = opAssosiationRefRelationMapper;
  }

  @OneToMany(mappedBy = "assosiationRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<InternalRelation> opAssosiationRefInternalRelation;

  public Collection<InternalRelation> getOpAssosiationRefInternalRelation() {
    return opAssosiationRefInternalRelation;
  }

  public void setOpAssosiationRefInternalRelation(
      java.util.Collection<InternalRelation> opAssosiationRefInternalRelation) {
    this.opAssosiationRefInternalRelation = opAssosiationRefInternalRelation;
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

  public Assosiation() {
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.type.Assosiation.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.type.Relationship.class.getName())) {
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
