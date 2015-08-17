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
package roles.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import domain.DomainPackage;
import domain.Group;
import domain.Role;
import domain.Roles;
import roles.diagram.edit.parts.GroupEditPart;
import roles.diagram.edit.parts.GroupGroup2GroupEditPart;
import roles.diagram.edit.parts.GroupGroup2RoleEditPart;
import roles.diagram.edit.parts.RoleEditPart;
import roles.diagram.edit.parts.RolesEditPart;
import roles.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getSemanticChildren(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case RolesEditPart.VISUAL_ID:
			return getRoles_1401000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getRoles_1401000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Roles modelElement = (Roles) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			Role childElement = (Role) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGroups().iterator(); it.hasNext();) {
			Group childElement = (Group) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DomainLinkDescriptor> getContainedLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case RolesEditPart.VISUAL_ID:
			return getRoles_1401000ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_1402001ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_1402002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case RoleEditPart.VISUAL_ID:
			return getRole_1402001IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_1402002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case RoleEditPart.VISUAL_ID:
			return getRole_1402001OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_1402002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRoles_1401000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRole_1402001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getGroup_1402002ContainedLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Group_Group2Group_1404003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Group_Group2Role_1404005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRole_1402001IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Group_Group2Role_1404005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getGroup_1402002IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Group_Group2Group_1404003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRole_1402001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getGroup_1402002OutgoingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Group_Group2Group_1404003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Group_Group2Role_1404005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_Group_Group2Group_1404003(
			Group target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE.getGroup_Group2Group()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(), target,
						DomainElementTypes.GroupGroup2Group_1404003, GroupGroup2GroupEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_Group_Group2Role_1404005(
			Role target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE.getGroup_Group2Role()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(), target,
						DomainElementTypes.GroupGroup2Role_1404005, GroupGroup2RoleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_Group_Group2Group_1404003(
			Group source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> destinations = source.getGroup2Group().iterator(); destinations.hasNext();) {
			Group destination = (Group) destinations.next();
			result.add(new DomainLinkDescriptor(source, destination, DomainElementTypes.GroupGroup2Group_1404003,
					GroupGroup2GroupEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_Group_Group2Role_1404005(
			Group source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> destinations = source.getGroup2Role().iterator(); destinations.hasNext();) {
			Role destination = (Role) destinations.next();
			result.add(new DomainLinkDescriptor(source, destination, DomainElementTypes.GroupGroup2Role_1404005,
					GroupGroup2RoleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<DomainNodeDescriptor> getSemanticChildren(View view) {
			return DomainDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DomainLinkDescriptor> getContainedLinks(View view) {
			return DomainDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DomainLinkDescriptor> getIncomingLinks(View view) {
			return DomainDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DomainLinkDescriptor> getOutgoingLinks(View view) {
			return DomainDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
