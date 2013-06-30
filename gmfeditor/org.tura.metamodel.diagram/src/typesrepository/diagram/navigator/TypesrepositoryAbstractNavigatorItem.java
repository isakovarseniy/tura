/*
 * 
 */
package typesrepository.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * @generated
 */
public abstract class TypesrepositoryAbstractNavigatorItem extends
		PlatformObject {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { ITabbedPropertySheetPageContributor.class };
		final ITabbedPropertySheetPageContributor propertySheetPageContributor = new ITabbedPropertySheetPageContributor() {
			public String getContributorId() {
				return "org.tura.metamodel.diagram"; //$NON-NLS-1$
			}
		};
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof typesrepository.diagram.navigator.TypesrepositoryAbstractNavigatorItem
								&& adapterType == ITabbedPropertySheetPageContributor.class) {
							return propertySheetPageContributor;
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				typesrepository.diagram.navigator.TypesrepositoryAbstractNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private Object myParent;

	/**
	 * @generated
	 */
	protected TypesrepositoryAbstractNavigatorItem(Object parent) {
		myParent = parent;
	}

	/**
	 * @generated
	 */
	public Object getParent() {
		return myParent;
	}

}
