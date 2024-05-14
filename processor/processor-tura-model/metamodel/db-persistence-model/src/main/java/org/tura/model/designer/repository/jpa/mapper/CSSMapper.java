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

package org.tura.model.designer.repository.jpa.mapper;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import org.tura.model.designer.repository.jpa.recipe.JavaComponent;
import java.util.Collection;
import org.tura.model.designer.repository.jpa.recipe.JavaScriptComponent;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.style.StyleLibrary;
import org.tura.model.designer.repository.jpa.style.StylePointer;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "CSSMapper")
@javax.persistence.Table(name = "CSSMAPPER")
public class CSSMapper implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.mapper.CSSMapper.class;
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

  @javax.persistence.Column(name = "LIBRARY_URL")
  private String libraryUrl;

  public void setLibraryUrl(java.lang.String libraryUrl) {
    this.libraryUrl = libraryUrl;
  }

  public String getLibraryUrl() {
    return libraryUrl;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_CSSMAPPER")
  private int vCSSMapper;

  public int getVcSSMapper() {
    return vCSSMapper;
  }

  public void setVcSSMapper(int vCSSMapper) {
    this.vCSSMapper = vCSSMapper;
  }

  public void setSuidMapper(java.lang.String suid) {}

  public String getSuidMapper() {
    return this.getInhMapper().getSuid();
  }

  public Collection<JavaComponent> getOpMapperRefJavaComponent() {
    return this.getInhMapper().getOpMapperRefJavaComponent();
  }

  public void setOpMapperRefJavaComponent(
      java.util.Collection<JavaComponent> opMapperRefJavaComponent) {
    this.getInhMapper().setOpMapperRefJavaComponent(opMapperRefJavaComponent);
  }

  public Collection<JavaScriptComponent> getOpMapperRefJavaScriptComponent() {
    return this.getInhMapper().getOpMapperRefJavaScriptComponent();
  }

  public void setOpMapperRefJavaScriptComponent(
      java.util.Collection<JavaScriptComponent> opMapperRefJavaScriptComponent) {
    this.getInhMapper().setOpMapperRefJavaScriptComponent(opMapperRefJavaScriptComponent);
  }

  public Collection<MappingLayer> getLayers() {
    return this.getInhMapper().getLayers();
  }

  public void setLayers(java.util.Collection<MappingLayer> layers) {
    this.getInhMapper().setLayers(layers);
  }

  public Mappers getOpMappersMappers() {
    return this.getInhMapper().getOpMappersMappers();
  }

  public void setOpMappersMappers(
      org.tura.model.designer.repository.jpa.mapper.Mappers opMappersMappers) {
    this.getInhMapper().setOpMappersMappers(opMappersMappers);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_mapper", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private Mapper inhMapper;

  public Mapper getInhMapper() {
    return inhMapper;
  }

  public void setInhMapper(org.tura.model.designer.repository.jpa.mapper.Mapper inhMapper) {
    this.inhMapper = inhMapper;
  }

  public void setSuidStylePointer(java.lang.String suid) {}

  public String getSuidStylePointer() {
    return this.getInhStylePointer().getSuid();
  }

  public StyleLibrary getStyleLibrary() {
    return this.getInhStylePointer().getStyleLibrary();
  }

  public void setStyleLibrary(
      org.tura.model.designer.repository.jpa.style.StyleLibrary styleLibrary) {
    this.getInhStylePointer().setStyleLibrary(styleLibrary);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_stylePointer", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private StylePointer inhStylePointer;

  public StylePointer getInhStylePointer() {
    return inhStylePointer;
  }

  public void setInhStylePointer(
      org.tura.model.designer.repository.jpa.style.StylePointer inhStylePointer) {
    this.inhStylePointer = inhStylePointer;
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

  public CSSMapper() {
    Mapper mapper = new Mapper();
    this.inhMapper = mapper;
    mapper.setObject(this);
    StylePointer stylePointer = new StylePointer();
    this.inhStylePointer = stylePointer;
    stylePointer.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.mapper.CSSMapper.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.mapper.Mapper.class.getName())) {
      return (T) this.inhMapper;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.style.StylePointer.class.getName())) {
      return (T) this.inhStylePointer;
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
