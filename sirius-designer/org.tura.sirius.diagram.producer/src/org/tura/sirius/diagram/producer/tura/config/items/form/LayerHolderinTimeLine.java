/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.tura.sirius.dsl.config.ContainerConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;

public class LayerHolderinTimeLine implements ContainerConfigurator {
    public static tContainer create() {
        return new tContainer(new LayerHolderinTimeLine());
    }

    public String getName() {
        return "LayerHolderinTimeLine";
    }

    public String getCandidates() {
        return "feature:children";
    }

    public String getDomainClass() {
        return "form.LayerHolder";
    }

    public ContainerStyleDescription getStyle() {
        FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
        style.setLabelExpression("aql:self.name");
        style.setLabelSize(12);
        style.setBorderSizeComputationExpression("1");
        style.setShowIcon(true);
        style.setHideLabelByDefault(true);
        SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("white");
        style.setForegroundColor(foregroundColor);
        style.setIconPath("/org.tura.metamodel.sirius.diagram.designer/icons/layerholder.png");

        return style;
    }

    public ContainerLayout getContainerLayout() {
        return ContainerLayout.FREE_FORM;
    }

    public static List<ToolEntry> getTools() {
        List<ToolEntry> list = new ArrayList<ToolEntry>();

        return list;
    }

    public List<ConditionalContainerStyleDescription> getConditionalStyle() {
        return null;
    }
}