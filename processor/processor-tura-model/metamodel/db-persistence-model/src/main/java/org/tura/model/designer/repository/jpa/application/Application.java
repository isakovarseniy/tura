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

package org.tura.model.designer.repository.jpa.application;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import java.util.Collection;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Application")
@javax.persistence.Table(name = "APPLICATION")
public class Application implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.application.Application.class;
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
  @javax.persistence.Column(name = "V_APPLICATION")
  private int vApplication;

  public int getVapplication() {
    return vApplication;
  }

  public void setVapplication(int vApplication) {
    this.vApplication = vApplication;
  }

  @OneToOne(mappedBy = "opApplicationRecipesApplication", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationRecipes applicationRecipes;

  public ApplicationRecipes getApplicationRecipes() {
    return applicationRecipes;
  }

  public void setApplicationRecipes(
      org.tura.model.designer.repository.jpa.application.ApplicationRecipes applicationRecipes) {
    this.applicationRecipes = applicationRecipes;
  }

  @OneToOne(mappedBy = "opApplicationMappersApplication", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationMappers applicationMappers;

  public ApplicationMappers getApplicationMappers() {
    return applicationMappers;
  }

  public void setApplicationMappers(
      org.tura.model.designer.repository.jpa.application.ApplicationMappers applicationMappers) {
    this.applicationMappers = applicationMappers;
  }

  @OneToOne(mappedBy = "opApplicationUILayerApplication", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationUILayer applicationUILayer;

  public ApplicationUILayer getApplicationUILayer() {
    return applicationUILayer;
  }

  public void setApplicationUILayer(
      org.tura.model.designer.repository.jpa.application.ApplicationUILayer applicationUILayer) {
    this.applicationUILayer = applicationUILayer;
  }

  @OneToOne(
      mappedBy = "opApplicationInfrastructureLayerApplication",
      fetch = javax.persistence.FetchType.LAZY)
  private ApplicationInfrastructureLayers applicationInfrastructureLayer;

  public ApplicationInfrastructureLayers getApplicationInfrastructureLayer() {
    return applicationInfrastructureLayer;
  }

  public void setApplicationInfrastructureLayer(
      org.tura.model.designer.repository.jpa.application.ApplicationInfrastructureLayers
          applicationInfrastructureLayer) {
    this.applicationInfrastructureLayer = applicationInfrastructureLayer;
  }

  @OneToOne(mappedBy = "opApplicationStyleApplication", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationStyleLibraries applicationStyle;

  public ApplicationStyleLibraries getApplicationStyle() {
    return applicationStyle;
  }

  public void setApplicationStyle(
      org.tura.model.designer.repository.jpa.application.ApplicationStyleLibraries
          applicationStyle) {
    this.applicationStyle = applicationStyle;
  }

  @OneToOne(mappedBy = "opApplicationRoleApplication", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationRealms applicationRole;

  public ApplicationRealms getApplicationRole() {
    return applicationRole;
  }

  public void setApplicationRole(
      org.tura.model.designer.repository.jpa.application.ApplicationRealms applicationRole) {
    this.applicationRole = applicationRole;
  }

  @OneToOne(mappedBy = "opApplicationMessagesApplication", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationMessageLibraries applicationMessages;

  public ApplicationMessageLibraries getApplicationMessages() {
    return applicationMessages;
  }

  public void setApplicationMessages(
      org.tura.model.designer.repository.jpa.application.ApplicationMessageLibraries
          applicationMessages) {
    this.applicationMessages = applicationMessages;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_APPLICATIONS_APPLICATION_GROUP", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private ApplicationGroup opApplicationsApplicationGroup;

  public ApplicationGroup getOpApplicationsApplicationGroup() {
    return opApplicationsApplicationGroup;
  }

  public void setOpApplicationsApplicationGroup(
      org.tura.model.designer.repository.jpa.application.ApplicationGroup
          opApplicationsApplicationGroup) {
    this.opApplicationsApplicationGroup = opApplicationsApplicationGroup;
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

  public Application() {
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.application.Application.class.getName())) {
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
