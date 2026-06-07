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

package org.tura.metamode.tura;

import java.util.UUID;

import org.tura.model.designer.repository.proxy.ObjectInheritance;
import org.tura.platform.repository.cpa.storage.CpaStorage;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.TypeInheritance;
import org.tura.platform.repository.cpa.storage.TypeInheritanceProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;


public class ProxyCpaStorageProvider implements CpaStorageProvider {

	private static final long serialVersionUID = 5777149395210031269L;
	private CpaStorage cpaStorage;
	private ObjectInheritance inh;

	public ProxyCpaStorageProvider(ProxyCommadStackProvider stackProvider) {
		inh = new ObjectInheritance();
		inh.init();
		this.cpaStorage = new CpaStorage(UUID.randomUUID().toString(), new TypeInheritanceProvider() {

			private static final long serialVersionUID = 1L;

			@Override
			public TypeInheritance get() {
				return inh;
			}
			
		});
		this.cpaStorage.setCommadStackProvider(stackProvider);
	}

	@Override
	public CpaStorage get() {
		return cpaStorage;
	}

}
