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
import org.tura.platform.object.JpaDomainInterfaceSetter;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import org.tura.model.designer.repository.jpa.artifact.Artifact;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "ArtifactRef")
@javax.persistence.Table(name = "ARTIFACTREF")
public class ArtifactRef implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.recipe.ArtifactRef.class;
  }

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.tura.jpa.id.UUIDGenerator")
  @javax.persistence.Column(name = "SUID")
  private String suid;

  public void setSuid(java.lang.String suid) {
    this.suid = suid;
  }

  public String getSuid() {
    return suid;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_ARTIFACTREF")
  private int vArtifactRef;

  public int getVartifactRef() {
    return vArtifactRef;
  }

  public void setVartifactRef(int vArtifactRef) {
    this.vArtifactRef = vArtifactRef;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_ARTIFACT_REF_ARTIFACT_REF_ARTIFACT", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Artifact artifactRef;

  public Artifact getArtifactRef() {
    return artifactRef;
  }

  public void setArtifactRef(org.tura.model.designer.repository.jpa.artifact.Artifact artifactRef) {
    this.artifactRef = artifactRef;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhArtifactRef", fetch = javax.persistence.FetchType.LAZY)
  private ModelMapper clModelMapper;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clModelMapper != null) {
      return clModelMapper.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.ModelMapper")) {
        clModelMapper = (ModelMapper) obj;
      }
    }
  }
}
