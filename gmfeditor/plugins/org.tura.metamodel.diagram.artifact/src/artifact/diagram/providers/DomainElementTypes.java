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
package artifact.diagram.providers;

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

import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.ConfigVariableEditPart;
import artifact.diagram.edit.parts.GenerationHintEditPart;
import artifact.diagram.edit.parts.ModelQueryEditPart;
import artifact.diagram.edit.parts.SpecifierEditPart;
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
	public static final IElementType ModelQuery_703005 = getElementType("org.tura.metamodel.diagram.artifact.ModelQuery_703005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Specifier_703003 = getElementType("org.tura.metamodel.diagram.artifact.Specifier_703003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GenerationHint_703006 = getElementType("org.tura.metamodel.diagram.artifact.GenerationHint_703006"); //$NON-NLS-1$

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

			elements.put(Artifacts_701000,
					DomainPackage.eINSTANCE.getArtifacts());

			elements.put(Artifact_702001, DomainPackage.eINSTANCE.getArtifact());

			elements.put(ConfigVariable_703004,
					DomainPackage.eINSTANCE.getConfigVariable());

			elements.put(ModelQuery_703005,
					DomainPackage.eINSTANCE.getModelQuery());

			elements.put(Specifier_703003,
					DomainPackage.eINSTANCE.getSpecifier());

			elements.put(GenerationHint_703006,
					DomainPackage.eINSTANCE.getGenerationHint());
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
			KNOWN_ELEMENT_TYPES.add(ModelQuery_703005);
			KNOWN_ELEMENT_TYPES.add(Specifier_703003);
			KNOWN_ELEMENT_TYPES.add(GenerationHint_703006);
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
		case ModelQueryEditPart.VISUAL_ID:
			return ModelQuery_703005;
		case SpecifierEditPart.VISUAL_ID:
			return Specifier_703003;
		case GenerationHintEditPart.VISUAL_ID:
			return GenerationHint_703006;
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
			return artifact.diagram.providers.DomainElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return artifact.diagram.providers.DomainElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return artifact.diagram.providers.DomainElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
