/*
 * 
 */
package deployment.diagram.part;

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

import deployment.diagram.edit.parts.DeploymentComponentDeploymentComponentLinkEditPart;
import deployment.diagram.edit.parts.DeploymentComponentEditPart;
import deployment.diagram.edit.parts.DeploymentComponentsEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import deployment.diagram.providers.DomainElementTypes;
import domain.DeploymentComponent;
import domain.DeploymentComponents;
import domain.DeploymentStarStep;
import domain.DomainPackage;

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
		case DeploymentComponentsEditPart.VISUAL_ID:
			return getDeploymentComponents_901000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDeploymentComponents_901000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DeploymentComponents modelElement = (DeploymentComponents) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeplymentStep().iterator(); it.hasNext();) {
			DeploymentComponent childElement = (DeploymentComponent) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DeploymentComponentEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			DeploymentStarStep childElement = modelElement.getStartSeq();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DeploymentStarStepEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getContainedLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DeploymentComponentsEditPart.VISUAL_ID:
			return getDeploymentComponents_901000ContainedLinks(view);
		case DeploymentComponentEditPart.VISUAL_ID:
			return getDeploymentComponent_902001ContainedLinks(view);
		case DeploymentStarStepEditPart.VISUAL_ID:
			return getDeploymentStarStep_902002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DeploymentComponentEditPart.VISUAL_ID:
			return getDeploymentComponent_902001IncomingLinks(view);
		case DeploymentStarStepEditPart.VISUAL_ID:
			return getDeploymentStarStep_902002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DeploymentComponentEditPart.VISUAL_ID:
			return getDeploymentComponent_902001OutgoingLinks(view);
		case DeploymentStarStepEditPart.VISUAL_ID:
			return getDeploymentStarStep_902002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeploymentComponents_901000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeploymentComponent_902001ContainedLinks(View view) {
		DeploymentComponent modelElement = (DeploymentComponent) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DeploymentComponent_DeploymentComponentLink_904014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeploymentStarStep_902002ContainedLinks(View view) {
		DeploymentStarStep modelElement = (DeploymentStarStep) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DeploymentStarStep_FirstStep_904008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeploymentComponent_902001IncomingLinks(View view) {
		DeploymentComponent modelElement = (DeploymentComponent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DeploymentComponent_DeploymentComponentLink_904014(modelElement,
				crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_DeploymentStarStep_FirstStep_904008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeploymentStarStep_902002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeploymentComponent_902001OutgoingLinks(View view) {
		DeploymentComponent modelElement = (DeploymentComponent) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(
				getOutgoingFeatureModelFacetLinks_DeploymentComponent_DeploymentComponentLink_904014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeploymentStarStep_902002OutgoingLinks(View view) {
		DeploymentStarStep modelElement = (DeploymentStarStep) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DeploymentStarStep_FirstStep_904008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_DeploymentComponent_DeploymentComponentLink_904014(
			DeploymentComponent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE
					.getDeploymentComponent_DeploymentComponentLink()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(), target,
						DomainElementTypes.DeploymentComponentDeploymentComponentLink_904014,
						DeploymentComponentDeploymentComponentLinkEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_DeploymentStarStep_FirstStep_904008(
			DeploymentComponent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE.getDeploymentStarStep_FirstStep()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(), target,
						DomainElementTypes.DeploymentStarStepFirstStep_904008,
						DeploymentStarStepFirstStepEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_DeploymentComponent_DeploymentComponentLink_904014(
			DeploymentComponent source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		DeploymentComponent destination = source.getDeploymentComponentLink();
		if (destination == null) {
			return result;
		}
		result.add(new DomainLinkDescriptor(source, destination,
				DomainElementTypes.DeploymentComponentDeploymentComponentLink_904014,
				DeploymentComponentDeploymentComponentLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_DeploymentStarStep_FirstStep_904008(
			DeploymentStarStep source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		DeploymentComponent destination = source.getFirstStep();
		if (destination == null) {
			return result;
		}
		result.add(new DomainLinkDescriptor(source, destination, DomainElementTypes.DeploymentStarStepFirstStep_904008,
				DeploymentStarStepFirstStepEditPart.VISUAL_ID));
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
