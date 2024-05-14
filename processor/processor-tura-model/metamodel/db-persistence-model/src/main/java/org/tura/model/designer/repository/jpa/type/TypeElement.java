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
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.model.designer.repository.jpa.objectmapper.OmRelation;
import org.tura.model.designer.repository.jpa.form.RelationMapper;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;

@Entity(name = "TypeElement")
@javax.persistence.Table(name = "TYPEELEMENT")
public class TypeElement implements Serializable, TypeAware {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.type.TypeElement.class;
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

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_TYPEELEMENT")
  private int vTypeElement;

  public int getVtypeElement() {
    return vTypeElement;
  }

  public void setVtypeElement(int vTypeElement) {
    this.vTypeElement = vTypeElement;
  }

  @OneToMany(mappedBy = "source", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Relationship> opSourceRelationship;

  public Collection<Relationship> getOpSourceRelationship() {
    return opSourceRelationship;
  }

  public void setOpSourceRelationship(java.util.Collection<Relationship> opSourceRelationship) {
    this.opSourceRelationship = opSourceRelationship;
  }

  @OneToMany(mappedBy = "target", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Relationship> opTargetRelationship;

  public Collection<Relationship> getOpTargetRelationship() {
    return opTargetRelationship;
  }

  public void setOpTargetRelationship(java.util.Collection<Relationship> opTargetRelationship) {
    this.opTargetRelationship = opTargetRelationship;
  }

  @OneToMany(mappedBy = "typeRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<TypePointer> opTypeRefTypePointer;

  public Collection<TypePointer> getOpTypeRefTypePointer() {
    return opTypeRefTypePointer;
  }

  public void setOpTypeRefTypePointer(java.util.Collection<TypePointer> opTypeRefTypePointer) {
    this.opTypeRefTypePointer = opTypeRefTypePointer;
  }

  @OneToMany(mappedBy = "typeRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<OmRelation> opTypeRefOmRelation;

  public Collection<OmRelation> getOpTypeRefOmRelation() {
    return opTypeRefOmRelation;
  }

  public void setOpTypeRefOmRelation(java.util.Collection<OmRelation> opTypeRefOmRelation) {
    this.opTypeRefOmRelation = opTypeRefOmRelation;
  }

  @OneToMany(mappedBy = "typeRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<RelationMapper> opTypeRefRelationMapper;

  public Collection<RelationMapper> getOpTypeRefRelationMapper() {
    return opTypeRefRelationMapper;
  }

  public void setOpTypeRefRelationMapper(
      java.util.Collection<RelationMapper> opTypeRefRelationMapper) {
    this.opTypeRefRelationMapper = opTypeRefRelationMapper;
  }

  @JoinColumns({@JoinColumn(name = "REF_TYPES_TYPE_GROUP", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private TypeGroup opTypesTypeGroup;

  public TypeGroup getOpTypesTypeGroup() {
    return opTypesTypeGroup;
  }

  public void setOpTypesTypeGroup(
      org.tura.model.designer.repository.jpa.type.TypeGroup opTypesTypeGroup) {
    this.opTypesTypeGroup = opTypesTypeGroup;
  }
}
