package org.tura.metamodel.commons.properties.selections.grid.impl.up;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.ContextParameters;

public class DefaultContextParametersDS extends ContextParameterDS {

	public DefaultContextParametersDS(GridProperty property) {
		super(property);
	}

	@Override
	public List<Object> queryRows() {
		try {
			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.ContextParameter> itr = ((ContextParameters) property
					.getModel()).getParameters().iterator(); itr
					.hasNext();) {
				rows.add(itr.next());
			}

			return rows;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

}
