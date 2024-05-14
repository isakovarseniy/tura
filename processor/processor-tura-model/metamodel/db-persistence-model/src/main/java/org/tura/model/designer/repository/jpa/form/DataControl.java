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
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.model.designer.repository.jpa.type.TypePointerObj;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import org.tura.model.designer.repository.jpa.artifact.Categorized;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "DataControl")
@javax.persistence.Table(name = "DATACONTROL")
public class DataControl implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.DataControl.class;
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
  @javax.persistence.Column(name = "V_DATACONTROL")
  private int vDataControl;

  public int getVdataControl() {
    return vDataControl;
  }

  public void setVdataControl(int vDataControl) {
    this.vDataControl = vDataControl;
  }

  @OneToMany(mappedBy = "sourcePointer", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ControlPointer> opSourcePointerControlPointer;

  public Collection<ControlPointer> getOpSourcePointerControlPointer() {
    return opSourcePointerControlPointer;
  }

  public void setOpSourcePointerControlPointer(
      java.util.Collection<ControlPointer> opSourcePointerControlPointer) {
    this.opSourcePointerControlPointer = opSourcePointerControlPointer;
  }

  @OneToMany(mappedBy = "sourceCastDataControl", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ControlPointer> opSourceCastDataControlControlPointer;

  public Collection<ControlPointer> getOpSourceCastDataControlControlPointer() {
    return opSourceCastDataControlControlPointer;
  }

  public void setOpSourceCastDataControlControlPointer(
      java.util.Collection<ControlPointer> opSourceCastDataControlControlPointer) {
    this.opSourceCastDataControlControlPointer = opSourceCastDataControlControlPointer;
  }

  @OneToMany(mappedBy = "optionPointer", fetch = javax.persistence.FetchType.LAZY)
  private Collection<OptionSelection> opOptionPointerOptionSelection;

  public Collection<OptionSelection> getOpOptionPointerOptionSelection() {
    return opOptionPointerOptionSelection;
  }

  public void setOpOptionPointerOptionSelection(
      java.util.Collection<OptionSelection> opOptionPointerOptionSelection) {
    this.opOptionPointerOptionSelection = opOptionPointerOptionSelection;
  }

  @OneToMany(mappedBy = "optionCastDataControl", fetch = javax.persistence.FetchType.LAZY)
  private Collection<OptionSelection> opOptionCastDataControlOptionSelection;

  public Collection<OptionSelection> getOpOptionCastDataControlOptionSelection() {
    return opOptionCastDataControlOptionSelection;
  }

  public void setOpOptionCastDataControlOptionSelection(
      java.util.Collection<OptionSelection> opOptionCastDataControlOptionSelection) {
    this.opOptionCastDataControlOptionSelection = opOptionCastDataControlOptionSelection;
  }

  @OneToOne(mappedBy = "opBaseTypeDataControl", fetch = javax.persistence.FetchType.LAZY)
  private TypePointerObj baseType;

  public TypePointerObj getBaseType() {
    return baseType;
  }

  public void setBaseType(org.tura.model.designer.repository.jpa.type.TypePointerObj baseType) {
    this.baseType = baseType;
  }

  @OneToOne(mappedBy = "opPreQueryTriggerDataControl", fetch = javax.persistence.FetchType.LAZY)
  private PREQueryTrigger preQueryTrigger;

  public PREQueryTrigger getPreQueryTrigger() {
    return preQueryTrigger;
  }

  public void setPreQueryTrigger(
      org.tura.model.designer.repository.jpa.form.PREQueryTrigger preQueryTrigger) {
    this.preQueryTrigger = preQueryTrigger;
  }

  @OneToOne(mappedBy = "opPostQueryTriggerDataControl", fetch = javax.persistence.FetchType.LAZY)
  private POSTQueryTrigger postQueryTrigger;

  public POSTQueryTrigger getPostQueryTrigger() {
    return postQueryTrigger;
  }

  public void setPostQueryTrigger(
      org.tura.model.designer.repository.jpa.form.POSTQueryTrigger postQueryTrigger) {
    this.postQueryTrigger = postQueryTrigger;
  }

  @OneToOne(mappedBy = "opPreInsertTriggerDataControl", fetch = javax.persistence.FetchType.LAZY)
  private PREInsertTrigger preInsertTrigger;

  public PREInsertTrigger getPreInsertTrigger() {
    return preInsertTrigger;
  }

  public void setPreInsertTrigger(
      org.tura.model.designer.repository.jpa.form.PREInsertTrigger preInsertTrigger) {
    this.preInsertTrigger = preInsertTrigger;
  }

  @OneToOne(mappedBy = "opPreDeleteTriggerDataControl", fetch = javax.persistence.FetchType.LAZY)
  private PREDeleteTrigger preDeleteTrigger;

  public PREDeleteTrigger getPreDeleteTrigger() {
    return preDeleteTrigger;
  }

  public void setPreDeleteTrigger(
      org.tura.model.designer.repository.jpa.form.PREDeleteTrigger preDeleteTrigger) {
    this.preDeleteTrigger = preDeleteTrigger;
  }

  @OneToOne(mappedBy = "opPostCreateTriggerDataControl", fetch = javax.persistence.FetchType.LAZY)
  private POSTCreateTrigger postCreateTrigger;

  public POSTCreateTrigger getPostCreateTrigger() {
    return postCreateTrigger;
  }

  public void setPostCreateTrigger(
      org.tura.model.designer.repository.jpa.form.POSTCreateTrigger postCreateTrigger) {
    this.postCreateTrigger = postCreateTrigger;
  }

  @OneToOne(mappedBy = "opPreUpdateTriggerDataControl", fetch = javax.persistence.FetchType.LAZY)
  private PREUpdateTrigger preUpdateTrigger;

  public PREUpdateTrigger getPreUpdateTrigger() {
    return preUpdateTrigger;
  }

  public void setPreUpdateTrigger(
      org.tura.model.designer.repository.jpa.form.PREUpdateTrigger preUpdateTrigger) {
    this.preUpdateTrigger = preUpdateTrigger;
  }

  @OneToOne(mappedBy = "opCreateDataControl", fetch = javax.persistence.FetchType.LAZY)
  private CreateTrigger create;

  public CreateTrigger getCreate() {
    return create;
  }

  public void setCreate(org.tura.model.designer.repository.jpa.form.CreateTrigger create) {
    this.create = create;
  }

  @OneToOne(mappedBy = "opSearchDataControl", fetch = javax.persistence.FetchType.LAZY)
  private SearchTrigger search;

  public SearchTrigger getSearch() {
    return search;
  }

  public void setSearch(org.tura.model.designer.repository.jpa.form.SearchTrigger search) {
    this.search = search;
  }

  @OneToMany(mappedBy = "opArtificialFieldsDataControl", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ArtificialField> artificialFields;

  public Collection<ArtificialField> getArtificialFields() {
    return artificialFields;
  }

  public void setArtificialFields(java.util.Collection<ArtificialField> artificialFields) {
    this.artificialFields = artificialFields;
  }

  @OneToOne(mappedBy = "opDefaultSearchDataControl", fetch = javax.persistence.FetchType.LAZY)
  private ContextParametersObj defaultSearch;

  public ContextParametersObj getDefaultSearch() {
    return defaultSearch;
  }

  public void setDefaultSearch(
      org.tura.model.designer.repository.jpa.form.ContextParametersObj defaultSearch) {
    this.defaultSearch = defaultSearch;
  }

  @OneToOne(mappedBy = "opDefaultOrderByDataControl", fetch = javax.persistence.FetchType.LAZY)
  private Orders defaultOrderBy;

  public Orders getDefaultOrderBy() {
    return defaultOrderBy;
  }

  public void setDefaultOrderBy(org.tura.model.designer.repository.jpa.form.Orders defaultOrderBy) {
    this.defaultOrderBy = defaultOrderBy;
  }

  @OneToMany(mappedBy = "opRelationMappersDataControl", fetch = javax.persistence.FetchType.LAZY)
  private Collection<RelationMapper> relationMappers;

  public Collection<RelationMapper> getRelationMappers() {
    return relationMappers;
  }

  public void setRelationMappers(java.util.Collection<RelationMapper> relationMappers) {
    this.relationMappers = relationMappers;
  }

  @OneToMany(mappedBy = "dataControlRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<RelationMapper> opDataControlRefRelationMapper;

  public Collection<RelationMapper> getOpDataControlRefRelationMapper() {
    return opDataControlRefRelationMapper;
  }

  public void setOpDataControlRefRelationMapper(
      java.util.Collection<RelationMapper> opDataControlRefRelationMapper) {
    this.opDataControlRefRelationMapper = opDataControlRefRelationMapper;
  }

  @OneToMany(mappedBy = "master", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Relation> opMasterRelation;

  public Collection<Relation> getOpMasterRelation() {
    return opMasterRelation;
  }

  public void setOpMasterRelation(java.util.Collection<Relation> opMasterRelation) {
    this.opMasterRelation = opMasterRelation;
  }

  @OneToMany(mappedBy = "detail", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Relation> opDetailRelation;

  public Collection<Relation> getOpDetailRelation() {
    return opDetailRelation;
  }

  public void setOpDetailRelation(java.util.Collection<Relation> opDetailRelation) {
    this.opDetailRelation = opDetailRelation;
  }

  @OneToMany(mappedBy = "master", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Dependency> opMasterDependency;

  public Collection<Dependency> getOpMasterDependency() {
    return opMasterDependency;
  }

  public void setOpMasterDependency(java.util.Collection<Dependency> opMasterDependency) {
    this.opMasterDependency = opMasterDependency;
  }

  @OneToMany(mappedBy = "detail", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Dependency> opDetailDependency;

  public Collection<Dependency> getOpDetailDependency() {
    return opDetailDependency;
  }

  public void setOpDetailDependency(java.util.Collection<Dependency> opDetailDependency) {
    this.opDetailDependency = opDetailDependency;
  }

  @JoinColumns({@JoinColumn(name = "REF_CONTROLS_CONTROLS", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Controls opControlsControls;

  public Controls getOpControlsControls() {
    return opControlsControls;
  }

  public void setOpControlsControls(
      org.tura.model.designer.repository.jpa.form.Controls opControlsControls) {
    this.opControlsControls = opControlsControls;
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

  public DataControl() {
    Categorized categorized = new Categorized();
    this.inhCategorized = categorized;
    categorized.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.DataControl.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.artifact.Categorized.class.getName())) {
      return (T) this.inhCategorized;
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
