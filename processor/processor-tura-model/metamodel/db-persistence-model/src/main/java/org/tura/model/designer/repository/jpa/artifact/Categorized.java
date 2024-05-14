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

package org.tura.model.designer.repository.jpa.artifact;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.object.JpaDomainInterfaceSetter;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.jpa.type.TypeGroup;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.type.Relationship;
import org.tura.model.designer.repository.jpa.type.Attribute;
import org.tura.model.designer.repository.jpa.type.Operation;
import org.tura.model.designer.repository.jpa.type.Type;
import org.tura.model.designer.repository.jpa.type.Enumerator;
import org.tura.model.designer.repository.jpa.type.EnumAttribute;
import org.tura.model.designer.repository.jpa.objectmapper.ObjectMapper;
import org.tura.model.designer.repository.jpa.message.MessageLibrary;
import org.tura.model.designer.repository.jpa.form.ViewPort;
import org.tura.model.designer.repository.jpa.form.ViewArea;
import org.tura.model.designer.repository.jpa.form.PopupCanvas;
import org.tura.model.designer.repository.jpa.form.OverlayCanvas;
import org.tura.model.designer.repository.jpa.form.Canvas;
import org.tura.model.designer.repository.jpa.form.Window;
import org.tura.model.designer.repository.jpa.form.MenuDefinition;
import org.tura.model.designer.repository.jpa.form.TabCanvas;
import org.tura.model.designer.repository.jpa.form.TabPage;
import org.tura.model.designer.repository.jpa.form.FlexField;
import org.tura.model.designer.repository.jpa.form.Uielement;
import org.tura.model.designer.repository.jpa.form.Column;
import org.tura.model.designer.repository.jpa.form.MenuElement;
import org.tura.model.designer.repository.jpa.form.MenuFolder;
import org.tura.model.designer.repository.jpa.form.DataControl;
import org.tura.model.designer.repository.jpa.recipe.ModelMapper;
import javax.persistence.Entity;

@Entity(name = "Categorized")
@javax.persistence.Table(name = "CATEGORIZED")
public class Categorized implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.artifact.Categorized.class;
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
  @javax.persistence.Column(name = "V_CATEGORIZED")
  private int vCategorized;

  public int getVcategorized() {
    return vCategorized;
  }

  public void setVcategorized(int vCategorized) {
    this.vCategorized = vCategorized;
  }

  @OneToMany(mappedBy = "opClassifiersCategorized")
  private Collection<Classifier> classifiers;

  public Collection<Classifier> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(java.util.Collection<Classifier> classifiers) {
    this.classifiers = classifiers;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private TypeGroup clTypeGroup;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private Relationship clRelationship;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private Attribute clAttribute;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private Operation clOperation;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private Type clType;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private Enumerator clEnumerator;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private EnumAttribute clEnumAttribute;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private ObjectMapper clObjectMapper;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private MessageLibrary clMessageLibrary;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private ViewPort clViewPort;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private ViewArea clViewArea;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private PopupCanvas clPopupCanvas;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private OverlayCanvas clOverlayCanvas;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private Canvas clCanvas;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private Window clWindow;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private MenuDefinition clMenuDefinition;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private TabCanvas clTabCanvas;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private TabPage clTabPage;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private FlexField clFlexField;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private Uielement clUielement;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private Column clColumn;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private MenuElement clMenuElement;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private MenuFolder clMenuFolder;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private DataControl clDataControl;

  @OneToOne(mappedBy = "inhCategorized", fetch = javax.persistence.FetchType.LAZY)
  private ModelMapper clModelMapper;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clTypeGroup != null) {
      return clTypeGroup.getObject();
    }
    if (clRelationship != null) {
      return clRelationship.getObject();
    }
    if (clAttribute != null) {
      return clAttribute.getObject();
    }
    if (clOperation != null) {
      return clOperation.getObject();
    }
    if (clType != null) {
      return clType.getObject();
    }
    if (clEnumerator != null) {
      return clEnumerator.getObject();
    }
    if (clEnumAttribute != null) {
      return clEnumAttribute.getObject();
    }
    if (clObjectMapper != null) {
      return clObjectMapper.getObject();
    }
    if (clMessageLibrary != null) {
      return clMessageLibrary.getObject();
    }
    if (clViewPort != null) {
      return clViewPort.getObject();
    }
    if (clViewArea != null) {
      return clViewArea.getObject();
    }
    if (clPopupCanvas != null) {
      return clPopupCanvas.getObject();
    }
    if (clOverlayCanvas != null) {
      return clOverlayCanvas.getObject();
    }
    if (clCanvas != null) {
      return clCanvas.getObject();
    }
    if (clWindow != null) {
      return clWindow.getObject();
    }
    if (clMenuDefinition != null) {
      return clMenuDefinition.getObject();
    }
    if (clTabCanvas != null) {
      return clTabCanvas.getObject();
    }
    if (clTabPage != null) {
      return clTabPage.getObject();
    }
    if (clFlexField != null) {
      return clFlexField.getObject();
    }
    if (clUielement != null) {
      return clUielement.getObject();
    }
    if (clColumn != null) {
      return clColumn.getObject();
    }
    if (clMenuElement != null) {
      return clMenuElement.getObject();
    }
    if (clMenuFolder != null) {
      return clMenuFolder.getObject();
    }
    if (clDataControl != null) {
      return clDataControl.getObject();
    }
    if (clModelMapper != null) {
      return clModelMapper.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.TypeGroup")) {
        clTypeGroup = (TypeGroup) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Relationship")) {
        clRelationship = (Relationship) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Attribute")) {
        clAttribute = (Attribute) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Operation")) {
        clOperation = (Operation) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Type")) {
        clType = (Type) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Enumerator")) {
        clEnumerator = (Enumerator) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.EnumAttribute")) {
        clEnumAttribute = (EnumAttribute) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.objectmapper.ObjectMapper")) {
        clObjectMapper = (ObjectMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.message.MessageLibrary")) {
        clMessageLibrary = (MessageLibrary) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewPort")) {
        clViewPort = (ViewPort) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewArea")) {
        clViewArea = (ViewArea) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PopupCanvas")) {
        clPopupCanvas = (PopupCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.OverlayCanvas")) {
        clOverlayCanvas = (OverlayCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Canvas")) {
        clCanvas = (Canvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Window")) {
        clWindow = (Window) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuDefinition")) {
        clMenuDefinition = (MenuDefinition) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabCanvas")) {
        clTabCanvas = (TabCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabPage")) {
        clTabPage = (TabPage) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.FlexField")) {
        clFlexField = (FlexField) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Uielement")) {
        clUielement = (Uielement) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Column")) {
        clColumn = (Column) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuElement")) {
        clMenuElement = (MenuElement) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuFolder")) {
        clMenuFolder = (MenuFolder) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.DataControl")) {
        clDataControl = (DataControl) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.ModelMapper")) {
        clModelMapper = (ModelMapper) obj;
      }
    }
  }
}
