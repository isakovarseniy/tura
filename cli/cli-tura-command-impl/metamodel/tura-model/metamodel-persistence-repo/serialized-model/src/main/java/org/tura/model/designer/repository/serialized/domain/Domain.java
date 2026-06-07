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

package org.tura.model.designer.repository.serialized.domain;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import java.util.ArrayList;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import java.util.List;
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
public class Domain implements Serializable, MetaObject {

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
  public Domain inMemory() {
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

  private DomainArtifacts domainArtifacts;

  @Association(
      id = "24f40019-f2f4-4c54-9f11-1758f1ac756f",
      from = org.tura.model.designer.repository.serialized.domain.Domain.class,
      mappedBy = org.tura.model.designer.repository.serialized.domain.DomainArtifacts.class,
      property = "opDomainArtifactsDomain",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refDomainArtifactsDomain",
            field1Suffix = "",
            field2Suffix = "")
      })
  public DomainArtifacts getDomainArtifacts() {
    return domainArtifacts;
  }

  public void setDomainArtifacts(
      org.tura.model.designer.repository.serialized.domain.DomainArtifacts domainArtifacts) {
    this.domainArtifacts = domainArtifacts;
  }

  private DomainTypes domainTypes;

  @Association(
      id = "6d522174-e0d4-45a8-953b-6e9196ddb2a2",
      from = org.tura.model.designer.repository.serialized.domain.Domain.class,
      mappedBy = org.tura.model.designer.repository.serialized.domain.DomainTypes.class,
      property = "opDomainTypesDomain",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refDomainTypesDomain",
            field1Suffix = "",
            field2Suffix = "")
      })
  public DomainTypes getDomainTypes() {
    return domainTypes;
  }

  public void setDomainTypes(
      org.tura.model.designer.repository.serialized.domain.DomainTypes domainTypes) {
    this.domainTypes = domainTypes;
  }

  private DomainApplications domainApplications;

  @Association(
      id = "6dd073fc-49d1-4b2c-b541-bdbf95f46413",
      from = org.tura.model.designer.repository.serialized.domain.Domain.class,
      mappedBy = org.tura.model.designer.repository.serialized.domain.DomainApplications.class,
      property = "opDomainApplicationsDomain",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refDomainApplicationsDomain",
            field1Suffix = "",
            field2Suffix = "")
      })
  public DomainApplications getDomainApplications() {
    return domainApplications;
  }

  public void setDomainApplications(
      org.tura.model.designer.repository.serialized.domain.DomainApplications domainApplications) {
    this.domainApplications = domainApplications;
  }

  private DomainMappers domainMappers;

  @Association(
      id = "e1ba5858-16d9-4879-b93b-85b8f9fb0fee",
      from = org.tura.model.designer.repository.serialized.domain.Domain.class,
      mappedBy = org.tura.model.designer.repository.serialized.domain.DomainMappers.class,
      property = "opDomainMappersDomain",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refDomainMappersDomain",
            field1Suffix = "",
            field2Suffix = "")
      })
  public DomainMappers getDomainMappers() {
    return domainMappers;
  }

  public void setDomainMappers(
      org.tura.model.designer.repository.serialized.domain.DomainMappers domainMappers) {
    this.domainMappers = domainMappers;
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
