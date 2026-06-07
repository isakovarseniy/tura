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
import org.tura.platform.repository.neo4j.operation.FilterBuilder;
import org.neo4j.ogm.cypher.Filters;
import org.neo4j.ogm.cypher.Filter;

public class CreateTriggerPK implements Serializable, FilterBuilder {

  private static final long serialVersionUID = 1L;

  public CreateTriggerPK() {}

  public CreateTriggerPK(java.lang.String uid) {
    this.uid = uid;
  }

  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof CreateTriggerPK) {
      CreateTriggerPK type = (CreateTriggerPK) obj;
      if (!type.getUid().equals(uid)) {
        return false;
      }
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    int i = 0;
    i = i + uid.hashCode();
    return i;
  }

  public boolean isNull() {
    boolean r = true;
    r = r & (uid == null);
    return r;
  }

  @Override
  public String toString() {
    String str = "org.tura.model.designer.repository.neoj4.form.CreateTriggerPK";
    str = str + " uid = " + uid.toString();
    return str;
  }

  @Override
  public Filters getPKSearch() {
    Filters filters = new Filters();
    filters.add(new Filter("UID", org.neo4j.ogm.cypher.ComparisonOperator.EQUALS, this.uid));
    return filters;
  }
}
