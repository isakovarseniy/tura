/*
 * 
 */
package artifact.diagram.providers;

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

import artifact.ArtifactPackage;
import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.SpecifierEditPart;
import artifact.diagram.edit.parts.Variable2EditPart;
import artifact.diagram.edit.parts.VariableEditPart;
import artifact.diagram.part.ArtifactDiagramEditorPlugin;

/**
 * @generated
 */
public class ArtifactElementTypes {

	/**
	 * @generated
	 */
	private ArtifactElementTypes() {
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
	public static final IElementType Artifacts_1000 = getElementType("org.tura.metamodel.artifact.Artifacts_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Artifact_2001 = getElementType("org.tura.metamodel.artifact.Artifact_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Variable_3001 = getElementType("org.tura.metamodel.artifact.Variable_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Variable_3002 = getElementType("org.tura.metamodel.artifact.Variable_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Specifier_3003 = getElementType("org.tura.metamodel.artifact.Specifier_3003"); //$NON-NLS-1$

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
				return ArtifactDiagramEditorPlugin.getInstance()
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

			elements.put(Artifacts_1000,
					ArtifactPackage.eINSTANCE.getArtifacts());

			elements.put(Artifact_2001, ArtifactPackage.eINSTANCE.getArtifact());

			elements.put(Variable_3001, ArtifactPackage.eINSTANCE.getVariable());

			elements.put(Variable_3002, ArtifactPackage.eINSTANCE.getVariable());

			elements.put(Specifier_3003,
					ArtifactPackage.eINSTANCE.getSpecifier());
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
			KNOWN_ELEMENT_TYPES.add(Artifacts_1000);
			KNOWN_ELEMENT_TYPES.add(Artifact_2001);
			KNOWN_ELEMENT_TYPES.add(Variable_3001);
			KNOWN_ELEMENT_TYPES.add(Variable_3002);
			KNOWN_ELEMENT_TYPES.add(Specifier_3003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArtifactsEditPart.VISUAL_ID:
			return Artifacts_1000;
		case ArtifactEditPart.VISUAL_ID:
			return Artifact_2001;
		case VariableEditPart.VISUAL_ID:
			return Variable_3001;
		case Variable2EditPart.VISUAL_ID:
			return Variable_3002;
		case SpecifierEditPart.VISUAL_ID:
			return Specifier_3003;
		}
		return null;
	}

}
