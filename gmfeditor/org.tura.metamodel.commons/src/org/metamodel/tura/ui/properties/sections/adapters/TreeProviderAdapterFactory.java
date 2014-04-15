package org.metamodel.tura.ui.properties.sections.adapters;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.metamodel.tura.ui.properties.sections.grid.impl.TreeRoot;

public class TreeProviderAdapterFactory implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	private static final Class[] TYPES = { IWorkbenchAdapter.class, };
	private TreeRootProvider treeRootProvider;
	private ControlsProvider controlsProvider;
	private DataControlProvider dataControlProvider;
	private TriggerProvider triggerProvider;

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return TYPES;
	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IWorkbenchAdapter.class) {
			if (adaptableObject instanceof TreeRoot)
				return getTreeRootProvider();
			if (adaptableObject instanceof domain.Controls)
				return getControlsProvider();
			if (adaptableObject instanceof domain.DataControl)
				return getDataControlProvider();
			if (adaptableObject instanceof domain.Trigger)
				return getTriggerProvider();
		}
		return null;
	}

	protected TreeRootProvider getTreeRootProvider() {
		if (treeRootProvider == null)
			treeRootProvider = new TreeRootProvider();
		return treeRootProvider;
	}

	protected ControlsProvider getControlsProvider() {
		if (controlsProvider == null)
			controlsProvider = new ControlsProvider();
		return controlsProvider;
	}

	protected DataControlProvider getDataControlProvider() {
		if (dataControlProvider == null)
			dataControlProvider = new DataControlProvider();
		return dataControlProvider;
	}


	protected TriggerProvider getTriggerProvider() {
		if (triggerProvider == null)
			triggerProvider = new TriggerProvider();
		return triggerProvider;
	}


}
