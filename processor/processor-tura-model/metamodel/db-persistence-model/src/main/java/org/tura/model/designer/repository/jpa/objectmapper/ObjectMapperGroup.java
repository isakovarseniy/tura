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
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.model.designer.repository.jpa.domain.DomainMapper;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "ObjectMapperGroup")
@javax.persistence.Table(name = "OBJECTMAPPERGROUP")
public class ObjectMapperGroup implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.objectmapper.ObjectMapperGroup.class;
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
  @javax.persistence.Column(name = "V_OBJECTMAPPERGROUP")
  private int vObjectMapperGroup;

  public int getVobjectMapperGroup() {
    return vObjectMapperGroup;
  }

  public void setVobjectMapperGroup(int vObjectMapperGroup) {
    this.vObjectMapperGroup = vObjectMapperGroup;
  }

  @OneToMany(
      mappedBy = "opObjectMappersObjectMapperGroup",
      fetch = javax.persistence.FetchType.LAZY)
  private Collection<ObjectMapper> objectMappers;

  public Collection<ObjectMapper> getObjectMappers() {
    return objectMappers;
  }

  public void setObjectMappers(java.util.Collection<ObjectMapper> objectMappers) {
    this.objectMappers = objectMappers;
  }

  @OneToMany(mappedBy = "opStagesObjectMapperGroup", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ProcessingStage> stages;

  public Collection<ProcessingStage> getStages() {
    return stages;
  }

  public void setStages(java.util.Collection<ProcessingStage> stages) {
    this.stages = stages;
  }

  @OneToMany(
      mappedBy = "opAttributesConnectorObjectMapperGroup",
      fetch = javax.persistence.FetchType.LAZY)
  private Collection<AttributeConnector> attributesConnector;

  public Collection<AttributeConnector> getAttributesConnector() {
    return attributesConnector;
  }

  public void setAttributesConnector(java.util.Collection<AttributeConnector> attributesConnector) {
    this.attributesConnector = attributesConnector;
  }

  @OneToMany(
      mappedBy = "opOperationsConnectorObjectMapperGroup",
      fetch = javax.persistence.FetchType.LAZY)
  private Collection<OperationConnector> operationsConnector;

  public Collection<OperationConnector> getOperationsConnector() {
    return operationsConnector;
  }

  public void setOperationsConnector(java.util.Collection<OperationConnector> operationsConnector) {
    this.operationsConnector = operationsConnector;
  }

  @OneToMany(mappedBy = "opVariablesObjectMapperGroup", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Variable> variables;

  public Collection<Variable> getVariables() {
    return variables;
  }

  public void setVariables(java.util.Collection<Variable> variables) {
    this.variables = variables;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OBJECT_MAPPER_PACKAGES_DOMAIN_MAPPER", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private DomainMapper opObjectMapperPackagesDomainMapper;

  public DomainMapper getOpObjectMapperPackagesDomainMapper() {
    return opObjectMapperPackagesDomainMapper;
  }

  public void setOpObjectMapperPackagesDomainMapper(
      org.tura.model.designer.repository.jpa.domain.DomainMapper
          opObjectMapperPackagesDomainMapper) {
    this.opObjectMapperPackagesDomainMapper = opObjectMapperPackagesDomainMapper;
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

  public ObjectMapperGroup() {
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(
            org.tura.model.designer.repository.jpa.objectmapper.ObjectMapperGroup.class
                .getName())) {
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
