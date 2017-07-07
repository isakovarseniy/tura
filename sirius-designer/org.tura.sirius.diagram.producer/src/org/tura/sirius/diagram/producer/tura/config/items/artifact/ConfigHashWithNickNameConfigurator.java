package org.tura.sirius.diagram.producer.tura.config.items.artifact;

import java.util.List;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.tura.sirius.dsl.config.NodeConfigurator;
import org.tura.sirius.dsl.diagram.tNode;

public class ConfigHashWithNickNameConfigurator implements NodeConfigurator {
	public static tNode create() {
		return new tNode(new ConfigHashWithNickNameConfigurator());
	}

	public String getName() {
		return "ConfigHashWithNickName";
	}

	public String getCandidates() {
		return "feature:configHashes";
	}

	public String getPreConditionExpression() {
		return null;
	}

	public String getDomainClass() {
		return "artifact.ConfigHashWithNickName";
	}

	public NodeStyleDescription getStyle() {
		SquareDescription style = StyleFactory.eINSTANCE.createSquareDescription();
		style.setLabelExpression("aql:self.name");
		style.setLabelSize(12);
		style.setLabelAlignment(LabelAlignment.LEFT);

		return style;
	}

	public List<ConditionalNodeStyleDescription> getConditionalStyle() {
		return null;
	}
}
