/*
 * 
 */
package domain.diagram.providers;

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

import domain.DomainPackage;
import domain.diagram.edit.parts.ContinuousIintegrationEditPart;
import domain.diagram.edit.parts.DomainApplicationEditPart;
import domain.diagram.edit.parts.DomainApplicationsEditPart;
import domain.diagram.edit.parts.DomainArtifactEditPart;
import domain.diagram.edit.parts.DomainArtifactsEditPart;
import domain.diagram.edit.parts.DomainEditPart;
import domain.diagram.edit.parts.DomainTypesEditPart;
import domain.diagram.edit.parts.EJBServiceEditPart;
import domain.diagram.edit.parts.JPAServiceEditPart;
import domain.diagram.edit.parts.ORMEntityEditPart;
import domain.diagram.part.DomainDiagramEditorPlugin;

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
	public static final IElementType Domain_501000 = getElementType("org.tura.metamodel.diagram.domain.Domain_501000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainArtifacts_502001 = getElementType("org.tura.metamodel.diagram.domain.DomainArtifacts_502001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainApplications_502003 = getElementType("org.tura.metamodel.diagram.domain.DomainApplications_502003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainTypes_502002 = getElementType("org.tura.metamodel.diagram.domain.DomainTypes_502002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ORMEntity_503003 = getElementType("org.tura.metamodel.diagram.domain.ORMEntity_503003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JPAService_503004 = getElementType("org.tura.metamodel.diagram.domain.JPAService_503004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EJBService_503005 = getElementType("org.tura.metamodel.diagram.domain.EJBService_503005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContinuousIintegration_503006 = getElementType("org.tura.metamodel.diagram.domain.ContinuousIintegration_503006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainArtifact_503002 = getElementType("org.tura.metamodel.diagram.domain.DomainArtifact_503002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainApplication_503001 = getElementType("org.tura.metamodel.diagram.domain.DomainApplication_503001"); //$NON-NLS-1$

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

			elements.put(Domain_501000, DomainPackage.eINSTANCE.getDomain());

			elements.put(DomainArtifacts_502001,
					DomainPackage.eINSTANCE.getDomainArtifacts());

			elements.put(DomainApplications_502003,
					DomainPackage.eINSTANCE.getDomainApplications());

			elements.put(DomainTypes_502002,
					DomainPackage.eINSTANCE.getDomainTypes());

			elements.put(ORMEntity_503003,
					DomainPackage.eINSTANCE.getORMEntity());

			elements.put(JPAService_503004,
					DomainPackage.eINSTANCE.getJPAService());

			elements.put(EJBService_503005,
					DomainPackage.eINSTANCE.getEJBService());

			elements.put(ContinuousIintegration_503006,
					DomainPackage.eINSTANCE.getContinuousIintegration());

			elements.put(DomainArtifact_503002,
					DomainPackage.eINSTANCE.getDomainArtifact());

			elements.put(DomainApplication_503001,
					DomainPackage.eINSTANCE.getDomainApplication());
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
			KNOWN_ELEMENT_TYPES.add(Domain_501000);
			KNOWN_ELEMENT_TYPES.add(DomainArtifacts_502001);
			KNOWN_ELEMENT_TYPES.add(DomainApplications_502003);
			KNOWN_ELEMENT_TYPES.add(DomainTypes_502002);
			KNOWN_ELEMENT_TYPES.add(ORMEntity_503003);
			KNOWN_ELEMENT_TYPES.add(JPAService_503004);
			KNOWN_ELEMENT_TYPES.add(EJBService_503005);
			KNOWN_ELEMENT_TYPES.add(ContinuousIintegration_503006);
			KNOWN_ELEMENT_TYPES.add(DomainArtifact_503002);
			KNOWN_ELEMENT_TYPES.add(DomainApplication_503001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DomainEditPart.VISUAL_ID:
			return Domain_501000;
		case DomainArtifactsEditPart.VISUAL_ID:
			return DomainArtifacts_502001;
		case DomainApplicationsEditPart.VISUAL_ID:
			return DomainApplications_502003;
		case DomainTypesEditPart.VISUAL_ID:
			return DomainTypes_502002;
		case ORMEntityEditPart.VISUAL_ID:
			return ORMEntity_503003;
		case JPAServiceEditPart.VISUAL_ID:
			return JPAService_503004;
		case EJBServiceEditPart.VISUAL_ID:
			return EJBService_503005;
		case ContinuousIintegrationEditPart.VISUAL_ID:
			return ContinuousIintegration_503006;
		case DomainArtifactEditPart.VISUAL_ID:
			return DomainArtifact_503002;
		case DomainApplicationEditPart.VISUAL_ID:
			return DomainApplication_503001;
		}
		return null;
	}

}
