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
package application.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import application.diagram.edit.parts.ApplicationEditPart;
import application.diagram.edit.parts.ApplicationInfrastructureLayerEditPart;
import application.diagram.edit.parts.ApplicationMapperEditPart;
import application.diagram.edit.parts.ApplicationMappersApplicationMappersMappersCompartmentEditPart;
import application.diagram.edit.parts.ApplicationMappersEditPart;
import application.diagram.edit.parts.ApplicationMessagesEditPart;
import application.diagram.edit.parts.ApplicationRecipeEditPart;
import application.diagram.edit.parts.ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart;
import application.diagram.edit.parts.ApplicationRecipesEditPart;
import application.diagram.edit.parts.ApplicationRoleEditPart;
import application.diagram.edit.parts.ApplicationStyleApplicationStyleStylesPackageCompartmentEditPart;
import application.diagram.edit.parts.ApplicationStyleEditPart;
import application.diagram.edit.parts.ApplicationUILayerApplicationUILayerApplicationUIPackagesCompartmentEditPart;
import application.diagram.edit.parts.ApplicationUILayerEditPart;
import application.diagram.edit.parts.ApplicationUIPackageEditPart;
import application.diagram.edit.parts.StylesPackageEditPart;
import domain.Application;
import domain.ApplicationInfrastructureLayer;
import domain.ApplicationMapper;
import domain.ApplicationMappers;
import domain.ApplicationMessages;
import domain.ApplicationRecipe;
import domain.ApplicationRecipes;
import domain.ApplicationRole;
import domain.ApplicationStyle;
import domain.ApplicationUILayer;
import domain.ApplicationUIPackage;
import domain.StylesPackage;

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
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_801000SemanticChildren(view);
		case ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart.VISUAL_ID:
			return getApplicationRecipesApplicationRecipesRecipesCompartment_807001SemanticChildren(view);
		case ApplicationMappersApplicationMappersMappersCompartmentEditPart.VISUAL_ID:
			return getApplicationMappersApplicationMappersMappersCompartment_807002SemanticChildren(view);
		case ApplicationUILayerApplicationUILayerApplicationUIPackagesCompartmentEditPart.VISUAL_ID:
			return getApplicationUILayerApplicationUILayerApplicationUIPackagesCompartment_807003SemanticChildren(view);
		case ApplicationStyleApplicationStyleStylesPackageCompartmentEditPart.VISUAL_ID:
			return getApplicationStyleApplicationStyleStylesPackageCompartment_807004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getApplication_801000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Application modelElement = (Application) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			ApplicationRecipes childElement = modelElement.getApplicationRecipes();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationRecipesEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		{
			ApplicationMappers childElement = modelElement.getApplicationMappers();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationMappersEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		{
			ApplicationUILayer childElement = modelElement.getApplicationUILayer();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationUILayerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		{
			ApplicationStyle childElement = modelElement.getApplicationStyle();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationStyleEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		{
			ApplicationInfrastructureLayer childElement = modelElement.getApplicationInfrastructureLayer();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationInfrastructureLayerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		{
			ApplicationRole childElement = modelElement.getApplicationRole();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationRoleEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		{
			ApplicationMessages childElement = modelElement.getApplicationMessages();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationMessagesEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getApplicationRecipesApplicationRecipesRecipesCompartment_807001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ApplicationRecipes modelElement = (ApplicationRecipes) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRecipes().iterator(); it.hasNext();) {
			ApplicationRecipe childElement = (ApplicationRecipe) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationRecipeEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getApplicationMappersApplicationMappersMappersCompartment_807002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ApplicationMappers modelElement = (ApplicationMappers) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMappers().iterator(); it.hasNext();) {
			ApplicationMapper childElement = (ApplicationMapper) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationMapperEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getApplicationUILayerApplicationUILayerApplicationUIPackagesCompartment_807003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ApplicationUILayer modelElement = (ApplicationUILayer) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getApplicationUIPackages().iterator(); it.hasNext();) {
			ApplicationUIPackage childElement = (ApplicationUIPackage) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ApplicationUIPackageEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getApplicationStyleApplicationStyleStylesPackageCompartment_807004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ApplicationStyle modelElement = (ApplicationStyle) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStylesPackage().iterator(); it.hasNext();) {
			StylesPackage childElement = (StylesPackage) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StylesPackageEditPart.VISUAL_ID) {
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
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_801000ContainedLinks(view);
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_802001ContainedLinks(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_802002ContainedLinks(view);
		case ApplicationUILayerEditPart.VISUAL_ID:
			return getApplicationUILayer_802003ContainedLinks(view);
		case ApplicationStyleEditPart.VISUAL_ID:
			return getApplicationStyle_802005ContainedLinks(view);
		case ApplicationInfrastructureLayerEditPart.VISUAL_ID:
			return getApplicationInfrastructureLayer_802004ContainedLinks(view);
		case ApplicationRoleEditPart.VISUAL_ID:
			return getApplicationRole_802006ContainedLinks(view);
		case ApplicationMessagesEditPart.VISUAL_ID:
			return getApplicationMessages_802007ContainedLinks(view);
		case ApplicationRecipeEditPart.VISUAL_ID:
			return getApplicationRecipe_803001ContainedLinks(view);
		case ApplicationMapperEditPart.VISUAL_ID:
			return getApplicationMapper_803002ContainedLinks(view);
		case ApplicationUIPackageEditPart.VISUAL_ID:
			return getApplicationUIPackage_803003ContainedLinks(view);
		case StylesPackageEditPart.VISUAL_ID:
			return getStylesPackage_803004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_802001IncomingLinks(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_802002IncomingLinks(view);
		case ApplicationUILayerEditPart.VISUAL_ID:
			return getApplicationUILayer_802003IncomingLinks(view);
		case ApplicationStyleEditPart.VISUAL_ID:
			return getApplicationStyle_802005IncomingLinks(view);
		case ApplicationInfrastructureLayerEditPart.VISUAL_ID:
			return getApplicationInfrastructureLayer_802004IncomingLinks(view);
		case ApplicationRoleEditPart.VISUAL_ID:
			return getApplicationRole_802006IncomingLinks(view);
		case ApplicationMessagesEditPart.VISUAL_ID:
			return getApplicationMessages_802007IncomingLinks(view);
		case ApplicationRecipeEditPart.VISUAL_ID:
			return getApplicationRecipe_803001IncomingLinks(view);
		case ApplicationMapperEditPart.VISUAL_ID:
			return getApplicationMapper_803002IncomingLinks(view);
		case ApplicationUIPackageEditPart.VISUAL_ID:
			return getApplicationUIPackage_803003IncomingLinks(view);
		case StylesPackageEditPart.VISUAL_ID:
			return getStylesPackage_803004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_802001OutgoingLinks(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_802002OutgoingLinks(view);
		case ApplicationUILayerEditPart.VISUAL_ID:
			return getApplicationUILayer_802003OutgoingLinks(view);
		case ApplicationStyleEditPart.VISUAL_ID:
			return getApplicationStyle_802005OutgoingLinks(view);
		case ApplicationInfrastructureLayerEditPart.VISUAL_ID:
			return getApplicationInfrastructureLayer_802004OutgoingLinks(view);
		case ApplicationRoleEditPart.VISUAL_ID:
			return getApplicationRole_802006OutgoingLinks(view);
		case ApplicationMessagesEditPart.VISUAL_ID:
			return getApplicationMessages_802007OutgoingLinks(view);
		case ApplicationRecipeEditPart.VISUAL_ID:
			return getApplicationRecipe_803001OutgoingLinks(view);
		case ApplicationMapperEditPart.VISUAL_ID:
			return getApplicationMapper_803002OutgoingLinks(view);
		case ApplicationUIPackageEditPart.VISUAL_ID:
			return getApplicationUIPackage_803003OutgoingLinks(view);
		case StylesPackageEditPart.VISUAL_ID:
			return getStylesPackage_803004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplication_801000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationRecipes_802001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationMappers_802002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationUILayer_802003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationStyle_802005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationInfrastructureLayer_802004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationRole_802006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationMessages_802007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationRecipe_803001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationMapper_803002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationUIPackage_803003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getStylesPackage_803004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationRecipes_802001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationMappers_802002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationUILayer_802003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationStyle_802005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationInfrastructureLayer_802004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationRole_802006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationMessages_802007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationRecipe_803001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationMapper_803002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationUIPackage_803003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getStylesPackage_803004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationRecipes_802001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationMappers_802002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationUILayer_802003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationStyle_802005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationInfrastructureLayer_802004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationRole_802006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationMessages_802007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationRecipe_803001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationMapper_803002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getApplicationUIPackage_803003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getStylesPackage_803004OutgoingLinks(View view) {
		return Collections.emptyList();
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
