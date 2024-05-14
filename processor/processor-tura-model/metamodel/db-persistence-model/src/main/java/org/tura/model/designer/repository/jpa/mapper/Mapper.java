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

package org.tura.model.designer.repository.jpa.mapper;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.object.JpaDomainInterfaceSetter;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import org.tura.model.designer.repository.jpa.recipe.JavaComponent;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.model.designer.repository.jpa.recipe.JavaScriptComponent;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "Mapper")
@javax.persistence.Table(name = "MAPPER")
public class Mapper implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.mapper.Mapper.class;
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
  @javax.persistence.Column(name = "V_MAPPER")
  private int vMapper;

  public int getVmapper() {
    return vMapper;
  }

  public void setVmapper(int vMapper) {
    this.vMapper = vMapper;
  }

  @OneToMany(mappedBy = "mapperRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<JavaComponent> opMapperRefJavaComponent;

  public Collection<JavaComponent> getOpMapperRefJavaComponent() {
    return opMapperRefJavaComponent;
  }

  public void setOpMapperRefJavaComponent(
      java.util.Collection<JavaComponent> opMapperRefJavaComponent) {
    this.opMapperRefJavaComponent = opMapperRefJavaComponent;
  }

  @OneToMany(mappedBy = "mapperRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<JavaScriptComponent> opMapperRefJavaScriptComponent;

  public Collection<JavaScriptComponent> getOpMapperRefJavaScriptComponent() {
    return opMapperRefJavaScriptComponent;
  }

  public void setOpMapperRefJavaScriptComponent(
      java.util.Collection<JavaScriptComponent> opMapperRefJavaScriptComponent) {
    this.opMapperRefJavaScriptComponent = opMapperRefJavaScriptComponent;
  }

  @ManyToMany(mappedBy = "opLayersMapper", fetch = javax.persistence.FetchType.LAZY)
  private Collection<MappingLayer> layers;

  public Collection<MappingLayer> getLayers() {
    return layers;
  }

  public void setLayers(java.util.Collection<MappingLayer> layers) {
    this.layers = layers;
  }

  @JoinColumns({@JoinColumn(name = "REF_MAPPERS_MAPPERS", referencedColumnName = "UID")})
  @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
  private Mappers opMappersMappers;

  public Mappers getOpMappersMappers() {
    return opMappersMappers;
  }

  public void setOpMappersMappers(
      org.tura.model.designer.repository.jpa.mapper.Mappers opMappersMappers) {
    this.opMappersMappers = opMappersMappers;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhMapper", fetch = javax.persistence.FetchType.LAZY)
  private JavaMapper clJavaMapper;

  @OneToOne(mappedBy = "inhMapper", fetch = javax.persistence.FetchType.LAZY)
  private JavaScriptMapper clJavaScriptMapper;

  @OneToOne(mappedBy = "inhMapper", fetch = javax.persistence.FetchType.LAZY)
  private XMLTypeMapper clXMLTypeMapper;

  @OneToOne(mappedBy = "inhMapper", fetch = javax.persistence.FetchType.LAZY)
  private JavaPackageMapper clJavaPackageMapper;

  @OneToOne(mappedBy = "inhMapper", fetch = javax.persistence.FetchType.LAZY)
  private XMLPackageMapper clXMLPackageMapper;

  @OneToOne(mappedBy = "inhMapper", fetch = javax.persistence.FetchType.LAZY)
  private MetamodelPackageMapper clMetamodelPackageMapper;

  @OneToOne(mappedBy = "inhMapper", fetch = javax.persistence.FetchType.LAZY)
  private CSSMapper clCSSMapper;

  @OneToOne(mappedBy = "inhMapper", fetch = javax.persistence.FetchType.LAZY)
  private RoleMapper clRoleMapper;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
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
    if (clJavaPackageMapper != null) {
      return clJavaPackageMapper.getObject();
    }
    if (clXMLPackageMapper != null) {
      return clXMLPackageMapper.getObject();
    }
    if (clMetamodelPackageMapper != null) {
      return clMetamodelPackageMapper.getObject();
    }
    if (clCSSMapper != null) {
      return clCSSMapper.getObject();
    }
    if (clRoleMapper != null) {
      return clRoleMapper.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaMapper")) {
        clJavaMapper = (JavaMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaScriptMapper")) {
        clJavaScriptMapper = (JavaScriptMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.XMLTypeMapper")) {
        clXMLTypeMapper = (XMLTypeMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaPackageMapper")) {
        clJavaPackageMapper = (JavaPackageMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.XMLPackageMapper")) {
        clXMLPackageMapper = (XMLPackageMapper) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.mapper.MetamodelPackageMapper")) {
        clMetamodelPackageMapper = (MetamodelPackageMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.CSSMapper")) {
        clCSSMapper = (CSSMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.RoleMapper")) {
        clRoleMapper = (RoleMapper) obj;
      }
    }
  }
}
