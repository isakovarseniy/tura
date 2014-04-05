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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import deployment.diagram.edit.parts.DeploymentComponentDeploymentComponentEditPart;
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
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponents_901000 = getElementType("org.tura.metamodel.diagram.deployment.DeploymentComponents_901000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponent_902001 = getElementType("org.tura.metamodel.diagram.deployment.DeploymentComponent_902001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStep_902002 = getElementType("org.tura.metamodel.diagram.deployment.DeploymentStarStep_902002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponentDeploymentComponent_904012 = getElementType("org.tura.metamodel.diagram.deployment.DeploymentComponentDeploymentComponent_904012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStepFirstStep_904008 = getElementType("org.tura.metamodel.diagram.deployment.DeploymentStarStepFirstStep_904008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeDeployment_904013 = getElementType("org.tura.metamodel.diagram.deployment.RecipeDeployment_904013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return DomainDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
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

			elements.put(DeploymentComponents_901000,
					DomainPackage.eINSTANCE.getDeploymentComponents());

			elements.put(DeploymentComponent_902001,
					DomainPackage.eINSTANCE.getDeploymentComponent());

			elements.put(DeploymentStarStep_902002,
					DomainPackage.eINSTANCE.getDeploymentStarStep());

			elements.put(DeploymentComponentDeploymentComponent_904012,
					DomainPackage.eINSTANCE
							.getDeploymentComponent_DeploymentComponent());

			elements.put(DeploymentStarStepFirstStep_904008,
					DomainPackage.eINSTANCE.getDeploymentStarStep_FirstStep());

			elements.put(RecipeDeployment_904013,
					DomainPackage.eINSTANCE.getRecipe_Deployment());
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
			KNOWN_ELEMENT_TYPES
					.add(DeploymentComponentDeploymentComponent_904012);
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
		case DeploymentComponentDeploymentComponentEditPart.VISUAL_ID:
			return DeploymentComponentDeploymentComponent_904012;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return DeploymentStarStepFirstStep_904008;
		case RecipeDeploymentEditPart.VISUAL_ID:
			return RecipeDeployment_904013;
		}
		return null;
	}

}
