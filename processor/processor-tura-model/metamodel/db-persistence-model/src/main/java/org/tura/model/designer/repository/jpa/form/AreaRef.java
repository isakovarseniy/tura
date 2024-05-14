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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import java.util.Collection;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "AreaRef")
@javax.persistence.Table(name = "AREAREF")
public class AreaRef implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.AreaRef.class;
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

  @javax.persistence.Column(name = "GROUP_")
  private Integer group;

  public void setGroup(java.lang.Integer group) {
    this.group = group;
  }

  public Integer getGroup() {
    return group;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_AREAREF")
  private int vAreaRef;

  public int getVareaRef() {
    return vAreaRef;
  }

  public void setVareaRef(int vAreaRef) {
    this.vAreaRef = vAreaRef;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_SOURCE_TARGET_OVERLAY_CANVAS", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private OverlayCanvas opSourceTargetOverlayCanvas;

  public OverlayCanvas getOpSourceTargetOverlayCanvas() {
    return opSourceTargetOverlayCanvas;
  }

  public void setOpSourceTargetOverlayCanvas(
      org.tura.model.designer.repository.jpa.form.OverlayCanvas opSourceTargetOverlayCanvas) {
    this.opSourceTargetOverlayCanvas = opSourceTargetOverlayCanvas;
  }

  @JoinColumns({@JoinColumn(name = "REF_REFRESH_AREAS_UIELEMENT", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Uielement opRefreshAreasUielement;

  public Uielement getOpRefreshAreasUielement() {
    return opRefreshAreasUielement;
  }

  public void setOpRefreshAreasUielement(
      org.tura.model.designer.repository.jpa.form.Uielement opRefreshAreasUielement) {
    this.opRefreshAreasUielement = opRefreshAreasUielement;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_AREA_AREA_REF_NICK_NAMED", referencedColumnName = "SUID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private NickNamed area;

  public NickNamed getArea() {
    return area;
  }

  public void setArea(org.tura.model.designer.repository.jpa.form.NickNamed area) {
    this.area = area;
  }

  @JoinColumns({@JoinColumn(name = "REF_BLOCK_BLOCKABLE", referencedColumnName = "SUID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Blockable opBlockBlockable;

  public Blockable getOpBlockBlockable() {
    return opBlockBlockable;
  }

  public void setOpBlockBlockable(
      org.tura.model.designer.repository.jpa.form.Blockable opBlockBlockable) {
    this.opBlockBlockable = opBlockBlockable;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_SOURCE_TARGET_DATA_EXPORTER", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private DataExporter opSourceTargetDataExporter;

  public DataExporter getOpSourceTargetDataExporter() {
    return opSourceTargetDataExporter;
  }

  public void setOpSourceTargetDataExporter(
      org.tura.model.designer.repository.jpa.form.DataExporter opSourceTargetDataExporter) {
    this.opSourceTargetDataExporter = opSourceTargetDataExporter;
  }

  @JoinColumns({@JoinColumn(name = "REF_REFRESH_AREAS_MENU_ITEM", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private MenuItem opRefreshAreasMenuItem;

  public MenuItem getOpRefreshAreasMenuItem() {
    return opRefreshAreasMenuItem;
  }

  public void setOpRefreshAreasMenuItem(
      org.tura.model.designer.repository.jpa.form.MenuItem opRefreshAreasMenuItem) {
    this.opRefreshAreasMenuItem = opRefreshAreasMenuItem;
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

  public AreaRef() {
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.AreaRef.class.getName())) {
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
