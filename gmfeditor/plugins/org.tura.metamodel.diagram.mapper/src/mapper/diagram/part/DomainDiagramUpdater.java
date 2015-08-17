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
package mapper.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import domain.Mapper;
import domain.Mappers;
import mapper.diagram.edit.parts.CSSMapperEditPart;
import mapper.diagram.edit.parts.JavaMapperEditPart;
import mapper.diagram.edit.parts.JavaScriptMapperEditPart;
import mapper.diagram.edit.parts.MappersEditPart;
import mapper.diagram.edit.parts.RoleMapperEditPart;

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
		case MappersEditPart.VISUAL_ID:
			return getMappers_401000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getMappers_401000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Mappers modelElement = (Mappers) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMappers().iterator(); it.hasNext();) {
			Mapper childElement = (Mapper) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == JavaMapperEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JavaScriptMapperEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CSSMapperEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RoleMapperEditPart.VISUAL_ID) {
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
		case MappersEditPart.VISUAL_ID:
			return getMappers_401000ContainedLinks(view);
		case JavaMapperEditPart.VISUAL_ID:
			return getJavaMapper_402001ContainedLinks(view);
		case JavaScriptMapperEditPart.VISUAL_ID:
			return getJavaScriptMapper_402003ContainedLinks(view);
		case CSSMapperEditPart.VISUAL_ID:
			return getCSSMapper_402004ContainedLinks(view);
		case RoleMapperEditPart.VISUAL_ID:
			return getRoleMapper_402005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case JavaMapperEditPart.VISUAL_ID:
			return getJavaMapper_402001IncomingLinks(view);
		case JavaScriptMapperEditPart.VISUAL_ID:
			return getJavaScriptMapper_402003IncomingLinks(view);
		case CSSMapperEditPart.VISUAL_ID:
			return getCSSMapper_402004IncomingLinks(view);
		case RoleMapperEditPart.VISUAL_ID:
			return getRoleMapper_402005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case JavaMapperEditPart.VISUAL_ID:
			return getJavaMapper_402001OutgoingLinks(view);
		case JavaScriptMapperEditPart.VISUAL_ID:
			return getJavaScriptMapper_402003OutgoingLinks(view);
		case CSSMapperEditPart.VISUAL_ID:
			return getCSSMapper_402004OutgoingLinks(view);
		case RoleMapperEditPart.VISUAL_ID:
			return getRoleMapper_402005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMappers_401000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJavaMapper_402001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJavaScriptMapper_402003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCSSMapper_402004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRoleMapper_402005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJavaMapper_402001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJavaScriptMapper_402003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCSSMapper_402004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRoleMapper_402005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJavaMapper_402001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJavaScriptMapper_402003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCSSMapper_402004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRoleMapper_402005OutgoingLinks(View view) {
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
