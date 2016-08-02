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
package org.tura.metamodel.sirius.properties.selections.dropdown;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.sirius.properties.selections.AbstractTuraPropertySection;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

/**
 * An abstract implementation of a section with a enumeration field using a
 * combo box (pulldown).
 * 
 * @author Anthony Hunter
 */
public abstract class AbstractEnumerationPropertySection extends AbstractTuraPropertySection {

	/**
	 * the combo box control for the section.
	 */
	protected CCombo combo;
	protected boolean updated = false;

	protected LinkedHashMap<String, Object> values;
	protected DropDownDataAdapter dropDownDataSupplier;

	protected EStructuralFeature[] getFeature() {
		if (dropDownDataSupplier == null)
			init();
		if (dropDownDataSupplier == null)
			return null;

		return dropDownDataSupplier.getFeature();
	}

	protected String getFeatureAsText() {
		if (dropDownDataSupplier == null)
			init();
		if (dropDownDataSupplier == null)
			return "";
		return dropDownDataSupplier.getFeatureAsText(getModel());
	}

	protected Object getFeatureValue(EStructuralFeature feature, Object... obj) {
		if (dropDownDataSupplier == null)
			init();
		if (dropDownDataSupplier == null)
			return "";

		return dropDownDataSupplier.getSelectedFeatureValue(getModel(), values, feature, obj);
	}

	protected boolean isEqual(Object key) {
		if (dropDownDataSupplier == null)
			init();
		if (dropDownDataSupplier == null)
			return false;
		return dropDownDataSupplier.isEqual(values, key, getModel());
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data;

		combo = getWidgetFactory().createCCombo(composite);
		data = new FormData();
		data.left = new FormAttachment(0, getStandardLabelWidth(composite, new String[] { getLabelText() }));
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		combo.setLayoutData(data);

		CLabel nameLabel = getWidgetFactory().createCLabel(composite, getLabelText());
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(combo, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(combo, 0, SWT.CENTER);
		nameLabel.setLayoutData(data);

		combo.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent event) {
				handleComboModified();
			}
		});
	}

	/**
	 * Handle the combo modified event.
	 */
	protected void handleComboModified() {

		int index = combo.getSelectionIndex();
		boolean equals = isEqual(combo.getItem(index));
		if (!equals) {
			updated = true;

			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();
			CompoundCommand compoundCommand = new CompoundCommand();
			EStructuralFeature[] features = getFeature();
			if (features != null) {
				for (int i = 0; i < features.length; i++) {
					compoundCommand.append(SetCommand.create(editingDomain, getModel(features[i]), features[i],
							getFeatureValue(features[i], combo.getItem(index))));
				}
				editingDomain.getCommandStack().execute(compoundCommand);
			}
			afterUpdate();
		}
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#refresh()
	 */
	public void refresh() {
		try {
			Set<String> keySet = getEnumerationFeatureValues().keySet();
			combo.setItems(keySet.toArray(new String[keySet.size()]));
			if (getFeatureAsText() != null) {
				combo.setText(getFeatureAsText());
			}
		} catch (org.eclipse.swt.SWTException e) {

		}
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		combo.select(-1);
	}	
	
	/**
	 * Get the enumeration values of the feature for the combo field for the
	 * section.
	 * 
	 * @return the list of values of the feature as text.
	 */
	protected abstract HashMap<String, ?> getEnumerationFeatureValues();

	/**
	 * Get the label for the combo field for the section.
	 * 
	 * @return the label for the text field.
	 */
	protected abstract String getLabelText();

	protected abstract void init();

	public abstract EObject getModel(EStructuralFeature feature);

	public void afterUpdate(){
		
	}
	
	@Override
	public EObject getModel() {
		DRepresentationElement element = (DRepresentationElement) getEObject();
		return element.getTarget();
	}
	
}