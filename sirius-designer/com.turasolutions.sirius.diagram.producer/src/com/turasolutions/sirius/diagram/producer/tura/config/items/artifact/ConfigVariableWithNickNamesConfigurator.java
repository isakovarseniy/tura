package com.turasolutions.sirius.diagram.producer.tura.config.items.artifact;

import com.turasolutions.sirius.dsl.config.ContainerConfigurator;
import com.turasolutions.sirius.dsl.diagram.tContainer;
import java.util.List;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.eclipse.sirius.diagram.description.ConditionalContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;

public class ConfigVariableWithNickNamesConfigurator implements ContainerConfigurator {
	public static tContainer create() {
		return new tContainer(new ConfigVariableWithNickNamesConfigurator());
	}

	public String getName() {
		return "ConfigVariableWithNickNames";
	}

	public String getCandidates() {
		return "var:self";
	}

	public String getDomainClass() {
		return "artifact.Artifact";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("Config Variables");
		style.setLabelSize(12);
		style.setShowIcon(false);
		style.setHideLabelByDefault(false);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault()
				.getSystemColorDescription("light_green");
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
