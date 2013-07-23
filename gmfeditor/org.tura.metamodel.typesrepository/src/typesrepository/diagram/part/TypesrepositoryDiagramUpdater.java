/*
 * 
 */
package typesrepository.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import typesrepository.BusinessPackage;
import typesrepository.Package;
import typesrepository.Primitive;
import typesrepository.Types;
import typesrepository.TypesRepository;
import typesrepository.diagram.edit.parts.BusinessPackageEditPart;
import typesrepository.diagram.edit.parts.PackageEditPart;
import typesrepository.diagram.edit.parts.PrimitiveEditPart;
import typesrepository.diagram.edit.parts.TypeExtensionEditPart;
import typesrepository.diagram.edit.parts.TypesEditPart;
import typesrepository.diagram.edit.parts.TypesRepositoryEditPart;
import typesrepository.diagram.edit.parts.TypesTypesBusinessPackagesCompartmentEditPart;
import typesrepository.diagram.edit.parts.TypesTypesPackagesCompartmentEditPart;
import typesrepository.diagram.edit.parts.TypesTypesPrimitivesCompartmentEditPart;

/**
 * @generated
 */
public class TypesrepositoryDiagramUpdater {

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
	public static List<TypesrepositoryNodeDescriptor> getSemanticChildren(
			View view) {
		switch (TypesrepositoryVisualIDRegistry.getVisualID(view)) {
		case TypesRepositoryEditPart.VISUAL_ID:
			return getTypesRepository_201000SemanticChildren(view);
		case TypesTypesPrimitivesCompartmentEditPart.VISUAL_ID:
			return getTypesTypesPrimitivesCompartment_207001SemanticChildren(view);
		case TypesTypesPackagesCompartmentEditPart.VISUAL_ID:
			return getTypesTypesPackagesCompartment_207002SemanticChildren(view);
		case TypesTypesBusinessPackagesCompartmentEditPart.VISUAL_ID:
			return getTypesTypesBusinessPackagesCompartment_207003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryNodeDescriptor> getTypesRepository_201000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TypesRepository modelElement = (TypesRepository) view.getElement();
		LinkedList<TypesrepositoryNodeDescriptor> result = new LinkedList<TypesrepositoryNodeDescriptor>();
		{
			Types childElement = modelElement.getTypeDefinition();
			int visualID = TypesrepositoryVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == TypesEditPart.VISUAL_ID) {
				result.add(new TypesrepositoryNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryNodeDescriptor> getTypesTypesPrimitivesCompartment_207001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Types modelElement = (Types) containerView.getElement();
		LinkedList<TypesrepositoryNodeDescriptor> result = new LinkedList<TypesrepositoryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPrimitives().iterator(); it
				.hasNext();) {
			Primitive childElement = (Primitive) it.next();
			int visualID = TypesrepositoryVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == PrimitiveEditPart.VISUAL_ID) {
				result.add(new TypesrepositoryNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryNodeDescriptor> getTypesTypesPackagesCompartment_207002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Types modelElement = (Types) containerView.getElement();
		LinkedList<TypesrepositoryNodeDescriptor> result = new LinkedList<TypesrepositoryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackages().iterator(); it
				.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = TypesrepositoryVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new TypesrepositoryNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryNodeDescriptor> getTypesTypesBusinessPackagesCompartment_207003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Types modelElement = (Types) containerView.getElement();
		LinkedList<TypesrepositoryNodeDescriptor> result = new LinkedList<TypesrepositoryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBusinessPackages().iterator(); it
				.hasNext();) {
			BusinessPackage childElement = (BusinessPackage) it.next();
			int visualID = TypesrepositoryVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == BusinessPackageEditPart.VISUAL_ID) {
				result.add(new TypesrepositoryNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getContainedLinks(
			View view) {
		switch (TypesrepositoryVisualIDRegistry.getVisualID(view)) {
		case TypesRepositoryEditPart.VISUAL_ID:
			return getTypesRepository_201000ContainedLinks(view);
		case TypesEditPart.VISUAL_ID:
			return getTypes_202001ContainedLinks(view);
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_203003ContainedLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_203001ContainedLinks(view);
		case BusinessPackageEditPart.VISUAL_ID:
			return getBusinessPackage_203002ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_204001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getIncomingLinks(View view) {
		switch (TypesrepositoryVisualIDRegistry.getVisualID(view)) {
		case TypesEditPart.VISUAL_ID:
			return getTypes_202001IncomingLinks(view);
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_203003IncomingLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_203001IncomingLinks(view);
		case BusinessPackageEditPart.VISUAL_ID:
			return getBusinessPackage_203002IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_204001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getOutgoingLinks(View view) {
		switch (TypesrepositoryVisualIDRegistry.getVisualID(view)) {
		case TypesEditPart.VISUAL_ID:
			return getTypes_202001OutgoingLinks(view);
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_203003OutgoingLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_203001OutgoingLinks(view);
		case BusinessPackageEditPart.VISUAL_ID:
			return getBusinessPackage_203002OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_204001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getTypesRepository_201000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getTypes_202001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getPrimitive_203003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getPackage_203001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getBusinessPackage_203002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getTypeExtension_204001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getTypes_202001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getPrimitive_203003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getPackage_203001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getBusinessPackage_203002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getTypeExtension_204001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getTypes_202001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getPrimitive_203003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getPackage_203001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getBusinessPackage_203002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypesrepositoryLinkDescriptor> getTypeExtension_204001OutgoingLinks(
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
		public List<TypesrepositoryNodeDescriptor> getSemanticChildren(View view) {
			return TypesrepositoryDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TypesrepositoryLinkDescriptor> getContainedLinks(View view) {
			return TypesrepositoryDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TypesrepositoryLinkDescriptor> getIncomingLinks(View view) {
			return TypesrepositoryDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TypesrepositoryLinkDescriptor> getOutgoingLinks(View view) {
			return TypesrepositoryDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
