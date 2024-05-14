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

package org.tura.model.designer.repository.proxy;

import java.util.Arrays;
import org.tura.platform.repository.core.Instantiator;
import java.io.Serializable;
import org.tura.platform.repository.core.ProxyRepositoryProvider;
import org.tura.platform.repository.core.ProxyFactory;

public class ProxyRepositoryInstantiator implements Instantiator, Serializable {

  private static final long serialVersionUID = 1L;

  private ProxyRepositoryProvider provider;

  private static String[] knownObjects =
      new String[] {org.tura.platform.repository.core.ProxyFactory.class.getName()};

  public ProxyRepositoryInstantiator(
      org.tura.platform.repository.core.ProxyRepositoryProvider provider) {
    this.provider = provider;
  }

  @Override
  public <T> T newInstance(Class<T> clazz) {
    return newInstance(clazz.getName());
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T newInstance(String className) {
    if (org.tura.platform.repository.core.ProxyFactory.class.getName().equals(className)) {
      ProxyFactory repository = provider.get();
      return (T) repository;
    } else {
      try {
        return (T) newInstance(Class.forName(className));
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }

  @Override
  public boolean check(Class<?> clazz) {
    return check(clazz.getName());
  }

  @Override
  public boolean check(String clazzName) {
    return Arrays.asList(knownObjects).contains(clazzName);
  }
}
