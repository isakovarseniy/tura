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
import org.tura.model.designer.repository.jpa.recipe.Ingredient;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.model.designer.repository.jpa.application.ApplicationMappers;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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

@Entity(name = "MappingLayer")
@javax.persistence.Table(name = "MAPPINGLAYER")
public class MappingLayer implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.mapper.MappingLayer.class;
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

  @javax.persistence.Column(name = "ORDER_")
  private Integer order;

  public void setOrder(java.lang.Integer order) {
    this.order = order;
  }

  public Integer getOrder() {
    return order;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_MAPPINGLAYER")
  private int vMappingLayer;

  public int getVmappingLayer() {
    return vMappingLayer;
  }

  public void setVmappingLayer(int vMappingLayer) {
    this.vMappingLayer = vMappingLayer;
  }

  @OneToMany(mappedBy = "controllerLayer", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Ingredient> opControllerLayerIngredient;

  public Collection<Ingredient> getOpControllerLayerIngredient() {
    return opControllerLayerIngredient;
  }

  public void setOpControllerLayerIngredient(
      java.util.Collection<Ingredient> opControllerLayerIngredient) {
    this.opControllerLayerIngredient = opControllerLayerIngredient;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_APP_LAYERS_APPLICATION_MAPPERS", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private ApplicationMappers opAppLayersApplicationMappers;

  public ApplicationMappers getOpAppLayersApplicationMappers() {
    return opAppLayersApplicationMappers;
  }

  public void setOpAppLayersApplicationMappers(
      org.tura.model.designer.repository.jpa.application.ApplicationMappers
          opAppLayersApplicationMappers) {
    this.opAppLayersApplicationMappers = opAppLayersApplicationMappers;
  }

  @JoinTable(
      name = "RL_VEWLAYER_OPVEWLAYERINGREDIENT",
      joinColumns = {@JoinColumn(name = "vewlayer_uid")},
      inverseJoinColumns = {@JoinColumn(name = "opvewlayeringredient_uid")})
  @ManyToMany(fetch = javax.persistence.FetchType.LAZY)
  private Collection<Ingredient> opVewLayerIngredient;

  public Collection<Ingredient> getOpVewLayerIngredient() {
    return opVewLayerIngredient;
  }

  public void setOpVewLayerIngredient(java.util.Collection<Ingredient> opVewLayerIngredient) {
    this.opVewLayerIngredient = opVewLayerIngredient;
  }

  @JoinTable(
      name = "RL_MODELLAYER_OPMODELLAYERINGREDIENT",
      joinColumns = {@JoinColumn(name = "modellayer_uid")},
      inverseJoinColumns = {@JoinColumn(name = "opmodellayeringredient_uid")})
  @ManyToMany(fetch = javax.persistence.FetchType.LAZY)
  private Collection<Ingredient> opModelLayerIngredient;

  public Collection<Ingredient> getOpModelLayerIngredient() {
    return opModelLayerIngredient;
  }

  public void setOpModelLayerIngredient(java.util.Collection<Ingredient> opModelLayerIngredient) {
    this.opModelLayerIngredient = opModelLayerIngredient;
  }

  @JoinTable(
      name = "RL_LAYERS_OPLAYERSMAPPER",
      joinColumns = {@JoinColumn(name = "layers_suid")},
      inverseJoinColumns = {@JoinColumn(name = "oplayersmapper_uid")})
  @ManyToMany(fetch = javax.persistence.FetchType.LAZY)
  private Collection<Mapper> opLayersMapper;

  public Collection<Mapper> getOpLayersMapper() {
    return opLayersMapper;
  }

  public void setOpLayersMapper(java.util.Collection<Mapper> opLayersMapper) {
    this.opLayersMapper = opLayersMapper;
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

  public MappingLayer() {
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.mapper.MappingLayer.class.getName())) {
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
