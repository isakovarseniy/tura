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

import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.ConfigVariableEditPart;
import artifact.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import artifact.diagram.edit.parts.RecipeRecipeConfigEditPart;
import artifact.diagram.edit.parts.SpecifierEditPart;
import artifact.diagram.edit.parts.TypeExtensionEditPart;
import artifact.diagram.edit.parts.VariableEditPart;
import artifact.diagram.part.DomainDiagramEditorPlugin;
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
	public static final IElementType Artifacts_701000 = getElementType("org.tura.metamodel.diagram.artifact.Artifacts_701000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Artifact_702001 = getElementType("org.tura.metamodel.diagram.artifact.Artifact_702001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigVariable_703004 = getElementType("org.tura.metamodel.diagram.artifact.ConfigVariable_703004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Variable_703002 = getElementType("org.tura.metamodel.diagram.artifact.Variable_703002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Specifier_703003 = getElementType("org.tura.metamodel.diagram.artifact.Specifier_703003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_704001 = getElementType("org.tura.metamodel.diagram.artifact.TypeExtension_704001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeRecipeConfig_704002 = getElementType("org.tura.metamodel.diagram.artifact.RecipeRecipeConfig_704002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_704003 = getElementType("org.tura.metamodel.diagram.artifact.ConfigurationConfigExtension_704003"); //$NON-NLS-1$

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

			elements.put(Artifacts_701000,
					DomainPackage.eINSTANCE.getArtifacts());

			elements.put(Artifact_702001, DomainPackage.eINSTANCE.getArtifact());

			elements.put(ConfigVariable_703004,
					DomainPackage.eINSTANCE.getConfigVariable());

			elements.put(Variable_703002, DomainPackage.eINSTANCE.getVariable());

			elements.put(Specifier_703003,
					DomainPackage.eINSTANCE.getSpecifier());

			elements.put(TypeExtension_704001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(RecipeRecipeConfig_704002,
					DomainPackage.eINSTANCE.getRecipe_RecipeConfig());

			elements.put(ConfigurationConfigExtension_704003,
					DomainPackage.eINSTANCE.getConfiguration_ConfigExtension());
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
			KNOWN_ELEMENT_TYPES.add(Artifacts_701000);
			KNOWN_ELEMENT_TYPES.add(Artifact_702001);
			KNOWN_ELEMENT_TYPES.add(ConfigVariable_703004);
			KNOWN_ELEMENT_TYPES.add(Variable_703002);
			KNOWN_ELEMENT_TYPES.add(Specifier_703003);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_704001);
			KNOWN_ELEMENT_TYPES.add(RecipeRecipeConfig_704002);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_704003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArtifactsEditPart.VISUAL_ID:
			return Artifacts_701000;
		case ArtifactEditPart.VISUAL_ID:
			return Artifact_702001;
		case ConfigVariableEditPart.VISUAL_ID:
			return ConfigVariable_703004;
		case VariableEditPart.VISUAL_ID:
			return Variable_703002;
		case SpecifierEditPart.VISUAL_ID:
			return Specifier_703003;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_704001;
		case RecipeRecipeConfigEditPart.VISUAL_ID:
			return RecipeRecipeConfig_704002;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_704003;
		}
		return null;
	}

}
