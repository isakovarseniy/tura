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

/*
 * 
 */
package uipackage.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import uipackage.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createForm1CreationTool());
		paletteContainer.add(createFormDataControls2CreationTool());
		paletteContainer.add(createFormParameter3CreationTool());
		paletteContainer.add(createFormView4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createForm1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Form1CreationTool_title,
				Messages.Form1CreationTool_desc, Collections.singletonList(DomainElementTypes.Form_1002002));
		entry.setId("createForm1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.Form_1002002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFormDataControls2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FormDataControls2CreationTool_title,
				Messages.FormDataControls2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.FormDataControls_1003002));
		entry.setId("createFormDataControls2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.FormDataControls_1003002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFormParameter3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FormParameter3CreationTool_title,
				Messages.FormParameter3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.FormParameter_1003003));
		entry.setId("createFormParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.FormParameter_1003003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFormView4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FormView4CreationTool_title,
				Messages.FormView4CreationTool_desc, Collections.singletonList(DomainElementTypes.FormView_1003001));
		entry.setId("createFormView4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.FormView_1003001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
