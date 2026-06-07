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
import org.tura.model.designer.repository.neoj4.style.StylePointer;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import java.util.Collection;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class CSSMapper implements Serializable, TypeAware, Mapper, StylePointer, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.mapper.CSSMapper.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_CSSMAPPER")
  private long vCSSMapper;

  public long getVcSSMapper() {
    return vCSSMapper;
  }

  public void setVcSSMapper(long vCSSMapper) {
    this.vCSSMapper = vCSSMapper;
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

  @org.neo4j.ogm.annotation.Property(name = "LIBRARY_URL")
  private String libraryUrl;

  public void setLibraryUrl(java.lang.String libraryUrl) {
    this.libraryUrl = libraryUrl;
  }

  public String getLibraryUrl() {
    return libraryUrl;
  }

  public void setSuidMapper(java.lang.String suid) {}

  public String getSuidMapper() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
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

  public void setSuidStylePointer(java.lang.String suid) {}

  public String getSuidStylePointer() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_STYLE_LIBRARY_STYLE_POINTER_STYLE_LIBRARY")
  private String refOpStyleLibraryStylePointerStyleLibrary;

  public void setRefOpStyleLibraryStylePointerStyleLibrary(
      java.lang.String refOpStyleLibraryStylePointerStyleLibrary) {
    this.refOpStyleLibraryStylePointerStyleLibrary = refOpStyleLibraryStylePointerStyleLibrary;
  }

  public String getRefOpStyleLibraryStylePointerStyleLibrary() {
    return refOpStyleLibraryStylePointerStyleLibrary;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
