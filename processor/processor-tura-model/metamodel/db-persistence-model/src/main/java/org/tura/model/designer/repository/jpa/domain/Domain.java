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

package org.tura.model.designer.repository.jpa.domain;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import java.util.Collection;
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

@Entity(name = "Domain")
@javax.persistence.Table(name = "DOMAIN")
public class Domain implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.domain.Domain.class;
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

  @javax.persistence.Column(name = "KEY_ID")
  private String keyId;

  public void setKeyId(java.lang.String keyId) {
    this.keyId = keyId;
  }

  public String getKeyId() {
    return keyId;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_DOMAIN")
  private int vDomain;

  public int getVdomain() {
    return vDomain;
  }

  public void setVdomain(int vDomain) {
    this.vDomain = vDomain;
  }

  @OneToOne(mappedBy = "opDomainArtifactsDomain", fetch = javax.persistence.FetchType.LAZY)
  private DomainArtifacts domainArtifacts;

  public DomainArtifacts getDomainArtifacts() {
    return domainArtifacts;
  }

  public void setDomainArtifacts(
      org.tura.model.designer.repository.jpa.domain.DomainArtifacts domainArtifacts) {
    this.domainArtifacts = domainArtifacts;
  }

  @OneToOne(mappedBy = "opDomainTypesDomain", fetch = javax.persistence.FetchType.LAZY)
  private DomainTypes domainTypes;

  public DomainTypes getDomainTypes() {
    return domainTypes;
  }

  public void setDomainTypes(
      org.tura.model.designer.repository.jpa.domain.DomainTypes domainTypes) {
    this.domainTypes = domainTypes;
  }

  @OneToOne(mappedBy = "opDomainApplicationsDomain", fetch = javax.persistence.FetchType.LAZY)
  private DomainApplications domainApplications;

  public DomainApplications getDomainApplications() {
    return domainApplications;
  }

  public void setDomainApplications(
      org.tura.model.designer.repository.jpa.domain.DomainApplications domainApplications) {
    this.domainApplications = domainApplications;
  }

  @OneToOne(mappedBy = "opDomainMappersDomain", fetch = javax.persistence.FetchType.LAZY)
  private DomainMappers domainMappers;

  public DomainMappers getDomainMappers() {
    return domainMappers;
  }

  public void setDomainMappers(
      org.tura.model.designer.repository.jpa.domain.DomainMappers domainMappers) {
    this.domainMappers = domainMappers;
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

  public Domain() {
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.domain.Domain.class.getName())) {
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
