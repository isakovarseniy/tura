/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.diagram.producer.tura.config.items.message;

import org.eclipse.sirius.table.metamodel.table.description.BackgroundStyleDescription;
import org.eclipse.sirius.table.metamodel.table.description.DescriptionFactory;
import org.eclipse.sirius.table.metamodel.table.description.ForegroundStyleDescription;
import org.tura.sirius.dsl.config.ColumnConfiguration;
import org.tura.sirius.dsl.table.tColumn;

public class TranclationConfiguration implements ColumnConfiguration {
	public static tColumn create() {
		return new tColumn(new TranclationConfiguration());
	}

	public String getName() {
		return "Translatioin";
	}

	public BackgroundStyleDescription getBackgroundStype() {
		BackgroundStyleDescription style = DescriptionFactory.eINSTANCE.createBackgroundStyleDescription();
		return style;
	}

	public ForegroundStyleDescription getForegroundStyle() {
		ForegroundStyleDescription style = DescriptionFactory.eINSTANCE.createForegroundStyleDescription();
		return style;
	}

	public String getFeatureName() {
		return "translation";
	}
}
