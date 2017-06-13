package com.turasolutions.sirius.dsl.table;

import org.eclipse.sirius.table.metamodel.table.description.CreateLineTool;
import org.eclipse.sirius.table.metamodel.table.description.DescriptionFactory;
import org.eclipse.sirius.table.metamodel.table.description.LineMapping;

import com.turasolutions.sirius.dsl.config.LineConfiguration;
import com.turasolutions.sirius.dsl.viewpoint.tRoot;

public class tLine {
	private LineMapping lineMapping;

	public tLine(LineMapping lineMapping) {
		this.lineMapping = lineMapping;

		tRoot.context.put(lineMapping.getName() + tLine.class.getName(), this);
	}

	public tLine(LineConfiguration config) {
		this.lineMapping = DescriptionFactory.eINSTANCE.createLineMapping();
		this.lineMapping.setName(config.getName());
		this.lineMapping.setDomainClass(config.getDomainClass());
		this.lineMapping.setSemanticCandidatesExpression(config.getCandidates());
		this.lineMapping.setDefaultBackground(config.getBackgroundStyle());
		this.lineMapping.setDefaultForeground(config.getForegroundStyle());
		this.lineMapping.setHeaderLabelExpression(config.getHeaderLabelExpression());
		for (CreateLineTool tool : config.getCreateTools()) {
			tool.setMapping(this.lineMapping);
			this.lineMapping.getCreate().add(tool);
		}
		tRoot.context.put(this.lineMapping.getName() + tLine.class.getName(), this);
	}

	public LineMapping getLineMapping() {
		return this.lineMapping;
	}

	public tLine addChild(tLine line) {
		this.lineMapping.getOwnedSubLines().add(line.getLineMapping());
		return this;
	}
}
