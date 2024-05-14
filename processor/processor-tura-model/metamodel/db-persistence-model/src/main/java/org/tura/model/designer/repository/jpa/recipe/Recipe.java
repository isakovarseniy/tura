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
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import org.tura.model.designer.repository.jpa.mapper.Mappers;
import org.tura.model.designer.repository.jpa.common.HTMLLayerHolder;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "Recipe")
@javax.persistence.Table(name = "RECIPE")
public class Recipe implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.recipe.Recipe.class;
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

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_RECIPE")
  private int vRecipe;

  public int getVrecipe() {
    return vRecipe;
  }

  public void setVrecipe(int vRecipe) {
    this.vRecipe = vRecipe;
  }

  @OneToMany(mappedBy = "opIngredientsRecipe", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Ingredient> ingredients;

  public Collection<Ingredient> getIngredients() {
    return ingredients;
  }

  public void setIngredients(java.util.Collection<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  @OneToMany(mappedBy = "opDeplymentStepRecipe", fetch = javax.persistence.FetchType.LAZY)
  private Collection<DeploymentComponent> deplymentStep;

  public Collection<DeploymentComponent> getDeplymentStep() {
    return deplymentStep;
  }

  public void setDeplymentStep(java.util.Collection<DeploymentComponent> deplymentStep) {
    this.deplymentStep = deplymentStep;
  }

  @OneToOne(mappedBy = "opStartSeqRecipe", fetch = javax.persistence.FetchType.LAZY)
  private DeploymentStarStep startSeq;

  public DeploymentStarStep getStartSeq() {
    return startSeq;
  }

  public void setStartSeq(
      org.tura.model.designer.repository.jpa.recipe.DeploymentStarStep startSeq) {
    this.startSeq = startSeq;
  }

  @OneToMany(mappedBy = "source", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Recipe2Infrastructure> opSourceRecipe2Infrastructure;

  public Collection<Recipe2Infrastructure> getOpSourceRecipe2Infrastructure() {
    return opSourceRecipe2Infrastructure;
  }

  public void setOpSourceRecipe2Infrastructure(
      java.util.Collection<Recipe2Infrastructure> opSourceRecipe2Infrastructure) {
    this.opSourceRecipe2Infrastructure = opSourceRecipe2Infrastructure;
  }

  @JoinColumns({@JoinColumn(name = "REF_RECIPE_RECIPES", referencedColumnName = "UID")})
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private Recipes opRecipeRecipes;

  public Recipes getOpRecipeRecipes() {
    return opRecipeRecipes;
  }

  public void setOpRecipeRecipes(
      org.tura.model.designer.repository.jpa.recipe.Recipes opRecipeRecipes) {
    this.opRecipeRecipes = opRecipeRecipes;
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

  public Recipe() {
    UsingMappers usingMappers = new UsingMappers();
    this.inhUsingMappers = usingMappers;
    usingMappers.setObject(this);
    HTMLLayerHolder hTMLLayerHolder = new HTMLLayerHolder();
    this.inhHTMLLayerHolder = hTMLLayerHolder;
    hTMLLayerHolder.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.recipe.Recipe.class.getName())) {
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
        .equals(org.tura.model.designer.repository.jpa.metabase.MetaObject.class.getName())) {
      return (T) this.inhMetaObject;
    }
    throw new RepositoryException("Cast exception to  " + clazz.getName());
  }

  public Object getObject() {
    return this;
  }
}
