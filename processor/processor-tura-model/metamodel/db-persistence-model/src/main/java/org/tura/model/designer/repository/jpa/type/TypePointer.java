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
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.jpa.objectmapper.CalculatedField;
import org.tura.model.designer.repository.jpa.form.FormParameter;
import org.tura.model.designer.repository.jpa.form.FormVariable;
import org.tura.model.designer.repository.jpa.form.ArtificialField;
import org.tura.model.designer.repository.jpa.mapper.JavaMapper;
import org.tura.model.designer.repository.jpa.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.jpa.mapper.XMLTypeMapper;
import javax.persistence.Entity;

@Entity(name = "TypePointer")
@javax.persistence.Table(name = "TYPEPOINTER")
public class TypePointer implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.type.TypePointer.class;
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
  @javax.persistence.Column(name = "V_TYPEPOINTER")
  private int vTypePointer;

  public int getVtypePointer() {
    return vTypePointer;
  }

  public void setVtypePointer(int vTypePointer) {
    this.vTypePointer = vTypePointer;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_OP_TYPE_REF_TYPE_POINTER_TYPE_ELEMENT", referencedColumnName = "UID")
  })
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private TypeElement typeRef;

  public TypeElement getTypeRef() {
    return typeRef;
  }

  public void setTypeRef(org.tura.model.designer.repository.jpa.type.TypeElement typeRef) {
    this.typeRef = typeRef;
  }

  @JoinColumns({
    @JoinColumn(name = "REF_MANY2MANY_HELPER_ASSOSIATION", referencedColumnName = "UID")
  })
  @OneToOne(fetch = javax.persistence.FetchType.LAZY)
  private Assosiation opMany2manyHelperAssosiation;

  public Assosiation getOpMany2manyHelperAssosiation() {
    return opMany2manyHelperAssosiation;
  }

  public void setOpMany2manyHelperAssosiation(
      org.tura.model.designer.repository.jpa.type.Assosiation opMany2manyHelperAssosiation) {
    this.opMany2manyHelperAssosiation = opMany2manyHelperAssosiation;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private TypePointerObj clTypePointerObj;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private Attribute clAttribute;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private TypeReference clTypeReference;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private Parameter clParameter;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private ReturnValue clReturnValue;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private CalculatedField clCalculatedField;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private FormParameter clFormParameter;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private FormVariable clFormVariable;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private ArtificialField clArtificialField;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private JavaMapper clJavaMapper;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private JavaScriptMapper clJavaScriptMapper;

  @OneToOne(mappedBy = "inhTypePointer", fetch = javax.persistence.FetchType.LAZY)
  private XMLTypeMapper clXMLTypeMapper;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clTypePointerObj != null) {
      return clTypePointerObj.getObject();
    }
    if (clAttribute != null) {
      return clAttribute.getObject();
    }
    if (clTypeReference != null) {
      return clTypeReference.getObject();
    }
    if (clParameter != null) {
      return clParameter.getObject();
    }
    if (clReturnValue != null) {
      return clReturnValue.getObject();
    }
    if (clCalculatedField != null) {
      return clCalculatedField.getObject();
    }
    if (clFormParameter != null) {
      return clFormParameter.getObject();
    }
    if (clFormVariable != null) {
      return clFormVariable.getObject();
    }
    if (clArtificialField != null) {
      return clArtificialField.getObject();
    }
    if (clJavaMapper != null) {
      return clJavaMapper.getObject();
    }
    if (clJavaScriptMapper != null) {
      return clJavaScriptMapper.getObject();
    }
    if (clXMLTypeMapper != null) {
      return clXMLTypeMapper.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.TypePointerObj")) {
        clTypePointerObj = (TypePointerObj) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Attribute")) {
        clAttribute = (Attribute) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.TypeReference")) {
        clTypeReference = (TypeReference) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Parameter")) {
        clParameter = (Parameter) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.ReturnValue")) {
        clReturnValue = (ReturnValue) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.objectmapper.CalculatedField")) {
        clCalculatedField = (CalculatedField) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.FormParameter")) {
        clFormParameter = (FormParameter) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.FormVariable")) {
        clFormVariable = (FormVariable) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ArtificialField")) {
        clArtificialField = (ArtificialField) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaMapper")) {
        clJavaMapper = (JavaMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaScriptMapper")) {
        clJavaScriptMapper = (JavaScriptMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.XMLTypeMapper")) {
        clXMLTypeMapper = (XMLTypeMapper) obj;
      }
    }
  }
}
