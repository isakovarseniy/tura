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
package infarastructure.diagram.providers;

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
import infarastructure.diagram.edit.parts.DatacenterEditPart;
import infarastructure.diagram.edit.parts.EnterpriseInfrastructureEditPart;
import infarastructure.diagram.edit.parts.HubEditPart;
import infarastructure.diagram.edit.parts.InfrastructureConnectionEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerEditPart;
import infarastructure.diagram.edit.parts.RouterEditPart;
import infarastructure.diagram.edit.parts.Server2EditPart;
import infarastructure.diagram.edit.parts.ServerClasterEditPart;
import infarastructure.diagram.edit.parts.ServerEditPart;
import infarastructure.diagram.edit.parts.StorageEditPart;
import infarastructure.diagram.edit.parts.SubsystemEditPart;
import infarastructure.diagram.part.DomainDiagramEditorPlugin;

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
	public static final IElementType EnterpriseInfrastructure_1201000 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.EnterpriseInfrastructure_1201000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Datacenter_1202002 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.Datacenter_1202002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Subsystem_1203001 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.Subsystem_1203001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InfrastructureLayer_1203002 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.InfrastructureLayer_1203002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Server_1203003 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.Server_1203003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Router_1203004 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.Router_1203004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Hub_1203005 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.Hub_1203005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Storage_1203006 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.Storage_1203006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ServerClaster_1203007 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.ServerClaster_1203007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Server_1203008 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.Server_1203008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InfrastructureConnection_1204009 = getElementType(
			"org.tura.metamodel.diagram.infarastructure.InfrastructureConnection_1204009"); //$NON-NLS-1$

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

			elements.put(EnterpriseInfrastructure_1201000, DomainPackage.eINSTANCE.getEnterpriseInfrastructure());

			elements.put(Datacenter_1202002, DomainPackage.eINSTANCE.getDatacenter());

			elements.put(Subsystem_1203001, DomainPackage.eINSTANCE.getSubsystem());

			elements.put(InfrastructureLayer_1203002, DomainPackage.eINSTANCE.getInfrastructureLayer());

			elements.put(Server_1203003, DomainPackage.eINSTANCE.getServer());

			elements.put(Router_1203004, DomainPackage.eINSTANCE.getRouter());

			elements.put(Hub_1203005, DomainPackage.eINSTANCE.getHub());

			elements.put(Storage_1203006, DomainPackage.eINSTANCE.getStorage());

			elements.put(ServerClaster_1203007, DomainPackage.eINSTANCE.getServerClaster());

			elements.put(Server_1203008, DomainPackage.eINSTANCE.getServer());

			elements.put(InfrastructureConnection_1204009, DomainPackage.eINSTANCE.getInfrastructureConnection());
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
			KNOWN_ELEMENT_TYPES.add(EnterpriseInfrastructure_1201000);
			KNOWN_ELEMENT_TYPES.add(Datacenter_1202002);
			KNOWN_ELEMENT_TYPES.add(Subsystem_1203001);
			KNOWN_ELEMENT_TYPES.add(InfrastructureLayer_1203002);
			KNOWN_ELEMENT_TYPES.add(Server_1203003);
			KNOWN_ELEMENT_TYPES.add(Router_1203004);
			KNOWN_ELEMENT_TYPES.add(Hub_1203005);
			KNOWN_ELEMENT_TYPES.add(Storage_1203006);
			KNOWN_ELEMENT_TYPES.add(ServerClaster_1203007);
			KNOWN_ELEMENT_TYPES.add(Server_1203008);
			KNOWN_ELEMENT_TYPES.add(InfrastructureConnection_1204009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			return EnterpriseInfrastructure_1201000;
		case DatacenterEditPart.VISUAL_ID:
			return Datacenter_1202002;
		case SubsystemEditPart.VISUAL_ID:
			return Subsystem_1203001;
		case InfrastructureLayerEditPart.VISUAL_ID:
			return InfrastructureLayer_1203002;
		case ServerEditPart.VISUAL_ID:
			return Server_1203003;
		case RouterEditPart.VISUAL_ID:
			return Router_1203004;
		case HubEditPart.VISUAL_ID:
			return Hub_1203005;
		case StorageEditPart.VISUAL_ID:
			return Storage_1203006;
		case ServerClasterEditPart.VISUAL_ID:
			return ServerClaster_1203007;
		case Server2EditPart.VISUAL_ID:
			return Server_1203008;
		case InfrastructureConnectionEditPart.VISUAL_ID:
			return InfrastructureConnection_1204009;
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
			return infarastructure.diagram.providers.DomainElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return infarastructure.diagram.providers.DomainElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return infarastructure.diagram.providers.DomainElementTypes.getElement(elementTypeAdapter);
		}
	};

}