/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.model.designer.repository.serialized.type;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.artifact.Categorized;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import org.tura.model.designer.repository.serialized.domain.DomainTypesRepository;
import org.tura.model.designer.repository.serialized.artifact.Classifier;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.serialized.form.ContextParameter;
import org.tura.model.designer.repository.serialized.form.ExpressionPart;
import org.tura.model.designer.repository.serialized.form.ControlPointer;
import org.tura.model.designer.repository.serialized.form.Selection;
import org.tura.model.designer.repository.serialized.form.OrderBy;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
public class TypeGroup implements Serializable, Categorized, MetaObject {

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

  @JsonIgnore
  public boolean isInMemory() {
    throw new UnsupportedOperationException();
  }

  @JsonIgnore
  public TypeGroup inMemory() {
    throw new UnsupportedOperationException();
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private String keyId;

  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(java.lang.String keyId) {
    this.keyId = keyId;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private String transientrefRepositoryPackagesDomainTypesRepository;

  public String getTransientrefRepositoryPackagesDomainTypesRepository() {
    return transientrefRepositoryPackagesDomainTypesRepository;
  }

  public void setTransientrefRepositoryPackagesDomainTypesRepository(
      java.lang.String transientrefRepositoryPackagesDomainTypesRepository) {
    this.transientrefRepositoryPackagesDomainTypesRepository =
        transientrefRepositoryPackagesDomainTypesRepository;
  }

  private List<TypeElement> types = new ArrayList<>();

  @Association(
      id = "7eaca994-bb25-434a-bf77-978e6a1916ca",
      from = org.tura.model.designer.repository.serialized.type.TypeGroup.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      property = "opTypesTypeGroup",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refTypesTypeGroup",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<TypeElement> getTypes() {
    return types;
  }

  public void setTypes(java.util.List<TypeElement> types) {
    this.types = types;
  }

  private List<Relationship> relationships = new ArrayList<>();

  @Association(
      id = "e8e6d8ba-6e1e-4cc5-b95d-f55bf1376730",
      from = org.tura.model.designer.repository.serialized.type.TypeGroup.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Relationship.class,
      property = "opRelationshipsTypeGroup",
      containment = true,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refRelationshipsTypeGroup",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<Relationship> getRelationships() {
    return relationships;
  }

  public void setRelationships(java.util.List<Relationship> relationships) {
    this.relationships = relationships;
  }

  private List<PackagePointer> opPackageRefPackagePointer = new ArrayList<>();

  @Association(
      id = "c215fe43-45b8-4ac2-b572-354329c62558",
      from = org.tura.model.designer.repository.serialized.type.TypeGroup.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.PackagePointer.class,
      property = "packageRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpPackageRefPackagePointerTypeGroup",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<PackagePointer> getOpPackageRefPackagePointer() {
    return opPackageRefPackagePointer;
  }

  public void setOpPackageRefPackagePointer(
      java.util.List<PackagePointer> opPackageRefPackagePointer) {
    this.opPackageRefPackagePointer = opPackageRefPackagePointer;
  }

  private DomainTypesRepository opRepositoryPackagesDomainTypesRepository;

  @Association(
      id = "27c9588e-16ff-4eba-aea0-922f4db764ab",
      from = org.tura.model.designer.repository.serialized.type.TypeGroup.class,
      mappedBy = org.tura.model.designer.repository.serialized.domain.DomainTypesRepository.class,
      property = "repositoryPackages",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refRepositoryPackagesDomainTypesRepository",
            field1Suffix = "",
            field2Suffix = "")
      })
  public DomainTypesRepository getOpRepositoryPackagesDomainTypesRepository() {
    return opRepositoryPackagesDomainTypesRepository;
  }

  public void setOpRepositoryPackagesDomainTypesRepository(
      org.tura.model.designer.repository.serialized.domain.DomainTypesRepository
          opRepositoryPackagesDomainTypesRepository) {
    this.opRepositoryPackagesDomainTypesRepository = opRepositoryPackagesDomainTypesRepository;
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refClassifiersCategorized",
            field1Suffix = "Categorized",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpSourceAttributeConnectorMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpTargetAttributeConnectorMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpRefObjContextParameterMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpObjRefExpressionPartMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpValuePointerControlPointerMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpDisplayOptionPointerSelectionMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpValueOptionPointerSelectionMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
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
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpRefObjOrderByMetaObject",
            field1Suffix = "MetaObject",
            field2Suffix = "")
      })
  public List<OrderBy> getOpRefObjOrderBy() {
    return opRefObjOrderBy;
  }

  public void setOpRefObjOrderBy(java.util.List<OrderBy> opRefObjOrderBy) {
    this.opRefObjOrderBy = opRefObjOrderBy;
  }
}
