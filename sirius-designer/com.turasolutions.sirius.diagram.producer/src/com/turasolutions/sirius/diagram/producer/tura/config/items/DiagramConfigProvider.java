package com.turasolutions.sirius.diagram.producer.tura.config.items;

import com.turasolutions.sirius.diagram.producer.tura.config.items.domain.DomainArtifactsConfigurator;
import com.turasolutions.sirius.dsl.config.ConfigProvider;

public class DiagramConfigProvider implements ConfigProvider {
	public Object getConfigurator(String type) {
		return new DomainArtifactsConfigurator();
	}
}
