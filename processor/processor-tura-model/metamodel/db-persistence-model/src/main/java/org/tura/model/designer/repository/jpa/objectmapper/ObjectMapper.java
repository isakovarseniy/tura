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

package org.tura.model.designer.repository.jpa.objectmapper;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import org.tura.model.designer.repository.jpa.type.TypePointerObj;
import javax.persistence.OneToOne;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.model.designer.repository.jpa.type.AttributePointer;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "ObjectMapper")
@javax.persistence.Table(name = "OBJECTMAPPER")
public class ObjectMapper implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.objectmapper.ObjectMapper.class;
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

  @javax.persistence.Column(name = "NAME")
  private String name;

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_OBJECTMAPPER")
  private int vObjectMapper;

  public int getVobjectMapper() {
    return vObjectMapper;
  }

  public void setVobjectMapper(int vObjectMapper) {
    this.vObjectMapper = vObjectMapper;
  }

  @OneToOne(mappedBy = "opBaseTypeObjectMapper", fetch = javax.persistence.FetchType.LAZY)
  private TypePointerObj baseType;

  public TypePointerObj getBaseType() {
    return baseType;
  }

  public void setBaseType(org.tura.model.designer.repository.jpa.type.TypePointerObj baseType) {
    this.baseType = baseType;
  }

  @OneToMany(mappedBy = "opRelationsObjectMapper", fetch = javax.persistence.FetchType.LAZY)
  private Collection<OmRelation> relations;

  public Collection<OmRelation> getRelations() {
    return relations;
  }

  public void setRelations(java.util.Collection<OmRelation> relations) {
    this.relations = relations;
  }

  @OneToMany(mappedBy = "opCalculationsObjectMapper", fetch = javax.persistence.FetchType.LAZY)
  private Collection<CalculatedField> calculations;

  public Collection<CalculatedField> getCalculations() {
    return calculations;
  }

  public void setCalculations(java.util.Collection<CalculatedField> calculations) {
    this.calculations = calculations;
  }

  @OneToMany(mappedBy = "opAggrigationsObjectMapper", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Aggregation> aggrigations;

  public Collection<Aggregation> getAggrigations() {
    return aggrigations;
  }

  public void setAggrigations(java.util.Collection<Aggregation> aggrigations) {
    this.aggrigations = aggrigations;
  }

  @OneToMany(mappedBy = "opAttributesObjectMapper", fetch = javax.persistence.FetchType.LAZY)
  private Collection<AttributePointer> attributes;

  public Collection<AttributePointer> getAttributes() {
    return attributes;
  }

  public void setAttributes(java.util.Collection<AttributePointer> attributes) {
    this.attributes = attributes;
  }

  @OneToMany(mappedBy = "objectMapperRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<OmRelation> opObjectMapperRefOmRelation;

  public Collection<OmRelation> getOpObjectMapperRefOmRelation() {
    return opObjectMapperRefOmRelation;
  }

  public void setOpObjectMapperRefOmRelation(
      java.util.Collection<OmRelation> opObjectMapperRefOmRelation) {
    this.opObjectMapperRefOmRelation = opObjectMapperRefOmRelation;
  }

  @OneToMany(mappedBy = "source", fetch = javax.persistence.FetchType.LAZY)
  private Collection<OperationConnector> opSourceOperationConnector;

  public Collection<OperationConnector> getOpSourceOperationConnector() {
    return opSourceOperationConnector;
  }

  public void setOpSourceOperationConnector(
      java.util.Collection<OperationConnector> opSourceOperationConnector) {
    this.opSourceOperationConnector = opSourceOperationConnector;
  }

  @OneToMany(mappedBy = "target", fetch = javax.persistence.FetchType.LAZY)
  private Collection<OperationConnector> opTargetOperationConnector;

  public Collection<OperationConnector> getOpTargetOperationConnector() {
    return opTargetOperationConnector;
  }

  public void setOpTargetOperationConnector(
      java.util.Collection<OperationConnector> opTargetOperationConnector) {
    this.opTargetOperationConnector = opTargetOperationConnector;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OBJECT_MAPPERS_OBJECT_MAPPER_GROUP", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private ObjectMapperGroup opObjectMappersObjectMapperGroup;

  public ObjectMapperGroup getOpObjectMappersObjectMapperGroup() {
    return opObjectMappersObjectMapperGroup;
  }

  public void setOpObjectMappersObjectMapperGroup(
      org.tura.model.designer.repository.jpa.objectmapper.ObjectMapperGroup
          opObjectMappersObjectMapperGroup) {
    this.opObjectMappersObjectMapperGroup = opObjectMappersObjectMapperGroup;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_STAGE_OBJECT_MAPPER_PROCESSING_STAGE", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private ProcessingStage stage;

  public ProcessingStage getStage() {
    return stage;
  }

  public void setStage(org.tura.model.designer.repository.jpa.objectmapper.ProcessingStage stage) {
    this.stage = stage;
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

  public ObjectMapper() {
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
        .equals(org.tura.model.designer.repository.jpa.objectmapper.ObjectMapper.class.getName())) {
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
