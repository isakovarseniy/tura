/*
 * 
 */
package artifact.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import artifact.Artifact;
import artifact.Artifacts;
import artifact.Specifier;
import artifact.Variable;
import artifact.diagram.edit.parts.ArtifactArtifactConfigVariablesCompartmentEditPart;
import artifact.diagram.edit.parts.ArtifactArtifactModelQueryCompartmentEditPart;
import artifact.diagram.edit.parts.ArtifactArtifactSpecifiersCompartmentEditPart;
import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.SpecifierEditPart;
import artifact.diagram.edit.parts.Variable2EditPart;
import artifact.diagram.edit.parts.VariableEditPart;

/**
 * @generated
 */
public class ArtifactDiagramUpdater {

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
	public static List<ArtifactNodeDescriptor> getSemanticChildren(View view) {
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactsEditPart.VISUAL_ID:
			return getArtifacts_701000SemanticChildren(view);
		case ArtifactArtifactConfigVariablesCompartmentEditPart.VISUAL_ID:
			return getArtifactArtifactConfigVariablesCompartment_707001SemanticChildren(view);
		case ArtifactArtifactModelQueryCompartmentEditPart.VISUAL_ID:
			return getArtifactArtifactModelQueryCompartment_707002SemanticChildren(view);
		case ArtifactArtifactSpecifiersCompartmentEditPart.VISUAL_ID:
			return getArtifactArtifactSpecifiersCompartment_707003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactNodeDescriptor> getArtifacts_701000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Artifacts modelElement = (Artifacts) view.getElement();
		LinkedList<ArtifactNodeDescriptor> result = new LinkedList<ArtifactNodeDescriptor>();
		for (Iterator<?> it = modelElement.getArtifacts().iterator(); it
				.hasNext();) {
			Artifact childElement = (Artifact) it.next();
			int visualID = ArtifactVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArtifactEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactNodeDescriptor> getArtifactArtifactConfigVariablesCompartment_707001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Artifact modelElement = (Artifact) containerView.getElement();
		LinkedList<ArtifactNodeDescriptor> result = new LinkedList<ArtifactNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConfigVariables().iterator(); it
				.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = ArtifactVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == VariableEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactNodeDescriptor> getArtifactArtifactModelQueryCompartment_707002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Artifact modelElement = (Artifact) containerView.getElement();
		LinkedList<ArtifactNodeDescriptor> result = new LinkedList<ArtifactNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelQuery().iterator(); it
				.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = ArtifactVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Variable2EditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactNodeDescriptor> getArtifactArtifactSpecifiersCompartment_707003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Artifact modelElement = (Artifact) containerView.getElement();
		LinkedList<ArtifactNodeDescriptor> result = new LinkedList<ArtifactNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSpecifiers().iterator(); it
				.hasNext();) {
			Specifier childElement = (Specifier) it.next();
			int visualID = ArtifactVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SpecifierEditPart.VISUAL_ID) {
				result.add(new ArtifactNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getContainedLinks(View view) {
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactsEditPart.VISUAL_ID:
			return getArtifacts_701000ContainedLinks(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_702001ContainedLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_703001ContainedLinks(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_703002ContainedLinks(view);
		case SpecifierEditPart.VISUAL_ID:
			return getSpecifier_703003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getIncomingLinks(View view) {
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_702001IncomingLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_703001IncomingLinks(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_703002IncomingLinks(view);
		case SpecifierEditPart.VISUAL_ID:
			return getSpecifier_703003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getOutgoingLinks(View view) {
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_702001OutgoingLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_703001OutgoingLinks(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_703002OutgoingLinks(view);
		case SpecifierEditPart.VISUAL_ID:
			return getSpecifier_703003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifacts_701000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifact_702001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getVariable_703001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getVariable_703002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getSpecifier_703003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifact_702001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getVariable_703001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getVariable_703002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getSpecifier_703003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getArtifact_702001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getVariable_703001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getVariable_703002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArtifactLinkDescriptor> getSpecifier_703003OutgoingLinks(
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
		public List<ArtifactNodeDescriptor> getSemanticChildren(View view) {
			return ArtifactDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ArtifactLinkDescriptor> getContainedLinks(View view) {
			return ArtifactDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ArtifactLinkDescriptor> getIncomingLinks(View view) {
			return ArtifactDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ArtifactLinkDescriptor> getOutgoingLinks(View view) {
			return ArtifactDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
