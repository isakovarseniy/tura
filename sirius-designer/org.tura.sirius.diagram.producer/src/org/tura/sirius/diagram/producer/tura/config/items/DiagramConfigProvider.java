package org.tura.sirius.diagram.producer.tura.config.items;

import org.tura.sirius.diagram.producer.tura.config.items.domain.DomainArtifactsConfigurator;
import org.tura.sirius.dsl.config.ConfigProvider;

public class DiagramConfigProvider implements ConfigProvider {
	public Object getConfigurator(String type) {
		return new DomainArtifactsConfigurator();
	}
}
