package org.tura.sirius.dsl.diagram;

import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.tura.sirius.dsl.config.EdgeConfigurator;
import org.tura.sirius.dsl.config.ObjectWrapper;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class tEdge implements ObjectWrapper {
	private EdgeMapping edge;

	public tEdge(EdgeMapping edge) {
		this.edge = edge;
		tRoot.context.put(edge.getName() + tEdge.class.getName(), this);
	}

	public tEdge(EdgeConfigurator config) {
		this.edge = DescriptionFactory.eINSTANCE.createEdgeMappingUsingDomainElement();
		this.edge.setName(config.getName());
		this.edge.setSemanticCandidatesExpression(config.getCandidates());
		this.edge.setDomainClass(config.getDomainClass());
		this.edge.setPreconditionExpression(config.getPreConditionExpression());
		if (config.getStyle() != null) {
			this.edge.setStyle(config.getStyle());
		}
		if (config.getConditionalStyle() != null) {
			this.edge.getConditionnalStyles().addAll(config.getConditionalStyle());
		}
		this.edge.setSourceFinderExpression(config.getSourceFinderExpression());
		this.edge.setTargetFinderExpression(config.getTargetFinderExpression());
		for (String src : config.getSource()) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get(src);
			AbstractNodeMapping source = (AbstractNodeMapping) wrapper.getWrapedObject();
			if (source == null) {
				throw new RuntimeException("tEdge mapping is null");
			}
			this.edge.getSourceMapping().add(source);
		}
		for (String trg : config.getTarget()) {
			ObjectWrapper wrapper = (ObjectWrapper) tRoot.context.get(trg);
			AbstractNodeMapping target = (AbstractNodeMapping) wrapper.getWrapedObject();
			if (target == null) {
				throw new RuntimeException("tEdge mapping is null");
			}
			this.edge.getTargetMapping().add(target);
		}
		tRoot.context.put(this.edge.getName() + tEdge.class.getName(), this);
	}

	public EdgeMapping getEdgeMapping() {
		return this.edge;
	}

	public Object getWrapedObject() {
		return this.edge;
	}
}
