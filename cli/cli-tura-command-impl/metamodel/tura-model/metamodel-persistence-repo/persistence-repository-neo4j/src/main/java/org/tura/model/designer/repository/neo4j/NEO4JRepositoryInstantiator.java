/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.model.designer.repository.neo4j;

import java.util.Arrays;
import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.neo4j.operation.Neo4jCommandProducer;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.platform.repository.core.StorageCommandProcessor;
import org.tura.platform.repository.StorageUpdater;

public class NEO4JRepositoryInstantiator implements Instantiator {

  private Registry registry;

  private SpaObjectRegistry spaRegistry;

  public NEO4JRepositoryInstantiator(Registry registry, SpaObjectRegistry spaRegistry) {
    this.spaRegistry = spaRegistry;
    this.registry = registry;
  }

  private static String[] knownObjects =
      new String[] {
        "persistence-repository-neo4j",
        "persistence-repository-neo4j.CommandProducer",
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
    if ("persistence-repository-neo4j".equals(className)) {
      SpaRepository repository = new SpaRepository();
      repository.setRegistry(spaRegistry, "persistence-repository-neo4j", registry);
      return (T) repository;
    }
    if ("persistence-repository-neo4j.CommandProducer".equals(className)) {
      return (T) new Neo4jCommandProducer(spaRegistry, "persistence-repository-neo4j", registry);
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
