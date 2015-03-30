/*
 * 
 */
package message.diagram.part;

import message.diagram.edit.parts.LanguageEditPart;
import message.diagram.edit.parts.LanguageLangEditPart;
import message.diagram.edit.parts.MessageEditPart;
import message.diagram.edit.parts.MessageLibraryEditPart;
import message.diagram.edit.parts.MessageLibraryMessageLibraryMessagesCompartmentEditPart;
import message.diagram.edit.parts.MessageLibraryNameEditPart;
import message.diagram.edit.parts.MessageNameEditPart;
import message.diagram.edit.parts.MessagesEditPart;

import message.diagram.edit.parts.WrappingLabelEditPart;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import domain.DomainPackage;
import domain.Messages;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DomainVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.message/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MessagesEditPart.MODEL_ID.equals(view.getType())) {
				return MessagesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return message.diagram.part.DomainVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				DomainDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DomainPackage.eINSTANCE.getMessages().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Messages) domainElement)) {
			return MessagesEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = message.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!MessagesEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MessagesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = message.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MessagesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MessagesEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getMessageLibrary().isSuperTypeOf(domainElement.eClass())) {
				return MessageLibraryEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLanguage().isSuperTypeOf(domainElement.eClass())) {
				return LanguageEditPart.VISUAL_ID;
			}
			break;
		case MessageLibraryMessageLibraryMessagesCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getMessage().isSuperTypeOf(domainElement.eClass())) {
				return MessageEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = message.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!MessagesEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MessagesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = message.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MessagesEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MessagesEditPart.VISUAL_ID:
			if (MessageLibraryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LanguageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageLibraryEditPart.VISUAL_ID:
			if (MessageLibraryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageLibraryMessageLibraryMessagesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LanguageEditPart.VISUAL_ID:
			if (LanguageLangEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageEditPart.VISUAL_ID:
			if (MessageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageLibraryMessageLibraryMessagesCompartmentEditPart.VISUAL_ID:
			if (MessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Messages element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case MessageLibraryMessageLibraryMessagesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MessagesEditPart.VISUAL_ID:
			return false;
		case LanguageEditPart.VISUAL_ID:
		case MessageEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return message.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return message.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return message.diagram.part.DomainVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return message.diagram.part.DomainVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return message.diagram.part.DomainVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return message.diagram.part.DomainVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
