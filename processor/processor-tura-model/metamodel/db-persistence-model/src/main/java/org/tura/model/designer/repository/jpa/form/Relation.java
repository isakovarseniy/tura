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

package org.tura.model.designer.repository.jpa.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import org.tura.model.designer.repository.jpa.type.Link;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Relation")
@javax.persistence.Table(name = "RELATION")
public class Relation implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.Relation.class;
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

  @javax.persistence.Column(name = "IS_TREE")
  private Boolean isTree;

  public void setIsTree(java.lang.Boolean isTree) {
    this.isTree = isTree;
  }

  public Boolean getIsTree() {
    return isTree;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_RELATION")
  private int vRelation;

  public int getVrelation() {
    return vRelation;
  }

  public void setVrelation(int vRelation) {
    this.vRelation = vRelation;
  }

  @OneToMany(mappedBy = "opLinksRelation", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Link> links;

  public Collection<Link> getLinks() {
    return links;
  }

  public void setLinks(java.util.Collection<Link> links) {
    this.links = links;
  }

  @JoinColumns({@JoinColumn(name = "REF_RELATIONS_CONTROLS", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Controls opRelationsControls;

  public Controls getOpRelationsControls() {
    return opRelationsControls;
  }

  public void setOpRelationsControls(
      org.tura.model.designer.repository.jpa.form.Controls opRelationsControls) {
    this.opRelationsControls = opRelationsControls;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_MASTER_RELATION_DATA_CONTROL", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private DataControl master;

  public DataControl getMaster() {
    return master;
  }

  public void setMaster(org.tura.model.designer.repository.jpa.form.DataControl master) {
    this.master = master;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_DETAIL_RELATION_DATA_CONTROL", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private DataControl detail;

  public DataControl getDetail() {
    return detail;
  }

  public void setDetail(org.tura.model.designer.repository.jpa.form.DataControl detail) {
    this.detail = detail;
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

  public Relation() {
    Categorized categorized = new Categorized();
    this.inhCategorized = categorized;
    categorized.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.Relation.class.getName())) {
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
