package com.turasolutions.sirius.diagram.producer.tura.config.items.message;

import org.eclipse.sirius.table.metamodel.table.description.BackgroundStyleDescription;
import org.eclipse.sirius.table.metamodel.table.description.DescriptionFactory;
import org.eclipse.sirius.table.metamodel.table.description.ForegroundStyleDescription;

import com.turasolutions.sirius.dsl.config.ColumnConfiguration;
import com.turasolutions.sirius.dsl.table.tColumn;

public class TranclationConfiguration implements ColumnConfiguration {
	public static tColumn create() {
		return new tColumn(new TranclationConfiguration());
	}

	public String getName() {
		return "Translatioin";
	}

	public BackgroundStyleDescription getBackgroundStype() {
		BackgroundStyleDescription style = DescriptionFactory.eINSTANCE.createBackgroundStyleDescription();
		return style;
	}

	public ForegroundStyleDescription getForegroundStyle() {
		ForegroundStyleDescription style = DescriptionFactory.eINSTANCE.createForegroundStyleDescription();
		return style;
	}

	public String getFeatureName() {
		return "translation";
	}
}
