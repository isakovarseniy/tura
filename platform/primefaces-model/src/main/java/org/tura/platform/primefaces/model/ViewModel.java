package org.tura.platform.primefaces.model;

import java.util.HashMap;
import java.util.logging.Logger;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.TreeDataControl;

@ViewScoped
public class ViewModel {

	@Inject
	private ELResolver elResolver;
	@Inject
	private Logger logger;
	private HashMap<String, Object> modelHolder = new HashMap<>();

	@SuppressWarnings("rawtypes")
	public Object getModel(String modelId, String expression, String modelType,
			Object... parameters) {

		Object model = modelHolder.get(modelId);
		if (model != null)
			return model;

		Object obj = elResolver.getValue(expression);
		if ("grid".equals(modelType))
			return getGridModel((DataControl) obj, logger);

		if ("tree".equals(modelType))
			return getTreeModel((TreeDataControl) obj);

		return null;

	}

	@SuppressWarnings("rawtypes")
	private GridModel getGridModel(DataControl dc, Logger logger) {
		return new GridModel(dc, logger);
	}

	private TreeModel getTreeModel(TreeDataControl dc) {
		return new TreeModel(dc);
	}

}
