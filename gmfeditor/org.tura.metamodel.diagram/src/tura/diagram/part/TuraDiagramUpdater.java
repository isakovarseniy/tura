/*
 * 
 */
package tura.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import tura.Package;
import tura.Primitive;
import tura.TuraMetamodel;
import tura.Types;
import tura.diagram.edit.parts.PackageEditPart;
import tura.diagram.edit.parts.PrimitiveEditPart;
import tura.diagram.edit.parts.TuraMetamodelEditPart;
import tura.diagram.edit.parts.TypesEditPart;
import tura.diagram.edit.parts.TypesTypesPackagesCompartmentEditPart;
import tura.diagram.edit.parts.TypesTypesPrimitivesCompartmentEditPart;

/**
 * @generated
 */
public class TuraDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<TuraNodeDescriptor> getSemanticChildren(View view) {
		switch (TuraVisualIDRegistry.getVisualID(view)) {
		case TuraMetamodelEditPart.VISUAL_ID:
			return getTuraMetamodel_1000SemanticChildren(view);
		case TypesTypesPrimitivesCompartmentEditPart.VISUAL_ID:
			return getTypesTypesPrimitivesCompartment_7001SemanticChildren(view);
		case TypesTypesPackagesCompartmentEditPart.VISUAL_ID:
			return getTypesTypesPackagesCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraNodeDescriptor> getTuraMetamodel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TuraMetamodel modelElement = (TuraMetamodel) view.getElement();
		LinkedList<TuraNodeDescriptor> result = new LinkedList<TuraNodeDescriptor>();
		{
			Types childElement = modelElement.getTypeDefinition();
			int visualID = TuraVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypesEditPart.VISUAL_ID) {
				result.add(new TuraNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TuraNodeDescriptor> getTypesTypesPrimitivesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Types modelElement = (Types) containerView.getElement();
		LinkedList<TuraNodeDescriptor> result = new LinkedList<TuraNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPrimitives().iterator(); it
				.hasNext();) {
			Primitive childElement = (Primitive) it.next();
			int visualID = TuraVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PrimitiveEditPart.VISUAL_ID) {
				result.add(new TuraNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TuraNodeDescriptor> getTypesTypesPackagesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Types modelElement = (Types) containerView.getElement();
		LinkedList<TuraNodeDescriptor> result = new LinkedList<TuraNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackages().iterator(); it
				.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = TuraVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new TuraNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getContainedLinks(View view) {
		switch (TuraVisualIDRegistry.getVisualID(view)) {
		case TuraMetamodelEditPart.VISUAL_ID:
			return getTuraMetamodel_1000ContainedLinks(view);
		case TypesEditPart.VISUAL_ID:
			return getTypes_2003ContainedLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_3001ContainedLinks(view);
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getIncomingLinks(View view) {
		switch (TuraVisualIDRegistry.getVisualID(view)) {
		case TypesEditPart.VISUAL_ID:
			return getTypes_2003IncomingLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_3001IncomingLinks(view);
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getOutgoingLinks(View view) {
		switch (TuraVisualIDRegistry.getVisualID(view)) {
		case TypesEditPart.VISUAL_ID:
			return getTypes_2003OutgoingLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_3001OutgoingLinks(view);
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getTuraMetamodel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getTypes_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getPackage_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getPrimitive_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getTypes_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getPackage_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getPrimitive_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getTypes_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getPackage_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TuraLinkDescriptor> getPrimitive_3002OutgoingLinks(
			View view) {
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
		public List<TuraNodeDescriptor> getSemanticChildren(View view) {
			return TuraDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TuraLinkDescriptor> getContainedLinks(View view) {
			return TuraDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TuraLinkDescriptor> getIncomingLinks(View view) {
			return TuraDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TuraLinkDescriptor> getOutgoingLinks(View view) {
			return TuraDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
