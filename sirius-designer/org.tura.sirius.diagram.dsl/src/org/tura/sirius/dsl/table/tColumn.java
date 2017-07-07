package org.tura.sirius.dsl.table;

import org.eclipse.sirius.table.metamodel.table.description.DescriptionFactory;
import org.eclipse.sirius.table.metamodel.table.description.FeatureColumnMapping;
import org.tura.sirius.dsl.config.ColumnConfiguration;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class tColumn {
	private FeatureColumnMapping columnMapping;

	public tColumn(FeatureColumnMapping columnMapping) {
		this.columnMapping = columnMapping;

		tRoot.context.put(columnMapping.getName() + tColumn.class.getName(), this);
	}

	public tColumn(ColumnConfiguration config) {
		this.columnMapping = DescriptionFactory.eINSTANCE.createFeatureColumnMapping();
		this.columnMapping.setName(config.getName());
		this.columnMapping.setDefaultBackground(config.getBackgroundStype());
		this.columnMapping.setDefaultForeground(config.getForegroundStyle());
		this.columnMapping.setFeatureName(config.getFeatureName());

		tRoot.context.put(this.columnMapping.getName() + tColumn.class.getName(), this);
	}

	public FeatureColumnMapping getColumnMapping() {
		return this.columnMapping;
	}
}
