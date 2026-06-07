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

package org.tura.model.designer.repository.neoj4.mapper;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.type.PackagePointer;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import java.util.Collection;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class JavaPackageMapper
    implements Serializable,
        TypeAware,
        PackageMapper,
        Mapper,
        PackagePointer,
        VersionRef,
        MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.mapper.JavaPackageMapper.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_JAVAPACKAGEMAPPER")
  private long vJavaPackageMapper;

  public long getVjavaPackageMapper() {
    return vJavaPackageMapper;
  }

  public void setVjavaPackageMapper(long vJavaPackageMapper) {
    this.vJavaPackageMapper = vJavaPackageMapper;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @org.neo4j.ogm.annotation.Property(name = "MAPPED_TO_PACKAGE_NAME")
  private String mappedToPackageName;

  public void setMappedToPackageName(java.lang.String mappedToPackageName) {
    this.mappedToPackageName = mappedToPackageName;
  }

  public String getMappedToPackageName() {
    return mappedToPackageName;
  }

  @org.neo4j.ogm.annotation.Property(name = "ARTIFACT_ID")
  private String artifactId;

  public void setArtifactId(java.lang.String artifactId) {
    this.artifactId = artifactId;
  }

  public String getArtifactId() {
    return artifactId;
  }

  @org.neo4j.ogm.annotation.Property(name = "GROUP_ID")
  private String groupId;

  public void setGroupId(java.lang.String groupId) {
    this.groupId = groupId;
  }

  public String getGroupId() {
    return groupId;
  }

  @org.neo4j.ogm.annotation.Property(name = "SCOPE")
  private JavaLibScope scope;

  public void setScope(org.tura.model.designer.repository.neoj4.mapper.JavaLibScope scope) {
    this.scope = scope;
  }

  public JavaLibScope getScope() {
    return scope;
  }

  @org.neo4j.ogm.annotation.Property(name = "LIBRARY_NAME")
  private String libraryName;

  public void setLibraryName(java.lang.String libraryName) {
    this.libraryName = libraryName;
  }

  public String getLibraryName() {
    return libraryName;
  }

  @org.neo4j.ogm.annotation.Property(name = "ARTIFACT_TYPE")
  private ArtifactType artifactType;

  public void setArtifactType(
      org.tura.model.designer.repository.neoj4.mapper.ArtifactType artifactType) {
    this.artifactType = artifactType;
  }

  public ArtifactType getArtifactType() {
    return artifactType;
  }

  public void setSuidPackageMapper(java.lang.String suid) {}

  public String getSuidPackageMapper() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  public void setSuidMapper(java.lang.String suid) {}

  public String getSuidMapper() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_MAPPERS_MAPPERS")
  private String refMappersMappers;

  public void setRefMappersMappers(java.lang.String refMappersMappers) {
    this.refMappersMappers = refMappersMappers;
  }

  public String getRefMappersMappers() {
    return refMappersMappers;
  }

  @org.neo4j.ogm.annotation.Relationship(
      type = "Mapper_MappingLayer_layers",
      direction = org.neo4j.ogm.annotation.Relationship.Direction.OUTGOING)
  private Collection<MappingLayer> layers;

  public Collection<MappingLayer> getLayers() {
    return layers;
  }

  public void setLayers(java.util.Collection<MappingLayer> layers) {
    this.layers = layers;
  }

  public void setSuidPackagePointer(java.lang.String suid) {}

  public String getSuidPackagePointer() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_PACKAGE_REF_PACKAGE_POINTER_TYPE_GROUP")
  private String refOpPackageRefPackagePointerTypeGroup;

  public void setRefOpPackageRefPackagePointerTypeGroup(
      java.lang.String refOpPackageRefPackagePointerTypeGroup) {
    this.refOpPackageRefPackagePointerTypeGroup = refOpPackageRefPackagePointerTypeGroup;
  }

  public String getRefOpPackageRefPackagePointerTypeGroup() {
    return refOpPackageRefPackagePointerTypeGroup;
  }

  public void setSuidVersionRef(java.lang.String suid) {}

  public String getSuidVersionRef() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_VERSION_REF_VERSION_REF_VERSION")
  private String refOpVersionRefVersionRefVersion;

  public void setRefOpVersionRefVersionRefVersion(
      java.lang.String refOpVersionRefVersionRefVersion) {
    this.refOpVersionRefVersionRefVersion = refOpVersionRefVersionRefVersion;
  }

  public String getRefOpVersionRefVersionRefVersion() {
    return refOpVersionRefVersionRefVersion;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
