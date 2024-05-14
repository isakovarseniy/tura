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

package org.tura.model.designer.repository.jpa.recipe;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.artifact.Artifact;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.common.Orderable;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "ModelMapper")
@javax.persistence.Table(name = "MODELMAPPER")
public class ModelMapper implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.recipe.ModelMapper.class;
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

  @javax.persistence.Column(name = "ARTIFACT_ROOT")
  private String artifactRoot;

  public void setArtifactRoot(java.lang.String artifactRoot) {
    this.artifactRoot = artifactRoot;
  }

  public String getArtifactRoot() {
    return artifactRoot;
  }

  @javax.persistence.Column(name = "SKIP")
  private Boolean skip;

  public void setSkip(java.lang.Boolean skip) {
    this.skip = skip;
  }

  public Boolean getSkip() {
    return skip;
  }

  @javax.persistence.Column(name = "ARTIFACT_EXTENSION")
  private String artifactExtension;

  public void setArtifactExtension(java.lang.String artifactExtension) {
    this.artifactExtension = artifactExtension;
  }

  public String getArtifactExtension() {
    return artifactExtension;
  }

  @javax.persistence.Column(name = "CONFIG_BRANCH")
  private String configBranch;

  public void setConfigBranch(java.lang.String configBranch) {
    this.configBranch = configBranch;
  }

  public String getConfigBranch() {
    return configBranch;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_MODELMAPPER")
  private int vModelMapper;

  public int getVmodelMapper() {
    return vModelMapper;
  }

  public void setVmodelMapper(int vModelMapper) {
    this.vModelMapper = vModelMapper;
  }

  @OneToMany(mappedBy = "mapper", fetch = javax.persistence.FetchType.LAZY)
  private Collection<DeploymentComponent> opMapperDeploymentComponent;

  public Collection<DeploymentComponent> getOpMapperDeploymentComponent() {
    return opMapperDeploymentComponent;
  }

  public void setOpMapperDeploymentComponent(
      java.util.Collection<DeploymentComponent> opMapperDeploymentComponent) {
    this.opMapperDeploymentComponent = opMapperDeploymentComponent;
  }

  @OneToMany(mappedBy = "opTechnologiesModelMapper", fetch = javax.persistence.FetchType.LAZY)
  private Collection<MappingTecnologiy> technologies;

  public Collection<MappingTecnologiy> getTechnologies() {
    return technologies;
  }

  public void setTechnologies(java.util.Collection<MappingTecnologiy> technologies) {
    this.technologies = technologies;
  }

  @OneToMany(mappedBy = "opQueriesModelMapper", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Query> queries;

  public Collection<Query> getQueries() {
    return queries;
  }

  public void setQueries(java.util.Collection<Query> queries) {
    this.queries = queries;
  }

  @JoinColumns({@JoinColumn(name = "REF_MAPPERS_COMPONENT", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Component opMappersComponent;

  public Component getOpMappersComponent() {
    return opMappersComponent;
  }

  public void setOpMappersComponent(
      org.tura.model.designer.repository.jpa.recipe.Component opMappersComponent) {
    this.opMappersComponent = opMappersComponent;
  }

  public void setSuidArtifactRef(java.lang.String suid) {}

  public String getSuidArtifactRef() {
    return this.getInhArtifactRef().getSuid();
  }

  public Artifact getArtifactRef() {
    return this.getInhArtifactRef().getArtifactRef();
  }

  public void setArtifactRef(org.tura.model.designer.repository.jpa.artifact.Artifact artifactRef) {
    this.getInhArtifactRef().setArtifactRef(artifactRef);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_artifactRef", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private ArtifactRef inhArtifactRef;

  public ArtifactRef getInhArtifactRef() {
    return inhArtifactRef;
  }

  public void setInhArtifactRef(
      org.tura.model.designer.repository.jpa.recipe.ArtifactRef inhArtifactRef) {
    this.inhArtifactRef = inhArtifactRef;
  }

  public void setOrder(java.lang.Integer order) {
    this.getInhOrderable().setOrder(order);
  }

  public Integer getOrder() {
    return this.getInhOrderable().getOrder();
  }

  public void setSuidOrderable(java.lang.String suid) {}

  public String getSuidOrderable() {
    return this.getInhOrderable().getSuid();
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_orderable", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private Orderable inhOrderable;

  public Orderable getInhOrderable() {
    return inhOrderable;
  }

  public void setInhOrderable(
      org.tura.model.designer.repository.jpa.common.Orderable inhOrderable) {
    this.inhOrderable = inhOrderable;
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

  public ModelMapper() {
    ArtifactRef artifactRef = new ArtifactRef();
    this.inhArtifactRef = artifactRef;
    artifactRef.setObject(this);
    Orderable orderable = new Orderable();
    this.inhOrderable = orderable;
    orderable.setObject(this);
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
        .equals(org.tura.model.designer.repository.jpa.recipe.ModelMapper.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.recipe.ArtifactRef.class.getName())) {
      return (T) this.inhArtifactRef;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.common.Orderable.class.getName())) {
      return (T) this.inhOrderable;
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
