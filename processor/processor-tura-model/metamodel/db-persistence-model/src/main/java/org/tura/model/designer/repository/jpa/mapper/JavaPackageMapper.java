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
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.recipe.JavaComponent;
import java.util.Collection;
import org.tura.model.designer.repository.jpa.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.jpa.type.TypeGroup;
import org.tura.model.designer.repository.jpa.type.PackagePointer;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "JavaPackageMapper")
@javax.persistence.Table(name = "JAVAPACKAGEMAPPER")
public class JavaPackageMapper implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.mapper.JavaPackageMapper.class;
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

  @javax.persistence.Column(name = "MAPPED_TO_PACKAGE_NAME")
  private String mappedToPackageName;

  public void setMappedToPackageName(java.lang.String mappedToPackageName) {
    this.mappedToPackageName = mappedToPackageName;
  }

  public String getMappedToPackageName() {
    return mappedToPackageName;
  }

  @javax.persistence.Column(name = "ARTIFACT_ID")
  private String artifactId;

  public void setArtifactId(java.lang.String artifactId) {
    this.artifactId = artifactId;
  }

  public String getArtifactId() {
    return artifactId;
  }

  @javax.persistence.Column(name = "GROUP_ID")
  private String groupId;

  public void setGroupId(java.lang.String groupId) {
    this.groupId = groupId;
  }

  public String getGroupId() {
    return groupId;
  }

  @Enumerated(javax.persistence.EnumType.STRING)
  @javax.persistence.Column(name = "SCOPE")
  private JavaLibScope scope;

  public void setScope(org.tura.model.designer.repository.jpa.mapper.JavaLibScope scope) {
    this.scope = scope;
  }

  public JavaLibScope getScope() {
    return scope;
  }

  @javax.persistence.Column(name = "LIBRARY_NAME")
  private String libraryName;

  public void setLibraryName(java.lang.String libraryName) {
    this.libraryName = libraryName;
  }

  public String getLibraryName() {
    return libraryName;
  }

  @Enumerated(javax.persistence.EnumType.STRING)
  @javax.persistence.Column(name = "ARTIFACT_TYPE")
  private ArtifactType artifactType;

  public void setArtifactType(
      org.tura.model.designer.repository.jpa.mapper.ArtifactType artifactType) {
    this.artifactType = artifactType;
  }

  public ArtifactType getArtifactType() {
    return artifactType;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_JAVAPACKAGEMAPPER")
  private int vJavaPackageMapper;

  public int getVjavaPackageMapper() {
    return vJavaPackageMapper;
  }

  public void setVjavaPackageMapper(int vJavaPackageMapper) {
    this.vJavaPackageMapper = vJavaPackageMapper;
  }

  public void setSuidPackageMapper(java.lang.String suid) {}

  public String getSuidPackageMapper() {
    return this.getInhPackageMapper().getSuid();
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_packageMapper", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private PackageMapper inhPackageMapper;

  public PackageMapper getInhPackageMapper() {
    return inhPackageMapper;
  }

  public void setInhPackageMapper(
      org.tura.model.designer.repository.jpa.mapper.PackageMapper inhPackageMapper) {
    this.inhPackageMapper = inhPackageMapper;
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

  public void setSuidPackagePointer(java.lang.String suid) {}

  public String getSuidPackagePointer() {
    return this.getInhPackagePointer().getSuid();
  }

  public TypeGroup getPackageRef() {
    return this.getInhPackagePointer().getPackageRef();
  }

  public void setPackageRef(org.tura.model.designer.repository.jpa.type.TypeGroup packageRef) {
    this.getInhPackagePointer().setPackageRef(packageRef);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_packagePointer", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private PackagePointer inhPackagePointer;

  public PackagePointer getInhPackagePointer() {
    return inhPackagePointer;
  }

  public void setInhPackagePointer(
      org.tura.model.designer.repository.jpa.type.PackagePointer inhPackagePointer) {
    this.inhPackagePointer = inhPackagePointer;
  }

  public void setSuidVersionRef(java.lang.String suid) {}

  public String getSuidVersionRef() {
    return this.getInhVersionRef().getSuid();
  }

  public Version getVersionRef() {
    return this.getInhVersionRef().getVersionRef();
  }

  public void setVersionRef(org.tura.model.designer.repository.jpa.mapper.Version versionRef) {
    this.getInhVersionRef().setVersionRef(versionRef);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_versionRef", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private VersionRef inhVersionRef;

  public VersionRef getInhVersionRef() {
    return inhVersionRef;
  }

  public void setInhVersionRef(
      org.tura.model.designer.repository.jpa.mapper.VersionRef inhVersionRef) {
    this.inhVersionRef = inhVersionRef;
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

  public JavaPackageMapper() {
    PackageMapper packageMapper = new PackageMapper();
    this.inhPackageMapper = packageMapper;
    packageMapper.setObject(this);
    Mapper mapper = new Mapper();
    this.inhMapper = mapper;
    mapper.setObject(this);
    PackagePointer packagePointer = new PackagePointer();
    this.inhPackagePointer = packagePointer;
    packagePointer.setObject(this);
    VersionRef versionRef = new VersionRef();
    this.inhVersionRef = versionRef;
    versionRef.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.mapper.JavaPackageMapper.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.mapper.PackageMapper.class.getName())) {
      return (T) this.inhPackageMapper;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.mapper.Mapper.class.getName())) {
      return (T) this.inhMapper;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.type.PackagePointer.class.getName())) {
      return (T) this.inhPackagePointer;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.mapper.VersionRef.class.getName())) {
      return (T) this.inhVersionRef;
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
