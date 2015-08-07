/*
 * 
 */
package message.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import domain.DomainPackage;
import message.diagram.edit.parts.LanguageEditPart;
import message.diagram.edit.parts.MessageEditPart;
import message.diagram.edit.parts.MessageLibraryEditPart;
import message.diagram.edit.parts.MessagesEditPart;
import message.diagram.part.DomainDiagramEditorPlugin;

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
	public static final IElementType Messages_1701000 = getElementType(
			"org.tura.metamodel.diagram.message.Messages_1701000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MessageLibrary_1702001 = getElementType(
			"org.tura.metamodel.diagram.message.MessageLibrary_1702001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Language_1702002 = getElementType(
			"org.tura.metamodel.diagram.message.Language_1702002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Message_1703004 = getElementType(
			"org.tura.metamodel.diagram.message.Message_1703004"); //$NON-NLS-1$

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

			elements.put(Messages_1701000, DomainPackage.eINSTANCE.getMessages());

			elements.put(MessageLibrary_1702001, DomainPackage.eINSTANCE.getMessageLibrary());

			elements.put(Language_1702002, DomainPackage.eINSTANCE.getLanguage());

			elements.put(Message_1703004, DomainPackage.eINSTANCE.getMessage());
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
			KNOWN_ELEMENT_TYPES.add(Messages_1701000);
			KNOWN_ELEMENT_TYPES.add(MessageLibrary_1702001);
			KNOWN_ELEMENT_TYPES.add(Language_1702002);
			KNOWN_ELEMENT_TYPES.add(Message_1703004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MessagesEditPart.VISUAL_ID:
			return Messages_1701000;
		case MessageLibraryEditPart.VISUAL_ID:
			return MessageLibrary_1702001;
		case LanguageEditPart.VISUAL_ID:
			return Language_1702002;
		case MessageEditPart.VISUAL_ID:
			return Message_1703004;
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
			return message.diagram.providers.DomainElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return message.diagram.providers.DomainElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return message.diagram.providers.DomainElementTypes.getElement(elementTypeAdapter);
		}
	};

}
