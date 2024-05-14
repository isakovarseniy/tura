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
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.model.designer.repository.jpa.type.Type;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "OptionSelection")
@javax.persistence.Table(name = "OPTIONSELECTION")
public class OptionSelection implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.OptionSelection.class;
  }

  @javax.persistence.Column(name = "INITIAL_OPTION_VALUE")
  private String initialOptionValue;

  public void setInitialOptionValue(java.lang.String initialOptionValue) {
    this.initialOptionValue = initialOptionValue;
  }

  public String getInitialOptionValue() {
    return initialOptionValue;
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
  @javax.persistence.Column(name = "V_OPTIONSELECTION")
  private int vOptionSelection;

  public int getVoptionSelection() {
    return vOptionSelection;
  }

  public void setVoptionSelection(int vOptionSelection) {
    this.vOptionSelection = vOptionSelection;
  }

  @OneToOne(mappedBy = "opSelectionOptionSelection", fetch = javax.persistence.FetchType.LAZY)
  private Selection selection;

  public Selection getSelection() {
    return selection;
  }

  public void setSelection(org.tura.model.designer.repository.jpa.form.Selection selection) {
    this.selection = selection;
  }

  @OneToOne(
      mappedBy = "opInitialOptionMessageOptionSelection",
      fetch = javax.persistence.FetchType.LAZY)
  private Context initialOptionMessage;

  public Context getInitialOptionMessage() {
    return initialOptionMessage;
  }

  public void setInitialOptionMessage(
      org.tura.model.designer.repository.jpa.form.Context initialOptionMessage) {
    this.initialOptionMessage = initialOptionMessage;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_OPTION_POINTER_OPTION_SELECTION_DATA_CONTROL",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private DataControl optionPointer;

  public DataControl getOptionPointer() {
    return optionPointer;
  }

  public void setOptionPointer(
      org.tura.model.designer.repository.jpa.form.DataControl optionPointer) {
    this.optionPointer = optionPointer;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_OPTION_CAST_OPTION_SELECTION_TYPE", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Type optionCast;

  public Type getOptionCast() {
    return optionCast;
  }

  public void setOptionCast(org.tura.model.designer.repository.jpa.type.Type optionCast) {
    this.optionCast = optionCast;
  }

  @JoinColumns({
    @JoinColumn(
        name = "REF_OP_OPTION_CAST_DATA_CONTROL_OPTION_SELECTION_DATA_CONTROL",
        referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private DataControl optionCastDataControl;

  public DataControl getOptionCastDataControl() {
    return optionCastDataControl;
  }

  public void setOptionCastDataControl(
      org.tura.model.designer.repository.jpa.form.DataControl optionCastDataControl) {
    this.optionCastDataControl = optionCastDataControl;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhOptionSelection", fetch = javax.persistence.FetchType.LAZY)
  private DropDownSelection clDropDownSelection;

  @OneToOne(mappedBy = "inhOptionSelection", fetch = javax.persistence.FetchType.LAZY)
  private SelectManyMenu clSelectManyMenu;

  @OneToOne(mappedBy = "inhOptionSelection", fetch = javax.persistence.FetchType.LAZY)
  private RadioSelection clRadioSelection;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clDropDownSelection != null) {
      return clDropDownSelection.getObject();
    }
    if (clSelectManyMenu != null) {
      return clSelectManyMenu.getObject();
    }
    if (clRadioSelection != null) {
      return clRadioSelection.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.DropDownSelection")) {
        clDropDownSelection = (DropDownSelection) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.SelectManyMenu")) {
        clSelectManyMenu = (SelectManyMenu) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.RadioSelection")) {
        clRadioSelection = (RadioSelection) obj;
      }
    }
  }
}
