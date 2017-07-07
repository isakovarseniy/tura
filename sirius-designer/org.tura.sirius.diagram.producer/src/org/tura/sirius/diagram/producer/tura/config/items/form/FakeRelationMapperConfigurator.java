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

public class FakeRelationMapperConfigurator implements ContainerConfigurator {
	public static tContainer create() {
		return new tContainer(new FakeRelationMapperConfigurator());
	}

	public String getName() {
		return "FakeRelationMapper";
	}

	public String getCandidates() {
		return "aql:self.objectMappers";
	}

	public String getDomainClass() {
		return "form.RelationMapper";
	}

	public ContainerStyleDescription getStyle() {
		FlatContainerStyleDescription style = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		style.setLabelExpression("service:generateName");
		style.setLabelSize(12);
		style.setBorderSizeComputationExpression("2");
		style.setShowIcon(false);
		SystemColor foregroundColor = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("orange");
		style.setForegroundColor(foregroundColor);

		return style;
	}

	public ContainerLayout getContainerLayout() {
		return ContainerLayout.FREE_FORM;
	}

	public List<ConditionalContainerStyleDescription> getConditionalStyle() {
		return null;
	}
}
