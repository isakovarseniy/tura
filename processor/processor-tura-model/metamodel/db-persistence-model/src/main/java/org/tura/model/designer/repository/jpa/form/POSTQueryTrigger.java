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
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.type.Operation;
import org.tura.model.designer.repository.jpa.type.MethodPointer;
import java.util.Collection;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.jpa.metabase.MetaObject;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "POSTQueryTrigger")
@javax.persistence.Table(name = "POSTQUERYTRIGGER")
public class POSTQueryTrigger implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.POSTQueryTrigger.class;
  }

  @Id
  @javax.persistence.Column(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_POSTQUERYTRIGGER")
  private int vPOSTQueryTrigger;

  public int getVpOSTQueryTrigger() {
    return vPOSTQueryTrigger;
  }

  public void setVpOSTQueryTrigger(int vPOSTQueryTrigger) {
    this.vPOSTQueryTrigger = vPOSTQueryTrigger;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_POST_QUERY_TRIGGER_DATA_CONTROL", referencedColumnName = "UID")
  })
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private DataControl opPostQueryTriggerDataControl;

  public DataControl getOpPostQueryTriggerDataControl() {
    return opPostQueryTriggerDataControl;
  }

  public void setOpPostQueryTriggerDataControl(
      org.tura.model.designer.repository.jpa.form.DataControl opPostQueryTriggerDataControl) {
    this.opPostQueryTriggerDataControl = opPostQueryTriggerDataControl;
  }

  public void setSuidTrigger(java.lang.String suid) {}

  public String getSuidTrigger() {
    return this.getInhTrigger().getSuid();
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_trigger", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private Trigger inhTrigger;

  public Trigger getInhTrigger() {
    return inhTrigger;
  }

  public void setInhTrigger(org.tura.model.designer.repository.jpa.form.Trigger inhTrigger) {
    this.inhTrigger = inhTrigger;
  }

  public void setSuidMethodPointer(java.lang.String suid) {}

  public String getSuidMethodPointer() {
    return this.getInhMethodPointer().getSuid();
  }

  public Operation getMethodRef() {
    return this.getInhMethodPointer().getMethodRef();
  }

  public void setMethodRef(org.tura.model.designer.repository.jpa.type.Operation methodRef) {
    this.getInhMethodPointer().setMethodRef(methodRef);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_methodPointer", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private MethodPointer inhMethodPointer;

  public MethodPointer getInhMethodPointer() {
    return inhMethodPointer;
  }

  public void setInhMethodPointer(
      org.tura.model.designer.repository.jpa.type.MethodPointer inhMethodPointer) {
    this.inhMethodPointer = inhMethodPointer;
  }

  public void setSuidContextParameters(java.lang.String suid) {}

  public String getSuidContextParameters() {
    return this.getInhContextParameters().getSuid();
  }

  public Collection<ContextParameter> getParameters() {
    return this.getInhContextParameters().getParameters();
  }

  public void setParameters(java.util.Collection<ContextParameter> parameters) {
    this.getInhContextParameters().setParameters(parameters);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_contextParameters", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private ContextParameters inhContextParameters;

  public ContextParameters getInhContextParameters() {
    return inhContextParameters;
  }

  public void setInhContextParameters(
      org.tura.model.designer.repository.jpa.form.ContextParameters inhContextParameters) {
    this.inhContextParameters = inhContextParameters;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.getInhMetaObject().getSuid();
  }

  public Collection<AttributeConnector> getOpSourceAttributeConnector() {
    return this.getInhMetaObject().getOpSourceAttributeConnector();
  }

  public void setOpSourceAttributeConnector(
      java.util.Collection<AttributeConnector> opSourceAttributeConnector) {
    this.getInhMetaObject().setOpSourceAttributeConnector(opSourceAttributeConnector);
  }

  public Collection<AttributeConnector> getOpTargetAttributeConnector() {
    return this.getInhMetaObject().getOpTargetAttributeConnector();
  }

  public void setOpTargetAttributeConnector(
      java.util.Collection<AttributeConnector> opTargetAttributeConnector) {
    this.getInhMetaObject().setOpTargetAttributeConnector(opTargetAttributeConnector);
  }

  public Collection<ContextParameter> getOpRefObjContextParameter() {
    return this.getInhMetaObject().getOpRefObjContextParameter();
  }

  public void setOpRefObjContextParameter(
      java.util.Collection<ContextParameter> opRefObjContextParameter) {
    this.getInhMetaObject().setOpRefObjContextParameter(opRefObjContextParameter);
  }

  public Collection<ExpressionPart> getOpObjRefExpressionPart() {
    return this.getInhMetaObject().getOpObjRefExpressionPart();
  }

  public void setOpObjRefExpressionPart(
      java.util.Collection<ExpressionPart> opObjRefExpressionPart) {
    this.getInhMetaObject().setOpObjRefExpressionPart(opObjRefExpressionPart);
  }

  public Collection<ControlPointer> getOpValuePointerControlPointer() {
    return this.getInhMetaObject().getOpValuePointerControlPointer();
  }

  public void setOpValuePointerControlPointer(
      java.util.Collection<ControlPointer> opValuePointerControlPointer) {
    this.getInhMetaObject().setOpValuePointerControlPointer(opValuePointerControlPointer);
  }

  public Collection<Selection> getOpDisplayOptionPointerSelection() {
    return this.getInhMetaObject().getOpDisplayOptionPointerSelection();
  }

  public void setOpDisplayOptionPointerSelection(
      java.util.Collection<Selection> opDisplayOptionPointerSelection) {
    this.getInhMetaObject().setOpDisplayOptionPointerSelection(opDisplayOptionPointerSelection);
  }

  public Collection<Selection> getOpValueOptionPointerSelection() {
    return this.getInhMetaObject().getOpValueOptionPointerSelection();
  }

  public void setOpValueOptionPointerSelection(
      java.util.Collection<Selection> opValueOptionPointerSelection) {
    this.getInhMetaObject().setOpValueOptionPointerSelection(opValueOptionPointerSelection);
  }

  public Collection<OrderBy> getOpRefObjOrderBy() {
    return this.getInhMetaObject().getOpRefObjOrderBy();
  }

  public void setOpRefObjOrderBy(java.util.Collection<OrderBy> opRefObjOrderBy) {
    this.getInhMetaObject().setOpRefObjOrderBy(opRefObjOrderBy);
  }

  @JoinColumns({@JoinColumn(name = "ref_suid_metaObject", referencedColumnName = "suid")})
  @OneToOne(cascade = javax.persistence.CascadeType.ALL)
  private MetaObject inhMetaObject;

  public MetaObject getInhMetaObject() {
    return inhMetaObject;
  }

  public void setInhMetaObject(
      org.tura.model.designer.repository.jpa.metabase.MetaObject inhMetaObject) {
    this.inhMetaObject = inhMetaObject;
  }

  public POSTQueryTrigger() {
    Trigger trigger = new Trigger();
    this.inhTrigger = trigger;
    trigger.setObject(this);
    MethodPointer methodPointer = new MethodPointer();
    this.inhMethodPointer = methodPointer;
    methodPointer.setObject(this);
    ContextParameters contextParameters = new ContextParameters();
    this.inhContextParameters = contextParameters;
    contextParameters.setObject(this);
    MetaObject metaObject = new MetaObject();
    this.inhMetaObject = metaObject;
    metaObject.setObject(this);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.POSTQueryTrigger.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.Trigger.class.getName())) {
      return (T) this.inhTrigger;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.type.MethodPointer.class.getName())) {
      return (T) this.inhMethodPointer;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.ContextParameters.class.getName())) {
      return (T) this.inhContextParameters;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.metabase.MetaObject.class.getName())) {
      return (T) this.inhMetaObject;
    }
    throw new RepositoryException("Cast exception to  " + clazz.getName());
  }

  public Object getObject() {
    return this;
  }
}
