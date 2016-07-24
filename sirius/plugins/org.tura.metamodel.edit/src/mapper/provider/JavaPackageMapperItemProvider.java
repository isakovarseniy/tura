/**
 */
package mapper.provider;


import java.util.Collection;
import java.util.List;

import mapper.JavaPackageMapper;
import mapper.MapperPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mapper.JavaPackageMapper} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaPackageMapperItemProvider extends PackageMapperItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPackageMapperItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUidPropertyDescriptor(object);
			addMappedToPackageNamePropertyDescriptor(object);
			addArtifactIdPropertyDescriptor(object);
			addGroupIdPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addLibraryNamePropertyDescriptor(object);
			addArtifactTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaPackageMapper_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaPackageMapper_uid_feature", "_UI_JavaPackageMapper_type"),
				 MapperPackage.Literals.JAVA_PACKAGE_MAPPER__UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapped To Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappedToPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaPackageMapper_mappedToPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaPackageMapper_mappedToPackageName_feature", "_UI_JavaPackageMapper_type"),
				 MapperPackage.Literals.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifact Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaPackageMapper_artifactId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaPackageMapper_artifactId_feature", "_UI_JavaPackageMapper_type"),
				 MapperPackage.Literals.JAVA_PACKAGE_MAPPER__ARTIFACT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaPackageMapper_groupId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaPackageMapper_groupId_feature", "_UI_JavaPackageMapper_type"),
				 MapperPackage.Literals.JAVA_PACKAGE_MAPPER__GROUP_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaPackageMapper_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaPackageMapper_version_feature", "_UI_JavaPackageMapper_type"),
				 MapperPackage.Literals.JAVA_PACKAGE_MAPPER__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Library Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLibraryNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaPackageMapper_libraryName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaPackageMapper_libraryName_feature", "_UI_JavaPackageMapper_type"),
				 MapperPackage.Literals.JAVA_PACKAGE_MAPPER__LIBRARY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifact Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaPackageMapper_artifactType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaPackageMapper_artifactType_feature", "_UI_JavaPackageMapper_type"),
				 MapperPackage.Literals.JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns JavaPackageMapper.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JavaPackageMapper"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JavaPackageMapper)object).getMappedToPackageName();
		return label == null || label.length() == 0 ?
			getString("_UI_JavaPackageMapper_type") :
			getString("_UI_JavaPackageMapper_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(JavaPackageMapper.class)) {
			case MapperPackage.JAVA_PACKAGE_MAPPER__UID:
			case MapperPackage.JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME:
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_ID:
			case MapperPackage.JAVA_PACKAGE_MAPPER__GROUP_ID:
			case MapperPackage.JAVA_PACKAGE_MAPPER__VERSION:
			case MapperPackage.JAVA_PACKAGE_MAPPER__LIBRARY_NAME:
			case MapperPackage.JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
