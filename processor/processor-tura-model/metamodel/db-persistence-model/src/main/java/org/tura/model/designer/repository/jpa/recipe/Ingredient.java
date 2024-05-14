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
import org.tura.model.designer.repository.jpa.mapper.MappingLayer;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.mapper.Mappers;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.common.HTMLLayerHolder;
import org.tura.model.designer.repository.jpa.common.Orderable;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Ingredient")
@javax.persistence.Table(name = "INGREDIENT")
public class Ingredient implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.recipe.Ingredient.class;
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

  @javax.persistence.Column(name = "SKIP")
  private Boolean skip;

  public void setSkip(java.lang.Boolean skip) {
    this.skip = skip;
  }

  public Boolean getSkip() {
    return skip;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_INGREDIENT")
  private int vIngredient;

  public int getVingredient() {
    return vIngredient;
  }

  public void setVingredient(int vIngredient) {
    this.vIngredient = vIngredient;
  }

  @OneToMany(mappedBy = "opComponentsIngredient", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Component> components;

  public Collection<Component> getComponents() {
    return components;
  }

  public void setComponents(java.util.Collection<Component> components) {
    this.components = components;
  }

  @ManyToMany(mappedBy = "opVewLayerIngredient", fetch = javax.persistence.FetchType.LAZY)
  private Collection<MappingLayer> vewLayer;

  public Collection<MappingLayer> getVewLayer() {
    return vewLayer;
  }

  public void setVewLayer(java.util.Collection<MappingLayer> vewLayer) {
    this.vewLayer = vewLayer;
  }

  @ManyToMany(mappedBy = "opModelLayerIngredient", fetch = javax.persistence.FetchType.LAZY)
  private Collection<MappingLayer> modelLayer;

  public Collection<MappingLayer> getModelLayer() {
    return modelLayer;
  }

  public void setModelLayer(java.util.Collection<MappingLayer> modelLayer) {
    this.modelLayer = modelLayer;
  }

  @JoinColumns({@JoinColumn(name = "REF_INGREDIENTS_RECIPE", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Recipe opIngredientsRecipe;

  public Recipe getOpIngredientsRecipe() {
    return opIngredientsRecipe;
  }

  public void setOpIngredientsRecipe(
      org.tura.model.designer.repository.jpa.recipe.Recipe opIngredientsRecipe) {
    this.opIngredientsRecipe = opIngredientsRecipe;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_CONTROLLER_LAYER_INGREDIENT_MAPPING_LAYER",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private MappingLayer controllerLayer;

  public MappingLayer getControllerLayer() {
    return controllerLayer;
  }

  public void setControllerLayer(
      org.tura.model.designer.repository.jpa.mapper.MappingLayer controllerLayer) {
    this.controllerLayer = controllerLayer;
  }

  public void setSuidUsingMappers(java.lang.String suid) {}

  public String getSuidUsingMappers() {
    return this.getInhUsingMappers().getSuid();
  }

  public Collection<Mappers> getMappers() {
    return this.getInhUsingMappers().getMappers();
  }

  public void setMappers(java.util.Collection<Mappers> mappers) {
    this.getInhUsingMappers().setMappers(mappers);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_usingMappers", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private UsingMappers inhUsingMappers;

  public UsingMappers getInhUsingMappers() {
    return inhUsingMappers;
  }

  public void setInhUsingMappers(
      org.tura.model.designer.repository.jpa.recipe.UsingMappers inhUsingMappers) {
    this.inhUsingMappers = inhUsingMappers;
  }

  public void setColumns(java.lang.Integer columns) {
    this.getInhHTMLLayerHolder().setColumns(columns);
  }

  public Integer getColumns() {
    return this.getInhHTMLLayerHolder().getColumns();
  }

  public void setSuidHTMLLayerHolder(java.lang.String suid) {}

  public String getSuidHTMLLayerHolder() {
    return this.getInhHTMLLayerHolder().getSuid();
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_hTMLLayerHolder", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private HTMLLayerHolder inhHTMLLayerHolder;

  public HTMLLayerHolder getInhHTMLLayerHolder() {
    return inhHTMLLayerHolder;
  }

  public void setInhHTMLLayerHolder(
      org.tura.model.designer.repository.jpa.common.HTMLLayerHolder inhHTMLLayerHolder) {
    this.inhHTMLLayerHolder = inhHTMLLayerHolder;
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

  public Ingredient() {
    UsingMappers usingMappers = new UsingMappers();
    this.inhUsingMappers = usingMappers;
    usingMappers.setObject(this);
    HTMLLayerHolder hTMLLayerHolder = new HTMLLayerHolder();
    this.inhHTMLLayerHolder = hTMLLayerHolder;
    hTMLLayerHolder.setObject(this);
    Orderable orderable = new Orderable();
    this.inhOrderable = orderable;
    orderable.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.recipe.Ingredient.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.recipe.UsingMappers.class.getName())) {
      return (T) this.inhUsingMappers;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.common.HTMLLayerHolder.class.getName())) {
      return (T) this.inhHTMLLayerHolder;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.common.Orderable.class.getName())) {
      return (T) this.inhOrderable;
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
