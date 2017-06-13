package com.turasolutions.sirius.diagram.producer.tura.config.items.recipe;

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

public class PropertiesConfigurator implements ContainerConfigurator {
	public static tContainer create() {
		return new tContainer(new PropertiesConfigurator());
	}

	public String getName() {
		return "Configuratioin Variables";
	}

	public String getCandidates() {
		return "var:self";
	}

	public String getDomainClass() {
		return "recipe.Configuration";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("Config variables");
		style.setLabelSize(12);
		style.setShowIcon(false);
		style.setHideLabelByDefault(false);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault()
				.getSystemColorDescription("light_blue");
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
