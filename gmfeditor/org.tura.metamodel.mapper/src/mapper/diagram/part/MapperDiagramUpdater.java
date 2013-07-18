/*
 * 
 */
package mapper.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import mapper.Mapper;
import mapper.Mappers;
import mapper.diagram.edit.parts.JavaMapperEditPart;
import mapper.diagram.edit.parts.MappersEditPart;
import mapper.diagram.edit.parts.TypeExtensionEditPart;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MapperDiagramUpdater {

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
	public static List<MapperNodeDescriptor> getSemanticChildren(View view) {
		switch (MapperVisualIDRegistry.getVisualID(view)) {
		case MappersEditPart.VISUAL_ID:
			return getMappers_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MapperNodeDescriptor> getMappers_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Mappers modelElement = (Mappers) view.getElement();
		LinkedList<MapperNodeDescriptor> result = new LinkedList<MapperNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMappers().iterator(); it
				.hasNext();) {
			Mapper childElement = (Mapper) it.next();
			int visualID = MapperVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JavaMapperEditPart.VISUAL_ID) {
				result.add(new MapperNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MapperLinkDescriptor> getContainedLinks(View view) {
		switch (MapperVisualIDRegistry.getVisualID(view)) {
		case MappersEditPart.VISUAL_ID:
			return getMappers_1000ContainedLinks(view);
		case JavaMapperEditPart.VISUAL_ID:
			return getJavaMapper_2002ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MapperLinkDescriptor> getIncomingLinks(View view) {
		switch (MapperVisualIDRegistry.getVisualID(view)) {
		case JavaMapperEditPart.VISUAL_ID:
			return getJavaMapper_2002IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MapperLinkDescriptor> getOutgoingLinks(View view) {
		switch (MapperVisualIDRegistry.getVisualID(view)) {
		case JavaMapperEditPart.VISUAL_ID:
			return getJavaMapper_2002OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MapperLinkDescriptor> getMappers_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MapperLinkDescriptor> getJavaMapper_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MapperLinkDescriptor> getTypeExtension_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MapperLinkDescriptor> getJavaMapper_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MapperLinkDescriptor> getTypeExtension_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MapperLinkDescriptor> getJavaMapper_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MapperLinkDescriptor> getTypeExtension_4001OutgoingLinks(
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
		public List<MapperNodeDescriptor> getSemanticChildren(View view) {
			return MapperDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MapperLinkDescriptor> getContainedLinks(View view) {
			return MapperDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MapperLinkDescriptor> getIncomingLinks(View view) {
			return MapperDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MapperLinkDescriptor> getOutgoingLinks(View view) {
			return MapperDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
