/*
 * 
 */
package roles.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import roles.diagram.edit.parts.GroupEditPart;
import roles.diagram.edit.parts.GroupGroup2GroupEditPart;
import roles.diagram.edit.parts.GroupGroup2RoleEditPart;
import roles.diagram.edit.parts.RoleEditPart;
import roles.diagram.edit.parts.RolesEditPart;
import roles.diagram.part.DomainDiagramEditorPlugin;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainElementTypes {

	/**
	 * @generated
	 */
	private DomainElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DomainDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Roles_1401000 = getElementType("org.tura.metamodel.diagram.roles.Roles_1401000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_1402001 = getElementType("org.tura.metamodel.diagram.roles.Role_1402001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_1402002 = getElementType("org.tura.metamodel.diagram.roles.Group_1402002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupGroup2Group_1404003 = getElementType(
			"org.tura.metamodel.diagram.roles.GroupGroup2Group_1404003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupGroup2Role_1404005 = getElementType(
			"org.tura.metamodel.diagram.roles.GroupGroup2Role_1404005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Roles_1401000, DomainPackage.eINSTANCE.getRoles());

			elements.put(Role_1402001, DomainPackage.eINSTANCE.getRole());

			elements.put(Group_1402002, DomainPackage.eINSTANCE.getGroup());

			elements.put(GroupGroup2Group_1404003, DomainPackage.eINSTANCE.getGroup_Group2Group());

			elements.put(GroupGroup2Role_1404005, DomainPackage.eINSTANCE.getGroup_Group2Role());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Roles_1401000);
			KNOWN_ELEMENT_TYPES.add(Role_1402001);
			KNOWN_ELEMENT_TYPES.add(Group_1402002);
			KNOWN_ELEMENT_TYPES.add(GroupGroup2Group_1404003);
			KNOWN_ELEMENT_TYPES.add(GroupGroup2Role_1404005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RolesEditPart.VISUAL_ID:
			return Roles_1401000;
		case RoleEditPart.VISUAL_ID:
			return Role_1402001;
		case GroupEditPart.VISUAL_ID:
			return Group_1402002;
		case GroupGroup2GroupEditPart.VISUAL_ID:
			return GroupGroup2Group_1404003;
		case GroupGroup2RoleEditPart.VISUAL_ID:
			return GroupGroup2Role_1404005;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return roles.diagram.providers.DomainElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return roles.diagram.providers.DomainElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return roles.diagram.providers.DomainElementTypes.getElement(elementTypeAdapter);
		}
	};

}
