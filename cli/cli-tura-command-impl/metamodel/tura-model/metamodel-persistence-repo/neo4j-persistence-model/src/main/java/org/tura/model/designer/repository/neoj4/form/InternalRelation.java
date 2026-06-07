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
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class InternalRelation extends Relation implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.InternalRelation.class;
  }

  @Id @GeneratedValue Long __id;

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_ASSOSIATION_REF_INTERNAL_RELATION_ASSOSIATION")
  private String refOpAssosiationRefInternalRelationAssosiation;

  public void setRefOpAssosiationRefInternalRelationAssosiation(
      java.lang.String refOpAssosiationRefInternalRelationAssosiation) {
    this.refOpAssosiationRefInternalRelationAssosiation =
        refOpAssosiationRefInternalRelationAssosiation;
  }

  public String getRefOpAssosiationRefInternalRelationAssosiation() {
    return refOpAssosiationRefInternalRelationAssosiation;
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
