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
package mapper.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import mapper.diagram.providers.DomainElementTypes;

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
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCSSMapper1CreationTool());
		paletteContainer.add(createJavaMapper2CreationTool());
		paletteContainer.add(createJavaPackageMapper3CreationTool());
		paletteContainer.add(createJavaScriptMapper4CreationTool());
		paletteContainer.add(createRoleMapper5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCSSMapper1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.CSSMapper1CreationTool_title,
				Messages.CSSMapper1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.CSSMapper_402004));
		entry.setId("createCSSMapper1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.CSSMapper_402004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaMapper2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.JavaMapper2CreationTool_title,
				Messages.JavaMapper2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.JavaMapper_402001));
		entry.setId("createJavaMapper2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JavaMapper_402001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaPackageMapper3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.JavaPackageMapper3CreationTool_title,
				Messages.JavaPackageMapper3CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.JavaPackageMapper_402006));
		entry.setId("createJavaPackageMapper3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JavaPackageMapper_402006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaScriptMapper4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.JavaScriptMapper4CreationTool_title,
				Messages.JavaScriptMapper4CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.JavaScriptMapper_402003));
		entry.setId("createJavaScriptMapper4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.JavaScriptMapper_402003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleMapper5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.RoleMapper5CreationTool_title,
				Messages.RoleMapper5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.RoleMapper_402005));
		entry.setId("createRoleMapper5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.RoleMapper_402005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
