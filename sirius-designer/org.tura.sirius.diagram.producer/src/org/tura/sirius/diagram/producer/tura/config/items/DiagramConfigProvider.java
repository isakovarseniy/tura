/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.diagram.producer.tura.config.items;

import org.tura.sirius.diagram.producer.tura.config.items.domain.DomainArtifactsConfigurator;
import org.tura.sirius.dsl.config.ConfigProvider;

public class DiagramConfigProvider implements ConfigProvider {
	public Object getConfigurator(String type) {
		return new DomainArtifactsConfigurator();
	}
}
