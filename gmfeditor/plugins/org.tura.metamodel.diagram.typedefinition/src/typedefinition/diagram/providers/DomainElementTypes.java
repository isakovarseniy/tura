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
package typedefinition.diagram.providers;

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
import typedefinition.diagram.edit.parts.AttributeEditPart;
import typedefinition.diagram.edit.parts.EnumAttributeEditPart;
import typedefinition.diagram.edit.parts.EnumaratorEditPart;
import typedefinition.diagram.edit.parts.OperationEditPart;
import typedefinition.diagram.edit.parts.PrimitiveEditPart;
import typedefinition.diagram.edit.parts.TypeDefinitionEditPart;
import typedefinition.diagram.edit.parts.TypeEditPart;
import typedefinition.diagram.edit.parts.TypeExtensionEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceEditPart;
import typedefinition.diagram.part.DomainDiagramEditorPlugin;

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
	public static final IElementType TypeDefinition_101000 = getElementType(
			"org.tura.metamodel.diagram.typedefinition.TypeDefinition_101000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Type_102002 = getElementType(
			"org.tura.metamodel.diagram.typedefinition.Type_102002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TypeReference_102001 = getElementType(
			"org.tura.metamodel.diagram.typedefinition.TypeReference_102001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Primitive_102004 = getElementType(
			"org.tura.metamodel.diagram.typedefinition.Primitive_102004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Enumarator_102005 = getElementType(
			"org.tura.metamodel.diagram.typedefinition.Enumarator_102005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_103001 = getElementType(
			"org.tura.metamodel.diagram.typedefinition.Attribute_103001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Operation_103002 = getElementType(
			"org.tura.metamodel.diagram.typedefinition.Operation_103002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EnumAttribute_103005 = getElementType(
			"org.tura.metamodel.diagram.typedefinition.EnumAttribute_103005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TypeExtension_104001 = getElementType(
			"org.tura.metamodel.diagram.typedefinition.TypeExtension_104001"); //$NON-NLS-1$

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

			elements.put(TypeDefinition_101000, DomainPackage.eINSTANCE.getTypeDefinition());

			elements.put(Type_102002, DomainPackage.eINSTANCE.getType());

			elements.put(TypeReference_102001, DomainPackage.eINSTANCE.getTypeReference());

			elements.put(Primitive_102004, DomainPackage.eINSTANCE.getPrimitive());

			elements.put(Enumarator_102005, DomainPackage.eINSTANCE.getEnumarator());

			elements.put(Attribute_103001, DomainPackage.eINSTANCE.getAttribute());

			elements.put(Operation_103002, DomainPackage.eINSTANCE.getOperation());

			elements.put(EnumAttribute_103005, DomainPackage.eINSTANCE.getEnumAttribute());

			elements.put(TypeExtension_104001, DomainPackage.eINSTANCE.getTypeExtension());
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
			KNOWN_ELEMENT_TYPES.add(TypeDefinition_101000);
			KNOWN_ELEMENT_TYPES.add(Type_102002);
			KNOWN_ELEMENT_TYPES.add(TypeReference_102001);
			KNOWN_ELEMENT_TYPES.add(Primitive_102004);
			KNOWN_ELEMENT_TYPES.add(Enumarator_102005);
			KNOWN_ELEMENT_TYPES.add(Attribute_103001);
			KNOWN_ELEMENT_TYPES.add(Operation_103002);
			KNOWN_ELEMENT_TYPES.add(EnumAttribute_103005);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_104001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TypeDefinitionEditPart.VISUAL_ID:
			return TypeDefinition_101000;
		case TypeEditPart.VISUAL_ID:
			return Type_102002;
		case TypeReferenceEditPart.VISUAL_ID:
			return TypeReference_102001;
		case PrimitiveEditPart.VISUAL_ID:
			return Primitive_102004;
		case EnumaratorEditPart.VISUAL_ID:
			return Enumarator_102005;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_103001;
		case OperationEditPart.VISUAL_ID:
			return Operation_103002;
		case EnumAttributeEditPart.VISUAL_ID:
			return EnumAttribute_103005;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_104001;
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
			return typedefinition.diagram.providers.DomainElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return typedefinition.diagram.providers.DomainElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return typedefinition.diagram.providers.DomainElementTypes.getElement(elementTypeAdapter);
		}
	};

}
