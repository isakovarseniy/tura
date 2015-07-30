/*
 * 
 */
package style.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import style.diagram.edit.parts.StyleLibraryEditPart;
import style.diagram.edit.parts.StyleLibraryNameEditPart;
import style.diagram.edit.parts.StyleLibraryStyleLibraryStylesCompartmentEditPart;
import style.diagram.edit.parts.StyleSetEditPart;
import style.diagram.edit.parts.StyleSetNameEditPart;
import style.diagram.edit.parts.StylesEditPart;
import domain.DomainPackage;
import domain.Styles;

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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.style/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (StylesEditPart.MODEL_ID.equals(view.getType())) {
				return StylesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return style.diagram.part.DomainVisualIDRegistry.getVisualID(view.getType());
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
				DomainDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
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
		if (DomainPackage.eINSTANCE.getStyles().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Styles) domainElement)) {
			return StylesEditPart.VISUAL_ID;
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
		String containerModelID = style.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!StylesEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (StylesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = style.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = StylesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case StylesEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getStyleLibrary().isSuperTypeOf(domainElement.eClass())) {
				return StyleLibraryEditPart.VISUAL_ID;
			}
			break;
		case StyleLibraryStyleLibraryStylesCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getStyleSet().isSuperTypeOf(domainElement.eClass())) {
				return StyleSetEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = style.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!StylesEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (StylesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = style.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = StylesEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case StylesEditPart.VISUAL_ID:
			if (StyleLibraryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StyleLibraryEditPart.VISUAL_ID:
			if (StyleLibraryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StyleLibraryStyleLibraryStylesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StyleSetEditPart.VISUAL_ID:
			if (StyleSetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StyleLibraryStyleLibraryStylesCompartmentEditPart.VISUAL_ID:
			if (StyleSetEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(Styles element) {
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
		case StyleLibraryStyleLibraryStylesCompartmentEditPart.VISUAL_ID:
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
		case StylesEditPart.VISUAL_ID:
			return false;
		case StyleSetEditPart.VISUAL_ID:
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
			return style.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return style.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return style.diagram.part.DomainVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return style.diagram.part.DomainVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return style.diagram.part.DomainVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return style.diagram.part.DomainVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
