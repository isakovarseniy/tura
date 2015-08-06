/*
 * 
 */
package deployment.diagram.providers;

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

import deployment.diagram.edit.parts.DeploymentComponentDeploymentComponentLinkEditPart;
import deployment.diagram.edit.parts.DeploymentComponentEditPart;
import deployment.diagram.edit.parts.DeploymentComponentsEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import deployment.diagram.edit.parts.RecipeDeploymentEditPart;
import deployment.diagram.part.DomainDiagramEditorPlugin;
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
	public static final IElementType DeploymentComponents_901000 = getElementType(
			"org.tura.metamodel.diagram.deployment.DeploymentComponents_901000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponent_902001 = getElementType(
			"org.tura.metamodel.diagram.deployment.DeploymentComponent_902001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStep_902002 = getElementType(
			"org.tura.metamodel.diagram.deployment.DeploymentStarStep_902002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponentDeploymentComponentLink_904014 = getElementType(
			"org.tura.metamodel.diagram.deployment.DeploymentComponentDeploymentComponentLink_904014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStepFirstStep_904008 = getElementType(
			"org.tura.metamodel.diagram.deployment.DeploymentStarStepFirstStep_904008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeDeployment_904013 = getElementType(
			"org.tura.metamodel.diagram.deployment.RecipeDeployment_904013"); //$NON-NLS-1$

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

			elements.put(DeploymentComponents_901000, DomainPackage.eINSTANCE.getDeploymentComponents());

			elements.put(DeploymentComponent_902001, DomainPackage.eINSTANCE.getDeploymentComponent());

			elements.put(DeploymentStarStep_902002, DomainPackage.eINSTANCE.getDeploymentStarStep());

			elements.put(DeploymentComponentDeploymentComponentLink_904014,
					DomainPackage.eINSTANCE.getDeploymentComponent_DeploymentComponentLink());

			elements.put(DeploymentStarStepFirstStep_904008, DomainPackage.eINSTANCE.getDeploymentStarStep_FirstStep());

			elements.put(RecipeDeployment_904013, DomainPackage.eINSTANCE.getRecipe_Deployment());
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
			KNOWN_ELEMENT_TYPES.add(DeploymentComponents_901000);
			KNOWN_ELEMENT_TYPES.add(DeploymentComponent_902001);
			KNOWN_ELEMENT_TYPES.add(DeploymentStarStep_902002);
			KNOWN_ELEMENT_TYPES.add(DeploymentComponentDeploymentComponentLink_904014);
			KNOWN_ELEMENT_TYPES.add(DeploymentStarStepFirstStep_904008);
			KNOWN_ELEMENT_TYPES.add(RecipeDeployment_904013);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DeploymentComponentsEditPart.VISUAL_ID:
			return DeploymentComponents_901000;
		case DeploymentComponentEditPart.VISUAL_ID:
			return DeploymentComponent_902001;
		case DeploymentStarStepEditPart.VISUAL_ID:
			return DeploymentStarStep_902002;
		case DeploymentComponentDeploymentComponentLinkEditPart.VISUAL_ID:
			return DeploymentComponentDeploymentComponentLink_904014;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return DeploymentStarStepFirstStep_904008;
		case RecipeDeploymentEditPart.VISUAL_ID:
			return RecipeDeployment_904013;
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
			return deployment.diagram.providers.DomainElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return deployment.diagram.providers.DomainElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return deployment.diagram.providers.DomainElementTypes.getElement(elementTypeAdapter);
		}
	};

}
