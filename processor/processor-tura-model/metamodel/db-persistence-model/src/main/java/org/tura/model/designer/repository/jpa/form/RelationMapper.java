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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.type.TypeElement;
import org.tura.model.designer.repository.jpa.type.Assosiation;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import java.util.Collection;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "RelationMapper")
@javax.persistence.Table(name = "RELATIONMAPPER")
public class RelationMapper implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.RelationMapper.class;
  }

  @Id
  @javax.persistence.Column(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_RELATIONMAPPER")
  private int vRelationMapper;

  public int getVrelationMapper() {
    return vRelationMapper;
  }

  public void setVrelationMapper(int vRelationMapper) {
    this.vRelationMapper = vRelationMapper;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_RELATION_MAPPERS_DATA_CONTROL", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private DataControl opRelationMappersDataControl;

  public DataControl getOpRelationMappersDataControl() {
    return opRelationMappersDataControl;
  }

  public void setOpRelationMappersDataControl(
      org.tura.model.designer.repository.jpa.form.DataControl opRelationMappersDataControl) {
    this.opRelationMappersDataControl = opRelationMappersDataControl;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_DATA_CONTROL_REF_RELATION_MAPPER_DATA_CONTROL",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private DataControl dataControlRef;

  public DataControl getDataControlRef() {
    return dataControlRef;
  }

  public void setDataControlRef(
      org.tura.model.designer.repository.jpa.form.DataControl dataControlRef) {
    this.dataControlRef = dataControlRef;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_TYPE_REF_RELATION_MAPPER_TYPE_ELEMENT", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private TypeElement typeRef;

  public TypeElement getTypeRef() {
    return typeRef;
  }

  public void setTypeRef(org.tura.model.designer.repository.jpa.type.TypeElement typeRef) {
    this.typeRef = typeRef;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_ASSOSIATION_REF_RELATION_MAPPER_ASSOSIATION",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Assosiation assosiationRef;

  public Assosiation getAssosiationRef() {
    return assosiationRef;
  }

  public void setAssosiationRef(
      org.tura.model.designer.repository.jpa.type.Assosiation assosiationRef) {
    this.assosiationRef = assosiationRef;
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

  public RelationMapper() {
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.RelationMapper.class.getName())) {
      return (T) this;
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
