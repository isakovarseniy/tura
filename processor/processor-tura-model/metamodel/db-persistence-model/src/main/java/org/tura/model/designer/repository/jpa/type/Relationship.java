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

package org.tura.model.designer.repository.jpa.type;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import java.util.Collection;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Relationship")
@javax.persistence.Table(name = "RELATIONSHIP")
public class Relationship implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.type.Relationship.class;
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
  @javax.persistence.Column(name = "V_RELATIONSHIP")
  private int vRelationship;

  public int getVrelationship() {
    return vRelationship;
  }

  public void setVrelationship(int vRelationship) {
    this.vRelationship = vRelationship;
  }

  @JoinColumns({@JoinColumn(name = "REF_RELATIONSHIPS_TYPE_GROUP", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private TypeGroup opRelationshipsTypeGroup;

  public TypeGroup getOpRelationshipsTypeGroup() {
    return opRelationshipsTypeGroup;
  }

  public void setOpRelationshipsTypeGroup(
      org.tura.model.designer.repository.jpa.type.TypeGroup opRelationshipsTypeGroup) {
    this.opRelationshipsTypeGroup = opRelationshipsTypeGroup;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_SOURCE_RELATIONSHIP_TYPE_ELEMENT", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private TypeElement source;

  public TypeElement getSource() {
    return source;
  }

  public void setSource(org.tura.model.designer.repository.jpa.type.TypeElement source) {
    this.source = source;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_TARGET_RELATIONSHIP_TYPE_ELEMENT", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private TypeElement target;

  public TypeElement getTarget() {
    return target;
  }

  public void setTarget(org.tura.model.designer.repository.jpa.type.TypeElement target) {
    this.target = target;
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

  public Relationship() {
    Categorized categorized = new Categorized();
    this.inhCategorized = categorized;
    categorized.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.type.Relationship.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.artifact.Categorized.class.getName())) {
      return (T) this.inhCategorized;
    }
    throw new RepositoryException("Cast exception to  " + clazz.getName());
  }

  public Object getObject() {
    return this;
  }
}
