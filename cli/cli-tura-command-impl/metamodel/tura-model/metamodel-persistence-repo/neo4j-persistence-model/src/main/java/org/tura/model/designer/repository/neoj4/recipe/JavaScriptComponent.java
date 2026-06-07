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
public class JavaScriptComponent extends Component
    implements Serializable, TypeAware, VersionRef, MetaObject {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.recipe.JavaScriptComponent.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Property(name = "PACKAGE_NAME")
  private String packageName;

  public void setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
  }

  public String getPackageName() {
    return packageName;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_MAPPER_REF_JAVA_SCRIPT_COMPONENT_MAPPER")
  private String refOpMapperRefJavaScriptComponentMapper;

  public void setRefOpMapperRefJavaScriptComponentMapper(
      java.lang.String refOpMapperRefJavaScriptComponentMapper) {
    this.refOpMapperRefJavaScriptComponentMapper = refOpMapperRefJavaScriptComponentMapper;
  }

  public String getRefOpMapperRefJavaScriptComponentMapper() {
    return refOpMapperRefJavaScriptComponentMapper;
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
