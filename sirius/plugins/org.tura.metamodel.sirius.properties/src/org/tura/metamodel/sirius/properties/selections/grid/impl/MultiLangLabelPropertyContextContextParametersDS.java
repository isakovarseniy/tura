package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.Context;
import form.MultiLangLabel;

public class MultiLangLabelPropertyContextContextParametersDS extends GeneralContextContextParametersDS {

	public MultiLangLabelPropertyContextContextParametersDS(GridProperty property) {
		super(property);
	}

	@Override
	public Context getContext(Object obj) {
		return ((MultiLangLabel)( obj)).getMultiLangLabel();
	}

}
