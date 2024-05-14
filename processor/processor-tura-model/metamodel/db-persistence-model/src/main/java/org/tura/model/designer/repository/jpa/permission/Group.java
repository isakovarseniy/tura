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

package org.tura.model.designer.repository.jpa.permission;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Group")
@javax.persistence.Table(name = "GROUP_")
public class Group implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.permission.Group.class;
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

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_GROUP")
  private int vGroup;

  public int getVgroup() {
    return vGroup;
  }

  public void setVgroup(int vGroup) {
    this.vGroup = vGroup;
  }

  @OneToMany(mappedBy = "source", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Group2Group> opSourceGroup2Group;

  public Collection<Group2Group> getOpSourceGroup2Group() {
    return opSourceGroup2Group;
  }

  public void setOpSourceGroup2Group(java.util.Collection<Group2Group> opSourceGroup2Group) {
    this.opSourceGroup2Group = opSourceGroup2Group;
  }

  @OneToMany(mappedBy = "target", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Group2Group> opTargetGroup2Group;

  public Collection<Group2Group> getOpTargetGroup2Group() {
    return opTargetGroup2Group;
  }

  public void setOpTargetGroup2Group(java.util.Collection<Group2Group> opTargetGroup2Group) {
    this.opTargetGroup2Group = opTargetGroup2Group;
  }

  @OneToMany(mappedBy = "source", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Group2Role> opSourceGroup2Role;

  public Collection<Group2Role> getOpSourceGroup2Role() {
    return opSourceGroup2Role;
  }

  public void setOpSourceGroup2Role(java.util.Collection<Group2Role> opSourceGroup2Role) {
    this.opSourceGroup2Role = opSourceGroup2Role;
  }

  @JoinColumns({@JoinColumn(name = "REF_GROUPS_ROLES", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Roles opGroupsRoles;

  public Roles getOpGroupsRoles() {
    return opGroupsRoles;
  }

  public void setOpGroupsRoles(
      org.tura.model.designer.repository.jpa.permission.Roles opGroupsRoles) {
    this.opGroupsRoles = opGroupsRoles;
  }

  public void setName(java.lang.String name) {
    this.getInhSecurityEntity().setName(name);
  }

  public String getName() {
    return this.getInhSecurityEntity().getName();
  }

  public void setSuidSecurityEntity(java.lang.String suid) {}

  public String getSuidSecurityEntity() {
    return this.getInhSecurityEntity().getSuid();
  }

  public Collection<SecurityEntityPointer> getOpSecurityEntitySecurityEntityPointer() {
    return this.getInhSecurityEntity().getOpSecurityEntitySecurityEntityPointer();
  }

  public void setOpSecurityEntitySecurityEntityPointer(
      java.util.Collection<SecurityEntityPointer> opSecurityEntitySecurityEntityPointer) {
    this.getInhSecurityEntity()
        .setOpSecurityEntitySecurityEntityPointer(opSecurityEntitySecurityEntityPointer);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_securityEntity", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private SecurityEntity inhSecurityEntity;

  public SecurityEntity getInhSecurityEntity() {
    return inhSecurityEntity;
  }

  public void setInhSecurityEntity(
      org.tura.model.designer.repository.jpa.permission.SecurityEntity inhSecurityEntity) {
    this.inhSecurityEntity = inhSecurityEntity;
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

  public Group() {
    SecurityEntity securityEntity = new SecurityEntity();
    this.inhSecurityEntity = securityEntity;
    securityEntity.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.permission.Group.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.permission.SecurityEntity.class.getName())) {
      return (T) this.inhSecurityEntity;
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
