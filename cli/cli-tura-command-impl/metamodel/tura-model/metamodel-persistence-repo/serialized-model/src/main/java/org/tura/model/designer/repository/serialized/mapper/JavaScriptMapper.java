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

package org.tura.model.designer.repository.serialized.mapper;

import java.io.Serializable;
import org.tura.model.designer.repository.serialized.metabase.MetaObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.serialized.type.TypeElement;
import org.tura.model.designer.repository.serialized.type.Assosiation;
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
public class JavaScriptMapper implements Serializable, TypeMapper, VersionRef, MetaObject {

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
  public JavaScriptMapper inMemory() {
    throw new UnsupportedOperationException();
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private String libraryUrl;

  public String getLibraryUrl() {
    return libraryUrl;
  }

  public void setLibraryUrl(java.lang.String libraryUrl) {
    this.libraryUrl = libraryUrl;
  }

  private String artifactId;

  public String getArtifactId() {
    return artifactId;
  }

  public void setArtifactId(java.lang.String artifactId) {
    this.artifactId = artifactId;
  }

  private String groupId;

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(java.lang.String groupId) {
    this.groupId = groupId;
  }

  private String mappedToInternalLocation;

  public String getMappedToInternalLocation() {
    return mappedToInternalLocation;
  }

  public void setMappedToInternalLocation(java.lang.String mappedToInternalLocation) {
    this.mappedToInternalLocation = mappedToInternalLocation;
  }

  private String mappedToClassName;

  public String getMappedToClassName() {
    return mappedToClassName;
  }

  public void setMappedToClassName(java.lang.String mappedToClassName) {
    this.mappedToClassName = mappedToClassName;
  }

  private String jsPackageName;

  public String getJsPackageName() {
    return jsPackageName;
  }

  public void setJsPackageName(java.lang.String jsPackageName) {
    this.jsPackageName = jsPackageName;
  }

  private Boolean local;

  public Boolean getLocal() {
    return local;
  }

  public void setLocal(java.lang.Boolean local) {
    this.local = local;
  }

  private ArtifactType artifactType;

  public ArtifactType getArtifactType() {
    return artifactType;
  }

  public void setArtifactType(
      org.tura.model.designer.repository.serialized.mapper.ArtifactType artifactType) {
    this.artifactType = artifactType;
  }

  private String suidTypeMapper;

  public String getSuidTypeMapper() {
    return suidTypeMapper;
  }

  public void setSuidTypeMapper(java.lang.String suidTypeMapper) {
    this.suidTypeMapper = suidTypeMapper;
  }

  private String suidMapper;

  public String getSuidMapper() {
    return suidMapper;
  }

  public void setSuidMapper(java.lang.String suidMapper) {
    this.suidMapper = suidMapper;
  }

  private String transientrefMappersMappers;

  public String getTransientrefMappersMappers() {
    return transientrefMappersMappers;
  }

  public void setTransientrefMappersMappers(java.lang.String transientrefMappersMappers) {
    this.transientrefMappersMappers = transientrefMappersMappers;
  }

  private List<JavaComponent> opMapperRefJavaComponent = new ArrayList<>();

  @Association(
      id = "41df904d-8e41-4893-9a37-76dbf4421308",
      from = org.tura.model.designer.repository.serialized.mapper.Mapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.JavaComponent.class,
      property = "mapperRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpMapperRefJavaComponentMapper",
            field1Suffix = "Mapper",
            field2Suffix = "")
      })
  public List<JavaComponent> getOpMapperRefJavaComponent() {
    return opMapperRefJavaComponent;
  }

  public void setOpMapperRefJavaComponent(java.util.List<JavaComponent> opMapperRefJavaComponent) {
    this.opMapperRefJavaComponent = opMapperRefJavaComponent;
  }

  private List<JavaScriptComponent> opMapperRefJavaScriptComponent = new ArrayList<>();

  @Association(
      id = "42df3928-fc6d-47f9-bd74-25ae5083d0c0",
      from = org.tura.model.designer.repository.serialized.mapper.Mapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent.class,
      property = "mapperRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refOpMapperRefJavaScriptComponentMapper",
            field1Suffix = "Mapper",
            field2Suffix = "")
      })
  public List<JavaScriptComponent> getOpMapperRefJavaScriptComponent() {
    return opMapperRefJavaScriptComponent;
  }

  public void setOpMapperRefJavaScriptComponent(
      java.util.List<JavaScriptComponent> opMapperRefJavaScriptComponent) {
    this.opMapperRefJavaScriptComponent = opMapperRefJavaScriptComponent;
  }

  private List<MappingLayer> layers = new ArrayList<>();

  @Association(
      id = "c3e336d9-4075-4d1d-a67e-593d070462d0",
      from = org.tura.model.designer.repository.serialized.mapper.Mapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.mapper.MappingLayer.class,
      property = "opLayersMapper",
      containment = false,
      type = "Many2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<MappingLayer> getLayers() {
    return layers;
  }

  public void setLayers(java.util.List<MappingLayer> layers) {
    this.layers = layers;
  }

  private Mappers opMappersMappers;

  @Association(
      id = "054765d4-bee9-452f-90aa-8488fda6db3a",
      from = org.tura.model.designer.repository.serialized.mapper.Mapper.class,
      mappedBy = org.tura.model.designer.repository.serialized.mapper.Mappers.class,
      property = "mappers",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refMappersMappers",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Mappers getOpMappersMappers() {
    return opMappersMappers;
  }

  public void setOpMappersMappers(
      org.tura.model.designer.repository.serialized.mapper.Mappers opMappersMappers) {
    this.opMappersMappers = opMappersMappers;
  }

  private String suidTypePointer;

  public String getSuidTypePointer() {
    return suidTypePointer;
  }

  public void setSuidTypePointer(java.lang.String suidTypePointer) {
    this.suidTypePointer = suidTypePointer;
  }

  private String transientrefOpTypeRefTypePointerTypeElement;

  public String getTransientrefOpTypeRefTypePointerTypeElement() {
    return transientrefOpTypeRefTypePointerTypeElement;
  }

  public void setTransientrefOpTypeRefTypePointerTypeElement(
      java.lang.String transientrefOpTypeRefTypePointerTypeElement) {
    this.transientrefOpTypeRefTypePointerTypeElement = transientrefOpTypeRefTypePointerTypeElement;
  }

  private String transientrefMany2manyHelperAssosiation;

  public String getTransientrefMany2manyHelperAssosiation() {
    return transientrefMany2manyHelperAssosiation;
  }

  public void setTransientrefMany2manyHelperAssosiation(
      java.lang.String transientrefMany2manyHelperAssosiation) {
    this.transientrefMany2manyHelperAssosiation = transientrefMany2manyHelperAssosiation;
  }

  private TypeElement typeRef;

  @Association(
      id = "0711687a-6c21-4561-b355-b6c2b5a7cfe8",
      from = org.tura.model.designer.repository.serialized.type.TypePointer.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.TypeElement.class,
      property = "opTypeRefTypePointer",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpTypeRefTypePointerTypeElement",
            field1Suffix = "",
            field2Suffix = "")
      })
  public TypeElement getTypeRef() {
    return typeRef;
  }

  public void setTypeRef(org.tura.model.designer.repository.serialized.type.TypeElement typeRef) {
    this.typeRef = typeRef;
  }

  private Assosiation opMany2manyHelperAssosiation;

  @Association(
      id = "4ca9264d-a781-449a-b214-8a8b48b996fe",
      from = org.tura.model.designer.repository.serialized.type.TypePointer.class,
      mappedBy = org.tura.model.designer.repository.serialized.type.Assosiation.class,
      property = "many2manyHelper",
      containment = false,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refMany2manyHelperAssosiation",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Assosiation getOpMany2manyHelperAssosiation() {
    return opMany2manyHelperAssosiation;
  }

  public void setOpMany2manyHelperAssosiation(
      org.tura.model.designer.repository.serialized.type.Assosiation opMany2manyHelperAssosiation) {
    this.opMany2manyHelperAssosiation = opMany2manyHelperAssosiation;
  }

  private String suidVersionRef;

  public String getSuidVersionRef() {
    return suidVersionRef;
  }

  public void setSuidVersionRef(java.lang.String suidVersionRef) {
    this.suidVersionRef = suidVersionRef;
  }

  private String transientrefOpVersionRefVersionRefVersion;

  public String getTransientrefOpVersionRefVersionRefVersion() {
    return transientrefOpVersionRefVersionRefVersion;
  }

  public void setTransientrefOpVersionRefVersionRefVersion(
      java.lang.String transientrefOpVersionRefVersionRefVersion) {
    this.transientrefOpVersionRefVersionRefVersion = transientrefOpVersionRefVersionRefVersion;
  }

  private Version versionRef;

  @Association(
      id = "9a269e3f-0868-4818-ab6d-f8ffed36e01c",
      from = org.tura.model.designer.repository.serialized.mapper.VersionRef.class,
      mappedBy = org.tura.model.designer.repository.serialized.mapper.Version.class,
      property = "opVersionRefVersionRef",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpVersionRefVersionRefVersion",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Version getVersionRef() {
    return versionRef;
  }

  public void setVersionRef(
      org.tura.model.designer.repository.serialized.mapper.Version versionRef) {
    this.versionRef = versionRef;
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
