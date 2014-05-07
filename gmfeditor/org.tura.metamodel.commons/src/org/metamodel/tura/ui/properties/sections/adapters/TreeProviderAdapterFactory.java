package org.metamodel.tura.ui.properties.sections.adapters;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.metamodel.tura.ui.properties.sections.adapters.helper.TreeRoot;
import org.metamodel.tura.ui.properties.sections.adapters.helper.TriggerHolder;

public class TreeProviderAdapterFactory implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	private static final Class[] TYPES = { IWorkbenchAdapter.class, IReturnTypeProvider.class};
	private TreeRootProvider treeRootProvider;
	private ControlsProvider controlsProvider;
	private DataControlProvider dataControlProvider;
	private TriggerProvider triggerProvider;
	private TypeElementProvider typeElementProvider;
	private AttributeProvider attributeProvider;
	private TypesProvider typesProvider;
	private PackageProvider packageProvider;
	private OperationProvider operationProvider;
	private ApplicationRoleProvider applicationRoleProvider;
	private GroupProvider groupProvider;
	private RoleProvider roleProvider;

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return TYPES;
	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IWorkbenchAdapter.class || adapterType == IReturnTypeProvider.class) {
			if (adaptableObject instanceof TreeRoot)
				return getTreeRootProvider();
			if (adaptableObject instanceof domain.Controls)
				return getControlsProvider();
			if (adaptableObject instanceof domain.DataControl)
				return getDataControlProvider();
			if (adaptableObject instanceof TriggerHolder)
				return getTriggerProvider();
			if (adaptableObject instanceof domain.TypeElement)
				return getTypeElementProvider();
			if (adaptableObject instanceof domain.Attribute)
				return getAttributeProvider();
			if (adaptableObject instanceof domain.Operation)
				return getOperationProvider();
			if (adaptableObject instanceof domain.Types)
				return getTypesProvider();
			if (adaptableObject instanceof domain.Package)
				return getPackageProvider();
			if (adaptableObject instanceof domain.ApplicationRole)
				return getApplicationRoleProvider();
			if (adaptableObject instanceof domain.Group)
				return getGroupProvider();
			if (adaptableObject instanceof domain.Role)
				return getRoleProvider();
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

	protected TypeElementProvider getTypeElementProvider() {
		if (typeElementProvider == null)
			typeElementProvider = new TypeElementProvider();
		return typeElementProvider;
	}


	protected AttributeProvider getAttributeProvider() {
		if (attributeProvider == null)
			attributeProvider = new AttributeProvider();
		return attributeProvider;
	}

	protected OperationProvider getOperationProvider() {
		if (operationProvider == null)
			operationProvider = new OperationProvider();
		return operationProvider;
	}

	protected TypesProvider getTypesProvider() {
		if (typesProvider == null)
			typesProvider = new TypesProvider();
		return typesProvider;
	}


	protected PackageProvider getPackageProvider() {
		if (packageProvider == null)
			packageProvider = new PackageProvider();
		return packageProvider;
	}

	protected ApplicationRoleProvider getApplicationRoleProvider() {
		if (applicationRoleProvider == null)
			applicationRoleProvider = new ApplicationRoleProvider();
		return applicationRoleProvider;
	}

	protected GroupProvider getGroupProvider() {
		if (groupProvider == null)
			groupProvider = new GroupProvider();
		return groupProvider;
	}

	protected RoleProvider getRoleProvider() {
		if (roleProvider == null)
			roleProvider = new RoleProvider();
		return roleProvider;
	}
	
}
