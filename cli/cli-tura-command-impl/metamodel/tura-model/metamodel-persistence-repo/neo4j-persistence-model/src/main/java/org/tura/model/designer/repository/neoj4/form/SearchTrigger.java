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

package org.tura.model.designer.repository.neoj4.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.type.MethodPointer;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class SearchTrigger
    implements Serializable, TypeAware, Trigger, MethodPointer, ContextParameters, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.SearchTrigger.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_SEARCHTRIGGER")
  private long vSearchTrigger;

  public long getVsearchTrigger() {
    return vSearchTrigger;
  }

  public void setVsearchTrigger(long vSearchTrigger) {
    this.vSearchTrigger = vSearchTrigger;
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
  @org.neo4j.ogm.annotation.Property(name = "REF_SEARCH_DATA_CONTROL")
  private String refSearchDataControl;

  public void setRefSearchDataControl(java.lang.String refSearchDataControl) {
    this.refSearchDataControl = refSearchDataControl;
  }

  public String getRefSearchDataControl() {
    return refSearchDataControl;
  }

  public void setSuidTrigger(java.lang.String suid) {}

  public String getSuidTrigger() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }

  public void setSuidMethodPointer(java.lang.String suid) {}

  public String getSuidMethodPointer() {
    return this.suid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_METHOD_REF_METHOD_POINTER_OPERATION")
  private String refOpMethodRefMethodPointerOperation;

  public void setRefOpMethodRefMethodPointerOperation(
      java.lang.String refOpMethodRefMethodPointerOperation) {
    this.refOpMethodRefMethodPointerOperation = refOpMethodRefMethodPointerOperation;
  }

  public String getRefOpMethodRefMethodPointerOperation() {
    return refOpMethodRefMethodPointerOperation;
  }

  public void setSuidContextParameters(java.lang.String suid) {}

  public String getSuidContextParameters() {
    return this.suid;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }
}
