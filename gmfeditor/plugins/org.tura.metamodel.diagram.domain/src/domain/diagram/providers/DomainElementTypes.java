/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * 
 */
package domain.diagram.providers;

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
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DomainDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

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

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return domain.diagram.providers.DomainElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return domain.diagram.providers.DomainElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return domain.diagram.providers.DomainElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
