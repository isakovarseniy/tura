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
package typedefinition.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import typedefinition.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createEnumAttribute2CreationTool());
		paletteContainer.add(createEnumarator3CreationTool());
		paletteContainer.add(createOperation4CreationTool());
		paletteContainer.add(createPrimitive5CreationTool());
		paletteContainer.add(createType6CreationTool());
		paletteContainer.add(createTypeReference7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createGeneralization1CreationTool());
		paletteContainer.add(createMany2Many2CreationTool());
		paletteContainer.add(createOne2Many3CreationTool());
		paletteContainer.add(createOne2One4CreationTool());
		paletteContainer.add(createTypeExtension5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Attribute1CreationTool_title,
				Messages.Attribute1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Attribute_103001));
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Attribute_103001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumAttribute2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.EnumAttribute2CreationTool_title,
				Messages.EnumAttribute2CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.EnumAttribute_103005));
		entry.setId("createEnumAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.EnumAttribute_103005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumarator3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Enumarator3CreationTool_title,
				Messages.Enumarator3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Enumarator_102005));
		entry.setId("createEnumarator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Enumarator_102005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Operation4CreationTool_title,
				Messages.Operation4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Operation_103002));
		entry.setId("createOperation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Operation_103002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitive5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Primitive5CreationTool_title,
				Messages.Primitive5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Primitive_102004));
		entry.setId("createPrimitive5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Primitive_102004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createType6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Type6CreationTool_title,
				Messages.Type6CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Type_102002));
		entry.setId("createType6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Type_102002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeReference7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TypeReference7CreationTool_title,
				Messages.TypeReference7CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeReference_102001));
		entry.setId("createTypeReference7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeReference_102001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Generalization1CreationTool_title,
				Messages.Generalization1CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.Generalization_104005));
		entry.setId("createGeneralization1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Generalization_104005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMany2Many2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Many2Many2CreationTool_title,
				Messages.Many2Many2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Many2Many_104004));
		entry.setId("createMany2Many2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.Many2Many_104004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOne2Many3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.One2Many3CreationTool_title,
				Messages.One2Many3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.One2Many_104003));
		entry.setId("createOne2Many3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.One2Many_104003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOne2One4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.One2One4CreationTool_title,
				Messages.One2One4CreationTool_desc,
				Collections.singletonList(DomainElementTypes.One2One_104002));
		entry.setId("createOne2One4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.One2One_104002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeExtension5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.TypeExtension5CreationTool_title,
				Messages.TypeExtension5CreationTool_desc,
				Collections
						.singletonList(DomainElementTypes.TypeExtension_104001));
		entry.setId("createTypeExtension5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes
				.getImageDescriptor(DomainElementTypes.TypeExtension_104001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
