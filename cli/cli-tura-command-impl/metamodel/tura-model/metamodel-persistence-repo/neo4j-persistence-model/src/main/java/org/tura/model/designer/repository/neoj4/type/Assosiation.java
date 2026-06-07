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

package org.tura.model.designer.repository.neoj4.type;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Assosiation extends Relationship implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.type.Assosiation.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Property(name = "TYPE")
  private RelationType type;

  public void setType(org.tura.model.designer.repository.neoj4.type.RelationType type) {
    this.type = type;
  }

  public RelationType getType() {
    return type;
  }

  @org.neo4j.ogm.annotation.Property(name = "CONTAINMENT")
  private Containment containment;

  public void setContainment(
      org.tura.model.designer.repository.neoj4.type.Containment containment) {
    this.containment = containment;
  }

  public Containment getContainment() {
    return containment;
  }

  @org.neo4j.ogm.annotation.Property(name = "INTERNAL")
  private Boolean internal;

  public void setInternal(java.lang.Boolean internal) {
    this.internal = internal;
  }

  public Boolean getInternal() {
    return internal;
  }

  @org.neo4j.ogm.annotation.Property(name = "LAZY")
  private Boolean lazy;

  public void setLazy(java.lang.Boolean lazy) {
    this.lazy = lazy;
  }

  public Boolean getLazy() {
    return lazy;
  }

  @org.neo4j.ogm.annotation.Property(name = "SOURCE_OPERATION")
  private String sourceOperation;

  public void setSourceOperation(java.lang.String sourceOperation) {
    this.sourceOperation = sourceOperation;
  }

  public String getSourceOperation() {
    return sourceOperation;
  }

  @org.neo4j.ogm.annotation.Property(name = "TARGET_OPERATION")
  private String targetOperation;

  public void setTargetOperation(java.lang.String targetOperation) {
    this.targetOperation = targetOperation;
  }

  public String getTargetOperation() {
    return targetOperation;
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
