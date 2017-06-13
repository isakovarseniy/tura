package com.turasolutions.sirius.diagram.producer.tura.config.items.form;

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

public class RelationsMapperConfigurator implements ContainerConfigurator {
	public static tContainer create() {
		return new tContainer(new RelationsMapperConfigurator());
	}

	public String getName() {
		return "RelarionsMapper";
	}

	public String getCandidates() {
		return "var:self";
	}

	public String getDomainClass() {
		return "form.DataControl";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("RelarionsMapper");
		style.setLabelSize(12);
		style.setShowIcon(false);
		style.setHideLabelByDefault(true);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("green");
		style.setForegroundColor(foregroundColor);
		style.setBorderSizeComputationExpression("1");

		return style;
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.LIST;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		return null;
	}
}
