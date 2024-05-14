/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.model.designer.repository.jpa.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.object.JpaDomainInterfaceSetter;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "Trigger")
@javax.persistence.Table(name = "TRIGGER")
public class Trigger implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.Trigger.class;
  }

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.tura.jpa.id.UUIDGenerator")
  @javax.persistence.Column(name = "SUID")
  private String suid;

  public void setSuid(java.lang.String suid) {
    this.suid = suid;
  }

  public String getSuid() {
    return suid;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_TRIGGER")
  private int vTrigger;

  public int getVtrigger() {
    return vTrigger;
  }

  public void setVtrigger(int vTrigger) {
    this.vTrigger = vTrigger;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private ViewPortTrigger clViewPortTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private PREFormTrigger clPREFormTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private PREQueryTrigger clPREQueryTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private POSTQueryTrigger clPOSTQueryTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private PREInsertTrigger clPREInsertTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private PREDeleteTrigger clPREDeleteTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private POSTCreateTrigger clPOSTCreateTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private PREUpdateTrigger clPREUpdateTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private CreateTrigger clCreateTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private InsertTrigger clInsertTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private UpdateTrigger clUpdateTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private DeleteTrigger clDeleteTrigger;

  @OneToOne(mappedBy = "inhTrigger", fetch = javax.persistence.FetchType.LAZY)
  private SearchTrigger clSearchTrigger;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clViewPortTrigger != null) {
      return clViewPortTrigger.getObject();
    }
    if (clPREFormTrigger != null) {
      return clPREFormTrigger.getObject();
    }
    if (clPREQueryTrigger != null) {
      return clPREQueryTrigger.getObject();
    }
    if (clPOSTQueryTrigger != null) {
      return clPOSTQueryTrigger.getObject();
    }
    if (clPREInsertTrigger != null) {
      return clPREInsertTrigger.getObject();
    }
    if (clPREDeleteTrigger != null) {
      return clPREDeleteTrigger.getObject();
    }
    if (clPOSTCreateTrigger != null) {
      return clPOSTCreateTrigger.getObject();
    }
    if (clPREUpdateTrigger != null) {
      return clPREUpdateTrigger.getObject();
    }
    if (clCreateTrigger != null) {
      return clCreateTrigger.getObject();
    }
    if (clInsertTrigger != null) {
      return clInsertTrigger.getObject();
    }
    if (clUpdateTrigger != null) {
      return clUpdateTrigger.getObject();
    }
    if (clDeleteTrigger != null) {
      return clDeleteTrigger.getObject();
    }
    if (clSearchTrigger != null) {
      return clSearchTrigger.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewPortTrigger")) {
        clViewPortTrigger = (ViewPortTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PREFormTrigger")) {
        clPREFormTrigger = (PREFormTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PREQueryTrigger")) {
        clPREQueryTrigger = (PREQueryTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.POSTQueryTrigger")) {
        clPOSTQueryTrigger = (POSTQueryTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PREInsertTrigger")) {
        clPREInsertTrigger = (PREInsertTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PREDeleteTrigger")) {
        clPREDeleteTrigger = (PREDeleteTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.POSTCreateTrigger")) {
        clPOSTCreateTrigger = (POSTCreateTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PREUpdateTrigger")) {
        clPREUpdateTrigger = (PREUpdateTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.CreateTrigger")) {
        clCreateTrigger = (CreateTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.InsertTrigger")) {
        clInsertTrigger = (InsertTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.UpdateTrigger")) {
        clUpdateTrigger = (UpdateTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.DeleteTrigger")) {
        clDeleteTrigger = (DeleteTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.SearchTrigger")) {
        clSearchTrigger = (SearchTrigger) obj;
      }
    }
  }
}
