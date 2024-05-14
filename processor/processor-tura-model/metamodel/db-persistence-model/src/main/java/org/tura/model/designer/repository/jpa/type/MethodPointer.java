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

package org.tura.model.designer.repository.jpa.type;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.object.JpaDomainInterfaceSetter;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.jpa.form.ViewPortTrigger;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.form.PREFormTrigger;
import org.tura.model.designer.repository.jpa.form.PREQueryTrigger;
import org.tura.model.designer.repository.jpa.form.POSTQueryTrigger;
import org.tura.model.designer.repository.jpa.form.PREInsertTrigger;
import org.tura.model.designer.repository.jpa.form.PREDeleteTrigger;
import org.tura.model.designer.repository.jpa.form.POSTCreateTrigger;
import org.tura.model.designer.repository.jpa.form.PREUpdateTrigger;
import org.tura.model.designer.repository.jpa.form.CreateTrigger;
import org.tura.model.designer.repository.jpa.form.InsertTrigger;
import org.tura.model.designer.repository.jpa.form.UpdateTrigger;
import org.tura.model.designer.repository.jpa.form.DeleteTrigger;
import org.tura.model.designer.repository.jpa.form.SearchTrigger;
import javax.persistence.Entity;

@Entity(name = "MethodPointer")
@javax.persistence.Table(name = "METHODPOINTER")
public class MethodPointer implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.type.MethodPointer.class;
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
  @javax.persistence.Column(name = "V_METHODPOINTER")
  private int vMethodPointer;

  public int getVmethodPointer() {
    return vMethodPointer;
  }

  public void setVmethodPointer(int vMethodPointer) {
    this.vMethodPointer = vMethodPointer;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_METHOD_REF_METHOD_POINTER_OPERATION", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Operation methodRef;

  public Operation getMethodRef() {
    return methodRef;
  }

  public void setMethodRef(org.tura.model.designer.repository.jpa.type.Operation methodRef) {
    this.methodRef = methodRef;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private ViewPortTrigger clViewPortTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private PREFormTrigger clPREFormTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private PREQueryTrigger clPREQueryTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private POSTQueryTrigger clPOSTQueryTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private PREInsertTrigger clPREInsertTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private PREDeleteTrigger clPREDeleteTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private POSTCreateTrigger clPOSTCreateTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private PREUpdateTrigger clPREUpdateTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private CreateTrigger clCreateTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private InsertTrigger clInsertTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private UpdateTrigger clUpdateTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
  private DeleteTrigger clDeleteTrigger;

  @OneToOne(mappedBy = "inhMethodPointer", fetch = javax.persistence.FetchType.LAZY)
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
