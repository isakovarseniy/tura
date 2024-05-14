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

package org.tura.model.designer.repository.jpa.recipe;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.object.JpaDomainInterfaceSetter;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import org.tura.model.designer.repository.jpa.mapper.Mappers;
import java.util.Collection;
import javax.persistence.ManyToMany;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity(name = "UsingMappers")
@javax.persistence.Table(name = "USINGMAPPERS")
public class UsingMappers implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.recipe.UsingMappers.class;
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
  @javax.persistence.Column(name = "V_USINGMAPPERS")
  private int vUsingMappers;

  public int getVusingMappers() {
    return vUsingMappers;
  }

  public void setVusingMappers(int vUsingMappers) {
    this.vUsingMappers = vUsingMappers;
  }

  @ManyToMany(mappedBy = "opMappersUsingMappers", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Mappers> mappers;

  public Collection<Mappers> getMappers() {
    return mappers;
  }

  public void setMappers(java.util.Collection<Mappers> mappers) {
    this.mappers = mappers;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhUsingMappers", fetch = javax.persistence.FetchType.LAZY)
  private Recipe clRecipe;

  @OneToOne(mappedBy = "inhUsingMappers", fetch = javax.persistence.FetchType.LAZY)
  private Ingredient clIngredient;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clRecipe != null) {
      return clRecipe.getObject();
    }
    if (clIngredient != null) {
      return clIngredient.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Recipe")) {
        clRecipe = (Recipe) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Ingredient")) {
        clIngredient = (Ingredient) obj;
      }
    }
  }
}
