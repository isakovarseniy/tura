package org.tura.metamodel.commons.properties.sections.input;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.sections.AbstractStringPropertySection;

import domain.DomainFactory;
import domain.DomainPackage;
import domain.StyleElement;

public class StylePropertySelection extends AbstractStringPropertySection {

	protected String getLabelText() {
		return "Style";//$NON-NLS-1$
	}

	@Override
	protected EAttribute getFeature() {
		return DomainPackage.eINSTANCE.getStyle_Style();
	}

	@Override
	public EObject getModel() {
		domain.StyleElement style = (StyleElement) getEObject();
		if (style.getStyle() == null) {
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, style,
							DomainPackage.eINSTANCE.getStyleElement_Style(),
							DomainFactory.eINSTANCE.createStyle()));
		}

		return style.getStyle();
	}

}
