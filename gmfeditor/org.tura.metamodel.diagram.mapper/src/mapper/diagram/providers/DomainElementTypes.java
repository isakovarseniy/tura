/*
 * 
 */
package mapper.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import mapper.diagram.edit.parts.CSSMapperEditPart;
import mapper.diagram.edit.parts.JavaMapperEditPart;
import mapper.diagram.edit.parts.JavaScriptMapperEditPart;
import mapper.diagram.edit.parts.MappersEditPart;
import mapper.diagram.edit.parts.RoleMapperEditPart;
import mapper.diagram.part.DomainDiagramEditorPlugin;

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
	public static final IElementType Mappers_401000 = getElementType(
			"org.tura.metamodel.diagram.mapper.Mappers_401000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JavaMapper_402001 = getElementType(
			"org.tura.metamodel.diagram.mapper.JavaMapper_402001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JavaScriptMapper_402003 = getElementType(
			"org.tura.metamodel.diagram.mapper.JavaScriptMapper_402003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CSSMapper_402004 = getElementType(
			"org.tura.metamodel.diagram.mapper.CSSMapper_402004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RoleMapper_402005 = getElementType(
			"org.tura.metamodel.diagram.mapper.RoleMapper_402005"); //$NON-NLS-1$

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

			elements.put(Mappers_401000, DomainPackage.eINSTANCE.getMappers());

			elements.put(JavaMapper_402001, DomainPackage.eINSTANCE.getJavaMapper());

			elements.put(JavaScriptMapper_402003, DomainPackage.eINSTANCE.getJavaScriptMapper());

			elements.put(CSSMapper_402004, DomainPackage.eINSTANCE.getCSSMapper());

			elements.put(RoleMapper_402005, DomainPackage.eINSTANCE.getRoleMapper());
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
			KNOWN_ELEMENT_TYPES.add(Mappers_401000);
			KNOWN_ELEMENT_TYPES.add(JavaMapper_402001);
			KNOWN_ELEMENT_TYPES.add(JavaScriptMapper_402003);
			KNOWN_ELEMENT_TYPES.add(CSSMapper_402004);
			KNOWN_ELEMENT_TYPES.add(RoleMapper_402005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MappersEditPart.VISUAL_ID:
			return Mappers_401000;
		case JavaMapperEditPart.VISUAL_ID:
			return JavaMapper_402001;
		case JavaScriptMapperEditPart.VISUAL_ID:
			return JavaScriptMapper_402003;
		case CSSMapperEditPart.VISUAL_ID:
			return CSSMapper_402004;
		case RoleMapperEditPart.VISUAL_ID:
			return RoleMapper_402005;
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
			return mapper.diagram.providers.DomainElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return mapper.diagram.providers.DomainElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return mapper.diagram.providers.DomainElementTypes.getElement(elementTypeAdapter);
		}
	};

}
