package org.tura.metamodel.sirius.properties.selections.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import form.DataScroller;
import form.SourcesPointer;
import form.Table;
import form.Tree;

public class ValuePointerSectionFilter  extends SourcesPointerSectionFilter {

    @Override
    public boolean select(Object toTest) {
        EditPart editPart = (EditPart) toTest;

        if (((View) editPart.getModel()).getElement() instanceof DRepresentationElement) {
            DRepresentationElement obj = (DRepresentationElement) ((View) editPart.getModel()).getElement();
            EObject element = obj.getTarget();

            if (element instanceof SourcesPointer && !(element instanceof Tree) && !(element instanceof  Table) && !(element instanceof DataScroller)  ) {
                return isNotExternalControlExists(element);
            }
        }
        return false;
    }

}