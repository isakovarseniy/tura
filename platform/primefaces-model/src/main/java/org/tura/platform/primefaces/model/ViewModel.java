package org.tura.platform.primefaces.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.logging.Logger;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.TreeDataControl;

@ViewScoped
@Named("viewmodel")
public class ViewModel  implements Serializable {
    private static final long serialVersionUID = 1L;

	@Inject
	private transient Logger logger;
	private HashMap<String, Object> modelHolder = new HashMap<>();

	@SuppressWarnings("rawtypes")
	public Object getModel(String modelId,  String modelType,Object obj) {

		Object model = modelHolder.get(modelId);
		if (model != null)
			return model;

		if ("grid".equals(modelType))
			model = getGridModel((DataControl) obj, logger);

		if ("tree".equals(modelType))
			model =  getTreeModel((TreeDataControl) obj);

		modelHolder.put(modelId, model);
		return model;

	}

	@SuppressWarnings("rawtypes")
	private GridModel getGridModel(DataControl dc, Logger logger) {
		return new GridModel(dc, logger);
	}

	private TreeModel getTreeModel(TreeDataControl dc) {
		return new TreeModel(dc);
	}

}
