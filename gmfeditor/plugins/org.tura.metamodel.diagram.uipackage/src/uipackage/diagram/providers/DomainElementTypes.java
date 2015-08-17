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
package uipackage.diagram.providers;

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
import uipackage.diagram.edit.parts.FormDataControlsEditPart;
import uipackage.diagram.edit.parts.FormEditPart;
import uipackage.diagram.edit.parts.FormParameterEditPart;
import uipackage.diagram.edit.parts.FormViewEditPart;
import uipackage.diagram.edit.parts.UIPackageEditPart;
import uipackage.diagram.part.DomainDiagramEditorPlugin;

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
	public static final IElementType UIPackage_1001000 = getElementType(
			"org.tura.metamodel.diagram.uipackage.UIPackage_1001000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Form_1002002 = getElementType("org.tura.metamodel.diagram.uipackage.Form_1002002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FormParameter_1003003 = getElementType(
			"org.tura.metamodel.diagram.uipackage.FormParameter_1003003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FormView_1003001 = getElementType(
			"org.tura.metamodel.diagram.uipackage.FormView_1003001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FormDataControls_1003002 = getElementType(
			"org.tura.metamodel.diagram.uipackage.FormDataControls_1003002"); //$NON-NLS-1$

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

			elements.put(UIPackage_1001000, DomainPackage.eINSTANCE.getUIPackage());

			elements.put(Form_1002002, DomainPackage.eINSTANCE.getForm());

			elements.put(FormParameter_1003003, DomainPackage.eINSTANCE.getFormParameter());

			elements.put(FormView_1003001, DomainPackage.eINSTANCE.getFormView());

			elements.put(FormDataControls_1003002, DomainPackage.eINSTANCE.getFormDataControls());
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
			KNOWN_ELEMENT_TYPES.add(UIPackage_1001000);
			KNOWN_ELEMENT_TYPES.add(Form_1002002);
			KNOWN_ELEMENT_TYPES.add(FormParameter_1003003);
			KNOWN_ELEMENT_TYPES.add(FormView_1003001);
			KNOWN_ELEMENT_TYPES.add(FormDataControls_1003002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UIPackageEditPart.VISUAL_ID:
			return UIPackage_1001000;
		case FormEditPart.VISUAL_ID:
			return Form_1002002;
		case FormParameterEditPart.VISUAL_ID:
			return FormParameter_1003003;
		case FormViewEditPart.VISUAL_ID:
			return FormView_1003001;
		case FormDataControlsEditPart.VISUAL_ID:
			return FormDataControls_1003002;
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
			return uipackage.diagram.providers.DomainElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uipackage.diagram.providers.DomainElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uipackage.diagram.providers.DomainElementTypes.getElement(elementTypeAdapter);
		}
	};

}
