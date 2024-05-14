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

package org.tura.model.designer.repository.jpa;

import java.util.Arrays;
import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.jpa.operation.JpaCommandProducer;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.platform.repository.core.StorageCommandProcessor;
import org.tura.platform.repository.StorageUpdater;

public class JPARepositoryInstantiator implements Instantiator {

  private Registry registry;

  private SpaObjectRegistry spaRegistry;

  public JPARepositoryInstantiator(Registry registry, SpaObjectRegistry spaRegistry) {
    this.spaRegistry = spaRegistry;
    this.registry = registry;
  }

  private static String[] knownObjects =
      new String[] {
        "persistence-repository",
        "persistence-repository.CommandProducer",
        StorageCommandProcessor.class.getName()
      };

  @SuppressWarnings("unchecked")
  @Override
  public <T> T newInstance(Class<T> clazz) {
    if (StorageCommandProcessor.class.equals(clazz)) {
      StorageUpdater updater = new StorageUpdater();
      updater.setRegistry(spaRegistry, registry);
      return (T) updater;
    }
    throw new RuntimeException("Unknown class " + clazz);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T newInstance(String className) {
    if ("persistence-repository".equals(className)) {
      SpaRepository repository = new SpaRepository();
      repository.setRegistry(spaRegistry, "persistence-repository", registry);
      return (T) repository;
    }
    if ("persistence-repository.CommandProducer".equals(className)) {
      return (T) new JpaCommandProducer(spaRegistry, "persistence-repository", registry);
    }
    throw new RuntimeException("Unknown class " + className);
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
