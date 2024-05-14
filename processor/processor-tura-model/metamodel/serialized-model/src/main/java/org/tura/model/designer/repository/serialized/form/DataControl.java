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

package org.tura.model.designer.repository.serialized.form;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.model.designer.repository.serialized.type.TypePointerObj;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
public class DataControl implements Serializable, Categorized, MetaObject {

  private static final long serialVersionUID = 1L;

  private Boolean attached;

  public Boolean getAttached() {
    return attached;
  }

  public void setAttached(Boolean value) {
    this.attached = value;
  }

  private String serializationid;

  public String getSerializationid() {
    return serializationid;
  }

  public void setSerializationid(String value) {
    this.serializationid = value;
  }

  private String cpaid;

  public String getCpaid() {
    return cpaid;
  }

  public void setCpaid(String value) {
    this.cpaid = value;
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private String transientrefControlsControls;

  public String getTransientrefControlsControls() {
    return transientrefControlsControls;
  }

  public void setTransientrefControlsControls(java.lang.String transientrefControlsControls) {
    this.transientrefControlsControls = transientrefControlsControls;
  }

  private List<ControlPointer> opSourcePointerControlPointer = new ArrayList<>();

  @Association(
      id = "4602eb8d-c89b-4a6c-97ca-541586b81ddf",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ControlPointer.class,
      property = "sourcePointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ControlPointer> getOpSourcePointerControlPointer() {
    return opSourcePointerControlPointer;
  }

  public void setOpSourcePointerControlPointer(
      java.util.List<ControlPointer> opSourcePointerControlPointer) {
    this.opSourcePointerControlPointer = opSourcePointerControlPointer;
  }

  private List<ControlPointer> opSourceCastDataControlControlPointer = new ArrayList<>();

  @Association(
      id = "b77b09c0-4bb1-4eca-861d-7260caaa15f0",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ControlPointer.class,
      property = "sourceCastDataControl",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ControlPointer> getOpSourceCastDataControlControlPointer() {
    return opSourceCastDataControlControlPointer;
  }

  public void setOpSourceCastDataControlControlPointer(
      java.util.List<ControlPointer> opSourceCastDataControlControlPointer) {
    this.opSourceCastDataControlControlPointer = opSourceCastDataControlControlPointer;
  }

  private List<OptionSelection> opOptionPointerOptionSelection = new ArrayList<>();

  @Association(
      id = "88c25fc0-9bae-44fe-bf42-e0862b711394",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.OptionSelection.class,
      property = "optionPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<OptionSelection> getOpOptionPointerOptionSelection() {
    return opOptionPointerOptionSelection;
  }

  public void setOpOptionPointerOptionSelection(
      java.util.List<OptionSelection> opOptionPointerOptionSelection) {
    this.opOptionPointerOptionSelection = opOptionPointerOptionSelection;
  }

  private List<OptionSelection> opOptionCastDataControlOptionSelection = new ArrayList<>();

  @Association(
      id = "fb051eb2-71e5-4252-9e35-b93c2376e263",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.OptionSelection.class,
      property = "optionCastDataControl",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<OptionSelection> getOpOptionCastDataControlOptionSelection() {
    return opOptionCastDataControlOptionSelection;
  }

  public void setOpOptionCastDataControlOptionSelection(
      java.util.List<OptionSelection> opOptionCastDataControlOptionSelection) {
    this.opOptionCastDataControlOptionSelection = opOptionCastDataControlOptionSelection;
  }

  private TypePointerObj baseType;

  @Association(
      id = "e85eb79e-92a9-4091-b176-bbc668aec8dd",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypePointerObj.class,
      property = "opBaseTypeDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public TypePointerObj getBaseType() {
    return baseType;
  }

  public void setBaseType(
      org.tura.model.designer.repository.serialized.type.TypePointerObj baseType) {
    this.baseType = baseType;
  }

  private PREQueryTrigger preQueryTrigger;

  @Association(
      id = "f34a8aeb-6ad2-4f67-83fa-77f9aab0568a",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.PREQueryTrigger.class,
      property = "opPreQueryTriggerDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public PREQueryTrigger getPreQueryTrigger() {
    return preQueryTrigger;
  }

  public void setPreQueryTrigger(
      org.tura.model.designer.repository.serialized.form.PREQueryTrigger preQueryTrigger) {
    this.preQueryTrigger = preQueryTrigger;
  }

  private POSTQueryTrigger postQueryTrigger;

  @Association(
      id = "92a22823-dcb9-4e14-9fa5-94130554434d",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.POSTQueryTrigger.class,
      property = "opPostQueryTriggerDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public POSTQueryTrigger getPostQueryTrigger() {
    return postQueryTrigger;
  }

  public void setPostQueryTrigger(
      org.tura.model.designer.repository.serialized.form.POSTQueryTrigger postQueryTrigger) {
    this.postQueryTrigger = postQueryTrigger;
  }

  private PREInsertTrigger preInsertTrigger;

  @Association(
      id = "b8ed35ca-93d3-4346-8046-96f635ebfc3c",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.PREInsertTrigger.class,
      property = "opPreInsertTriggerDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public PREInsertTrigger getPreInsertTrigger() {
    return preInsertTrigger;
  }

  public void setPreInsertTrigger(
      org.tura.model.designer.repository.serialized.form.PREInsertTrigger preInsertTrigger) {
    this.preInsertTrigger = preInsertTrigger;
  }

  private PREDeleteTrigger preDeleteTrigger;

  @Association(
      id = "8b41511f-3479-49e0-a224-0957363a8210",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.PREDeleteTrigger.class,
      property = "opPreDeleteTriggerDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public PREDeleteTrigger getPreDeleteTrigger() {
    return preDeleteTrigger;
  }

  public void setPreDeleteTrigger(
      org.tura.model.designer.repository.serialized.form.PREDeleteTrigger preDeleteTrigger) {
    this.preDeleteTrigger = preDeleteTrigger;
  }

  private POSTCreateTrigger postCreateTrigger;

  @Association(
      id = "09fb397d-1372-4c5a-b71f-089cfcc07fb2",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.POSTCreateTrigger.class,
      property = "opPostCreateTriggerDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public POSTCreateTrigger getPostCreateTrigger() {
    return postCreateTrigger;
  }

  public void setPostCreateTrigger(
      org.tura.model.designer.repository.serialized.form.POSTCreateTrigger postCreateTrigger) {
    this.postCreateTrigger = postCreateTrigger;
  }

  private PREUpdateTrigger preUpdateTrigger;

  @Association(
      id = "b2fa10a6-cbc3-445e-b61d-c2903055f1a1",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.PREUpdateTrigger.class,
      property = "opPreUpdateTriggerDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public PREUpdateTrigger getPreUpdateTrigger() {
    return preUpdateTrigger;
  }

  public void setPreUpdateTrigger(
      org.tura.model.designer.repository.serialized.form.PREUpdateTrigger preUpdateTrigger) {
    this.preUpdateTrigger = preUpdateTrigger;
  }

  private CreateTrigger create;

  @Association(
      id = "ca65e1b6-c18f-4424-9120-cfdbf225644e",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.CreateTrigger.class,
      property = "opCreateDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public CreateTrigger getCreate() {
    return create;
  }

  public void setCreate(org.tura.model.designer.repository.serialized.form.CreateTrigger create) {
    this.create = create;
  }

  private SearchTrigger search;

  @Association(
      id = "188a51c6-1310-42d2-a09b-d25a5e3364aa",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.SearchTrigger.class,
      property = "opSearchDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public SearchTrigger getSearch() {
    return search;
  }

  public void setSearch(org.tura.model.designer.repository.serialized.form.SearchTrigger search) {
    this.search = search;
  }

  private List<ArtificialField> artificialFields = new ArrayList<>();

  @Association(
      id = "a585d946-8d9d-4596-ad86-a55e6834809f",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ArtificialField.class,
      property = "opArtificialFieldsDataControl",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ArtificialField> getArtificialFields() {
    return artificialFields;
  }

  public void setArtificialFields(java.util.List<ArtificialField> artificialFields) {
    this.artificialFields = artificialFields;
  }

  private ContextParametersObj defaultSearch;

  @Association(
      id = "72df119b-33cc-401d-9d82-9ce7410e804a",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ContextParametersObj.class,
      property = "opDefaultSearchDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public ContextParametersObj getDefaultSearch() {
    return defaultSearch;
  }

  public void setDefaultSearch(
      org.tura.model.designer.repository.serialized.form.ContextParametersObj defaultSearch) {
    this.defaultSearch = defaultSearch;
  }

  private Orders defaultOrderBy;

  @Association(
      id = "c9035c7b-d53a-4bf5-aaa8-149dd5a44f26",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Orders.class,
      property = "opDefaultOrderByDataControl",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public Orders getDefaultOrderBy() {
    return defaultOrderBy;
  }

  public void setDefaultOrderBy(
      org.tura.model.designer.repository.serialized.form.Orders defaultOrderBy) {
    this.defaultOrderBy = defaultOrderBy;
  }

  private List<RelationMapper> relationMappers = new ArrayList<>();

  @Association(
      id = "9bca65be-1a74-4522-a0dd-92615c29641c",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.RelationMapper.class,
      property = "opRelationMappersDataControl",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<RelationMapper> getRelationMappers() {
    return relationMappers;
  }

  public void setRelationMappers(java.util.List<RelationMapper> relationMappers) {
    this.relationMappers = relationMappers;
  }

  private List<RelationMapper> opDataControlRefRelationMapper = new ArrayList<>();

  @Association(
      id = "77bcd4b3-dff5-4943-b99e-f1d20e238cef",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.RelationMapper.class,
      property = "dataControlRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<RelationMapper> getOpDataControlRefRelationMapper() {
    return opDataControlRefRelationMapper;
  }

  public void setOpDataControlRefRelationMapper(
      java.util.List<RelationMapper> opDataControlRefRelationMapper) {
    this.opDataControlRefRelationMapper = opDataControlRefRelationMapper;
  }

  private List<Relation> opMasterRelation = new ArrayList<>();

  @Association(
      id = "ed91a404-8bac-467d-9622-8e01f9db69ec",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Relation.class,
      property = "master",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Relation> getOpMasterRelation() {
    return opMasterRelation;
  }

  public void setOpMasterRelation(java.util.List<Relation> opMasterRelation) {
    this.opMasterRelation = opMasterRelation;
  }

  private List<Relation> opDetailRelation = new ArrayList<>();

  @Association(
      id = "59c1f6f5-21c9-446a-8ae4-697258994ac7",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Relation.class,
      property = "detail",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Relation> getOpDetailRelation() {
    return opDetailRelation;
  }

  public void setOpDetailRelation(java.util.List<Relation> opDetailRelation) {
    this.opDetailRelation = opDetailRelation;
  }

  private List<Dependency> opMasterDependency = new ArrayList<>();

  @Association(
      id = "2cd598f1-558b-4b7b-b788-740a9bf0f535",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Dependency.class,
      property = "master",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Dependency> getOpMasterDependency() {
    return opMasterDependency;
  }

  public void setOpMasterDependency(java.util.List<Dependency> opMasterDependency) {
    this.opMasterDependency = opMasterDependency;
  }

  private List<Dependency> opDetailDependency = new ArrayList<>();

  @Association(
      id = "414b0765-baca-452b-aab2-5d9130131fa8",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Dependency.class,
      property = "detail",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Dependency> getOpDetailDependency() {
    return opDetailDependency;
  }

  public void setOpDetailDependency(java.util.List<Dependency> opDetailDependency) {
    this.opDetailDependency = opDetailDependency;
  }

  private Controls opControlsControls;

  @Association(
      id = "8103ac78-57d6-4e46-8c92-f090645130e7",
      from = org.tura.model.designer.repository.serialized.form.DataControl.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Controls.class,
      property = "controls",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  public Controls getOpControlsControls() {
    return opControlsControls;
  }

  public void setOpControlsControls(
      org.tura.model.designer.repository.serialized.form.Controls opControlsControls) {
    this.opControlsControls = opControlsControls;
  }

  private String suidCategorized;

  public String getSuidCategorized() {
    return suidCategorized;
  }

  public void setSuidCategorized(java.lang.String suidCategorized) {
    this.suidCategorized = suidCategorized;
  }

  private List<Classifier> classifiers = new ArrayList<>();

  @Association(
      id = "1bb1f934-5eba-4f36-932f-0f3c7ef54731",
      from = org.tura.model.designer.repository.serialized.artifact.Categorized.class,
      mappedBy = org.tura.model.designer.repository.serialized.artifact.Classifier.class,
      property = "opClassifiersCategorized",
      containment = true,
      type = "One2Many",
      lazy = false,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Classifier> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(java.util.List<Classifier> classifiers) {
    this.classifiers = classifiers;
  }

  private String suidMetaObject;

  public String getSuidMetaObject() {
    return suidMetaObject;
  }

  public void setSuidMetaObject(java.lang.String suidMetaObject) {
    this.suidMetaObject = suidMetaObject;
  }

  private List<AttributeConnector> opSourceAttributeConnector = new ArrayList<>();

  @Association(
      id = "ee8133a7-72b3-48b1-9807-e554f5a27019",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
      property = "source",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<AttributeConnector> getOpSourceAttributeConnector() {
    return opSourceAttributeConnector;
  }

  public void setOpSourceAttributeConnector(
      java.util.List<AttributeConnector> opSourceAttributeConnector) {
    this.opSourceAttributeConnector = opSourceAttributeConnector;
  }

  private List<AttributeConnector> opTargetAttributeConnector = new ArrayList<>();

  @Association(
      id = "1b246eaf-a5bc-4e1a-960f-6fcc29adf71a",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy =
          org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector.class,
      property = "target",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<AttributeConnector> getOpTargetAttributeConnector() {
    return opTargetAttributeConnector;
  }

  public void setOpTargetAttributeConnector(
      java.util.List<AttributeConnector> opTargetAttributeConnector) {
    this.opTargetAttributeConnector = opTargetAttributeConnector;
  }

  private List<ContextParameter> opRefObjContextParameter = new ArrayList<>();

  @Association(
      id = "ef46af04-c245-46b5-9b3b-24f475002cd1",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ContextParameter.class,
      property = "refObj",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ContextParameter> getOpRefObjContextParameter() {
    return opRefObjContextParameter;
  }

  public void setOpRefObjContextParameter(
      java.util.List<ContextParameter> opRefObjContextParameter) {
    this.opRefObjContextParameter = opRefObjContextParameter;
  }

  private List<ExpressionPart> opObjRefExpressionPart = new ArrayList<>();

  @Association(
      id = "c7db89bb-57ce-41f4-915f-31af456f91e6",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ExpressionPart.class,
      property = "objRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ExpressionPart> getOpObjRefExpressionPart() {
    return opObjRefExpressionPart;
  }

  public void setOpObjRefExpressionPart(java.util.List<ExpressionPart> opObjRefExpressionPart) {
    this.opObjRefExpressionPart = opObjRefExpressionPart;
  }

  private List<ControlPointer> opValuePointerControlPointer = new ArrayList<>();

  @Association(
      id = "f7c17e78-ca29-4283-8b59-58a4b320d35a",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ControlPointer.class,
      property = "valuePointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<ControlPointer> getOpValuePointerControlPointer() {
    return opValuePointerControlPointer;
  }

  public void setOpValuePointerControlPointer(
      java.util.List<ControlPointer> opValuePointerControlPointer) {
    this.opValuePointerControlPointer = opValuePointerControlPointer;
  }

  private List<Selection> opDisplayOptionPointerSelection = new ArrayList<>();

  @Association(
      id = "54a67340-af4b-4c9a-9c65-322903fd3278",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Selection.class,
      property = "displayOptionPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Selection> getOpDisplayOptionPointerSelection() {
    return opDisplayOptionPointerSelection;
  }

  public void setOpDisplayOptionPointerSelection(
      java.util.List<Selection> opDisplayOptionPointerSelection) {
    this.opDisplayOptionPointerSelection = opDisplayOptionPointerSelection;
  }

  private List<Selection> opValueOptionPointerSelection = new ArrayList<>();

  @Association(
      id = "93bb8f22-1ce5-4cf3-a754-e32db046108a",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Selection.class,
      property = "valueOptionPointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<Selection> getOpValueOptionPointerSelection() {
    return opValueOptionPointerSelection;
  }

  public void setOpValueOptionPointerSelection(
      java.util.List<Selection> opValueOptionPointerSelection) {
    this.opValueOptionPointerSelection = opValueOptionPointerSelection;
  }

  private List<OrderBy> opRefObjOrderBy = new ArrayList<>();

  @Association(
      id = "9aad0734-a04c-48ba-b372-2885482154f1",
      from = org.tura.model.designer.repository.serialized.metabase.MetaObject.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.OrderBy.class,
      property = "refObj",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<OrderBy> getOpRefObjOrderBy() {
    return opRefObjOrderBy;
  }

  public void setOpRefObjOrderBy(java.util.List<OrderBy> opRefObjOrderBy) {
    this.opRefObjOrderBy = opRefObjOrderBy;
  }
}
