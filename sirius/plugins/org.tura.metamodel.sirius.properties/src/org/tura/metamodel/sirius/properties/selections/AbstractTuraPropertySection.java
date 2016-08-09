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
package org.tura.metamodel.sirius.properties.selections;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;
import org.eclipse.gmf.runtime.notation.impl.EdgeImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public abstract class AbstractTuraPropertySection extends
		AbstractPropertySection {

	public EObject getEObject() {
		return eObject;
	}

	public IGraphicalEditPart getEditPart() {
		return editPart;
	}

	/**
	 * the property sheet page for this section.
	 */
	protected TabbedPropertySheetPage propertySheetPage;
	
	protected Composite parent;

	/**
	 * The current selected object or the first object in the selection when
	 * multiple objects are selected.
	 */
	private EObject eObject;

	protected IGraphicalEditPart editPart;;
	
	/**
	 * The list of current selected objects.
	 */
	protected List<Object> eObjectList;

	/**
	 * Get the standard label width when labels for sections line up on the left
	 * hand side of the composite. We line up to a fixed position, but if a
	 * string is wider than the fixed position, then we use that widest string.
	 * 
	 * @param parent
	 *            The parent composite used to create a GC.
	 * @param labels
	 *            The list of labels.
	 * @return the standard label width.
	 */
	protected int getStandardLabelWidth(Composite parent, String[] labels) {
		int standardLabelWidth = STANDARD_LABEL_WIDTH;
		GC gc = new GC(parent);
		int indent = gc.textExtent("XXX").x; //$NON-NLS-1$
		for (int i = 0; i < labels.length; i++) {
			int width = gc.textExtent(labels[i]).x;
			if (width + indent > standardLabelWidth) {
				standardLabelWidth = width + indent;
			}
		}
		gc.dispose();
		return standardLabelWidth;
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent,TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		this.propertySheetPage = aTabbedPropertySheetPage;
		this.parent=parent;
		
	}

	public TabbedPropertySheetPage getPropertySheetPage() {
		return propertySheetPage;
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@SuppressWarnings("unchecked")
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		eObjectList = ((IStructuredSelection) selection).toList();
		if (((IStructuredSelection) selection).getFirstElement()  instanceof IGraphicalEditPart){
				editPart =  (IGraphicalEditPart) ((IStructuredSelection) selection).getFirstElement();
		
				if (editPart.getModel() instanceof ShapeImpl )
				     eObject  = ((ShapeImpl) editPart.getModel()).basicGetElement();
				if (editPart.getModel() instanceof NodeImpl )
				     eObject  = ((NodeImpl) editPart.getModel()).basicGetElement();
				if (editPart.getModel() instanceof ConnectorImpl )
				     eObject  = ((ConnectorImpl) editPart.getModel()).basicGetElement();
				if (editPart.getModel() instanceof EdgeImpl )
				     eObject  = ((EdgeImpl) editPart.getModel()).basicGetElement();
		}else{
			eObject = (EObject) ((IStructuredSelection) selection).getFirstElement();
		}
	}
	
	
	/**
	 * Get mode for selection.
	 * 
	 * @return the label for the text field.
	 */
	public abstract EObject getModel();

}