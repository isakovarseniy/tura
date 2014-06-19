package org.tura.metamodel.validatioin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.e4.compatibility.CompatibilityPart;


public class TuraDiagnostician extends Diagnostician {

	public Map< DiagramDocumentEditor, Diagnostic> validateAllDiagrams(EObject eObject) {
		
		Map<DiagramDocumentEditor,Diagnostic> map = new HashMap<DiagramDocumentEditor, Diagnostic>();
		
		MWindow window =  ((WorkbenchPage)(PlatformUI.getWorkbench().getActiveWorkbenchWindow()).getActivePage()).getWindowModel();
		EModelService modelService = window.getContext().get(EModelService.class);

		List<MPart> dirtyParts = new ArrayList<MPart>();
		// find all the dirty parts in this window
		for (MPart currentPart : modelService.findElements(window, null, MPart.class, null)) {
			if (currentPart.isDirty()) {
				Object object = currentPart.getObject();
				if (object == null) {
					continue;
				} else if (object instanceof CompatibilityPart) {
					CompatibilityPart compatibilityPart = (CompatibilityPart) object;
					if (!((ISaveablePart) compatibilityPart.getPart()).isSaveOnCloseNeeded()) {
						continue;
					}
				}

				dirtyParts.add(currentPart);
			}
		}
		
		if (!dirtyParts.isEmpty()) {
			Map <Object,Object> context = createDefaultContext();
			for (MPart part : dirtyParts) {
				 CompatibilityPart obj = (CompatibilityPart) part.getObject();
				 DiagramDocumentEditor editorPart =  (DiagramDocumentEditor)(obj.getPart());
				 Diagram diagram = ((DiagramDocumentEditor)(obj.getPart())).getDiagram();
				 BasicDiagnostic diagnostics = createDefaultDiagnostic(diagram);
				 validate(diagram, diagnostics, context);
				map.put(editorPart, diagnostics);
			}
		}		
		
		return map;
	}

	public boolean validate(EObject target, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(((View) target).getElement().eClass(), target,
				diagnostics, context);
	}

	public boolean validate(EClass eClass, EObject target,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		Object eValidator;
		EClass eType = eClass;
		while ((eValidator = eValidatorRegistry.get(eType.eContainer())) == null) {
			List<EClass> eSuperTypes = eType.getESuperTypes();
			if (eSuperTypes.isEmpty()) {
				eValidator = eValidatorRegistry.get(null);
				break;
			} else {
				eType = eSuperTypes.get(0);
			}
		}
		boolean circular = context.get(EObjectValidator.ROOT_OBJECT) == ((View) target)
				.getElement();

		boolean result = ((EValidator) eValidator).validate(eClass,
				((View) target).getElement(), diagnostics, context);
		if ((result || diagnostics != null) && !circular) {
			result &= doValidateContents(target, diagnostics, context);
		}
		return result;

	}

	protected boolean doValidateContents(EObject target,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		@SuppressWarnings("unchecked")
		List<EObject> eContents = (List<EObject>) ((View) target).getChildren();

		if (!eContents.isEmpty()) {
			Iterator<EObject> i = eContents.iterator();
			EObject child = i.next();
			boolean result = validate(child, diagnostics, context);
			while (i.hasNext() && (result || diagnostics != null)) {
				child = i.next();
				result &= validate(child, diagnostics, context);
			}
			return result;
		} else {
			return true;
		}
	}

}
