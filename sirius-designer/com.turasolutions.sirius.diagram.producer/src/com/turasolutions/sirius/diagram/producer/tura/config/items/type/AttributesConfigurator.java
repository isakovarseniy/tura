package com.turasolutions.sirius.diagram.producer.tura.config.items.type;

import java.util.List;

import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;

import com.turasolutions.sirius.dsl.config.ContainerConfigurator;
import com.turasolutions.sirius.dsl.diagram.tContainer;

public class AttributesConfigurator implements ContainerConfigurator {
	public static tContainer create() {
		return new tContainer(new AttributesConfigurator());
	}

	public String getName() {
		return "Attributes";
	}

	public String getCandidates() {
		return "var:self";
	}

	public String getDomainClass() {
		return "type.Type";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("Attributes");
		style.setLabelSize(12);
		style.setShowIcon(false);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("orange");
		style.setForegroundColor(foregroundColor);

		return style;
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.LIST;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		return null;
	}
}
