/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.diagram.producer.tura.config.items.form;

import java.util.List;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;

public class TreeColumnsConfigurator implements ContainerConfigurator {
	private String suffix = "";

	public TreeColumnsConfigurator(String suffix) {
		this.suffix = suffix;
	}

	public TreeColumnsConfigurator() {
	}

	public static tContainer create(String suffix) {
		return new tContainer(new TreeColumnsConfigurator(suffix));
	}

	public static tContainer create() {
		return new tContainer(new TreeColumnsConfigurator());
	}

	public String getName() {
		return "TreeColumns" + this.suffix;
	}

	public String getCandidates() {
		return "var:self";
	}

	public String getDomainClass() {
		return "form.Tree";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("TreeColumns");
		style.setLabelSize(12);
		style.setShowIcon(false);
		style.setHideLabelByDefault(true);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
		style.setForegroundColor(foregroundColor);
		style.setBorderSizeComputationExpression("1");

		return style;
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.HORIZONTAL_STACK;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		return null;
	}
}
