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

package org.tura.sirius.diagram.producer.tura.config.items.objectmapper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.diagram.EdgeArrows;
import org.eclipse.sirius.diagram.description.ConditionalEdgeStyleDescription;
import org.eclipse.sirius.diagram.description.style.BeginLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription;
import org.eclipse.sirius.diagram.description.style.EndLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.tura.sirius.dsl.config.EdgeConfigurator;
import org.tura.sirius.dsl.diagram.tContainer;
import org.tura.sirius.dsl.diagram.tEdge;

public class ObectMapper2ObjectMapperConfigurator  implements EdgeConfigurator {
	public static tEdge create() {
		return new tEdge(new ObectMapper2ObjectMapperConfigurator());
	}

	public String getName() {
		return "ObectMapper2ObjectMapper";
	}

	public String getCandidates() {
		return "service:getOmRelation";
	}

	public String getDomainClass() {
		return "objectmapper.OmRelation";
	}

	public List<String> getSource() {
		ArrayList<String> list = new ArrayList<>();
		list.add("ObjectMapper" + tContainer.class.getName());

		return list;
	}

	public List<String> getTarget() {
		ArrayList<String> list = new ArrayList<>();
		list.add("ObjectMapper" + tContainer.class.getName());

		return list;
	}

	public EdgeStyleDescription getStyle() {
		EdgeStyleDescription style = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		style.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
		style.setTargetArrow(EdgeArrows.INPUT_FILL_CLOSED_ARROW_LITERAL);

		BeginLabelStyleDescription beginStyle = StyleFactory.eINSTANCE.createBeginLabelStyleDescription();
		style.setBeginLabelStyleDescription(beginStyle);

		EndLabelStyleDescription endStyle = StyleFactory.eINSTANCE.createEndLabelStyleDescription();
		style.setEndLabelStyleDescription(endStyle);

		CenterLabelStyleDescription centerStyle = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		style.setCenterLabelStyleDescription(centerStyle);

		return style;
	}

	public String getSourceFinderExpression() {
		return "aql:self.eContainer()";
	}

	public String getTargetFinderExpression() {
		return "feature:objectMapperRef";
	}

	@Override
	public List<ConditionalEdgeStyleDescription> getConditionalStyle() {
		return null;
	}

	@Override
	public String getPreConditionExpression() {
		return null;
	}
}
