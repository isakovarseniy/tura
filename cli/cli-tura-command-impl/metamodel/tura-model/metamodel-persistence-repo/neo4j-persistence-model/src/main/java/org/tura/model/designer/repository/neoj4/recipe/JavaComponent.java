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
import org.tura.model.designer.repository.neoj4.mapper.VersionRef;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class JavaComponent extends Component
    implements Serializable, TypeAware, VersionRef, MetaObject {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.JavaComponent.class;
  }

  @Id @GeneratedValue Long __id;

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

  @org.neo4j.ogm.annotation.Property(name = "BASE_PACKAGE")
  private String basePackage;

  public void setBasePackage(java.lang.String basePackage) {
    this.basePackage = basePackage;
  }

  public String getBasePackage() {
    return basePackage;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_MAPPER_REF_JAVA_COMPONENT_MAPPER")
  private String refOpMapperRefJavaComponentMapper;

  public void setRefOpMapperRefJavaComponentMapper(
      java.lang.String refOpMapperRefJavaComponentMapper) {
    this.refOpMapperRefJavaComponentMapper = refOpMapperRefJavaComponentMapper;
  }

  public String getRefOpMapperRefJavaComponentMapper() {
    return refOpMapperRefJavaComponentMapper;
  }

  public void setSuidVersionRef(java.lang.String suid) {}

  public String getSuidVersionRef() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
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
