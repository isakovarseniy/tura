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

package org.tura.model.designer.repository.neoj4.recipe;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class MappingTecnologiy implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.MappingTecnologiy.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_MAPPINGTECNOLOGIY")
  private long vMappingTecnologiy;

  public long getVmappingTecnologiy() {
    return vMappingTecnologiy;
  }

  public void setVmappingTecnologiy(long vMappingTecnologiy) {
    this.vMappingTecnologiy = vMappingTecnologiy;
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

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TECH_REF_MAPPING_TECNOLOGIY_TECHNOLOGY")
  private String refOpTechRefMappingTecnologiyTechnology;

  public void setRefOpTechRefMappingTecnologiyTechnology(
      java.lang.String refOpTechRefMappingTecnologiyTechnology) {
    this.refOpTechRefMappingTecnologiyTechnology = refOpTechRefMappingTecnologiyTechnology;
  }

  public String getRefOpTechRefMappingTecnologiyTechnology() {
    return refOpTechRefMappingTecnologiyTechnology;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_VALUE_REF_MAPPING_TECNOLOGIY_OPTION")
  private String refOpValueRefMappingTecnologiyOption;

  public void setRefOpValueRefMappingTecnologiyOption(
      java.lang.String refOpValueRefMappingTecnologiyOption) {
    this.refOpValueRefMappingTecnologiyOption = refOpValueRefMappingTecnologiyOption;
  }

  public String getRefOpValueRefMappingTecnologiyOption() {
    return refOpValueRefMappingTecnologiyOption;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_TECHNOLOGIES_MODEL_MAPPER")
  private String refTechnologiesModelMapper;

  public void setRefTechnologiesModelMapper(java.lang.String refTechnologiesModelMapper) {
    this.refTechnologiesModelMapper = refTechnologiesModelMapper;
  }

  public String getRefTechnologiesModelMapper() {
    return refTechnologiesModelMapper;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }
}
