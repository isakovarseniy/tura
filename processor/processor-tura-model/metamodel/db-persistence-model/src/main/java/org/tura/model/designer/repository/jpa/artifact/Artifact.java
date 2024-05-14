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

package org.tura.model.designer.repository.jpa.artifact;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.model.designer.repository.jpa.recipe.ArtifactRef;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Artifact")
@javax.persistence.Table(name = "ARTIFACT")
public class Artifact implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.artifact.Artifact.class;
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

  @javax.persistence.Column(name = "NAME")
  private String name;

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @javax.persistence.Column(name = "DESCRIPTION")
  private String description;

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  @javax.persistence.Column(name = "TEMPLATE")
  private String template;

  public void setTemplate(java.lang.String template) {
    this.template = template;
  }

  public String getTemplate() {
    return template;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_ARTIFACT")
  private int vArtifact;

  public int getVartifact() {
    return vArtifact;
  }

  public void setVartifact(int vArtifact) {
    this.vArtifact = vArtifact;
  }

  @OneToMany(mappedBy = "opConfigVariablesArtifact", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ConfigVariableWithNickName> configVariables;

  public Collection<ConfigVariableWithNickName> getConfigVariables() {
    return configVariables;
  }

  public void setConfigVariables(java.util.Collection<ConfigVariableWithNickName> configVariables) {
    this.configVariables = configVariables;
  }

  @OneToMany(mappedBy = "opConfigHashesArtifact", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ConfigHashWithNickName> configHashes;

  public Collection<ConfigHashWithNickName> getConfigHashes() {
    return configHashes;
  }

  public void setConfigHashes(java.util.Collection<ConfigHashWithNickName> configHashes) {
    this.configHashes = configHashes;
  }

  @OneToMany(mappedBy = "opModelQueryArtifact", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ModelQuery> modelQuery;

  public Collection<ModelQuery> getModelQuery() {
    return modelQuery;
  }

  public void setModelQuery(java.util.Collection<ModelQuery> modelQuery) {
    this.modelQuery = modelQuery;
  }

  @OneToMany(mappedBy = "opTechnologiesArtifact", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Technology> technologies;

  public Collection<Technology> getTechnologies() {
    return technologies;
  }

  public void setTechnologies(java.util.Collection<Technology> technologies) {
    this.technologies = technologies;
  }

  @OneToMany(mappedBy = "opHintsArtifact")
  private Collection<GenerationHintWithNickName> hints;

  public Collection<GenerationHintWithNickName> getHints() {
    return hints;
  }

  public void setHints(java.util.Collection<GenerationHintWithNickName> hints) {
    this.hints = hints;
  }

  @OneToMany(mappedBy = "artifactRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ArtifactRef> opArtifactRefArtifactRef;

  public Collection<ArtifactRef> getOpArtifactRefArtifactRef() {
    return opArtifactRefArtifactRef;
  }

  public void setOpArtifactRefArtifactRef(
      java.util.Collection<ArtifactRef> opArtifactRefArtifactRef) {
    this.opArtifactRefArtifactRef = opArtifactRefArtifactRef;
  }

  @JoinColumns({@JoinColumn(name = "REF_ARTIFACTS_ARTIFACT_GROUP", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private ArtifactGroup opArtifactsArtifactGroup;

  public ArtifactGroup getOpArtifactsArtifactGroup() {
    return opArtifactsArtifactGroup;
  }

  public void setOpArtifactsArtifactGroup(
      org.tura.model.designer.repository.jpa.artifact.ArtifactGroup opArtifactsArtifactGroup) {
    this.opArtifactsArtifactGroup = opArtifactsArtifactGroup;
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

  public Artifact() {
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.artifact.Artifact.class.getName())) {
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
