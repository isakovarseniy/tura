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

import artifact.diagram.edit.parts.ArtifactArtifactConfigVariablesCompartmentEditPart;
import artifact.diagram.edit.parts.ArtifactArtifactHintsCompartmentEditPart;
import artifact.diagram.edit.parts.ArtifactArtifactModelQueryCompartmentEditPart;
import artifact.diagram.edit.parts.ArtifactArtifactSpecifiersCompartmentEditPart;
import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.ConfigVariableEditPart;
import artifact.diagram.edit.parts.GenerationHintEditPart;
import artifact.diagram.edit.parts.ModelQueryEditPart;
import artifact.diagram.edit.parts.SpecifierEditPart;
import domain.Artifact;
import domain.Artifacts;
import domain.ConfigVariable;
import domain.GenerationHint;
import domain.ModelQuery;
import domain.Specifier;

/**
 * @generated
 */
public class DomainDiagramUpdater {

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
	public static List<DomainNodeDescriptor> getSemanticChildren(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case ArtifactsEditPart.VISUAL_ID:
			return getArtifacts_701000SemanticChildren(view);
		case ArtifactArtifactConfigVariablesCompartmentEditPart.VISUAL_ID:
			return getArtifactArtifactConfigVariablesCompartment_707001SemanticChildren(view);
		case ArtifactArtifactModelQueryCompartmentEditPart.VISUAL_ID:
			return getArtifactArtifactModelQueryCompartment_707002SemanticChildren(view);
		case ArtifactArtifactSpecifiersCompartmentEditPart.VISUAL_ID:
			return getArtifactArtifactSpecifiersCompartment_707003SemanticChildren(view);
		case ArtifactArtifactHintsCompartmentEditPart.VISUAL_ID:
			return getArtifactArtifactHintsCompartment_707004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getArtifacts_701000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Artifacts modelElement = (Artifacts) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getArtifacts().iterator(); it
				.hasNext();) {
			Artifact childElement = (Artifact) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArtifactEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getArtifactArtifactConfigVariablesCompartment_707001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Artifact modelElement = (Artifact) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConfigVariables().iterator(); it
				.hasNext();) {
			ConfigVariable childElement = (ConfigVariable) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConfigVariableEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getArtifactArtifactModelQueryCompartment_707002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Artifact modelElement = (Artifact) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelQuery().iterator(); it
				.hasNext();) {
			ModelQuery childElement = (ModelQuery) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ModelQueryEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getArtifactArtifactSpecifiersCompartment_707003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Artifact modelElement = (Artifact) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSpecifiers().iterator(); it
				.hasNext();) {
			Specifier childElement = (Specifier) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SpecifierEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getArtifactArtifactHintsCompartment_707004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Artifact modelElement = (Artifact) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHints().iterator(); it.hasNext();) {
			GenerationHint childElement = (GenerationHint) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GenerationHintEditPart.VISUAL_ID) {
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
		case ArtifactsEditPart.VISUAL_ID:
			return getArtifacts_701000ContainedLinks(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_702001ContainedLinks(view);
		case ConfigVariableEditPart.VISUAL_ID:
			return getConfigVariable_703004ContainedLinks(view);
		case ModelQueryEditPart.VISUAL_ID:
			return getModelQuery_703005ContainedLinks(view);
		case SpecifierEditPart.VISUAL_ID:
			return getSpecifier_703003ContainedLinks(view);
		case GenerationHintEditPart.VISUAL_ID:
			return getGenerationHint_703006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_702001IncomingLinks(view);
		case ConfigVariableEditPart.VISUAL_ID:
			return getConfigVariable_703004IncomingLinks(view);
		case ModelQueryEditPart.VISUAL_ID:
			return getModelQuery_703005IncomingLinks(view);
		case SpecifierEditPart.VISUAL_ID:
			return getSpecifier_703003IncomingLinks(view);
		case GenerationHintEditPart.VISUAL_ID:
			return getGenerationHint_703006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_702001OutgoingLinks(view);
		case ConfigVariableEditPart.VISUAL_ID:
			return getConfigVariable_703004OutgoingLinks(view);
		case ModelQueryEditPart.VISUAL_ID:
			return getModelQuery_703005OutgoingLinks(view);
		case SpecifierEditPart.VISUAL_ID:
			return getSpecifier_703003OutgoingLinks(view);
		case GenerationHintEditPart.VISUAL_ID:
			return getGenerationHint_703006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getArtifacts_701000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getArtifact_702001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getConfigVariable_703004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getModelQuery_703005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSpecifier_703003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getGenerationHint_703006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getArtifact_702001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getConfigVariable_703004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getModelQuery_703005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSpecifier_703003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getGenerationHint_703006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getArtifact_702001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getConfigVariable_703004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getModelQuery_703005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSpecifier_703003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getGenerationHint_703006OutgoingLinks(
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
